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
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
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

@objid ("c431f62a-cc67-4a1e-b558-d0d2481187a3")
public class MetaclassReferenceSmClass extends ElementSmClass {
    @objid ("284a959b-566f-4859-a48a-79771302dee3")
    private SmAttribute referencedClassNameAtt;

    @objid ("24473aba-14d0-4cc8-b274-344e24cbbc3a")
    private SmDependency definedTableDep;

    @objid ("728a5f0e-e251-44b7-803a-994d99316ecf")
    private SmDependency definedNoteTypeDep;

    @objid ("c4f9cdb9-fee4-45b1-9a61-ac785ade1c5e")
    private SmDependency definedExternDocumentTypeDep;

    @objid ("0ebaa3c8-e0b0-4270-9fb8-34fc34bd216f")
    private SmDependency ownerProfileDep;

    @objid ("4f7350e3-01d7-429a-af99-0068c7a90195")
    private SmDependency definedTagTypeDep;

    @objid ("31a194c4-5158-4ae6-ad86-c680ed1a8495")
    public MetaclassReferenceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("31f07eef-7895-4b30-9186-c6bbe63f00d9")
    @Override
    public String getName() {
        return "MetaclassReference";
    }

    @objid ("bea104e3-29dc-4dc4-837b-93bf27fedcce")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("9ba993f4-54e1-4ac6-9af0-cb6540feec6e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return MetaclassReference.class;
    }

    @objid ("3d4edc8d-9e02-4973-8a35-28f11b317d19")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("9c332b47-97eb-4886-a090-b75310749e38")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("08b64dcd-62c1-4f3c-90f5-5887670092fd")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new MetaclassReferenceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.referencedClassNameAtt = new ReferencedClassNameSmAttribute();
        this.referencedClassNameAtt.init("ReferencedClassName", this, String.class );
        registerAttribute(this.referencedClassNameAtt);
        
        
        // Initialize and register the SmDependency
        this.definedTableDep = new DefinedTableSmDependency();
        this.definedTableDep.init("DefinedTable", this, metamodel.getMClass("PropertyTableDefinition"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTableDep);
        
        this.definedNoteTypeDep = new DefinedNoteTypeSmDependency();
        this.definedNoteTypeDep.init("DefinedNoteType", this, metamodel.getMClass("NoteType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedNoteTypeDep);
        
        this.definedExternDocumentTypeDep = new DefinedExternDocumentTypeSmDependency();
        this.definedExternDocumentTypeDep.init("DefinedExternDocumentType", this, metamodel.getMClass("ExternDocumentType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedExternDocumentTypeDep);
        
        this.ownerProfileDep = new OwnerProfileSmDependency();
        this.ownerProfileDep.init("OwnerProfile", this, metamodel.getMClass("Profile"), 0, 1 );
        registerDependency(this.ownerProfileDep);
        
        this.definedTagTypeDep = new DefinedTagTypeSmDependency();
        this.definedTagTypeDep.init("DefinedTagType", this, metamodel.getMClass("TagType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedTagTypeDep);
    }

    @objid ("03a39832-27cc-4ac4-9501-397e30ef3520")
    public SmAttribute getReferencedClassNameAtt() {
        if (this.referencedClassNameAtt == null) {
        	this.referencedClassNameAtt = this.getAttributeDef("ReferencedClassName");
        }
        return this.referencedClassNameAtt;
    }

    @objid ("6611597c-8003-4f4c-834f-6f6a4f4ccb91")
    public SmDependency getDefinedTableDep() {
        if (this.definedTableDep == null) {
        	this.definedTableDep = this.getDependencyDef("DefinedTable");
        }
        return this.definedTableDep;
    }

    @objid ("93e61daf-165a-454b-b7d2-64d7f5037b95")
    public SmDependency getDefinedNoteTypeDep() {
        if (this.definedNoteTypeDep == null) {
        	this.definedNoteTypeDep = this.getDependencyDef("DefinedNoteType");
        }
        return this.definedNoteTypeDep;
    }

    @objid ("d79b4589-fe9f-4e54-a694-991d6b93eb3f")
    public SmDependency getDefinedExternDocumentTypeDep() {
        if (this.definedExternDocumentTypeDep == null) {
        	this.definedExternDocumentTypeDep = this.getDependencyDef("DefinedExternDocumentType");
        }
        return this.definedExternDocumentTypeDep;
    }

    @objid ("275fbbed-ece2-4988-917d-8ed110e1bc6e")
    public SmDependency getOwnerProfileDep() {
        if (this.ownerProfileDep == null) {
        	this.ownerProfileDep = this.getDependencyDef("OwnerProfile");
        }
        return this.ownerProfileDep;
    }

    @objid ("45a843c3-a8d7-46d5-bbf3-7b70ee5ee746")
    public SmDependency getDefinedTagTypeDep() {
        if (this.definedTagTypeDep == null) {
        	this.definedTagTypeDep = this.getDependencyDef("DefinedTagType");
        }
        return this.definedTagTypeDep;
    }

    @objid ("23695418-718e-4471-90b6-93d15c981b88")
    private static class MetaclassReferenceObjectFactory implements ISmObjectFactory {
        @objid ("53fd9239-654e-4ab3-8fac-2d8ef263b31b")
        private MetaclassReferenceSmClass smClass;

        @objid ("0c90a93c-f125-4fcf-a7c8-c8d870f1a932")
        public MetaclassReferenceObjectFactory(MetaclassReferenceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b9bf1e8c-a409-4643-aaa1-2165ac5314d8")
        @Override
        public ISmObjectData createData() {
            return new MetaclassReferenceData(this.smClass);
        }

        @objid ("451b068a-71be-439e-a2a5-541be050a1a3")
        @Override
        public SmObjectImpl createImpl() {
            return new MetaclassReferenceImpl();
        }

    }

    @objid ("3763ac06-dcbc-445d-a1e2-f4e12e09dca8")
    public static class ReferencedClassNameSmAttribute extends SmAttribute {
        @objid ("d5e6e7cc-cde4-43ed-b1ed-f0772780d403")
        public Object getValue(ISmObjectData data) {
            return ((MetaclassReferenceData) data).mReferencedClassName;
        }

        @objid ("f410f445-2bc4-45e4-afda-d892de514689")
        public void setValue(ISmObjectData data, Object value) {
            ((MetaclassReferenceData) data).mReferencedClassName = value;
        }

    }

    @objid ("79b6b864-c4d1-44a2-84ed-0a444daa73c3")
    public static class DefinedTableSmDependency extends SmSingleDependency {
        @objid ("53f02f15-6296-414a-bf3d-f6da1d0a01ad")
        private SmDependency symetricDep;

        @objid ("219dd4c0-b892-4a59-99c1-c4b354f6a70b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MetaclassReferenceData) data).mDefinedTable;
        }

        @objid ("db55d80a-f04e-44ca-80be-b62a0e06c7a4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MetaclassReferenceData) data).mDefinedTable = value;
        }

        @objid ("3fbe9abe-d712-48f5-a09a-89aaa9215d3a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableDefinitionSmClass)this.getTarget()).getOwnerReferenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8690b043-65b3-4259-9fb1-75868e633f5d")
    public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
        @objid ("70473a9e-082e-479d-bde8-bdb24225473c")
        private SmDependency symetricDep;

        @objid ("d1984f94-a04f-40c0-b3d3-6ce059c3ed80")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((MetaclassReferenceData)data).mDefinedNoteType != null)? ((MetaclassReferenceData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
        }

        @objid ("a70aab9d-df6d-4eba-8725-4278175b0b28")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((MetaclassReferenceData) data).mDefinedNoteType = values;
        }

        @objid ("e60f9b4e-f66a-439c-bfcd-ac810b91457e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NoteTypeSmClass)this.getTarget()).getOwnerReferenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("98fea913-7308-4bde-9eb3-8f1ee49e9274")
    public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
        @objid ("771af012-1746-4200-ad28-3011574a4220")
        private SmDependency symetricDep;

        @objid ("3f03db00-f89b-42b4-a5b8-8143d365cfb6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((MetaclassReferenceData)data).mDefinedExternDocumentType != null)? ((MetaclassReferenceData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
        }

        @objid ("1be9d98e-3dac-41b6-9587-66802a236906")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((MetaclassReferenceData) data).mDefinedExternDocumentType = values;
        }

        @objid ("f4d18bb3-01cf-41f3-a3fd-206401b1a6f8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternDocumentTypeSmClass)this.getTarget()).getOwnerReferenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e3e6e57-923a-48a7-82c0-75ed599fbb26")
    public static class OwnerProfileSmDependency extends SmSingleDependency {
        @objid ("decdb37b-c152-4d5b-9b95-7b86779af7a8")
        private SmDependency symetricDep;

        @objid ("69dddd66-3566-4e8a-a032-8c1d20df6c48")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MetaclassReferenceData) data).mOwnerProfile;
        }

        @objid ("06ae2f2a-0e66-4c5d-9059-1e409d24a6e0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MetaclassReferenceData) data).mOwnerProfile = value;
        }

        @objid ("d5022556-fbcb-4d09-aea5-17bd9cd01368")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProfileSmClass)this.getTarget()).getOwnedReferenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1b0741de-0908-468d-808d-bf4981081146")
    public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
        @objid ("53ac8b42-e1ec-4259-bd1a-59077246d3fd")
        private SmDependency symetricDep;

        @objid ("5e6aa0a4-81ac-4d37-a21c-be8ff32debf7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((MetaclassReferenceData)data).mDefinedTagType != null)? ((MetaclassReferenceData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
        }

        @objid ("1e620f34-5672-4f42-a027-c21bb5adf4ea")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((MetaclassReferenceData) data).mDefinedTagType = values;
        }

        @objid ("8c42355f-552e-41c2-bf98-93ee2ba31c6f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TagTypeSmClass)this.getTarget()).getOwnerReferenceDep();
            }
            return this.symetricDep;
        }

    }

}
