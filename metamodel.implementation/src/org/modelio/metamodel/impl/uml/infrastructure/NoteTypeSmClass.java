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
import org.modelio.metamodel.impl.uml.infrastructure.NoteSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.uml.infrastructure.NoteType;
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

@objid ("791cf857-e0a6-4d45-b992-f00114cf2def")
public class NoteTypeSmClass extends ModelElementSmClass {
    @objid ("66e91d44-6979-403f-9e82-b16495b2cbd4")
    private SmAttribute isHiddenAtt;

    @objid ("6d1e5172-e5a4-4773-8816-8d5ce953be15")
    private SmAttribute labelKeyAtt;

    @objid ("2ea4215f-615b-47e5-89b8-5ec0cf56d8df")
    private SmAttribute mimeTypeAtt;

    @objid ("7487370e-e11c-4d3d-b1ef-8776971e14bb")
    private SmDependency elementDep;

    @objid ("9ebdf22d-da38-4575-bc11-12136bc0fe70")
    private SmDependency ownerStereotypeDep;

    @objid ("5c570b8b-ac20-4605-b52a-235f942a5d3a")
    private SmDependency ownerReferenceDep;

    @objid ("fc0f7aa2-4e39-4d91-8b42-aadefff56be2")
    public NoteTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5bfd226c-a466-4438-b75b-de15ed97b319")
    @Override
    public String getName() {
        return "NoteType";
    }

    @objid ("0dd41d04-81f6-4436-a6f4-d7cdb86c9da1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7a568d56-5e13-42c0-b881-2069a11729b3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NoteType.class;
    }

    @objid ("b104c3a1-4582-46d5-878c-923b70cc25bf")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9339987a-39df-4352-9772-e634df5f25b7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("11d424e6-ed73-4bfd-9d1c-8075008e8e8a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new NoteTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isHiddenAtt = new IsHiddenSmAttribute();
        this.isHiddenAtt.init("IsHidden", this, Boolean.class );
        registerAttribute(this.isHiddenAtt);
        
        this.labelKeyAtt = new LabelKeySmAttribute();
        this.labelKeyAtt.init("LabelKey", this, String.class );
        registerAttribute(this.labelKeyAtt);
        
        this.mimeTypeAtt = new MimeTypeSmAttribute();
        this.mimeTypeAtt.init("MimeType", this, String.class );
        registerAttribute(this.mimeTypeAtt);
        
        
        // Initialize and register the SmDependency
        this.elementDep = new ElementSmDependency();
        this.elementDep.init("Element", this, metamodel.getMClass("Note"), 0, -1 , SmDirective.SMCDDYNAMIC, SmDirective.SMCDTODELETE);
        registerDependency(this.elementDep);
        
        this.ownerStereotypeDep = new OwnerStereotypeSmDependency();
        this.ownerStereotypeDep.init("OwnerStereotype", this, metamodel.getMClass("Stereotype"), 0, 1 );
        registerDependency(this.ownerStereotypeDep);
        
        this.ownerReferenceDep = new OwnerReferenceSmDependency();
        this.ownerReferenceDep.init("OwnerReference", this, metamodel.getMClass("MetaclassReference"), 0, 1 );
        registerDependency(this.ownerReferenceDep);
    }

    @objid ("8c43e24c-d416-4ce6-947b-6519174b47d9")
    public SmAttribute getIsHiddenAtt() {
        if (this.isHiddenAtt == null) {
        	this.isHiddenAtt = this.getAttributeDef("IsHidden");
        }
        return this.isHiddenAtt;
    }

    @objid ("931cb817-25f0-4fe1-9b2e-3d15bf8ac59d")
    public SmAttribute getLabelKeyAtt() {
        if (this.labelKeyAtt == null) {
        	this.labelKeyAtt = this.getAttributeDef("LabelKey");
        }
        return this.labelKeyAtt;
    }

    @objid ("5d4f93e3-9112-4893-8969-35e137c4646e")
    public SmAttribute getMimeTypeAtt() {
        if (this.mimeTypeAtt == null) {
        	this.mimeTypeAtt = this.getAttributeDef("MimeType");
        }
        return this.mimeTypeAtt;
    }

    @objid ("cfbf79ec-0f18-4cb6-90bd-1bb9d80b2801")
    public SmDependency getElementDep() {
        if (this.elementDep == null) {
        	this.elementDep = this.getDependencyDef("Element");
        }
        return this.elementDep;
    }

    @objid ("47fc8568-b2bf-4e5b-a3b2-d30a6eeda100")
    public SmDependency getOwnerStereotypeDep() {
        if (this.ownerStereotypeDep == null) {
        	this.ownerStereotypeDep = this.getDependencyDef("OwnerStereotype");
        }
        return this.ownerStereotypeDep;
    }

    @objid ("15a14e3f-675f-478b-9c54-ca3e5b752d66")
    public SmDependency getOwnerReferenceDep() {
        if (this.ownerReferenceDep == null) {
        	this.ownerReferenceDep = this.getDependencyDef("OwnerReference");
        }
        return this.ownerReferenceDep;
    }

    @objid ("942a75ca-1874-4532-8444-49560644ff4e")
    private static class NoteTypeObjectFactory implements ISmObjectFactory {
        @objid ("0a130734-9092-458c-857a-0142132a053c")
        private NoteTypeSmClass smClass;

        @objid ("9eef300a-1b9e-43e1-9f48-61872174c63f")
        public NoteTypeObjectFactory(NoteTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("cc4f068d-ea61-4640-91e7-8aef73797b98")
        @Override
        public ISmObjectData createData() {
            return new NoteTypeData(this.smClass);
        }

        @objid ("727a6062-9a4e-4a57-9f27-195d4812d8a8")
        @Override
        public SmObjectImpl createImpl() {
            return new NoteTypeImpl();
        }

    }

    @objid ("bdcf73b6-be72-47d5-9965-0362decc047e")
    public static class IsHiddenSmAttribute extends SmAttribute {
        @objid ("e05bc657-9c09-425b-b51f-eed659e9ddde")
        public Object getValue(ISmObjectData data) {
            return ((NoteTypeData) data).mIsHidden;
        }

        @objid ("dd36200f-8021-479d-9710-aaa602036b67")
        public void setValue(ISmObjectData data, Object value) {
            ((NoteTypeData) data).mIsHidden = value;
        }

    }

    @objid ("82880169-c5f8-4852-ac5f-c1a9d9fd46b9")
    public static class LabelKeySmAttribute extends SmAttribute {
        @objid ("a031eabd-b023-4b36-ad01-b1520e34f581")
        public Object getValue(ISmObjectData data) {
            return ((NoteTypeData) data).mLabelKey;
        }

        @objid ("eb30bdfc-3260-4052-9f09-5f984edad3dc")
        public void setValue(ISmObjectData data, Object value) {
            ((NoteTypeData) data).mLabelKey = value;
        }

    }

    @objid ("44682bee-bace-4984-872b-224c611b2e41")
    public static class MimeTypeSmAttribute extends SmAttribute {
        @objid ("b27b5f95-2ed0-41d4-8ed7-0d8b7853d5eb")
        public Object getValue(ISmObjectData data) {
            return ((NoteTypeData) data).mMimeType;
        }

        @objid ("ee6af993-2bbe-4e81-82c9-ec13ba5e4614")
        public void setValue(ISmObjectData data, Object value) {
            ((NoteTypeData) data).mMimeType = value;
        }

    }

    @objid ("246c5179-8bd1-440d-b582-cc785614531d")
    public static class ElementSmDependency extends SmMultipleDependency {
        @objid ("cdc29037-8c49-4255-9a26-f6640a3954d1")
        private SmDependency symetricDep;

        @objid ("ddf63042-2f68-40b3-88fb-5f735fd62b0e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NoteTypeData)data).mElement != null)? ((NoteTypeData)data).mElement:SmMultipleDependency.EMPTY;
        }

        @objid ("a31c444a-934a-48a5-8cb0-5fa25d2cb4f1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NoteTypeData) data).mElement = values;
        }

        @objid ("5dec481c-f325-47ac-9a6a-145a0dfb8b89")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NoteSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c80393ac-3b50-4e11-b416-b6ada55d419d")
    public static class OwnerStereotypeSmDependency extends SmSingleDependency {
        @objid ("ba2b5fd7-ae86-4eaa-8549-5be9fd467ea4")
        private SmDependency symetricDep;

        @objid ("f395f28d-86e3-4c09-9ae3-9f7649548a79")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NoteTypeData) data).mOwnerStereotype;
        }

        @objid ("0d15e56e-74ae-468a-93ed-dd28611f9c15")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NoteTypeData) data).mOwnerStereotype = value;
        }

        @objid ("4f388634-a4bd-4e16-858a-3f5d4f39a12a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getDefinedNoteTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("09b02326-2389-4001-8db2-75b7889f78ff")
    public static class OwnerReferenceSmDependency extends SmSingleDependency {
        @objid ("499b17e1-4397-42c5-9127-cca97c58bcde")
        private SmDependency symetricDep;

        @objid ("cb9a800a-1e37-4915-b61c-ece6deaa7f6a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NoteTypeData) data).mOwnerReference;
        }

        @objid ("9e6f34cf-8c6b-4741-bacd-bb088b4733de")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NoteTypeData) data).mOwnerReference = value;
        }

        @objid ("0ec41d99-ef03-4589-9318-285aed5a0588")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MetaclassReferenceSmClass)this.getTarget()).getDefinedNoteTypeDep();
            }
            return this.symetricDep;
        }

    }

}
