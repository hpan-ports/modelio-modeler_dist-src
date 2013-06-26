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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.LocalTaggedValueImpl;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
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

@objid ("0088327c-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LocalTaggedValue.class, factory=LocalTaggedValueData.Metadata.ObjectFactory.class)
public class LocalTaggedValueData extends ModelElementData {
    @objid ("9ef74d78-9da5-471d-9cb5-47f7bbc74549")
    @SmaMetaAttribute(metaName="IsVisible", type=Boolean.class, smAttributeClass=Metadata.IsVisibleSmAttribute.class)
     Object mIsVisible = false;

    @objid ("ec0ca334-c6fc-4c94-9366-c566caee2c24")
    @SmaMetaAssociation(metaName="LocalAnnoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalAnnotedSmDependency.class, partof = true)
     SmObjectImpl mLocalAnnoted;

    @objid ("9acb0078-6019-42e2-bf77-0f384d1b9fa0")
    @SmaMetaAssociation(metaName="LocalDefinition", typeDataClass=TagTypeData.class, min=1, max=1, smAssociationClass=Metadata.LocalDefinitionSmDependency.class, partof = true)
     SmObjectImpl mLocalDefinition;

    @objid ("76a8a09d-4c15-4b40-a7ff-822afd538037")
    @SmaMetaAssociation(metaName="LocalActual", typeDataClass=TagParameterData.class, min=0, max=-1, smAssociationClass=Metadata.LocalActualSmDependency.class, component = true)
     List<SmObjectImpl> mLocalActual = null;

    @objid ("c0541d46-3a02-44e5-897e-8293e7e41e4c")
    @SmaMetaAssociation(metaName="LocalQualifier", typeDataClass=TagParameterData.class, min=0, max=1, smAssociationClass=Metadata.LocalQualifierSmDependency.class, component = true)
     SmObjectImpl mLocalQualifier;

    @objid ("1b01a41b-1b8d-45f7-8dd6-3349f45c75a6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00906712-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("216f3a84-3a32-459e-9beb-8d5ad8fade5c")
        private static SmClass smClass = null;

        @objid ("91da7b2c-fd51-45e3-84ae-964d9579706d")
        private static SmAttribute IsVisibleAtt = null;

        @objid ("bebb9a57-cccd-4cf0-b70c-59407aeb75e0")
        private static SmDependency LocalAnnotedDep = null;

        @objid ("fdc9332b-702f-4703-8bd8-1cb51fa95a0d")
        private static SmDependency LocalDefinitionDep = null;

        @objid ("aefd5435-19ac-48fe-bc72-7a1d9a1759f4")
        private static SmDependency LocalActualDep = null;

        @objid ("62ef7cda-4c76-472d-9d69-a50d68cee464")
        private static SmDependency LocalQualifierDep = null;

        @objid ("23b05f2c-5c4c-481c-a623-8a9be2fe08a0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalTaggedValueData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("49737d4e-0623-4caa-a0cc-af8082dc100c")
        public static SmAttribute IsVisibleAtt() {
            if (IsVisibleAtt == null) {
            	IsVisibleAtt = classof().getAttributeDef("IsVisible");
            }
            return IsVisibleAtt;
        }

        @objid ("dd1075c3-c7a4-457a-b31a-729c404c59be")
        public static SmDependency LocalAnnotedDep() {
            if (LocalAnnotedDep == null) {
            	LocalAnnotedDep = classof().getDependencyDef("LocalAnnoted");
            }
            return LocalAnnotedDep;
        }

        @objid ("7aceeb52-ba9b-4f1b-b50b-b8acd537be5c")
        public static SmDependency LocalDefinitionDep() {
            if (LocalDefinitionDep == null) {
            	LocalDefinitionDep = classof().getDependencyDef("LocalDefinition");
            }
            return LocalDefinitionDep;
        }

        @objid ("81adfb6d-a199-491f-8311-5426a9ca3d3d")
        public static SmDependency LocalActualDep() {
            if (LocalActualDep == null) {
            	LocalActualDep = classof().getDependencyDef("LocalActual");
            }
            return LocalActualDep;
        }

        @objid ("f8dccb55-0ac4-4517-9e5a-7f311e705409")
        public static SmDependency LocalQualifierDep() {
            if (LocalQualifierDep == null) {
            	LocalQualifierDep = classof().getDependencyDef("LocalQualifier");
            }
            return LocalQualifierDep;
        }

        @objid ("fa2311f7-f7e3-4363-bcb1-91c3a0159375")
        public static SmDependency getLocalActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalActualDep;
        }

        @objid ("b93c36bf-f798-492e-9bf5-c4bce4ce5dd0")
        public static SmDependency getLocalDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalDefinitionDep;
        }

        @objid ("a6fcfe64-2469-4afb-a26b-cc63460b9410")
        public static SmDependency getLocalAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalAnnotedDep;
        }

        @objid ("5d2be98c-9e71-42ae-80ba-32c68cd330ad")
        public static SmDependency getLocalQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalQualifierDep;
        }

        @objid ("3ea21490-0bee-40e7-a20a-311821565b8d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1436260a-ebe1-4616-93fb-060f8df71fd9")
        public static SmAttribute getIsVisibleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVisibleAtt;
        }

        @objid ("0090a8c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4085d21e-8835-42ac-a688-f02871f5319c")
            public ISmObjectData createData() {
                return new LocalTaggedValueData();
            }

            @objid ("5e501833-827f-4da1-be94-777a76c6e62c")
            public SmObjectImpl createImpl() {
                return new LocalTaggedValueImpl();
            }

        }

        @objid ("00910a1e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsVisibleSmAttribute extends SmAttribute {
            @objid ("f5186f34-0ea8-47a5-8832-66e25e17752f")
            public Object getValue(ISmObjectData data) {
                return ((LocalTaggedValueData) data).mIsVisible;
            }

            @objid ("f64dae8b-87a1-4a1f-ba44-d4d700de4e13")
            public void setValue(ISmObjectData data, Object value) {
                ((LocalTaggedValueData) data).mIsVisible = value;
            }

        }

        @objid ("00916f22-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LocalAnnotedSmDependency extends SmSingleDependency {
            @objid ("74828ffc-e9ad-45f9-a615-ff215877da57")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalTaggedValueData) data).mLocalAnnoted;
            }

            @objid ("e5e6d408-2410-4018-b8d9-06523ab44650")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalTaggedValueData) data).mLocalAnnoted = value;
            }

            @objid ("76ea14bc-740f-4dfe-af84-6a5ea30f441b")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalTagDep();
            }

        }

        @objid ("0091e54c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LocalDefinitionSmDependency extends SmSingleDependency {
            @objid ("0141d2d0-e438-43e4-b8d7-11868d2632a8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalTaggedValueData) data).mLocalDefinition;
            }

            @objid ("8fd72d21-dcc9-4871-8837-eda591e9bc72")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalTaggedValueData) data).mLocalDefinition = value;
            }

            @objid ("af9d43ff-6096-4b37-b354-cfff2a562376")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.LocalTagOccurenceDep();
            }

        }

        @objid ("00925a0e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LocalActualSmDependency extends SmMultipleDependency {
            @objid ("4038189a-ad11-4f1e-80cd-f0473200f032")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LocalTaggedValueData)data).mLocalActual != null)? ((LocalTaggedValueData)data).mLocalActual:SmMultipleDependency.EMPTY;
            }

            @objid ("03b64b2e-a15d-4811-ba2f-a36ac0edc6b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LocalTaggedValueData) data).mLocalActual = new ArrayList<>(initialCapacity);
                return ((LocalTaggedValueData) data).mLocalActual;
            }

            @objid ("cc14f1e5-719e-425b-95ae-958b6bd4dec0")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("0092c462-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LocalQualifierSmDependency extends SmSingleDependency {
            @objid ("1dae25c1-9878-4d44-81eb-307b13d2486d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalTaggedValueData) data).mLocalQualifier;
            }

            @objid ("2c772d10-8d37-4ace-8683-5b5f8f3512d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalTaggedValueData) data).mLocalQualifier = value;
            }

            @objid ("c3f06bd9-4a28-424c-bc95-842505b9a502")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.LocalQualifiedDep();
            }

        }

    }

}
