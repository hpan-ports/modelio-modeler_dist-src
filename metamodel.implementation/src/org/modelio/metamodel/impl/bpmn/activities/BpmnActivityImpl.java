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
    @objid ("a89ebba0-7d7f-40fb-b9f2-63de75794ff1")
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) getAttVal(BpmnActivityData.Metadata.IsForCompensationAtt());
    }

    @objid ("a2d3d7a3-0f56-4c1b-b683-d7b43b2859f6")
    @Override
    public void setIsForCompensation(boolean value) {
        setAttVal(BpmnActivityData.Metadata.IsForCompensationAtt(), value);
    }

    @objid ("a4f0bb28-fdda-4a27-8596-42f3db86418e")
    @Override
    public int getStartQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.StartQuantityAtt());
    }

    @objid ("6b8fb984-3972-408d-95ff-fcc6a79c42e2")
    @Override
    public void setStartQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.StartQuantityAtt(), value);
    }

    @objid ("eb1f8057-52bc-4a24-8706-9288196b59c7")
    @Override
    public int getCompletionQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt());
    }

    @objid ("399b99c2-1266-483f-9f01-fc1eda40ff0f")
    @Override
    public void setCompletionQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt(), value);
    }

    @objid ("f826331b-2234-4888-801f-e9c629b6f2ad")
    @Override
    public EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions() {
        return new SmList<>(this, BpmnActivityData.Metadata.CompensateEventDefinitionsDep());
    }

    @objid ("5b838a09-1f57-4777-9859-147a0515cdda")
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

    @objid ("f8f7b9e2-de92-4689-a690-6ef1fead2be0")
    @Override
    public EList<BpmnDataInput> getInputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.InputSpecificationDep());
    }

    @objid ("e36fffac-6672-4f62-8ee0-fe28b7f6eb3b")
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

    @objid ("c2d5d2c0-0244-4704-9a48-21076d573612")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataInputAssociationDep());
    }

    @objid ("89eeb189-d72e-4218-9c8d-b1fa1efacd26")
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

    @objid ("856f7b7f-d552-4fd3-bc4e-4b7a3c4f5d33")
    @Override
    public EList<BpmnDataOutput> getOutputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.OutputSpecificationDep());
    }

    @objid ("c4ee0598-f921-474d-9cde-75799d61a558")
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

    @objid ("cf64d6c2-c674-4318-b6ec-8a68d63f4c14")
    @Override
    public BpmnLoopCharacteristics getLoopCharacteristics() {
        return (BpmnLoopCharacteristics) getDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep());
    }

    @objid ("11d78ef2-ff78-40f8-8a82-ddf8cb7b3b72")
    @Override
    public void setLoopCharacteristics(BpmnLoopCharacteristics value) {
        appendDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("089ef5b4-7551-49ef-8632-bfbe06257427")
    @Override
    public EList<BpmnBoundaryEvent> getBoundaryEventRef() {
        return new SmList<>(this, BpmnActivityData.Metadata.BoundaryEventRefDep());
    }

    @objid ("7309c3b3-28cc-46b5-a80a-c9c3add2540f")
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

    @objid ("d6a6930f-e57f-48e7-8814-b81c493a536e")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataOutputAssociationDep());
    }

    @objid ("9a057647-8581-460b-a715-71315b98da5a")
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

    @objid ("645e45cf-a0c3-44f0-be3e-a6c29a1aade7")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnActivityData.Metadata.DefaultFlowDep());
    }

    @objid ("05f9f336-272c-4e2e-8d84-134d5b6468ad")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnActivityData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("3198588f-121c-412a-9a4d-05d73fdda505")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9e1aa95e-8028-4014-b226-6ec39ee6ea00")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c082d174-779a-45ce-8bd1-e334b42bc5ea")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnActivity(this);
        else
          return null;
    }

}
