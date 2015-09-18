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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

@objid ("007df21c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAdHocSubProcess extends BpmnSubProcess {
    @objid ("7b560316-5540-4af6-bebc-843f67dab286")
    AdHocOrdering getOrdering();

    @objid ("389c32c9-8e9e-48c9-b28a-7acaaabc97db")
    void setOrdering(AdHocOrdering value);

    @objid ("aab1aae7-b6c0-49af-b863-6c8082c828ed")
    boolean isCancelRemainingInstances();

    @objid ("b56249eb-16ab-4bed-a4e4-bf5de939de1f")
    void setCancelRemainingInstances(boolean value);

    @objid ("48d5574b-117b-4057-a5fc-85ee44c055cf")
    String getCompletionCondition();

    @objid ("30d3f766-bc6b-4dcb-84d8-10859946b922")
    void setCompletionCondition(String value);

}
