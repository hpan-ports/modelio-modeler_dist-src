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
    @objid ("ec82d95c-10d1-4ca1-9b83-61eac240819e")
    @Override
    public boolean isIsSequencial() {
        return (Boolean) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt());
    }

    @objid ("3523a6a7-84cc-4d59-9aed-f7ca402ef5c6")
    @Override
    public void setIsSequencial(boolean value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt(), value);
    }

    @objid ("0c2dcce9-a85c-47c6-8dfb-e20d7ce7bb52")
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt());
    }

    @objid ("88dbfeff-f158-4108-901b-b688e3fec226")
    @Override
    public void setBehavior(MultiInstanceBehavior value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt(), value);
    }

    @objid ("f310f024-b461-42e3-b8e9-57052135783f")
    @Override
    public String getLoopCardinality() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt());
    }

    @objid ("45c0b72e-f12b-423c-960c-b9512aa4634a")
    @Override
    public void setLoopCardinality(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt(), value);
    }

    @objid ("735c7eea-91a1-48e6-8176-54c92f342b43")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt());
    }

    @objid ("1f8547d3-1cfe-4b73-b5de-5331094cb9f6")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("81255788-4223-4e28-a5c8-5c10f1eea255")
    @Override
    public BpmnDataInput getLoopDataInput() {
        return (BpmnDataInput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep());
    }

    @objid ("2de74762-68f7-424f-ae53-8afa1f29b392")
    @Override
    public void setLoopDataInput(BpmnDataInput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep(), (SmObjectImpl)value);
    }

    @objid ("c6d64ffd-ed10-488e-95d3-5a640a1eaacb")
    @Override
    public BpmnDataOutput getLoopDataOutputRef() {
        return (BpmnDataOutput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep());
    }

    @objid ("118b2068-d488-4dd4-b049-16d11bb04566")
    @Override
    public void setLoopDataOutputRef(BpmnDataOutput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep(), (SmObjectImpl)value);
    }

    @objid ("04814e08-326a-413e-8cad-d98ebfe46287")
    @Override
    public BpmnEventDefinition getCompletionEventRef() {
        return (BpmnEventDefinition) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep());
    }

    @objid ("645e5375-567f-40c7-b35f-1ab99d1bdf5e")
    @Override
    public void setCompletionEventRef(BpmnEventDefinition value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep(), (SmObjectImpl)value);
    }

    @objid ("24673cc9-6425-4fdb-976c-ff2942c5c3ef")
    @Override
    public EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return new SmList<>(this, BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep());
    }

    @objid ("c30b4ad2-be7e-4989-90e1-050a3192eba7")
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

    @objid ("29e2bbfa-bcc2-43a2-b545-49c31410c350")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("dfaac3d8-63bb-4721-84b6-b8b8e23625b2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2f491328-e033-42f4-8170-71579921448f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMultiInstanceLoopCharacteristics(this);
        else
          return null;
    }

}
