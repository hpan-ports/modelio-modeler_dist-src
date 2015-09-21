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
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStateSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.InternalTransitionSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0a274c48-b40b-4380-aa10-8a641668c3b0")
public class StateSmClass extends StateVertexSmClass {
    @objid ("975221fc-b2a3-42c1-a2bc-fce43e0f9a75")
    private SmDependency exitPointDep;

    @objid ("be7ad242-fe2d-4dc7-a025-994a066e6bed")
    private SmDependency bpmnDataStateRefsDep;

    @objid ("d4e2e059-75f2-43f3-93f8-69361a28eede")
    private SmDependency defferedDep;

    @objid ("3c0039bd-bdca-4d00-a27c-71815015e9ba")
    private SmDependency internalDep;

    @objid ("4b1a5bd3-99c0-42d3-b9a0-129aeaaa9d84")
    private SmDependency entryPointDep;

    @objid ("3f558ad0-3d8c-4abf-be19-1308479a0a03")
    private SmDependency ownedRegionDep;

    @objid ("d9c4b918-c753-4ac9-92e7-4819e3fb7298")
    private SmDependency requiredStateOfBpmnMessageDep;

    @objid ("d36fef05-d5aa-4b2f-9b44-3cedb13192cd")
    private SmDependency requiredStateOfDep;

    @objid ("0983ebe6-cd17-4165-9671-472d9cf4a070")
    private SmDependency connectionDep;

    @objid ("e129ea8b-b729-461b-b2c9-84f4c0f6ccca")
    private SmDependency subMachineDep;

    @objid ("dbf9610b-0d0f-4180-a641-1b031d2c95a3")
    private SmDependency requiredStateOfBpmnItemDep;

    @objid ("259e48e3-f82b-4196-832f-23ce906b9a56")
    public StateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d40daf0e-e740-47ce-833a-b6adf267ca3c")
    @Override
    public String getName() {
        return "State";
    }

    @objid ("d02f786c-9dba-4819-b75b-a15d088c1355")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("aa6222da-f0c7-4efb-9ab5-4dc75f024283")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return State.class;
    }

    @objid ("b8ac3e77-82a5-4a9e-bc88-32798d3c45cb")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("37c3d53b-3cb3-43d5-bb4d-609e6747c1bc")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("24107bb1-c5fc-4d45-9967-cef75ed78eba")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StateVertex");
        this.registerFactory(new StateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.exitPointDep = new ExitPointSmDependency();
        this.exitPointDep.init("ExitPoint", this, metamodel.getMClass("ExitPointPseudoState"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.exitPointDep);
        
        this.bpmnDataStateRefsDep = new BpmnDataStateRefsSmDependency();
        this.bpmnDataStateRefsDep.init("BpmnDataStateRefs", this, metamodel.getMClass("BpmnDataState"), 0, -1 );
        registerDependency(this.bpmnDataStateRefsDep);
        
        this.defferedDep = new DefferedSmDependency();
        this.defferedDep.init("Deffered", this, metamodel.getMClass("Event"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defferedDep);
        
        this.internalDep = new InternalSmDependency();
        this.internalDep.init("Internal", this, metamodel.getMClass("InternalTransition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.internalDep);
        
        this.entryPointDep = new EntryPointSmDependency();
        this.entryPointDep.init("EntryPoint", this, metamodel.getMClass("EntryPointPseudoState"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.entryPointDep);
        
        this.ownedRegionDep = new OwnedRegionSmDependency();
        this.ownedRegionDep.init("OwnedRegion", this, metamodel.getMClass("Region"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedRegionDep);
        
        this.requiredStateOfBpmnMessageDep = new RequiredStateOfBpmnMessageSmDependency();
        this.requiredStateOfBpmnMessageDep.init("RequiredStateOfBpmnMessage", this, metamodel.getMClass("BpmnMessage"), 0, -1 );
        registerDependency(this.requiredStateOfBpmnMessageDep);
        
        this.requiredStateOfDep = new RequiredStateOfSmDependency();
        this.requiredStateOfDep.init("RequiredStateOf", this, metamodel.getMClass("ObjectNode"), 0, -1 );
        registerDependency(this.requiredStateOfDep);
        
        this.connectionDep = new ConnectionSmDependency();
        this.connectionDep.init("Connection", this, metamodel.getMClass("ConnectionPointReference"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.connectionDep);
        
        this.subMachineDep = new SubMachineSmDependency();
        this.subMachineDep.init("SubMachine", this, metamodel.getMClass("StateMachine"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.subMachineDep);
        
        this.requiredStateOfBpmnItemDep = new RequiredStateOfBpmnItemSmDependency();
        this.requiredStateOfBpmnItemDep.init("RequiredStateOfBpmnItem", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 );
        registerDependency(this.requiredStateOfBpmnItemDep);
    }

    @objid ("eb3ed026-0fda-4172-ad0f-e5d177ce179d")
    public SmDependency getExitPointDep() {
        if (this.exitPointDep == null) {
        	this.exitPointDep = this.getDependencyDef("ExitPoint");
        }
        return this.exitPointDep;
    }

    @objid ("6e7b0e0a-b532-4a73-9bb7-d41a7030d876")
    public SmDependency getBpmnDataStateRefsDep() {
        if (this.bpmnDataStateRefsDep == null) {
        	this.bpmnDataStateRefsDep = this.getDependencyDef("BpmnDataStateRefs");
        }
        return this.bpmnDataStateRefsDep;
    }

    @objid ("25bbe546-c6bc-4e14-9e1b-9e4f2c6c8d83")
    public SmDependency getDefferedDep() {
        if (this.defferedDep == null) {
        	this.defferedDep = this.getDependencyDef("Deffered");
        }
        return this.defferedDep;
    }

    @objid ("570ab0fa-09bf-43b2-9137-7fda395f0a92")
    public SmDependency getInternalDep() {
        if (this.internalDep == null) {
        	this.internalDep = this.getDependencyDef("Internal");
        }
        return this.internalDep;
    }

    @objid ("cf454293-c8d7-439c-8232-2fd7f92e657e")
    public SmDependency getEntryPointDep() {
        if (this.entryPointDep == null) {
        	this.entryPointDep = this.getDependencyDef("EntryPoint");
        }
        return this.entryPointDep;
    }

    @objid ("59e1baeb-34e8-47f7-aab6-eab83ed3b163")
    public SmDependency getOwnedRegionDep() {
        if (this.ownedRegionDep == null) {
        	this.ownedRegionDep = this.getDependencyDef("OwnedRegion");
        }
        return this.ownedRegionDep;
    }

    @objid ("fe10da51-2830-493c-a7f1-59fa4c288e9e")
    public SmDependency getRequiredStateOfBpmnMessageDep() {
        if (this.requiredStateOfBpmnMessageDep == null) {
        	this.requiredStateOfBpmnMessageDep = this.getDependencyDef("RequiredStateOfBpmnMessage");
        }
        return this.requiredStateOfBpmnMessageDep;
    }

    @objid ("83c8a709-2374-4994-9c8d-12a65b914dd8")
    public SmDependency getRequiredStateOfDep() {
        if (this.requiredStateOfDep == null) {
        	this.requiredStateOfDep = this.getDependencyDef("RequiredStateOf");
        }
        return this.requiredStateOfDep;
    }

    @objid ("23ab48a8-8ff7-4b29-b58b-7c37ca43753d")
    public SmDependency getConnectionDep() {
        if (this.connectionDep == null) {
        	this.connectionDep = this.getDependencyDef("Connection");
        }
        return this.connectionDep;
    }

    @objid ("9483f419-5d53-40d7-b96e-bc5d9dc952e9")
    public SmDependency getSubMachineDep() {
        if (this.subMachineDep == null) {
        	this.subMachineDep = this.getDependencyDef("SubMachine");
        }
        return this.subMachineDep;
    }

    @objid ("2175e61d-87da-43f8-b9d8-4bcbd7653805")
    public SmDependency getRequiredStateOfBpmnItemDep() {
        if (this.requiredStateOfBpmnItemDep == null) {
        	this.requiredStateOfBpmnItemDep = this.getDependencyDef("RequiredStateOfBpmnItem");
        }
        return this.requiredStateOfBpmnItemDep;
    }

    @objid ("f4b0dec8-a857-456b-99e6-c65a008f6c53")
    private static class StateObjectFactory implements ISmObjectFactory {
        @objid ("2cdf76c5-ed4d-474b-b3b0-49e21ed55b31")
        private StateSmClass smClass;

        @objid ("a2bb2d89-b465-4ffb-a606-78af62ed3438")
        public StateObjectFactory(StateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9fd031df-4d56-4376-ab50-2802a4dbf057")
        @Override
        public ISmObjectData createData() {
            return new StateData(this.smClass);
        }

        @objid ("09291750-f664-49f4-b7db-e37a2b28a6d7")
        @Override
        public SmObjectImpl createImpl() {
            return new StateImpl();
        }

    }

    @objid ("93c26a9e-a3aa-4d90-b6d3-5a5390404dd2")
    public static class ExitPointSmDependency extends SmMultipleDependency {
        @objid ("cb3d4aa7-4bb2-45e9-ada5-134cae6ff3a2")
        private SmDependency symetricDep;

        @objid ("e6c56113-8599-4bc9-bf2f-c8fd6a931cae")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mExitPoint != null)? ((StateData)data).mExitPoint:SmMultipleDependency.EMPTY;
        }

        @objid ("0c4223e8-5ea7-4df7-be1d-b3b3ced95048")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mExitPoint = values;
        }

        @objid ("31c48d0a-4549-4223-9326-694989a5db98")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExitPointPseudoStateSmClass)this.getTarget()).getExitOfDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3c5e87f8-d130-4e41-baac-9509cc6cc478")
    public static class BpmnDataStateRefsSmDependency extends SmMultipleDependency {
        @objid ("409998bf-bb7b-4c70-98f6-55afae5a997c")
        private SmDependency symetricDep;

        @objid ("0ef58532-c150-43a2-a37c-45bb14fbb638")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mBpmnDataStateRefs != null)? ((StateData)data).mBpmnDataStateRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("4fbee5b4-ad4b-44b7-a9a8-d04e9d279474")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mBpmnDataStateRefs = values;
        }

        @objid ("4a199edb-e98f-45e8-9e46-f55a41090b88")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataStateSmClass)this.getTarget()).getUmlStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2edc9351-cbf0-405e-81c4-74c9ac5cb2d1")
    public static class DefferedSmDependency extends SmMultipleDependency {
        @objid ("9af65df1-6ff5-4fb8-a01f-590f502d169b")
        private SmDependency symetricDep;

        @objid ("e135802b-3f5b-40ba-bf36-826c29691d19")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mDeffered != null)? ((StateData)data).mDeffered:SmMultipleDependency.EMPTY;
        }

        @objid ("3033aacf-90df-4ee9-915b-f9b3475d7ce9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mDeffered = values;
        }

        @objid ("bbbc98c2-3812-4713-93dd-287cdb676658")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EventSmClass)this.getTarget()).getOriginDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("dab858c4-80e1-46a3-b122-08268fbf947e")
    public static class InternalSmDependency extends SmMultipleDependency {
        @objid ("f0a844ea-3c05-41e6-a701-cb8f439e4d68")
        private SmDependency symetricDep;

        @objid ("9649549c-36ea-4d72-bee5-e3513b4983b4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mInternal != null)? ((StateData)data).mInternal:SmMultipleDependency.EMPTY;
        }

        @objid ("7887a6bc-a289-4bb5-a1ac-daa5e842fed6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mInternal = values;
        }

        @objid ("cfb18382-afa2-4803-982e-8219f35800eb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InternalTransitionSmClass)this.getTarget()).getSComposedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("af7c9d2a-b51a-4e97-af76-747106e74ba4")
    public static class EntryPointSmDependency extends SmMultipleDependency {
        @objid ("49e7fba2-5f02-40b0-89b9-b0ae1d52a4ad")
        private SmDependency symetricDep;

        @objid ("ab251f17-bf76-4f60-84bc-2856bd58829c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mEntryPoint != null)? ((StateData)data).mEntryPoint:SmMultipleDependency.EMPTY;
        }

        @objid ("fc1efe41-76db-4ae1-ad61-c16d1df8f919")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mEntryPoint = values;
        }

        @objid ("2834be8b-6c3e-4847-ae91-3c60380669ba")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EntryPointPseudoStateSmClass)this.getTarget()).getEntryOfDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("058594e9-e90a-4f77-ae72-76ddf39c40cf")
    public static class OwnedRegionSmDependency extends SmMultipleDependency {
        @objid ("ab91c353-dfc3-46f1-8a57-7fbdd344b866")
        private SmDependency symetricDep;

        @objid ("fd05c1d0-7f39-4b53-ace4-e71d4e0a63c2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mOwnedRegion != null)? ((StateData)data).mOwnedRegion:SmMultipleDependency.EMPTY;
        }

        @objid ("5f7e015a-e2dc-456b-b670-a2b9793d2015")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mOwnedRegion = values;
        }

        @objid ("c665cdec-a941-486b-84d0-9c84e4ace849")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RegionSmClass)this.getTarget()).getParentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("38891de7-b639-4ae9-91bf-933491837f5d")
    public static class RequiredStateOfBpmnMessageSmDependency extends SmMultipleDependency {
        @objid ("3c438111-9d2c-4886-a66a-84f10ea7906b")
        private SmDependency symetricDep;

        @objid ("000141aa-4308-4012-ba0c-ea962588db60")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mRequiredStateOfBpmnMessage != null)? ((StateData)data).mRequiredStateOfBpmnMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("00daec8e-30d6-4f3c-97cc-2595d45f60ce")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mRequiredStateOfBpmnMessage = values;
        }

        @objid ("4498e2d1-cfb2-4fd3-98bd-1b6c446de094")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getInStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9cdd62ee-9cf4-429e-a80d-d9856a6d0884")
    public static class RequiredStateOfSmDependency extends SmMultipleDependency {
        @objid ("89e94769-fe9f-47d7-829e-4b151c756ff0")
        private SmDependency symetricDep;

        @objid ("3008c628-232a-48d5-8dac-194dcb8f2690")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mRequiredStateOf != null)? ((StateData)data).mRequiredStateOf:SmMultipleDependency.EMPTY;
        }

        @objid ("690721bd-93f8-40b2-ad45-ebf58b757d74")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mRequiredStateOf = values;
        }

        @objid ("90549995-8659-4c02-9e9b-db84cfccced8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getInStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("05a90d97-b805-4b7a-8096-32f3cd05e2b1")
    public static class ConnectionSmDependency extends SmMultipleDependency {
        @objid ("d928ddfb-3908-4f79-9a6c-6f063d8e08a6")
        private SmDependency symetricDep;

        @objid ("dc362e3b-fff2-45e6-8f87-c7537e62ff24")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mConnection != null)? ((StateData)data).mConnection:SmMultipleDependency.EMPTY;
        }

        @objid ("a0c3e4c8-c733-4c90-9187-172d3a948115")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mConnection = values;
        }

        @objid ("c527a9d5-dfc4-4944-9983-f225340e75a4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConnectionPointReferenceSmClass)this.getTarget()).getOwnerStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("304a9aa0-ecbd-45f3-a2b2-7975737990dd")
    public static class SubMachineSmDependency extends SmSingleDependency {
        @objid ("d3430551-0d26-41a2-aa0a-af6ab1925022")
        private SmDependency symetricDep;

        @objid ("b5545fc7-2a8d-4a17-9638-46987de06beb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StateData) data).mSubMachine;
        }

        @objid ("72e1610e-0030-492e-aa47-d617270ce6de")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StateData) data).mSubMachine = value;
        }

        @objid ("d9461312-b227-4487-848a-27c08ae613c8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateMachineSmClass)this.getTarget()).getSubmachineStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("290d350f-8111-4bf7-ba16-35a25c8b203b")
    public static class RequiredStateOfBpmnItemSmDependency extends SmMultipleDependency {
        @objid ("dee7e124-3804-4a24-aa6d-e829d352ceef")
        private SmDependency symetricDep;

        @objid ("5607a11d-1e20-49fa-80de-14712ec2274c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateData)data).mRequiredStateOfBpmnItem != null)? ((StateData)data).mRequiredStateOfBpmnItem:SmMultipleDependency.EMPTY;
        }

        @objid ("ec34203b-9c47-463b-928f-0e7859f5ee32")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateData) data).mRequiredStateOfBpmnItem = values;
        }

        @objid ("bc0076cc-6618-401b-85cb-4197eea5047d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getInStateDep();
            }
            return this.symetricDep;
        }

    }

}
