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
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueSmClass;
import org.modelio.metamodel.uml.infrastructure.TagType;
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

@objid ("1b205375-7fad-49bb-9e9c-ef69401b364b")
public class TagTypeSmClass extends ModelElementSmClass {
    @objid ("c3d80a2e-ae3f-4f9f-a3ad-df8092c217f6")
    private SmAttribute paramNumberAtt;

    @objid ("43ff5960-ed1d-4f40-9363-1d0fbb45cfbb")
    private SmAttribute isQualifiedAtt;

    @objid ("4a61ae91-d2c8-43b3-bdf1-85ceb0021ceb")
    private SmAttribute belongToPrototypeAtt;

    @objid ("881ec241-07c9-436f-8695-dbb4d1afc7e5")
    private SmAttribute isHiddenAtt;

    @objid ("ab607076-df58-4e37-b792-18ea83327aae")
    private SmAttribute labelKeyAtt;

    @objid ("c90b78df-1739-40f3-ac09-aa3dd12e907e")
    private SmDependency tagOccurenceDep;

    @objid ("4b63dece-0228-4dd9-a53e-38c9d04cc90a")
    private SmDependency ownerStereotypeDep;

    @objid ("25687e5d-f7dc-464e-bd6c-164944f8e25e")
    private SmDependency ownerReferenceDep;

    @objid ("fc4b3f10-983e-4c38-8666-2eace1e98a9a")
    public TagTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9f525104-39eb-41fa-92de-cc46b2ad9afb")
    @Override
    public String getName() {
        return "TagType";
    }

    @objid ("fe779f63-a492-49b8-bd1f-814d67a724a1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("15176294-0a28-49fe-9879-ff75b84ebb9b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return TagType.class;
    }

    @objid ("a41f0eef-5ec9-436d-af9f-2e8a0f3c5987")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4dd8e013-d47f-49e7-8501-ff88e6097d83")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7052fd8f-b547-4694-9c29-563552c5c57d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new TagTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.paramNumberAtt = new ParamNumberSmAttribute();
        this.paramNumberAtt.init("ParamNumber", this, String.class );
        registerAttribute(this.paramNumberAtt);
        
        this.isQualifiedAtt = new IsQualifiedSmAttribute();
        this.isQualifiedAtt.init("IsQualified", this, Boolean.class );
        registerAttribute(this.isQualifiedAtt);
        
        this.belongToPrototypeAtt = new BelongToPrototypeSmAttribute();
        this.belongToPrototypeAtt.init("BelongToPrototype", this, Boolean.class );
        registerAttribute(this.belongToPrototypeAtt);
        
        this.isHiddenAtt = new IsHiddenSmAttribute();
        this.isHiddenAtt.init("IsHidden", this, Boolean.class );
        registerAttribute(this.isHiddenAtt);
        
        this.labelKeyAtt = new LabelKeySmAttribute();
        this.labelKeyAtt.init("LabelKey", this, String.class );
        registerAttribute(this.labelKeyAtt);
        
        
        // Initialize and register the SmDependency
        this.tagOccurenceDep = new TagOccurenceSmDependency();
        this.tagOccurenceDep.init("TagOccurence", this, metamodel.getMClass("TaggedValue"), 0, -1 , SmDirective.SMCDTODELETE, SmDirective.SMCDDYNAMIC);
        registerDependency(this.tagOccurenceDep);
        
        this.ownerStereotypeDep = new OwnerStereotypeSmDependency();
        this.ownerStereotypeDep.init("OwnerStereotype", this, metamodel.getMClass("Stereotype"), 0, 1 );
        registerDependency(this.ownerStereotypeDep);
        
        this.ownerReferenceDep = new OwnerReferenceSmDependency();
        this.ownerReferenceDep.init("OwnerReference", this, metamodel.getMClass("MetaclassReference"), 0, 1 );
        registerDependency(this.ownerReferenceDep);
    }

    @objid ("aa5cdbc7-4044-4dbe-ad2e-31d8ea8b5e38")
    public SmAttribute getParamNumberAtt() {
        if (this.paramNumberAtt == null) {
        	this.paramNumberAtt = this.getAttributeDef("ParamNumber");
        }
        return this.paramNumberAtt;
    }

    @objid ("9118bfe8-5cf4-4a9c-bc24-e2c50522ca21")
    public SmAttribute getIsQualifiedAtt() {
        if (this.isQualifiedAtt == null) {
        	this.isQualifiedAtt = this.getAttributeDef("IsQualified");
        }
        return this.isQualifiedAtt;
    }

    @objid ("b84bb5ea-d427-431c-b144-f92c7652cb53")
    public SmAttribute getBelongToPrototypeAtt() {
        if (this.belongToPrototypeAtt == null) {
        	this.belongToPrototypeAtt = this.getAttributeDef("BelongToPrototype");
        }
        return this.belongToPrototypeAtt;
    }

    @objid ("bc1702ed-c203-43a1-b6c3-71ff4941a39a")
    public SmAttribute getIsHiddenAtt() {
        if (this.isHiddenAtt == null) {
        	this.isHiddenAtt = this.getAttributeDef("IsHidden");
        }
        return this.isHiddenAtt;
    }

    @objid ("05f4e24f-a95e-4102-959f-0c5adb10c8f4")
    public SmAttribute getLabelKeyAtt() {
        if (this.labelKeyAtt == null) {
        	this.labelKeyAtt = this.getAttributeDef("LabelKey");
        }
        return this.labelKeyAtt;
    }

    @objid ("7014ba40-c2fb-4338-af57-9dddedf53b62")
    public SmDependency getTagOccurenceDep() {
        if (this.tagOccurenceDep == null) {
        	this.tagOccurenceDep = this.getDependencyDef("TagOccurence");
        }
        return this.tagOccurenceDep;
    }

    @objid ("593b157e-ae72-417e-8659-b3380bbc137e")
    public SmDependency getOwnerStereotypeDep() {
        if (this.ownerStereotypeDep == null) {
        	this.ownerStereotypeDep = this.getDependencyDef("OwnerStereotype");
        }
        return this.ownerStereotypeDep;
    }

    @objid ("e104c0d8-4dd2-4a0e-b9da-cf9e918262d6")
    public SmDependency getOwnerReferenceDep() {
        if (this.ownerReferenceDep == null) {
        	this.ownerReferenceDep = this.getDependencyDef("OwnerReference");
        }
        return this.ownerReferenceDep;
    }

    @objid ("b84a42ca-fccd-49ff-ae68-070bcce703f1")
    private static class TagTypeObjectFactory implements ISmObjectFactory {
        @objid ("dc064930-52e3-4bb0-a82a-509f085c74eb")
        private TagTypeSmClass smClass;

        @objid ("bdf991fa-3093-4c02-8b23-ea3412002844")
        public TagTypeObjectFactory(TagTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("6fa65e49-c28b-4713-bc8c-904054b4b0dc")
        @Override
        public ISmObjectData createData() {
            return new TagTypeData(this.smClass);
        }

        @objid ("a8b01e0b-0073-49c6-8de6-c7f6deed8bc2")
        @Override
        public SmObjectImpl createImpl() {
            return new TagTypeImpl();
        }

    }

    @objid ("d10709cc-91f9-47a8-b7dc-067465f64289")
    public static class ParamNumberSmAttribute extends SmAttribute {
        @objid ("5aa2abf5-b827-46b3-b264-f5a50b21808c")
        public Object getValue(ISmObjectData data) {
            return ((TagTypeData) data).mParamNumber;
        }

        @objid ("ce6b8e8e-bc7f-4948-96c9-673b3b90a124")
        public void setValue(ISmObjectData data, Object value) {
            ((TagTypeData) data).mParamNumber = value;
        }

    }

    @objid ("6860a910-4fdd-48f0-baa2-4086bcd81d73")
    public static class IsQualifiedSmAttribute extends SmAttribute {
        @objid ("f862c0b0-bfa4-4a78-be5c-d870493dc5c8")
        public Object getValue(ISmObjectData data) {
            return ((TagTypeData) data).mIsQualified;
        }

        @objid ("931474a3-4240-487e-bdda-3fd29eb88699")
        public void setValue(ISmObjectData data, Object value) {
            ((TagTypeData) data).mIsQualified = value;
        }

    }

    @objid ("a21f345f-6309-48d5-abd6-de960d66d543")
    public static class BelongToPrototypeSmAttribute extends SmAttribute {
        @objid ("c18b5bfe-33df-4ea7-8e0b-8ba9294adae3")
        public Object getValue(ISmObjectData data) {
            return ((TagTypeData) data).mBelongToPrototype;
        }

        @objid ("144c7c73-d89e-402f-97cb-5b0c43d18a5c")
        public void setValue(ISmObjectData data, Object value) {
            ((TagTypeData) data).mBelongToPrototype = value;
        }

    }

    @objid ("a253e13f-60c6-4481-b56e-cf6e893f8dc1")
    public static class IsHiddenSmAttribute extends SmAttribute {
        @objid ("9eb6176c-5946-4f63-98a3-0dc98209ca47")
        public Object getValue(ISmObjectData data) {
            return ((TagTypeData) data).mIsHidden;
        }

        @objid ("7cee006e-3fdf-4868-89c9-e7ba65a417b3")
        public void setValue(ISmObjectData data, Object value) {
            ((TagTypeData) data).mIsHidden = value;
        }

    }

    @objid ("7d1c7410-276a-4b9c-b63f-2dc7f60eb3ad")
    public static class LabelKeySmAttribute extends SmAttribute {
        @objid ("2fb9265f-3d2b-45da-87b6-2eeb35c969ce")
        public Object getValue(ISmObjectData data) {
            return ((TagTypeData) data).mLabelKey;
        }

        @objid ("f028ed5f-2195-4e41-b3ab-1bd059ba9506")
        public void setValue(ISmObjectData data, Object value) {
            ((TagTypeData) data).mLabelKey = value;
        }

    }

    @objid ("06891f1e-24a1-4766-84f0-71ff7e1bb487")
    public static class TagOccurenceSmDependency extends SmMultipleDependency {
        @objid ("7d051773-77a3-4b77-b078-87daeb711069")
        private SmDependency symetricDep;

        @objid ("f17c29c6-af5b-41b6-b785-961769a46a23")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((TagTypeData)data).mTagOccurence != null)? ((TagTypeData)data).mTagOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("1060b134-e31f-4b04-b1ad-434c0984a4c7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((TagTypeData) data).mTagOccurence = values;
        }

        @objid ("b03a0e34-b852-4836-a39d-7078f5e02ef4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TaggedValueSmClass)this.getTarget()).getDefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ddefe540-96c4-48c5-9870-8abdfad966ee")
    public static class OwnerStereotypeSmDependency extends SmSingleDependency {
        @objid ("ac2176a3-3c8b-4254-b5f6-603d35568d43")
        private SmDependency symetricDep;

        @objid ("c245066d-33a2-426f-9bfc-2be4d777edc9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TagTypeData) data).mOwnerStereotype;
        }

        @objid ("e3a42edc-5388-4eec-89af-c14c174ed63a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TagTypeData) data).mOwnerStereotype = value;
        }

        @objid ("92c7fba3-513d-4f54-998c-590f5e9282c0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getDefinedTagTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("46c24b54-78f9-42e8-8978-de751724e3ff")
    public static class OwnerReferenceSmDependency extends SmSingleDependency {
        @objid ("0a04f855-850a-4f48-a88a-cbe24f58a4bd")
        private SmDependency symetricDep;

        @objid ("282eeb90-e106-4e9a-8803-7959c3dc48fa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TagTypeData) data).mOwnerReference;
        }

        @objid ("8d1766e7-1b68-4824-b2d3-39aa3f97ca07")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TagTypeData) data).mOwnerReference = value;
        }

        @objid ("b66e5207-fe18-42af-809c-c549474e4456")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MetaclassReferenceSmClass)this.getTarget()).getDefinedTagTypeDep();
            }
            return this.symetricDep;
        }

    }

}
