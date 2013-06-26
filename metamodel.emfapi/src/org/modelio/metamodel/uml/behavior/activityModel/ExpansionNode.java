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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;

@objid ("00311a8c-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionNode extends ObjectNode {
    @objid ("52ff9fbd-755e-46d0-a2b3-0bfb5c32abf5")
    ExpansionRegion getRegionAsOutput();

    @objid ("938e908e-abaa-4905-a651-b70e4d7e3df0")
    void setRegionAsOutput(ExpansionRegion value);

    @objid ("10e32d60-1586-4d36-a55b-16a623ed46d4")
    ExpansionRegion getRegionAsInput();

    @objid ("f5d568e1-c636-4aee-a13c-f0fe3d1b6de7")
    void setRegionAsInput(ExpansionRegion value);

}
