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
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("e7b338a3-8dcc-4bf8-82ff-571a6f874e3d")
public class StereotypeSmClass extends ModelElementSmClass {
    @objid ("5cb77428-b43c-409e-9722-74e01a5c0292")
    private SmAttribute imageAtt;

    @objid ("bedc01b0-a182-443f-ba1f-91f476cab50b")
    private SmAttribute iconAtt;

    @objid ("938c96cf-d78f-4a3e-93aa-f8c245993e25")
    private SmAttribute isHiddenAtt;

    @objid ("7ab6b1f8-31ba-48dd-92b7-fcd94814e0bd")
    private SmAttribute labelKeyAtt;

    @objid ("9ca62866-2010-4412-854d-15f7b17fab7d")
    private SmAttribute baseClassNameAtt;

    @objid ("34aaa805-5785-4e1b-80d8-85098343db0f")
    private SmDependency definedTableDep;

    @objid ("b538a1cc-9b6b-4576-b633-a4c3d4f970ad")
    private SmDependency extendedElementDep;

    @objid ("d87b35d8-090e-4744-9a34-ddf89f683f0f")
    private SmDependency definedExternDocumentTypeDep;

    @objid ("1a46ba71-019e-4d84-a874-29944a04c6d0")
    private SmDependency ownerDep;

    @objid ("facde69c-0fe2-4f77-8924-633ac5788d5a")
    private SmDependency parentDep;

    @objid ("6f7c7f87-6b7c-480c-b216-4851de0e7c5c")
    private SmDependency definedTagTypeDep;

    @objid ("d2f9e23a-d746-4fa2-86f7-0bc129f7d1be")
    private SmDependency childDep;

    @objid ("366c8068-9737-445f-8bf1-e5a9c5293e1a")
    private SmDependency definedNoteTypeDep;

    @objid ("d87b1925-87b9-4319-a670-b51aed32dfc5")
    public StereotypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7960af67-02a9-46dd-97ee-abcf8d59e8be")
    @Override
    public String getName() {
        return "Stereotype";
    }

    @objid ("b5ceeda6-4a16-4419-adc6-d168ef525f82")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f9910476-f547-4722-9d13-4581327ced22")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Stereotype.class;
    }

    @objid ("9b1a89c7-e9f8-458e-975b-9d5e3a7f30ff")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("71185ad2-6979-4c6f-bfcd-f23c3a41f543")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("41c8b8ba-7e48-47f8-9370-34629459d614")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new StereotypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.imageAtt = new ImageSmAttribute();
        this.imageAtt.init("Image", this, String.class );
        registerAttribute(this.imageAtt);
        
        this.iconAtt = new IconSmAttribute();
        this.iconAtt.init("Icon", this, String.class );
        registerAttribute(this.iconAtt);
        
        this.isHiddenAtt = new IsHiddenSmAttribute();
        this.isHiddenAtt.init("IsHidden", this, Boolean.class );
        registerAttribute(this.isHiddenAtt);
        
        this.labelKeyAtt = new LabelKeySmAttribute();
        this.labelKeyAtt.init("LabelKey", this, String.class );
        registerAttribute(this.labelKeyAtt);
        
        this.baseClassNameAtt = new BaseClassNameSmAttribute();
        this.baseClassNameAtt.init("BaseClassName", this, String.class );
        registerAttribute(this.baseClassNameAtt);
        
        
        // Initialize and register the SmDependency
        this.definedTableDep = new DefinedTableSmDependency();
        this.definedTableDep.init("DefinedTable", this, metamodel.getMClass("PropertyTableDefinition"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTableDep);
        
        this.extendedElementDep = new ExtendedElementSmDependency();
        this.extendedElementDep.init("ExtendedElement", this, metamodel.getMClass("ModelElement"), 0, -1 );
        registerDependency(this.extendedElementDep);
        
        this.definedExternDocumentTypeDep = new DefinedExternDocumentTypeSmDependency();
        this.definedExternDocumentTypeDep.init("DefinedExternDocumentType", this, metamodel.getMClass("ExternDocumentType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedExternDocumentTypeDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Profile"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.parentDep = new ParentSmDependency();
        this.parentDep.init("Parent", this, metamodel.getMClass("Stereotype"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.parentDep);
        
        this.definedTagTypeDep = new DefinedTagTypeSmDependency();
        this.definedTagTypeDep.init("DefinedTagType", this, metamodel.getMClass("TagType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTagTypeDep);
        
        this.childDep = new ChildSmDependency();
        this.childDep.init("Child", this, metamodel.getMClass("Stereotype"), 0, -1 );
        registerDependency(this.childDep);
        
        this.definedNoteTypeDep = new DefinedNoteTypeSmDependency();
        this.definedNoteTypeDep.init("DefinedNoteType", this, metamodel.getMClass("NoteType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedNoteTypeDep);
    }

    @objid ("bd294714-5999-4d3f-bf67-d949398355aa")
    public SmAttribute getImageAtt() {
        if (this.imageAtt == null) {
        	this.imageAtt = this.getAttributeDef("Image");
        }
        return this.imageAtt;
    }

    @objid ("fb6f1024-703a-4c52-bcb2-2c323f147c86")
    public SmAttribute getIconAtt() {
        if (this.iconAtt == null) {
        	this.iconAtt = this.getAttributeDef("Icon");
        }
        return this.iconAtt;
    }

    @objid ("cb346cef-671e-471e-a4a0-6a3b648ea9e8")
    public SmAttribute getIsHiddenAtt() {
        if (this.isHiddenAtt == null) {
        	this.isHiddenAtt = this.getAttributeDef("IsHidden");
        }
        return this.isHiddenAtt;
    }

    @objid ("1e8ae60f-5d30-451c-a50b-0232cc1de33c")
    public SmAttribute getLabelKeyAtt() {
        if (this.labelKeyAtt == null) {
        	this.labelKeyAtt = this.getAttributeDef("LabelKey");
        }
        return this.labelKeyAtt;
    }

    @objid ("82fa4572-d85a-4f3f-ba1b-b3bf5ac5da2e")
    public SmAttribute getBaseClassNameAtt() {
        if (this.baseClassNameAtt == null) {
        	this.baseClassNameAtt = this.getAttributeDef("BaseClassName");
        }
        return this.baseClassNameAtt;
    }

    @objid ("4cb78ac6-40a8-4463-af73-9221ab62b669")
    public SmDependency getDefinedTableDep() {
        if (this.definedTableDep == null) {
        	this.definedTableDep = this.getDependencyDef("DefinedTable");
        }
        return this.definedTableDep;
    }

    @objid ("f0c38239-84ae-4dd6-92ab-525b34b20cd8")
    public SmDependency getExtendedElementDep() {
        if (this.extendedElementDep == null) {
        	this.extendedElementDep = this.getDependencyDef("ExtendedElement");
        }
        return this.extendedElementDep;
    }

    @objid ("82316513-c1e3-4c6a-87fa-3abee8726a80")
    public SmDependency getDefinedExternDocumentTypeDep() {
        if (this.definedExternDocumentTypeDep == null) {
        	this.definedExternDocumentTypeDep = this.getDependencyDef("DefinedExternDocumentType");
        }
        return this.definedExternDocumentTypeDep;
    }

    @objid ("5225fa82-68a5-47c6-a10c-361c5c901f6c")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("ff3430a3-ef13-4806-ba30-4f4e77cb19c6")
    public SmDependency getParentDep() {
        if (this.parentDep == null) {
        	this.parentDep = this.getDependencyDef("Parent");
        }
        return this.parentDep;
    }

    @objid ("da8027d6-1182-4b76-b261-957e7da3f4be")
    public SmDependency getDefinedTagTypeDep() {
        if (this.definedTagTypeDep == null) {
        	this.definedTagTypeDep = this.getDependencyDef("DefinedTagType");
        }
        return this.definedTagTypeDep;
    }

    @objid ("f7b5b6c8-ddf1-44e9-8706-0cf214b5be5d")
    public SmDependency getChildDep() {
        if (this.childDep == null) {
        	this.childDep = this.getDependencyDef("Child");
        }
        return this.childDep;
    }

    @objid ("777b8a98-d8a2-4109-9491-fae5f8092e5a")
    public SmDependency getDefinedNoteTypeDep() {
        if (this.definedNoteTypeDep == null) {
        	this.definedNoteTypeDep = this.getDependencyDef("DefinedNoteType");
        }
        return this.definedNoteTypeDep;
    }

    @objid ("c7ed35d7-9fc2-4db3-b39b-e93b8c8c90de")
    private static class StereotypeObjectFactory implements ISmObjectFactory {
        @objid ("e72089fa-1ad1-4f8a-a496-3a41ff184468")
        private StereotypeSmClass smClass;

        @objid ("399b8380-628c-46f5-bf16-031d70c77e92")
        public StereotypeObjectFactory(StereotypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1ed7d3ae-9b2b-4a15-b59d-cab43e47afa9")
        @Override
        public ISmObjectData createData() {
            return new StereotypeData(this.smClass);
        }

        @objid ("9bc34164-5339-4670-9d23-b5b26aec00d8")
        @Override
        public SmObjectImpl createImpl() {
            return new StereotypeImpl();
        }

    }

    @objid ("79e4e21c-de63-4fa7-9e68-8d06ba5d79b8")
    public static class ImageSmAttribute extends SmAttribute {
        @objid ("4eee9be3-04d4-4b07-a71f-166dad2e8bee")
        public Object getValue(ISmObjectData data) {
            return ((StereotypeData) data).mImage;
        }

        @objid ("a31c5d90-37eb-4a18-9d3f-c903d9f89eb4")
        public void setValue(ISmObjectData data, Object value) {
            ((StereotypeData) data).mImage = value;
        }

    }

    @objid ("66b566b4-dfa4-44b1-82e4-a0d829f47121")
    public static class IconSmAttribute extends SmAttribute {
        @objid ("371ada43-2f72-4408-8506-f2564456b533")
        public Object getValue(ISmObjectData data) {
            return ((StereotypeData) data).mIcon;
        }

        @objid ("95ab556d-81ae-4fb7-b7c6-96a4d986ca77")
        public void setValue(ISmObjectData data, Object value) {
            ((StereotypeData) data).mIcon = value;
        }

    }

    @objid ("ecb57f24-0949-46a9-939a-611d159af29a")
    public static class IsHiddenSmAttribute extends SmAttribute {
        @objid ("a0f0f725-58e1-449e-aa36-f775cfdc9a24")
        public Object getValue(ISmObjectData data) {
            return ((StereotypeData) data).mIsHidden;
        }

        @objid ("7c4e2282-b379-41e5-b2c2-aee11ce034e0")
        public void setValue(ISmObjectData data, Object value) {
            ((StereotypeData) data).mIsHidden = value;
        }

    }

    @objid ("05752ae0-9394-4a70-98ef-01d3b0f1feda")
    public static class LabelKeySmAttribute extends SmAttribute {
        @objid ("4444ef9b-caa8-4320-b7e6-5e11c8534283")
        public Object getValue(ISmObjectData data) {
            return ((StereotypeData) data).mLabelKey;
        }

        @objid ("9e09d961-b54c-423f-987f-c8921095273b")
        public void setValue(ISmObjectData data, Object value) {
            ((StereotypeData) data).mLabelKey = value;
        }

    }

    @objid ("fe634eda-ca2e-410a-945f-c041d0c442bd")
    public static class BaseClassNameSmAttribute extends SmAttribute {
        @objid ("046f7f2e-ade5-427b-bc17-5ef541c071da")
        public Object getValue(ISmObjectData data) {
            return ((StereotypeData) data).mBaseClassName;
        }

        @objid ("52ef9f51-8bbe-41ac-9820-bd69a440c1ec")
        public void setValue(ISmObjectData data, Object value) {
            ((StereotypeData) data).mBaseClassName = value;
        }

    }

    @objid ("9954783e-2727-4b0f-81f9-51266c9eac0d")
    public static class DefinedTableSmDependency extends SmSingleDependency {
        @objid ("6f8e849a-7b98-4b57-a698-9c5c173ac6e0")
        private SmDependency symetricDep;

        @objid ("c7c9a742-5bde-4964-a2e2-bd8bc1d30a20")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StereotypeData) data).mDefinedTable;
        }

        @objid ("05da8ca1-8861-455d-91f3-1b5731da4307")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StereotypeData) data).mDefinedTable = value;
        }

        @objid ("232aea63-ae79-4cab-b459-bc61a11addcb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableDefinitionSmClass)this.getTarget()).getOwnerStereotypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b30044ab-031c-43e4-81bc-b09b3b67ffaa")
    public static class ExtendedElementSmDependency extends SmMultipleDependency {
        @objid ("9aab6a38-21ac-420b-9676-46442dede998")
        private SmDependency symetricDep;

        @objid ("b4346cb8-dc37-4ad4-8ee7-c0cadaef01b9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StereotypeData)data).mExtendedElement != null)? ((StereotypeData)data).mExtendedElement:SmMultipleDependency.EMPTY;
        }

        @objid ("492494ae-e863-49f0-81bb-bc2077eb6ab8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StereotypeData) data).mExtendedElement = values;
        }

        @objid ("a003c39a-96f1-4948-8db4-01103d3ff438")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getExtensionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5ba101d2-7234-42ec-8396-874e1482e8ce")
    public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
        @objid ("4c88e0e6-3209-4055-ba0d-363315ff1532")
        private SmDependency symetricDep;

        @objid ("d337ebce-f41d-4e91-8ccb-587afae539cf")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StereotypeData)data).mDefinedExternDocumentType != null)? ((StereotypeData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
        }

        @objid ("8af0ed09-a8be-40bd-8c67-7621a1ac7a20")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StereotypeData) data).mDefinedExternDocumentType = values;
        }

        @objid ("cee18298-c398-4911-a1fb-d551d0bfad4e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternDocumentTypeSmClass)this.getTarget()).getOwnerStereotypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1c7217f3-eb36-48be-9519-c83933d752ad")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("efcb91e8-21f0-45df-8c8d-8835d8d1e314")
        private SmDependency symetricDep;

        @objid ("261cbae0-c636-486f-ae27-cee58d27e1e0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StereotypeData) data).mOwner;
        }

        @objid ("5d8aee15-8586-40ca-a695-736763844b35")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StereotypeData) data).mOwner = value;
        }

        @objid ("e55bb02a-7ce5-4539-a825-c563db8473e2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProfileSmClass)this.getTarget()).getDefinedStereotypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c6b3d493-b8b3-4d7a-8640-4e1f62ae14c4")
    public static class ParentSmDependency extends SmSingleDependency {
        @objid ("a715f7ab-47ef-4c28-b1df-ca38efe9a169")
        private SmDependency symetricDep;

        @objid ("38a677ce-291a-44fd-ab25-a0bff9a40ed2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StereotypeData) data).mParent;
        }

        @objid ("0a02493d-7c46-4b39-ac1f-b84a294c38f9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StereotypeData) data).mParent = value;
        }

        @objid ("b22295b1-f41d-49bd-a231-5cf387740a34")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getChildDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c40c45da-92b8-4257-9036-c86ab34cc24a")
    public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
        @objid ("48d56996-1b71-480d-a66f-858aacc37976")
        private SmDependency symetricDep;

        @objid ("0dfe3280-85f9-4c1b-bba1-387741c7ef17")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StereotypeData)data).mDefinedTagType != null)? ((StereotypeData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
        }

        @objid ("b64b3116-cb45-4e94-b60b-d9d9371d893e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StereotypeData) data).mDefinedTagType = values;
        }

        @objid ("ab0897a1-abe9-440c-8bc4-495a2f064f0b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TagTypeSmClass)this.getTarget()).getOwnerStereotypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9e588c0f-df5a-46d1-b792-ee224cd69462")
    public static class ChildSmDependency extends SmMultipleDependency {
        @objid ("891266e4-d758-4a47-9ba1-f81040033fbd")
        private SmDependency symetricDep;

        @objid ("5b0c1247-d7bc-42b0-bff4-c66557a1c31f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StereotypeData)data).mChild != null)? ((StereotypeData)data).mChild:SmMultipleDependency.EMPTY;
        }

        @objid ("d006e855-0585-4072-b4a3-5659e627bf2e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StereotypeData) data).mChild = values;
        }

        @objid ("4512f043-28c2-4d1c-8497-f208163fe4d5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getParentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b4e41a3e-518f-499d-bcda-d9d655f09aab")
    public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
        @objid ("f28c330d-cd63-4567-8a8c-e7fef202d086")
        private SmDependency symetricDep;

        @objid ("4574fb1c-43a4-41e6-8fc7-97f0758537ad")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StereotypeData)data).mDefinedNoteType != null)? ((StereotypeData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
        }

        @objid ("e72a738a-9558-4123-ac0c-9bde5c3ce8a2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StereotypeData) data).mDefinedNoteType = values;
        }

        @objid ("2dd4dedc-4716-4286-b932-3488a9a63be9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NoteTypeSmClass)this.getTarget()).getOwnerStereotypeDep();
            }
            return this.symetricDep;
        }

    }

}
