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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a04bbc92-8e0b-4e19-be5a-d9bf89e06abf")
public class ExternDocumentTypeSmClass extends ModelElementSmClass {
    @objid ("1daafac7-5887-4d7f-98f5-6b274132f071")
    private SmAttribute isHiddenAtt;

    @objid ("e4fb2e86-e310-439d-a48e-1936011c85c0")
    private SmAttribute labelKeyAtt;

    @objid ("bdd668d0-3101-424b-8883-97bd3e00fe39")
    private SmAttribute iconAtt;

    @objid ("182e6377-9499-4944-afca-c568a30b65bc")
    private SmAttribute imageAtt;

    @objid ("b3027d78-a312-4b8a-a590-bceaeb7dfee3")
    private SmDependency ownerStereotypeDep;

    @objid ("af85b6bd-c0e8-4fe9-9953-48f75184d79a")
    private SmDependency typedDocDep;

    @objid ("993e10b0-1538-451c-852d-9a317c84f7ca")
    private SmDependency ownerReferenceDep;

    @objid ("aa830554-bace-40ab-ac8e-b76b3dcfc796")
    public ExternDocumentTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ffb3c112-8c1f-4f72-a547-3936588ce09e")
    @Override
    public String getName() {
        return "ExternDocumentType";
    }

    @objid ("b597cfcb-7a27-4105-b505-3a51e94279c8")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f2faa6c5-185d-4334-8480-eed25f419cc3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExternDocumentType.class;
    }

    @objid ("176f7e1d-9f3e-4857-ad4d-0cb7c2110493")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4629514b-e53f-484a-bc9b-27cf11c87cc5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e71a05a5-c2e8-4f8d-926b-a70ea73e576e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ExternDocumentTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isHiddenAtt = new IsHiddenSmAttribute();
        this.isHiddenAtt.init("IsHidden", this, Boolean.class );
        registerAttribute(this.isHiddenAtt);
        
        this.labelKeyAtt = new LabelKeySmAttribute();
        this.labelKeyAtt.init("LabelKey", this, String.class );
        registerAttribute(this.labelKeyAtt);
        
        this.iconAtt = new IconSmAttribute();
        this.iconAtt.init("Icon", this, String.class );
        registerAttribute(this.iconAtt);
        
        this.imageAtt = new ImageSmAttribute();
        this.imageAtt.init("Image", this, String.class );
        registerAttribute(this.imageAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerStereotypeDep = new OwnerStereotypeSmDependency();
        this.ownerStereotypeDep.init("OwnerStereotype", this, metamodel.getMClass("Stereotype"), 0, 1 );
        registerDependency(this.ownerStereotypeDep);
        
        this.typedDocDep = new TypedDocSmDependency();
        this.typedDocDep.init("TypedDoc", this, metamodel.getMClass("ExternDocument"), 0, -1 , SmDirective.SMCDDYNAMIC, SmDirective.SMCDTODELETE);
        registerDependency(this.typedDocDep);
        
        this.ownerReferenceDep = new OwnerReferenceSmDependency();
        this.ownerReferenceDep.init("OwnerReference", this, metamodel.getMClass("MetaclassReference"), 0, 1 );
        registerDependency(this.ownerReferenceDep);
    }

    @objid ("38372cb8-13d2-4dbc-a7a1-20761620eb31")
    public SmAttribute getIsHiddenAtt() {
        if (this.isHiddenAtt == null) {
        	this.isHiddenAtt = this.getAttributeDef("IsHidden");
        }
        return this.isHiddenAtt;
    }

    @objid ("491f9467-5742-4a9e-a67c-0cabef9b491d")
    public SmAttribute getLabelKeyAtt() {
        if (this.labelKeyAtt == null) {
        	this.labelKeyAtt = this.getAttributeDef("LabelKey");
        }
        return this.labelKeyAtt;
    }

    @objid ("828c1ec8-02f1-41f6-ad8d-4b16625c05c1")
    public SmAttribute getIconAtt() {
        if (this.iconAtt == null) {
        	this.iconAtt = this.getAttributeDef("Icon");
        }
        return this.iconAtt;
    }

    @objid ("bb54b197-19ed-47c4-aafa-018e96e1e0f2")
    public SmAttribute getImageAtt() {
        if (this.imageAtt == null) {
        	this.imageAtt = this.getAttributeDef("Image");
        }
        return this.imageAtt;
    }

    @objid ("462f05be-ce39-437e-bd48-de9e799ba86a")
    public SmDependency getOwnerStereotypeDep() {
        if (this.ownerStereotypeDep == null) {
        	this.ownerStereotypeDep = this.getDependencyDef("OwnerStereotype");
        }
        return this.ownerStereotypeDep;
    }

    @objid ("6d70a2c0-5472-4931-bb2c-aeb0c19cec65")
    public SmDependency getTypedDocDep() {
        if (this.typedDocDep == null) {
        	this.typedDocDep = this.getDependencyDef("TypedDoc");
        }
        return this.typedDocDep;
    }

    @objid ("dabb69e1-47c0-403f-871a-cd2d3c38bb10")
    public SmDependency getOwnerReferenceDep() {
        if (this.ownerReferenceDep == null) {
        	this.ownerReferenceDep = this.getDependencyDef("OwnerReference");
        }
        return this.ownerReferenceDep;
    }

    @objid ("9fbfe9f0-655c-40ee-886b-c2d4ad184fa4")
    private static class ExternDocumentTypeObjectFactory implements ISmObjectFactory {
        @objid ("8697cbb0-1b64-4638-85b7-2d0d08b8549c")
        private ExternDocumentTypeSmClass smClass;

        @objid ("01828066-fe5b-4f2f-9810-857d3576db6d")
        public ExternDocumentTypeObjectFactory(ExternDocumentTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1e5e715a-0f3b-41a3-bcfd-787b64c56eab")
        @Override
        public ISmObjectData createData() {
            return new ExternDocumentTypeData(this.smClass);
        }

        @objid ("d3697020-7e88-4f3e-87ba-4d75ad6ebe3c")
        @Override
        public SmObjectImpl createImpl() {
            return new ExternDocumentTypeImpl();
        }

    }

    @objid ("55fa2fdb-8fff-4da6-955d-ebed9c9b4f10")
    public static class IsHiddenSmAttribute extends SmAttribute {
        @objid ("cb273b3a-67fe-4f33-a1ae-06dd91528664")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mIsHidden;
        }

        @objid ("49de960e-f3d3-44fe-9f0e-4d642cb313a2")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentTypeData) data).mIsHidden = value;
        }

    }

    @objid ("46597486-864c-4022-8642-32e38d667b02")
    public static class LabelKeySmAttribute extends SmAttribute {
        @objid ("3fa8aca5-be52-49cb-a50e-6bc23d389e0b")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mLabelKey;
        }

        @objid ("ac934deb-0932-4bab-b7ed-bd25200f0be3")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentTypeData) data).mLabelKey = value;
        }

    }

    @objid ("7d672000-0feb-46b7-b8b8-3e3f144058d2")
    public static class IconSmAttribute extends SmAttribute {
        @objid ("e044f09e-cc99-4b69-bde7-fa94be6e5cb5")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mIcon;
        }

        @objid ("5d63d61d-7816-4f22-b3a0-8f85bbe7fda4")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentTypeData) data).mIcon = value;
        }

    }

    @objid ("490c050e-ee2e-417d-ac98-20db2dede3f5")
    public static class ImageSmAttribute extends SmAttribute {
        @objid ("6bd601ad-6232-4a3c-90c1-ec8210292868")
        public Object getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mImage;
        }

        @objid ("4c32e97f-0e88-47bb-999c-7dea1b89454f")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternDocumentTypeData) data).mImage = value;
        }

    }

    @objid ("4b133606-f2b5-4033-b850-72ff6719756f")
    public static class OwnerStereotypeSmDependency extends SmSingleDependency {
        @objid ("5ba63cf6-85a4-41cd-89c1-7c88e087fc57")
        private SmDependency symetricDep;

        @objid ("0eb6423a-d75d-4f97-82d5-496f7a9c05b9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mOwnerStereotype;
        }

        @objid ("376a2592-ba12-477b-8cc2-203e13f101d1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternDocumentTypeData) data).mOwnerStereotype = value;
        }

        @objid ("65c77fc4-df5a-4b32-b078-c8ce4b70b414")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getDefinedExternDocumentTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9ba12c41-97a7-404a-8cb3-2b51445e7f7f")
    public static class TypedDocSmDependency extends SmMultipleDependency {
        @objid ("6f104474-a5dd-4c1b-84d6-9d49a55fa1c1")
        private SmDependency symetricDep;

        @objid ("57a15768-fb98-4136-94bf-f0a0e4d40f12")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExternDocumentTypeData)data).mTypedDoc != null)? ((ExternDocumentTypeData)data).mTypedDoc:SmMultipleDependency.EMPTY;
        }

        @objid ("64ee4480-a8c5-4d3c-b019-392d4eecbb65")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExternDocumentTypeData) data).mTypedDoc = values;
        }

        @objid ("e74d139e-5484-4412-9344-1a841f7095c5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternDocumentSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3eb8cc03-335c-4b76-8be7-89a94ab17190")
    public static class OwnerReferenceSmDependency extends SmSingleDependency {
        @objid ("56322a78-7035-44a3-b526-c159a05c8e36")
        private SmDependency symetricDep;

        @objid ("78b69594-ddf6-434d-9eac-3501f9366d38")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternDocumentTypeData) data).mOwnerReference;
        }

        @objid ("2e0460be-e8ea-4228-a3e5-dce68060d29b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternDocumentTypeData) data).mOwnerReference = value;
        }

        @objid ("793add9f-7482-4ae5-8d4b-4a0e8d57865f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MetaclassReferenceSmClass)this.getTarget()).getDefinedExternDocumentTypeDep();
            }
            return this.symetricDep;
        }

    }

}
