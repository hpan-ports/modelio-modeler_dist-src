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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00811ea6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMultiInstanceLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnMultiInstanceLoopCharacteristics {
    @objid ("aca3fb41-9103-40af-b054-4ea5fb9cf077")
    @Override
    public boolean isIsSequencial() {
        return (Boolean) getAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getIsSequencialAtt());
    }

    @objid ("6bf19c1d-0bbb-4e9f-8128-e9711a6bcd75")
    @Override
    public void setIsSequencial(boolean value) {
        setAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getIsSequencialAtt(), value);
    }

    @objid ("76733e3e-f96f-47bf-a9a2-855751f75e06")
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) getAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getBehaviorAtt());
    }

    @objid ("1df07916-29e8-428f-b96f-0b8064aacc85")
    @Override
    public void setBehavior(MultiInstanceBehavior value) {
        setAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getBehaviorAtt(), value);
    }

    @objid ("829c2686-9f6e-43fe-85d0-94850e81e83e")
    @Override
    public String getLoopCardinality() {
        return (String) getAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopCardinalityAtt());
    }

    @objid ("c0ec0154-2170-4966-a388-baefc44f3413")
    @Override
    public void setLoopCardinality(String value) {
        setAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopCardinalityAtt(), value);
    }

    @objid ("aeae9ce8-8083-4320-ae7f-5dfffe40371f")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getCompletionConditionAtt());
    }

    @objid ("af16e00d-bf60-4489-aaf3-4a9fab3c8041")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getCompletionConditionAtt(), value);
    }

    @objid ("77477ee0-fac2-4791-aa7f-657edfaa587d")
    @Override
    public BpmnDataInput getLoopDataInput() {
        Object obj = getDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopDataInputDep());
        return (obj instanceof BpmnDataInput)? (BpmnDataInput)obj : null;
    }

    @objid ("2587f6d1-87e5-45f4-8700-0035b55d26be")
    @Override
    public void setLoopDataInput(BpmnDataInput value) {
        appendDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopDataInputDep(), (SmObjectImpl)value);
    }

    @objid ("628a180d-2795-4125-bd52-b2fce8c1681e")
    @Override
    public BpmnDataOutput getLoopDataOutputRef() {
        Object obj = getDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopDataOutputRefDep());
        return (obj instanceof BpmnDataOutput)? (BpmnDataOutput)obj : null;
    }

    @objid ("3b0df500-e5b5-4fa0-a2c2-a434fa136382")
    @Override
    public void setLoopDataOutputRef(BpmnDataOutput value) {
        appendDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getLoopDataOutputRefDep(), (SmObjectImpl)value);
    }

    @objid ("abe6e89d-bcb1-417a-be8d-318416cfbb1e")
    @Override
    public BpmnEventDefinition getCompletionEventRef() {
        Object obj = getDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getCompletionEventRefDep());
        return (obj instanceof BpmnEventDefinition)? (BpmnEventDefinition)obj : null;
    }

    @objid ("901638ca-23e9-4206-b6fe-f94e379131e1")
    @Override
    public void setCompletionEventRef(BpmnEventDefinition value) {
        appendDepVal(((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getCompletionEventRefDep(), (SmObjectImpl)value);
    }

    @objid ("731efc2c-6523-42e2-a83e-9dfa05b2b678")
    @Override
    public EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return new SmList<>(this, ((BpmnMultiInstanceLoopCharacteristicsSmClass)getClassOf()).getComplexBehaviorDefinitionDep());
    }

    @objid ("e3002af1-c343-4a36-b837-1416977768eb")
    @Override
    public <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnComplexBehaviorDefinition element : getComplexBehaviorDefinition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("feb4a3a2-6c89-423e-8c7d-08c429466622")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("128ee73e-a07e-4aff-8d41-6f74e88cc42d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("054e0eed-45ca-49c4-97dc-d9a36fac0326")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMultiInstanceLoopCharacteristics(this);
        else
          return null;
    }

}
