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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0053a458-c4bf-1fd8-97fe-001ec947cd2a")
public class StateImpl extends StateVertexImpl implements State {
    @objid ("35b32fbe-dbb5-4d12-af8b-5a46a49e4e5b")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getExitPointDep());
    }

    @objid ("ee1049e5-840b-4d76-acf3-c3783a425df2")
    @Override
    public <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExitPointPseudoState element : getExitPoint()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b4475bd7-5c74-4ef7-872a-49ea61747620")
    @Override
    public EList<BpmnDataState> getBpmnDataStateRefs() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getBpmnDataStateRefsDep());
    }

    @objid ("15446583-b4f4-4181-b3f2-f27bb066ba7d")
    @Override
    public <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataState element : getBpmnDataStateRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("24367756-49ee-4dad-bb7c-262ce825769b")
    @Override
    public EList<Event> getDeffered() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getDefferedDep());
    }

    @objid ("906a6c98-1d0f-471c-aa24-e4b09e83eb29")
    @Override
    public <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Event element : getDeffered()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2275b18d-1ea5-434c-b873-493d680d561b")
    @Override
    public EList<InternalTransition> getInternal() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getInternalDep());
    }

    @objid ("76d2b98d-feb9-4606-93b6-f87b06c4826a")
    @Override
    public <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InternalTransition element : getInternal()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("08ff71cb-4b4b-45fa-86e8-da897608903a")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getEntryPointDep());
    }

    @objid ("183b22c9-51d7-44ea-aeb1-05b2c5d043a7")
    @Override
    public <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final EntryPointPseudoState element : getEntryPoint()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7c8961ae-6358-41a3-8072-9f87ca52856e")
    @Override
    public EList<Region> getOwnedRegion() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getOwnedRegionDep());
    }

    @objid ("404d894e-a129-4a6b-98c9-4c56ccbb2374")
    @Override
    public <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Region element : getOwnedRegion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("46215e23-fc78-4f45-82c8-ae83301e3ae4")
    @Override
    public EList<BpmnMessage> getRequiredStateOfBpmnMessage() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getRequiredStateOfBpmnMessageDep());
    }

    @objid ("f90626aa-5a78-4ede-9afe-5e65dc2e4088")
    @Override
    public <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessage element : getRequiredStateOfBpmnMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a6797212-c410-4c14-9655-8c6943c35e09")
    @Override
    public EList<ObjectNode> getRequiredStateOf() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getRequiredStateOfDep());
    }

    @objid ("18e10383-187c-457a-8147-54af730c6fb5")
    @Override
    public <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ObjectNode element : getRequiredStateOf()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3ce044c6-e82c-43ee-b74f-18ca8c296f69")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getConnectionDep());
    }

    @objid ("876765a4-d8f3-44c9-a1d6-91c73bbfb5a6")
    @Override
    public <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ConnectionPointReference element : getConnection()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("999fcc47-b3e5-45f9-953c-aa03ab1e71f2")
    @Override
    public StateMachine getSubMachine() {
        Object obj = getDepVal(((StateSmClass)getClassOf()).getSubMachineDep());
        return (obj instanceof StateMachine)? (StateMachine)obj : null;
    }

    @objid ("e04b3fef-505b-4b8c-a315-33cb56ef9dd0")
    @Override
    public void setSubMachine(StateMachine value) {
        appendDepVal(((StateSmClass)getClassOf()).getSubMachineDep(), (SmObjectImpl)value);
    }

    @objid ("808cea66-54e5-4ff3-8f9f-f85177bb9d52")
    @Override
    public EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem() {
        return new SmList<>(this, ((StateSmClass)getClassOf()).getRequiredStateOfBpmnItemDep());
    }

    @objid ("95a04153-5f9c-4c88-9513-a43bd5fb5287")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemAwareElement element : getRequiredStateOfBpmnItem()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("94fed3b1-96ac-4ad7-a736-54d0577582d5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a0a25720-4563-48b1-8801-0c206d56b2e9")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("c0694b05-5932-4609-8b4a-051337a10c16")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitState(this);
        else
          return null;
    }

}
