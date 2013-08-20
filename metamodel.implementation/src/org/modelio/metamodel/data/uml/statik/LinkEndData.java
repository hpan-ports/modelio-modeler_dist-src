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
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.LinkEndImpl;
import org.modelio.metamodel.uml.statik.LinkEnd;
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

@objid ("001037c2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LinkEnd.class, factory=LinkEndData.Metadata.ObjectFactory.class)
public class LinkEndData extends ModelElementData {
    @objid ("ffd8ca88-91da-4a15-a453-504e4d27b52e")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("1ec1f3a0-387d-42e8-84c3-619e9eae9906")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("6ddbe82e-17c7-4dc4-9486-fa3d073e89f5")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("0ad929c8-848e-4600-81a1-652cf812352a")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("d58767ee-6cb3-45d3-ba33-6129b9d83d92")
    @SmaMetaAssociation(metaName="Link", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.LinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mLink;

    @objid ("222997c1-659d-4f60-9988-9a03359ff2c4")
    @SmaMetaAssociation(metaName="Target", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("9bb52fc2-a84a-4242-a247-71924f56177d")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("153722d6-a607-4cca-a252-a91b39dbdcfb")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("54bc34c8-0320-4720-822c-e781fb72aa3f")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("584668c6-3cb1-4ec2-9cc5-357f11b516ee")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("43ea7dc7-dd8a-48c6-abef-6696e7b67b6f")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true)
     SmObjectImpl mOpposite;

    @objid ("c600aa12-999e-40f0-a074-2c5e10d03e8f")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("c602a807-c34e-4f5a-985b-d4137b3bfdb6")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("5c20b5e1-066b-4194-afff-4223f1906f01")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0079d614-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3c29f9bf-1081-42a3-ac6b-c6503d3aab25")
        private static SmClass smClass = null;

        @objid ("6b9fb97b-0dbe-4ec0-a731-93ce8146dcdf")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("6e93eb1b-d96a-48df-9972-c2986c9b9853")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("270eec15-348e-4f64-8970-57d39237cad2")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("b4a80478-dadd-4e18-a9e1-fc9477cd1f4a")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("248200ce-95e4-4bcc-bd21-1c229d219a91")
        private static SmDependency LinkDep = null;

        @objid ("ba5c5b0f-302b-4a56-b561-3a4718551be1")
        private static SmDependency TargetDep = null;

        @objid ("7c6c3507-2522-4512-aac1-0b8117cd5a17")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("4bd4f824-8e2e-42a6-ab79-7bae14c35f8b")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("3274de00-07ea-4c51-aaed-4bb8b059f4d4")
        private static SmDependency ModelDep = null;

        @objid ("66eacaa2-251e-4503-922b-d999bba06d92")
        private static SmDependency ConsumerDep = null;

        @objid ("81ea9e58-51b4-4fbb-b38f-c06b8f54cb71")
        private static SmDependency OppositeDep = null;

        @objid ("e47e6c46-94be-46bf-af29-9fdef93ed877")
        private static SmDependency SourceDep = null;

        @objid ("b875521c-35be-4a77-862a-c1ca86889bf4")
        private static SmDependency ProviderDep = null;

        @objid ("1baacb40-5e2e-4e9d-b857-7047d814447e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c43dd5eb-e878-4b86-8ea8-234df9fd252a")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("90088c6c-c5f2-4847-a282-0bc3d36e9e77")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("3dfd3b5e-c1fd-4f6a-beda-8fe2f7d0a653")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("68a7dbbe-a1bd-4beb-a6ff-9741e9ad7bcf")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("5896affa-4719-4e18-9162-b5277305c94e")
        public static SmDependency LinkDep() {
            if (LinkDep == null) {
            	LinkDep = classof().getDependencyDef("Link");
            }
            return LinkDep;
        }

        @objid ("35776043-8378-4744-b39c-81fc49d551e4")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("0bc89029-aadd-4bef-8484-ed9d0f047cba")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("34c11c14-a5e1-4af3-8220-b941636837ee")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("669c725d-094f-40fe-97b7-d48976599a36")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("41138326-cb57-4031-a1ad-f5cb08ff54d6")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("61af2c42-e26b-4d6b-ac9e-4a1cb1a796f3")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("29399dd9-9958-495f-b903-3328f908fddc")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("379cdb83-342f-423e-b785-6fd96e9c3b4e")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("628e54cf-328f-447d-b0b0-7e1400c335f4")
        public static SmDependency getLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkDep;
        }

        @objid ("d002a072-7078-4f42-a771-6bd482f256d8")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("18b1e255-6b84-477f-876c-21e981290646")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("b04bbbab-f4c6-48e0-90da-be6a43342b1e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5b18c391-54ab-424d-8fbc-d23661078587")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("9a2cab0f-0e04-4862-91fe-c811ceb13ca7")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("04f0eef3-1aa4-45b3-9b96-f202b7465022")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("05f47b42-7dc4-4844-b0e8-15bde44d8e3b")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("5082c8ad-9b26-465f-802f-2cdb7e3536f9")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("b0f9c396-b5a2-43c3-9b5d-23cf6d5b87ab")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("8afa0eb1-1651-4cc3-9726-fcec82b2f30a")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("36249ce4-dd6a-442a-8252-b27d7a9648ea")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("04f9c48c-6199-4b72-9df7-b3c98f0eaeda")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("142cc82d-6e03-4d97-8894-3ae39e5f0030")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("007a2af6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9ae339a2-18bb-4dbc-9edc-2f92310b997d")
            public ISmObjectData createData() {
                return new LinkEndData();
            }

            @objid ("54475da4-4666-402c-b152-4cc6c28316ac")
            public SmObjectImpl createImpl() {
                return new LinkEndImpl();
            }

        }

        @objid ("007b16fa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("5fa87d96-af47-4f86-83ff-9249206fd40e")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsOrdered;
            }

            @objid ("e5de37b7-9f87-4a14-9f97-0e6053bd865c")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("007b8158-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("338def24-5fe5-447b-98e4-f55760b38b54")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsUnique;
            }

            @objid ("b16fa0d1-f8cb-485e-a3e3-fd630888bdc3")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("007be396-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("f011810c-f7c7-462b-8f9c-2c3d2739df76")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMax;
            }

            @objid ("ce2aeba0-edea-49fd-b8ef-cca4c9e36cb0")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("007c4516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("232e8797-6f47-4685-99ee-09f0190eeced")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMin;
            }

            @objid ("4bc114dd-04b1-4969-9375-70137dee002a")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("007caa7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("0b953580-e6d0-4453-b8a5-da50f9f0d116")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mConsumer;
            }

            @objid ("3a66ab82-ba37-419c-b9d8-8157c713fbcc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mConsumer = value;
            }

            @objid ("cf006245-379a-4b17-8218-7be4166045d4")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.ProviderDep();
            }

        }

        @objid ("007d9786-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("b6c81b3a-34bf-49b6-9a2f-8b6a159858c4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mModel;
            }

            @objid ("8798382a-167b-4255-9fed-07beccd17987")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mModel = value;
            }

            @objid ("5fa55814-e032-4a1f-87a4-9133cf8ecf86")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OccurenceDep();
            }

        }

        @objid ("007e1c10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("c5dfe206-f349-414b-ae0e-6a6665fff5a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mProvider;
            }

            @objid ("c6e76586-cdf2-4092-8e0f-a753843aed5b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mProvider = value;
            }

            @objid ("a3e717a3-e82a-4f08-b2fb-e9a8d1ead772")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ConsumerDep();
            }

        }

        @objid ("007f0526-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("a7485f3e-319d-4ca6-be85-233db0d12c94")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkEndData)data).mRealizedInformationFlow != null)? ((LinkEndData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("7b156b91-e86d-4a0f-82da-0ad6059810da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkEndData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((LinkEndData) data).mRealizedInformationFlow;
            }

            @objid ("8364b315-4804-4851-a1bf-85658d85ab71")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingLinkDep();
            }

        }

        @objid ("0030b858-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("0145845c-df08-4deb-99bc-ed83602e4f31")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mSource;
            }

            @objid ("d9c0a873-3fe1-445a-ae01-3d862ef6f2e4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mSource = value;
            }

            @objid ("be167968-6abc-4882-a4c7-75fbabef86a4")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedEndDep();
            }

        }

        @objid ("0032eac4-18c8-1080-943a-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("6fd7920e-aa0c-44a6-8a65-1a7c9df23e6e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOpposite;
            }

            @objid ("1ab3f4c6-42da-4b01-9270-1454cc0d1978")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOpposite = value;
            }

            @objid ("ee107277-65f1-4ee4-9175-fca18be33e15")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("00339c62-18c8-1080-943a-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("189c896f-c5ba-4991-a796-1af18bb517cc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mTarget;
            }

            @objid ("5d1130ce-113d-4baa-8407-32f2b2c1f4c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mTarget = value;
            }

            @objid ("ce003a72-f8ee-4759-8889-4f306b362784")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00934572-7aa2-10a2-abe4-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("4c860e35-7b37-4cf5-8199-323ed34c1b38")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOppositeOwner;
            }

            @objid ("4f8af8ad-f7ae-4085-96f9-76019476b99c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOppositeOwner = value;
            }

            @objid ("5ee93b77-6786-4321-a790-ad88069bd61c")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeDep();
            }

        }

        @objid ("bdd20b30-8417-4bd1-8e9c-0b4efa7811d6")
        public static class LinkSmDependency extends SmSingleDependency {
            @objid ("14457ef7-a6ed-49ee-b0aa-8401ad41d4a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mLink;
            }

            @objid ("cb8abafb-4658-47b8-afe6-10ee194c4360")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mLink = value;
            }

            @objid ("a80bdf1d-02fe-465a-9c8e-2b1f75cb9f2f")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.LinkEndDep();
            }

        }

    }

}
