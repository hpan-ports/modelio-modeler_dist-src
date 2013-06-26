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
    @objid ("f87792ac-1d87-45ac-ab04-5e9fc6968ae8")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("d6e931ee-11c5-49a6-9fa6-891d34f3c504")
    @SmaMetaAssociation(metaName="BpmnDataStateRefs", typeDataClass=BpmnDataStateData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnDataStateRefsSmDependency.class)
     List<SmObjectImpl> mBpmnDataStateRefs = null;

    @objid ("24b5ce99-4567-482f-89cf-c07b6b41ad7c")
    @SmaMetaAssociation(metaName="Deffered", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.DefferedSmDependency.class, partof = true)
     List<SmObjectImpl> mDeffered = null;

    @objid ("e1c86401-b3fb-4daf-9407-35792da2f8c4")
    @SmaMetaAssociation(metaName="Internal", typeDataClass=InternalTransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InternalSmDependency.class, component = true)
     List<SmObjectImpl> mInternal = null;

    @objid ("37bed67c-23ed-48ee-aad8-67000dead3a9")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("98b797de-7b86-4b9d-8f43-c0fd270d3e70")
    @SmaMetaAssociation(metaName="OwnedRegion", typeDataClass=RegionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedRegionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedRegion = null;

    @objid ("89881fa8-6a44-4178-9103-919e50f21b7b")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnMessageSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnMessage = null;

    @objid ("e4aea677-ccbf-4594-bc48-79e739580bfb")
    @SmaMetaAssociation(metaName="RequiredStateOf", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfSmDependency.class)
     List<SmObjectImpl> mRequiredStateOf = null;

    @objid ("2f35890a-0739-4598-8e0c-c35d1170f027")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class, component = true)
     List<SmObjectImpl> mConnection = null;

    @objid ("0dd0701c-6f04-4338-89a5-f530f35c4e08")
    @SmaMetaAssociation(metaName="SubMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.SubMachineSmDependency.class, partof = true)
     SmObjectImpl mSubMachine;

    @objid ("6a88a326-2449-4698-8add-8a0b424349a8")
    @SmaMetaAssociation(metaName="RequiredStateOfBpmnItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredStateOfBpmnItemSmDependency.class)
     List<SmObjectImpl> mRequiredStateOfBpmnItem = null;

    @objid ("108eb9ad-137d-4933-9fd5-40a2076623a2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00045592-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("33396ea7-69be-411c-9666-65eaded7f7ff")
        private static SmClass smClass = null;

        @objid ("323c04f5-f36f-473d-b71c-1412a23499fc")
        private static SmDependency ExitPointDep = null;

        @objid ("f5c196a4-6ee7-47b2-a844-ade36285dc8c")
        private static SmDependency BpmnDataStateRefsDep = null;

        @objid ("4e4dd2cc-e31e-49da-973a-1dd24a6c775c")
        private static SmDependency DefferedDep = null;

        @objid ("92933fab-1ed2-4fde-8c97-7b3c15946124")
        private static SmDependency InternalDep = null;

        @objid ("96ef3f14-beee-4ca1-87c3-ae124027531b")
        private static SmDependency EntryPointDep = null;

        @objid ("29e8b620-df7f-43f0-b1b9-5260c3cdb630")
        private static SmDependency OwnedRegionDep = null;

        @objid ("d402bd2f-b43b-4cbc-86df-6e8bc75692ca")
        private static SmDependency RequiredStateOfBpmnMessageDep = null;

        @objid ("36da1dd3-ac30-41a7-b6da-3ca5ab47792e")
        private static SmDependency RequiredStateOfDep = null;

        @objid ("f2bace7c-b8c9-4341-99ec-2744df8fdde2")
        private static SmDependency ConnectionDep = null;

        @objid ("44372b3b-9fc4-4799-a35b-0ac8e50502a6")
        private static SmDependency SubMachineDep = null;

        @objid ("674c8cf4-d226-40a9-b9b8-5354b4e3af44")
        private static SmDependency RequiredStateOfBpmnItemDep = null;

        @objid ("4d50b15d-14ec-4de3-9198-b29a1c20a54f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e342d25d-5493-43ee-8870-dfb2ed6afc75")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("c8c1d315-13e0-4360-9b93-d9bd23b7e6e5")
        public static SmDependency BpmnDataStateRefsDep() {
            if (BpmnDataStateRefsDep == null) {
            	BpmnDataStateRefsDep = classof().getDependencyDef("BpmnDataStateRefs");
            }
            return BpmnDataStateRefsDep;
        }

        @objid ("e41585ab-7a25-4bec-a77c-d15e0971d66d")
        public static SmDependency DefferedDep() {
            if (DefferedDep == null) {
            	DefferedDep = classof().getDependencyDef("Deffered");
            }
            return DefferedDep;
        }

        @objid ("715f1340-ad45-42ae-ae07-61e045ae4937")
        public static SmDependency InternalDep() {
            if (InternalDep == null) {
            	InternalDep = classof().getDependencyDef("Internal");
            }
            return InternalDep;
        }

        @objid ("0b788c49-776e-43ce-933d-7c3278570d2a")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("89db6179-210a-456e-ab72-4f48dd863084")
        public static SmDependency OwnedRegionDep() {
            if (OwnedRegionDep == null) {
            	OwnedRegionDep = classof().getDependencyDef("OwnedRegion");
            }
            return OwnedRegionDep;
        }

        @objid ("0b6ed234-70dd-4758-802c-073e78388965")
        public static SmDependency RequiredStateOfBpmnMessageDep() {
            if (RequiredStateOfBpmnMessageDep == null) {
            	RequiredStateOfBpmnMessageDep = classof().getDependencyDef("RequiredStateOfBpmnMessage");
            }
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("0fbdebea-a001-41bb-a199-12085e61ddd4")
        public static SmDependency RequiredStateOfDep() {
            if (RequiredStateOfDep == null) {
            	RequiredStateOfDep = classof().getDependencyDef("RequiredStateOf");
            }
            return RequiredStateOfDep;
        }

        @objid ("aa55f589-ee07-44e2-99de-b652c63901ab")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("e7716d45-3267-4d09-8863-21ba29e8902f")
        public static SmDependency SubMachineDep() {
            if (SubMachineDep == null) {
            	SubMachineDep = classof().getDependencyDef("SubMachine");
            }
            return SubMachineDep;
        }

        @objid ("bb8f60e8-81bf-4626-9ed5-dbb8e1fb8e8e")
        public static SmDependency RequiredStateOfBpmnItemDep() {
            if (RequiredStateOfBpmnItemDep == null) {
            	RequiredStateOfBpmnItemDep = classof().getDependencyDef("RequiredStateOfBpmnItem");
            }
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("abcd21c7-7832-4294-b384-354a5d61deb0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("24a0614b-6a79-483d-b675-65f5769a69c6")
        public static SmDependency getSubMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubMachineDep;
        }

        @objid ("c4d7d4d5-4c9b-47c8-bd03-9faa19b4e491")
        public static SmDependency getRequiredStateOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfDep;
        }

        @objid ("11e42232-8a37-4904-adf1-47ff9d5d39ef")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("505a3abe-bbde-4a0f-b2ea-446d3af59160")
        public static SmDependency getRequiredStateOfBpmnMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnMessageDep;
        }

        @objid ("b5e85857-3a61-4285-b75e-950926ccfb04")
        public static SmDependency getRequiredStateOfBpmnItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredStateOfBpmnItemDep;
        }

        @objid ("81523a37-0285-4c0a-aa86-c0b63f47b1f5")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("6e5792bd-b8e2-4879-a667-1caca011955f")
        public static SmDependency getBpmnDataStateRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnDataStateRefsDep;
        }

        @objid ("a2132c52-9def-4340-976c-ab456955e826")
        public static SmDependency getOwnedRegionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedRegionDep;
        }

        @objid ("01a5d0fc-0d5a-4afc-9cda-a9e2755ee09a")
        public static SmDependency getInternalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalDep;
        }

        @objid ("8a959161-5952-44ed-af54-4a81e04a5e91")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("b99cb020-a9ef-47f0-9f22-b93afcae15f7")
        public static SmDependency getDefferedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefferedDep;
        }

        @objid ("000497f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9006c62a-4935-448d-a278-8c090f6d1f10")
            public ISmObjectData createData() {
                return new StateData();
            }

            @objid ("6b0a4e21-712b-408a-905f-fbad931e6034")
            public SmObjectImpl createImpl() {
                return new StateImpl();
            }

        }

        @objid ("000502b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("fd6168cb-da53-4ad1-aedb-bf903d8bd8de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mConnection != null)? ((StateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("e74d2b21-446d-4952-aaef-77224b739a3c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((StateData) data).mConnection;
            }

            @objid ("64d41af5-2c63-47dc-ad16-53b258cd7fbe")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.OwnerStateDep();
            }

        }

        @objid ("00056748-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefferedSmDependency extends SmMultipleDependency {
            @objid ("54b8089d-a72e-4e81-8f42-fd1f4da28213")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mDeffered != null)? ((StateData)data).mDeffered:SmMultipleDependency.EMPTY;
            }

            @objid ("d7af4cf0-8d9d-40d7-b58f-e02685473113")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mDeffered = new ArrayList<>(initialCapacity);
                return ((StateData) data).mDeffered;
            }

            @objid ("95de8d1a-2fc8-467b-bfc6-554751c057a7")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.OriginDep();
            }

        }

        @objid ("0005caa8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InternalSmDependency extends SmMultipleDependency {
            @objid ("e255df30-9a02-4a8a-ab86-902a02e35bb1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mInternal != null)? ((StateData)data).mInternal:SmMultipleDependency.EMPTY;
            }

            @objid ("a9ef98e8-56d1-4878-9512-9d4ff62ffee6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mInternal = new ArrayList<>(initialCapacity);
                return ((StateData) data).mInternal;
            }

            @objid ("c6b094f2-5b24-4399-86b9-6e2731c2599b")
            @Override
            public SmDependency getSymetric() {
                return InternalTransitionData.Metadata.SComposedDep();
            }

        }

        @objid ("000630a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedRegionSmDependency extends SmMultipleDependency {
            @objid ("99878098-4b5a-45c8-8353-226281722670")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mOwnedRegion != null)? ((StateData)data).mOwnedRegion:SmMultipleDependency.EMPTY;
            }

            @objid ("ded5bbaa-8f53-424c-90d9-7ebbd2c7659f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mOwnedRegion = new ArrayList<>(initialCapacity);
                return ((StateData) data).mOwnedRegion;
            }

            @objid ("9d39b846-fcdf-42c7-bedd-2e768629337f")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.ParentDep();
            }

        }

        @objid ("000695e6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SubMachineSmDependency extends SmSingleDependency {
            @objid ("c7af3ca8-f861-4c9b-a793-39786544af3e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateData) data).mSubMachine;
            }

            @objid ("ef233841-7986-4179-aa63-121356339cd6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateData) data).mSubMachine = value;
            }

            @objid ("591f3527-35e5-4459-be29-337c03ae578a")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.SubmachineStateDep();
            }

        }

        @objid ("00070e2c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfSmDependency extends SmMultipleDependency {
            @objid ("e118af0c-5d5c-4489-8528-d9afdec5b5d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOf != null)? ((StateData)data).mRequiredStateOf:SmMultipleDependency.EMPTY;
            }

            @objid ("b6bdab68-320c-4591-846b-412f37f1c953")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOf = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOf;
            }

            @objid ("ae87356c-9f99-494b-9fb2-bbc219e1c70e")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.InStateDep();
            }

        }

        @objid ("000782da-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("5cfad695-b363-47d1-9cab-b3d236fcb498")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mEntryPoint != null)? ((StateData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("a87a88ef-6967-410a-8aa8-f4f9fe351643")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mEntryPoint;
            }

            @objid ("2fd6a00b-dbdc-4614-9c58-6dcae4ffa1f2")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfDep();
            }

        }

        @objid ("0007ed92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("babce4e1-0ac3-4ece-99b8-00b03471d04e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mExitPoint != null)? ((StateData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("d83c8004-2dfc-42ca-a3a7-998f110202e0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateData) data).mExitPoint;
            }

            @objid ("b8bcc0da-a505-4715-8654-128d7f0267b6")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfDep();
            }

        }

        @objid ("00085926-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnDataStateRefsSmDependency extends SmMultipleDependency {
            @objid ("342bbd4e-8939-4a11-880c-160ce11580ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mBpmnDataStateRefs != null)? ((StateData)data).mBpmnDataStateRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("7221dbc1-58ab-404f-8093-b9468fb9b9cc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mBpmnDataStateRefs = new ArrayList<>(initialCapacity);
                return ((StateData) data).mBpmnDataStateRefs;
            }

            @objid ("aeec63b2-6b72-44db-bd6c-5acb7a8bd124")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.UmlStateDep();
            }

        }

        @objid ("0008ca96-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnItemSmDependency extends SmMultipleDependency {
            @objid ("2e7b5561-151e-4828-8610-7219d8dfe838")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnItem != null)? ((StateData)data).mRequiredStateOfBpmnItem:SmMultipleDependency.EMPTY;
            }

            @objid ("edea7863-b5c4-4753-814c-22397428176b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnItem = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnItem;
            }

            @objid ("e489b7df-cdf9-4854-8cca-338c153ad1be")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.InStateDep();
            }

        }

        @objid ("00093512-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredStateOfBpmnMessageSmDependency extends SmMultipleDependency {
            @objid ("3d07909e-38ca-44bd-b236-df641e03e898")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateData)data).mRequiredStateOfBpmnMessage != null)? ((StateData)data).mRequiredStateOfBpmnMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("6d597dc7-6912-410e-b399-55d4da708527")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateData) data).mRequiredStateOfBpmnMessage = new ArrayList<>(initialCapacity);
                return ((StateData) data).mRequiredStateOfBpmnMessage;
            }

            @objid ("e1f39d1d-032b-4111-8cd7-ad85ca7dce82")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InStateDep();
            }

        }

    }

}
