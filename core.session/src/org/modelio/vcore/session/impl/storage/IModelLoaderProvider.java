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
                                    

package org.modelio.vcore.session.impl.storage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Service used get a model loader.
 * <p>
 * The obtained loader must be used in a <i>try-with-resource</i> statement in order to always
 * be closed.
 * <p>
 * 2 model loader types are available: one standard model loader and
 * one that fires model change events.
 */
@objid ("8649af9a-19f2-11e2-8eb9-001ec947ccaf")
public interface IModelLoaderProvider {
    /**
     * @return the kernel id.
     */
    @objid ("f6a871ca-3948-11e2-920a-001ec947ccaf")
    short getKid();

    /**
     * Begin a loading session.
     * <p>
     * Should be called only when no model loader is already available.
     * This loader must be used in a <i>try-with-resource</i> statement in order to always
     * be closed.
     * @return a model loader.
     */
    @objid ("1fcf84c5-3a2d-11e2-bf6c-001ec947ccaf")
    IModelLoader beginLoadSession();

    /**
     * Begin a model refresh.
     * <p>
     * Should be called only when no model refresher is already available.
     * This refresher must be used in a <i>try-with-resource</i> statement in order to always
     * be closed.
     * @return a model refresher.
     */
    @objid ("e71a43e0-d267-4d5e-8fca-6ebe488c7118")
    IModelRefresher beginRefreshSession();

}
