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
    @objid ("01183414-6a6d-439e-b5be-de33dc7195b6")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("ffa0eabc-d59f-4380-921b-5a6b15df93f7")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("6e8b0ff0-0813-4b8e-99d5-24fc0b80af79")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("531cbf12-7f83-4163-ab52-f6d5d5f2dca9")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("a2496db3-0713-48dc-a7b9-95846adcc98f")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("9b62319f-926f-4310-9905-da461de4147d")
    @SmaMetaAssociation(metaName="NaryLink", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryLinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryLink;

    @objid ("2052fb9f-9c68-4122-9851-1baa66927c26")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("abc7838a-42ad-41ad-9946-4c43ba5c5212")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("78a137ae-f80b-4c60-927d-e14bff0ed9d7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00278b02-17f2-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("f3aacb53-8aad-4e17-8c0d-01eeab1717be")
        private static SmClass smClass = null;

        @objid ("df3f95aa-8ae2-4f4d-91ce-ceca0050d1fa")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("92499147-e5ed-4af1-96d1-1728738efb8a")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("b52bcffa-5650-4f60-a17b-51f4a9513e58")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("beae0029-d5e4-4c9b-b732-1415a5fb0541")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("c2316317-0ba0-4940-aff7-a392a2486aea")
        private static SmDependency SourceDep = null;

        @objid ("320b2cd4-08c4-4c20-a1b9-73e795e48a99")
        private static SmDependency NaryLinkDep = null;

        @objid ("9dc1e454-dca9-4a24-a6f3-6e7d3c291a58")
        private static SmDependency ConsumerDep = null;

        @objid ("62c2c01f-0b9e-4886-aec4-ee43790ff60f")
        private static SmDependency ProviderDep = null;

        @objid ("bd99c267-6ed2-45ab-9f81-60125bc354e8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("95f88342-615a-4f0e-b089-8bb14bddca46")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("7cd85a7e-4c43-4aa9-9986-6c1bc338c97b")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("11737cc6-78b2-4e76-be37-485b154affba")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("19d9eed9-b541-4b14-b4ed-cc2f5800be98")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("1af57171-8b49-46bd-9e0d-23642815078a")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("41d54c9f-b43d-48b2-b490-58531ee37c21")
        public static SmDependency NaryLinkDep() {
            if (NaryLinkDep == null) {
            	NaryLinkDep = classof().getDependencyDef("NaryLink");
            }
            return NaryLinkDep;
        }

        @objid ("4064afa8-3971-4d15-8a24-fb53b1132f6b")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("beaafcbd-065d-47bf-b136-8b42c19ef671")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("5737434f-14c4-43a4-8df1-2ac65563b9c2")
        public static SmDependency getNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkDep;
        }

        @objid ("56084a48-f527-4ec2-9eea-ee7eb34b89a0")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("cc0d3bff-56f0-4132-ae71-ebcc18eb8258")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("db5ae637-9522-419e-80ea-37d56a88d7d0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ff1882c8-3561-4b62-914b-8d56b16d56c8")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("0a38bc11-96ec-488a-b4dc-113c1030fcf6")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("7f1d0f50-8496-44e8-a8d3-bed145fcf898")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("7f0b7188-72c5-47fa-abd4-39433d5a2593")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("4b4e37ee-0625-4cdf-aad4-d9424640f539")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("0027db5c-17f2-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e9f2c15a-cdd0-4a11-bb6c-e97d4d3e79e1")
            public ISmObjectData createData() {
                return new NaryLinkEndData();
            }

            @objid ("dd905584-a21b-42fb-8b86-93e0333e1d0c")
            public SmObjectImpl createImpl() {
                return new NaryLinkEndImpl();
            }

        }

        @objid ("00286748-17f2-10a1-88a0-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("bad36b0e-3550-4544-8ebf-2ad104d40481")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsOrdered;
            }

            @objid ("a5ce3035-774b-4162-a261-1730cd597277")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("0028f0aa-17f2-10a1-88a0-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("45164cfa-02b2-4ef9-b4b1-4a02b25748e1")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsUnique;
            }

            @objid ("e46c573e-42b4-42b2-9cd4-ec1e2f50a75b")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("00297ad4-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("a5cd22f8-93e6-44ab-a209-f9664cef1eea")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMax;
            }

            @objid ("b6377e78-996a-4840-b2d9-c93003def165")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("002a0530-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("448c7f35-71eb-4a73-887d-335fbfb099b3")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMin;
            }

            @objid ("0ae8eeb0-3a7f-47ac-bf2d-6bbb4ff06a05")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("002a9194-17f2-10a1-88a0-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("38da8d44-f7ed-48ca-a1cc-d0724808b4fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mSource;
            }

            @objid ("7f558f11-3006-4187-9899-dc782b9ddec3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mSource = value;
            }

            @objid ("204fa86c-8c17-4edd-bd1c-4f3a9d592497")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("002b4bca-17f2-10a1-88a0-001ec947cd2a")
        public static class NaryLinkSmDependency extends SmSingleDependency {
            @objid ("c8e03f6c-035e-4a69-88a8-9f8cb007c2e0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mNaryLink;
            }

            @objid ("0e7a6757-2b4f-49b9-8646-47997b80af2d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mNaryLink = value;
            }

            @objid ("f3f8d01e-ac49-4aa0-a5eb-218761d74b77")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.NaryLinkEndDep();
            }

        }

        @objid ("ba7d51f6-e3d1-46bc-8d3a-43bdb5894c2e")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("5d7f59e2-37e9-4a5f-9e41-ed9c50767690")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mConsumer;
            }

            @objid ("a2bb43fa-40c8-4d6a-9185-0c378e7c976c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mConsumer = value;
            }

            @objid ("fa545d5e-da4a-41c8-a936-7794fa62e606")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.NaryProviderDep();
            }

        }

        @objid ("99c20131-c983-4eb7-8924-7e50c52eaee3")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("e8290d4b-3ae7-4614-9d8c-1f8b82659bda")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mProvider;
            }

            @objid ("6ca393fb-a79f-46e4-926f-c4b31dfd78df")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mProvider = value;
            }

            @objid ("b1fc1e15-23ab-4dfd-9ac9-75a7b6288ecc")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.NaryConsumerDep();
            }

        }

    }

}
