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
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

/**
 * BpmnSequenceFlow v0.0.9054
 * 
 * 
 * A Sequence Flow is used to show the order of Flow Elements in a Process or a Choreography. Each Sequence Flow has only one source and only one target. The source and target must be from the set of the following Flow Elements: Events (Start, Intermediate, and End), Activities (Task and Sub-Process; for Processes), Choreography Activities (Choreography Task and  Sub-Choreography for Choreographies), and Gateways.
 * A Sequence Flow can optionally define a condition Expression, indicating that the token will be passed down the Sequence Flow only if the Expression evaluates to true. This Expression is typically used when the source of the Sequence Flow is a Gateway or an Activity.
 * A Sequence Flow that has an Exclusive, Inclusive, or Complex Gateway or an Activity as its source can also be defined with as default. Such Sequence Flow will have a marker to show that it is a default flow. The default Sequence Flow is taken (a token is passed) only if all the other outgoing Sequence Flow from the Activity or Gateway are not valid (i.e., their condition Expressions are false).
 * 
 * A sequence Flow is "default", if has a default association from a flowNode (Gateway or Activity).
 * A sequence flow is "conditional" is it originates from an activity, and has a conditionExpression.
 * 
 * Ownership
 * A Sequence flow belongs to a flow element container or a sub process.
 */
@objid ("007cd986-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlow extends BpmnFlowElement {
    @objid ("35dc48be-0791-44a3-a2e6-8178125dd9f6")
    public static final String MNAME = "BpmnSequenceFlow";

    /**
     * Getter for attribute 'BpmnSequenceFlow.IsImmediate'
     * 
     * Metamodel description:
     * <i>An optional boolean value specifying whether Activities or Choreography
     * Activities not in the model containing the Sequence Flow can occur between the
     * elements connected by the Sequence Flow. If the value is true, they MAY NOT occur. If the value is false, they MAY occur. Also see the isClosed attribute on Process, Choreography, and Collaboration. When the attribute has no value, the default semantics depends on the kind of model containing Sequence Flow:
     * ? For a public Processes and Choreographies no value has the same semantics as if the value were false.
     * ? For an executable and non-executable (internal) Processes no value has the same semantics as if the value were true.
     * ? For executable Processes, the attribute MUST NOT be false.</i>
     */
    @objid ("703d60fd-5cd0-46dc-b963-e38fe4e5e8b8")
    boolean isIsImmediate();

    /**
     * Setter for attribute 'BpmnSequenceFlow.IsImmediate'
     * 
     * Metamodel description:
     * <i>An optional boolean value specifying whether Activities or Choreography
     * Activities not in the model containing the Sequence Flow can occur between the
     * elements connected by the Sequence Flow. If the value is true, they MAY NOT occur. If the value is false, they MAY occur. Also see the isClosed attribute on Process, Choreography, and Collaboration. When the attribute has no value, the default semantics depends on the kind of model containing Sequence Flow:
     * ? For a public Processes and Choreographies no value has the same semantics as if the value were false.
     * ? For an executable and non-executable (internal) Processes no value has the same semantics as if the value were true.
     * ? For executable Processes, the attribute MUST NOT be false.</i>
     */
    @objid ("616befa4-dc3f-48b6-8888-f7329981b4b1")
    void setIsImmediate(boolean value);

    /**
     * Getter for attribute 'BpmnSequenceFlow.ConditionExpression'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("91c0200f-e8f4-4c38-8b05-3401bdc40378")
    String getConditionExpression();

    /**
     * Setter for attribute 'BpmnSequenceFlow.ConditionExpression'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4bd264ca-8359-4036-a514-bf1f1475c203")
    void setConditionExpression(String value);

    /**
     * Getter for relation 'BpmnSequenceFlow->SourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("afb45936-4d46-4cc3-a22b-37cdd3e0b86a")
    BpmnFlowNode getSourceRef();

    /**
     * Setter for relation 'BpmnSequenceFlow->SourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("301468c7-b15f-4fdb-a236-f194425adaa9")
    void setSourceRef(BpmnFlowNode value);

    /**
     * Getter for relation 'BpmnSequenceFlow->TargetRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e0a11513-ab6c-45f8-af3c-dae4546a4e8b")
    BpmnFlowNode getTargetRef();

    /**
     * Setter for relation 'BpmnSequenceFlow->TargetRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c07cc025-9b5c-4fdb-aa7c-027181425009")
    void setTargetRef(BpmnFlowNode value);

    /**
     * Getter for relation 'BpmnSequenceFlow->DefaultOfInclusive'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c2bccf66-1b8c-44e1-9bba-785a409cc26b")
    BpmnInclusiveGateway getDefaultOfInclusive();

    /**
     * Setter for relation 'BpmnSequenceFlow->DefaultOfInclusive'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9e3b288-0265-4339-a34f-c02c3d2e1ff1")
    void setDefaultOfInclusive(BpmnInclusiveGateway value);

    /**
     * Getter for relation 'BpmnSequenceFlow->DefaultFrom'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("52c34ccd-6b20-447d-95b7-19c23cb3cc81")
    BpmnActivity getDefaultFrom();

    /**
     * Setter for relation 'BpmnSequenceFlow->DefaultFrom'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ab7c05cd-a04b-4ad8-b8c1-237183b293a7")
    void setDefaultFrom(BpmnActivity value);

    /**
     * Getter for relation 'BpmnSequenceFlow->DefaultOfExclusive'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7c0a7e18-11d3-4832-8cb8-86db176db4de")
    BpmnExclusiveGateway getDefaultOfExclusive();

    /**
     * Setter for relation 'BpmnSequenceFlow->DefaultOfExclusive'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8090fac-005b-4950-b7d3-172b8c011346")
    void setDefaultOfExclusive(BpmnExclusiveGateway value);

    /**
     * Getter for relation 'BpmnSequenceFlow->Connector'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("af8923ac-7570-4502-8740-baab12a347c5")
    EList<BpmnSequenceFlowDataAssociation> getConnector();

    /**
     * Filtered Getter for relation 'BpmnSequenceFlow->Connector'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("052cf306-b66f-4f48-b42a-aafd1fafa72d")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnSequenceFlow->DefaultOfComplex'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cf9b2255-483a-44a2-b4a6-c94c1bd4259e")
    BpmnComplexGateway getDefaultOfComplex();

    /**
     * Setter for relation 'BpmnSequenceFlow->DefaultOfComplex'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("97d74fad-1ed4-48c0-9062-5d79d974370c")
    void setDefaultOfComplex(BpmnComplexGateway value);

}
