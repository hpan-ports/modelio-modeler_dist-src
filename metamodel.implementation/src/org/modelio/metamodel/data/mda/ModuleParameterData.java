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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.mda.ModuleParameterImpl;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
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

@objid ("00653042-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModuleParameter.class, factory=ModuleParameterData.Metadata.ObjectFactory.class)
public class ModuleParameterData extends ModelElementData {
    @objid ("6d3c97e8-3c5b-4f3b-9858-d51b63dac037")
    @SmaMetaAttribute(metaName="SetName", type=String.class, smAttributeClass=Metadata.SetNameSmAttribute.class)
     Object mSetName = "";

    @objid ("97575e46-2e54-402d-81bf-2be1be9d516f")
    @SmaMetaAttribute(metaName="AssociatedType", type=ModuleParameterType.class, smAttributeClass=Metadata.AssociatedTypeSmAttribute.class)
     Object mAssociatedType = ModuleParameterType.TYPE_PARAM_STRING;

    @objid ("226cc0ed-8eee-403f-bb27-bb8e95ba77af")
    @SmaMetaAttribute(metaName="IsUserRead", type=Boolean.class, smAttributeClass=Metadata.IsUserReadSmAttribute.class, einoexternalize=true)
     Object mIsUserRead = true;

    @objid ("8f2031c7-26a8-41a2-98cc-b91446335298")
    @SmaMetaAttribute(metaName="IsUserWrite", type=Boolean.class, smAttributeClass=Metadata.IsUserWriteSmAttribute.class, einoexternalize=true)
     Object mIsUserWrite = true;

    @objid ("d2e61195-6141-4352-a39e-9775f48a63cb")
    @SmaMetaAttribute(metaName="IsApiRead", type=Boolean.class, smAttributeClass=Metadata.IsApiReadSmAttribute.class, einoexternalize=true)
     Object mIsApiRead = true;

    @objid ("a8270213-0647-4993-8735-fdd26b48ed80")
    @SmaMetaAttribute(metaName="IsApiWrite", type=Boolean.class, smAttributeClass=Metadata.IsApiWriteSmAttribute.class, einoexternalize=true)
     Object mIsApiWrite = true;

    @objid ("25392ed7-417e-4c02-8a52-df20d32db18c")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("b4493f22-d819-4f15-adde-2da194c6a254")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("bbfc35ce-7d62-4abc-9d2e-3121e13cf394")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0047be2c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2f6effd2-aaba-40d9-a4ca-4959dba9bd2f")
        private static SmClass smClass = null;

        @objid ("44bdf06e-6c0b-4a89-8550-253e8c3b68a1")
        private static SmAttribute SetNameAtt = null;

        @objid ("d46025f1-7f27-48f9-88b5-a978ca4725e1")
        private static SmAttribute AssociatedTypeAtt = null;

        @objid ("5ce6c387-66fc-45af-81db-35b65cc953c7")
        private static SmAttribute IsUserReadAtt = null;

        @objid ("91289ed0-0bf7-426d-bf80-de4de9977e59")
        private static SmAttribute IsUserWriteAtt = null;

        @objid ("f2fd158c-7274-4175-b93e-2619a7ff8de6")
        private static SmAttribute IsApiReadAtt = null;

        @objid ("ce6d38a8-a324-41c1-8e7c-4460e72e3443")
        private static SmAttribute IsApiWriteAtt = null;

        @objid ("bf16e7a9-2937-4619-906a-e15b2d1c842d")
        private static SmDependency TypeDep = null;

        @objid ("914d2246-d7a6-4300-8a70-bb99c0c58c29")
        private static SmDependency OwnerDep = null;

        @objid ("0f52b42f-d78a-49ab-a8f8-1b29f1b3aa65")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cd7c4d0f-45c5-4258-a217-fabcefe74a2e")
        public static SmAttribute SetNameAtt() {
            if (SetNameAtt == null) {
            	SetNameAtt = classof().getAttributeDef("SetName");
            }
            return SetNameAtt;
        }

        @objid ("4d737c77-d8f1-486c-a53c-108bb17879c3")
        public static SmAttribute AssociatedTypeAtt() {
            if (AssociatedTypeAtt == null) {
            	AssociatedTypeAtt = classof().getAttributeDef("AssociatedType");
            }
            return AssociatedTypeAtt;
        }

        @objid ("a6dde879-b9b6-4bd7-8616-38e87cd387b6")
        public static SmAttribute IsUserReadAtt() {
            if (IsUserReadAtt == null) {
            	IsUserReadAtt = classof().getAttributeDef("IsUserRead");
            }
            return IsUserReadAtt;
        }

        @objid ("ad37d64a-49c7-49a6-bb67-f8c5f4b0960c")
        public static SmAttribute IsUserWriteAtt() {
            if (IsUserWriteAtt == null) {
            	IsUserWriteAtt = classof().getAttributeDef("IsUserWrite");
            }
            return IsUserWriteAtt;
        }

        @objid ("e805d3eb-ce9c-48f4-b637-017ba6f9b55a")
        public static SmAttribute IsApiReadAtt() {
            if (IsApiReadAtt == null) {
            	IsApiReadAtt = classof().getAttributeDef("IsApiRead");
            }
            return IsApiReadAtt;
        }

        @objid ("a405f53f-d549-4974-8019-6b8fafa1767b")
        public static SmAttribute IsApiWriteAtt() {
            if (IsApiWriteAtt == null) {
            	IsApiWriteAtt = classof().getAttributeDef("IsApiWrite");
            }
            return IsApiWriteAtt;
        }

        @objid ("0813d1e4-9f2d-4475-aa5c-06be1a3c3052")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("7a5a3d8b-bb89-472c-8da4-86c7e8e26423")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("80883446-dab1-46b3-9f23-fc4df20a31d0")
        public static SmAttribute getIsApiReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiReadAtt;
        }

        @objid ("f011ae7f-8063-407f-9c61-00ea29cb4979")
        public static SmAttribute getSetNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetNameAtt;
        }

        @objid ("1a79aca8-13ab-4f6f-a711-20f089da8dc5")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("10897a70-b180-4cb1-90e4-5bfc1d90272a")
        public static SmAttribute getIsUserWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserWriteAtt;
        }

        @objid ("00747d3b-3076-45cb-81c0-9a8423219079")
        public static SmAttribute getAssociatedTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociatedTypeAtt;
        }

        @objid ("dcf11001-649b-4abe-a60e-7aa671bac83f")
        public static SmAttribute getIsApiWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiWriteAtt;
        }

        @objid ("2750e7cb-5f45-4bb7-9b17-acce2db70384")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a82233f8-e3ab-4f77-b12e-f1ec256ea05c")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8f166134-4ed0-48ba-84fe-060bc8daae2f")
        public static SmAttribute getIsUserReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserReadAtt;
        }

        @objid ("0047fe1e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d4ef26b7-b740-4997-8daf-75687ac7d3d1")
            public ISmObjectData createData() {
                return new ModuleParameterData();
            }

            @objid ("c82b9fee-a6d6-4182-a8b0-822ce2ea31b0")
            public SmObjectImpl createImpl() {
                return new ModuleParameterImpl();
            }

        }

        @objid ("00485ecc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SetNameSmAttribute extends SmAttribute {
            @objid ("67213f9d-88fd-40b9-a7d0-939204724d97")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mSetName;
            }

            @objid ("0c2bb742-9eb9-41b1-ac78-db2873fe37b5")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mSetName = value;
            }

        }

        @objid ("0048be62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociatedTypeSmAttribute extends SmAttribute {
            @objid ("b4efa1e3-93a2-4496-8803-405c248baea1")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mAssociatedType;
            }

            @objid ("2dca10c2-7f7f-4c6b-b2d9-1689acbff6f6")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mAssociatedType = value;
            }

        }

        @objid ("004a603c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8187a33c-8e5f-418b-8b5b-70108e141e18")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mOwner;
            }

            @objid ("17069325-18a0-4366-ab80-082f682f9be2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mOwner = value;
            }

            @objid ("1754a3ab-b718-4916-8f42-164cd75b169c")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ModuleParameterDep();
            }

        }

        @objid ("004aeb92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("69707d46-9293-4550-8f7c-3a8aac0d2f56")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mType;
            }

            @objid ("27e6c3b9-702f-4dec-b241-7600e36a9f0e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mType = value;
            }

            @objid ("b2263f48-b086-4ee7-aedd-66df38845bef")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceConfigParamDep();
            }

        }

        @objid ("cf091b60-f120-11e1-b078-001ec947ccaf")
        public static class IsUserReadSmAttribute extends SmAttribute {
            @objid ("6b2114ec-9bda-44da-b424-5f32c8c6cfdf")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserRead;
            }

            @objid ("13d2e8c6-c268-44a4-83b3-c1877364546e")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserRead = value;
            }

        }

        @objid ("cf2a7c08-f120-11e1-b078-001ec947ccaf")
        public static class IsUserWriteSmAttribute extends SmAttribute {
            @objid ("f92dd8b0-cf33-4a95-8542-48f92db354b0")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserWrite;
            }

            @objid ("358089ab-c569-4b7e-8831-edba6fcc0973")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserWrite = value;
            }

        }

        @objid ("cf2a7c18-f120-11e1-b078-001ec947ccaf")
        public static class IsApiReadSmAttribute extends SmAttribute {
            @objid ("03030cae-14c3-46f9-9b32-554d103041c2")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiRead;
            }

            @objid ("81e09a08-c308-4273-86f6-565170c085fc")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiRead = value;
            }

        }

        @objid ("cf2a7c28-f120-11e1-b078-001ec947ccaf")
        public static class IsApiWriteSmAttribute extends SmAttribute {
            @objid ("0abcd58e-c711-48c5-9b3e-49c32c7441e8")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiWrite;
            }

            @objid ("01d68afc-ba17-462d-8dfa-b65c93fb7a5f")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiWrite = value;
            }

        }

    }

}
