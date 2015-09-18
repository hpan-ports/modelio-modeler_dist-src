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
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007f7bdc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexBehaviorDefinition extends BpmnBaseElement {
    @objid ("fe73ecd3-cbe7-4c87-a91a-ff97cefff206")
    String getCondition();

    @objid ("daac5734-9d0a-4322-b48c-356738e3fe3f")
    void setCondition(String value);

    @objid ("dc6083db-c693-4a0e-96d6-bce2b2ba7970")
    BpmnMultiInstanceLoopCharacteristics getOwner();

    @objid ("fde98f5f-701c-4cac-bcd3-fbf62b34ae04")
    void setOwner(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("41160426-48e0-4c0b-a0d5-5b9bd7d38763")
    BpmnImplicitThrowEvent getEvent();

    @objid ("a368c405-049a-46b4-88bd-7c350a4a8f50")
    void setEvent(BpmnImplicitThrowEvent value);

}
