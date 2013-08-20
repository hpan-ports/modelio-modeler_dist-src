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
                                    

package org.modelio.gproject.fragment;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.descriptor.DefinitionScope;
import org.modelio.gproject.descriptor.FragmentDescriptor;
import org.modelio.gproject.descriptor.GAuthConf;
import org.modelio.gproject.descriptor.GProperties;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectEvent;
import org.modelio.vbasic.auth.IAuthData;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vbasic.progress.SubProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.api.repository.IRepositoryErrorListener;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Abstract implementation of a project fragment.
 */
@objid ("00dad9ac-abbf-11e1-8392-001ec947ccaf")
public abstract class AbstractFragment implements IProjectFragment {
    @objid ("e0fc65f3-d66d-11e1-9f03-001ec947ccaf")
    private FragmentState state = FragmentState.INITIAL;

    @objid ("06425676-3019-11e2-8f81-001ec947ccaf")
    private DefinitionScope definitionScope;

    @objid ("a32081fc-abf1-11e1-8392-001ec947ccaf")
    private final String id;

    /**
     * Project data sub directory where fragment data are stored.
     * Contains one directory for each fragment.
     */
    @objid ("7c90d1fb-a9e7-4cd0-9056-9155358cf9d3")
    private static final String FRAGMENTS_SUBDIR = "fragments";

    @objid ("4417921b-39f5-4b0a-9f7f-346475d15790")
    private final String encodedDirName;

    @objid ("a303e5f8-abf1-11e1-8392-001ec947ccaf")
    private GProperties properties;

    @objid ("6a70dfce-d66d-11e1-9f03-001ec947ccaf")
    private Throwable downError;

    @objid ("6a70dfcf-d66d-11e1-9f03-001ec947ccaf")
    private RepositoryListener errSupport;

    @objid ("8ed3c8d4-07f4-11e2-b193-001ec947ccaf")
    private GProject gproject;

    @objid ("682da9e4-b4df-4297-856f-5e80b9ad608b")
    private final GAuthConf authConf;

    /**
     * Initialize the fragment
     * @param id the fragment id.
     * @param definitionScope definition scope
     * @param properties the fragment properties.
     * @param authConf authentication configuration
     */
    @objid ("c1778cce-95da-11e1-ac83-001ec947ccaf")
    public AbstractFragment(final String id, DefinitionScope definitionScope, final GProperties properties, GAuthConf authConf) {
        Objects.requireNonNull(id, "id is null.");
        Objects.requireNonNull(definitionScope, "definition scope is null");
        Objects.requireNonNull(properties, "properties is null");
        
        this.id = id;
        this.encodedDirName = FileUtils.encodeFileName(getId(), new StringBuilder()).toString();
        this.properties = properties;
        this.definitionScope = definitionScope;
        this.errSupport = new RepositoryListener();
        this.authConf = authConf;
    }

    @objid ("c1778cd1-95da-11e1-ac83-001ec947ccaf")
    @Override
    public final String getId() {
        return this.id;
    }

    @objid ("49bc2ad3-ab3f-11e1-8392-001ec947ccaf")
    @Override
    public final GProperties getProperties() {
        return this.properties;
    }

    /**
     * Get the error handler that should be attached as listener to the repository when mount.
     * @return the error handler
     */
    @objid ("6a70dfdd-d66d-11e1-9f03-001ec947ccaf")
    protected final RepositoryListener getRepositoryErrorSupport() {
        return this.errSupport;
    }

    @objid ("6a73421e-d66d-11e1-9f03-001ec947ccaf")
    private final void setState(FragmentState state) {
        this.state = state;
        if (state != FragmentState.DOWN)
            this.downError = null;
    }

    /**
     * Set the fragment in "down" state, with the cause.
     * <p>
     * Fires a GProjectEvent.
     * @param error the cause of down state
     */
    @objid ("6a734221-d66d-11e1-9f03-001ec947ccaf")
    protected final void setDown(Throwable error) {
        if (this.downError != null) {
            // Concatenate errors
            this.downError.addSuppressed(error);
        } else {
            this.downError = error;
            
            // Disconnect the repository
            // and set all loaded objects as shell.
            IRepository repository = getRepository(); 
            try {
                if (repository != null && repository.isOpen()) {
                    this.gproject.getSession().getRepositorySupport().disconnectRepository(repository);
                }
            
                doUnmountPostProcess();
            } catch (IOException | RuntimeException e) {
                this.downError.addSuppressed(e);
            } 
            
            setState(FragmentState.DOWN);
            
        }
        
        // Fire a GProjectEvent
        this.gproject.getMonitorSupport().fireMonitors(GProjectEvent.FragmentDownEvent(this));
    }

    @objid ("6a734225-d66d-11e1-9f03-001ec947ccaf")
    @Override
    public final Throwable getDownError() {
        return this.downError;
    }

    @objid ("6a73422a-d66d-11e1-9f03-001ec947ccaf")
    @Override
    public final FragmentState getState() {
        return this.state;
    }

    /**
     * Mount a fragment.
     * <p>
     * The process is:<ul>
     * <li> set the state as MOUNTING
     * <li> set the current project
     * <li> call {@link #doMountInitRepository(IModelioProgress)}
     * <li> connect the repository to the session
     * <li> call {@link #doMountPostConnect(IModelioProgress)}
     * <li> set the state as UP
     * </ul>
     * Subclasses must implement {@link #doMountInitRepository(IModelioProgress)} and may implement
     * {@link #doMountPostConnect(IModelioProgress)}.
     */
    @objid ("8ed62b2b-07f4-11e2-b193-001ec947ccaf")
    @Override
    public final void mount(GProject aProject, IModelioProgress aMonitor) {
        if (this.state != FragmentState.INITIAL && this.state != FragmentState.DOWN) {
            throw new IllegalStateException("The '" + getId() + "' module is already mount: "+this.state);
        }
        
        setState(FragmentState.MOUNTING);
        this.gproject = aProject;
        
        try {
            SubProgress mon = SubProgress.convert(aMonitor, 100);
            IRepository repository = doMountInitRepository(mon);
            
            mon.setWorkRemaining(100);
            repository.getErrorSupport().addErrorListener(getRepositoryErrorSupport());
            IAccessManager accessManager = doInitAccessManager();
            aProject.getSession().getRepositorySupport().connectRepository(repository, getId(), accessManager, mon);
            
            mon.setWorkRemaining(100);
            doMountPostConnect(mon);
            
            setState(FragmentState.UP_FULL);
        } catch (IOException e) {
            setDown(e);
        } finally {
            if (this.state == FragmentState.MOUNTING)
                setState(FragmentState.INITIAL);
        }
    }

    @objid ("8ed62b30-07f4-11e2-b193-001ec947ccaf")
    @Override
    public final void unmount() {
        IRepository repository = getRepository(); 
        if (repository != null && repository.isOpen()) {
            this.gproject.getSession().getRepositorySupport().disconnectRepository(repository);
        }
        
        try {
            doUnmountPostProcess();
        } catch (IOException e) {
            this.gproject.getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(this, e));
        }
        
        setState(FragmentState.INITIAL);
    }

    /**
     * Get the project to which the fragment is attached
     * @return the project.
     */
    @objid ("8ed62b33-07f4-11e2-b193-001ec947ccaf")
    public final GProject getProject() {
        return this.gproject;
    }

    /**
     * Hook called by {@link #unmount()} after having disconnected the repository
     * from the modeling session.
     * <p>
     * May be redefined by subclasses to clean resources.
     * @throws java.io.IOException if some errors should be reported. The unmount will not be cancelled.
     */
    @objid ("8ed62b38-07f4-11e2-b193-001ec947ccaf")
    protected void doUnmountPostProcess() throws IOException {
        // Does nothing by default
    }

    /**
     * Hook called by {@link #mount(GProject, IModelioProgress)} after having connected
     * the repository to the session.
     * <p>
     * Does nothing by default. Subclasses may redefine it to
     * populate the repository.
     * @param mon the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("8ed62b3b-07f4-11e2-b193-001ec947ccaf")
    protected void doMountPostConnect(IModelioProgress mon) throws IOException {
        // Nothing by default
    }

    /**
     * Instantiate the {@link #getRepository() repository}.
     * <p>
     * This hook called by {@link #mount(GProject, IModelioProgress)}.
     * The implementation must just instantiate it without mounting it.
     * @param aMonitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     * @return the instantiated repository.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("8ed62b3e-07f4-11e2-b193-001ec947ccaf")
    protected abstract IRepository doMountInitRepository(IModelioProgress aMonitor) throws IOException;

    /**
     * Check the fragment is mount and throws an exception if not.
     * @throws java.lang.IllegalStateException if the fragment is not mount.
     */
    @objid ("242ea4bc-d0da-11e1-b069-001ec947ccaf")
    protected final void assertMount() throws IllegalStateException {
        if (this.state == FragmentState.INITIAL || this.state == FragmentState.MOUNTING) {
            throw new IllegalStateException("The '" + getId() + "' fragment is not mount.");
        }
    }

    /**
     * @return the fragment data directory.
     */
    @objid ("b422a1e8-0baa-11e2-bed6-001ec947ccaf")
    public final Path getDataDirectory() {
        return this.gproject.getProjectDataPath()
                .resolve(GProject.DATA_SUBDIR)
                .resolve(FRAGMENTS_SUBDIR)
                .resolve(this.encodedDirName);
    }

    /**
     * Get the fragment runtime directory.
     * <p>
     * The runtime directory contains files that can be deleted at any time without breaking
     * the fragment.
     * @return the fragment runtime directory.
     */
    @objid ("b422a1ed-0baa-11e2-bed6-001ec947ccaf")
    public final Path getRuntimeDirectory() {
        return this.gproject.getProjectRuntimePath()
                .resolve(FRAGMENTS_SUBDIR)
                .resolve(this.encodedDirName);
    }

    /**
     * Get the root elements of the fragment.
     * <p>
     * Returns an empty list as long as there is no open repository.
     * In the other case delegates to {@link #doGetRoots()}.
     * <p>
     * If the doGetRoots() fails to get the roots calls {@link #setDown(Throwable)}.
     */
    @objid ("b4276693-0baa-11e2-bed6-001ec947ccaf")
    @Override
    public final Collection<MObject> getRoots() {
        IRepository repository = getRepository();
        if (repository == null || !repository.isOpen()) {
            return Collections.emptyList();
        } else {
            try {
                return doGetRoots();
            } catch (IOException e) {
                setDown(e);
                return Collections.emptyList();
            }
        }
    }

    /**
     * Get the root elements of the fragment.
     * <p>
     * This method is called by {@link AbstractFragment#getRoots()} that ensures
     * there is an open repository.
     * @return the root elements of the fragment.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("b427669a-0baa-11e2-bed6-001ec947ccaf")
    protected abstract Collection<MObject> doGetRoots() throws IOException;

    @objid ("6327ff06-3004-11e2-8f81-001ec947ccaf")
    @Override
    public DefinitionScope getScope() {
        return this.definitionScope;
    }

    /**
     * Initialize the access manager.
     * @return the access manager.
     */
    @objid ("a15a3399-38aa-11e2-a6db-001ec947ccaf")
    protected abstract IAccessManager doInitAccessManager();

    @objid ("dd899fe8-54f3-11e2-b5ff-001ec947ccaf")
    @Override
    public final void delete() throws IOException {
        // Call sub classes
        // TODO : add a progress monitor to delete()
        doDelete(null);
        
        // Do standard cleaning
        unmount();
        FileUtils.delete(getRuntimeDirectory());
        FileUtils.delete(getDataDirectory());
    }

    /**
     * Default implementation.
     * <p>
     * Unregister itself and install a new fragment if the URI is different.
     * Replaces its properties by the given ones.
     * @param aMonitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("4f36bb41-af48-4929-bdde-6d867d92e941")
    @Override
    public void reconfigure(FragmentDescriptor fd, IModelioProgress aMonitor) {
        if (! Objects.equals(getUri(), fd.getUri())) {
            getProject().unregisterFragment(this);
            
            IProjectFragment fragment = Fragments.getFactory(fd).instantiate(fd);
            getProject().registerFragment(fragment, aMonitor);
        } else {
            unmount();
            
            this.definitionScope = fd.getScope();
            this.properties = new GProperties(fd.getProperties());
            this.authConf.reconfigure(fd.getAuthDescriptor());
            
            mount(getProject(), aMonitor);
        }
    }

    /**
     * Hook for sub classes called by {@link #delete()} in first place.
     * <p>
     * Does nothing by default.
     * The fragment is still mounted and all files still exist but will be deleted
     * on return.
     * Sub classes may do more cleaning.
     * @param monitor the progress monitor to use for reporting progress to the user. It is the caller's responsibility to call
     * <code>done()</code> on the given monitor. Accepts <code>null</code>, indicating that no progress should be
     * reported and that the operation cannot be cancelled.
     */
    @objid ("f573d3f7-6457-4167-bfea-27f196854503")
    protected void doDelete(IModelioProgress monitor) {
        // nothing by default
    }

    @objid ("9df6c318-ceb8-4cc7-9b93-886f0de15a85")
    @Override
    public GAuthConf getAuthConfiguration() {
        return this.authConf;
    }

    /**
     * @return the fragment authentication data.
     */
    @objid ("577094a7-243a-48fb-90d6-5dbb08813676")
    protected final IAuthData getAuthData() {
        if (this.authConf == null)
            return null;
        return this.authConf.getAuthData();
    }

    /**
     * Repository error listener.
     * <p>
     * TODO : catch repository errors and transmit them to a
     * higher level listener, on GProject for example.
     */
    @objid ("6a70dfd0-d66d-11e1-9f03-001ec947ccaf")
    private class RepositoryListener implements IRepositoryErrorListener {
        @objid ("6a70dfd1-d66d-11e1-9f03-001ec947ccaf")
        public RepositoryListener() {
            // nothing
        }

        @objid ("6a70dfd3-d66d-11e1-9f03-001ec947ccaf")
        @Override
        public void onWarning(IRepository repository, Throwable e) {
            getProject().getMonitorSupport().fireMonitors(GProjectEvent.buildWarning(AbstractFragment.this, e));
        }

        @objid ("6a70dfd8-d66d-11e1-9f03-001ec947ccaf")
        @Override
        public void onError(IRepository repository, Throwable e) {
            setDown(e);
        }

    }

}
