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
    @objid ("12989503-e8bc-4b8e-8aff-e05120e69ebc")
    @SmaMetaAssociation(metaName="OwnedOperation", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedOperationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedOperation = null;

    @objid ("46be12c8-c8d4-4183-9bc0-b8c64b4da62b")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=InformationItemData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("826a7be0-ed20-420a-be13-3d253e36b7e2")
    @SmaMetaAssociation(metaName="Substitued", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstituedSmDependency.class, component = true)
     List<SmObjectImpl> mSubstitued = null;

    @objid ("5b1a086e-c759-4205-9931-b9c01ff226ce")
    @SmaMetaAssociation(metaName="OwnedAttribute", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedAttributeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedAttribute = null;

    @objid ("25ac5251-e3d5-4b64-931c-3ed620c35df3")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("fca9299c-031d-494d-9d9e-297ea4639ad1")
    @SmaMetaAssociation(metaName="Conveyer", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ConveyerSmDependency.class)
     List<SmObjectImpl> mConveyer = null;

    @objid ("1fd266e8-7efb-45bf-b1c3-a0a09ac33332")
    @SmaMetaAssociation(metaName="SubstitutingSubstitution", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstitutingSubstitutionSmDependency.class)
     List<SmObjectImpl> mSubstitutingSubstitution = null;

    @objid ("7f095be4-032d-47c7-a239-ed47e32af983")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("e2d066c1-a6ad-42a9-9112-576f5aefb8e2")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("47c67a68-9539-4af0-9201-62fdb0c87963")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("6e8cd2b3-2d4a-4e96-b698-7c19d639e4b3")
    @SmaMetaAssociation(metaName="Throwing", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrowingSmDependency.class)
     List<SmObjectImpl> mThrowing = null;

    @objid ("6bc7efe3-e52d-4fd6-b037-ef0b0b63a6cd")
    @SmaMetaAssociation(metaName="InternalStructure", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.InternalStructureSmDependency.class, component = true)
     List<SmObjectImpl> mInternalStructure = null;

    @objid ("9487d279-82c2-4b69-9c74-c99586b01b7a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0049e79c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("07a0d1e2-dd4a-4ac7-8762-2fd127d29b92")
        private static SmClass smClass = null;

        @objid ("b2ad9c89-1750-47f2-9a10-c3598e2c959f")
        private static SmDependency OwnedOperationDep = null;

        @objid ("17395566-f476-4180-9159-e7388df544a1")
        private static SmDependency RepresentationDep = null;

        @objid ("61f05273-0207-4a8e-92a0-cebdd046adda")
        private static SmDependency SubstituedDep = null;

        @objid ("b1b52000-ea40-465b-9617-c6ff44fd3df2")
        private static SmDependency OwnedAttributeDep = null;

        @objid ("7f5a7b58-3dd0-4c6e-a777-cfff450fd935")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("00ea0919-7ffc-4188-a77a-c9b30e9e9006")
        private static SmDependency ConveyerDep = null;

        @objid ("16ef1995-a727-444f-aaf8-9982ecc3e69f")
        private static SmDependency SubstitutingSubstitutionDep = null;

        @objid ("48d309a0-3182-40a8-b748-18dbe3759545")
        private static SmDependency TargetingEndDep = null;

        @objid ("63fa18ca-2e7a-49df-ac5e-ae14a36f20f4")
        private static SmDependency OwnedEndDep = null;

        @objid ("5110945e-7603-4de6-ad56-470cdfc31412")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("65eeb35c-33b0-4e07-b7e4-f2d16703e8d2")
        private static SmDependency ThrowingDep = null;

        @objid ("3fb5373c-fb57-4624-9e9d-bf730fc48267")
        private static SmDependency InternalStructureDep = null;

        @objid ("ed10b7c6-69a7-4765-a7f2-0509278a38ae")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassifierData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0feee156-7c60-4f1a-a7f0-057e18100e83")
        public static SmDependency OwnedOperationDep() {
            if (OwnedOperationDep == null) {
            	OwnedOperationDep = classof().getDependencyDef("OwnedOperation");
            }
            return OwnedOperationDep;
        }

        @objid ("dfb19afd-01a9-40de-ad24-f4e714c5101c")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("032e6200-2c92-4c78-a26a-c75f2c7eac0c")
        public static SmDependency SubstituedDep() {
            if (SubstituedDep == null) {
            	SubstituedDep = classof().getDependencyDef("Substitued");
            }
            return SubstituedDep;
        }

        @objid ("5b282171-d0e0-4d85-b010-e3bed5574e64")
        public static SmDependency OwnedAttributeDep() {
            if (OwnedAttributeDep == null) {
            	OwnedAttributeDep = classof().getDependencyDef("OwnedAttribute");
            }
            return OwnedAttributeDep;
        }

        @objid ("a5b7f534-8031-4773-be16-dc90a1ac4563")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("b7f65008-d87e-4924-a3b8-a3c81fc5102e")
        public static SmDependency ConveyerDep() {
            if (ConveyerDep == null) {
            	ConveyerDep = classof().getDependencyDef("Conveyer");
            }
            return ConveyerDep;
        }

        @objid ("2defb22b-9adf-4ab8-ba39-d9f7375030a6")
        public static SmDependency SubstitutingSubstitutionDep() {
            if (SubstitutingSubstitutionDep == null) {
            	SubstitutingSubstitutionDep = classof().getDependencyDef("SubstitutingSubstitution");
            }
            return SubstitutingSubstitutionDep;
        }

        @objid ("52bcf1bf-f037-48ad-ac2a-83505cc7f4b4")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("07c7bbf2-cb93-4852-8fed-0e70d5e51402")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("eb6694d0-7b25-42a0-be8d-7895315b9181")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("e63c7d7f-322d-4ed0-8317-546b10568617")
        public static SmDependency ThrowingDep() {
            if (ThrowingDep == null) {
            	ThrowingDep = classof().getDependencyDef("Throwing");
            }
            return ThrowingDep;
        }

        @objid ("75257184-793e-4ae3-a2e0-7f2d1fbf3957")
        public static SmDependency InternalStructureDep() {
            if (InternalStructureDep == null) {
            	InternalStructureDep = classof().getDependencyDef("InternalStructure");
            }
            return InternalStructureDep;
        }

        @objid ("11fcf7d8-4e51-4255-a492-725aea810265")
        public static SmDependency getConveyerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyerDep;
        }

        @objid ("2d8c833d-101a-4a61-ab81-ea11d16189b3")
        public static SmDependency getSubstituedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstituedDep;
        }

        @objid ("53026b4d-9a34-47fc-9f5f-932fcfdf3b0e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("356ff01c-96f6-45a1-b1c8-ef1d16c4262c")
        public static SmDependency getOwnedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedOperationDep;
        }

        @objid ("7c96827f-11ec-4afd-8b5f-dd1fcbfa3cca")
        public static SmDependency getSubstitutingSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingSubstitutionDep;
        }

        @objid ("196ac18a-dae7-4c5b-ac9f-014bbd2de171")
        public static SmDependency getInternalStructureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalStructureDep;
        }

        @objid ("e46330ec-6da2-4597-8981-8e7696fed255")
        public static SmDependency getThrowingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowingDep;
        }

        @objid ("4f824fc5-d442-4f49-b432-e0bc005e130f")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("3b080512-6b9c-4dd7-89b1-b887076d0f2b")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("1057107e-8ae0-4136-9dcd-728a94fbc2a7")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("6b453f95-3679-415d-bd57-b96af58a3fe7")
        public static SmDependency getOwnedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedAttributeDep;
        }

        @objid ("29c8cbf1-fce9-4e68-aba8-d33e4e03569d")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("307ac77b-2018-44af-8e04-68ef30b17101")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("004a28ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aded9e1d-1f18-4a48-84b5-c2f84b2022f2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("74630910-4e2a-46d0-9d39-fc7f1356f589")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004a8e18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InternalStructureSmDependency extends SmMultipleDependency {
            @objid ("d64878e5-1823-4b3f-833d-c2199f730886")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mInternalStructure != null)? ((ClassifierData)data).mInternalStructure:SmMultipleDependency.EMPTY;
            }

            @objid ("3ef941fb-b71d-446d-a6ba-845773440731")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mInternalStructure = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mInternalStructure;
            }

            @objid ("bfc6b261-563f-4a93-a16b-64f4fd16a29d")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.InternalOwnerDep();
            }

        }

        @objid ("004af39e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ThrowingSmDependency extends SmMultipleDependency {
            @objid ("a29faa30-47d5-493d-8e5c-41dab71b253f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mThrowing != null)? ((ClassifierData)data).mThrowing:SmMultipleDependency.EMPTY;
            }

            @objid ("af059d22-f365-4d81-80db-bbaa295b0524")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mThrowing = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mThrowing;
            }

            @objid ("1a4b1e7a-1eae-45b5-8122-cbd055cdbd7c")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrownTypeDep();
            }

        }

        @objid ("004b597e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstituedSmDependency extends SmMultipleDependency {
            @objid ("54e57bb7-c6de-460c-bfcc-4bedc80e3fd6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitued != null)? ((ClassifierData)data).mSubstitued:SmMultipleDependency.EMPTY;
            }

            @objid ("7292bb26-64ee-4225-ae32-04c9e6291064")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitued = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitued;
            }

            @objid ("8d053492-8744-4dba-b1a5-ec2e97040345")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.SubstitutingClassifierDep();
            }

        }

        @objid ("004bbeaa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("010d65c5-2475-419a-852b-efc59973fa43")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitutingSubstitution != null)? ((ClassifierData)data).mSubstitutingSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("2abc534f-11ff-4897-8902-3220d855ae16")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitutingSubstitution = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitutingSubstitution;
            }

            @objid ("c9a20367-e30e-416b-a0b9-b165713cc89b")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.ContractDep();
            }

        }

        @objid ("004c2278-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("57656bb4-69f7-4aaa-89d3-748d545c54e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRepresentation != null)? ((ClassifierData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("508fb0ee-b321-40f9-a403-6a6292c06c96")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRepresentation;
            }

            @objid ("24f60ebf-3495-45eb-b197-1ada68123bac")
            @Override
            public SmDependency getSymetric() {
                return InformationItemData.Metadata.RepresentedDep();
            }

        }

        @objid ("004c86dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyerSmDependency extends SmMultipleDependency {
            @objid ("d80cd272-a8e4-4c32-b03c-2c9cad682db9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mConveyer != null)? ((ClassifierData)data).mConveyer:SmMultipleDependency.EMPTY;
            }

            @objid ("e1c0bdf8-a4db-41a6-9aaf-652a690e110f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mConveyer = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mConveyer;
            }

            @objid ("01bac535-c76a-4760-acb8-2f699d804d94")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ConveyedDep();
            }

        }

        @objid ("004cec08-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("1112dc14-0584-4cdf-970b-fd4152edb557")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mBpmnRepresents != null)? ((ClassifierData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("c3c1ef7c-66e1-492d-9709-6f0a85f62ead")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mBpmnRepresents;
            }

            @objid ("d452d2b7-f7af-4477-b82d-ffc1cbd14934")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.TypeDep();
            }

        }

        @objid ("004d51b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedOperationSmDependency extends SmMultipleDependency {
            @objid ("0bdb4355-c1ea-4840-b4d7-3eca90170a15")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedOperation != null)? ((ClassifierData)data).mOwnedOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("db3ab857-00bd-40c7-93a6-35c0bcc17595")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedOperation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedOperation;
            }

            @objid ("b0940f25-8795-4c77-9a3f-d0c0d97a6e37")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnerDep();
            }

        }

        @objid ("004db890-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("bd3c27e2-8dcd-481e-a2d0-136540804672")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedEnd != null)? ((ClassifierData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("afe40dba-7243-478b-86ad-67086a75424c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedEnd;
            }

            @objid ("b4a58d95-7255-46cb-9983-9ef970b91b98")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SourceDep();
            }

        }

        @objid ("004e1fb0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedAttributeSmDependency extends SmMultipleDependency {
            @objid ("9f56d04c-1b19-4a3b-950e-a8d60b4e5288")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedAttribute != null)? ((ClassifierData)data).mOwnedAttribute:SmMultipleDependency.EMPTY;
            }

            @objid ("af030c79-eb51-4c51-ba2a-cc5d634624d4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedAttribute = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedAttribute;
            }

            @objid ("2f0f9b98-665a-4c13-a62c-b5398a55d191")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OwnerDep();
            }

        }

        @objid ("004e87f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("34da0d6d-58ab-430e-9b5f-57d6abef24cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedNaryEnd != null)? ((ClassifierData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("8a9de38b-36f4-4615-9d2b-08fcb53eb616")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedNaryEnd;
            }

            @objid ("5cd2c02d-f0cf-4d45-903b-718738a9cce1")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.OwnerDep();
            }

        }

        @objid ("004ef0c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("40adde84-5d54-4c35-8397-c0607cc4a1d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mTargetingEnd != null)? ((ClassifierData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("996c33b8-626d-4e26-aabe-7def3c8b6c29")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mTargetingEnd;
            }

            @objid ("fb830f35-26b1-4378-a8aa-3824c8616aaa")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.TargetDep();
            }

        }

    }

}
