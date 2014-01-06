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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007cfdf8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowImpl extends BpmnFlowElementImpl implements BpmnSequenceFlow {
    @objid ("c96ae6b2-f5b2-41c2-aea6-f208332cee1f")
    @Override
    public boolean isIsImmediate() {
        return (Boolean) getAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt());
    }

    @objid ("872875b4-83a2-4c1b-9b81-76794275acb5")
    @Override
    public void setIsImmediate(boolean value) {
        setAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt(), value);
    }

    @objid ("3abf92e7-4936-4e76-895f-9f18760c65a3")
    @Override
    public String getConditionExpression() {
        return (String) getAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt());
    }

    @objid ("99227039-730d-43be-9cba-0e7d12543aa1")
    @Override
    public void setConditionExpression(String value) {
        setAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt(), value);
    }

    @objid ("2d7ee12f-be7f-4d2e-873a-34da79f9dcd1")
    @Override
    public BpmnFlowNode getSourceRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep());
    }

    @objid ("cb164acb-52ed-4e4e-888f-a15b951c615a")
    @Override
    public void setSourceRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("52cbc73c-3b54-42c6-b373-07c6229f5c4e")
    @Override
    public BpmnFlowNode getTargetRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep());
    }

    @objid ("c71df47b-2fea-4bff-b1af-4e57d3ac0dc3")
    @Override
    public void setTargetRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("4a634f43-60cb-4ce0-99c3-5d7d6cf9746f")
    @Override
    public BpmnInclusiveGateway getDefaultOfInclusive() {
        return (BpmnInclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep());
    }

    @objid ("1ed2107c-0d99-4cfa-9273-17a34d095c47")
    @Override
    public void setDefaultOfInclusive(BpmnInclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("c8757d3f-9644-4b58-b2fd-3bcde2d11d03")
    @Override
    public BpmnActivity getDefaultFrom() {
        return (BpmnActivity) getDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep());
    }

    @objid ("9b87dd81-f882-4758-aa55-137a1ded898e")
    @Override
    public void setDefaultFrom(BpmnActivity value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep(), (SmObjectImpl)value);
    }

    @objid ("b48bd2c2-6cd7-4d03-b69e-fc8574ef2ecb")
    @Override
    public BpmnExclusiveGateway getDefaultOfExclusive() {
        return (BpmnExclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep());
    }

    @objid ("d2b46a1a-a06c-45c5-af65-14728f27ceed")
    @Override
    public void setDefaultOfExclusive(BpmnExclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("f25704a9-09ad-4e44-a40d-d4f6a3e207c9")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getConnector() {
        return new SmList<>(this, BpmnSequenceFlowData.Metadata.ConnectorDep());
    }

    @objid ("08bde1fc-7e90-4b00-9b4b-a0726e8d11e9")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlowDataAssociation element : getConnector()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3ad63dcf-767e-4e5e-85b2-f36c7bd03d66")
    @Override
    public BpmnComplexGateway getDefaultOfComplex() {
        return (BpmnComplexGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep());
    }

    @objid ("5dbef8b4-bb3c-40fa-a795-1f42a93fbb9e")
    @Override
    public void setDefaultOfComplex(BpmnComplexGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep(), (SmObjectImpl)value);
    }

    @objid ("8351d902-36c8-4aba-8973-067dac0e4bc5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e0c55af8-f053-411d-aba0-eac776a9ea19")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("69482f52-fba4-48f1-bc7a-ffbccf818c5d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlow(this);
        else
          return null;
    }

}
