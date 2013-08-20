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
import java.util.Collection;
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
     * The scratch repository is a memory repository created with the core session.
     * <p>
     * It may be freely used to create temporary objects.
     * The scratch repository is not saved, objects contained will be lost after having
     * closed the session.
     */
    @objid ("b9febee1-7292-473d-9c68-e0ef02cb445e")
    public static final String REPOSITORY_KEY_SCRATCH = "repo.key.scratch";

    /**
     * The local repository is a repository where elements
     * may be persisted without being shared with the other team members.
     * <p>
     * Used to store namespace use links and local property tables.
     */
    @objid ("a5808474-9cc0-4a28-9445-9edb77ee9e7a")
    public static final String REPOSITORY_KEY_LOCAL = "repo.key.local";

    /**
     * Connect a repository to this modeling session.
     * @param aBase the repository to add.
     * @param key a key used to retrieve the repository.
     * @param accessManager an access manager.
     * @param monitor a progress monitor
     * @throws java.io.IOException in case of failure.
     */
    @objid ("575a2f1c-9e37-493a-937e-fdc83533be0f")
    void connectRepository(IRepository aBase, String key, final IAccessManager accessManager, IModelioProgress monitor) throws IOException;

    /**
     * Connect a repository to this modeling session.
     * @param aBase the repository to add.
     * @param accessManager an access manager.
     * @param monitor a progress monitor
     * @throws java.io.IOException in case of failure.
     * @deprecated use {@link #connectRepository(IRepository, String, IAccessManager, IModelioProgress)}
     * with a repository key.
     */
    @objid ("08e18da1-1771-11e2-ac36-001ec947ccaf")
    @Deprecated
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
    Collection<IRepository> getRepositoriesView();

    /**
     * Get all connected model repositories.
     * <p>
     * The returned list is a copy of the open repositories list at the moment this method is called.
     * It won't reflect changes on the repositories list.
     * @return the connected repositories at the moment of call.
     */
    @objid ("0d23c864-4b7e-11e2-91c9-001ec947ccaf")
    Collection<IRepository> getRepositories();

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
     * Get the repository identified by the given key.
     * <p>
     * @param key the repository key
     * @return the found repository or null
     */
    @objid ("0940e0de-b09c-4bb9-a190-1ecfc2c1ae6d")
    IRepository getRepository(String key);

}
