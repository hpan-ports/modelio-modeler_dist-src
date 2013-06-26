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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndImpl;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
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

@objid ("00768072-17e8-10a1-88a0-001ec947cd2a")
@SmaMetaClass(mmClass=NaryLinkEnd.class, factory=NaryLinkEndData.Metadata.ObjectFactory.class)
public class NaryLinkEndData extends ModelElementData {
    @objid ("041825b0-60e3-4dec-973b-7cbcda178077")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("891e4b6f-1049-41e2-b3ae-30ee0b7a9767")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("86a52cdf-1c35-491e-bf8d-86fb28a27623")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("cae84cbb-ad1f-4d2d-baf8-b86954268644")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("65048148-6fcc-4988-9ae8-92af6fd7c7ce")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("386a2ecb-6441-424a-9523-f3cd77bb7147")
    @SmaMetaAssociation(metaName="NaryLink", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryLinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryLink;

    @objid ("92dab7dc-8e8d-4781-877f-fa673ccebcdf")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("6bcbcd5e-173d-49d7-971d-f1b6c44683be")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("922b3d83-f425-4d6a-8946-1710270c2bbd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00278b02-17f2-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("e564bdbb-8de6-4f1f-b9bb-580f063f87e7")
        private static SmClass smClass = null;

        @objid ("481b693d-2894-41b4-a02c-1185d4f6a569")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("cca38ef5-abb9-4b7e-989d-4c7af0f775de")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("4a4a6d82-5956-488e-ba46-9cc57e6fd8bd")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("ad0011a9-e527-4387-8ba2-91b8e6bdbba3")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("5fd29e7d-383b-424b-b686-2497345a5dd1")
        private static SmDependency SourceDep = null;

        @objid ("9f00ccbb-6e35-4219-be45-e8d13060263a")
        private static SmDependency NaryLinkDep = null;

        @objid ("0fb96b93-628d-41b4-b827-0380bf56b76a")
        private static SmDependency ConsumerDep = null;

        @objid ("c9b7cc4a-204f-4444-84a5-ed7aadce0d74")
        private static SmDependency ProviderDep = null;

        @objid ("151bcf3c-0ca2-4bee-866f-30b887e25005")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d9f25232-d84a-4ddf-9435-2e3570681b8c")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("87516784-bddb-45e2-9272-19476eb43c82")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("2b431727-55dd-4ba7-9871-bd022e05d0fd")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("dbf43b5f-fb84-4eae-bf4a-64d59aa97bdb")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("e93a04cb-2b02-4632-9a3c-29e2986058fd")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("dfad036d-e2a9-4e56-bb93-c16c36f96af7")
        public static SmDependency NaryLinkDep() {
            if (NaryLinkDep == null) {
            	NaryLinkDep = classof().getDependencyDef("NaryLink");
            }
            return NaryLinkDep;
        }

        @objid ("76c98a6d-476f-4c53-ad75-f4b0b4b3dc1a")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("db9854be-d5b4-4afb-880d-611331f583a6")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("2011e1ef-a12e-4d7d-9644-ff2611e7d2be")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("5a0b97a2-5ec9-419a-b3f0-d0c49f95250e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("45cecbc8-21fc-40ac-bf5a-4fe36915ff53")
        public static SmDependency getNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkDep;
        }

        @objid ("beca0000-41d6-40f1-8c7a-63a3a344c98d")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("a1b25f91-cf39-455e-aab1-361aedfe8789")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("3a3a253f-f771-4143-ab6d-97dcfaf2b5c1")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("35ba5327-89a3-46b9-a625-c08ed8c56472")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("36de9a27-4f25-47ed-9d9b-452a4c1d1ba3")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("4a4a4529-63ed-43a5-900c-87569bdf74b3")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("0027db5c-17f2-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d30521e4-69e9-4a34-8c0f-48c0305db03a")
            public ISmObjectData createData() {
                return new NaryLinkEndData();
            }

            @objid ("a64f9fd3-6542-479e-8946-2acab332ec55")
            public SmObjectImpl createImpl() {
                return new NaryLinkEndImpl();
            }

        }

        @objid ("00286748-17f2-10a1-88a0-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("c6a358bc-1b5f-4166-b2b5-c53a07ce44bb")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsOrdered;
            }

            @objid ("ce1df966-c2de-42c4-99ed-d49c33254653")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("0028f0aa-17f2-10a1-88a0-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("fb092be1-1084-444c-b9f5-58efe5c4231f")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsUnique;
            }

            @objid ("73e769eb-1344-48bc-85dd-1fdc2abf16c3")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("00297ad4-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("e0c53c40-a815-40e3-bc05-31d724b24187")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMax;
            }

            @objid ("7b6b8857-86f4-4392-b419-d22914bce65c")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("002a0530-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("6cd57a38-45d6-41fe-91c8-8e7f324694f5")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMin;
            }

            @objid ("72b17cb7-ea68-4971-894e-743540ed3c20")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("002a9194-17f2-10a1-88a0-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("409b1bac-00bb-466c-b25a-f10f866a53b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mSource;
            }

            @objid ("43119905-046a-43f7-acc5-1cba6fdc45fe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mSource = value;
            }

            @objid ("39492c33-33a9-4b53-9af1-cdb0e1fad1f5")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("002b4bca-17f2-10a1-88a0-001ec947cd2a")
        public static class NaryLinkSmDependency extends SmSingleDependency {
            @objid ("c6d1f26d-66f4-4b82-871c-de275cf481e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mNaryLink;
            }

            @objid ("97063bc5-8ee4-44d6-9a35-d6450a6c2a9c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mNaryLink = value;
            }

            @objid ("04c70782-78a6-469a-b074-fc440a2189bb")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.NaryLinkEndDep();
            }

        }

        @objid ("ba7d51f6-e3d1-46bc-8d3a-43bdb5894c2e")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("aa081022-890f-4c22-a1c7-bc82ea7f9bf4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mConsumer;
            }

            @objid ("0ff64d35-bf13-4b72-aa37-a4a22cdd42ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mConsumer = value;
            }

            @objid ("9ff48480-3992-4f62-a465-a2f58fc0344a")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.NaryProviderDep();
            }

        }

        @objid ("99c20131-c983-4eb7-8924-7e50c52eaee3")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("dba4fb24-06ee-4e2d-a576-0b9bd7f12ec5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mProvider;
            }

            @objid ("edc9e41f-8b49-4869-8d4a-e425e726105e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mProvider = value;
            }

            @objid ("304f697f-e1f0-43d9-a8cd-00b6f3cc84d2")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.NaryConsumerDep();
            }

        }

    }

}
