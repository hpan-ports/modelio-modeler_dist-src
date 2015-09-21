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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactSmClass;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("35abebd8-3162-4403-be18-3ed37e7f8391")
public class BpmnCollaborationSmClass extends BpmnRootElementSmClass {
    @objid ("9de55a35-4f2e-468b-827b-bb3893747eae")
    private SmAttribute isClosedAtt;

    @objid ("fadcf09f-313d-4a5a-b32a-2d2823aeeb89")
    private SmDependency artifactDep;

    @objid ("b6d78d37-db48-4c33-ae50-1be77e3979b4")
    private SmDependency messageFlowDep;

    @objid ("a32d8e2a-e35f-468c-8ffb-ae326dd14b55")
    private SmDependency participantsDep;

    @objid ("646405e5-187e-44bd-a57f-b21fb45550f7")
    public BpmnCollaborationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("50d92128-cd62-40c6-9b8b-174d771df572")
    @Override
    public String getName() {
        return "BpmnCollaboration";
    }

    @objid ("58e1abdd-633c-4c26-9bf5-48bae6a20779")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a0e4b5d9-a690-4f4f-b2ec-a2395db3a9d3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnCollaboration.class;
    }

    @objid ("90ab50b7-0a5e-4a57-8828-2d662e0a8bf1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("350bbe0f-41bd-444a-9a27-6a8e1f3cc7a7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("edfff541-ba89-41ec-bc78-55583f490e21")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnCollaborationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isClosedAtt = new IsClosedSmAttribute();
        this.isClosedAtt.init("IsClosed", this, Boolean.class );
        registerAttribute(this.isClosedAtt);
        
        
        // Initialize and register the SmDependency
        this.artifactDep = new ArtifactSmDependency();
        this.artifactDep.init("Artifact", this, metamodel.getMClass("BpmnArtifact"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.artifactDep);
        
        this.messageFlowDep = new MessageFlowSmDependency();
        this.messageFlowDep.init("MessageFlow", this, metamodel.getMClass("BpmnMessageFlow"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.messageFlowDep);
        
        this.participantsDep = new ParticipantsSmDependency();
        this.participantsDep.init("Participants", this, metamodel.getMClass("BpmnParticipant"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.participantsDep);
    }

    @objid ("9812df7e-f041-4433-9c4d-b02860e83511")
    public SmAttribute getIsClosedAtt() {
        if (this.isClosedAtt == null) {
        	this.isClosedAtt = this.getAttributeDef("IsClosed");
        }
        return this.isClosedAtt;
    }

    @objid ("8c958d6c-f97d-428f-838b-cc36b3a2ec16")
    public SmDependency getArtifactDep() {
        if (this.artifactDep == null) {
        	this.artifactDep = this.getDependencyDef("Artifact");
        }
        return this.artifactDep;
    }

    @objid ("c3b80b17-d20b-450f-8b18-d227d1971ef6")
    public SmDependency getMessageFlowDep() {
        if (this.messageFlowDep == null) {
        	this.messageFlowDep = this.getDependencyDef("MessageFlow");
        }
        return this.messageFlowDep;
    }

    @objid ("6bfc3f75-1202-4355-954a-541edd70ecc1")
    public SmDependency getParticipantsDep() {
        if (this.participantsDep == null) {
        	this.participantsDep = this.getDependencyDef("Participants");
        }
        return this.participantsDep;
    }

    @objid ("8e14ab57-c013-480a-96bd-3669d9869e16")
    private static class BpmnCollaborationObjectFactory implements ISmObjectFactory {
        @objid ("c1965ffd-1d01-4d72-9be9-28370980e45b")
        private BpmnCollaborationSmClass smClass;

        @objid ("d0cf96ee-a564-4159-a77a-0a1bf7573d98")
        public BpmnCollaborationObjectFactory(BpmnCollaborationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("92c9ffd7-925c-4b35-818d-66b96ba10cba")
        @Override
        public ISmObjectData createData() {
            return new BpmnCollaborationData(this.smClass);
        }

        @objid ("83df7b25-2696-4265-85dc-1ef1ecfaf318")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnCollaborationImpl();
        }

    }

    @objid ("ec9ff67c-7bc1-4969-9a92-8362b70bea58")
    public static class IsClosedSmAttribute extends SmAttribute {
        @objid ("747a2152-d4a4-4550-85d7-77a3d5bc90b0")
        public Object getValue(ISmObjectData data) {
            return ((BpmnCollaborationData) data).mIsClosed;
        }

        @objid ("054b8d61-5061-4db2-848c-db22f5e7d2bd")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnCollaborationData) data).mIsClosed = value;
        }

    }

    @objid ("d28b3ed0-adac-41b3-a7a1-ffe7416a6c70")
    public static class ArtifactSmDependency extends SmMultipleDependency {
        @objid ("497bacf7-668a-453f-ae7e-86616374e60c")
        private SmDependency symetricDep;

        @objid ("f27a6fc6-a8e6-4b0b-9322-33997c308c7d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnCollaborationData)data).mArtifact != null)? ((BpmnCollaborationData)data).mArtifact:SmMultipleDependency.EMPTY;
        }

        @objid ("d6389765-689b-45d0-953b-4ff173b930c0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnCollaborationData) data).mArtifact = values;
        }

        @objid ("b826c383-8dbe-4661-8ffd-c0f7f9de0837")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnArtifactSmClass)this.getTarget()).getCollaborationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b9cb68ae-9c0f-4ec8-9d0d-47b24dc1f86e")
    public static class MessageFlowSmDependency extends SmMultipleDependency {
        @objid ("049ecf79-289c-42f2-a885-437fa4856352")
        private SmDependency symetricDep;

        @objid ("6addb1bd-f645-4536-9d9d-266bc15ca492")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnCollaborationData)data).mMessageFlow != null)? ((BpmnCollaborationData)data).mMessageFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("4894ba68-b055-44e1-ab63-223f0c9e8642")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnCollaborationData) data).mMessageFlow = values;
        }

        @objid ("433de19f-95c8-4cc2-ae5e-4a9d19f465b2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageFlowSmClass)this.getTarget()).getCollaborationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("78f33ba6-bb27-46d5-86d2-5ca04a7c0fc8")
    public static class ParticipantsSmDependency extends SmMultipleDependency {
        @objid ("06706a35-ee80-47f8-9a4c-7644e30bf101")
        private SmDependency symetricDep;

        @objid ("6685aa61-96e2-46af-b39a-2dae03399e66")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnCollaborationData)data).mParticipants != null)? ((BpmnCollaborationData)data).mParticipants:SmMultipleDependency.EMPTY;
        }

        @objid ("995fff11-2b3e-4f7b-ac25-b0a4cf280113")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnCollaborationData) data).mParticipants = values;
        }

        @objid ("4e0cef17-6498-4128-94cf-834806a53a7b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getContainerDep();
            }
            return this.symetricDep;
        }

    }

}
