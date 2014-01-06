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
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureImpl;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.StructuralFeature;
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

@objid ("001f7f70-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StructuralFeature.class, factory=StructuralFeatureData.Metadata.ObjectFactory.class)
public class StructuralFeatureData extends FeatureData {
    @objid ("1330589f-115d-4a5b-8304-a62b81d123af")
    @SmaMetaAttribute(metaName="Changeable", type=KindOfAccess.class, smAttributeClass=Metadata.ChangeableSmAttribute.class)
     Object mChangeable = KindOfAccess.READWRITE;

    @objid ("5c67df4b-ca60-4754-9880-3b9b5fd812e7")
    @SmaMetaAttribute(metaName="IsDerived", type=Boolean.class, smAttributeClass=Metadata.IsDerivedSmAttribute.class)
     Object mIsDerived = false;

    @objid ("f1a18843-79ef-4210-912d-d778d950cc1a")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("8dc4cb5a-7e52-41a7-8300-4d8d119f54a1")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("5d79999f-1da4-4f4d-a816-da9c0f9a9dcd")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("0a6b0da7-6178-457c-af57-c25a0e3e5a6c")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("04b82097-ddc8-4610-b7a2-3b3dd3745d8c")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("282ebaa9-ed1f-4e35-b960-fbee3185b4f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050fc6c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b0dffd9-5c48-494b-9dc2-9ad9694520fc")
        private static SmClass smClass = null;

        @objid ("a8ee93b9-565a-4c23-b104-154cfaf24206")
        private static SmAttribute ChangeableAtt = null;

        @objid ("708f1185-2208-4592-82e6-3cea00718c75")
        private static SmAttribute IsDerivedAtt = null;

        @objid ("09ae63ce-a1b4-463b-a3c8-8f27bdb70533")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("1d380313-9c54-4b9e-af0a-50bfce3d171e")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("2c114f54-aeaf-42e2-9228-7a32e66ebd30")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("06f03388-2944-43f5-98cd-8d748904b8e2")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("0e737857-a04d-44bd-90df-6cda37407c5f")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("affd4fcf-3baf-4d45-97b5-2403958e3965")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("209b5772-af07-41dc-968c-a15e18fe3462")
        public static SmAttribute ChangeableAtt() {
            if (ChangeableAtt == null) {
            	ChangeableAtt = classof().getAttributeDef("Changeable");
            }
            return ChangeableAtt;
        }

        @objid ("4b1504c0-3014-4d21-b6e9-2b780077a8ac")
        public static SmAttribute IsDerivedAtt() {
            if (IsDerivedAtt == null) {
            	IsDerivedAtt = classof().getAttributeDef("IsDerived");
            }
            return IsDerivedAtt;
        }

        @objid ("6479279e-83b6-4b87-9fa5-d721d850381b")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("95e5f2a3-c3ab-4930-981c-95fb45aeb407")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("98ad1c40-0448-4402-80fa-b8149ff626da")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("ca2d8504-2564-4bfe-b225-8b59b5298c55")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("fc97f9f7-a335-4c6f-8a4e-4714cc497043")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("e24df204-875f-47b1-a8de-7aab7fb0569e")
        public static SmAttribute getIsDerivedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDerivedAtt;
        }

        @objid ("83f6d313-e708-44a1-92dd-53c51b2c1e2d")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("a8ee3cc8-0e6e-44cb-a015-fbafd5111880")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("5e92b26f-9996-494b-9e67-d52153b685ec")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("825e8ee9-e462-4293-87aa-0300b3531222")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c299cf53-4283-4702-b864-765fa62345e2")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("197dbd14-44a1-4dd1-abf5-96553e909ca1")
        public static SmAttribute getChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeableAtt;
        }

        @objid ("d4f47f7e-f2d6-4199-aae2-9df7bc9129a0")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("00513d94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("19ba892c-dd58-4b93-a774-9fa9cf31d7cf")
            public ISmObjectData createData() {
                return new StructuralFeatureData();
            }

            @objid ("2a060792-6e3f-447d-a4d1-b046c56696c7")
            public SmObjectImpl createImpl() {
                return new StructuralFeatureImpl();
            }

        }

        @objid ("00519f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ChangeableSmAttribute extends SmAttribute {
            @objid ("1e6a07c5-27b0-4cc3-b9b3-6ba75dbe040a")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mChangeable;
            }

            @objid ("42eac00f-17a4-4e55-a076-7bdbd83c5244")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mChangeable = value;
            }

        }

        @objid ("0052065c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDerivedSmAttribute extends SmAttribute {
            @objid ("b716b480-5416-4127-9b56-f059a10d914a")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsDerived;
            }

            @objid ("1c827c9c-7bea-4534-b386-d36cd3066741")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsDerived = value;
            }

        }

        @objid ("00526840-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("193c18ef-b3d9-4717-9f39-ae9ceea140cf")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsOrdered;
            }

            @objid ("cc53b014-90bc-4bcd-8991-5a4374d0df4f")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsOrdered = value;
            }

        }

        @objid ("0052ca06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("64abeae0-3bbc-4191-a9c2-41f31b81fcfd")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsUnique;
            }

            @objid ("e5691e32-0f3e-4299-ab57-e986ad261e36")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsUnique = value;
            }

        }

        @objid ("00532dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("82fe1645-7d25-40b7-b6ce-291fd17ccd85")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMin;
            }

            @objid ("c4ca5389-34ad-4663-a0e4-d92bfe1dc500")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0053922e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("77c86ff4-4110-48bf-a371-99b631f1fac1")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMax;
            }

            @objid ("e105b2e8-a0d3-47c9-bf40-e5cfcedcaf97")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMax = value;
            }

        }

        @objid ("0053f854-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("ef0e2aa1-3ec5-4e46-bafe-24927db713bd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuralFeatureData)data).mRealizedInformationFlow != null)? ((StructuralFeatureData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("6d6698c0-913b-429c-b292-543c8784cdea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuralFeatureData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((StructuralFeatureData) data).mRealizedInformationFlow;
            }

            @objid ("8f04b17b-976d-42b1-9635-cae2cdd073dc")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingFeatureDep();
            }

        }

    }

}
