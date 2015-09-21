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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("bb3e2389-913f-45ac-a54e-c1807ef28bc2")
public class BpmnLaneSetSmClass extends BpmnBaseElementSmClass {
    @objid ("a1e873cf-ae2f-498e-9991-a7b81a7a2fa6")
    private SmDependency laneDep;

    @objid ("b15e7f4c-ba30-4088-86c2-b0bfbcdb29ee")
    private SmDependency processDep;

    @objid ("21c89f62-4625-4ff0-945a-71c55ae84975")
    private SmDependency parentLaneDep;

    @objid ("466aca87-6661-4ade-ba0b-0b2932689de4")
    private SmDependency subProcessDep;

    @objid ("3e3f4371-e9bc-4faa-aa94-1422bdedaa19")
    public BpmnLaneSetSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ac809384-3d9a-49ee-8b5b-511a0ae33d32")
    @Override
    public String getName() {
        return "BpmnLaneSet";
    }

    @objid ("49afb077-0b73-45a6-b93d-ce714b4bdbde")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3e96fe37-5343-4a59-99db-84b619967c57")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnLaneSet.class;
    }

    @objid ("2bd4d29b-ebd1-42cd-9093-1e7fd0bc5a58")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7c4a33ae-35b9-4072-91ba-463f5f59c63a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("450899a5-fc47-41da-8933-40598b11c90f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnLaneSetObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.laneDep = new LaneSmDependency();
        this.laneDep.init("Lane", this, metamodel.getMClass("BpmnLane"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.laneDep);
        
        this.processDep = new ProcessSmDependency();
        this.processDep.init("Process", this, metamodel.getMClass("BpmnProcess"), 0, 1 );
        registerDependency(this.processDep);
        
        this.parentLaneDep = new ParentLaneSmDependency();
        this.parentLaneDep.init("ParentLane", this, metamodel.getMClass("BpmnLane"), 0, 1 );
        registerDependency(this.parentLaneDep);
        
        this.subProcessDep = new SubProcessSmDependency();
        this.subProcessDep.init("SubProcess", this, metamodel.getMClass("BpmnSubProcess"), 0, 1 );
        registerDependency(this.subProcessDep);
    }

    @objid ("4da0be14-5a6d-476e-bf10-1d96fdc13c17")
    public SmDependency getLaneDep() {
        if (this.laneDep == null) {
        	this.laneDep = this.getDependencyDef("Lane");
        }
        return this.laneDep;
    }

    @objid ("e980dca6-ad3e-4933-a350-9e5775222cc4")
    public SmDependency getProcessDep() {
        if (this.processDep == null) {
        	this.processDep = this.getDependencyDef("Process");
        }
        return this.processDep;
    }

    @objid ("fd63e8b5-9ea8-45da-accf-76b3a022159c")
    public SmDependency getParentLaneDep() {
        if (this.parentLaneDep == null) {
        	this.parentLaneDep = this.getDependencyDef("ParentLane");
        }
        return this.parentLaneDep;
    }

    @objid ("07cc077a-d4a3-415e-9b4d-e974ce52f623")
    public SmDependency getSubProcessDep() {
        if (this.subProcessDep == null) {
        	this.subProcessDep = this.getDependencyDef("SubProcess");
        }
        return this.subProcessDep;
    }

    @objid ("17cb3f05-0a6b-4424-954a-2284d81d32ac")
    private static class BpmnLaneSetObjectFactory implements ISmObjectFactory {
        @objid ("6532f69a-7e8c-4136-b76f-ed2ecb13f118")
        private BpmnLaneSetSmClass smClass;

        @objid ("74d3593d-eef5-4a86-af10-1c514eafe833")
        public BpmnLaneSetObjectFactory(BpmnLaneSetSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("af88404f-cba5-4f26-aed6-4c46a7502023")
        @Override
        public ISmObjectData createData() {
            return new BpmnLaneSetData(this.smClass);
        }

        @objid ("ade388df-3d77-4f4c-bfeb-ae536348b0cc")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnLaneSetImpl();
        }

    }

    @objid ("d7e6d110-0ac0-4c50-a197-a6938dc1b5e7")
    public static class LaneSmDependency extends SmMultipleDependency {
        @objid ("37211d19-0527-49ca-a112-e078fdf7ba86")
        private SmDependency symetricDep;

        @objid ("a2d41d36-8826-4d3a-96b6-16315831f382")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnLaneSetData)data).mLane != null)? ((BpmnLaneSetData)data).mLane:SmMultipleDependency.EMPTY;
        }

        @objid ("80f12412-fdc9-41f9-997c-51c936302fe2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnLaneSetData) data).mLane = values;
        }

        @objid ("28b6ca30-8ce6-425f-9aa6-66ac47ef3b5d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSmClass)this.getTarget()).getLaneSetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d7358852-1943-4d4f-9118-0a3fcea6479b")
    public static class ProcessSmDependency extends SmSingleDependency {
        @objid ("a2466da8-5b39-4543-a034-4b115c941271")
        private SmDependency symetricDep;

        @objid ("e67e9ac7-2108-4d48-a3af-866b19448526")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneSetData) data).mProcess;
        }

        @objid ("75d76241-7062-45b7-a0eb-c6a8c49ae764")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneSetData) data).mProcess = value;
        }

        @objid ("72304813-d7e6-4d17-872a-2a0c5bd569a5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getLaneSetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("456cfcf1-97c6-4c26-82fb-370716e0324b")
    public static class ParentLaneSmDependency extends SmSingleDependency {
        @objid ("4cbf3e28-1497-4316-803d-707bf97c4fa9")
        private SmDependency symetricDep;

        @objid ("9d275a3d-de98-4706-b888-905a65490716")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneSetData) data).mParentLane;
        }

        @objid ("3c970cb2-d4ce-4c88-ac87-f5e684f4dd9f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneSetData) data).mParentLane = value;
        }

        @objid ("c8b72444-f82a-4e63-a2fa-aab41088d8f7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSmClass)this.getTarget()).getChildLaneSetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d3d3dfb4-f49d-4a72-80f1-0202c467bca7")
    public static class SubProcessSmDependency extends SmSingleDependency {
        @objid ("edce736b-7a55-4498-8e8b-a579abb58af8")
        private SmDependency symetricDep;

        @objid ("dcdefe23-d573-41c9-b9b0-803e04d9c4ee")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneSetData) data).mSubProcess;
        }

        @objid ("4feb9cbf-3426-40ae-9f82-1d20f8a6029d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneSetData) data).mSubProcess = value;
        }

        @objid ("2a7505c2-91a2-4425-9c52-d943a228f5a6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSubProcessSmClass)this.getTarget()).getLaneSetDep();
            }
            return this.symetricDep;
        }

    }

}
