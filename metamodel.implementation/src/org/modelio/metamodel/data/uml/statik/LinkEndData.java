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
    @objid ("da8ef6d2-ef19-4fb0-ba8a-196d82abcab5")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("791e54de-28a9-4b21-9403-8f94ebe71e65")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("e1951e5a-ebd7-4eac-af8e-0757bf8e94d0")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("b3c49b6b-5a91-4bd7-bfcf-0de403ac3a89")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("2f6fbbc1-80f5-4f3b-9e65-c8c6e5d1bc0c")
    @SmaMetaAssociation(metaName="Link", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.LinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mLink;

    @objid ("ce05863e-bba0-4e9f-8510-d617f2e2816a")
    @SmaMetaAssociation(metaName="Target", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("9fd2341a-3f07-48d2-8484-2e40b7d6b32a")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("077445bf-3b87-498e-9fc0-b58f582c88d6")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("1584cf1a-e26e-4ecf-9f4b-cc7a46039063")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("d9a16df3-c8b1-49fa-a5a8-075e2a052d9e")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("65a34b5d-e6cb-4f02-b7d5-8d1c326f5e83")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=LinkEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true)
     SmObjectImpl mOpposite;

    @objid ("cd2d50c5-83fc-4e7e-8149-ba09f63a8a73")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("9396179b-fc70-4ef2-b146-34a2fb81dbbc")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("d362188f-626a-4360-a43c-a3927abb4fe9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0079d614-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("74a4a0e5-dad1-488e-b4df-ce488227891f")
        private static SmClass smClass = null;

        @objid ("9d9171b7-fece-450a-9a11-c2a1f7b834b5")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("2fc7281d-6f6e-4d75-9357-b18b685e2ff0")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("439eb5d0-b6e1-45c3-8c46-6de0ef6b7b88")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("bf493db5-fbeb-46c8-9762-f9fe023fb9bf")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("e6a6057d-f96e-4b0b-8464-f79c7f5395f2")
        private static SmDependency LinkDep = null;

        @objid ("bd76ed80-b287-4167-86aa-7fceab12dfc8")
        private static SmDependency TargetDep = null;

        @objid ("ebb94b42-33dc-4786-a578-2f481897588e")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("531cdffe-4fbf-4a72-84ad-d3ebe93dee59")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("cc458505-3b83-4bbe-93fc-a8a2f024c26a")
        private static SmDependency ModelDep = null;

        @objid ("f112f627-9f9c-4662-8563-fd04ebdefd72")
        private static SmDependency ConsumerDep = null;

        @objid ("436a9ada-cd22-4d84-a939-6931e1c4dd30")
        private static SmDependency OppositeDep = null;

        @objid ("abfab358-b5a9-4e5a-b1e5-017fde4ebbe0")
        private static SmDependency SourceDep = null;

        @objid ("313a793d-dbae-420b-96be-f5ef8fbbd2d3")
        private static SmDependency ProviderDep = null;

        @objid ("18584027-31a7-4977-a994-caa5d3114e83")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c1f8a0f8-c3df-4950-b50e-3ec4c2a01d20")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("bee69605-6702-48c9-b407-d22fb47eb2dd")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("a988d8ff-3335-479c-9d4a-c5e5a33dd8e7")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("dd40fec1-0e40-4190-8fa1-7b8afd170f7c")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("1b7de634-b82d-4187-bede-31fee8ed85ad")
        public static SmDependency LinkDep() {
            if (LinkDep == null) {
            	LinkDep = classof().getDependencyDef("Link");
            }
            return LinkDep;
        }

        @objid ("e2714922-05f9-4cc8-8df7-8aebad742cd5")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("fa48c4ce-4a35-4005-bf91-2cc9277972ee")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("f271b25c-4039-4e3d-81f5-cd4cc639b711")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("9c636988-527d-43f3-a58c-932a1afa9636")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("94e08f0a-dfcf-4afd-ac06-9de33e26339f")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("8044031d-7485-4932-971e-b8b699de04b0")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("94d5cd49-f9fe-42fa-af96-d655a975455f")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("a07179e3-faa0-482b-83a4-ef35a00ce94a")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("e2c81fb7-0cf1-4cb5-8f6a-6764d331315d")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("a9b515d7-323d-48ef-9111-551f1825aad4")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("47d34c52-f929-4bbd-8a0d-14ee3a3e6303")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4911a89d-46e1-4773-aa77-2773e22e0b0f")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("98d5955a-205a-4314-91b2-678e42c2f950")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("51e5e2bc-d1ff-4008-90dd-5e90142e2f46")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("41f288da-c1ad-4a16-ad01-aab3a102b7bd")
        public static SmDependency getLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkDep;
        }

        @objid ("d7722353-ae3b-46ed-8fec-2239b9e90f13")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("ed9786d5-0959-4640-a824-bb5e2ae40493")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("fd3053dc-cb39-4f23-8906-a5240a373066")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("f60e72b7-7be0-45a8-8c15-d79c2cd05e92")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("39aa64e1-cec0-48e2-9e1f-b52bea9dd921")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("b6ea2203-7b0d-41fa-861c-a299b9e2594c")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("0f00966e-7ad8-41ad-9a5a-efcc2fb170ed")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("007a2af6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b3162625-0fe5-4815-b845-06122edee3dd")
            public ISmObjectData createData() {
                return new LinkEndData();
            }

            @objid ("50f7474e-f597-4b6c-bfc1-38254d866ad4")
            public SmObjectImpl createImpl() {
                return new LinkEndImpl();
            }

        }

        @objid ("007b16fa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("9d070183-21d7-46c7-b387-71e02e39f21f")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsOrdered;
            }

            @objid ("778905ef-7e8f-42e2-a7bc-69c73e08e57b")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("007b8158-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("fbb5862d-b54b-4132-8b59-875c88552d9f")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mIsUnique;
            }

            @objid ("5fb69a86-7aaf-4701-b7c5-076648f887f4")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("007be396-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("c1393c48-f506-4fbe-b259-9704909f77d6")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMax;
            }

            @objid ("3cd2116d-2ba7-4851-9631-4a79a04df612")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("007c4516-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("5f74d6d0-0d51-427b-a541-ae1c444e04f9")
            public Object getValue(ISmObjectData data) {
                return ((LinkEndData) data).mMultiplicityMin;
            }

            @objid ("e872e4fb-cd74-4d43-89d9-91e9edc98fd3")
            public void setValue(ISmObjectData data, Object value) {
                ((LinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("007caa7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("a7169a82-8a47-4268-a6d6-355b655c6825")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mConsumer;
            }

            @objid ("00af8477-1ff5-4733-91b1-2078ace02eb5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mConsumer = value;
            }

            @objid ("a629739e-8cef-46e9-994e-f895e6544d33")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.ProviderDep();
            }

        }

        @objid ("007d9786-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("a431d837-f1e0-46f8-b9bc-0b7e955df81d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mModel;
            }

            @objid ("34c88318-f945-4634-9a81-e50fb3a197ba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mModel = value;
            }

            @objid ("a5b43199-a3b7-47b9-b144-1fe8a787a750")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OccurenceDep();
            }

        }

        @objid ("007e1c10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("dfe2e2d7-03b9-4b67-b546-d99a306b64ef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mProvider;
            }

            @objid ("377592db-2177-4876-a724-338baf86ac26")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mProvider = value;
            }

            @objid ("64caf346-0ce6-4847-a6e4-4640bf87bd88")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ConsumerDep();
            }

        }

        @objid ("007f0526-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("5fef5b21-e02e-4b3d-bbd7-eacf220eccfd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkEndData)data).mRealizedInformationFlow != null)? ((LinkEndData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("2c0bb594-cede-4d5c-9d78-ad6cd2081371")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkEndData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((LinkEndData) data).mRealizedInformationFlow;
            }

            @objid ("a99e2951-aedf-45db-b6db-75a0dbb6dc1c")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingLinkDep();
            }

        }

        @objid ("0030b858-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("c47548b0-d6ac-4164-a26b-456bb9045e62")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mSource;
            }

            @objid ("7fc5524e-a9ee-4b81-b67f-ca24df34355e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mSource = value;
            }

            @objid ("6090f6a5-14f1-441c-860e-20f6e343eb99")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedEndDep();
            }

        }

        @objid ("0032eac4-18c8-1080-943a-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("3528159d-412b-4c8e-b461-4999ade55501")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOpposite;
            }

            @objid ("3694e136-7ff5-46a2-95ff-29f13c08cc3a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOpposite = value;
            }

            @objid ("c100d012-e871-4c59-bab9-04e1d18376f2")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("00339c62-18c8-1080-943a-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("8e1d4238-c2f3-4675-958c-e4ea06356c40")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mTarget;
            }

            @objid ("e7e550dd-1546-4adc-b862-14b3c4f28ecc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mTarget = value;
            }

            @objid ("d92bfa95-1ece-4e67-9894-ea153c148220")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00934572-7aa2-10a2-abe4-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("e7ffc7fc-a0a6-4e88-83b4-faa7329ec426")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mOppositeOwner;
            }

            @objid ("58ee228d-0cf3-4353-a520-46e12d37d0c6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mOppositeOwner = value;
            }

            @objid ("317e973b-e603-4a4b-a6a0-7910bf3af876")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.OppositeDep();
            }

        }

        @objid ("bdd20b30-8417-4bd1-8e9c-0b4efa7811d6")
        public static class LinkSmDependency extends SmSingleDependency {
            @objid ("e503816b-ca51-44e0-b69b-eab24e238a45")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkEndData) data).mLink;
            }

            @objid ("a2065aa8-8b84-4828-a1fa-8efbcd9e1c50")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkEndData) data).mLink = value;
            }

            @objid ("ef23b1d9-9820-4652-8379-0c45c4dbcc09")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.LinkEndDep();
            }

        }

    }

}
