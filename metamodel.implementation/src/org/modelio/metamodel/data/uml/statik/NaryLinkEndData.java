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
    @objid ("cce4fe84-e459-4e1a-9793-f599a5e2dfbb")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("bfbf75cb-5dd1-4bae-aa05-481f96c31085")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("4265f496-4d0f-4201-9179-bd8054ae30e2")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("4f89fe70-81a8-48ed-8d36-c88774243316")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("d091e582-fa67-45a8-90ee-b05ed8a71f91")
    @SmaMetaAssociation(metaName="Source", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("1ec771c8-d12f-4bb6-96ab-f17594763ba5")
    @SmaMetaAssociation(metaName="NaryLink", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryLinkSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryLink;

    @objid ("2f4677f3-3cb0-4519-8476-6f79cb712f31")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=RequiredInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ConsumerSmDependency.class, partof = true)
     SmObjectImpl mConsumer;

    @objid ("236e0f27-8650-4ff8-8719-033c91f7ac92")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=ProvidedInterfaceData.class, min=0, max=1, smAssociationClass=Metadata.ProviderSmDependency.class, partof = true)
     SmObjectImpl mProvider;

    @objid ("c4e8ea18-8db9-4958-aa80-7ad13ea7ed30")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00278b02-17f2-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("aedb4480-1f5f-404f-917a-da4c8b21bfd9")
        private static SmClass smClass = null;

        @objid ("5839d7ff-d6f5-467d-85ee-2037c788856c")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("44cf5dea-b421-4350-870b-f03fd4c05038")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("71432fd3-9ab2-4f88-bc0f-2c85b4b56fe8")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("4f2f5df2-f309-4926-a516-562ca4557fe6")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("f41f9b88-0a90-4d1a-a0c3-096075837435")
        private static SmDependency SourceDep = null;

        @objid ("ce418234-e6e7-4d04-8a06-ed43e352e94f")
        private static SmDependency NaryLinkDep = null;

        @objid ("54623587-b1e7-416b-962e-bc8ecee7a684")
        private static SmDependency ConsumerDep = null;

        @objid ("f69a3374-ad10-455b-931c-f021e3be148d")
        private static SmDependency ProviderDep = null;

        @objid ("67cd1ea7-73f4-47e7-bcbf-a785c40c37ac")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryLinkEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("74b814a7-d04b-4ad9-b10f-c4fe4e4f1adc")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("74b9cd07-d5e9-4e51-9e88-fad2ce70be15")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("f3e03463-0187-4df9-a94b-cb8ee944e12c")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("9c649090-4983-4a2a-8b7f-3323e89ebc03")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("f0a7940d-612b-49fa-b73b-2db3e93493ca")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("1cdb49ef-1d62-43c2-b8a0-ca35321507f1")
        public static SmDependency NaryLinkDep() {
            if (NaryLinkDep == null) {
            	NaryLinkDep = classof().getDependencyDef("NaryLink");
            }
            return NaryLinkDep;
        }

        @objid ("d54b583f-7ec6-4eb2-9907-63e61945f776")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("21e3e225-6ca0-4016-abea-662637c9b039")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("6ec6a726-a22f-403a-8493-d0f664543ab9")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("5cb89fa6-f822-4887-8175-980959707283")
        public static SmDependency getNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryLinkDep;
        }

        @objid ("7d5847bb-3e16-43a1-8770-35935d46f923")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("06121875-57d2-4e0a-941e-34efb5646e5a")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("712136a9-6fbd-4bd3-93cb-4af50130d6c3")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("bb8c48ad-3cf5-4a5b-98ab-77a5b84a4e28")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cdf47458-09e0-41c9-9358-8d1f7dd7cdd0")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("18260be0-6da2-4e1a-871b-8fab376be2af")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("696f1602-4dc3-400a-91a5-65ada48e8f33")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("0027db5c-17f2-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("07c979ee-3179-40e9-b57d-fb44235797a8")
            public ISmObjectData createData() {
                return new NaryLinkEndData();
            }

            @objid ("7a504772-238e-4c81-8051-33e3a52e20da")
            public SmObjectImpl createImpl() {
                return new NaryLinkEndImpl();
            }

        }

        @objid ("00286748-17f2-10a1-88a0-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("3dd2efc0-d49d-401f-9e19-a8120655e5fa")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsOrdered;
            }

            @objid ("9b1aadca-cc38-436b-8830-e4dfc44a994f")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsOrdered = value;
            }

        }

        @objid ("0028f0aa-17f2-10a1-88a0-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("37bb7146-0c15-4584-a0f0-8f4e347d1212")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mIsUnique;
            }

            @objid ("004fd19d-68d9-49c6-be96-70efcb8936f8")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mIsUnique = value;
            }

        }

        @objid ("00297ad4-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("a2f9bbf8-a070-4818-b928-80e8da52a5de")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMax;
            }

            @objid ("87327c47-09fe-45a5-8818-ddf5e0f8179d")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMax = value;
            }

        }

        @objid ("002a0530-17f2-10a1-88a0-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("d7c1f6b2-cd41-41cd-96e1-44fb0738fe3b")
            public Object getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mMultiplicityMin;
            }

            @objid ("495335cd-ead9-498a-a91f-0c4917b5a555")
            public void setValue(ISmObjectData data, Object value) {
                ((NaryLinkEndData) data).mMultiplicityMin = value;
            }

        }

        @objid ("002a9194-17f2-10a1-88a0-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("896df477-7d02-463e-8652-0e2b7418fe08")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mSource;
            }

            @objid ("f9baaa2a-a3b6-4b9c-806d-8f603556ac80")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mSource = value;
            }

            @objid ("32373c3d-5ec1-4f9f-822b-3bd0204c1c11")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("002b4bca-17f2-10a1-88a0-001ec947cd2a")
        public static class NaryLinkSmDependency extends SmSingleDependency {
            @objid ("a0eaf959-5b61-4806-958a-9426d530b8d6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mNaryLink;
            }

            @objid ("2fd9696e-f00f-4cb1-8b0a-8562a9797097")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mNaryLink = value;
            }

            @objid ("cba22461-ec68-4e8a-ae42-b674607092c6")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.NaryLinkEndDep();
            }

        }

        @objid ("ba7d51f6-e3d1-46bc-8d3a-43bdb5894c2e")
        public static class ConsumerSmDependency extends SmSingleDependency {
            @objid ("c3a9e82f-7a06-444b-b4de-e907d809cfbb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mConsumer;
            }

            @objid ("808838ab-220d-4219-859e-597cb6acc449")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mConsumer = value;
            }

            @objid ("6b71d215-8388-4626-a1f0-a85cef3d1567")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.NaryProviderDep();
            }

        }

        @objid ("99c20131-c983-4eb7-8924-7e50c52eaee3")
        public static class ProviderSmDependency extends SmSingleDependency {
            @objid ("6442d18b-5b1b-4ffe-961e-ff9254b4174e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryLinkEndData) data).mProvider;
            }

            @objid ("2fa06930-c208-4376-ba69-db6bd94aabd4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryLinkEndData) data).mProvider = value;
            }

            @objid ("38080017-5f4d-445e-aa9d-00fadf340ddd")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.NaryConsumerDep();
            }

        }

    }

}
