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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ClassAssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.statik.Class;
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

@objid ("06b8d248-fc77-499d-a7d8-11fed357827c")
public class ClassSmClass extends GeneralClassSmClass {
    @objid ("55c95cd1-b962-4266-8cb6-85f366f11660")
    private SmAttribute isActiveAtt;

    @objid ("fb90c45a-9d21-42d8-8ba4-5c78c0519150")
    private SmAttribute isMainAtt;

    @objid ("eede4dd8-1761-44ac-aa69-67b799a3f0fd")
    private SmDependency linkToAssociationDep;

    @objid ("9800473d-f701-4697-b5ff-4ed8343922f0")
    public ClassSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("db6fc39d-59aa-423c-a95a-5813ecaa5248")
    @Override
    public String getName() {
        return "Class";
    }

    @objid ("179b192f-d388-4033-9f93-c0a52f9af726")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("864e7299-34ae-495c-bfc6-94fa08732a26")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Class.class;
    }

    @objid ("54d0d0b2-ea00-4605-baf4-a62a76df0f19")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("d56dd72a-94e6-4b68-bc1c-dfc73812bee8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("08c1cb24-f650-489e-aa5e-ae31a89fb3e8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new ClassObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isActiveAtt = new IsActiveSmAttribute();
        this.isActiveAtt.init("IsActive", this, Boolean.class );
        registerAttribute(this.isActiveAtt);
        
        this.isMainAtt = new IsMainSmAttribute();
        this.isMainAtt.init("IsMain", this, Boolean.class );
        registerAttribute(this.isMainAtt);
        
        
        // Initialize and register the SmDependency
        this.linkToAssociationDep = new LinkToAssociationSmDependency();
        this.linkToAssociationDep.init("LinkToAssociation", this, metamodel.getMClass("ClassAssociation"), 0, 1 , SmDirective.SMCDTODELETE);
        registerDependency(this.linkToAssociationDep);
    }

    @objid ("2fe6af6d-8131-4b6d-93f2-60fabbc50c93")
    public SmAttribute getIsActiveAtt() {
        if (this.isActiveAtt == null) {
        	this.isActiveAtt = this.getAttributeDef("IsActive");
        }
        return this.isActiveAtt;
    }

    @objid ("74206614-a0aa-49b9-a488-07f9781c93d1")
    public SmAttribute getIsMainAtt() {
        if (this.isMainAtt == null) {
        	this.isMainAtt = this.getAttributeDef("IsMain");
        }
        return this.isMainAtt;
    }

    @objid ("cf4015bb-0241-488d-8f29-212ad7720afb")
    public SmDependency getLinkToAssociationDep() {
        if (this.linkToAssociationDep == null) {
        	this.linkToAssociationDep = this.getDependencyDef("LinkToAssociation");
        }
        return this.linkToAssociationDep;
    }

    @objid ("6aaee5ac-9d4c-4351-8581-cb4283116e37")
    private static class ClassObjectFactory implements ISmObjectFactory {
        @objid ("69809602-9e0f-49e4-842a-ce4ce53004f9")
        private ClassSmClass smClass;

        @objid ("51b08369-e99a-4b2b-a8aa-e191328efe20")
        public ClassObjectFactory(ClassSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("63845960-5417-408f-adf5-f43e977a878c")
        @Override
        public ISmObjectData createData() {
            return new ClassData(this.smClass);
        }

        @objid ("1514bc1f-a005-47ce-aa25-f4f3d3ff0abe")
        @Override
        public SmObjectImpl createImpl() {
            return new ClassImpl();
        }

    }

    @objid ("0426df4d-3554-4172-8784-8799e08aaa31")
    public static class IsActiveSmAttribute extends SmAttribute {
        @objid ("9df991d0-5e4f-455a-8aa1-3c28311e66f8")
        public Object getValue(ISmObjectData data) {
            return ((ClassData) data).mIsActive;
        }

        @objid ("2a3696fd-0ecf-429b-be42-faa542f24d29")
        public void setValue(ISmObjectData data, Object value) {
            ((ClassData) data).mIsActive = value;
        }

    }

    @objid ("6f3bf364-d6de-4d51-b520-55a83ccdf60d")
    public static class IsMainSmAttribute extends SmAttribute {
        @objid ("90d2ce87-3b03-413c-bb3b-2a80bee6e7f9")
        public Object getValue(ISmObjectData data) {
            return ((ClassData) data).mIsMain;
        }

        @objid ("c68bf419-c217-4654-a242-8d16ae182ec8")
        public void setValue(ISmObjectData data, Object value) {
            ((ClassData) data).mIsMain = value;
        }

    }

    @objid ("aade1312-8c47-4fd7-ba1e-09fa2ac1a200")
    public static class LinkToAssociationSmDependency extends SmSingleDependency {
        @objid ("857976ca-9bde-4e77-b679-534c9b8ca7a0")
        private SmDependency symetricDep;

        @objid ("62129e05-db8e-42ea-b93a-13c4ddfa1bd8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ClassData) data).mLinkToAssociation;
        }

        @objid ("b94dfe0b-2762-4b6c-8e5d-558b018662dd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ClassData) data).mLinkToAssociation = value;
        }

        @objid ("bf08b398-dd35-4c59-9f15-9655e0ffe212")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassAssociationSmClass)this.getTarget()).getClassPartDep();
            }
            return this.symetricDep;
        }

    }

}
