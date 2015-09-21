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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
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

@objid ("f00c3564-2a53-4a36-aee2-6bf19fcf1f74")
public class BpmnLaneSmClass extends BpmnBaseElementSmClass {
    @objid ("ed22a27c-71f0-4e31-a270-986517774982")
    private SmDependency childLaneSetDep;

    @objid ("bc5eac72-5d96-4174-a2ef-55f5f2742677")
    private SmDependency partitionElementDep;

    @objid ("9d9c1250-2608-48de-bc8d-ef491932cd03")
    private SmDependency flowElementRefDep;

    @objid ("57c89c37-40dc-4836-a372-3313052d2f28")
    private SmDependency laneSetDep;

    @objid ("b652b83c-df9d-4cc7-a755-6ea1850aedf0")
    public BpmnLaneSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a9f58bd9-3c16-4166-886c-ddef3d6f12b9")
    @Override
    public String getName() {
        return "BpmnLane";
    }

    @objid ("ce6a05e5-330f-4152-a48f-c6ad9aa6a2bc")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("31b92190-d8c6-4d6c-81a4-9c19c5a46816")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnLane.class;
    }

    @objid ("a2e707a3-84ff-4332-be3b-252b2fc52441")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9b7abb78-f9c9-4eda-8739-cd08cb37a93c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9291d082-e6f3-481e-84d2-2a97a5623b8a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnLaneObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.childLaneSetDep = new ChildLaneSetSmDependency();
        this.childLaneSetDep.init("ChildLaneSet", this, metamodel.getMClass("BpmnLaneSet"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.childLaneSetDep);
        
        this.partitionElementDep = new PartitionElementSmDependency();
        this.partitionElementDep.init("PartitionElement", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.partitionElementDep);
        
        this.flowElementRefDep = new FlowElementRefSmDependency();
        this.flowElementRefDep.init("FlowElementRef", this, metamodel.getMClass("BpmnFlowElement"), 0, -1 , SmDirective.SMCDPARTOF, SmDirective.SMCDTODELETE);
        registerDependency(this.flowElementRefDep);
        
        this.laneSetDep = new LaneSetSmDependency();
        this.laneSetDep.init("LaneSet", this, metamodel.getMClass("BpmnLaneSet"), 1, 1 );
        registerDependency(this.laneSetDep);
    }

    @objid ("fa82a1b6-b0cc-4763-a1f1-6c24866bceee")
    public SmDependency getChildLaneSetDep() {
        if (this.childLaneSetDep == null) {
        	this.childLaneSetDep = this.getDependencyDef("ChildLaneSet");
        }
        return this.childLaneSetDep;
    }

    @objid ("131eed16-e6c5-41c3-b965-f67f7d2c88f1")
    public SmDependency getPartitionElementDep() {
        if (this.partitionElementDep == null) {
        	this.partitionElementDep = this.getDependencyDef("PartitionElement");
        }
        return this.partitionElementDep;
    }

    @objid ("d2773396-741a-4483-8116-ed05743d2342")
    public SmDependency getFlowElementRefDep() {
        if (this.flowElementRefDep == null) {
        	this.flowElementRefDep = this.getDependencyDef("FlowElementRef");
        }
        return this.flowElementRefDep;
    }

    @objid ("7df0a105-ba08-47a5-97dc-3d95c7831ba5")
    public SmDependency getLaneSetDep() {
        if (this.laneSetDep == null) {
        	this.laneSetDep = this.getDependencyDef("LaneSet");
        }
        return this.laneSetDep;
    }

    @objid ("370c4316-0839-49d6-9eb4-1f1225f7af24")
    private static class BpmnLaneObjectFactory implements ISmObjectFactory {
        @objid ("e9919162-6615-4e0d-ba70-cd3308ba1d17")
        private BpmnLaneSmClass smClass;

        @objid ("f940d8fb-0d56-4b92-8725-a650fcf1a5b9")
        public BpmnLaneObjectFactory(BpmnLaneSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("36d1ce6b-d816-4641-9284-ce663828cd0b")
        @Override
        public ISmObjectData createData() {
            return new BpmnLaneData(this.smClass);
        }

        @objid ("e0d19f1d-4e42-46b1-81f8-d03b441d3110")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnLaneImpl();
        }

    }

    @objid ("597f9a5e-9818-4a16-be58-35aaa5e7735b")
    public static class ChildLaneSetSmDependency extends SmSingleDependency {
        @objid ("e28e0cc2-e7a7-4c26-9c9c-f5e74a2aae74")
        private SmDependency symetricDep;

        @objid ("d2a3e4d6-a15f-463d-8e24-b0a214492d54")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneData) data).mChildLaneSet;
        }

        @objid ("38f5a556-16f0-448f-86af-a9b8f1f0aa41")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneData) data).mChildLaneSet = value;
        }

        @objid ("8f798cee-099a-4983-8e59-6c190f807d93")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSetSmClass)this.getTarget()).getParentLaneDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("62852851-9ad4-414c-835a-07315abf20a4")
    public static class PartitionElementSmDependency extends SmSingleDependency {
        @objid ("b7a98710-8406-4296-9446-babcc28c2f45")
        private SmDependency symetricDep;

        @objid ("3a925f38-37f9-482d-bb96-04185a607114")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneData) data).mPartitionElement;
        }

        @objid ("2800f9b3-a5d7-4d7a-8b10-3bb3d7e599af")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneData) data).mPartitionElement = value;
        }

        @objid ("4522f139-41e9-4658-8e24-691f8e0d7661")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getBpmnLaneRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f5009e35-fccb-46d5-8e52-78753e5df778")
    public static class FlowElementRefSmDependency extends SmMultipleDependency {
        @objid ("f7a8bbfb-21e4-4457-9db0-f0a8ce04e564")
        private SmDependency symetricDep;

        @objid ("9bf57601-5cab-4f48-a967-0746a76ca595")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnLaneData)data).mFlowElementRef != null)? ((BpmnLaneData)data).mFlowElementRef:SmMultipleDependency.EMPTY;
        }

        @objid ("0ed29b6b-81cd-4f3c-86e0-f667ddeb7081")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnLaneData) data).mFlowElementRef = values;
        }

        @objid ("8828b424-6758-4995-9278-2647d4ed2aa9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowElementSmClass)this.getTarget()).getLaneDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7b065451-093f-449a-8de5-c7e3be89b53d")
    public static class LaneSetSmDependency extends SmSingleDependency {
        @objid ("3d08e9d4-101a-4c85-aea0-b7b22f78fcde")
        private SmDependency symetricDep;

        @objid ("b8112593-5566-4ac6-b114-afad61e6cf5b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLaneData) data).mLaneSet;
        }

        @objid ("2ce23dd3-d4e1-4404-8e00-fda8a8c2c0b7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLaneData) data).mLaneSet = value;
        }

        @objid ("063f7650-d361-454c-b10e-904aced1abe4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSetSmClass)this.getTarget()).getLaneDep();
            }
            return this.symetricDep;
        }

    }

}
