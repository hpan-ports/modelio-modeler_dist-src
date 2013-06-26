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
    @objid ("c485479f-91d6-469d-b64a-3fd7a791290d")
    @SmaMetaAttribute(metaName="Changeable", type=KindOfAccess.class, smAttributeClass=Metadata.ChangeableSmAttribute.class)
     Object mChangeable = KindOfAccess.READWRITE;

    @objid ("e1905ec1-bcac-4e55-a544-7be6b5b18ed2")
    @SmaMetaAttribute(metaName="IsDerived", type=Boolean.class, smAttributeClass=Metadata.IsDerivedSmAttribute.class)
     Object mIsDerived = false;

    @objid ("c6ab3c35-3ad9-44f7-9fc4-22de70bc142e")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("f48fb1e9-cbbc-41c2-a90b-bf443a476d13")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("2f8958e7-4b06-4ea6-a2c6-465a693a3004")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "0";

    @objid ("d978cc8a-5bd4-4ac0-9504-c03f12be5707")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("154196b7-b054-4714-b7b8-0358ce1fe300")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("28d4dd8c-4469-41a7-82db-6bd99821de4e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050fc6c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2cbef2a1-43f3-4463-ac71-bb35b28710ea")
        private static SmClass smClass = null;

        @objid ("17488f12-a0fd-41f6-aee0-0431b8fae6c8")
        private static SmAttribute ChangeableAtt = null;

        @objid ("a77a74ac-fd45-42a3-be9a-7f2979f60841")
        private static SmAttribute IsDerivedAtt = null;

        @objid ("1ff14382-2dde-4340-8210-3aabc90ea809")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("78550102-aa6d-4793-a7ae-0fb8c0123a75")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("4b5698a6-3f93-4bbd-8a36-4d3d03ae9ceb")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("e8b1bb97-c58d-4710-a74c-13f690f6f600")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("fc3a651a-5ee7-41dd-b6ae-98e6c9f3e867")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("a1e8496c-01de-4211-84b2-63351b3e1796")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2de2c766-88fb-4bfd-9267-cfe625f7828b")
        public static SmAttribute ChangeableAtt() {
            if (ChangeableAtt == null) {
            	ChangeableAtt = classof().getAttributeDef("Changeable");
            }
            return ChangeableAtt;
        }

        @objid ("b67e4299-5a0d-4d05-a634-c3b9a6139337")
        public static SmAttribute IsDerivedAtt() {
            if (IsDerivedAtt == null) {
            	IsDerivedAtt = classof().getAttributeDef("IsDerived");
            }
            return IsDerivedAtt;
        }

        @objid ("6fbf878e-1389-4833-84c3-ef68ac4db51b")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("2c5a9c14-7a78-4221-9b99-acfe6fa273e9")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("bc29640f-5c1b-42c1-88b1-e203b3164818")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("17f7d80f-3e32-4e81-8b08-e3004fc5b2ad")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("e89b4538-39b5-472b-a4a8-3f304bcf2734")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("19385388-daf1-4877-be2e-fcd9de7fa5a0")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("fbe73577-38c8-4456-a3aa-4a53de4ab41a")
        public static SmAttribute getIsDerivedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDerivedAtt;
        }

        @objid ("b7ef4ef4-4b09-45a5-8271-120dcc936705")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("87b63344-d108-4e14-92f5-bcb120e98302")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("4e8c0c9d-8a3d-4413-9d48-8407004c1118")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("a1b7b523-e3a4-4182-9886-778e1c88f631")
        public static SmAttribute getChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChangeableAtt;
        }

        @objid ("0d40d094-fabe-4f8a-a919-4182b55a12cd")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("d93955f5-1860-4837-a2e7-a162eb377782")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("00513d94-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89b9baa2-c00e-48b5-af88-6de071ee1001")
            public ISmObjectData createData() {
                return new StructuralFeatureData();
            }

            @objid ("87532b43-494d-4a8e-8f86-0f3be19cb64b")
            public SmObjectImpl createImpl() {
                return new StructuralFeatureImpl();
            }

        }

        @objid ("00519f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ChangeableSmAttribute extends SmAttribute {
            @objid ("3fad1e73-f62a-4815-935b-32250ab4d8d3")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mChangeable;
            }

            @objid ("315b4a62-e2b5-46b3-ba73-c91f06801cef")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mChangeable = value;
            }

        }

        @objid ("0052065c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDerivedSmAttribute extends SmAttribute {
            @objid ("8f68827d-3d82-4a8e-81f3-69db3ac4d48e")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsDerived;
            }

            @objid ("560c2837-6d28-4696-9f6a-0f7535a94713")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsDerived = value;
            }

        }

        @objid ("00526840-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("9d4c22e9-48bb-4fcc-859c-f613f6c59238")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsOrdered;
            }

            @objid ("94e196f5-2192-4d5b-914e-931c89110539")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsOrdered = value;
            }

        }

        @objid ("0052ca06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("2ad9f2e6-b46c-4a17-9438-4f5ff4cc9498")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mIsUnique;
            }

            @objid ("91a9b742-397d-44cc-93bf-6ff9fa81aed3")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mIsUnique = value;
            }

        }

        @objid ("00532dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("a69ab053-6d39-463e-b265-915ef1a50bf4")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMin;
            }

            @objid ("997351fd-cca0-47f1-b9f2-916a1045c53e")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0053922e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("f723a989-42fd-4ff3-a08e-1c8345f1cd4f")
            public Object getValue(ISmObjectData data) {
                return ((StructuralFeatureData) data).mMultiplicityMax;
            }

            @objid ("18232825-36c2-4e0a-97d8-0a9e138574ce")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuralFeatureData) data).mMultiplicityMax = value;
            }

        }

        @objid ("0053f854-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("651eeb72-b64a-47af-92d9-e5e3191d4692")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuralFeatureData)data).mRealizedInformationFlow != null)? ((StructuralFeatureData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("508d0e45-ec9b-44fd-afdc-9ca16f7b3485")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuralFeatureData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((StructuralFeatureData) data).mRealizedInformationFlow;
            }

            @objid ("e4b7674d-9eee-4457-941e-76909c1ddb0e")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingFeatureDep();
            }

        }

    }

}
