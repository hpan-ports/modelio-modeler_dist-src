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
    @objid ("eb9f0c52-e30b-4ba1-b6aa-1312fa7b49da")
    @Override
    public boolean isIsImmediate() {
        return (Boolean) getAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt());
    }

    @objid ("76762f64-6cdc-498a-864e-8f933d68029d")
    @Override
    public void setIsImmediate(boolean value) {
        setAttVal(BpmnSequenceFlowData.Metadata.IsImmediateAtt(), value);
    }

    @objid ("604d3e07-3b7d-4103-ab37-7ac23201853f")
    @Override
    public String getConditionExpression() {
        return (String) getAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt());
    }

    @objid ("3bcddfd4-28dd-4411-962e-80fc5776202a")
    @Override
    public void setConditionExpression(String value) {
        setAttVal(BpmnSequenceFlowData.Metadata.ConditionExpressionAtt(), value);
    }

    @objid ("b35db47a-178b-4075-8f5d-c2e50b0b1ab5")
    @Override
    public BpmnFlowNode getSourceRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep());
    }

    @objid ("1807044d-25ac-49e9-a3a8-0c9c09269781")
    @Override
    public void setSourceRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.SourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("c04a59ed-20b4-40fe-a066-d5b7cf2272b5")
    @Override
    public BpmnFlowNode getTargetRef() {
        return (BpmnFlowNode) getDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep());
    }

    @objid ("40f48c63-53ba-4591-8727-4348eb73dda2")
    @Override
    public void setTargetRef(BpmnFlowNode value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("9081e771-4ed8-46e2-868e-42c35a43a7f9")
    @Override
    public BpmnInclusiveGateway getDefaultOfInclusive() {
        return (BpmnInclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep());
    }

    @objid ("9df57439-ce06-463a-b67c-01c37dd38eeb")
    @Override
    public void setDefaultOfInclusive(BpmnInclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("2a75d16f-c51d-41c9-9a27-6f64cefcf3e9")
    @Override
    public BpmnActivity getDefaultFrom() {
        return (BpmnActivity) getDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep());
    }

    @objid ("fd188950-5400-42f8-af03-7bec10496487")
    @Override
    public void setDefaultFrom(BpmnActivity value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultFromDep(), (SmObjectImpl)value);
    }

    @objid ("f63d955c-73cd-4418-8ff0-ddaffaff8959")
    @Override
    public BpmnExclusiveGateway getDefaultOfExclusive() {
        return (BpmnExclusiveGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep());
    }

    @objid ("692f5cbc-b873-45f5-906e-6318b3e6c540")
    @Override
    public void setDefaultOfExclusive(BpmnExclusiveGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("655df37c-58d3-4654-8a29-523319407a91")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getConnector() {
        return new SmList<>(this, BpmnSequenceFlowData.Metadata.ConnectorDep());
    }

    @objid ("4bff93f5-625a-4163-84c8-93fe2fc6ca7b")
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

    @objid ("720ae212-f04d-48bc-b41a-da447db46642")
    @Override
    public BpmnComplexGateway getDefaultOfComplex() {
        return (BpmnComplexGateway) getDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep());
    }

    @objid ("62d9fdd4-7be9-4b54-b9e0-66017b243999")
    @Override
    public void setDefaultOfComplex(BpmnComplexGateway value) {
        appendDepVal(BpmnSequenceFlowData.Metadata.DefaultOfComplexDep(), (SmObjectImpl)value);
    }

    @objid ("2e7b7720-baa5-4bac-8407-1b7aa1d74ae9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("acab27fa-5c72-45f6-8358-fffe3e31a291")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("25c18462-f369-4e02-aadd-9642d85baf4c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlow(this);
        else
          return null;
    }

}
