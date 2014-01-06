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
    @objid ("c41a56ff-7890-4bd5-b081-4fdf82131fcc")
    @SmaMetaAttribute(metaName="IsEditable", type=Boolean.class, smAttributeClass=Metadata.IsEditableSmAttribute.class)
     Object mIsEditable = true;

    @objid ("a0541fe1-0b9a-4419-b3f7-f8d78526e2e7")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("6636779f-bb84-4153-bd1c-acf4c5c8c925")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("97aea75b-20c0-4840-887d-534cd59780d8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("3005611e-0f2f-48ee-b2a9-2cc8101d2fb5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cbc58-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("8d40e4f9-e801-4682-90c6-49e92f544705")
        private static SmClass smClass = null;

        @objid ("386c8c96-da3b-4648-b7eb-28cdac7d3037")
        private static SmAttribute IsEditableAtt = null;

        @objid ("dfe481a9-6224-435f-9b62-a23a2e783ac3")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("f2c46fe7-2762-418f-b22d-36fc247dabd4")
        private static SmDependency TypeDep = null;

        @objid ("dc628689-9076-47be-894d-54ca32b6162f")
        private static SmDependency OwnerDep = null;

        @objid ("d0dcf31e-6d8b-4b69-a7d6-4083d4a32fcb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e793ba46-2c9d-431c-bb9e-d87131fe8e2c")
        public static SmAttribute IsEditableAtt() {
            if (IsEditableAtt == null) {
            	IsEditableAtt = classof().getAttributeDef("IsEditable");
            }
            return IsEditableAtt;
        }

        @objid ("8e127fa3-8fa6-4ab5-9c72-5a9d0c14eaa6")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("cb65ec52-a341-4eb8-bcbb-af3a8d6a50c9")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("7c9d192b-7c61-40ff-bd3b-efb48606fd43")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("9c1f07ec-dfc0-476e-8075-7c933371d815")
        public static SmAttribute getIsEditableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEditableAtt;
        }

        @objid ("bcb023dc-eeff-42bb-b953-bcb25b9c6cd7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a6cb54e4-9ff0-4822-9945-ed4c830031ec")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("a844aa9e-0aca-4d37-9cd4-4b76c358143e")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("0f572dfe-581b-4e6b-92c4-de816b5578ff")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("002d1cde-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("46bf0a3c-1f42-429e-b893-a7f3bfdc378a")
            public ISmObjectData createData() {
                return new PropertyDefinitionData();
            }

            @objid ("f792c173-b357-4973-a2a3-65863be1d74c")
            public SmObjectImpl createImpl() {
                return new PropertyDefinitionImpl();
            }

        }

        @objid ("002dfb54-ec98-1098-b22e-001ec947cd2a")
        public static class IsEditableSmAttribute extends SmAttribute {
            @objid ("a65c84f4-18e7-4c82-9e7c-7cfd5cf45179")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mIsEditable;
            }

            @objid ("96f0b34c-763a-4a4d-a027-e49a6748adce")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mIsEditable = value;
            }

        }

        @objid ("002f3528-ec98-1098-b22e-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("be105f0d-256e-42e1-b9a3-5a7243cf0014")
            public Object getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mDefaultValue;
            }

            @objid ("4e56026c-76cc-4286-8ccc-de441c64e2fe")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyDefinitionData) data).mDefaultValue = value;
            }

        }

        @objid ("0030124a-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8cae0178-f4bc-4b39-ad57-333c56df6633")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mOwner;
            }

            @objid ("3a9fb755-5a63-4554-86b7-ecf3ef105c39")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mOwner = value;
            }

            @objid ("0b0a4563-e6ec-46d2-a64f-302ac0c871a7")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnedDep();
            }

        }

        @objid ("00310a92-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("5459afdc-4fe4-4549-a355-36e349e9f92e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyDefinitionData) data).mType;
            }

            @objid ("658d955d-7316-43ae-983b-83a712afbfaa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyDefinitionData) data).mType = value;
            }

            @objid ("86c5957c-7f75-4ce8-94ac-657f0fa6a872")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.TypedDep();
            }

        }

    }

}
