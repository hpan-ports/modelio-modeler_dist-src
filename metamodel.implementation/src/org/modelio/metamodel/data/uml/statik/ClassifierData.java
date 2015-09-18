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
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
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
    @objid ("ae5e179e-50f2-4198-8cd6-dc11d41a9e1c")
    @SmaMetaAssociation(metaName="OwnedOperation", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedOperationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedOperation = null;

    @objid ("417d2105-6c46-4c72-bb0e-49356a6d1f80")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=InformationItemData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("733e8de0-d884-4de5-92e2-77a581121210")
    @SmaMetaAssociation(metaName="Substitued", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstituedSmDependency.class, component = true)
     List<SmObjectImpl> mSubstitued = null;

    @objid ("7b4def53-b58e-49e5-83a8-71cac80d3f47")
    @SmaMetaAssociation(metaName="OwnedAttribute", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedAttributeSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedAttribute = null;

    @objid ("8d2606bd-3a09-43a0-9026-32ab3ab250da")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("63c27d42-8d43-4aa2-be98-fcae3a387b30")
    @SmaMetaAssociation(metaName="Conveyer", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ConveyerSmDependency.class)
     List<SmObjectImpl> mConveyer = null;

    @objid ("f194a82a-bc72-4ae8-aa75-b77cad058b80")
    @SmaMetaAssociation(metaName="SubstitutingSubstitution", typeDataClass=SubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.SubstitutingSubstitutionSmDependency.class)
     List<SmObjectImpl> mSubstitutingSubstitution = null;

    @objid ("7f1f030e-0e15-4113-a67f-48d70fc22a0b")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("7debb16a-e130-450f-a465-923df2a53fe0")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=AssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("64c4ff8f-551f-4abc-b0b4-992ccd3d60be")
    @SmaMetaAssociation(metaName="BpmnRepresents", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentsSmDependency.class)
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("629c462c-c582-4963-ba5d-0c6a3ad66cac")
    @SmaMetaAssociation(metaName="Throwing", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrowingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mThrowing = null;

    @objid ("8dfc527c-7d57-4053-8a65-670ba70b4b49")
    @SmaMetaAssociation(metaName="InternalStructure", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.InternalStructureSmDependency.class, component = true)
     List<SmObjectImpl> mInternalStructure = null;

    @objid ("f5cae3e0-9c2d-4c81-a2f9-94f830b88dfa")
    @SmaMetaAssociation(metaName="RealizedComponent", typeDataClass=ComponentRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedComponentSmDependency.class, istodelete = true)
     List<SmObjectImpl> mRealizedComponent = null;

    @objid ("95ef4834-028d-42c0-a51a-d8800582e5f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0049e79c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c0073f80-a3a3-4cbb-98ae-abe03723ea58")
        private static SmClass smClass = null;

        @objid ("242dfcd2-c1a8-40f6-8502-ebf997800bf0")
        private static SmDependency OwnedOperationDep = null;

        @objid ("8dafbe06-e662-48b9-a0b9-cb16545f131a")
        private static SmDependency RepresentationDep = null;

        @objid ("a8b3d932-522f-426a-8e78-c2c68b64ddbe")
        private static SmDependency SubstituedDep = null;

        @objid ("a779ca07-3b7e-4394-84fe-ba7bfffea745")
        private static SmDependency OwnedAttributeDep = null;

        @objid ("c748b2ef-b6cc-4b60-9514-269a57de8aef")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("b515321d-adf3-44f9-9f14-fcc81d408ac2")
        private static SmDependency ConveyerDep = null;

        @objid ("cf0a9290-480c-424e-a3ef-1d82ca3bb621")
        private static SmDependency SubstitutingSubstitutionDep = null;

        @objid ("2b93c683-771f-456e-b268-b17c1ce04242")
        private static SmDependency TargetingEndDep = null;

        @objid ("fde35ec3-73c9-45af-bbfa-4402ddabe84a")
        private static SmDependency OwnedEndDep = null;

        @objid ("993ff7ab-292c-4506-a436-44e6e1e2bc66")
        private static SmDependency BpmnRepresentsDep = null;

        @objid ("0bdce737-5cff-4820-bca8-fead77c58d28")
        private static SmDependency ThrowingDep = null;

        @objid ("e9280db6-6dbe-47bd-9af3-6d5e4b2a9d77")
        private static SmDependency InternalStructureDep = null;

        @objid ("e7842bf3-31e6-4f56-b6a5-12198b844516")
        private static SmDependency RealizedComponentDep = null;

        @objid ("ed597682-bed5-4f0f-a1fd-25343b6f0ce1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassifierData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("16898c74-efb6-46e1-a3b0-e7edbfef3722")
        public static SmDependency OwnedOperationDep() {
            if (OwnedOperationDep == null) {
            	OwnedOperationDep = classof().getDependencyDef("OwnedOperation");
            }
            return OwnedOperationDep;
        }

        @objid ("461671cd-688c-4299-8a85-030d351698cb")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("64bdf44c-2db6-4879-be72-a9d615bad1a1")
        public static SmDependency SubstituedDep() {
            if (SubstituedDep == null) {
            	SubstituedDep = classof().getDependencyDef("Substitued");
            }
            return SubstituedDep;
        }

        @objid ("a88c2985-1684-4f0d-9668-12a1633b1bc3")
        public static SmDependency OwnedAttributeDep() {
            if (OwnedAttributeDep == null) {
            	OwnedAttributeDep = classof().getDependencyDef("OwnedAttribute");
            }
            return OwnedAttributeDep;
        }

        @objid ("54d55bee-52cc-452e-a5f5-7b4529eff1b5")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("01780c57-67db-4bc4-9296-bad3b1779348")
        public static SmDependency ConveyerDep() {
            if (ConveyerDep == null) {
            	ConveyerDep = classof().getDependencyDef("Conveyer");
            }
            return ConveyerDep;
        }

        @objid ("5e014420-a38f-4909-b90e-64a052dca09a")
        public static SmDependency SubstitutingSubstitutionDep() {
            if (SubstitutingSubstitutionDep == null) {
            	SubstitutingSubstitutionDep = classof().getDependencyDef("SubstitutingSubstitution");
            }
            return SubstitutingSubstitutionDep;
        }

        @objid ("9aa49ff6-46e6-460f-a57f-b0a9064fde2d")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("7d7c4b5f-fb33-4c21-b6a7-219f58d9a043")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("76f9cf42-a1fc-400e-a0b4-ee3a8d5ae861")
        public static SmDependency BpmnRepresentsDep() {
            if (BpmnRepresentsDep == null) {
            	BpmnRepresentsDep = classof().getDependencyDef("BpmnRepresents");
            }
            return BpmnRepresentsDep;
        }

        @objid ("53f2b777-8661-46d4-a1d2-af6e5ec9aae0")
        public static SmDependency ThrowingDep() {
            if (ThrowingDep == null) {
            	ThrowingDep = classof().getDependencyDef("Throwing");
            }
            return ThrowingDep;
        }

        @objid ("f1cad1fe-5ffb-4638-8b1c-4ff144ceeda1")
        public static SmDependency InternalStructureDep() {
            if (InternalStructureDep == null) {
            	InternalStructureDep = classof().getDependencyDef("InternalStructure");
            }
            return InternalStructureDep;
        }

        @objid ("ffb922e3-066c-4f9e-b00a-a5aa83cac54f")
        public static SmDependency RealizedComponentDep() {
            if (RealizedComponentDep == null) {
            	RealizedComponentDep = classof().getDependencyDef("RealizedComponent");
            }
            return RealizedComponentDep;
        }

        @objid ("b4940c87-3a2e-4f5f-a009-0b361258d424")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("94ad69d2-c110-4f3f-a3ae-54c7de216442")
        public static SmDependency getSubstitutingSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingSubstitutionDep;
        }

        @objid ("e2592caa-f540-4293-8baf-2f2e19f753de")
        public static SmDependency getConveyerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyerDep;
        }

        @objid ("6f2045e4-17fb-4173-be11-16ccd4cc0dc1")
        public static SmDependency getInternalStructureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InternalStructureDep;
        }

        @objid ("44fa834a-d4b5-4cd4-9a10-4eae7c30f2f1")
        public static SmDependency getOwnedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedOperationDep;
        }

        @objid ("a77ed082-ad0e-4c02-924b-0a6e9e72e5ed")
        public static SmDependency getSubstituedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstituedDep;
        }

        @objid ("d7d7c1c8-e69c-46ce-91a3-1173d1cd3a31")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("80878731-89cb-438e-9a72-0f0deb4b98a8")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("0ed46afa-40a6-4a0d-b1e9-9b82d6925188")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("08f748e4-4382-491e-bd10-28baec252302")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c40aaefe-e9cd-4d89-b098-cca3d77799d4")
        public static SmDependency getOwnedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedAttributeDep;
        }

        @objid ("348deb3f-89c5-4d87-8f14-6a031ce8b7b0")
        public static SmDependency getRealizedComponentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedComponentDep;
        }

        @objid ("1478cddf-1e14-4beb-9e6e-5951029a4a63")
        public static SmDependency getBpmnRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentsDep;
        }

        @objid ("523e0093-d00b-4ac9-ae2a-5310518adb7e")
        public static SmDependency getThrowingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrowingDep;
        }

        @objid ("004a28ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d5d07291-ea43-451d-828a-b5cc2e6133d5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("643d0441-40bb-45ac-b7c9-ec53fea51f64")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004a8e18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InternalStructureSmDependency extends SmMultipleDependency {
            @objid ("73520b0a-6423-4f1e-929f-bb155c6d6daf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mInternalStructure != null)? ((ClassifierData)data).mInternalStructure:SmMultipleDependency.EMPTY;
            }

            @objid ("f25940b5-cb50-4b00-a792-9a2e6d128968")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mInternalStructure = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mInternalStructure;
            }

            @objid ("67a3d786-65ff-4603-99fa-92c5e7bb2251")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.InternalOwnerDep();
            }

        }

        @objid ("004af39e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ThrowingSmDependency extends SmMultipleDependency {
            @objid ("67cf4654-707d-4f16-970c-5a2732301697")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mThrowing != null)? ((ClassifierData)data).mThrowing:SmMultipleDependency.EMPTY;
            }

            @objid ("e98a7be6-da8a-4244-bf72-f2bc6e407f41")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mThrowing = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mThrowing;
            }

            @objid ("7dff1ff6-f9f0-4ea6-91dc-762f10f7c89a")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrownTypeDep();
            }

        }

        @objid ("004b597e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstituedSmDependency extends SmMultipleDependency {
            @objid ("f782e925-33ba-423a-a717-ea923ae2c666")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitued != null)? ((ClassifierData)data).mSubstitued:SmMultipleDependency.EMPTY;
            }

            @objid ("a96bca0a-82c9-4d36-a918-6e232a44af50")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitued = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitued;
            }

            @objid ("621bea11-f253-4a83-a76e-6239728759ca")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.SubstitutingClassifierDep();
            }

        }

        @objid ("004bbeaa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("e20ac312-53c4-4439-b5c7-5a5e2f129fe8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mSubstitutingSubstitution != null)? ((ClassifierData)data).mSubstitutingSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("8a29f307-dc26-48ee-8ede-6a44cd4450dd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mSubstitutingSubstitution = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mSubstitutingSubstitution;
            }

            @objid ("0973dd0f-2bb8-4de9-af44-3093a4c80e3a")
            @Override
            public SmDependency getSymetric() {
                return SubstitutionData.Metadata.ContractDep();
            }

        }

        @objid ("004c2278-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("acd58845-0317-4400-a53f-8a2ffd98fa0f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRepresentation != null)? ((ClassifierData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("c132118e-6271-46a1-b9b9-9fa96cb5ef80")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRepresentation;
            }

            @objid ("2449c9fd-ff6c-4e4f-bb02-296e859d8754")
            @Override
            public SmDependency getSymetric() {
                return InformationItemData.Metadata.RepresentedDep();
            }

        }

        @objid ("004c86dc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyerSmDependency extends SmMultipleDependency {
            @objid ("c93124f3-8ee6-4c0d-8ca3-83ba14297f15")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mConveyer != null)? ((ClassifierData)data).mConveyer:SmMultipleDependency.EMPTY;
            }

            @objid ("1621f111-83ce-44e4-88c7-06ed7ded3ca6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mConveyer = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mConveyer;
            }

            @objid ("f455645b-e98d-4f66-8a4a-b1bcee375014")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ConveyedDep();
            }

        }

        @objid ("004cec08-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
            @objid ("a0a70281-9dda-47d4-947f-05bdacc7db33")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mBpmnRepresents != null)? ((ClassifierData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("dc804b57-1b1b-47c4-a0d0-e3d0d44c261d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mBpmnRepresents = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mBpmnRepresents;
            }

            @objid ("72350727-6cbc-452f-8587-a9f64af1dab6")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.TypeDep();
            }

        }

        @objid ("004d51b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedOperationSmDependency extends SmMultipleDependency {
            @objid ("91548adf-9d8d-4362-a32b-003e61bd26c5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedOperation != null)? ((ClassifierData)data).mOwnedOperation:SmMultipleDependency.EMPTY;
            }

            @objid ("d7f0cac1-caf8-443f-bc4b-3a0eeea3669a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedOperation = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedOperation;
            }

            @objid ("513bab9e-d5fa-462b-999e-40a445cd25dd")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnerDep();
            }

        }

        @objid ("004db890-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("a023dc99-7fa9-433b-87e9-5917245124b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedEnd != null)? ((ClassifierData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("b3a69027-8385-4431-b4c8-3f06a48653c8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedEnd;
            }

            @objid ("130ad880-e715-4da2-8b53-18d36e07f7ee")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SourceDep();
            }

        }

        @objid ("004e1fb0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedAttributeSmDependency extends SmMultipleDependency {
            @objid ("4465bf54-9910-4d0e-bcf9-441423e4ca2f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedAttribute != null)? ((ClassifierData)data).mOwnedAttribute:SmMultipleDependency.EMPTY;
            }

            @objid ("2cb19447-971e-431f-868e-ec805a1aad2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedAttribute = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedAttribute;
            }

            @objid ("0b84d683-4973-4873-b8eb-b98768ffd4d6")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OwnerDep();
            }

        }

        @objid ("004e87f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("eb3367ce-9e23-4eeb-9d3d-003f966b88c7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mOwnedNaryEnd != null)? ((ClassifierData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("99e795f1-75ab-4b2d-a2ce-5ef3cc62bb73")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mOwnedNaryEnd;
            }

            @objid ("222b35d9-5dfa-4f68-82a6-d5d1e74bb163")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.OwnerDep();
            }

        }

        @objid ("004ef0c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("d7d4a45c-d5ca-4d0e-ad3f-51464864201d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mTargetingEnd != null)? ((ClassifierData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("26552900-d108-4e15-8d8e-bd5a033863fc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mTargetingEnd;
            }

            @objid ("94d6f077-5b06-420d-958c-4a35db1fd4c0")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.TargetDep();
            }

        }

        @objid ("00bb462d-f4d4-4c21-aa02-c96dbea0ecd5")
        public static class RealizedComponentSmDependency extends SmMultipleDependency {
            @objid ("06839523-eb42-4c76-9fa1-9b3baacfb9ea")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClassifierData)data).mRealizedComponent != null)? ((ClassifierData)data).mRealizedComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("7d8d699a-f73d-4ab6-9a72-b622c70f8437")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClassifierData) data).mRealizedComponent = new ArrayList<>(initialCapacity);
                return ((ClassifierData) data).mRealizedComponent;
            }

            @objid ("e8ad5872-b5ed-4b27-bd55-090e120fb558")
            @Override
            public SmDependency getSymetric() {
                return ComponentRealizationData.Metadata.RealizingClassifierDep();
            }

        }

    }

}
