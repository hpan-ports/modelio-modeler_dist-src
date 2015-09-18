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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.InternalTransitionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0053d27a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=State.class, factory=StateData.Metadata.ObjectFactory.class)
public class StateData extends StateVertexData {
    @objid ("8c4cf369-ce2b-42c4-a9c5-55da701a4e6a")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("98bdc880-cbef-42ab-8717-b33c159b2530")
    @SmaMetaAssociation(metaName="BpmnDataStateRefs", typeDataClass=BpmnDataStateData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnDataStateRefsSmDependency.class)
     List<SmObjectImpl> mBpmnDataStateRefs = null;

    @objid ("a6736e01-9a9f-4a80-b3e1-12b60bad6f19")
    @SmaMetaAssociation(metaName="Deffered", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.DefferedSmDependency.class, partof = true)
     List<SmObjectImpl> mDeffered = null;

    @objid ("dce4a47b-3d75-40da-8d91-5bb26c8053d4")
    @SmaMetaAssociation(metaName="Internal", typeDataClass=InternalTransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InternalSmDependency.class, component = true)
     List<SmObjectImpl> mInternal = null;

    @objid ("8d2af16c-c536-42e0-a63a-b5f39b7a98d0")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("25cd2cb4-f4ae-445b-8da5-28b6cef70862")
    @SmaMetaAssociation(metaName="OwnedRegion", typeDataClass=RegionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRegionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRegion = null;

    @objid ("e46aab20-fcd4-45a8-814c-228027474cde")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnMessageSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnMessage = null;

    @objid ("a1c9cf78-b80a-42fc-b3d7-00ff8f36c50c")
    @SmaMetaAssociation(metaName="RequiredStateOf", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfSmDependency.class)
     List<SmObjectImpl> mRequiredStateOf = null;

    @objid ("547033ce-f163-42f0-b4b9-f85b71a463e9")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class, component = true)
     List<SmObjectImpl> mConnection = null;

    @objid ("cc228285-ff18-4cf9-af9a-8e492841488e")
    @SmaMetaAssociation(metaName="SubMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.SubMachineSmDependency.class, partof = true)
     SmObjectImpl mSubMachine;

    @objid ("a74559da-68bf-44a2-be55-1df2d66ce102")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnItemSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnItem = null;

    @objid ("c554f67a-345e-48b0-945a-2482a6d8ed05")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00045592-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8109a7d3-edba-4cd0-a0e9-03e8824aeed3")
        private static SmClass smClass = null;

        @objid ("190f1656-8958-42a4-8099-8278d8d17689")
        private static SmDependency ExitPointDep = null;

        @objid ("7fad6ede-618e-4132-b0ff-1547872a856c")
        private static SmDependency BpmnDataStateRefsDep = null;

        @objid ("db7aa0cc-01e8-41d1-9932-c0fbaab1fc31")
        private static SmDependency DefferedDep = null;

        @objid ("7edcc807-4d0a-4148-9075-d5006d8d2262")
        private static SmDependency InternalDep = null;

        @objid ("17a29694-5505-4f55-bdea-98333711faf9")
        private static SmDependency EntryPointDep = null;

        @objid ("8db95c13-7799-4b1e-a268-051441f82272")
        private static SmDependency OwnedRegionDep = null;

        @objid ("30881cdd-b47f-4b6d-9c7a-75194943b94e")
        private static SmDependency RequiredStateOfBpmnMessageDep = null;

        @objid ("d7928a23-f4fb-4dec-aaaa-2c920b047df2")
        private static SmDependency RequiredStateOfDep = null;

        @objid ("635e2e49-f707-43e1-b91f-546047759c83")
        private static SmDependency ConnectionDep = null;

        @objid ("0c798549-1d4d-43b5-9cc6-034546386f00")
        private static SmDependency SubMachineDep = null;

        @objid ("e9e03b07-706b-4b9f-908b-aa1616680a15")
        private static SmDependency RequiredStateOfBpmnItemDep = null;

        @objid ("cd2f6425-3d1c-498d-98ae-b53ec7455745")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f223ab16-9941-4671-8f45-6932c822a161")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("ba1222d7-5a1d-4cd8-9f8b-ca7742c33704")
        public static SmDependency BpmnDataStateRefsDep() {
            if (BpmnDataStateRefsDep == null) {
            	BpmnDataStateRefsDep = classof().getDependencyDef("BpmnDataStateRefs");
            }
            return BpmnDataStateRefsDep;
        }

        @objid ("1c3dc672-9450-439a-8bb6-582b44961273")
        public static SmDependency DefferedDep() {
            if (DefferedDep == null) {
            	DefferedDep = classof().getDependencyDef("Deffered");
            }
            return DefferedDep;
        }

        @objid ("b33b50e4-69f0-49c5-b96a-0cef89124455")
        public static SmDependency InternalDep() {
            if (InternalDep == null) {
            	InternalDep = classof().getDependencyDef("Internal");
            }
            return InternalDep;
        }

        @objid ("1394a51d-c1db-40ea-b86e-cf53666405da")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("94f5d8ac-29a7-42dc-82a8-061b8b2262f1")
        public static SmDependency OwnedRegionDep() {
            if (OwnedRegionDep == null) {
            	OwnedRegionDep = classof().getDependencyDef("OwnedRegion");
            }
            return OwnedRegionDep;
        }

        @objid ("d7ed1393-6717-4733-a4b3-e6efae9f1b65")
        public static SmDependency RequiredStateOfBpmnMessageDep() {
            if (RequiredStateOfBpmnMessageDep == null) {
            	RequiredStateOfBpmnMessageDep = classof().getDependencyDef("RequiredStateOfBpmnMessage");
            }
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("b028b080-89ce-4764-ac18-0ae8a22a729b")
        public static SmDependency RequiredStateOfDep() {
            if (RequiredStateOfDep == null) {
            	RequiredStateOfDep = classof().getDependencyDef("RequiredStateOf");
            }
            return RequiredStateOfDep;
        }

        @objid ("5aeb1bf0-024b-449e-9c95-0e9e2a8be1a4")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("c6600db7-4847-41b5-8987-324dd005b7d7")
        public static SmDependency SubMachineDep() {
            if (SubMachineDep == null) {
            	SubMachineDep = classof().getDependencyDef("SubMachine");
            }
            return SubMachineDep;
        }

        @objid ("cfc6a32b-119b-4dde-9cdf-e140a887ea87")
        public static SmDependency RequiredStateOfBpmnItemDep() {
            if (RequiredStateOfBpmnItemDep == null) {
            	RequiredStateOfBpmnItemDep = classof().getDependencyDef("RequiredStateOfBpmnItem");
            }
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("7bf2b979-9330-4785-9fdd-adfa5aff02ff")
        public static SmDependency getInternalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalDep;
        }

        @objid ("89a1a04a-41c6-4dd1-8039-ad0dbed87ec9")
        public static SmDependency getRequiredStateOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfDep;
        }

        @objid ("c1e868a2-7f11-4eaa-85ab-e1befe2c53cd")
        public static SmDependency getRequiredStateOfBpmnItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("07b6da03-293d-489c-9487-8e7bff656f4f")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("3ae72ca4-d6bb-4ab2-9721-b5cf51706fe3")
        public static SmDependency getSubMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubMachineDep;
        }

        @objid ("78af8562-5650-4eeb-9b86-1ce74fef0a6d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3ce4b6ee-70fc-496b-bac2-0aec58ccfa7a")
        public static SmDependency getRequiredStateOfBpmnMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("a58e48b0-d3a1-4e90-ab3c-d5ea6f4ed021")
        public static SmDependency getDefferedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefferedDep;
        }

        @objid ("db819f06-4dbc-4a05-88eb-5dd0ad1565ff")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("d1205e7a-1d59-48e8-b41e-7f8347c9b328")
        public static SmDependency getOwnedRegionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRegionDep;
        }

        @objid ("cd04c13f-c84a-48c4-94ec-af464ce3eba9")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("66cb6d7c-9750-4566-ad8c-e698aae1dc52")
        public static SmDependency getBpmnDataStateRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnDataStateRefsDep;
        }

        @objid ("000497f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("25aa1d02-db23-4299-b4a8-bf84918be6b9")
            public ISmObjectData createData() {
                return new StateData();
            }

            @objid ("4944f4cb-c3ac-40e6-888e-a481c0a84564")
            public SmObjectImpl createImpl() {
                return new StateImpl();
            }

        }

        @objid ("000502b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("64521266-4a52-4888-a5f6-e358f52122d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mConnection != null)? ((StateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("c99b91aa-4f01-47dd-b81e-f04b5f8af09c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((StateData) data).mConnection;
            }

            @objid ("5a611782-62b0-4764-b882-1467247cca38")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.OwnerStateDep();
            }

        }

        @objid ("00056748-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefferedSmDependency extends SmMultipleDependency {
            @objid ("f9fde855-5c8a-46d0-848c-409326785ed4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mDeffered != null)? ((StateData)data).mDeffered:SmMultipleDependency.EMPTY;
            }

            @objid ("441b201b-87f9-4811-9b29-bb276d3ecbd9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mDeffered = new ArrayList<>(initialCapacity);
                return ((StateData) data).mDeffered;
            }

            @objid ("9af33287-28af-42b6-bfbb-3a3e9a495065")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.OriginDep();
            }

        }

        @objid ("0005caa8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InternalSmDependency extends SmMultipleDependency {
            @objid ("baeb9661-9331-4ce9-9739-4a1be6a26091")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mInternal != null)? ((StateData)data).mInternal:SmMultipleDependency.EMPTY;
            }

            @objid ("32ac02a6-d6ec-4923-9f78-825d9a82b16b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mInternal = new ArrayList<>(initialCapacity);
                return ((StateData) data).mInternal;
            }

            @objid ("b656bf42-08ec-424a-a34a-7f0dc0a08231")
            @Override
            public SmDependency getSymetric() {
                return InternalTransitionData.Metadata.SComposedDep();
            }

        }

        @objid ("000630a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedRegionSmDependency extends SmMultipleDependency {
            @objid ("ddc7e11a-ed7e-4787-8c02-3229c4c89009")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mOwnedRegion != null)? ((StateData)data).mOwnedRegion:SmMultipleDependency.EMPTY;
            }

            @objid ("72545c6a-7ad9-411c-b760-e2094b8b805b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mOwnedRegion = new ArrayList<>(initialCapacity);
                return ((StateData) data).mOwnedRegion;
            }

            @objid ("4a42597b-45c1-48d7-b1a7-e06939fd5ac4")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.ParentDep();
            }

        }

        @objid ("000695e6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubMachineSmDependency extends SmSingleDependency {
            @objid ("32f0fe23-4d67-49c6-9a9f-bb6ea42e62a5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateData) data).mSubMachine;
            }

            @objid ("58ec48ea-c70e-4fd1-b4d1-8f503745c6ec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateData) data).mSubMachine = value;
            }

            @objid ("aabb90bd-39d9-4e59-b019-31d93e5e54bd")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.SubmachineStateDep();
            }

        }

        @objid ("00070e2c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfSmDependency extends SmMultipleDependency {
            @objid ("43509eda-6851-4ff4-932b-c7c4d22b488b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOf != null)? ((StateData)data).mRequiredStateOf:SmMultipleDependency.EMPTY;
            }

            @objid ("dbc4dcd3-6c59-46c5-a4ec-af832e171746")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOf = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOf;
            }

            @objid ("c13d9533-f86e-460d-ac79-ce2c223ab25f")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.InStateDep();
            }

        }

        @objid ("000782da-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("972b4923-072b-4c71-97b0-e3fc1c6fbb3d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mEntryPoint != null)? ((StateData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("65a07022-f86f-41a9-9df4-36706d63dd13")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mEntryPoint;
            }

            @objid ("76bb781a-27e1-4dd2-a1d5-c1df8ad3b335")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfDep();
            }

        }

        @objid ("0007ed92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("bd2f7c24-1855-4e8d-8a8e-2ebd87921607")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mExitPoint != null)? ((StateData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("76d7fd43-803a-4fb7-b246-001a80c7dc93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mExitPoint;
            }

            @objid ("c7b595f4-219c-48a1-8ef7-7e05be35c986")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfDep();
            }

        }

        @objid ("00085926-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnDataStateRefsSmDependency extends SmMultipleDependency {
            @objid ("a5ba16b4-f5a9-4633-9a8d-1222ae7890e1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mBpmnDataStateRefs != null)? ((StateData)data).mBpmnDataStateRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("2dbf76a7-7358-4ca4-846d-e8b4553e3895")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mBpmnDataStateRefs = new ArrayList<>(initialCapacity);
                return ((StateData) data).mBpmnDataStateRefs;
            }

            @objid ("863033b4-1352-41c3-94f0-d1c28ea79a63")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.UmlStateDep();
            }

        }

        @objid ("0008ca96-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnItemSmDependency extends SmMultipleDependency {
            @objid ("e2eea1fa-7bd2-45de-9b4c-bd636e78bb70")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnItem != null)? ((StateData)data).mRequiredStateOfBpmnItem:SmMultipleDependency.EMPTY;
            }

            @objid ("193eeb16-6093-4507-a083-f50443d59586")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnItem = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnItem;
            }

            @objid ("0c1755da-98cd-47f4-99ac-35142d151b7f")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.InStateDep();
            }

        }

        @objid ("00093512-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnMessageSmDependency extends SmMultipleDependency {
            @objid ("fa80ce30-bbb7-4c11-a5d9-0e2f763715b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnMessage != null)? ((StateData)data).mRequiredStateOfBpmnMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("927a47d9-e49a-44b7-bde4-c448bd55c4d5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnMessage = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnMessage;
            }

            @objid ("56e0e21a-e97f-4440-9c04-fd033626c405")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InStateDep();
            }

        }

    }

}
