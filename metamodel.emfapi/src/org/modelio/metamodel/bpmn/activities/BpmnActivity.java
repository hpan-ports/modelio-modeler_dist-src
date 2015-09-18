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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("007d712a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnActivity extends BpmnFlowNode {
    @objid ("6e6ed3a9-ed11-4615-8721-20b3815a973e")
    boolean isIsForCompensation();

    @objid ("d3443f49-fe30-4ead-9a29-78cc2ff60dfe")
    void setIsForCompensation(boolean value);

    @objid ("05445805-3622-4b5a-b00d-d30ff78c0556")
    int getStartQuantity();

    @objid ("3fed41b6-b3cd-412c-a00f-fa8d09944e41")
    void setStartQuantity(int value);

    @objid ("a7b60c4a-c3cd-4b3c-9274-20554cee0b6d")
    int getCompletionQuantity();

    @objid ("c55bcd48-318a-4904-8c6e-9a56640cee36")
    void setCompletionQuantity(int value);

    @objid ("b890b978-1bc8-4772-8820-f97c021d20ca")
    EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions();

    @objid ("d7838ab3-61e8-47d3-abad-6b07020353ea")
    <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass);

    @objid ("d1cfdcc5-5988-4fcc-bc91-b90dc5fecdb7")
    EList<BpmnDataInput> getInputSpecification();

    @objid ("63d18631-5928-46de-abdc-76bc790cc9d4")
    <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass);

    @objid ("022b644e-2f89-4a3f-8866-4238fb43b7c7")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("d4a10007-67ec-4dad-a3d0-a900d12cec05")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("0fac2d01-e979-49a7-a8aa-6dca366f0433")
    EList<BpmnDataOutput> getOutputSpecification();

    @objid ("b56a428c-29a4-459e-934f-59690f748ff6")
    <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass);

    @objid ("e4aa69d7-27f1-4846-a13b-09f3af12121b")
    BpmnLoopCharacteristics getLoopCharacteristics();

    @objid ("d809ef83-b3e5-4de8-9fe1-8620c8319875")
    void setLoopCharacteristics(BpmnLoopCharacteristics value);

    @objid ("583a7e15-1194-4ccf-b56f-27b35fd38f04")
    EList<BpmnBoundaryEvent> getBoundaryEventRef();

    @objid ("34403bec-7167-4fbd-aad7-4d58f21c9449")
    <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass);

    @objid ("a99f5711-8d62-4225-8d39-763e698a8b04")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("d82b7d9e-ea24-484d-b072-b8ca1e06e2d8")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("cefbda20-8e89-441c-a5a6-608cb5953d28")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("dcae1ce1-4e75-4f0a-b509-d0f63f9fcf3c")
    void setDefaultFlow(BpmnSequenceFlow value);

}
