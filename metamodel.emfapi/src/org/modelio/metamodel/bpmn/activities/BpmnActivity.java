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
    @objid ("a33a4acd-0173-41f4-af15-e1dd865c513b")
    boolean isIsForCompensation();

    @objid ("00ad97aa-ecef-4cf2-bb86-6d60aace546a")
    void setIsForCompensation(boolean value);

    @objid ("e61506e3-d743-4c73-bf95-ea492ffb118a")
    int getStartQuantity();

    @objid ("5bf2cc9b-42cd-42d0-8b8f-7adb363d1b08")
    void setStartQuantity(int value);

    @objid ("41263b40-05b8-4444-8299-da41e854da5e")
    int getCompletionQuantity();

    @objid ("2fda220d-0708-4589-b448-5374c0ddec72")
    void setCompletionQuantity(int value);

    @objid ("227a5865-4951-4b9f-aed3-4bed3c12c495")
    EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions();

    @objid ("8b56459b-e334-4648-bbe9-9341082b8c5c")
    <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass);

    @objid ("6346f0ac-0a5e-4296-a40e-0811bf34308a")
    EList<BpmnDataInput> getInputSpecification();

    @objid ("da20c29b-ab2e-4e12-877d-b1cf360de75d")
    <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass);

    @objid ("f40a5fa6-1f54-49b8-ab73-dcb7174ccf12")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("f60df120-ba70-4b90-b8cb-c6106b7bbba9")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("185d18c9-5301-4dae-b828-bae83b433832")
    EList<BpmnDataOutput> getOutputSpecification();

    @objid ("c45ce335-cfc2-45dd-bf7a-5ac9331ccfc9")
    <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass);

    @objid ("ac14a48e-ae73-4a66-986e-610421936cc6")
    BpmnLoopCharacteristics getLoopCharacteristics();

    @objid ("361cefbc-9c6e-4ff0-b4ec-8a0073ee4cb7")
    void setLoopCharacteristics(BpmnLoopCharacteristics value);

    @objid ("7376df92-ffec-46fc-a165-6b2c89753954")
    EList<BpmnBoundaryEvent> getBoundaryEventRef();

    @objid ("8b66f700-3f7c-4c1e-a2db-afea0926b6be")
    <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass);

    @objid ("74fcab5d-b807-479d-93de-899567eca6f1")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    @objid ("8a150018-9cf7-446c-9a75-c9b8f1a803f1")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    @objid ("b1fd89b4-4659-4b21-b521-90d12dc94e7d")
    BpmnSequenceFlow getDefaultFlow();

    @objid ("b4042ba0-62a7-4d50-b00f-30227033eaf9")
    void setDefaultFlow(BpmnSequenceFlow value);

}
