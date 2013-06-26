/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.vcore.session.impl.load;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.Log;
import org.modelio.vcore.model.DuplicateObjectException;
import org.modelio.vcore.session.api.model.change.IModelChangeEvent;
import org.modelio.vcore.session.api.model.change.IStatusChangeEvent;
import org.modelio.vcore.session.impl.storage.IModelRefresher;
import org.modelio.vcore.session.impl.storage.nullz.NullRepository;
import org.modelio.vcore.session.impl.transactions.events.EventFactory;
import org.modelio.vcore.session.impl.transactions.events.ModelChangeSupport;
import org.modelio.vcore.session.impl.transactions.smAction.AppendDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.CreateElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.DeleteElementAction;
import org.modelio.vcore.session.impl.transactions.smAction.EraseDependencyAction;
import org.modelio.vcore.session.impl.transactions.smAction.IAction;
import org.modelio.vcore.session.impl.transactions.smAction.SetAttributeAction;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

/**
 * {@link IModelRefresher} implementation.
 * <p>
 * Build models change events and fires them when calling {@link #close()}.
 */
@objid ("1559e83f-19f3-11e2-8eb9-001ec947ccaf")
class ModelRefresher extends ModelLoader implements IModelRefresher {
    /**
     * Service used to fire all model change events in a single parallel thread.
     */
    @objid ("450072b1-aa9d-40ec-80ed-2e2d918cb32d")
    private static ThreadPoolExecutor firerService = initExecutorService();

    @objid ("2c5e2bd4-7332-4705-b407-6ba7fd4956fd")
    private EventFactory eventFactory;

    @objid ("2b43673a-bac9-459f-a578-456eb4060469")
    private SmObjectImpl lastStatusChange = null;

    @objid ("1258e0c4-2f2e-4a1d-9d09-cc09d3af6216")
    private Collection<SmObjectImpl> mayBeOrphan;

    @objid ("da4be954-3794-4af9-9e5e-296814c907ac")
    private DepRefresher depRefresher;

    @objid ("5b7fca04-54e9-41ed-b198-0df0c415351a")
    private Collection<IAction> recordedActions;

    @objid ("afcf508c-0215-4337-a6c1-52e064b8aa55")
    private ModelRefreshDeleter deleter;

    /**
     * Objects that were explicitly deleted.
     */
    @objid ("fdb6c542-bd07-4680-9779-b4ce233218da")
    private Collection<SmObjectImpl> deletedObjs;

    /**
     * Records deleted model object data after they are
     * removed from the cache to prevent them from
     * being GCed until the model change events have been fired.
     */
    @objid ("e771f939-613d-4fd3-befe-820560b36f6b")
    private Collection<ISmObjectData> deletedData;

    /**
     * Used to initialize {@link #firerService}.
     * @return the executor service.
     */
    @objid ("de626af0-e8c6-4468-8b33-2c8e11cb89f2")
    private static ThreadPoolExecutor initExecutorService() {
        /*
         * Creates an Executor that uses a single worker thread operating
         * off an unbounded queue, and uses the provided ThreadFactory to
         * create a new thread when needed. 
         * 
         * Instantiates a thread factory that creates daemons threads with
         * a custom name and an unhandled exception handler that logs errors.
         */
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r, "Fire model refreshed event");
                t.setDaemon(true);
                t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                    
                    @Override
                    public void uncaughtException(Thread dead, Throwable e) {
                        Log.error("ModelRefresher: '"+dead+"' thread died unexpectedly:");
                        Log.error(e);
                    }
                });
                return t;
            }
        };
        
        LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor svc = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                workQueue,
                threadFactory);
        return svc;
    }

    @objid ("7d88c89e-1c43-11e2-8eb9-001ec947ccaf")
    public ModelRefresher(ModelLoaderConfiguration loaderConfig) {
        super(loaderConfig);
        reset();
    }

    @objid ("7d8b2af7-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public void close() {
        super.close();
        
        // Delete orphan elements
        this.deleter.doDelete(getObjsToDelete());
        
        // Guard against event queue overflow that fills memory
        checkEventQueue();
        
        // Process recorded events
        for (IAction  a: this.recordedActions)
            this.eventFactory.process(a);
        
        // Prepare the model change event
        this.eventFactory.postProcess();
        
        // Fire the model change event in a parallel thread.
        final ModelChangeSupport changeSupport = getSession().getModelChangeSupport();
        final EventFactory leventFactory = this.eventFactory;
        final Collection<ISmObjectData> ldeletedData = this.deletedData;
        getSession().getSchedulerService().execute(new Runnable() {
            @Override
            public void run() {
                getSession().getTransactionSupport().asyncExec(new ChangeEventFirer(changeSupport, leventFactory, ldeletedData));
            }
        });
        reset();
    }

    @objid ("7d88c8a7-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public SmObjectImpl createLoadedObject(SmClass classof, UUID id) throws DuplicateObjectException {
        SmObjectImpl ret = super.createLoadedObject(classof, id);
        
        this.recordedActions.add(new CreateElementAction(ret));
        return ret;
    }

    @objid ("7d88c8ae-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public void loadAttribute(SmObjectImpl obj, SmAttribute att, Object newValue) {
        final Object oldVal = att.getValue(obj.getData());
        
        super.loadAttribute(obj, att, newValue);
        
        if (! Objects.equals(oldVal, newValue))
            this.recordedActions.add(new SetAttributeAction(obj, att, oldVal, newValue));
    }

    @objid ("7d88c8b4-1c43-11e2-8eb9-001ec947ccaf")
    @Override
    public void loadDependency(SmObjectImpl obj, SmDependency dep, List<SmObjectImpl> newContent) {
        this.depRefresher.execute(obj, dep, newContent);
    }

    @objid ("d2837cc9-1ebc-11e2-99fc-001ec947ccaf")
    private Collection<SmObjectImpl> getObjsToDelete() {
        Collection<SmObjectImpl> ret = new ArrayList<>(this.deletedObjs.size() + this.mayBeOrphan.size() / 2);
        
        // Add explicitly deleted objects
        ret.addAll(this.deletedObjs);
        
        // Add orphans objects
        for (SmObjectImpl obj : this.mayBeOrphan) {
            if (obj.getCompositionOwner() == null)
                ret.add(obj);
        }
        return ret;
    }

    /**
     * Reset the model change event to fire.
     */
    @objid ("7d88c8a5-1c43-11e2-8eb9-001ec947ccaf")
    private void reset() {
        this.eventFactory = EventFactory.createEvent();
        this.mayBeOrphan = new HashSet<>();
        this.recordedActions = new ArrayList<>();
        this.depRefresher = new DepRefresher( this.mayBeOrphan, this.recordedActions);
        this.deleter = new ModelRefreshDeleter(this);
        this.deletedObjs = new ArrayList<>();
        this.deletedData = new ArrayList<>();
    }

    /**
     * Guard against event queue overflow that fills memory.
     * <p>
     * Waits one millisecond if the event queue contains more than 100 events.
     * Throws an Error  if the event queue contains more than 200 events.
     * @throws org.modelio.vcore.session.impl.load.ModelRefresher.EventQueueOverflowError if the event queue contains too much elements
     */
    @objid ("c50d83ae-78c6-4136-b3d6-d00b2816bed7")
    private void checkEventQueue() throws EventQueueOverflowError {
        int eventQueueSize = firerService.getQueue().size();
        if (eventQueueSize > 100) {
            String msg = "ModelRefresher: change event queue overflows with "+eventQueueSize+" change events.";
            Log.warning(msg);
            Log.warning("ModelRefresher: event queue state: "+firerService.toString()+" .");
            if (eventQueueSize > 200)
                throw new EventQueueOverflowError(msg);
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // ignore
            }
        
            Log.warning("ModelRefresher: now "+firerService.getQueue().size()+" events in queue.");
        }
    }

    @objid ("8fd36252-152e-4714-b0bf-0f1b36269037")
    @Override
    public void setPStatus(SmObjectImpl obj, long trueFlags, long falseFlags, long undefFlags) {
        final ISmObjectData data = obj.getData();
        final long oldStatus = data.getStatus();
        
        data.setPFlags(trueFlags, falseFlags, undefFlags);
        
        long objStatus = data.getStatus();
        
        this.recordedActions.add(new SetAttributeAction(obj, SmObjectData.Metadata.statusAtt(), oldStatus, objStatus));
    }

    @objid ("3bae9bad-1d7f-42cf-bb22-5cb6afda897a")
    @Override
    public void setRStatus(SmObjectImpl obj, long trueFlags, long falseFlags, long undefFlags) {
        final ISmObjectData data = obj.getData();
        final long oldStatus = data.getStatus();
        
        data.setRFlags(trueFlags, falseFlags, undefFlags);
        
        long objStatus = data.getStatus();
        
        this.recordedActions.add(new SetAttributeAction(obj, SmObjectData.Metadata.statusAtt(), oldStatus, objStatus));
    }

    @objid ("415ceb93-daaa-4e0f-8a01-4b2fd254b537")
    @Override
    public void deleteObject(SmObjectImpl obj) {
        this.deletedObjs.add(obj);
    }

    /**
     * Remove a value to a dependency content.
     * <p>
     * Does not remove it from the other side.
     * @param obj a model object
     * @param dep the dependency to modify
     * @param toRemove the model object to remove
     * @return <code>true</code> if the object to remove was found, <code>false</code> if there
     * was no such object to remove.
     */
    @objid ("caa6dcdf-1331-464c-8d87-21f908249a83")
    boolean eraseObjDepVal(SmObjectImpl obj, SmDependency dep, SmObjectImpl toRemove) {
        // do the job
        boolean ret = dep.remove(obj, toRemove);
        
        if (ret) {
            if (dep.isComposition() || dep.isSharedComposition())
                this.mayBeOrphan.add(toRemove);
        
            this.recordedActions.add(new EraseDependencyAction(obj, dep, toRemove, 0));
        }
        return ret;
    }

    /**
     * Delete the given object individually.
     * @param obj the object to delete.
     */
    @objid ("ab9f7625-7ea1-4657-89d9-48c962718e50")
    void doDeleteObject(SmObjectImpl obj) {
        this.recordedActions.add(new DeleteElementAction(obj));
        
        this.deletedData.add(obj.getData());
        this.cacheManager.removeFromCache(obj);
        
        obj.getRepositoryObject().unload(obj);
        obj.setRepositoryObject(NullRepository.getInstance());
    }

    /**
     * Same as DependencyLoader but record changes.
     */
    @objid ("7d8b2afa-1c43-11e2-8eb9-001ec947ccaf")
    private static class DepRefresher extends DependencyLoader {
        @objid ("d2837cd0-1ebc-11e2-99fc-001ec947ccaf")
        private Collection<SmObjectImpl> orphanDetection;

        @objid ("3c7f3480-353b-4aec-9f1d-81b8128aaf3d")
        private Collection<IAction> recordedActions;

        @objid ("7d8b2afc-1c43-11e2-8eb9-001ec947ccaf")
        public DepRefresher(Collection<SmObjectImpl> orphanDetection, Collection<IAction> recordedActions) {
            this.orphanDetection = orphanDetection;
            this.recordedActions = recordedActions;
        }

        @objid ("7d8b2b00-1c43-11e2-8eb9-001ec947ccaf")
        @Override
        protected void depValAdded(SmObjectImpl obj, SmDependency dep, SmObjectImpl value) {
            this.recordedActions.add(new AppendDependencyAction(obj, dep, value));
        }

        @objid ("7d8b2b06-1c43-11e2-8eb9-001ec947ccaf")
        @Override
        protected void depValErased(SmObjectImpl obj, SmDependency dep, SmObjectImpl value) {
            if (dep.isComposition() || dep.isSharedComposition())
                this.orphanDetection.add(value);
            
            this.recordedActions.add(new EraseDependencyAction(obj, dep, value, 0));
        }

    }

    /**
     * Runnable class that fires model and status change events.
     */
    @objid ("a8d4d6a9-42ee-11e2-91c9-001ec947ccaf")
    private static class ChangeEventFirer implements Runnable {
        @objid ("a8d4d6ac-42ee-11e2-91c9-001ec947ccaf")
        private final ModelChangeSupport changeSupport;

        @objid ("a8d4d6ae-42ee-11e2-91c9-001ec947ccaf")
        private final IModelChangeEvent modelEvent;

        @objid ("a8d4d6b0-42ee-11e2-91c9-001ec947ccaf")
        private final IStatusChangeEvent statusEvent;

        /**
         * Prevents model object datas from being GCed until model change events are fired.
         */
        @objid ("27257fa7-6838-453e-9485-74af24a3abb4")
        private final Collection<ISmObjectData> deletedData;

        @objid ("a8d4d6b2-42ee-11e2-91c9-001ec947ccaf")
        public ChangeEventFirer(ModelChangeSupport changeSupport, EventFactory eventFactory, Collection<ISmObjectData> deletedData) {
            this.changeSupport = changeSupport;
            this.modelEvent = eventFactory.getEvent();
            this.statusEvent = eventFactory.getStatusEvent();
            this.deletedData = deletedData;
        }

        @objid ("a8d4d6b6-42ee-11e2-91c9-001ec947ccaf")
        @Override
        public void run() {
            if (!this.modelEvent.isEmpty())
                this.changeSupport.fireModelChangeListeners(this.modelEvent);
            if (! this.statusEvent.isEmpty())
                this.changeSupport.fireStatusChangeListeners(this.statusEvent);
        }

    }

    /**
     * Indicates that too much model change event are waiting for being fired.
     * <p>
     * This exception should never be encountered, and indicates there is a bug
     * in {@link ModelRefresher}.
     */
    @objid ("79681cfd-abbd-4f3f-bc1e-0e361150bc8b")
    @SuppressWarnings("serial")
    public static class EventQueueOverflowError extends Error {
        @objid ("cc842533-7da9-420f-ae5a-84bb58c345c7")
        public EventQueueOverflowError(String string) {
            super(string);
        }

    }

}
