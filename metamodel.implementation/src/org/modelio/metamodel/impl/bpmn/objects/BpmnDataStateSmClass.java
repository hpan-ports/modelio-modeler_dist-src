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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
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

@objid ("1d15032f-577b-4daa-8a38-531f0d847d64")
public class BpmnDataStateSmClass extends BpmnBaseElementSmClass {
    @objid ("3fe939ae-8a78-47ca-adb7-dd55c945b97e")
    private SmDependency itemDep;

    @objid ("babf9b57-a61b-4d48-9d61-f57fa5361335")
    private SmDependency umlStateDep;

    @objid ("c11c88e6-8616-4206-a24e-e3c8fdc262ea")
    public BpmnDataStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9f913bdd-0778-4c7f-affd-f1ab556abd3c")
    @Override
    public String getName() {
        return "BpmnDataState";
    }

    @objid ("bdbd1da1-64f2-401f-ad83-a4bbd85205ea")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("41075139-5f1c-48ce-b6fe-60b7fad281f7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataState.class;
    }

    @objid ("884968a1-c961-423a-80e7-7cdb55aeec06")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b6032fb8-d0c5-4b95-aa89-575e8ea7cf33")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("eb459ab9-c9c5-4280-9f39-82dd80fd1541")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnDataStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.itemDep = new ItemSmDependency();
        this.itemDep.init("Item", this, metamodel.getMClass("BpmnItemAwareElement"), 1, 1 );
        registerDependency(this.itemDep);
        
        this.umlStateDep = new UmlStateSmDependency();
        this.umlStateDep.init("UmlState", this, metamodel.getMClass("State"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.umlStateDep);
    }

    @objid ("ddd4f7e1-1419-4b8d-9a88-950bee53a1c0")
    public SmDependency getItemDep() {
        if (this.itemDep == null) {
        	this.itemDep = this.getDependencyDef("Item");
        }
        return this.itemDep;
    }

    @objid ("6a8a623e-b17a-4d90-a87f-964d4a1d941b")
    public SmDependency getUmlStateDep() {
        if (this.umlStateDep == null) {
        	this.umlStateDep = this.getDependencyDef("UmlState");
        }
        return this.umlStateDep;
    }

    @objid ("60abf473-ac8e-412d-ba87-56cacca32a0b")
    private static class BpmnDataStateObjectFactory implements ISmObjectFactory {
        @objid ("26251b59-0d30-4a3d-a01f-e3ce65b992ba")
        private BpmnDataStateSmClass smClass;

        @objid ("6bc6a8eb-c9ff-4cf5-9aac-92b683a1924b")
        public BpmnDataStateObjectFactory(BpmnDataStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d641a46a-e1d3-42ba-872d-cbe229142773")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataStateData(this.smClass);
        }

        @objid ("c6094ebe-5b18-44c6-b5b6-6ed91da47afe")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataStateImpl();
        }

    }

    @objid ("3542d280-4f82-4158-80db-96e5ca6bdeeb")
    public static class ItemSmDependency extends SmSingleDependency {
        @objid ("f7ab6030-b454-4890-a958-37e6dbaf3ad3")
        private SmDependency symetricDep;

        @objid ("d75a40d0-a294-4a01-9002-486f66d7d0ac")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataStateData) data).mItem;
        }

        @objid ("8a176510-feae-440a-b332-412c90cf70fd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataStateData) data).mItem = value;
        }

        @objid ("a1be801b-fa8a-4f7c-aa05-7b69a37a54a8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getDataStateDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5ef46357-99b3-4d94-a5c8-e2be44e5fdb1")
    public static class UmlStateSmDependency extends SmSingleDependency {
        @objid ("de397483-250e-42da-b0b5-7e307e3baf05")
        private SmDependency symetricDep;

        @objid ("1ebc68d1-32d0-4186-8107-13d47b865db5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataStateData) data).mUmlState;
        }

        @objid ("17da65d0-e4d3-47e0-977b-8ea5d24e56ff")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataStateData) data).mUmlState = value;
        }

        @objid ("2f02eac7-5340-413d-a95d-640a42d24dd3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getBpmnDataStateRefsDep();
            }
            return this.symetricDep;
        }

    }

}
