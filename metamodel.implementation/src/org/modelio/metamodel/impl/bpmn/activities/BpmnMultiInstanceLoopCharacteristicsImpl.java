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
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00811ea6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMultiInstanceLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnMultiInstanceLoopCharacteristics {
    @objid ("69c8a5c4-26fb-4618-8516-9cf49951b973")
    @Override
    public boolean isIsSequencial() {
        return (Boolean) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt());
    }

    @objid ("039f24f8-48a9-48fe-9da2-5a82e8fe22b4")
    @Override
    public void setIsSequencial(boolean value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt(), value);
    }

    @objid ("03f1510a-927d-40e8-a17c-0b012d5302c8")
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt());
    }

    @objid ("7514558b-a3cb-41ce-a708-a07878a4f1ff")
    @Override
    public void setBehavior(MultiInstanceBehavior value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt(), value);
    }

    @objid ("e59adb9f-f6b4-4f03-b2e2-dfa867f3d38e")
    @Override
    public String getLoopCardinality() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt());
    }

    @objid ("9616aedb-3031-489b-a380-2d622973d5d2")
    @Override
    public void setLoopCardinality(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt(), value);
    }

    @objid ("f53032a1-31d9-4d39-b960-4b1feba119ef")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt());
    }

    @objid ("4aeababd-4759-435d-b2ec-cf71d6e78dfe")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("5cd417aa-8324-46d5-93ed-ae0ac8e249b3")
    @Override
    public BpmnDataInput getLoopDataInput() {
        return (BpmnDataInput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep());
    }

    @objid ("d4aed213-0124-4cf4-8a60-48e1a3fb53bc")
    @Override
    public void setLoopDataInput(BpmnDataInput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep(), (SmObjectImpl)value);
    }

    @objid ("ff16f92c-dec8-4705-b32a-02ffcdebc582")
    @Override
    public BpmnDataOutput getLoopDataOutputRef() {
        return (BpmnDataOutput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep());
    }

    @objid ("260960fd-82dd-4b91-be7d-27c3a80df46b")
    @Override
    public void setLoopDataOutputRef(BpmnDataOutput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep(), (SmObjectImpl)value);
    }

    @objid ("f5db4aef-1839-4a92-9652-7edad1e01f42")
    @Override
    public BpmnEventDefinition getCompletionEventRef() {
        return (BpmnEventDefinition) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep());
    }

    @objid ("2f437e01-f4c7-4abb-8566-a6e7a453c19e")
    @Override
    public void setCompletionEventRef(BpmnEventDefinition value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep(), (SmObjectImpl)value);
    }

    @objid ("443d9a0a-0a58-4a7c-b8c9-a888cb811810")
    @Override
    public EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return new SmList<>(this, BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep());
    }

    @objid ("13ee6ab8-8518-4634-a16d-f0bcedacf8d1")
    @Override
    public <T extends BpmnComplexBehaviorDefinition> List<T> getComplexBehaviorDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnComplexBehaviorDefinition element : getComplexBehaviorDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c41b981a-e7bd-4c3d-bcb1-855e6564aa0f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5a036081-f275-4c9b-aeb3-0939bc5ba140")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("dbe197c5-257f-4615-b447-c336ca145654")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMultiInstanceLoopCharacteristics(this);
        else
          return null;
    }

}
