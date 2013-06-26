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
                                    

package org.modelio.vcore.session.api.repository;

import java.io.IOException;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.session.api.IAccessManager;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Repository access support interface.
 * <p>
 */
@objid ("0051ce3a-5f00-10c8-842f-001ec947cd2a")
public interface IRepositorySupport {
    /**
     * Connect a repository to this modeling session.
     * @param aBase the repository to add.
     * @param accessManager an access manager.
     * @param monitor a progress monitor
     * @throws java.io.IOException in case of failure.
     */
    @objid ("08e18da1-1771-11e2-ac36-001ec947ccaf")
    void connectRepository(IRepository aBase, final IAccessManager accessManager, IModelioProgress monitor) throws IOException;

    /**
     * Close and remove the given model repository from the connected repositories.
     * @param toRemove the repository to disconnect.
     * @throws java.lang.IllegalArgumentException if the repository is not connected to this session
     */
    @objid ("08e18da8-1771-11e2-ac36-001ec947ccaf")
    void disconnectRepository(IRepository toRemove) throws IllegalArgumentException;

    /**
     * Get all connected model repositories.
     * <p>
     * The returned list is read only and reflects changes to open repositories.
     * @return the connected repositories.
     */
    @objid ("08e18da4-1771-11e2-ac36-001ec947ccaf")
    List<IRepository> getRepositoriesView();

    /**
     * Get the repository where the given object is stored.
     * <p>
     * Returns <code>null</code> if the object is not assigned to a repository or the repository does not belong to this session.
     * @param anObject an object
     * @return its repository, or <code>null</code>.
     */
    @objid ("08e18da5-1771-11e2-ac36-001ec947ccaf")
    IRepository getRepository(MObject anObject);

    /**
     * Get all connected model repositories.
     * <p>
     * The returned list is a copy of the open repositories list at the moment this method is called.
     * It won't reflect changes on the repositories list.
     * @return the connected repositories at the moment of call.
     */
    @objid ("0d23c864-4b7e-11e2-91c9-001ec947ccaf")
    List<IRepository> getRepositories();

}
