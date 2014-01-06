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
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007f7bdc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexBehaviorDefinition extends BpmnBaseElement {
    @objid ("c8c7a6ff-1ab3-45df-91b9-d4385996779a")
    String getCondition();

    @objid ("634a6f55-e0a0-4652-a4d3-6321a650acb4")
    void setCondition(String value);

    @objid ("cfca8302-2fea-4ffe-bbc7-cf22b5a36acc")
    BpmnMultiInstanceLoopCharacteristics getOwner();

    @objid ("beb1457d-e151-4755-8b0d-2daa228c961d")
    void setOwner(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("a986d743-9f0e-44c6-897e-bf024fe25774")
    BpmnImplicitThrowEvent getEvent();

    @objid ("a21e8e42-0dbe-4edc-8d5e-741b8deafe2d")
    void setEvent(BpmnImplicitThrowEvent value);

}
