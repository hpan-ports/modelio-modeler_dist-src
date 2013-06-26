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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterImpl;
import org.modelio.metamodel.uml.statik.TemplateParameter;
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

@objid ("001da934-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TemplateParameter.class, factory=TemplateParameterData.Metadata.ObjectFactory.class)
public class TemplateParameterData extends GeneralClassData {
    @objid ("e2755dab-9f0a-4fdc-919b-d9f823919fd0")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("c68fd336-96e7-4686-807f-20080e3ab1fb")
    @SmaMetaAttribute(metaName="IsValueParameter", type=Boolean.class, smAttributeClass=Metadata.IsValueParameterSmAttribute.class)
     Object mIsValueParameter = false;

    @objid ("baffd2a7-5dcb-47a3-9fed-caeb008ff761")
    @SmaMetaAssociation(metaName="ParameterSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSubstitutionSmDependency.class, istodelete = true)
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("b7813b52-2a1b-48d1-9915-6ef1d60f5df3")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("e32580ea-f05e-48c9-bc3e-2d8664316ae4")
    @SmaMetaAssociation(metaName="Parameterized", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedSmDependency.class)
     SmObjectImpl mParameterized;

    @objid ("82bc2a39-0295-4278-a3af-25416be03761")
    @SmaMetaAssociation(metaName="OwnedParameterElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnedParameterElementSmDependency.class, component = true)
     SmObjectImpl mOwnedParameterElement;

    @objid ("db187e51-db90-476b-908c-5a72ebddce39")
    @SmaMetaAssociation(metaName="DefaultType", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.DefaultTypeSmDependency.class, partof = true)
     SmObjectImpl mDefaultType;

    @objid ("101d8860-cc1e-42a6-8e43-979bac46255c")
    @SmaMetaAssociation(metaName="ParameterizedOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ParameterizedOperationSmDependency.class)
     SmObjectImpl mParameterizedOperation;

    @objid ("696630a6-1087-4828-a5d2-85cd9c0c2080")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00343d02-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4f75880e-f002-49a2-9bf0-506f9cb3e0c0")
        private static SmClass smClass = null;

        @objid ("62716fff-2e39-4cb3-bc5b-651509a624c4")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("2fb5694d-dded-442f-ab5b-905d85e7e517")
        private static SmAttribute IsValueParameterAtt = null;

        @objid ("f85ee753-dc5e-49c8-b52b-69e89a7f678d")
        private static SmDependency ParameterSubstitutionDep = null;

        @objid ("5e60b66a-4a99-4d92-a526-50e98fce3291")
        private static SmDependency TypeDep = null;

        @objid ("42556248-052e-47bd-9ed0-184eb9122951")
        private static SmDependency ParameterizedDep = null;

        @objid ("6ec58feb-3dd5-485e-bb47-51dccc1d225f")
        private static SmDependency OwnedParameterElementDep = null;

        @objid ("6620deb8-d4a4-472b-b5ee-607bd262ad70")
        private static SmDependency DefaultTypeDep = null;

        @objid ("c7169a3f-8a03-4824-99d2-366e2222765d")
        private static SmDependency ParameterizedOperationDep = null;

        @objid ("184eb622-4ae9-4629-a50b-7e0e4c2e3a5d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TemplateParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c86cbb92-ec59-4751-8ce0-92503293aed9")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("20018ba7-c39f-4e07-bc47-deae603f11a3")
        public static SmAttribute IsValueParameterAtt() {
            if (IsValueParameterAtt == null) {
            	IsValueParameterAtt = classof().getAttributeDef("IsValueParameter");
            }
            return IsValueParameterAtt;
        }

        @objid ("23f2f7ce-a28f-4241-9823-5fcf22875ed0")
        public static SmDependency ParameterSubstitutionDep() {
            if (ParameterSubstitutionDep == null) {
            	ParameterSubstitutionDep = classof().getDependencyDef("ParameterSubstitution");
            }
            return ParameterSubstitutionDep;
        }

        @objid ("fd72904c-193f-4569-af7e-ef9c77d288de")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("3990e0a4-d6a9-4e42-8c61-1165d14512de")
        public static SmDependency ParameterizedDep() {
            if (ParameterizedDep == null) {
            	ParameterizedDep = classof().getDependencyDef("Parameterized");
            }
            return ParameterizedDep;
        }

        @objid ("a60490fe-105d-4383-80db-67ae3509d325")
        public static SmDependency OwnedParameterElementDep() {
            if (OwnedParameterElementDep == null) {
            	OwnedParameterElementDep = classof().getDependencyDef("OwnedParameterElement");
            }
            return OwnedParameterElementDep;
        }

        @objid ("22ddac60-7171-42f0-8e1b-3fcd85cf51ad")
        public static SmDependency DefaultTypeDep() {
            if (DefaultTypeDep == null) {
            	DefaultTypeDep = classof().getDependencyDef("DefaultType");
            }
            return DefaultTypeDep;
        }

        @objid ("7b516679-ab39-4892-af03-35191049f6fe")
        public static SmDependency ParameterizedOperationDep() {
            if (ParameterizedOperationDep == null) {
            	ParameterizedOperationDep = classof().getDependencyDef("ParameterizedOperation");
            }
            return ParameterizedOperationDep;
        }

        @objid ("cc33a27a-3cd0-40ae-95c6-bffeb447feb5")
        public static SmDependency getParameterSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterSubstitutionDep;
        }

        @objid ("f757eda6-27f1-4442-9ac0-4e3da10b3733")
        public static SmAttribute getIsValueParameterAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsValueParameterAtt;
        }

        @objid ("f249ce37-1a07-4402-a09b-0324efaddc09")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("03342e67-0356-468d-967d-dec8832abadf")
        public static SmDependency getOwnedParameterElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedParameterElementDep;
        }

        @objid ("9a2ac8a1-080a-4d43-af69-fb6ce9c52c1c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ab8a0a6f-2da3-4d8f-b4e8-e1d640391415")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("46fd7df3-71f4-4f16-9d45-60a04a14e7de")
        public static SmDependency getParameterizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedDep;
        }

        @objid ("dfc3f1b6-e735-4d49-bae1-1d72b94dec2e")
        public static SmDependency getDefaultTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultTypeDep;
        }

        @objid ("75d722e8-7c42-474c-9c52-2eb5fb181809")
        public static SmDependency getParameterizedOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterizedOperationDep;
        }

        @objid ("00348046-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dda6e06b-1ee6-48cf-8d1d-de2319c5ebae")
            public ISmObjectData createData() {
                return new TemplateParameterData();
            }

            @objid ("c3a4b178-685d-48e4-9674-1716cc3fa12e")
            public SmObjectImpl createImpl() {
                return new TemplateParameterImpl();
            }

        }

        @objid ("0034e27a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("ef21619e-c5a5-4aac-a59c-c36cad2feb6e")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultValue;
            }

            @objid ("ec8ba363-09be-40eb-aba1-78d63eb24005")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("00354332-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsValueParameterSmAttribute extends SmAttribute {
            @objid ("0c87324e-5afe-47a9-b879-0bf7ae4c0eb1")
            public Object getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mIsValueParameter;
            }

            @objid ("3d38a795-8529-4d8f-a1dd-8d7d8798771f")
            public void setValue(ISmObjectData data, Object value) {
                ((TemplateParameterData) data).mIsValueParameter = value;
            }

        }

        @objid ("0035a714-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedSmDependency extends SmSingleDependency {
            @objid ("9398dedd-78f9-4962-9ee1-bc0757bf49af")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterized;
            }

            @objid ("77720c0f-ccae-4e70-8b43-bc20d569b0c0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterized = value;
            }

            @objid ("95eda3e0-ff72-454f-a5f1-61fabd687dac")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.TemplateDep();
            }

        }

        @objid ("00361e4c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterizedOperationSmDependency extends SmSingleDependency {
            @objid ("7eb3b829-ea72-4af2-977b-3e49647a4f5e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mParameterizedOperation;
            }

            @objid ("5c08e3b1-d5f3-4888-ae34-3e16f336b6f6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mParameterizedOperation = value;
            }

            @objid ("f5021301-fbbb-4888-985b-48122a9e0977")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.TemplateDep();
            }

        }

        @objid ("00369412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParameterSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("a14e6719-276d-4a78-9b00-e9f5cfb94eaa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TemplateParameterData)data).mParameterSubstitution != null)? ((TemplateParameterData)data).mParameterSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("a98d84ac-d46a-4112-bb17-5d48ff49e7d3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TemplateParameterData) data).mParameterSubstitution = new ArrayList<>(initialCapacity);
                return ((TemplateParameterData) data).mParameterSubstitution;
            }

            @objid ("0a593afc-0bc5-46e9-a8e2-c5bb7e3af77e")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.FormalParameterDep();
            }

        }

        @objid ("003701fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultTypeSmDependency extends SmSingleDependency {
            @objid ("d8bbc915-2249-4d21-b715-07c5648a2dad")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mDefaultType;
            }

            @objid ("a82e7746-37db-4ea2-b2f7-1eb8854a1856")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mDefaultType = value;
            }

            @objid ("2a352ed6-778b-4a5a-8093-94bfec86d0d8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DefaultParameteringDep();
            }

        }

        @objid ("003778dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedParameterElementSmDependency extends SmSingleDependency {
            @objid ("f4bd6a7e-db8e-4a1a-963c-289592156f29")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mOwnedParameterElement;
            }

            @objid ("a8d9bd3c-ae96-4be0-97a7-7dad6547376b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mOwnedParameterElement = value;
            }

            @objid ("48af0aca-8faa-44fc-8837-2e4f6dd8ec2b")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.OwnerTemplateParameterDep();
            }

        }

        @objid ("0037efd8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("cebeb56c-937d-4872-93ec-313c674846db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TemplateParameterData) data).mType;
            }

            @objid ("a42f5621-4e2a-4dce-bfd7-6b04e3fbed35")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TemplateParameterData) data).mType = value;
            }

            @objid ("fd879c9c-40d4-4c1c-922e-59b9c5934920")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TypingParameterDep();
            }

        }

    }

}
