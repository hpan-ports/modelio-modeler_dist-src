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
    @objid ("d6ee3d53-e6cf-4513-aea1-9c3a8dd4918c")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateData.Metadata.ExitPointDep());
    }

    @objid ("0e6fabb5-b97b-4051-aaed-18337a147f9e")
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

    @objid ("6e830bf9-3dfd-493e-8b50-2f9bde49edb6")
    @Override
    public EList<BpmnDataState> getBpmnDataStateRefs() {
        return new SmList<>(this, StateData.Metadata.BpmnDataStateRefsDep());
    }

    @objid ("e1de7833-aa8e-4641-b833-d6021914aadb")
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

    @objid ("b12b9f7b-abc6-4134-80f9-1cdee58685c3")
    @Override
    public EList<Event> getDeffered() {
        return new SmList<>(this, StateData.Metadata.DefferedDep());
    }

    @objid ("d38da2d4-de91-4291-b142-a102756ac7f5")
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

    @objid ("fe7e181b-34eb-429a-8dbe-3a69bb05c12d")
    @Override
    public EList<InternalTransition> getInternal() {
        return new SmList<>(this, StateData.Metadata.InternalDep());
    }

    @objid ("1ebec3e2-79a9-4b4c-a74b-6725881f2657")
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

    @objid ("d1683864-2841-4356-98b9-7edd8625e4cc")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateData.Metadata.EntryPointDep());
    }

    @objid ("2e948c2f-6dfd-492c-9fa4-f9fb91fff301")
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

    @objid ("fdb7eda8-8922-4ec9-bc88-4931f684aead")
    @Override
    public EList<Region> getOwnedRegion() {
        return new SmList<>(this, StateData.Metadata.OwnedRegionDep());
    }

    @objid ("9728dd2a-cd22-41a1-adc4-733c7eba7442")
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

    @objid ("4a48efc7-3e21-49a9-bbb7-1b7a6a9878e8")
    @Override
    public EList<BpmnMessage> getRequiredStateOfBpmnMessage() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnMessageDep());
    }

    @objid ("42442888-b273-4c25-8912-43f7e53574ea")
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

    @objid ("60b76f20-437b-4899-be20-4469e38035a2")
    @Override
    public EList<ObjectNode> getRequiredStateOf() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfDep());
    }

    @objid ("20d054f5-dc7a-42fd-aedf-283fcd4908c4")
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

    @objid ("58c10257-071f-4274-ad4d-b808f4ec2edf")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, StateData.Metadata.ConnectionDep());
    }

    @objid ("3aad7fc9-01dc-43f5-addc-23990d51b674")
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

    @objid ("57f9aa71-8ca0-409d-a62b-0457a89e9837")
    @Override
    public StateMachine getSubMachine() {
        return (StateMachine) getDepVal(StateData.Metadata.SubMachineDep());
    }

    @objid ("04533aef-a849-4134-9050-cdd917b5b847")
    @Override
    public void setSubMachine(StateMachine value) {
        appendDepVal(StateData.Metadata.SubMachineDep(), (SmObjectImpl)value);
    }

    @objid ("bdaf7cf0-21ae-4fb9-9fbf-a94e5289113e")
    @Override
    public EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnItemDep());
    }

    @objid ("5e0feb7e-8a0a-4c79-b0fc-257caaed1006")
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

    @objid ("f373625a-3758-436b-83f3-bd7afe5c6121")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2eb92ad2-3d90-4d2a-a1cd-00233a593fe8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bd3c6451-103e-4802-b033-1aba91fe44cd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitState(this);
        else
          return null;
    }

}
