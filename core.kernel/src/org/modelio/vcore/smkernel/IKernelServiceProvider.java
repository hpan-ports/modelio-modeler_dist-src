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
                                    

package org.modelio.vcore.smkernel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * kernel provider service.
 */
@objid ("0050d5fc-861a-1f21-85a5-001ec947cd2a")
public interface IKernelServiceProvider {
    /**
     * Get the swap service.
     * @return the swap.
     */
    @objid ("0050debc-861a-1f21-85a5-001ec947cd2a")
    ISwap getSwap();

    /**
     * Set the kernel provider service identifier.
     * @param newId
     */
    @objid ("0044ceb0-8b3b-1f21-85a5-001ec947cd2a")
    void setId(final short newId);

    /**
     * Get the kernel provider service identifier.
     * @return the kernel provider service identifier.
     */
    @objid ("0044d78e-8b3b-1f21-85a5-001ec947cd2a")
    short getId();

    @objid ("0010ed98-117d-1f35-b94f-001ec947cd2a")
    String getName();

    /**
     * Initialize the given model object data.
     * @param smObjectImpl a model object
     * @return the model object data.
     */
    @objid ("dbf5387e-4868-11e2-91c9-001ec947ccaf")
    ISmObjectData loadData(SmObjectImpl smObjectImpl);

}
