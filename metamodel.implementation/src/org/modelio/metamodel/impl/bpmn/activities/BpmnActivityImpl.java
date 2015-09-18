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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007d9466-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnActivityImpl extends BpmnFlowNodeImpl implements BpmnActivity {
    @objid ("60f7bc7d-936f-43ad-9529-a083cc6c4f3e")
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) getAttVal(BpmnActivityData.Metadata.IsForCompensationAtt());
    }

    @objid ("058ea46c-d925-4cc5-a355-d8a4a6e0910d")
    @Override
    public void setIsForCompensation(boolean value) {
        setAttVal(BpmnActivityData.Metadata.IsForCompensationAtt(), value);
    }

    @objid ("c992eeb9-7b90-4200-979f-4f6113064013")
    @Override
    public int getStartQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.StartQuantityAtt());
    }

    @objid ("60f48d38-1561-4761-a2eb-f71b6f1ff626")
    @Override
    public void setStartQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.StartQuantityAtt(), value);
    }

    @objid ("66e32dc0-ab9c-4b17-9d4e-7b2261953688")
    @Override
    public int getCompletionQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt());
    }

    @objid ("481780ee-750b-4219-ab54-b53d6570776f")
    @Override
    public void setCompletionQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt(), value);
    }

    @objid ("98c0f2ab-8479-4f84-94c0-1a20b8f1e450")
    @Override
    public EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions() {
        return new SmList<>(this, BpmnActivityData.Metadata.CompensateEventDefinitionsDep());
    }

    @objid ("32128ed8-9ec7-4f57-b437-a47873adf6ef")
    @Override
    public <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCompensateEventDefinition element : getCompensateEventDefinitions()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25fbe915-405b-44d2-989b-6d393001cf48")
    @Override
    public EList<BpmnDataInput> getInputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.InputSpecificationDep());
    }

    @objid ("aa9c9f90-d7ff-4ad9-b428-3c13eb6f8dac")
    @Override
    public <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataInput element : getInputSpecification()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("15b06884-a014-4bf5-8c99-324d38d78009")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataInputAssociationDep());
    }

    @objid ("9047f345-2525-443f-956e-73fdc2edf797")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataInputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("84017179-8c05-4b5e-9a14-df095b1acbf4")
    @Override
    public EList<BpmnDataOutput> getOutputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.OutputSpecificationDep());
    }

    @objid ("36d75773-3fe2-4411-86c1-a8174c07426a")
    @Override
    public <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataOutput element : getOutputSpecification()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4485a502-2d5c-40ec-ab07-d133b22f178c")
    @Override
    public BpmnLoopCharacteristics getLoopCharacteristics() {
        return (BpmnLoopCharacteristics) getDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep());
    }

    @objid ("a0376641-60fe-4bf4-8d52-1b037254f896")
    @Override
    public void setLoopCharacteristics(BpmnLoopCharacteristics value) {
        appendDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("7d1e5981-3028-4417-a0e0-f26f0e085039")
    @Override
    public EList<BpmnBoundaryEvent> getBoundaryEventRef() {
        return new SmList<>(this, BpmnActivityData.Metadata.BoundaryEventRefDep());
    }

    @objid ("2b3fa9ec-a8b9-4ee3-8ecf-c3919590f8e4")
    @Override
    public <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnBoundaryEvent element : getBoundaryEventRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0b98911c-02f2-4656-bf9e-a760efab766f")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataOutputAssociationDep());
    }

    @objid ("0e483662-dcbf-4203-a72a-c271c9829790")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataOutputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("efcdef7e-fa4f-4de1-980a-454195442955")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnActivityData.Metadata.DefaultFlowDep());
    }

    @objid ("61f6ef25-f153-40f4-906d-5997c1142b5a")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnActivityData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("da6eea56-a813-4b51-8593-6fd071d5afb0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("722223bd-422d-4701-853e-c55606a905a1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d8962dc8-96ee-423d-bfa4-d3702db124af")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnActivity(this);
        else
          return null;
    }

}
