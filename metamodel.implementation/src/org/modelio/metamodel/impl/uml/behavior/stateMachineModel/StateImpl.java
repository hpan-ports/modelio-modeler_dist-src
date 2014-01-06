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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0053a458-c4bf-1fd8-97fe-001ec947cd2a")
public class StateImpl extends StateVertexImpl implements State {
    @objid ("babcfef5-5b2b-468e-aac0-5e838e53cc23")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateData.Metadata.ExitPointDep());
    }

    @objid ("c71c0803-b713-47cb-a026-c9ddfc4069b4")
    @Override
    public <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExitPointPseudoState element : getExitPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("07b3a359-9c97-4263-abe3-0f3944d5a8d2")
    @Override
    public EList<BpmnDataState> getBpmnDataStateRefs() {
        return new SmList<>(this, StateData.Metadata.BpmnDataStateRefsDep());
    }

    @objid ("dd158788-12ba-4936-94c1-447b7eaa1ce2")
    @Override
    public <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataState element : getBpmnDataStateRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("73e8133e-be27-4f59-b2c6-648cd9e2b3f1")
    @Override
    public EList<Event> getDeffered() {
        return new SmList<>(this, StateData.Metadata.DefferedDep());
    }

    @objid ("ccfcb6bb-b1b8-4550-ba49-1f9fb0bba093")
    @Override
    public <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getDeffered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("92477ae9-0ff7-4041-900e-d45aeb5fad0f")
    @Override
    public EList<InternalTransition> getInternal() {
        return new SmList<>(this, StateData.Metadata.InternalDep());
    }

    @objid ("19566b63-93d2-41d2-8047-1c408b412105")
    @Override
    public <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InternalTransition element : getInternal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("54fc95ba-9fdb-44e3-990e-fc61f07b3549")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateData.Metadata.EntryPointDep());
    }

    @objid ("4dadfa59-607e-4382-a0f8-b6cb14ca01a7")
    @Override
    public <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final EntryPointPseudoState element : getEntryPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("75cc9875-8643-44f9-9d50-0c789760a027")
    @Override
    public EList<Region> getOwnedRegion() {
        return new SmList<>(this, StateData.Metadata.OwnedRegionDep());
    }

    @objid ("a048a335-9718-4b5f-8298-ea9e4c230858")
    @Override
    public <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Region element : getOwnedRegion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4aced8a5-5ee9-49a8-ae3f-6c1d5e1346ee")
    @Override
    public EList<BpmnMessage> getRequiredStateOfBpmnMessage() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnMessageDep());
    }

    @objid ("d7995902-a37e-474d-b4d6-1dd7872e2e22")
    @Override
    public <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessage element : getRequiredStateOfBpmnMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("35810b6f-aef6-427f-80c8-41c2222be437")
    @Override
    public EList<ObjectNode> getRequiredStateOf() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfDep());
    }

    @objid ("4d72c528-80f9-4195-ac8b-f49b4316602b")
    @Override
    public <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRequiredStateOf()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("47e8ce14-d61b-4db1-8ff6-f140b9719cd0")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, StateData.Metadata.ConnectionDep());
    }

    @objid ("e1af2264-d088-4289-a0b7-ce1e484b5d05")
    @Override
    public <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ConnectionPointReference element : getConnection()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("570d3278-695c-4dfc-aec3-4815b1fa46b2")
    @Override
    public StateMachine getSubMachine() {
        return (StateMachine) getDepVal(StateData.Metadata.SubMachineDep());
    }

    @objid ("216b4263-a106-45fc-b070-ce40f7d917d4")
    @Override
    public void setSubMachine(StateMachine value) {
        appendDepVal(StateData.Metadata.SubMachineDep(), (SmObjectImpl)value);
    }

    @objid ("45f55464-65c4-4844-9b20-54331025f1ab")
    @Override
    public EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnItemDep());
    }

    @objid ("25586957-6cf9-4388-acf8-4568e16eaa6c")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getRequiredStateOfBpmnItem()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d60beace-d377-4079-9dbb-cb594d8fe543")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("af95e22d-b539-4484-950b-5a154d812a1c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("08d10b08-f75e-47f4-8f67-4956ff8f699a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitState(this);
        else
          return null;
    }

}
