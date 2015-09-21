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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("ca96dca3-70f3-4113-bfa9-e4768ccb42e1")
public class BpmnSubProcessSmClass extends BpmnActivitySmClass {
    @objid ("3cb5ec77-e5f3-442c-a3e9-07b6e53fdf13")
    private SmAttribute triggeredByEventAtt;

    @objid ("c7d408a5-4497-45aa-b4b0-ca29296f7bd9")
    private SmDependency artifactDep;

    @objid ("991d82ca-8dfa-4534-ad5c-def3a273492c")
    private SmDependency flowElementDep;

    @objid ("8d208de8-6c5d-402c-9941-100281bf3001")
    private SmDependency laneSetDep;

    @objid ("d6b8fbd5-dce8-4690-bda5-3d862336c783")
    public BpmnSubProcessSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("caab2982-c5b2-4ecc-b814-ae4ea78611e9")
    @Override
    public String getName() {
        return "BpmnSubProcess";
    }

    @objid ("10a37955-c779-4940-bd72-53cdbde545e1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6e9381d2-7455-412d-b96f-2955d0ba5c69")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSubProcess.class;
    }

    @objid ("2ca5be2e-78f3-411d-acf7-8b68599edece")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b2db600f-d229-4620-85d7-d6d10f68dc41")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5767c25c-13aa-44a0-a02d-29f6dafceb03")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnActivity");
        this.registerFactory(new BpmnSubProcessObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.triggeredByEventAtt = new TriggeredByEventSmAttribute();
        this.triggeredByEventAtt.init("TriggeredByEvent", this, Boolean.class );
        registerAttribute(this.triggeredByEventAtt);
        
        
        // Initialize and register the SmDependency
        this.artifactDep = new ArtifactSmDependency();
        this.artifactDep.init("Artifact", this, metamodel.getMClass("BpmnArtifact"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.artifactDep);
        
        this.flowElementDep = new FlowElementSmDependency();
        this.flowElementDep.init("FlowElement", this, metamodel.getMClass("BpmnFlowElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.flowElementDep);
        
        this.laneSetDep = new LaneSetSmDependency();
        this.laneSetDep.init("LaneSet", this, metamodel.getMClass("BpmnLaneSet"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.laneSetDep);
    }

    @objid ("0c35d51d-074c-435a-bb6b-7899c9385b0f")
    public SmAttribute getTriggeredByEventAtt() {
        if (this.triggeredByEventAtt == null) {
        	this.triggeredByEventAtt = this.getAttributeDef("TriggeredByEvent");
        }
        return this.triggeredByEventAtt;
    }

    @objid ("32ba8af2-23a4-4ff8-a7b3-ee9b21a36861")
    public SmDependency getArtifactDep() {
        if (this.artifactDep == null) {
        	this.artifactDep = this.getDependencyDef("Artifact");
        }
        return this.artifactDep;
    }

    @objid ("523e9367-11c5-4530-879b-45fb29fb845e")
    public SmDependency getFlowElementDep() {
        if (this.flowElementDep == null) {
        	this.flowElementDep = this.getDependencyDef("FlowElement");
        }
        return this.flowElementDep;
    }

    @objid ("31deaffe-4cc8-49ed-91f3-c5e272f4711f")
    public SmDependency getLaneSetDep() {
        if (this.laneSetDep == null) {
        	this.laneSetDep = this.getDependencyDef("LaneSet");
        }
        return this.laneSetDep;
    }

    @objid ("9151f1d6-4bd5-4cdd-99ac-1d62ba6c7134")
    private static class BpmnSubProcessObjectFactory implements ISmObjectFactory {
        @objid ("77cd7140-0ca9-43e4-8cf9-fb99e9f92010")
        private BpmnSubProcessSmClass smClass;

        @objid ("5ba04086-00d7-4633-93f3-e1f28235ae50")
        public BpmnSubProcessObjectFactory(BpmnSubProcessSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("004b7073-81ba-47f7-afdf-19cfb242a366")
        @Override
        public ISmObjectData createData() {
            return new BpmnSubProcessData(this.smClass);
        }

        @objid ("4765c466-0641-40df-b68b-7fb791b12b47")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSubProcessImpl();
        }

    }

    @objid ("be472f74-1ad6-40c8-a0cc-bf66d8f5c6e9")
    public static class TriggeredByEventSmAttribute extends SmAttribute {
        @objid ("bcca41ec-d135-49a9-b979-49ed63a10775")
        public Object getValue(ISmObjectData data) {
            return ((BpmnSubProcessData) data).mTriggeredByEvent;
        }

        @objid ("2cb00815-2b75-4c1f-9c63-964ccc2d9f9a")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnSubProcessData) data).mTriggeredByEvent = value;
        }

    }

    @objid ("52b39e4e-6601-47c8-a4ef-4788b0ae06a0")
    public static class ArtifactSmDependency extends SmMultipleDependency {
        @objid ("6e3804ad-faf7-46ce-8668-3b043425c826")
        private SmDependency symetricDep;

        @objid ("2495a679-e8ff-405d-86d9-43d2622e527d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnSubProcessData)data).mArtifact != null)? ((BpmnSubProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
        }

        @objid ("4ce9e741-60d3-4503-b524-3dfdf90dae18")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnSubProcessData) data).mArtifact = values;
        }

        @objid ("e30418f6-cf43-4426-b0a8-83a88ed6994c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnArtifactSmClass)this.getTarget()).getSubProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("07bfdddf-7a6c-4635-8a3a-82cb81e31cab")
    public static class FlowElementSmDependency extends SmMultipleDependency {
        @objid ("b911a911-4a12-4553-a23c-9639e807a4d4")
        private SmDependency symetricDep;

        @objid ("69368cbf-baa5-4f6a-b8ec-d3c87dc8237a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnSubProcessData)data).mFlowElement != null)? ((BpmnSubProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
        }

        @objid ("91bf20cb-9670-4306-862f-3cebae787dd6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnSubProcessData) data).mFlowElement = values;
        }

        @objid ("345f50db-29d9-4bb4-b552-d650d068bec3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowElementSmClass)this.getTarget()).getSubProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("340df197-8800-4052-be02-2df1064e749f")
    public static class LaneSetSmDependency extends SmMultipleDependency {
        @objid ("203333e8-5892-476e-afed-fb42f63a1ea5")
        private SmDependency symetricDep;

        @objid ("80010376-93b4-4ddb-b496-269eb00b6a94")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnSubProcessData)data).mLaneSet != null)? ((BpmnSubProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
        }

        @objid ("6137ccf2-4444-439d-a84c-7f3ff3232fd1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnSubProcessData) data).mLaneSet = values;
        }

        @objid ("2e78f8de-c7a9-4c6e-88ba-04d031c30517")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSetSmClass)this.getTarget()).getSubProcessDep();
            }
            return this.symetricDep;
        }

    }

}
