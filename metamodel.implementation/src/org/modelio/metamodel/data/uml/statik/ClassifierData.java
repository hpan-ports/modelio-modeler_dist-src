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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.informationFlow.InformationItemData;
import org.modelio.metamodel.data.uml.infrastructure.SubstitutionData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.impl.uml.statik.ClassifierImpl;
import org.modelio.metamodel.uml.statik.Classifier;
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

@objid ("0003c640-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Classifier.class, factory=ClassifierData.Metadata.ObjectFactory.class)
public abstract class ClassifierData extends NameSpaceData {
    @objid ("87960ec4-0da6-4d81-bfd6-6e410a5aa97a")
    @SmaMetaAssociation(metaName="OwnedOperation", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedOperationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedOperation = null;

    @objid ("5906b227-dbcc-4d2c-a0c9-c96447613da9")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=InformationItemData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("c03b8ec1-8116-49c8-95fa-dba27cca0ec4")
    @SmaMetaAssociation(metaName="Substitued", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstituedSmDependency.class, component = true)
     List<SmObjectImpl> mSubstitued = null;

    @objid ("4410d278-60eb-494d-8cf7-9db9c7c2223c")
    @SmaMetaAssociation(metaName="OwnedAttribute", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedAttributeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedAttribute = null;

    @objid ("57bc3573-bbe3-492d-93e8-9d694e7e55e5")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("cab7fbcd-9e20-4397-b375-00e0a40e80cb")
    @SmaMetaAssociation(metaName="Conveyer", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ConveyerSmDependency.class)
     List<SmObjectImpl> mConveyer = null;

    @objid ("b1be971b-3117-487f-b893-b8a684fe560c")
    @SmaMetaAssociation(metaName="SubstitutingSubstitution", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstitutingSubstitutionSmDependency.class)
     List<SmObjectImpl> mSubstitutingSubstitution = null;

    @objid ("7fc120e4-18c9-42d9-93d0-ea6384269ebd")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("1927df5d-112e-47b3-8251-6d1fdbc22c8a")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("2a3e3c7b-393e-4ee9-ab13-9331297b670c")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("183fb7ac-93f8-4bb1-a2a3-dd7c27f9b853")
    @SmaMetaAssociation(metaName="Throwing", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrowingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mThrowing = null;

    @objid ("20cc9b4c-befd-43c1-b1cc-fb6dbb7545e0")
    @SmaMetaAssociation(metaName="InternalStructure", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.InternalStructureSmDependency.class, component = true)
     List<SmObjectImpl> mInternalStructure = null;

    @objid ("be6f8880-1aca-4d10-8030-ad6f7bfafc67")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0049e79c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4a3f7505-b722-4533-a7e8-8558815255c8")
        private static SmClass smClass = null;

        @objid ("9f14bb21-b16d-416f-b8c3-39c19cb4ea53")
        private static SmDependency OwnedOperationDep = null;

        @objid ("54a59c0f-f490-4072-812f-54c3be6262ec")
        private static SmDependency RepresentationDep = null;

        @objid ("7a8244c2-3da4-4e8c-b254-034fede2142a")
        private static SmDependency SubstituedDep = null;

        @objid ("f8e4585f-5eed-442b-9709-f2f157c5e87b")
        private static SmDependency OwnedAttributeDep = null;

        @objid ("b1baf622-dea7-45c7-a603-7965b8ee8f05")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("a197597e-7f26-4d95-9c33-d6566328f012")
        private static SmDependency ConveyerDep = null;

        @objid ("7f4382e6-6992-40fb-96b9-bd53f53962c1")
        private static SmDependency SubstitutingSubstitutionDep = null;

        @objid ("cfe38be1-8f5d-4f32-b6c0-5bf7a676150a")
        private static SmDependency TargetingEndDep = null;

        @objid ("1412c28c-de32-4f4a-bd43-cf7690d0da86")
        private static SmDependency OwnedEndDep = null;

        @objid ("5264143f-0def-4421-8791-1b385e9b9dc8")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("50f3aa56-c6d4-4702-852a-c70e6e03055e")
        private static SmDependency ThrowingDep = null;

        @objid ("9f4f0e09-7082-4599-8ec1-804f864a6c1c")
        private static SmDependency InternalStructureDep = null;

        @objid ("15a647a0-7638-4a94-ac59-587fb3a13d6f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassifierData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6e67d17b-5ab8-411f-8d26-33b6b2152538")
        public static SmDependency OwnedOperationDep() {
            if (OwnedOperationDep == null) {
            	OwnedOperationDep = classof().getDependencyDef("OwnedOperation");
            }
            return OwnedOperationDep;
        }

        @objid ("b2912caa-9c27-48ee-84ef-91dfed7fe8f0")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("337883d4-eb26-4c6c-a246-e15f38777524")
        public static SmDependency SubstituedDep() {
            if (SubstituedDep == null) {
            	SubstituedDep = classof().getDependencyDef("Substitued");
            }
            return SubstituedDep;
        }

        @objid ("cefcde21-fd9a-4f64-a0da-4e9a3828ce83")
        public static SmDependency OwnedAttributeDep() {
            if (OwnedAttributeDep == null) {
            	OwnedAttributeDep = classof().getDependencyDef("OwnedAttribute");
            }
            return OwnedAttributeDep;
        }

        @objid ("fb8ba240-1681-4934-b04e-a184c726d7d9")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("a2d12831-cf4d-48f1-b70b-de56866121e6")
        public static SmDependency ConveyerDep() {
            if (ConveyerDep == null) {
            	ConveyerDep = classof().getDependencyDef("Conveyer");
            }
            return ConveyerDep;
        }

        @objid ("e9a7141c-80e8-4876-b506-8152b9cbb54e")
        public static SmDependency SubstitutingSubstitutionDep() {
            if (SubstitutingSubstitutionDep == null) {
            	SubstitutingSubstitutionDep = classof().getDependencyDef("SubstitutingSubstitution");
            }
            return SubstitutingSubstitutionDep;
        }

        @objid ("7c70f062-0331-42e7-88db-3f4004caf60a")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("e305844d-2398-4740-94d3-ae09e4886716")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("f3a55c7c-0bba-4d2a-919f-c0c069d3cebe")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("a4c127ee-d443-499e-b8d0-6e80266e0cd5")
        public static SmDependency ThrowingDep() {
            if (ThrowingDep == null) {
            	ThrowingDep = classof().getDependencyDef("Throwing");
            }
            return ThrowingDep;
        }

        @objid ("ad1b6bfb-367c-44fb-8249-9c646376714b")
        public static SmDependency InternalStructureDep() {
            if (InternalStructureDep == null) {
            	InternalStructureDep = classof().getDependencyDef("InternalStructure");
            }
            return InternalStructureDep;
        }

        @objid ("db1e54be-9a16-4107-b02d-56435b49445e")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("d662616a-3010-407c-a007-5c754b26db50")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("e243a70d-2002-4b5b-92de-af8eb4e64432")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("cdafc58b-c323-4828-bf77-7040bf11d0bd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a9894d46-d10c-4be4-b823-3de5f205bd93")
        public static SmDependency getThrowingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowingDep;
        }

        @objid ("21a9dcf2-714d-420d-9ac5-0413bf287d98")
        public static SmDependency getOwnedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedOperationDep;
        }

        @objid ("5e5773b6-93f0-4055-8b5a-ce8cf7e9c15e")
        public static SmDependency getSubstituedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstituedDep;
        }

        @objid ("ae6c038d-9b1b-4df9-8ea5-e36b3dafbce9")
        public static SmDependency getSubstitutingSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingSubstitutionDep;
        }

        @objid ("be6fb3ee-a6ef-4964-9bfa-59b3d67a369a")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("4cc825fa-9f6d-42e8-84cb-4949ece2e3a8")
        public static SmDependency getInternalStructureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalStructureDep;
        }

        @objid ("0d959894-45ef-4a6a-8462-febda42ac064")
        public static SmDependency getConveyerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyerDep;
        }

        @objid ("9ef6108e-986e-46cd-9f7e-0979fbd90ae9")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("ad9d2e69-5abf-4d98-85f5-ae9bc4a670db")
        public static SmDependency getOwnedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedAttributeDep;
        }

        @objid ("004a28ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("09d0c88a-d3a3-472d-97d2-8fbcb9b8f73a")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("4f0cc767-3b89-4daa-b0fd-8a04ae7a77be")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004a8e18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InternalStructureSmDependency extends SmMultipleDependency {
            @objid ("5b74168b-c8f7-4203-af69-f63450eb99b0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mInternalStructure != null)? ((ClassifierData)data).mInternalStructure:SmMultipleDependency.EMPTY;
            }

            @objid ("0324eb1a-4d67-42a6-951f-66e06bdfe482")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mInternalStructure = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mInternalStructure;
            }

            @objid ("b63fe9c6-04c6-41ea-98ea-10d9f46b13bd")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.InternalOwnerDep();
            }

        }

        @objid ("004af39e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ThrowingSmDependency extends SmMultipleDependency {
            @objid ("d32bd54e-4bda-4333-8bd2-594ad15d7b51")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mThrowing != null)? ((ClassifierData)data).mThrowing:SmMultipleDependency.EMPTY;
            }

            @objid ("20891efc-adc3-4115-8e66-e099dd1ada28")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mThrowing = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mThrowing;
            }

            @objid ("0429f8e1-2c8a-4910-8e45-4bfd07e39c4f")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrownTypeDep();
            }

        }

        @objid ("004b597e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstituedSmDependency extends SmMultipleDependency {
            @objid ("dcbe41db-b42a-45d0-a211-df44fafbc07b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitued != null)? ((ClassifierData)data).mSubstitued:SmMultipleDependency.EMPTY;
            }

            @objid ("eab4745d-6251-4671-b90e-0cf7473e57cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitued = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitued;
            }

            @objid ("c944dbfe-a6e6-4020-8020-4ffb4ce8188e")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.SubstitutingClassifierDep();
            }

        }

        @objid ("004bbeaa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("f4f2e1e9-740b-48fe-a797-a94649ea1418")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitutingSubstitution != null)? ((ClassifierData)data).mSubstitutingSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("ab207738-a150-4250-928f-8b62d68795d4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitutingSubstitution = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitutingSubstitution;
            }

            @objid ("e6451dad-4343-4be4-923c-b8c703268eb0")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.ContractDep();
            }

        }

        @objid ("004c2278-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("312e4823-f620-441e-adb7-c51245802300")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRepresentation != null)? ((ClassifierData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("b3dc29b0-10bc-46a2-9e76-062f01e59e34")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRepresentation;
            }

            @objid ("c86bc91a-139c-46aa-b48f-f06486fb906f")
            @Override
            public SmDependency getSymetric() {
                return InformationItemData.Metadata.RepresentedDep();
            }

        }

        @objid ("004c86dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyerSmDependency extends SmMultipleDependency {
            @objid ("22d50e61-37cd-4c30-8ab4-4d24d2700329")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mConveyer != null)? ((ClassifierData)data).mConveyer:SmMultipleDependency.EMPTY;
            }

            @objid ("cae6590d-50d8-4d8d-8d21-36eeec91d9d8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mConveyer = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mConveyer;
            }

            @objid ("2d6d2056-9096-4f92-9203-6fa546624289")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ConveyedDep();
            }

        }

        @objid ("004cec08-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("0d96b2f7-83a1-41f0-89e0-fbf31d2236cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mBpmnRepresents != null)? ((ClassifierData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("e1c3b393-1b2d-490f-9a7c-410d3e9acbee")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mBpmnRepresents;
            }

            @objid ("7f913da9-4d1e-44a6-8034-d20ceaee6ebf")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.TypeDep();
            }

        }

        @objid ("004d51b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedOperationSmDependency extends SmMultipleDependency {
            @objid ("e37f57a3-d4da-43d9-b165-09de33d7c078")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedOperation != null)? ((ClassifierData)data).mOwnedOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("6266d61b-43c3-48e7-8a93-5840cd1ed081")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedOperation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedOperation;
            }

            @objid ("0c2b7d18-193e-4ac7-9bfc-e0d34b55ce3f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnerDep();
            }

        }

        @objid ("004db890-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("81ef0bfd-a6c0-46f5-ad8a-d0df2fef9635")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedEnd != null)? ((ClassifierData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("7e55997d-f9e4-40c8-8ed6-4420772e2ae7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedEnd;
            }

            @objid ("518fedad-4d55-4238-894d-3a4410557197")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SourceDep();
            }

        }

        @objid ("004e1fb0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedAttributeSmDependency extends SmMultipleDependency {
            @objid ("cd74bcfa-3e38-4ac4-9c7a-1d53f0012311")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedAttribute != null)? ((ClassifierData)data).mOwnedAttribute:SmMultipleDependency.EMPTY;
            }

            @objid ("f813bc2b-5ed6-460c-a97d-db2b90d31806")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedAttribute = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedAttribute;
            }

            @objid ("8ecefdd0-dc3d-498b-b6b1-ad176ebd0840")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OwnerDep();
            }

        }

        @objid ("004e87f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("5db8b5ba-bacb-4caf-92a4-270fabb8d6ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedNaryEnd != null)? ((ClassifierData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("b7433998-4aeb-432c-b6f0-d39dea0c9369")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedNaryEnd;
            }

            @objid ("2ca7b713-0080-408c-9fc6-04a5141ccd3e")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.OwnerDep();
            }

        }

        @objid ("004ef0c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("4a30ac79-53cd-42fd-b64c-7f20908e8029")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mTargetingEnd != null)? ((ClassifierData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("7e8697ad-d0a0-42c7-84c9-f49dee775d2b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mTargetingEnd;
            }

            @objid ("4b704f05-faae-40a5-8818-048f47f7ab96")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.TargetDep();
            }

        }

    }

}
