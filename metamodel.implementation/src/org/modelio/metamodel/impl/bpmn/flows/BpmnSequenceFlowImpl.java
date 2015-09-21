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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
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
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("007cfdf8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowImpl extends BpmnFlowElementImpl implements BpmnSequenceFlow {
    @objid ("53104d92-e80f-49cc-9ff4-6f5a3ec20680")
    @Override
    public boolean isIsImmediate() {
        return (Boolean) getAttVal(((BpmnSequenceFlowSmClass)getClassOf()).getIsImmediateAtt());
    }

    @objid ("908408b4-c716-4fef-8b18-2e32cc3b34bd")
    @Override
    public void setIsImmediate(boolean value) {
        setAttVal(((BpmnSequenceFlowSmClass)getClassOf()).getIsImmediateAtt(), value);
    }

    @objid ("8e1a4d24-9f4f-4e98-a621-0031f318c9d2")
    @Override
    public String getConditionExpression() {
        return (String) getAttVal(((BpmnSequenceFlowSmClass)getClassOf()).getConditionExpressionAtt());
    }

    @objid ("faaeea9f-2a88-46aa-970f-292250328896")
    @Override
    public void setConditionExpression(String value) {
        setAttVal(((BpmnSequenceFlowSmClass)getClassOf()).getConditionExpressionAtt(), value);
    }

    @objid ("144cda17-021d-4561-8410-ca6dabd1f23d")
    @Override
    public BpmnFlowNode getSourceRef() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getSourceRefDep());
        return (obj instanceof BpmnFlowNode)? (BpmnFlowNode)obj : null;
    }

    @objid ("09326b7d-011f-4834-9f16-19e0d9c2ae65")
    @Override
    public void setSourceRef(BpmnFlowNode value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getSourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("41eec060-77fb-42cd-92b7-b6d9e8f04d74")
    @Override
    public BpmnFlowNode getTargetRef() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getTargetRefDep());
        return (obj instanceof BpmnFlowNode)? (BpmnFlowNode)obj : null;
    }

    @objid ("88ac6569-a422-4957-a058-2fe2341cb4b9")
    @Override
    public void setTargetRef(BpmnFlowNode value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getTargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("f4a58e2a-b951-4f49-af68-a54c1b64b0a6")
    @Override
    public BpmnInclusiveGateway getDefaultOfInclusive() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfInclusiveDep());
        return (obj instanceof BpmnInclusiveGateway)? (BpmnInclusiveGateway)obj : null;
    }

    @objid ("7a2eb9b4-35e3-4b25-a430-cd673a417f41")
    @Override
    public void setDefaultOfInclusive(BpmnInclusiveGateway value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfInclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("a411aee3-8713-48da-883b-7a3f0c2a8d13")
    @Override
    public BpmnActivity getDefaultFrom() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultFromDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("0f8f02e8-4512-450a-95f4-bf4d4f7d20bf")
    @Override
    public void setDefaultFrom(BpmnActivity value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultFromDep(), (SmObjectImpl)value);
    }

    @objid ("1b1b1447-5329-49c7-92a3-743877fb3b31")
    @Override
    public BpmnExclusiveGateway getDefaultOfExclusive() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfExclusiveDep());
        return (obj instanceof BpmnExclusiveGateway)? (BpmnExclusiveGateway)obj : null;
    }

    @objid ("8949638c-eb48-42f0-a652-3cd38548178d")
    @Override
    public void setDefaultOfExclusive(BpmnExclusiveGateway value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfExclusiveDep(), (SmObjectImpl)value);
    }

    @objid ("2714cde5-891b-4cfc-9220-935b2aeb60c4")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getConnector() {
        return new SmList<>(this, ((BpmnSequenceFlowSmClass)getClassOf()).getConnectorDep());
    }

    @objid ("40a42768-121a-44d0-8dd1-b786bc5c1180")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getConnector(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnSequenceFlowDataAssociation element : getConnector()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f427c223-ebf7-4e50-889c-86d5dc7141cd")
    @Override
    public BpmnComplexGateway getDefaultOfComplex() {
        Object obj = getDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfComplexDep());
        return (obj instanceof BpmnComplexGateway)? (BpmnComplexGateway)obj : null;
    }

    @objid ("6d839cf3-9b1b-44ef-8278-d22b1cc8e98f")
    @Override
    public void setDefaultOfComplex(BpmnComplexGateway value) {
        appendDepVal(((BpmnSequenceFlowSmClass)getClassOf()).getDefaultOfComplexDep(), (SmObjectImpl)value);
    }

    @objid ("ea4d90bd-3955-4f9f-97fa-d1b0bf4105e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("513636f3-5604-4a83-9179-bd4e05cb530a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("c6b8283b-5847-4075-bb99-9f79e55f6b14")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlow(this);
        else
          return null;
    }

}
