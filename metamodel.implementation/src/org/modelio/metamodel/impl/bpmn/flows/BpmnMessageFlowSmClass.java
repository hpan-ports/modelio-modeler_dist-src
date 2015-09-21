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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
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

@objid ("3eea7bbe-61b6-445e-80b8-5f370b8b7e4b")
public class BpmnMessageFlowSmClass extends BpmnBaseElementSmClass {
    @objid ("ebb6f427-7554-4453-9856-5ab7ef01050f")
    private SmDependency messageRefDep;

    @objid ("7c2a5047-49e9-40fe-a69a-91240a00cb4d")
    private SmDependency sourceRefDep;

    @objid ("34f9fe17-e1a4-4f4c-873b-41a1d62317ac")
    private SmDependency targetRefDep;

    @objid ("ea536780-825a-4d84-9636-62cec1ab2cd0")
    private SmDependency collaborationDep;

    @objid ("94227362-52df-4cb9-8655-95feb1d66c71")
    public BpmnMessageFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4de2628e-6905-4a16-8049-97fe42b02238")
    @Override
    public String getName() {
        return "BpmnMessageFlow";
    }

    @objid ("080c4ff1-61fb-4547-91c9-6ddeba23c478")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b322b1cd-31af-441c-8ed2-b37f16bcb244")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnMessageFlow.class;
    }

    @objid ("c0646f04-e0dc-484e-93f0-fd95c822d258")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("23178df6-8a85-4efa-a4ec-81f0d132071b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1311b646-169a-4f31-8d76-cc05409f7de4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnMessageFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.messageRefDep = new MessageRefSmDependency();
        this.messageRefDep.init("MessageRef", this, metamodel.getMClass("BpmnMessage"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.messageRefDep);
        
        this.sourceRefDep = new SourceRefSmDependency();
        this.sourceRefDep.init("SourceRef", this, metamodel.getMClass("BpmnBaseElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceRefDep);
        
        this.targetRefDep = new TargetRefSmDependency();
        this.targetRefDep.init("TargetRef", this, metamodel.getMClass("BpmnBaseElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetRefDep);
        
        this.collaborationDep = new CollaborationSmDependency();
        this.collaborationDep.init("Collaboration", this, metamodel.getMClass("BpmnCollaboration"), 1, 1 );
        registerDependency(this.collaborationDep);
    }

    @objid ("c6e2b2a8-973b-4cd0-82f3-a9b3b10a56e4")
    public SmDependency getMessageRefDep() {
        if (this.messageRefDep == null) {
        	this.messageRefDep = this.getDependencyDef("MessageRef");
        }
        return this.messageRefDep;
    }

    @objid ("14fb4649-2418-451e-bea7-2b82d3d3d209")
    public SmDependency getSourceRefDep() {
        if (this.sourceRefDep == null) {
        	this.sourceRefDep = this.getDependencyDef("SourceRef");
        }
        return this.sourceRefDep;
    }

    @objid ("de1edc4a-442c-42d7-9c51-ffeb83fa86a2")
    public SmDependency getTargetRefDep() {
        if (this.targetRefDep == null) {
        	this.targetRefDep = this.getDependencyDef("TargetRef");
        }
        return this.targetRefDep;
    }

    @objid ("95beb746-a2c8-47d7-9d3c-1c9c80331814")
    public SmDependency getCollaborationDep() {
        if (this.collaborationDep == null) {
        	this.collaborationDep = this.getDependencyDef("Collaboration");
        }
        return this.collaborationDep;
    }

    @objid ("beaec6cb-a436-42e4-993d-a8a97e9f256c")
    private static class BpmnMessageFlowObjectFactory implements ISmObjectFactory {
        @objid ("0375ddb1-a6fb-47fd-b6d2-19855b9862d7")
        private BpmnMessageFlowSmClass smClass;

        @objid ("d87321f7-c7ff-4b71-800f-1183c2462491")
        public BpmnMessageFlowObjectFactory(BpmnMessageFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("442c1e77-8986-444d-85ff-efcc1e8d973b")
        @Override
        public ISmObjectData createData() {
            return new BpmnMessageFlowData(this.smClass);
        }

        @objid ("9b8f05ff-bfba-43bd-a306-c38e4244fd92")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnMessageFlowImpl();
        }

    }

    @objid ("ecbb2258-22b2-4dda-8eaf-c73a9ff3d529")
    public static class MessageRefSmDependency extends SmSingleDependency {
        @objid ("bbbb992c-e18c-4545-978e-eec485cc8014")
        private SmDependency symetricDep;

        @objid ("8add7ce8-de6a-4175-887c-df771f7ccd4a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageFlowData) data).mMessageRef;
        }

        @objid ("09eb3e58-1356-4df5-b9c4-72e3a1afe134")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageFlowData) data).mMessageRef = value;
        }

        @objid ("712818d7-87b7-48a6-9067-23ff38fe40d5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getMessageFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5cbf008a-d038-4477-9152-297d15020a0a")
    public static class SourceRefSmDependency extends SmSingleDependency {
        @objid ("0d511ea1-78f7-4877-93a6-12bb1cca3e94")
        private SmDependency symetricDep;

        @objid ("0f12a6ab-f4b0-41b6-9b1d-9b136fdf164a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageFlowData) data).mSourceRef;
        }

        @objid ("cf8a3e8d-8208-461d-bfe7-fdba56773b24")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageFlowData) data).mSourceRef = value;
        }

        @objid ("9edd5a85-4637-4837-a25b-46edbdd868fa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBaseElementSmClass)this.getTarget()).getOutgoingFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("86df730e-013e-4b34-bb06-0eae00cef1ef")
    public static class TargetRefSmDependency extends SmSingleDependency {
        @objid ("03434fc7-37eb-4c6d-9378-d5e272bca0d8")
        private SmDependency symetricDep;

        @objid ("b2fcc227-a997-4a4c-9b55-4d68e46e122d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageFlowData) data).mTargetRef;
        }

        @objid ("50424631-f8d1-4f36-86d3-b6632e7bbff4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageFlowData) data).mTargetRef = value;
        }

        @objid ("76924e0b-4332-41c7-8c92-86b550af2e96")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBaseElementSmClass)this.getTarget()).getIncomingFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f06bbf7f-ea82-4c03-a290-361827a58351")
    public static class CollaborationSmDependency extends SmSingleDependency {
        @objid ("80e549e3-3f4b-4d8a-b8fb-3a264f8dcd40")
        private SmDependency symetricDep;

        @objid ("3b369535-699c-4a7d-85b6-078ec9607356")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageFlowData) data).mCollaboration;
        }

        @objid ("62936c9b-e326-4f09-8d3e-9222607756db")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageFlowData) data).mCollaboration = value;
        }

        @objid ("c1c5b422-b02e-469f-b2a7-bb5fe67b013c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCollaborationSmClass)this.getTarget()).getMessageFlowDep();
            }
            return this.symetricDep;
        }

    }

}
