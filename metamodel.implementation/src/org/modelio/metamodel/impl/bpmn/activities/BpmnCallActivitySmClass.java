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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
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

@objid ("47a2e0da-e146-4568-9ea0-eafa8cc8b0e8")
public class BpmnCallActivitySmClass extends BpmnActivitySmClass {
    @objid ("06650f55-0898-4092-a9b7-605180a7376c")
    private SmDependency calledGlobalTaskDep;

    @objid ("9831bac8-bd1e-4c03-ad95-28c3ddec0f83")
    private SmDependency calledProcessDep;

    @objid ("28be8f95-30f7-4f67-9fbb-a44754e328cf")
    private SmDependency calledOperationDep;

    @objid ("af9d5f9c-829e-40ac-8179-db925224a05f")
    private SmDependency calledBehaviorDep;

    @objid ("281bd092-5964-4ee9-b500-d27e6e238e3c")
    public BpmnCallActivitySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e6202c9d-4fb6-4065-87d3-c51bbface685")
    @Override
    public String getName() {
        return "BpmnCallActivity";
    }

    @objid ("e89c55fb-8d47-4c2f-ae4c-8e463006deb0")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("fcf6327c-6f89-4e70-9b02-82db114a88ff")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnCallActivity.class;
    }

    @objid ("6d6ff094-27c0-4482-a8d1-2040847a916f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("378f4ae1-6899-43f9-9935-db8372d2f097")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("208589ca-728b-4048-abce-af8fcb58b233")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnActivity");
        this.registerFactory(new BpmnCallActivityObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.calledGlobalTaskDep = new CalledGlobalTaskSmDependency();
        this.calledGlobalTaskDep.init("CalledGlobalTask", this, metamodel.getMClass("BpmnTask"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledGlobalTaskDep);
        
        this.calledProcessDep = new CalledProcessSmDependency();
        this.calledProcessDep.init("CalledProcess", this, metamodel.getMClass("BpmnProcess"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledProcessDep);
        
        this.calledOperationDep = new CalledOperationSmDependency();
        this.calledOperationDep.init("CalledOperation", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledOperationDep);
        
        this.calledBehaviorDep = new CalledBehaviorSmDependency();
        this.calledBehaviorDep.init("CalledBehavior", this, metamodel.getMClass("Behavior"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledBehaviorDep);
    }

    @objid ("5863f236-815c-43e3-87a5-24136b839bad")
    public SmDependency getCalledGlobalTaskDep() {
        if (this.calledGlobalTaskDep == null) {
        	this.calledGlobalTaskDep = this.getDependencyDef("CalledGlobalTask");
        }
        return this.calledGlobalTaskDep;
    }

    @objid ("7259df5a-ca05-4b8b-8b9c-2267e2a24f9c")
    public SmDependency getCalledProcessDep() {
        if (this.calledProcessDep == null) {
        	this.calledProcessDep = this.getDependencyDef("CalledProcess");
        }
        return this.calledProcessDep;
    }

    @objid ("d4e54613-fa77-4bf2-bf34-22a20376c6b5")
    public SmDependency getCalledOperationDep() {
        if (this.calledOperationDep == null) {
        	this.calledOperationDep = this.getDependencyDef("CalledOperation");
        }
        return this.calledOperationDep;
    }

    @objid ("66c82fc0-e042-4313-8afb-cf7be186891e")
    public SmDependency getCalledBehaviorDep() {
        if (this.calledBehaviorDep == null) {
        	this.calledBehaviorDep = this.getDependencyDef("CalledBehavior");
        }
        return this.calledBehaviorDep;
    }

    @objid ("5e4c39a9-0d0d-4879-93cd-936738cc0caf")
    private static class BpmnCallActivityObjectFactory implements ISmObjectFactory {
        @objid ("cb6b43ab-1677-4f48-9ec9-445815e33b22")
        private BpmnCallActivitySmClass smClass;

        @objid ("6ef3f2b9-99c7-4ecf-b412-8c20b693f199")
        public BpmnCallActivityObjectFactory(BpmnCallActivitySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("22b89f58-de08-4fb9-9864-84fe243d0121")
        @Override
        public ISmObjectData createData() {
            return new BpmnCallActivityData(this.smClass);
        }

        @objid ("7140c8a2-0ff7-426f-a5f1-7a28ae39961f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnCallActivityImpl();
        }

    }

    @objid ("e93e9d89-9c7f-47db-b1a0-1dc93931b758")
    public static class CalledGlobalTaskSmDependency extends SmSingleDependency {
        @objid ("c7cfe784-804e-4643-a49c-f791b2223d32")
        private SmDependency symetricDep;

        @objid ("6d6712a8-76af-4b61-8ec6-90879f65fb97")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCallActivityData) data).mCalledGlobalTask;
        }

        @objid ("15e86bf7-345a-4b05-beb2-fba30b4e0523")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCallActivityData) data).mCalledGlobalTask = value;
        }

        @objid ("4a5915b0-2356-4295-a484-8e5dd748b15e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnTaskSmClass)this.getTarget()).getCallerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5a8d1696-5db8-4643-a303-18ee12d697a5")
    public static class CalledProcessSmDependency extends SmSingleDependency {
        @objid ("b17f7faf-34f4-4e82-aff9-df66aa143682")
        private SmDependency symetricDep;

        @objid ("1cf5caa5-10fc-463b-990e-a5900668fdb9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCallActivityData) data).mCalledProcess;
        }

        @objid ("9df7cc4c-0798-44b9-a64f-ea17af0ae77b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCallActivityData) data).mCalledProcess = value;
        }

        @objid ("8da9e802-b6fc-4a54-b0cb-2719cc1a9936")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getCallerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("63a55cd0-1935-48b9-ab40-d80fb6a6f020")
    public static class CalledOperationSmDependency extends SmSingleDependency {
        @objid ("78842fcf-4167-47cc-a518-7012b6672de9")
        private SmDependency symetricDep;

        @objid ("5993e8ac-86f1-4425-ae6a-5160c924cc45")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCallActivityData) data).mCalledOperation;
        }

        @objid ("eb3120d4-f7a5-485e-8897-525fa52b5eb7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCallActivityData) data).mCalledOperation = value;
        }

        @objid ("3bc083d7-a70e-4be4-96ff-6075250fd3c9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCallerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7106a703-046d-4414-98ab-90659e88b0b4")
    public static class CalledBehaviorSmDependency extends SmSingleDependency {
        @objid ("223a7069-0ed4-4573-b090-cc8ef6e756e8")
        private SmDependency symetricDep;

        @objid ("88171ea5-9229-452a-b902-3f5925a68eec")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnCallActivityData) data).mCalledBehavior;
        }

        @objid ("3ab28605-953a-4b15-9e82-9dfa03e097da")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnCallActivityData) data).mCalledBehavior = value;
        }

        @objid ("116d65c0-c59d-4dab-b0a4-262214a1d5cd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getBpmnCallerDep();
            }
            return this.symetricDep;
        }

    }

}
