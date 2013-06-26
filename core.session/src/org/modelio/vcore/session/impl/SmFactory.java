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
                                    

package org.modelio.vcore.session.impl;

import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.smkernel.IMetaOf;
import org.modelio.vcore.smkernel.IRStatus;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.SmLiveId;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmStatusFactory;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * Model object factory.
 */
@objid ("0052d122-6f75-1f22-8c06-001ec947cd2a")
public class SmFactory {
    @objid ("00071fc0-eb1c-1f22-8c06-001ec947cd2a")
    private final short kid;

    @objid ("000727c2-eb1c-1f22-8c06-001ec947cd2a")
    private final IMetaOf metaObject;

    @objid ("726bb90c-a419-11e1-aa98-001ec947ccaf")
    private final IModel modelFinder;

    /**
     * Constructor
     * @param kid the kernele id
     * @param metaObject the default meta object for new model objects.
     * @param modelFinder a model object finder.
     */
    @objid ("0054e2dc-6f75-1f22-8c06-001ec947cd2a")
    public SmFactory(final short kid, final IMetaOf metaObject, final IModel modelFinder) {
        this.kid = kid;
        this.metaObject = metaObject;
        this.modelFinder = modelFinder;
    }

    /**
     * Create a new model object.
     * @param metaclassName the model class name.
     * @param repository the repository to attach the object
     * @return the new object
     * @throws java.lang.IllegalArgumentException if the metaclass name is unknown
     */
    @objid ("00079ca2-eb1c-1f22-8c06-001ec947cd2a")
    public SmObjectImpl createObject(final String metaclassName, final IRepository repository) throws IllegalArgumentException {
        final SmClass cls = SmClass.getClass(metaclassName);
        if (cls == null)
            throw new IllegalArgumentException("Unknown '"+metaclassName+"' metamodel class.");
        return createObject(cls, repository);
    }

    /**
     * Create a new model object.
     * @param metaclass the model class .
     * @param repository the repository to attach the object
     * @return the new object
     */
    @objid ("0007e892-eb1c-1f22-8c06-001ec947cd2a")
    public SmObjectImpl createObject(final SmClass metaclass, final IRepository repository) {
        return createObject(metaclass, repository, UUID.randomUUID());
    }

    /**
     * Create a model object with a given UUID.
     * <p>
     * To be used by the model import.
     * @param metaclass the model class .
     * @param repository the repository to attach the object
     * @param uuid the object identifier.
     * @return the new object
     */
    @objid ("000846ca-eb1c-1f22-8c06-001ec947cd2a")
    public SmObjectImpl createObject(final SmClass metaclass, final IRepository repository, final UUID uuid) {
        SmObjectImpl ret = (SmObjectImpl) this.modelFinder.findById(metaclass, uuid);
        if (ret != null) {
            if (ret.hasStatus(IRStatus.SHELL)) {
                // Set the shell object as resolved and move it to the right repository
                ret.getData().setRFlags(0, IRStatus.SHELL, 0);
        
                if (ret.getRepositoryObject().getRepositoryId() != repository.getRepositoryId()) {
                    ret.getRepositoryObject().detach(ret);
                    repository.addObject(ret);
                    long liveId = SmLiveId.make(this.kid, repository.getRepositoryId(), metaclass.getId());
                    ret.init(uuid, liveId);
                }
        
                return ret;
            } else {
                throw new IllegalArgumentException(ret + " already exists in the project.");
            }
        } else {
        
            // Create the object
            ISmObjectData data = metaclass.getObjectFactory().createData();
            SmObjectImpl newObject = metaclass.getObjectFactory().createImpl();
            newObject.initData(data);
            
            // Set the object SmIdentifier (a new value from the identAllocator)
            long liveId = SmLiveId.make(this.kid, repository.getRepositoryId(), metaclass.getId());
            newObject.init(uuid, liveId);
        
            // initialize the status
            SmStatusFactory.resetRStatus(data);
            SmStatusFactory.resetPStatus(data);
        
            // Set a meta object (SeHandle for transaction management)
            newObject.setMetaOf(this.metaObject);
        
            // Add to the repository
            repository.addObject(newObject);
        
            // Triggers the meta object
            this.metaObject.createObject(newObject);
            return newObject;
        }
    }

    /**
     * Create a shell object.
     * @param metaclass The object metaclass
     * @param repository The repository containing the object
     * @param uuid the object identifier
     * @param name the object name, may be <code>null</code>
     * @return the created shell object
     */
    @objid ("005d305e-fd1a-1f27-a7da-001ec947cd2a")
    public SmObjectImpl createShellObject(final SmClass metaclass, final IRepository repository, final UUID uuid, final String name) {
        // Create the object
        ISmObjectData data = metaclass.getObjectFactory().createData();
        SmObjectImpl newObject = metaclass.getObjectFactory().createImpl();
        newObject.initData(data);
        
        // Set the object SmIdentifier (a new value from the identAllocator)
        long liveId = SmLiveId.make(this.kid, repository.getRepositoryId(), metaclass.getId());
        newObject.init(uuid, liveId);
        
        // Set a meta object (SeHandle for transaction management)
        newObject.setMetaOf(this.metaObject);
        
        // Add the object to the repository
        repository.addObject(newObject);
        
        // Triggers the meta object
        this.metaObject.createObject(newObject);
        
             // Set the object name if given (before marking it shell)
        if (name != null) {
            newObject.getClassOf().getAttributeDef("Name").setValue(newObject.getData(), name);
            //newObject.setName(name);
        }
        
        // Mark it shell
        newObject.getData().setRFlags(IRStatus.SHELL, 0, 0);
        return newObject;
    }

}
