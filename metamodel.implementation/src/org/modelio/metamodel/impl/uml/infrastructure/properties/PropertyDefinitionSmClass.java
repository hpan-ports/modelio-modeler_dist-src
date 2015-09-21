/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("06c74818-fdd4-4cb0-a2ce-55b4db78928d")
public class PropertyDefinitionSmClass extends ModelElementSmClass {
    @objid ("8d5dc45a-180d-4fcb-b95d-6d467740d726")
    private SmAttribute isEditableAtt;

    @objid ("9000cf0e-f380-4def-aced-1dd90f88ab11")
    private SmAttribute defaultValueAtt;

    @objid ("320f8ea4-4ca8-48ba-9d9e-f6f47099674b")
    private SmDependency typeDep;

    @objid ("09fcbc7e-e57b-4811-9fe9-4eb0b179f405")
    private SmDependency ownerDep;

    @objid ("8b334bc3-cc27-4ac0-9e90-41190f04d200")
    public PropertyDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e6459381-0dc8-4371-9183-504d5fc07c8a")
    @Override
    public String getName() {
        return "PropertyDefinition";
    }

    @objid ("e9e83da6-1a6d-490f-a1fd-ab6cf90e7b87")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("646f760a-debd-4c9d-a2a8-cf1b0f8bb36b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyDefinition.class;
    }

    @objid ("34988e91-2a46-40b7-8aa9-8860423c5f5d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("55e10ae9-f082-4437-9a39-b1af6da416f6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1bd9424b-4292-48fe-9495-f7085570dbfc")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PropertyDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isEditableAtt = new IsEditableSmAttribute();
        this.isEditableAtt.init("IsEditable", this, Boolean.class );
        registerAttribute(this.isEditableAtt);
        
        this.defaultValueAtt = new DefaultValueSmAttribute();
        this.defaultValueAtt.init("DefaultValue", this, String.class );
        registerAttribute(this.defaultValueAtt);
        
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("PropertyType"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("PropertyTableDefinition"), 1, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("1720948b-e87d-4ab7-8cab-8355c05965c1")
    public SmAttribute getIsEditableAtt() {
        if (this.isEditableAtt == null) {
        	this.isEditableAtt = this.getAttributeDef("IsEditable");
        }
        return this.isEditableAtt;
    }

    @objid ("91a6c0ae-7b88-45f4-aef5-e53d58615b64")
    public SmAttribute getDefaultValueAtt() {
        if (this.defaultValueAtt == null) {
        	this.defaultValueAtt = this.getAttributeDef("DefaultValue");
        }
        return this.defaultValueAtt;
    }

    @objid ("775ca021-2d89-4d7f-b3e2-5454be467d73")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("d4546e10-b0fe-4688-8b5e-6797569534b6")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("a6e85db2-28ff-4d4a-82cc-6afd4892d57c")
    private static class PropertyDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("df9d3bde-09dc-4091-9b12-ad08514a9557")
        private PropertyDefinitionSmClass smClass;

        @objid ("c7b63de6-0f42-4953-b805-67f05295e977")
        public PropertyDefinitionObjectFactory(PropertyDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0d730c59-94ec-4904-9a26-59bab5814464")
        @Override
        public ISmObjectData createData() {
            return new PropertyDefinitionData(this.smClass);
        }

        @objid ("c2fdef60-7eec-4678-b36d-4f8c07999de6")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyDefinitionImpl();
        }

    }

    @objid ("c43c6ed3-e1a6-4512-9731-89c2cb898ba0")
    public static class IsEditableSmAttribute extends SmAttribute {
        @objid ("632b5bb1-7463-4f25-a74e-81700af67283")
        public Object getValue(ISmObjectData data) {
            return ((PropertyDefinitionData) data).mIsEditable;
        }

        @objid ("fc453d5b-bea2-4652-89d0-d86f1d7e8f43")
        public void setValue(ISmObjectData data, Object value) {
            ((PropertyDefinitionData) data).mIsEditable = value;
        }

    }

    @objid ("cdcf514c-b734-4f54-8b5a-af602e4fcd69")
    public static class DefaultValueSmAttribute extends SmAttribute {
        @objid ("5febfd55-b3ae-43ae-923c-2cf00ab9f64e")
        public Object getValue(ISmObjectData data) {
            return ((PropertyDefinitionData) data).mDefaultValue;
        }

        @objid ("9b33bf92-afb9-436a-be10-1b0ee364a0fb")
        public void setValue(ISmObjectData data, Object value) {
            ((PropertyDefinitionData) data).mDefaultValue = value;
        }

    }

    @objid ("68ca0e26-503f-45f7-8f53-dfafa2171e0e")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("9ed0d4ff-0715-4fde-b81e-023b2b8c98ec")
        private SmDependency symetricDep;

        @objid ("1b107b3d-ecf1-45eb-8696-b15326735126")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyDefinitionData) data).mType;
        }

        @objid ("83167a70-b52a-4439-9db3-19b2c8bf4ce5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyDefinitionData) data).mType = value;
        }

        @objid ("00bda706-6ce7-4c3f-89d3-18d4ba50b1f9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTypeSmClass)this.getTarget()).getTypedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5f6a73d9-0eb2-43d1-a8d5-55612768027c")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("4e76b812-92ae-4c55-bda2-9742964b8694")
        private SmDependency symetricDep;

        @objid ("7a06c023-1296-4d2e-aa9b-50ffdb5b5ffe")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyDefinitionData) data).mOwner;
        }

        @objid ("581f0ece-d49a-42c8-b04f-51f2ae2cdbc6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyDefinitionData) data).mOwner = value;
        }

        @objid ("30c0dbde-4f81-47e4-aaa3-7ffec57bfc55")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableDefinitionSmClass)this.getTarget()).getOwnedDep();
            }
            return this.symetricDep;
        }

    }

}
