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
    @objid ("66fa8f99-2e2a-4291-8e9a-fc0b6d73ba3e")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("28acce8f-2612-41d6-85d2-4d809ad947e8")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("9ba1fa32-aa8e-4977-be2d-a61247d75ffe")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("711433bb-ae8f-4714-9d51-268a964b6a34")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("92e47bc4-370c-4036-ad0f-3d1e99992bec")
    @SmaMetaAssociation(metaName="Link", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.LinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mLink;

    @objid ("6918bcf6-ab61-41be-a7dd-c4b94e5f6d06")
    @SmaMetaAssociation(metaName="Target", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("02a71896-3542-46c1-888f-a0f8505f67f8")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("a2afc16a-2b0e-4a08-81e9-06955aac99eb")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("7dee1eb6-ec5d-40d2-b809-abae9e3920c6")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("cb087967-aede-4a32-8b7a-aad4c2306953")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("a494ba7c-6414-4b7b-b31b-ad4c4e67a25a")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true)
     SmObjectImpl mOpposite;

    @objid ("5a315270-043b-4d64-8789-4bef2bb34a0c")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("d1503fd2-2877-47cc-b36d-4b2f45a257df")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("e0dd5e3d-92f0-46ec-8ce8-a099fe0ab5fb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0079d614-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("51023e8c-c566-44f9-9add-48ec3826e733")
        private static SmClass smClass = null;

        @objid ("73deb15c-5ea1-45be-97a2-181ebd032d10")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("ed5b7eb8-709d-439d-97ef-2e0207d40642")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("268ef40a-3cd3-40d5-820f-bfa8367fb174")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("0931a385-c75c-4a9e-8e1c-ed4eb211effc")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("44ab5ea7-cb49-47c5-b62e-7cef59483f7f")
        private static SmDependency LinkDep = null;

        @objid ("2ed1d0b9-d1e5-401b-a104-e8ec9c001d72")
        private static SmDependency TargetDep = null;

        @objid ("fd11ebaf-9ad3-48a0-a167-e0da01efcfea")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("cd2c3865-6cdf-4b6d-85f8-101ee365a07a")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("44fe3bd2-ee18-4b78-b514-f8dda235b92d")
        private static SmDependency ModelDep = null;

        @objid ("edf5ded1-e59d-4ac0-8d36-abe2b8b64a96")
        private static SmDependency ConsumerDep = null;

        @objid ("694b957f-8b60-4b04-8c97-3231455d923d")
        private static SmDependency OppositeDep = null;

        @objid ("d5aab09f-62f9-4f73-8a38-d20b1e24b63a")
        private static SmDependency SourceDep = null;

        @objid ("0f9fc7c1-a0a8-4214-a571-ec97eadeb875")
        private static SmDependency ProviderDep = null;

        @objid ("494a97b2-0741-413b-ab4c-e7062099e016")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("eda06f60-84ff-4c56-8641-18a70bd9977c")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("b008b213-b878-4f09-a8fc-353fa4a05250")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("a43a8417-5cdc-41af-be01-640818d95ee3")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("74edf6ac-e83e-404d-aa42-22b1acca3600")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("a34c01fa-69e0-4979-8e7a-b90a9cfe71f3")
        public static SmDependency LinkDep() {
            if (LinkDep == null) {
            	LinkDep = classof().getDependencyDef("Link");
            }
            return LinkDep;
        }

        @objid ("d843600c-fc5f-47c3-8d12-0f45ff89be7e")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("c0bacf92-b22c-45ed-8dee-74841bbba6bc")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("7578ab94-06e0-4fec-91b4-3dcb84b99c46")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("b16477e9-25a4-446f-bd3c-4a385c8de83f")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("c7338f5f-e0ae-40e2-a273-7b594cb89c85")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("4e6cef69-a548-487b-955e-8adc622a6640")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("0ea47ed9-f2ca-4f5f-94ad-31bbf0d66811")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("dc9629c5-df9a-4433-b7bf-a489330d1588")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("c98e6526-dab8-414a-a8fa-09fedf07c0ee")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("d0b18ec5-67a4-4063-9248-ddbcb473ddd8")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("992430bf-de5d-452e-9fff-2ae64f7ee717")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("01660ccd-2517-4666-9973-314874abe286")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("478563b3-d105-4bdc-a4e2-70f59934bdac")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("42d2e413-737b-4960-b9bd-15181f41c330")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("17effe42-169d-4cad-8bb3-8ec962daf588")
        public static SmDependency getLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkDep;
        }

        @objid ("7c896b17-09f4-4360-945d-3051ace56ee1")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("6b9599aa-626a-49e2-be62-14ab305a62d9")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("d7855b15-8d7c-4853-8171-744ded074959")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("e4b4e68b-0de4-402b-b4e1-8748d5ed5381")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("0ea207cc-66c1-4aeb-b79c-f2a5807d4e0a")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("3df2b971-f328-444c-ad9f-d5f933f049db")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c0bea01e-4728-4998-ba0f-4002a4c887ab")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("007a2af6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("20224f25-84d4-4e87-a27e-5eac2b0e66cd")
            public ISmObjectData createData() {
                return new LinkEndData();
            }

            @objid ("15e0ab6b-bd74-4584-9c14-ba69b33e48c0")
            public SmObjectImpl createImpl() {
                return new LinkEndImpl();
            }

        }

        @objid ("007b16fa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("f45747a7-d291-4a8a-8252-f87ec83cf3bd")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsOrdered;
            }

            @objid ("19d6e5cb-ad43-4351-b2b4-fa4037d885dd")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("007b8158-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("f73caaef-7ab4-4a41-ae81-d9db7e11a46b")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsUnique;
            }

            @objid ("cfd5b260-9333-4c4c-8b55-b21691dd86d6")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("007be396-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("9570d30d-57da-4e65-8ea6-21e1957d50ad")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMax;
            }

            @objid ("c1981494-10b5-4c9b-9934-a70442bd2c0c")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("007c4516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("473aefba-ff5b-4a8e-a3fb-4bf8b0db9ed4")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMin;
            }

            @objid ("9b32319a-76bd-4ca4-a0a6-aa4b8c978810")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("007caa7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("ecf13389-5400-488b-b513-54978591f977")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mConsumer;
            }

            @objid ("13998a29-6314-4c36-8b03-65673fe1096e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mConsumer = value;
            }

            @objid ("8b46c62b-d40d-44ff-b7bf-b509554effec")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.ProviderDep();
            }

        }

        @objid ("007d9786-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("94a0844c-bfd8-411f-97f6-6855bccf57a4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mModel;
            }

            @objid ("0b935db4-7f43-4520-adb4-53ca26c78b8e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mModel = value;
            }

            @objid ("88054f14-6f74-4dad-95de-84d354c570c7")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OccurenceDep();
            }

        }

        @objid ("007e1c10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("a531ab52-119e-48fa-9cab-c2ab6b62ff11")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mProvider;
            }

            @objid ("ccd77a4e-8504-4e7f-8231-8428b89e3116")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mProvider = value;
            }

            @objid ("afb1b230-9407-40bf-8c9c-eb561eabd016")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ConsumerDep();
            }

        }

        @objid ("007f0526-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("5f8767a0-06f8-41aa-a83a-289369073003")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkEndData)data).mRealizedInformationFlow != null)? ((LinkEndData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("8ee577c9-735e-42e0-b08b-ffb58cf57247")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkEndData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((LinkEndData) data).mRealizedInformationFlow;
            }

            @objid ("96138a29-018d-4845-b693-33319e28ff76")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingLinkDep();
            }

        }

        @objid ("0030b858-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("5cd379d4-ca8d-443b-8c17-0f103541d97d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mSource;
            }

            @objid ("60e62ad8-33b0-42ea-bd26-14ff4497151c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mSource = value;
            }

            @objid ("1496dbad-167e-42f9-959f-2a324e70b8c0")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedEndDep();
            }

        }

        @objid ("0032eac4-18c8-1080-943a-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("212b3b86-0d58-4439-9a40-9564c5054207")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOpposite;
            }

            @objid ("aedbeda1-ca0b-42de-91c4-5748f3b2e60e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOpposite = value;
            }

            @objid ("7fc6bf56-69aa-4e4c-a644-514f97d4cc54")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("00339c62-18c8-1080-943a-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("aad16190-3c47-448a-8eed-7e530c32e7b1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mTarget;
            }

            @objid ("7b237763-e0b3-4900-9963-9290342c63b2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mTarget = value;
            }

            @objid ("d4ddd5f6-b208-4f26-8221-9de9c5fdd8dc")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00934572-7aa2-10a2-abe4-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("aeff6c07-8c9f-41ed-bdc7-f6b9522529de")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOppositeOwner;
            }

            @objid ("2506219a-a1b7-4d40-8795-717d26975892")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOppositeOwner = value;
            }

            @objid ("80ce372f-0e72-44ae-a623-2a1d08a6ad66")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeDep();
            }

        }

        @objid ("bdd20b30-8417-4bd1-8e9c-0b4efa7811d6")
        public static class LinkSmDependency extends SmSingleDependency {
            @objid ("9a40eb9b-3ffd-4230-a5bf-08393e6088a0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mLink;
            }

            @objid ("dbffbd88-3ba9-4f33-9bf8-24afb24d5c55")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mLink = value;
            }

            @objid ("6f558e60-a6af-4057-a30f-a93da2ba06e6")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.LinkEndDep();
            }

        }

    }

}
