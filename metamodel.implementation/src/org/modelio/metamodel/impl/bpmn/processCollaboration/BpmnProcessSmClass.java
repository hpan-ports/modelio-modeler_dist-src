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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivitySmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
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

@objid ("4d8f32f6-a792-47da-86c4-b3a00a3a56ce")
public class BpmnProcessSmClass extends BpmnRootElementSmClass {
    @objid ("05f989e5-4932-4ee7-89a7-84ea8b7ceb13")
    private SmAttribute processTypeAtt;

    @objid ("be838134-7e9f-45a7-aabf-f665fc17acb2")
    private SmAttribute isClosedAtt;

    @objid ("7a4cef2c-8f37-4451-b3e6-bdb00a14ca2d")
    private SmAttribute isExecutableAtt;

    @objid ("51e7ad8c-4b28-412e-b7c5-24ab05a8f445")
    private SmDependency callerDep;

    @objid ("6fdb3692-326d-4bf9-8fc3-ea4081ce73b3")
    private SmDependency supportsDep;

    @objid ("02e82bce-68bd-4fe1-a6a5-0ff3bdb90f46")
    private SmDependency artifactDep;

    @objid ("d2cdee5e-7995-46bf-81b2-877a3c949c07")
    private SmDependency laneSetDep;

    @objid ("d7acf5f1-d8a8-4ab5-b469-341e4cd9ce37")
    private SmDependency supportedDep;

    @objid ("e4005071-bc2c-4615-bb2c-0f9d50f99efc")
    private SmDependency participantDep;

    @objid ("280b326a-da7a-44bc-acc8-45497ed4c967")
    private SmDependency flowElementDep;

    @objid ("0eb812d2-ce89-40d8-b059-7c8a1f7af89c")
    private SmDependency resourceDep;

    @objid ("8475a29d-9a61-4196-99d7-5453bc19dfc9")
    public BpmnProcessSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("19f3ec9c-79f0-44bc-8626-3e12a6abc591")
    @Override
    public String getName() {
        return "BpmnProcess";
    }

    @objid ("653c4c31-b7c6-4ac5-82b9-e5419a147183")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("be329fde-3d61-4607-851e-e86ba1183e5b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnProcess.class;
    }

    @objid ("a7b57a65-baa7-4cac-907c-02d633b377a4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8855014f-689c-457e-bce8-f36dde98e5e4")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("2b077f32-4d81-43e2-9f7e-87d8c859cc1c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnProcessObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.processTypeAtt = new ProcessTypeSmAttribute();
        this.processTypeAtt.init("ProcessType", this, BpmnProcessType.class );
        registerAttribute(this.processTypeAtt);
        
        this.isClosedAtt = new IsClosedSmAttribute();
        this.isClosedAtt.init("IsClosed", this, Boolean.class );
        registerAttribute(this.isClosedAtt);
        
        this.isExecutableAtt = new IsExecutableSmAttribute();
        this.isExecutableAtt.init("IsExecutable", this, OptionalBoolean.class );
        registerAttribute(this.isExecutableAtt);
        
        
        // Initialize and register the SmDependency
        this.callerDep = new CallerSmDependency();
        this.callerDep.init("Caller", this, metamodel.getMClass("BpmnCallActivity"), 0, -1 );
        registerDependency(this.callerDep);
        
        this.supportsDep = new SupportsSmDependency();
        this.supportsDep.init("Supports", this, metamodel.getMClass("BpmnProcess"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.supportsDep);
        
        this.artifactDep = new ArtifactSmDependency();
        this.artifactDep.init("Artifact", this, metamodel.getMClass("BpmnArtifact"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.artifactDep);
        
        this.laneSetDep = new LaneSetSmDependency();
        this.laneSetDep.init("LaneSet", this, metamodel.getMClass("BpmnLaneSet"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.laneSetDep);
        
        this.supportedDep = new SupportedSmDependency();
        this.supportedDep.init("Supported", this, metamodel.getMClass("BpmnProcess"), 0, -1 );
        registerDependency(this.supportedDep);
        
        this.participantDep = new ParticipantSmDependency();
        this.participantDep.init("Participant", this, metamodel.getMClass("BpmnParticipant"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.participantDep);
        
        this.flowElementDep = new FlowElementSmDependency();
        this.flowElementDep.init("FlowElement", this, metamodel.getMClass("BpmnFlowElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.flowElementDep);
        
        this.resourceDep = new ResourceSmDependency();
        this.resourceDep.init("Resource", this, metamodel.getMClass("BpmnResourceRole"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.resourceDep);
    }

    @objid ("3a7a4103-ef9b-4e0e-8d2a-fa8d2defd3aa")
    public SmAttribute getProcessTypeAtt() {
        if (this.processTypeAtt == null) {
        	this.processTypeAtt = this.getAttributeDef("ProcessType");
        }
        return this.processTypeAtt;
    }

    @objid ("8ad46684-b251-4f8f-ac61-d6517a8d04aa")
    public SmAttribute getIsClosedAtt() {
        if (this.isClosedAtt == null) {
        	this.isClosedAtt = this.getAttributeDef("IsClosed");
        }
        return this.isClosedAtt;
    }

    @objid ("1c783fbd-d556-4634-99ee-977d96b408b3")
    public SmAttribute getIsExecutableAtt() {
        if (this.isExecutableAtt == null) {
        	this.isExecutableAtt = this.getAttributeDef("IsExecutable");
        }
        return this.isExecutableAtt;
    }

    @objid ("cc0b7e44-c3ff-4582-9f9f-7765daced944")
    public SmDependency getCallerDep() {
        if (this.callerDep == null) {
        	this.callerDep = this.getDependencyDef("Caller");
        }
        return this.callerDep;
    }

    @objid ("ba414474-e40f-4293-869c-d4fef33a0783")
    public SmDependency getSupportsDep() {
        if (this.supportsDep == null) {
        	this.supportsDep = this.getDependencyDef("Supports");
        }
        return this.supportsDep;
    }

    @objid ("523bee02-a66f-4b90-82be-0500438eac5d")
    public SmDependency getArtifactDep() {
        if (this.artifactDep == null) {
        	this.artifactDep = this.getDependencyDef("Artifact");
        }
        return this.artifactDep;
    }

    @objid ("990ef755-e98a-467f-af37-b8517c085806")
    public SmDependency getLaneSetDep() {
        if (this.laneSetDep == null) {
        	this.laneSetDep = this.getDependencyDef("LaneSet");
        }
        return this.laneSetDep;
    }

    @objid ("6e787885-3f65-4218-80c5-a7830e387bf3")
    public SmDependency getSupportedDep() {
        if (this.supportedDep == null) {
        	this.supportedDep = this.getDependencyDef("Supported");
        }
        return this.supportedDep;
    }

    @objid ("33eafb73-02fa-4710-ab84-09f30d3c86b7")
    public SmDependency getParticipantDep() {
        if (this.participantDep == null) {
        	this.participantDep = this.getDependencyDef("Participant");
        }
        return this.participantDep;
    }

    @objid ("cb65e1c1-caad-43ec-90a7-1ac74641893a")
    public SmDependency getFlowElementDep() {
        if (this.flowElementDep == null) {
        	this.flowElementDep = this.getDependencyDef("FlowElement");
        }
        return this.flowElementDep;
    }

    @objid ("d4aea9d7-fd35-428e-b459-a6d5e410691e")
    public SmDependency getResourceDep() {
        if (this.resourceDep == null) {
        	this.resourceDep = this.getDependencyDef("Resource");
        }
        return this.resourceDep;
    }

    @objid ("b236dd23-e4b3-47bd-aaa4-142763265205")
    private static class BpmnProcessObjectFactory implements ISmObjectFactory {
        @objid ("d4638c80-1e5b-4083-b6a0-e5d40fc160ed")
        private BpmnProcessSmClass smClass;

        @objid ("59c3aac2-513d-4e0f-a825-3e791749666c")
        public BpmnProcessObjectFactory(BpmnProcessSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("91d738a6-afe7-4ed9-88fc-f592883ce27c")
        @Override
        public ISmObjectData createData() {
            return new BpmnProcessData(this.smClass);
        }

        @objid ("128b2a13-df13-42bd-90b8-836acb61514f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnProcessImpl();
        }

    }

    @objid ("e371fa59-c34b-4bc3-9d1f-344f67dbd083")
    public static class ProcessTypeSmAttribute extends SmAttribute {
        @objid ("42112510-cdd0-4680-aeb6-f1c4bb1ed8f6")
        public Object getValue(ISmObjectData data) {
            return ((BpmnProcessData) data).mProcessType;
        }

        @objid ("c88b6656-1c2f-44b2-974c-99455586c8c8")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnProcessData) data).mProcessType = value;
        }

    }

    @objid ("a6ac19be-2280-4803-8a95-794ccf867fad")
    public static class IsClosedSmAttribute extends SmAttribute {
        @objid ("187a746f-2e77-42d3-8aff-760995c61d8c")
        public Object getValue(ISmObjectData data) {
            return ((BpmnProcessData) data).mIsClosed;
        }

        @objid ("cb4b66ee-0830-4432-bf4f-486162096f14")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnProcessData) data).mIsClosed = value;
        }

    }

    @objid ("f8387564-4b9b-4999-94c5-fac1b5d3a24c")
    public static class IsExecutableSmAttribute extends SmAttribute {
        @objid ("0fe6e0f8-a1ad-407a-8cf0-3cc5b657a0fc")
        public Object getValue(ISmObjectData data) {
            return ((BpmnProcessData) data).mIsExecutable;
        }

        @objid ("11ffec28-eca0-4e29-ab3f-9b61bd48fd65")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnProcessData) data).mIsExecutable = value;
        }

    }

    @objid ("d382bc0e-3647-47e2-ab7f-f559e2594532")
    public static class CallerSmDependency extends SmMultipleDependency {
        @objid ("a38beee8-e332-4f99-944e-d59139e9b143")
        private SmDependency symetricDep;

        @objid ("8f7c8cb4-d2a6-4c24-ad2b-728b605998a3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mCaller != null)? ((BpmnProcessData)data).mCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("45ed8411-a397-40b4-bac1-b49a052b07b9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mCaller = values;
        }

        @objid ("1384bd7b-0048-4da7-8d26-3b434a8760fc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCallActivitySmClass)this.getTarget()).getCalledProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6b334464-b5d2-4d65-8572-18b8b622bf4f")
    public static class SupportsSmDependency extends SmMultipleDependency {
        @objid ("133b7959-f25e-4b61-9c2b-d462a24cd5a2")
        private SmDependency symetricDep;

        @objid ("9a2c66af-27d3-471f-8054-4dcf51ea3b31")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mSupports != null)? ((BpmnProcessData)data).mSupports:SmMultipleDependency.EMPTY;
        }

        @objid ("812259bd-12cd-44ad-90de-996fd4062e5b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mSupports = values;
        }

        @objid ("c904dfc2-fddb-4222-9c74-542cb686f1db")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getSupportedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5232cf98-f8f5-4179-9f35-3f4c507d9ff7")
    public static class ArtifactSmDependency extends SmMultipleDependency {
        @objid ("2e3d9c55-9563-41b5-a20d-917d89433e25")
        private SmDependency symetricDep;

        @objid ("2e309f13-4bfb-46c6-bc7b-b9555cf6ba17")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mArtifact != null)? ((BpmnProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
        }

        @objid ("ceb9a227-b858-45ba-9713-76aa63196956")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mArtifact = values;
        }

        @objid ("48887ba0-b970-46c2-a5f2-fa88a0e1d277")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnArtifactSmClass)this.getTarget()).getProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c4aa7051-d7ab-47c5-93c6-327cb32a5566")
    public static class LaneSetSmDependency extends SmMultipleDependency {
        @objid ("6bb0b1f4-eb3e-46fd-a3b7-2e21ca9e685b")
        private SmDependency symetricDep;

        @objid ("0a0f43eb-1f38-47a9-86e7-428ca80dafb6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mLaneSet != null)? ((BpmnProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
        }

        @objid ("212977a8-965a-4bee-9b5d-3f8fd0db5dcc")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mLaneSet = values;
        }

        @objid ("9657309c-5e68-42c1-8658-81668a3c54a6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSetSmClass)this.getTarget()).getProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9fa4863c-aeec-40d2-b392-dfa28494a351")
    public static class SupportedSmDependency extends SmMultipleDependency {
        @objid ("82843c30-2bb7-4df2-8854-58fdd6b0a89a")
        private SmDependency symetricDep;

        @objid ("da2706d5-2fd0-4e49-a5f9-0e67337921e9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mSupported != null)? ((BpmnProcessData)data).mSupported:SmMultipleDependency.EMPTY;
        }

        @objid ("dd625572-a976-4f92-8073-61b75e3e9fd3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mSupported = values;
        }

        @objid ("04b3467b-c53a-448e-b020-5e57b2f60f67")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getSupportsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9d58901c-62a5-43f5-be6d-b5dd45015b40")
    public static class ParticipantSmDependency extends SmSingleDependency {
        @objid ("b42eca40-4626-4589-8092-48a075a202f5")
        private SmDependency symetricDep;

        @objid ("cf6c6b79-9f77-413f-ad09-c4e44f2c4496")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnProcessData) data).mParticipant;
        }

        @objid ("55a2f5c0-15db-48e1-b845-92d3455cad88")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnProcessData) data).mParticipant = value;
        }

        @objid ("96dba470-b199-4dd8-b8f1-f76c49ae3444")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getProcessDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a63c3dc1-d0f5-462c-ade1-e05d262ce59f")
    public static class FlowElementSmDependency extends SmMultipleDependency {
        @objid ("7b4ac675-fc9e-4c0f-8f6a-1ec609624c96")
        private SmDependency symetricDep;

        @objid ("27fbdd43-a301-4f52-9123-00d91811de34")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mFlowElement != null)? ((BpmnProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
        }

        @objid ("8eb11177-bd33-424e-ae37-b72a7837b2d6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mFlowElement = values;
        }

        @objid ("973d56b3-7e3e-4be5-9144-5ea7feae5672")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowElementSmClass)this.getTarget()).getContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2b8aeca8-4060-4e71-a630-8cd078faec9e")
    public static class ResourceSmDependency extends SmMultipleDependency {
        @objid ("8c30db77-f171-4587-b33c-057f6bac1ee2")
        private SmDependency symetricDep;

        @objid ("4a6084b9-c097-4d49-a50c-3e5396af8a02")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnProcessData)data).mResource != null)? ((BpmnProcessData)data).mResource:SmMultipleDependency.EMPTY;
        }

        @objid ("983a7054-93e9-4903-a393-a3b2625c141b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnProcessData) data).mResource = values;
        }

        @objid ("1632a12b-76cc-4531-aa52-58da829a09d0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceRoleSmClass)this.getTarget()).getProcessDep();
            }
            return this.symetricDep;
        }

    }

}
