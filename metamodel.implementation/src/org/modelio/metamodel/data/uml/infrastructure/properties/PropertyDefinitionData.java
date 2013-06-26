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
    @objid ("40c8e833-403d-44d2-a868-206b80798b0b")
    @SmaMetaAttribute(metaName="IsEditable", type=Boolean.class, smAttributeClass=Metadata.IsEditableSmAttribute.class)
     Object mIsEditable = false;

    @objid ("fc3d999f-9094-4bc6-880f-02f5ad6983a7")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("06993a34-184d-45fd-a59c-2a2d9c8a3a11")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("c766621d-1ced-4a35-ac7e-f233e8d0bd71")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("81716353-deed-432c-bcbe-8ca5fa2369ff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cbc58-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("34872d20-d1c3-4647-aa04-1354acbea2f2")
        private static SmClass smClass = null;

        @objid ("8b036e86-22ce-4e1e-8eae-9172faacfe00")
        private static SmAttribute IsEditableAtt = null;

        @objid ("80ee9e67-3b89-4c52-a233-17bff2c3815f")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("6acd7bfd-a747-4a41-a134-158b38ef4fb4")
        private static SmDependency TypeDep = null;

        @objid ("d99ca598-c622-4854-8ee4-b98a07104690")
        private static SmDependency OwnerDep = null;

        @objid ("eb3f65b9-597d-46cb-9f17-60e0c048df06")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("044bd526-1daf-48a7-959e-aa623d24e1ad")
        public static SmAttribute IsEditableAtt() {
            if (IsEditableAtt == null) {
            	IsEditableAtt = classof().getAttributeDef("IsEditable");
            }
            return IsEditableAtt;
        }

        @objid ("f171e5d8-2757-4e64-9c87-02c82fad3638")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("0d421bc5-0a48-49e4-a1d2-bdc1c5f85223")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("49bb6a8c-d180-4a3d-8f36-0ab6df666f31")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("ac40a6dd-14b5-4713-8904-fc495cc51b75")
        public static SmAttribute getIsEditableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEditableAtt;
        }

        @objid ("77a7360b-6256-4b45-8dac-54ee6c993db3")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("6464565a-1e93-4666-b662-eb30236e75c1")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("c7387955-e10e-4d19-a5e2-88bfc9e0ddc2")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("8eaed8ec-c867-4ef0-9a3d-7f3f1025bd84")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002d1cde-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ee22ecf7-ce6e-4a6b-bbf6-da7deb3217e9")
            public ISmObjectData createData() {
                return new PropertyDefinitionData();
            }

            @objid ("6215b00c-5180-4f95-9e57-56a9520a49d3")
            public SmObjectImpl createImpl() {
                return new PropertyDefinitionImpl();
            }

        }

        @objid ("002dfb54-ec98-1098-b22e-001ec947cd2a")
        public static class IsEditableSmAttribute extends SmAttribute {
            @objid ("5ea303e4-a306-4244-aa0f-36cd0e1d8966")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mIsEditable;
            }

            @objid ("8a71e462-952a-4c08-8ca5-d448d5f006d2")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mIsEditable = value;
            }

        }

        @objid ("002f3528-ec98-1098-b22e-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("e947bd6e-8d89-4c2c-bf49-fc9bbc8182a4")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mDefaultValue;
            }

            @objid ("d293fc25-85f0-44f3-ad79-a8b6bff9b759")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mDefaultValue = value;
            }

        }

        @objid ("0030124a-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c1a799fd-327d-4c7b-8dd1-359e01b3bcd2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mOwner;
            }

            @objid ("d9ff0464-52ce-4db3-a6da-e7c2fa1076f9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mOwner = value;
            }

            @objid ("1170fe6f-c441-4ce6-92a9-7eab6a9b070f")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnedDep();
            }

        }

        @objid ("00310a92-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("de3b8f20-959e-4018-8814-a1cad6f86582")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mType;
            }

            @objid ("4b9b8ab4-0408-4bdd-87e0-f67902d59502")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mType = value;
            }

            @objid ("df009cdc-261d-4f2c-8734-ac97c2bc33c2")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.TypedDep();
            }

        }

    }

}
