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
    @objid ("6295bc5f-4641-4f3c-89b0-ec1719337c78")
    @Override
    public boolean isIsSequencial() {
        return (Boolean) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt());
    }

    @objid ("5d350061-76a6-4711-9a0d-c8d4d49bf0c5")
    @Override
    public void setIsSequencial(boolean value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.IsSequencialAtt(), value);
    }

    @objid ("19bc68ee-7601-42b2-9b34-3eade0d20524")
    @Override
    public MultiInstanceBehavior getBehavior() {
        return (MultiInstanceBehavior) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt());
    }

    @objid ("01ae5fe5-984c-44e9-af0e-835149f06f73")
    @Override
    public void setBehavior(MultiInstanceBehavior value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.BehaviorAtt(), value);
    }

    @objid ("4d914328-0908-4d98-8fdc-bef9df651c89")
    @Override
    public String getLoopCardinality() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt());
    }

    @objid ("bd4cf6bb-3ca5-4696-a7dc-c014b1f7a853")
    @Override
    public void setLoopCardinality(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopCardinalityAtt(), value);
    }

    @objid ("fec01d4b-9512-4c31-b3fe-0a5c5abcf71d")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt());
    }

    @objid ("e6aede67-6eea-40e9-9871-3e6f2d08337a")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("7b812a48-0cc7-473e-b17d-6a5a50bdf7b1")
    @Override
    public BpmnDataInput getLoopDataInput() {
        return (BpmnDataInput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep());
    }

    @objid ("7543cbef-7b35-49fb-b325-75fa43304960")
    @Override
    public void setLoopDataInput(BpmnDataInput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep(), (SmObjectImpl)value);
    }

    @objid ("b766f706-9beb-4cae-9ef6-ab0882d44571")
    @Override
    public BpmnDataOutput getLoopDataOutputRef() {
        return (BpmnDataOutput) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep());
    }

    @objid ("5fdcd57f-81b9-4711-a098-f4eb7335d0ec")
    @Override
    public void setLoopDataOutputRef(BpmnDataOutput value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep(), (SmObjectImpl)value);
    }

    @objid ("8629f10b-8b69-47cc-99f9-63cb0237c5e1")
    @Override
    public BpmnEventDefinition getCompletionEventRef() {
        return (BpmnEventDefinition) getDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep());
    }

    @objid ("40887afc-d33c-4658-a68f-3be8115c379e")
    @Override
    public void setCompletionEventRef(BpmnEventDefinition value) {
        appendDepVal(BpmnMultiInstanceLoopCharacteristicsData.Metadata.CompletionEventRefDep(), (SmObjectImpl)value);
    }

    @objid ("c68dc4dc-91d8-463b-b4e6-7d4f4e5a7518")
    @Override
    public EList<BpmnComplexBehaviorDefinition> getComplexBehaviorDefinition() {
        return new SmList<>(this, BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep());
    }

    @objid ("64be5b27-ba95-473f-ad68-76091967e09e")
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

    @objid ("13ceb25c-66fe-42c0-947e-6ae6fc795950")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8613f68a-00f7-4218-9aba-53a6dcf9c34b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("249a2449-6b72-4cf5-92c0-f7e93dacf541")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMultiInstanceLoopCharacteristics(this);
        else
          return null;
    }

}
