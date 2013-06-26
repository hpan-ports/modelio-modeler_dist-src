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
 * Represents a model loading session.
 * <p>
 * 2 model loader types are available: one standard model loader and
 * one that fires model change events.
 * <p>
 * A model loader is obtained from a model loading session with {@link IModelLoaderProvider#beginLoadSession()}.
 * <code>IModelLoadingSession</code> is an {@link AutoCloseable} and is meant to be used in a <i>try-with-resource</i>
 * statement.
 */
@objid ("909b24ab-3a0a-11e2-bf6c-001ec947ccaf")
public interface IModelLoadingSession extends AutoCloseable {
    /**
     * Finish the loading session.
     * <p>
     * Called automatically if this object is used in a <i>try-with-resource</i> statement.
     */
    @objid ("1fc136d7-3a2d-11e2-bf6c-001ec947ccaf")
    @Override
    void close();

    /**
     * Get a model loader for a loading session.
     * <p>
     * The returned loader must not be stored, it will be closed
     * by {@link #close()} right after usage..
     * @return a repository model loader.
     */
    @objid ("7dcb89eb-1c43-11e2-8eb9-001ec947ccaf")
    IModelLoader getLoader();

    /**
     * Get a model loader with notifications.
     * <p>
     * The returned loader must not be stored, it will be closed
     * by {@link #close()} right after usage.
     * @return a model refresher.
     */
    @objid ("7dcb89ee-1c43-11e2-8eb9-001ec947ccaf")
    IModelRefresher getRefresher();

}
