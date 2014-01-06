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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

@objid ("007df21c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAdHocSubProcess extends BpmnSubProcess {
    @objid ("668aaed9-8636-48a4-aaf4-13d3e50af7d9")
    AdHocOrdering getOrdering();

    @objid ("654ba5dc-cc1c-4165-8e2e-c30973849bf3")
    void setOrdering(AdHocOrdering value);

    @objid ("9fab003b-6f24-4136-9d98-eff691d2013a")
    boolean isCancelRemainingInstances();

    @objid ("0c93a72a-9b9e-41ae-abbf-db9107906388")
    void setCancelRemainingInstances(boolean value);

    @objid ("6984a09a-dfb1-470f-b72c-6ab40f9f384a")
    String getCompletionCondition();

    @objid ("84584dad-1f81-4104-9e87-8afad3c4b705")
    void setCompletionCondition(String value);

}
