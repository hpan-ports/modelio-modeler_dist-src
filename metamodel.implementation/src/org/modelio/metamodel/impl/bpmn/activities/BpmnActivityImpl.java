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
    @objid ("20e64736-42f6-4fd7-917e-6c30de3a343d")
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) getAttVal(BpmnActivityData.Metadata.IsForCompensationAtt());
    }

    @objid ("ae5d7fc7-ac23-4236-91a8-84c12d6e1ba6")
    @Override
    public void setIsForCompensation(boolean value) {
        setAttVal(BpmnActivityData.Metadata.IsForCompensationAtt(), value);
    }

    @objid ("cc729565-c2b4-4c8a-94b5-2552d94d478b")
    @Override
    public int getStartQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.StartQuantityAtt());
    }

    @objid ("276ab9a6-8f55-41fa-8aac-d9f2952fd693")
    @Override
    public void setStartQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.StartQuantityAtt(), value);
    }

    @objid ("d90a333b-48a6-47bc-9a6e-9b0d4002a62f")
    @Override
    public int getCompletionQuantity() {
        return (Integer) getAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt());
    }

    @objid ("e74eb5c1-e833-444d-9b4e-ba79b161278f")
    @Override
    public void setCompletionQuantity(int value) {
        setAttVal(BpmnActivityData.Metadata.CompletionQuantityAtt(), value);
    }

    @objid ("c8382dd1-2523-4588-ac07-7b673834c859")
    @Override
    public EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions() {
        return new SmList<>(this, BpmnActivityData.Metadata.CompensateEventDefinitionsDep());
    }

    @objid ("944a9d6c-7ef3-451c-9da7-e8f71087ed6f")
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

    @objid ("f21bf07b-691c-42e4-bb71-2a1459cc18c6")
    @Override
    public EList<BpmnDataInput> getInputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.InputSpecificationDep());
    }

    @objid ("bc1afa56-36f5-48ba-81b2-e6746deeae41")
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

    @objid ("0939b112-2597-4247-b2bf-d02aacd7e772")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataInputAssociationDep());
    }

    @objid ("8b708eac-3511-455c-abe5-701e4da8183e")
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

    @objid ("7fcbd68b-4a49-4104-806d-f5a00ee98339")
    @Override
    public EList<BpmnDataOutput> getOutputSpecification() {
        return new SmList<>(this, BpmnActivityData.Metadata.OutputSpecificationDep());
    }

    @objid ("149389ed-4e09-438d-9411-620d6b0dab0b")
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

    @objid ("ce569abc-4c54-42e7-bf92-5146c6307369")
    @Override
    public BpmnLoopCharacteristics getLoopCharacteristics() {
        return (BpmnLoopCharacteristics) getDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep());
    }

    @objid ("ce3ce961-501e-4098-9e95-8c2148f9acb7")
    @Override
    public void setLoopCharacteristics(BpmnLoopCharacteristics value) {
        appendDepVal(BpmnActivityData.Metadata.LoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("cf302843-b410-4d97-b577-8b20c5a4c72b")
    @Override
    public EList<BpmnBoundaryEvent> getBoundaryEventRef() {
        return new SmList<>(this, BpmnActivityData.Metadata.BoundaryEventRefDep());
    }

    @objid ("a3b35672-db6b-4621-bab1-e4bcbc8285a3")
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

    @objid ("5377255e-d5b1-4e98-b4c5-43ead9c9ef10")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnActivityData.Metadata.DataOutputAssociationDep());
    }

    @objid ("871f9144-64b6-4370-b81f-3165047bc7be")
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

    @objid ("677eb9f9-2614-4726-9802-e3765282e674")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnActivityData.Metadata.DefaultFlowDep());
    }

    @objid ("f67c6a28-f12e-4f2d-bd58-b60aa3cfb5cf")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnActivityData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("7595aef2-1460-4b77-886b-eb07b140646b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9a9df31e-603d-45f2-9de6-3199a05fe890")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9812398a-6899-445d-a555-ed6e3ec21f2c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnActivity(this);
        else
          return null;
    }

}
