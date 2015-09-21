/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnDataAssociation v0.0.9054
 * 
 * 
 * Data Associations are used to move data between Data Objects, Properties, and inputs and outputs of Activities, Processes, and GlobalTasks. Tokens do not flow along a Data Association, and as a result they have no direct effect on the flow of the Process.
 * 
 * The purpose of retrieving data from Data Objects or Process Data Inputs is to fill the Activities inputs and later push the output values from the execution of the Activity back into Data Objects or Process Data Outputs.
 * 
 * The DataAssociation class is a BaseElement contained by an Activity or Event, used to model how data is pushed into or pulled from item-aware elements. DataAssociation elements may have one or more sources and a target; the source of the association is copied into the target.
 * 
 * NOTE: Voir ownership. Discutter du pattern "targetref" quand la fl�che d�signe une activit�
 */
@objid ("00047c84-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataAssociation extends BpmnBaseElement {
    @objid ("beb76e9b-5e42-4150-9b57-96e8753b6093")
    public static final String MNAME = "BpmnDataAssociation";

    /**
     * Getter for attribute 'BpmnDataAssociation.Assignment'
     * 
     * Metamodel description:
     * <i>Specifies one or more data elements Assignments. By using an Assignment, single data structure elements can be assigned from the source structure to the target structure.</i>
     */
    @objid ("b6eef81f-185d-4ef5-8dfb-e7d138566db0")
    String getAssignment();

    /**
     * Setter for attribute 'BpmnDataAssociation.Assignment'
     * 
     * Metamodel description:
     * <i>Specifies one or more data elements Assignments. By using an Assignment, single data structure elements can be assigned from the source structure to the target structure.</i>
     */
    @objid ("1bc58ac0-91be-45ee-b52c-bc373ae0427b")
    void setAssignment(String value);

    /**
     * Getter for attribute 'BpmnDataAssociation.Transfomation'
     * 
     * Metamodel description:
     * <i>Specifies an optional transformation Expression. The actual scope of visible data for that Expression is defined by the source and target of the specific data association types.</i>
     */
    @objid ("d580f17c-a887-472a-b917-4430feede587")
    String getTransfomation();

    /**
     * Setter for attribute 'BpmnDataAssociation.Transfomation'
     * 
     * Metamodel description:
     * <i>Specifies an optional transformation Expression. The actual scope of visible data for that Expression is defined by the source and target of the specific data association types.</i>
     */
    @objid ("d9fcdd33-119e-4000-bcfa-fc40a1d0705e")
    void setTransfomation(String value);

    /**
     * Getter for attribute 'BpmnDataAssociation.Language'
     * 
     * Metamodel description:
     * <i>Language used for the assignment expression.</i>
     */
    @objid ("f0bfedcf-24b1-4226-b7bf-5e636f5a2d0d")
    String getLanguage();

    /**
     * Setter for attribute 'BpmnDataAssociation.Language'
     * 
     * Metamodel description:
     * <i>Language used for the assignment expression.</i>
     */
    @objid ("0def77fd-b26e-42b1-9e5d-88aff50ad59f")
    void setLanguage(String value);

    /**
     * Getter for relation 'BpmnDataAssociation->SourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("84fca6f2-47e1-41cb-a2e4-7f367e9265f5")
    EList<BpmnItemAwareElement> getSourceRef();

    /**
     * Filtered Getter for relation 'BpmnDataAssociation->SourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c825ed8b-f636-4651-91a9-b8872c255b0d")
    <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnDataAssociation->TargetRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("73cfba6b-5389-46bf-98b9-0d0f2ba1c99d")
    BpmnItemAwareElement getTargetRef();

    /**
     * Setter for relation 'BpmnDataAssociation->TargetRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2fdd9af3-4afd-4055-97c1-45addcfc9640")
    void setTargetRef(BpmnItemAwareElement value);

    /**
     * Getter for relation 'BpmnDataAssociation->EndingActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9789ae0e-7ce1-4040-9be3-e001416a6821")
    BpmnActivity getEndingActivity();

    /**
     * Setter for relation 'BpmnDataAssociation->EndingActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6dd41ff3-67dc-42c3-bea9-1cdfb9626c7f")
    void setEndingActivity(BpmnActivity value);

    /**
     * Getter for relation 'BpmnDataAssociation->StartingActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3871316d-9ac8-4740-aeee-ae422c39b1e7")
    BpmnActivity getStartingActivity();

    /**
     * Setter for relation 'BpmnDataAssociation->StartingActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ddb9c52c-4071-41e3-ab27-c4785a8bbfe4")
    void setStartingActivity(BpmnActivity value);

    /**
     * Getter for relation 'BpmnDataAssociation->StartingEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("23e62601-7428-4f57-a02f-c70f8c369d44")
    BpmnThrowEvent getStartingEvent();

    /**
     * Setter for relation 'BpmnDataAssociation->StartingEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("da23bf38-7d6a-4c16-8d98-1de24f54d8ec")
    void setStartingEvent(BpmnThrowEvent value);

    /**
     * Getter for relation 'BpmnDataAssociation->VisualShortCut'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b9fe814c-6937-40c2-9e7e-bb5e53d23727")
    EList<BpmnSequenceFlowDataAssociation> getVisualShortCut();

    /**
     * Filtered Getter for relation 'BpmnDataAssociation->VisualShortCut'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("99a5a2fe-bc6c-492e-9fc3-6fbc46be5e41")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnDataAssociation->EndingEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("64aee167-aed3-4205-b512-588c09070430")
    BpmnCatchEvent getEndingEvent();

    /**
     * Setter for relation 'BpmnDataAssociation->EndingEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("008fe665-8e4d-43a3-853f-a4533cc2552f")
    void setEndingEvent(BpmnCatchEvent value);

}
