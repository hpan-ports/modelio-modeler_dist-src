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
    @objid ("5fd79acf-cb2e-4442-9f90-9203aba6807f")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateData.Metadata.ExitPointDep());
    }

    @objid ("630e57c8-2bae-43ba-869e-0b523d9495f6")
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

    @objid ("7e45a8eb-d35d-4d69-a32b-d3c7f261a51a")
    @Override
    public EList<BpmnDataState> getBpmnDataStateRefs() {
        return new SmList<>(this, StateData.Metadata.BpmnDataStateRefsDep());
    }

    @objid ("2c6d3f78-a45a-41d8-aacd-4142cf71bc38")
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

    @objid ("281faceb-001c-47c7-ada1-ceea159efa0d")
    @Override
    public EList<Event> getDeffered() {
        return new SmList<>(this, StateData.Metadata.DefferedDep());
    }

    @objid ("a8b33487-06f2-403a-8aa2-4631c5e824df")
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

    @objid ("3702e0ce-abc0-4038-bc5f-ec40343b5cc4")
    @Override
    public EList<InternalTransition> getInternal() {
        return new SmList<>(this, StateData.Metadata.InternalDep());
    }

    @objid ("132e46e1-8705-4cfe-a9e8-5e3748ae67f4")
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

    @objid ("c7225da3-a2f6-4d68-9813-b99bb7d261f9")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateData.Metadata.EntryPointDep());
    }

    @objid ("9887ca04-c244-43ff-a259-05402d551d4a")
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

    @objid ("1dc31db2-6a5d-4a26-be29-3a4817838ced")
    @Override
    public EList<Region> getOwnedRegion() {
        return new SmList<>(this, StateData.Metadata.OwnedRegionDep());
    }

    @objid ("4bae2755-e56d-45f2-b817-66170aec73ee")
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

    @objid ("d23be19a-8fdf-47f7-bc6a-490188e5a4a7")
    @Override
    public EList<BpmnMessage> getRequiredStateOfBpmnMessage() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnMessageDep());
    }

    @objid ("5cc05a80-4c42-4a8a-bee4-0c8c81ad3ba9")
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

    @objid ("28e02c3a-85d4-4bbd-87b8-c823ef4b6a51")
    @Override
    public EList<ObjectNode> getRequiredStateOf() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfDep());
    }

    @objid ("ecc2eab4-06ab-4000-9e74-a8b3ec5b1148")
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

    @objid ("ccf4e902-4dc4-46f0-b332-b95c90df7ce8")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, StateData.Metadata.ConnectionDep());
    }

    @objid ("6aae40e5-e125-4933-9155-317d1b371beb")
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

    @objid ("3f4e6b13-c6e9-4b1f-8983-8ff1a811328e")
    @Override
    public StateMachine getSubMachine() {
        return (StateMachine) getDepVal(StateData.Metadata.SubMachineDep());
    }

    @objid ("f62136d5-054a-4988-a18c-8780e9ffd039")
    @Override
    public void setSubMachine(StateMachine value) {
        appendDepVal(StateData.Metadata.SubMachineDep(), (SmObjectImpl)value);
    }

    @objid ("644aab0b-e988-4f90-b548-7637595a7314")
    @Override
    public EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem() {
        return new SmList<>(this, StateData.Metadata.RequiredStateOfBpmnItemDep());
    }

    @objid ("4f59f872-b016-4e2b-8cc6-6e5f174a496a")
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

    @objid ("9984c89e-a139-4a77-8e7a-6aef8d65299d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d871e6c0-775a-4fb1-a8af-dce16f89de57")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4fb972e6-1af1-4e74-8738-4193f8110bd0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitState(this);
        else
          return null;
    }

}
