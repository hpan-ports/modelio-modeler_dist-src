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
    @objid ("d9b3c1dc-dabd-46c5-a186-9e87126a4e0d")
    boolean isIsImmediate();

    @objid ("b93ee2c9-2df6-472b-b6f0-8bf2d0930245")
    void setIsImmediate(boolean value);

    @objid ("473fe753-e46d-4ac3-bd19-57d93f79db7a")
    String getConditionExpression();

    @objid ("177d5c1d-dcdc-484f-9964-6fcf4a4569f2")
    void setConditionExpression(String value);

    @objid ("126e384a-86cb-40db-94da-067b9ba7e051")
    BpmnFlowNode getSourceRef();

    @objid ("09c00e81-7c83-462a-bffc-fa7f4659e8f3")
    void setSourceRef(BpmnFlowNode value);

    @objid ("11d36255-1050-4b5f-87d2-b04e9c673fba")
    BpmnFlowNode getTargetRef();

    @objid ("68081e77-54c2-4abf-9d69-e97386a64738")
    void setTargetRef(BpmnFlowNode value);

    @objid ("5f18cddd-5427-4391-afe5-bdfbe479647c")
    BpmnInclusiveGateway getDefaultOfInclusive();

    @objid ("d08d25dd-ce0d-4d52-813b-7f59287223c6")
    void setDefaultOfInclusive(BpmnInclusiveGateway value);

    @objid ("64b6e87f-981d-44ad-a3e2-00c551611bf9")
    BpmnActivity getDefaultFrom();

    @objid ("cc74778e-23d3-4a96-829f-994ae5fedac6")
    void setDefaultFrom(BpmnActivity value);

    @objid ("8b5f5b60-4d43-4191-8e4c-cf9f6d97589d")
    BpmnExclusiveGateway getDefaultOfExclusive();

    @objid ("7a8a8bcb-6140-41df-b533-6a69a96211ee")
    void setDefaultOfExclusive(BpmnExclusiveGateway value);

    @objid ("d2e151de-6947-4ae7-bcac-6bf89be2a073")
    EList<BpmnSequenceFlowDataAssociation> getConnector();

    @objid ("84bcf358-541d-47eb-9445-5b7a29f5c325")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass);

    @objid ("3e2cf9b2-6a35-4fad-a856-009479bb1fd2")
    BpmnComplexGateway getDefaultOfComplex();

    @objid ("7ba3736f-bcb0-4d2c-bdc4-a77413a8a3a6")
    void setDefaultOfComplex(BpmnComplexGateway value);

}
