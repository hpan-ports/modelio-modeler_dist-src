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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.mda.ModuleComponentSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.EnumerationSmClass;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
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

@objid ("a382e42b-581e-446d-9e3d-9c08d36d8d98")
public class ModuleParameterSmClass extends ModelElementSmClass {
    @objid ("b310efd2-49f9-402f-807d-84ba24858d0e")
    private SmAttribute groupNameAtt;

    @objid ("2a0660e4-4b25-4685-907e-10d74ca6881d")
    private SmAttribute typeAtt;

    @objid ("ba6dfeb4-dc79-4e98-8189-e4bc6ea4ad70")
    private SmAttribute isUserReadAtt;

    @objid ("017eac61-9812-4979-90da-1adc21dc1873")
    private SmAttribute isUserWriteAtt;

    @objid ("e4e933b0-92a0-411f-9b16-96e426fe02ae")
    private SmAttribute isApiReadAtt;

    @objid ("d5204f9b-a456-476b-bf37-61bdbefb09e3")
    private SmAttribute isApiWriteAtt;

    @objid ("fcab0b64-cb7d-4660-b1af-be96f0c26135")
    private SmAttribute defaultValueAtt;

    @objid ("c6487016-40be-49ad-9593-0c2990368878")
    private SmDependency ownerDep;

    @objid ("9889327f-2d1d-40e5-93c4-7a20215eed8a")
    private SmDependency enumTypeDep;

    @objid ("97c293bf-9460-476b-8a8a-ac2712826b7e")
    public ModuleParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d28b40d4-9ab1-470b-a3be-85af6ff8245a")
    @Override
    public String getName() {
        return "ModuleParameter";
    }

    @objid ("5d11b95e-19af-4540-8860-a57e3dd8e519")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d72941b9-8de9-49e2-b83b-117844ae1a4e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ModuleParameter.class;
    }

    @objid ("c67c63ef-d110-4814-be66-9c2a1cfba960")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("bcca8699-644a-4b1e-a960-295e7e63e6fb")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b216819f-5208-43ee-978e-e2cef2d349ca")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ModuleParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.groupNameAtt = new GroupNameSmAttribute();
        this.groupNameAtt.init("GroupName", this, String.class );
        registerAttribute(this.groupNameAtt);
        
        this.typeAtt = new TypeSmAttribute();
        this.typeAtt.init("Type", this, ModuleParameterType.class );
        registerAttribute(this.typeAtt);
        
        this.isUserReadAtt = new IsUserReadSmAttribute();
        this.isUserReadAtt.init("IsUserRead", this, Boolean.class );
        registerAttribute(this.isUserReadAtt);
        
        this.isUserWriteAtt = new IsUserWriteSmAttribute();
        this.isUserWriteAtt.init("IsUserWrite", this, Boolean.class );
        registerAttribute(this.isUserWriteAtt);
        
        this.isApiReadAtt = new IsApiReadSmAttribute();
        this.isApiReadAtt.init("IsApiRead", this, Boolean.class );
        registerAttribute(this.isApiReadAtt);
        
        this.isApiWriteAtt = new IsApiWriteSmAttribute();
        this.isApiWriteAtt.init("IsApiWrite", this, Boolean.class );
        registerAttribute(this.isApiWriteAtt);
        
        this.defaultValueAtt = new DefaultValueSmAttribute();
        this.defaultValueAtt.init("DefaultValue", this, String.class );
        registerAttribute(this.defaultValueAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("ModuleComponent"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.enumTypeDep = new EnumTypeSmDependency();
        this.enumTypeDep.init("EnumType", this, metamodel.getMClass("Enumeration"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.enumTypeDep);
    }

    @objid ("31501a89-5f8f-4b51-8b18-81e5966b91b5")
    public SmAttribute getGroupNameAtt() {
        if (this.groupNameAtt == null) {
        	this.groupNameAtt = this.getAttributeDef("GroupName");
        }
        return this.groupNameAtt;
    }

    @objid ("a7f044b9-2859-4864-ab57-a48b8923a587")
    public SmAttribute getTypeAtt() {
        if (this.typeAtt == null) {
        	this.typeAtt = this.getAttributeDef("Type");
        }
        return this.typeAtt;
    }

    @objid ("a7fbb215-2608-4893-956e-4fb84ac6c0dd")
    public SmAttribute getIsUserReadAtt() {
        if (this.isUserReadAtt == null) {
        	this.isUserReadAtt = this.getAttributeDef("IsUserRead");
        }
        return this.isUserReadAtt;
    }

    @objid ("2baf12e1-c5e9-44eb-a651-7c14dbfb12d2")
    public SmAttribute getIsUserWriteAtt() {
        if (this.isUserWriteAtt == null) {
        	this.isUserWriteAtt = this.getAttributeDef("IsUserWrite");
        }
        return this.isUserWriteAtt;
    }

    @objid ("d71e250a-3ca8-492f-a458-41988be44240")
    public SmAttribute getIsApiReadAtt() {
        if (this.isApiReadAtt == null) {
        	this.isApiReadAtt = this.getAttributeDef("IsApiRead");
        }
        return this.isApiReadAtt;
    }

    @objid ("97adb6a5-fd51-4ce1-bbdf-4cf24fe75343")
    public SmAttribute getIsApiWriteAtt() {
        if (this.isApiWriteAtt == null) {
        	this.isApiWriteAtt = this.getAttributeDef("IsApiWrite");
        }
        return this.isApiWriteAtt;
    }

    @objid ("fc2a50c6-b1fd-4613-94b2-6dee452d73ea")
    public SmAttribute getDefaultValueAtt() {
        if (this.defaultValueAtt == null) {
        	this.defaultValueAtt = this.getAttributeDef("DefaultValue");
        }
        return this.defaultValueAtt;
    }

    @objid ("3ae437a3-8335-48ed-86a4-260403a8f18e")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("00d33b03-a129-42f1-bb65-69923e9e8b1e")
    public SmDependency getEnumTypeDep() {
        if (this.enumTypeDep == null) {
        	this.enumTypeDep = this.getDependencyDef("EnumType");
        }
        return this.enumTypeDep;
    }

    @objid ("cbc9724f-094c-4375-bbff-ab3cd373fdb8")
    private static class ModuleParameterObjectFactory implements ISmObjectFactory {
        @objid ("fa31e30d-6906-4509-98e5-3a4da010f7d3")
        private ModuleParameterSmClass smClass;

        @objid ("c2b32700-2b09-4b67-8108-b85b44e678af")
        public ModuleParameterObjectFactory(ModuleParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5440832c-7ef9-4e74-abed-140ad4819a44")
        @Override
        public ISmObjectData createData() {
            return new ModuleParameterData(this.smClass);
        }

        @objid ("97f6fe1b-9cf4-425d-8eef-deb5df16d61a")
        @Override
        public SmObjectImpl createImpl() {
            return new ModuleParameterImpl();
        }

    }

    @objid ("652a6809-3dfe-4111-9201-6ed69a8d6edc")
    public static class GroupNameSmAttribute extends SmAttribute {
        @objid ("de452213-0ddb-442e-8f6a-cb47d53af6f7")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mGroupName;
        }

        @objid ("252294f2-2764-4f13-9b4a-30021a3c6a0d")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mGroupName = value;
        }

    }

    @objid ("ae25645f-3196-4dbd-83c8-386768519290")
    public static class TypeSmAttribute extends SmAttribute {
        @objid ("3d01e23c-0d3e-415a-9cea-6aa145229442")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mType;
        }

        @objid ("5e481566-0996-41c2-9192-45dc7df105c9")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mType = value;
        }

    }

    @objid ("6c2efe13-694d-448e-9682-87a094abdc7a")
    public static class IsUserReadSmAttribute extends SmAttribute {
        @objid ("ecb594f4-1ae0-4c72-b3af-f14f71d5e262")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mIsUserRead;
        }

        @objid ("b54af80e-45cb-4249-a4f9-0eaa07eda877")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mIsUserRead = value;
        }

    }

    @objid ("b9a82bb8-0345-4e18-9957-df7e0d056fc5")
    public static class IsUserWriteSmAttribute extends SmAttribute {
        @objid ("50b4eb33-6ae0-4585-bb61-11711a3e5e2b")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mIsUserWrite;
        }

        @objid ("1fe078b4-fb1f-4b85-afc8-108be90ce168")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mIsUserWrite = value;
        }

    }

    @objid ("2b54329f-c90f-40db-a73f-353f1da27d65")
    public static class IsApiReadSmAttribute extends SmAttribute {
        @objid ("efad2440-4d68-464a-9724-b70a0c5522cd")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mIsApiRead;
        }

        @objid ("96bbeea7-750d-47fe-8dcf-a3d7c612a1c7")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mIsApiRead = value;
        }

    }

    @objid ("0c9b76b1-0f92-46cf-84af-41e2a8b7c2ac")
    public static class IsApiWriteSmAttribute extends SmAttribute {
        @objid ("6103aa1d-9657-4e22-9951-045121ad5101")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mIsApiWrite;
        }

        @objid ("7768f809-3112-49d7-b4a7-737a85908d2d")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mIsApiWrite = value;
        }

    }

    @objid ("38c0a962-e619-4302-8ca4-6fc43bbaf925")
    public static class DefaultValueSmAttribute extends SmAttribute {
        @objid ("09388d04-d1e6-4077-95f6-b96d039338a6")
        public Object getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mDefaultValue;
        }

        @objid ("4670d870-daca-4cc5-aadd-e79ef8bf3651")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleParameterData) data).mDefaultValue = value;
        }

    }

    @objid ("2ae1a21d-5537-4721-ac66-e7ff6d389c6c")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("6b8f3f74-60b7-424e-b7ca-d55b8d8fe596")
        private SmDependency symetricDep;

        @objid ("809538d3-b836-485d-bd36-81521c5e20e0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mOwner;
        }

        @objid ("357d9014-e08c-4efd-ac75-b7181f5fd054")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ModuleParameterData) data).mOwner = value;
        }

        @objid ("fb76a6de-0712-498e-a9ef-9b7588b6a08b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleComponentSmClass)this.getTarget()).getModuleParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f884cefd-9b20-4b89-acae-4cc989ea600f")
    public static class EnumTypeSmDependency extends SmSingleDependency {
        @objid ("d1c6b2fb-a08e-400a-b282-d48b20ed8e2c")
        private SmDependency symetricDep;

        @objid ("03a5e52e-e1f2-4401-8c36-59c6246a17a8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ModuleParameterData) data).mEnumType;
        }

        @objid ("06f8c160-d5b3-4f0d-a991-59a4cb35ef09")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ModuleParameterData) data).mEnumType = value;
        }

        @objid ("5f58922e-81e3-47e4-8439-eda3ed4b6244")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EnumerationSmClass)this.getTarget()).getOccurenceConfigParamDep();
            }
            return this.symetricDep;
        }

    }

}
