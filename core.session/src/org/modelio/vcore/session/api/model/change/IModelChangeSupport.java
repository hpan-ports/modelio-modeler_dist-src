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
                                    

package org.modelio.vcore.session.api.model.change;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00962eb8-5765-10c8-842f-001ec947cd2a")
public interface IModelChangeSupport {
    @objid ("0061c06a-58c5-10c8-842f-001ec947cd2a")
    void addModelChangeHandler(IModelChangeHandler aHandler);

    @objid ("0061cd80-58c5-10c8-842f-001ec947cd2a")
    void addModelChangeListener(IModelChangeListener aListener);

    @objid ("0061d686-58c5-10c8-842f-001ec947cd2a")
    void removeModelChangeHandler(IModelChangeHandler aHandler);

    @objid ("0061e05e-58c5-10c8-842f-001ec947cd2a")
    void removeModelChangeListener(IModelChangeListener aListener);

    @objid ("0061e9d2-58c5-10c8-842f-001ec947cd2a")
    void addStatusChangeListener(final IStatusChangeListener aListener);

    @objid ("00620606-58c5-10c8-842f-001ec947cd2a")
    void removeStatusChangeListener(final IStatusChangeListener aListener);

}
