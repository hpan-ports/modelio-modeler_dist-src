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
    @objid ("db50226b-2e27-4dd4-89cb-3ee2886aa12d")
    @SmaMetaAttribute(metaName="Changeable", type=KindOfAccess.class, smAttributeClass=Metadata.ChangeableSmAttribute.class)
     Object mChangeable = KindOfAccess.READWRITE;

    @objid ("a840df40-9f5d-4361-b864-ede18ac1db55")
    @SmaMetaAttribute(metaName="IsDerived", type=Boolean.class, smAttributeClass=Metadata.IsDerivedSmAttribute.class)
     Object mIsDerived = false;

    @objid ("46706113-aae5-46f2-b458-5b0fa43be826")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("c52233ed-8365-4693-b441-3e1586506e62")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("4a961745-b8bc-4361-99c5-d765ccce87d9")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("08f1f4db-fbbd-4b6d-9f3f-7613b2f3f0c4")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("d136948d-b4ae-4eaa-8237-506cd17b724e")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("1bbb61f8-13ad-424c-8854-6b4b21a5c451")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050fc6c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("565c4ac0-519e-4132-b4e1-7856c5881664")
        private static SmClass smClass = null;

        @objid ("df1d5892-3a84-402d-94ec-01070e99f934")
        private static SmAttribute ChangeableAtt = null;

        @objid ("1c754100-7423-491a-9bc7-d04ac49debcd")
        private static SmAttribute IsDerivedAtt = null;

        @objid ("fea8e16f-2418-48db-8c96-72bdc25c115f")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("23a71cca-5858-4b8a-873a-2461bd0f132c")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("ed6dd251-ccd4-4025-a68d-f6fb1168f04c")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("ac9c6961-0ded-4214-9bd1-c729dae1a08e")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("fb35f5b2-4cfa-4343-b2e8-7c91666c3ee4")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("e02bd21d-e829-4776-816b-838e8e53b44b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("37c8e332-5c11-439f-a955-f3162b8b98c2")
        public static SmAttribute ChangeableAtt() {
            if (ChangeableAtt == null) {
            	ChangeableAtt = classof().getAttributeDef("Changeable");
            }
            return ChangeableAtt;
        }

        @objid ("5e5b4301-7d25-4cc0-856a-25f868bf31dc")
        public static SmAttribute IsDerivedAtt() {
            if (IsDerivedAtt == null) {
            	IsDerivedAtt = classof().getAttributeDef("IsDerived");
            }
            return IsDerivedAtt;
        }

        @objid ("2f107a90-9786-4fac-864b-f0cb04cc4a63")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("32c8ed12-dc5e-4e2c-8d2d-ce2b0c2b122b")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("540335fc-38d7-44e5-8dc3-f4f28a318946")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("a120caea-c224-4838-9605-acc41cd465dc")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("22a7316f-815c-4ed4-80c8-41ae7de56bda")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("797e97b6-02a1-493a-be6c-2252dd0eca4a")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("28710f9e-7a46-4155-98ba-f76024122832")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("47ac33db-29cb-48da-888e-66177e0013bf")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("59d557dd-9ba1-4376-9c7c-2b4628ae40e9")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("34ef51df-e30e-43b2-a290-7e216b8f5b64")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("be46c1bd-a60c-4e36-abd2-ddc52e243658")
        public static SmAttribute getChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeableAtt;
        }

        @objid ("7beb0ae9-3b99-4996-89ff-a4f416f5796f")
        public static SmAttribute getIsDerivedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDerivedAtt;
        }

        @objid ("5b9178b6-1108-47d5-8fe6-3ea3f66f0ec6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00513d94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2518b211-4dd9-4889-b7c5-4c80c7590389")
            public ISmObjectData createData() {
                return new StructuralFeatureData();
            }

            @objid ("334d49bb-bfe3-4a22-9c22-d8db6e3e0ddf")
            public SmObjectImpl createImpl() {
                return new StructuralFeatureImpl();
            }

        }

        @objid ("00519f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ChangeableSmAttribute extends SmAttribute {
            @objid ("c36be01e-c7f7-403b-af01-36117546fbfb")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mChangeable;
            }

            @objid ("bb5bab4c-d4b5-4451-8b76-acd24f39e894")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mChangeable = value;
            }

        }

        @objid ("0052065c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDerivedSmAttribute extends SmAttribute {
            @objid ("e98cbd62-25ab-4f13-943c-b5da98f49109")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsDerived;
            }

            @objid ("968f6d22-bc19-41a2-a089-8c35db9c57c0")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsDerived = value;
            }

        }

        @objid ("00526840-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("2d69215f-c551-4565-879e-a89b63340ff2")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsOrdered;
            }

            @objid ("e8b493be-0422-4912-b8ff-7d616fcb2c33")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsOrdered = value;
            }

        }

        @objid ("0052ca06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("0a8e3566-c4da-4d36-8ebd-cdf7581e66a6")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsUnique;
            }

            @objid ("5ec85d12-77a6-46dc-84c4-eb4f28c8b82f")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsUnique = value;
            }

        }

        @objid ("00532dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("41ceaba5-3539-4581-b2d8-5058c0b641b4")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMin;
            }

            @objid ("c965e0b5-eff8-4a22-b5bc-a73b0ed95080")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0053922e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("0e77d1ef-e1ad-4372-ba68-4c90185d7944")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMax;
            }

            @objid ("6e20a8a6-7dff-4df0-9b0c-0eb97bef7e02")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMax = value;
            }

        }

        @objid ("0053f854-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("6439420c-6e34-48e2-840d-a69550d349f1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuralFeatureData)data).mRealizedInformationFlow != null)? ((StructuralFeatureData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("5504c3e3-6c33-460f-a21e-51a4240925fe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuralFeatureData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((StructuralFeatureData) data).mRealizedInformationFlow;
            }

            @objid ("c5d0ab6b-18e6-4543-ba99-7961ca67c606")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingFeatureDep();
            }

        }

    }

}
