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
    @objid ("63530349-9817-4303-a9be-08d4127eb3c7")
    @Override
    public boolean isIsImmediate() {
        return (Boolean) getAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt());
    }

    @objid ("79c2c5fc-380c-4553-b269-753e0be170b4")
    @Override
    public void setIsImmediate(boolean value) {
        setAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt(), value);
    }

    @objid ("32ac3577-f864-4ac5-9ba9-e4f37af7f219")
    @Override
    public String getConditionExpression() {
        return (String) getAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt());
    }

    @objid ("7b923171-ee33-49cb-b649-1eb2c10a0077")
    @Override
    public void setConditionExpression(String value) {
        setAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt(), value);
    }

    @objid ("e702a511-920f-4fe2-b113-0957cc734725")
    @Override
    public BpmnFlowNode getSourceRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep());
    }

    @objid ("4fe6c338-37f2-474d-9832-8f280039ff1c")
    @Override
    public void setSourceRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("8bd4ce8d-4d30-450d-bcff-b521f5d9f3d5")
    @Override
    public BpmnFlowNode getTargetRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep());
    }

    @objid ("fa0582aa-c30b-4a70-acb1-beb78decac07")
    @Override
    public void setTargetRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("e23b54e8-d515-4045-905f-824611c767ca")
    @Override
    public BpmnInclusiveGateway getDefaultOfInclusive() {
        return (BpmnInclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep());
    }

    @objid ("c77b7b16-e989-4876-9dc4-60843f8e3b52")
    @Override
    public void setDefaultOfInclusive(BpmnInclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("4eb9f7e2-ee85-4cd7-b3b8-690c784a1516")
    @Override
    public BpmnActivity getDefaultFrom() {
        return (BpmnActivity) getDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep());
    }

    @objid ("11e24de2-b7c8-4872-be44-84fed9baf265")
    @Override
    public void setDefaultFrom(BpmnActivity value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep(), (SmObjectImpl)value);
    }

    @objid ("46d9899c-f7ac-4ab1-9628-28237b817ef6")
    @Override
    public BpmnExclusiveGateway getDefaultOfExclusive() {
        return (BpmnExclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep());
    }

    @objid ("8409e6f0-309d-4ba9-afa6-3d01353aa964")
    @Override
    public void setDefaultOfExclusive(BpmnExclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("8afedabc-0613-47ba-aeb8-5c1dcda7803d")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getConnector() {
        return new SmList<>(this, BpmnSequenceFlowData.Metadata.ConnectorDep());
    }

    @objid ("73a3acf7-069d-4c4c-8772-22f269155435")
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

    @objid ("a6caacf7-3f9f-4172-bff5-d1f9de217481")
    @Override
    public BpmnComplexGateway getDefaultOfComplex() {
        return (BpmnComplexGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep());
    }

    @objid ("edf16d5b-df66-4a53-a68c-a3cdc37a9635")
    @Override
    public void setDefaultOfComplex(BpmnComplexGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep(), (SmObjectImpl)value);
    }

    @objid ("6f1eb40c-e801-416d-a5ed-f1d2f84814ec")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2fe8449d-6550-4db8-aa33-de4a43966657")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3a499c5a-4987-4a26-a728-5bfe0fc80146")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlow(this);
        else
          return null;
    }

}
