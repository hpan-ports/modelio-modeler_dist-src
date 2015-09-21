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
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureSmClass;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("8b52c6d8-b2a1-483b-9534-357edc70ea1e")
public class NaryAssociationEndSmClass extends StructuralFeatureSmClass {
    @objid ("abb7ba73-355c-446f-9966-89d539d36c1c")
    private SmDependency naryAssociationDep;

    @objid ("ccaadd33-f682-452d-b058-b050f2cf062e")
    private SmDependency ownerDep;

    @objid ("1965c6a6-6689-4195-b517-12360185261c")
    public NaryAssociationEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("8dd04845-6d06-4b21-9da6-061294ee9a04")
    @Override
    public String getName() {
        return "NaryAssociationEnd";
    }

    @objid ("eca255e7-d823-46a3-a3e8-da40302400a9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e50ffd50-29d2-4f9a-bfe2-c1224c27b593")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryAssociationEnd.class;
    }

    @objid ("26dc56b4-90b2-43f2-bc8e-8048c59ad16a")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ea39fca8-8cf9-4740-8f32-6eac56c4ed32")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8fbd40dd-bcb5-471b-bc6c-f3959eeae241")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuralFeature");
        this.registerFactory(new NaryAssociationEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.naryAssociationDep = new NaryAssociationSmDependency();
        this.naryAssociationDep.init("NaryAssociation", this, metamodel.getMClass("NaryAssociation"), 1, 1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.naryAssociationDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Classifier"), 1, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("56fa708f-b37e-456d-9133-51f24cfb960f")
    public SmDependency getNaryAssociationDep() {
        if (this.naryAssociationDep == null) {
        	this.naryAssociationDep = this.getDependencyDef("NaryAssociation");
        }
        return this.naryAssociationDep;
    }

    @objid ("43503a79-e73f-4838-9c9d-f6c493ec6557")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("b9c51375-d240-432d-8d05-6cab94cac756")
    private static class NaryAssociationEndObjectFactory implements ISmObjectFactory {
        @objid ("fd821ece-6781-440b-8082-7a1199738cc5")
        private NaryAssociationEndSmClass smClass;

        @objid ("11486483-3d4f-42ec-844e-072a8ace5d6e")
        public NaryAssociationEndObjectFactory(NaryAssociationEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4670fd07-3c1e-445b-b622-b9f637672fee")
        @Override
        public ISmObjectData createData() {
            return new NaryAssociationEndData(this.smClass);
        }

        @objid ("d2089f40-ad24-4253-91b9-605538d434ce")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryAssociationEndImpl();
        }

    }

    @objid ("7825b9f5-dcc5-4fc7-ac4a-709c7e9d6b09")
    public static class NaryAssociationSmDependency extends SmSingleDependency {
        @objid ("120dd5b4-a3ae-4c00-a1fa-79713111ff5c")
        private SmDependency symetricDep;

        @objid ("0b61e7c3-529b-49fe-8d34-8880fa7e81e6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryAssociationEndData) data).mNaryAssociation;
        }

        @objid ("a5b29fe5-11d6-4a40-a6e3-a9f23ffe44f9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryAssociationEndData) data).mNaryAssociation = value;
        }

        @objid ("bbcc5ba2-9360-43d1-b565-646c2c540200")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryAssociationSmClass)this.getTarget()).getNaryEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("22f7f65d-f133-455b-9193-2408e234df68")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("585b5828-66fa-4d1c-8183-11b560291765")
        private SmDependency symetricDep;

        @objid ("3ce0e68d-5b8e-4001-91c7-e7ef18844a1e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryAssociationEndData) data).mOwner;
        }

        @objid ("174b08c1-e443-4663-ac76-46652c498869")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryAssociationEndData) data).mOwner = value;
        }

        @objid ("76274e40-c76c-4d39-8618-4290bcb67b77")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getOwnedNaryEndDep();
            }
            return this.symetricDep;
        }

    }

}
