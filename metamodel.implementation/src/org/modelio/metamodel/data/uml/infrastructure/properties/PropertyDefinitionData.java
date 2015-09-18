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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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

@objid ("00653092-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyDefinition.class, factory=PropertyDefinitionData.Metadata.ObjectFactory.class)
public class PropertyDefinitionData extends ModelElementData {
    @objid ("5e463795-9a01-422f-b796-c264b495f801")
    @SmaMetaAttribute(metaName="IsEditable", type=Boolean.class, smAttributeClass=Metadata.IsEditableSmAttribute.class)
     Object mIsEditable = true;

    @objid ("5c843401-c18d-4855-b962-3ebbbcc4e130")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("375db9cd-1cd4-408d-98d3-d8ae97c21428")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("93638bf7-e961-424e-87b1-a92f3567b81d")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9f132b5d-7d49-42df-9229-6d245fcfc0ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cbc58-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("934cae98-4697-4456-a550-7370bca64e08")
        private static SmClass smClass = null;

        @objid ("b970a01d-9969-4019-9e22-e89499225086")
        private static SmAttribute IsEditableAtt = null;

        @objid ("be8ad1bc-8289-4708-a20f-166fe4961c59")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("8e0691d2-8f0b-441e-a6ed-ad0503b55863")
        private static SmDependency TypeDep = null;

        @objid ("defd5472-b35f-4901-aef6-5a3db564b2bd")
        private static SmDependency OwnerDep = null;

        @objid ("6889c28e-3d37-4ed0-b0e7-b34f53d34605")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("33fd44a1-12ff-425a-a6e2-9c227d3a8554")
        public static SmAttribute IsEditableAtt() {
            if (IsEditableAtt == null) {
            	IsEditableAtt = classof().getAttributeDef("IsEditable");
            }
            return IsEditableAtt;
        }

        @objid ("582bf456-2404-4f13-a847-8b72e16383f3")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("0f9a5000-1839-4ef3-b5ff-114114777124")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("add1fa26-cb91-47fe-91f1-c5958c8d9db7")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("907405dd-e3f1-4bb1-85c5-5130d583d228")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("d8a326ed-be47-4de3-ae0c-1e84f6c80808")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("51eefc2e-d571-41da-9102-077807c47b68")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c724c28d-4d97-423f-b1bd-db55a7b16c64")
        public static SmAttribute getIsEditableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEditableAtt;
        }

        @objid ("b4a249a5-3d0c-4eef-b470-e73e8c64d8be")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("002d1cde-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bd82945e-8390-4df3-8bd1-e7fab01c278d")
            public ISmObjectData createData() {
                return new PropertyDefinitionData();
            }

            @objid ("117ddb00-d39d-49fd-b018-cb1a6b450cd0")
            public SmObjectImpl createImpl() {
                return new PropertyDefinitionImpl();
            }

        }

        @objid ("002dfb54-ec98-1098-b22e-001ec947cd2a")
        public static class IsEditableSmAttribute extends SmAttribute {
            @objid ("0abc7c14-f0c0-4868-8618-2df89fab6247")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mIsEditable;
            }

            @objid ("d72502a1-26f3-43ab-9f30-cecba60637d9")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mIsEditable = value;
            }

        }

        @objid ("002f3528-ec98-1098-b22e-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("769ce222-c9b2-43be-8343-b5efc9edaffc")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mDefaultValue;
            }

            @objid ("087d6c2a-57d8-496b-8b92-f89871b51f79")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mDefaultValue = value;
            }

        }

        @objid ("0030124a-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e731868d-ca80-4e7c-a837-1f293235fc88")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mOwner;
            }

            @objid ("48ff9afe-39ad-4ce7-ae8c-a7c88cc67957")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mOwner = value;
            }

            @objid ("711b0ef0-ce48-486e-977a-40957412c14b")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnedDep();
            }

        }

        @objid ("00310a92-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("4d03e52c-e7f6-4504-9032-059b417659ee")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mType;
            }

            @objid ("dfbd1c33-b4dd-446a-91af-bff3e931c42a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mType = value;
            }

            @objid ("4500f236-62da-4750-8217-84385bad9b3e")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.TypedDep();
            }

        }

    }

}
