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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

@objid ("007df21c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAdHocSubProcess extends BpmnSubProcess {
    @objid ("a472e1d3-f015-4799-a1ed-a4b8132e8497")
    AdHocOrdering getOrdering();

    @objid ("f0f8da03-2a0f-4d11-8258-e7b84f04e3f7")
    void setOrdering(AdHocOrdering value);

    @objid ("6d1b582b-4325-4d2c-ac17-a42af0e2539f")
    boolean isCancelRemainingInstances();

    @objid ("3d2d27d8-99fa-4392-b598-cde172e4b0ea")
    void setCancelRemainingInstances(boolean value);

    @objid ("a51b297f-9082-4d1c-8f8d-c8737cee5333")
    String getCompletionCondition();

    @objid ("98741ea4-21bd-4cda-b8c5-9858c0b0759e")
    void setCompletionCondition(String value);

}
