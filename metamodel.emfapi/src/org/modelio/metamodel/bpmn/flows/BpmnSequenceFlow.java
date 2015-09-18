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
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("007cd986-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlow extends BpmnFlowElement {
    @objid ("53ba4257-f920-4abc-9c07-be325a2bc891")
    boolean isIsImmediate();

    @objid ("4793525a-6102-4103-8b0a-a16bde1e46f7")
    void setIsImmediate(boolean value);

    @objid ("8fb5a57f-576d-4169-89d9-a0dd826055ee")
    String getConditionExpression();

    @objid ("b23d448a-f2ac-4e79-bc2f-b88a1b7be4a7")
    void setConditionExpression(String value);

    @objid ("d8680625-1924-4ebf-98bd-06257c406f72")
    BpmnFlowNode getSourceRef();

    @objid ("75619a63-2739-4f87-8c4a-bdfba629b982")
    void setSourceRef(BpmnFlowNode value);

    @objid ("73096c18-ec22-4267-8524-25eb6b19c91f")
    BpmnFlowNode getTargetRef();

    @objid ("f3e63ad0-bd0e-4d20-a89e-4a4f6529b52f")
    void setTargetRef(BpmnFlowNode value);

    @objid ("2051612a-e747-4e6a-a08a-39265887e577")
    BpmnInclusiveGateway getDefaultOfInclusive();

    @objid ("c527e014-e15b-4b43-8855-34b8efc423b0")
    void setDefaultOfInclusive(BpmnInclusiveGateway value);

    @objid ("6071e947-7002-46a1-a4ca-1d4531e8a0e4")
    BpmnActivity getDefaultFrom();

    @objid ("5dcb7a77-3977-4f4c-b04c-f6c612d330b1")
    void setDefaultFrom(BpmnActivity value);

    @objid ("e7574ed0-3391-4244-8f0c-ec49fb5384d7")
    BpmnExclusiveGateway getDefaultOfExclusive();

    @objid ("d633159d-1254-4048-b7ee-e9ab218430bb")
    void setDefaultOfExclusive(BpmnExclusiveGateway value);

    @objid ("c92d94dd-430e-4768-a8b8-0f7ce0ec9285")
    EList<BpmnSequenceFlowDataAssociation> getConnector();

    @objid ("38d3a2ad-3df0-48d6-b63e-8c9ccc2dca93")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass);

    @objid ("953bbb94-452f-419b-bdd0-2bb5dffc502f")
    BpmnComplexGateway getDefaultOfComplex();

    @objid ("9269d1bf-1540-4279-8e13-f32187be64f1")
    void setDefaultOfComplex(BpmnComplexGateway value);

}
