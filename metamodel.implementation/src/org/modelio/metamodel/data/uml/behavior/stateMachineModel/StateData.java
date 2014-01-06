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
    @objid ("76281d30-4392-496c-a5b7-11f9d13884a9")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("64021290-78ff-43ab-b572-f1230e0e6bc7")
    @SmaMetaAssociation(metaName="BpmnDataStateRefs", typeDataClass=BpmnDataStateData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnDataStateRefsSmDependency.class)
     List<SmObjectImpl> mBpmnDataStateRefs = null;

    @objid ("298f605e-506c-4ba2-b6eb-73906f9d839d")
    @SmaMetaAssociation(metaName="Deffered", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.DefferedSmDependency.class, partof = true)
     List<SmObjectImpl> mDeffered = null;

    @objid ("2d104131-640e-4325-a75c-b85b2ecda2f7")
    @SmaMetaAssociation(metaName="Internal", typeDataClass=InternalTransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InternalSmDependency.class, component = true)
     List<SmObjectImpl> mInternal = null;

    @objid ("5851ba01-0cb0-49c1-9c72-2c775faf8e3b")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("258b48e0-a51e-40ab-b3d8-52e511b5c4d7")
    @SmaMetaAssociation(metaName="OwnedRegion", typeDataClass=RegionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRegionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRegion = null;

    @objid ("34eaf19e-51fe-436c-98e9-bfe959edc93e")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnMessageSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnMessage = null;

    @objid ("8d24d204-05ce-495a-b605-c8518bd0dc6b")
    @SmaMetaAssociation(metaName="RequiredStateOf", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfSmDependency.class)
     List<SmObjectImpl> mRequiredStateOf = null;

    @objid ("2ebcc220-aa26-4db0-9970-e87038849789")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class, component = true)
     List<SmObjectImpl> mConnection = null;

    @objid ("8e0c71fb-9f76-47ff-8004-39180306bc0c")
    @SmaMetaAssociation(metaName="SubMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.SubMachineSmDependency.class, partof = true)
     SmObjectImpl mSubMachine;

    @objid ("5c91c4f6-598b-4f99-93cf-ac9f788b6c26")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnItemSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnItem = null;

    @objid ("37cebfa6-c3bd-49e1-9c54-605378fdb115")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00045592-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e755bc63-1692-472c-85f2-e28488cd853f")
        private static SmClass smClass = null;

        @objid ("252b5a4e-739e-4836-8d1b-92f690584fca")
        private static SmDependency ExitPointDep = null;

        @objid ("8083c345-b83b-4eac-bb6f-9ab9fad6d7ac")
        private static SmDependency BpmnDataStateRefsDep = null;

        @objid ("5dd7a48e-ce53-47c0-bdde-923d9ff94c45")
        private static SmDependency DefferedDep = null;

        @objid ("b9d0e0ed-4160-476c-abee-85d1d5f3b0c9")
        private static SmDependency InternalDep = null;

        @objid ("9c8dab3f-994c-4fe1-9b7f-37811a51308b")
        private static SmDependency EntryPointDep = null;

        @objid ("f0b58dba-8327-4c6c-ad45-0b4d0c94df92")
        private static SmDependency OwnedRegionDep = null;

        @objid ("481b65d6-8f7e-4699-a21f-8329fa198e1a")
        private static SmDependency RequiredStateOfBpmnMessageDep = null;

        @objid ("5922e3ef-96ca-4c4f-bd05-dc6cd94c1046")
        private static SmDependency RequiredStateOfDep = null;

        @objid ("0ad73f68-78ca-475e-b8e9-ed2be585fdac")
        private static SmDependency ConnectionDep = null;

        @objid ("d7e4edae-1fce-4f81-962f-ae8d2120319e")
        private static SmDependency SubMachineDep = null;

        @objid ("4935f23a-f81f-48ea-89eb-ab7b855f1d4d")
        private static SmDependency RequiredStateOfBpmnItemDep = null;

        @objid ("95935bc8-36e5-495d-95dd-d2f8f5cd8ac7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7ee4ddf8-ce19-49de-86d2-7bca51b18707")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("da5508e1-5a2b-43f7-aede-1d207f089623")
        public static SmDependency BpmnDataStateRefsDep() {
            if (BpmnDataStateRefsDep == null) {
            	BpmnDataStateRefsDep = classof().getDependencyDef("BpmnDataStateRefs");
            }
            return BpmnDataStateRefsDep;
        }

        @objid ("51832582-93ac-4048-a822-ae6807a3d269")
        public static SmDependency DefferedDep() {
            if (DefferedDep == null) {
            	DefferedDep = classof().getDependencyDef("Deffered");
            }
            return DefferedDep;
        }

        @objid ("67ee2d2a-7ea0-43e7-b3c5-bec1eb5ed30a")
        public static SmDependency InternalDep() {
            if (InternalDep == null) {
            	InternalDep = classof().getDependencyDef("Internal");
            }
            return InternalDep;
        }

        @objid ("339735e3-3e22-458f-bc2f-cc48ca63a361")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("0c53c4d3-8a05-4e6a-bc50-8321dfe5d938")
        public static SmDependency OwnedRegionDep() {
            if (OwnedRegionDep == null) {
            	OwnedRegionDep = classof().getDependencyDef("OwnedRegion");
            }
            return OwnedRegionDep;
        }

        @objid ("af153d18-93ed-47a6-bfed-bcf937968184")
        public static SmDependency RequiredStateOfBpmnMessageDep() {
            if (RequiredStateOfBpmnMessageDep == null) {
            	RequiredStateOfBpmnMessageDep = classof().getDependencyDef("RequiredStateOfBpmnMessage");
            }
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("2d3b6b76-1f72-4d6c-a618-ea97eeaf01dc")
        public static SmDependency RequiredStateOfDep() {
            if (RequiredStateOfDep == null) {
            	RequiredStateOfDep = classof().getDependencyDef("RequiredStateOf");
            }
            return RequiredStateOfDep;
        }

        @objid ("2a5f7d6c-4f0f-484c-a90b-9e122f7053f8")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("ed223538-269b-4017-babc-573c6395115f")
        public static SmDependency SubMachineDep() {
            if (SubMachineDep == null) {
            	SubMachineDep = classof().getDependencyDef("SubMachine");
            }
            return SubMachineDep;
        }

        @objid ("b4a35ea2-f5da-4083-8902-f654c2a3fb83")
        public static SmDependency RequiredStateOfBpmnItemDep() {
            if (RequiredStateOfBpmnItemDep == null) {
            	RequiredStateOfBpmnItemDep = classof().getDependencyDef("RequiredStateOfBpmnItem");
            }
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("633cf0a1-8597-4ae1-a64b-a1d74ad7cbce")
        public static SmDependency getRequiredStateOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfDep;
        }

        @objid ("e4a82a2c-1678-4922-ab88-e725195fe2ab")
        public static SmDependency getBpmnDataStateRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnDataStateRefsDep;
        }

        @objid ("e06c9dbd-eb4d-4125-b3d1-c3901eeedd4f")
        public static SmDependency getOwnedRegionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRegionDep;
        }

        @objid ("dd1d0a29-e71c-47ba-a1d4-7c9df00ae2fa")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("2765cae4-a451-41ae-90a3-a092ba84c52e")
        public static SmDependency getRequiredStateOfBpmnItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("57b8352c-fbd8-466c-8e9b-2f051e45e4ce")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("662bdd50-badb-45cf-9da3-f6f259b83bc3")
        public static SmDependency getRequiredStateOfBpmnMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("83f07bf7-51c3-433e-ad09-e895aa8614af")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("01a698e4-04d3-419a-80aa-0ddf348f628d")
        public static SmDependency getInternalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalDep;
        }

        @objid ("88ed73de-ce95-404b-acf7-02123a2d1d5e")
        public static SmDependency getSubMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubMachineDep;
        }

        @objid ("90d772b4-9db6-469f-ad3a-8cff4cd8677a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("43147da3-ecb7-4d24-a9c3-80b053dc3102")
        public static SmDependency getDefferedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefferedDep;
        }

        @objid ("000497f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f375f0ad-40dc-43f8-9e99-ec5c89e3c7e9")
            public ISmObjectData createData() {
                return new StateData();
            }

            @objid ("cf3c5e75-b721-498f-b311-a9bc9d8b9c10")
            public SmObjectImpl createImpl() {
                return new StateImpl();
            }

        }

        @objid ("000502b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("3fb9754f-4898-4a1e-8baf-de40dc8b1d49")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mConnection != null)? ((StateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("d9ee9e84-aebe-4dae-8371-a07357ee6135")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((StateData) data).mConnection;
            }

            @objid ("b6c3188f-38be-4b3d-9d20-a9a434726c6b")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.OwnerStateDep();
            }

        }

        @objid ("00056748-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefferedSmDependency extends SmMultipleDependency {
            @objid ("94f40037-2530-43d4-be97-95774369865b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mDeffered != null)? ((StateData)data).mDeffered:SmMultipleDependency.EMPTY;
            }

            @objid ("d47324d1-605e-4ecf-ba06-b56d848a312a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mDeffered = new ArrayList<>(initialCapacity);
                return ((StateData) data).mDeffered;
            }

            @objid ("3241ac09-116a-4d5b-ab43-ed8e5860a6fe")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.OriginDep();
            }

        }

        @objid ("0005caa8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InternalSmDependency extends SmMultipleDependency {
            @objid ("3b85d732-7340-4272-b060-aac986302cb2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mInternal != null)? ((StateData)data).mInternal:SmMultipleDependency.EMPTY;
            }

            @objid ("da7ab7d7-9a05-4bc0-bdb5-cd4c26ca6bf6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mInternal = new ArrayList<>(initialCapacity);
                return ((StateData) data).mInternal;
            }

            @objid ("feefa779-aefe-4e62-a214-664fe7bb862c")
            @Override
            public SmDependency getSymetric() {
                return InternalTransitionData.Metadata.SComposedDep();
            }

        }

        @objid ("000630a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedRegionSmDependency extends SmMultipleDependency {
            @objid ("25de338e-0038-4e76-ac47-36b237d1a753")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mOwnedRegion != null)? ((StateData)data).mOwnedRegion:SmMultipleDependency.EMPTY;
            }

            @objid ("3f432f36-7fb2-4e99-9eef-7c4a12d9ebc4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mOwnedRegion = new ArrayList<>(initialCapacity);
                return ((StateData) data).mOwnedRegion;
            }

            @objid ("29d0d846-bfd9-4c8f-9e69-e2d5f42c0686")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.ParentDep();
            }

        }

        @objid ("000695e6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubMachineSmDependency extends SmSingleDependency {
            @objid ("418e69c9-e1c5-4ed4-893f-2c0fbf2da61b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateData) data).mSubMachine;
            }

            @objid ("130b0bf9-b218-47a2-8cdc-4cf8bd89ce81")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateData) data).mSubMachine = value;
            }

            @objid ("49262983-fbd4-4f21-a6f5-1c56ddf35ae5")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.SubmachineStateDep();
            }

        }

        @objid ("00070e2c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfSmDependency extends SmMultipleDependency {
            @objid ("db2010e3-0206-44d8-8f77-3a8f2c228aa9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOf != null)? ((StateData)data).mRequiredStateOf:SmMultipleDependency.EMPTY;
            }

            @objid ("132e8a84-fb79-406f-9cab-23ac6a3da395")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOf = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOf;
            }

            @objid ("eadc4732-42fa-466a-9e8a-a7e4202fdf22")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.InStateDep();
            }

        }

        @objid ("000782da-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("cf2b975d-2b4f-4efe-9af0-2338b23511fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mEntryPoint != null)? ((StateData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("b1dc33d5-ca00-46dc-811a-d7dd1998797e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mEntryPoint;
            }

            @objid ("4d35995f-7cc5-4241-9a32-3bc1e64d5f1d")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfDep();
            }

        }

        @objid ("0007ed92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("eeeef92e-c6a2-4196-8a45-7c5f875ef214")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mExitPoint != null)? ((StateData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("0ae1753e-805d-4346-aff5-51bfb783b55f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mExitPoint;
            }

            @objid ("b4436ff9-7332-4109-b266-9d424a2d15e9")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfDep();
            }

        }

        @objid ("00085926-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnDataStateRefsSmDependency extends SmMultipleDependency {
            @objid ("7609c0dc-8efc-470e-a318-92c446e8113c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mBpmnDataStateRefs != null)? ((StateData)data).mBpmnDataStateRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("49b4c258-8c1a-4b66-bea1-a333f690f023")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mBpmnDataStateRefs = new ArrayList<>(initialCapacity);
                return ((StateData) data).mBpmnDataStateRefs;
            }

            @objid ("103db15a-7f74-4854-a5b0-bb87d59c93ca")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.UmlStateDep();
            }

        }

        @objid ("0008ca96-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnItemSmDependency extends SmMultipleDependency {
            @objid ("bd459662-aaef-46ad-820b-600cc98ebef1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnItem != null)? ((StateData)data).mRequiredStateOfBpmnItem:SmMultipleDependency.EMPTY;
            }

            @objid ("44a7429f-34f3-4c57-9a36-28e5a693b849")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnItem = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnItem;
            }

            @objid ("cc7f7962-53e5-4a7e-b6cc-9c71679592fb")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.InStateDep();
            }

        }

        @objid ("00093512-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnMessageSmDependency extends SmMultipleDependency {
            @objid ("6b6cba87-5792-4072-962b-7ea3a2243aab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnMessage != null)? ((StateData)data).mRequiredStateOfBpmnMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("e355a182-cd53-4b5c-b152-035d16e5dc64")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnMessage = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnMessage;
            }

            @objid ("2fe61612-bf90-4506-9fad-9ecb759da44d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InStateDep();
            }

        }

    }

}
