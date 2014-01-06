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
    @objid ("487debaf-8c02-4b10-b590-9864cdb34fb0")
    boolean isIsImmediate();

    @objid ("ebb5af06-f83f-4860-9ea7-19ce24c3ce4a")
    void setIsImmediate(boolean value);

    @objid ("3c78ca00-25a2-4150-a805-c4eff7168b96")
    String getConditionExpression();

    @objid ("6cf3626f-6e51-4c41-94f0-1d92d2fab3ed")
    void setConditionExpression(String value);

    @objid ("efac40fc-429a-4634-b2cd-dcfa4e312a56")
    BpmnFlowNode getSourceRef();

    @objid ("c3ce6106-3933-40df-9556-acbe9d1fcff8")
    void setSourceRef(BpmnFlowNode value);

    @objid ("c7fc9815-aa29-49cf-9df9-f1f7222d35bf")
    BpmnFlowNode getTargetRef();

    @objid ("2f30d606-5eb0-4be5-bd22-891bb4b35443")
    void setTargetRef(BpmnFlowNode value);

    @objid ("36b323ef-1bbe-4037-83ec-bafdcaf6a239")
    BpmnInclusiveGateway getDefaultOfInclusive();

    @objid ("5f5a11f1-ad4e-47d7-9082-29645ecc2397")
    void setDefaultOfInclusive(BpmnInclusiveGateway value);

    @objid ("d86315e4-fb0f-4e0f-85fa-8c2cd4d3f526")
    BpmnActivity getDefaultFrom();

    @objid ("8f2b0802-d5e8-48b5-a500-8c22ec78e4e8")
    void setDefaultFrom(BpmnActivity value);

    @objid ("312f2537-9773-4ab9-baa1-fd16a1fe75bb")
    BpmnExclusiveGateway getDefaultOfExclusive();

    @objid ("b2eda4cd-eeaf-449d-b390-1195bfa130df")
    void setDefaultOfExclusive(BpmnExclusiveGateway value);

    @objid ("d59f10ec-7448-4f9d-9a78-d293ede81f5a")
    EList<BpmnSequenceFlowDataAssociation> getConnector();

    @objid ("cb19a9e5-04c9-4392-8933-9472f5a4fa3c")
    <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass);

    @objid ("02a7abd8-3c3f-477e-a671-47939e9e2407")
    BpmnComplexGateway getDefaultOfComplex();

    @objid ("c26de7cb-d5c2-4e2f-95f8-322a0aa30223")
    void setDefaultOfComplex(BpmnComplexGateway value);

}
