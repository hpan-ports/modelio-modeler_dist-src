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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnMessageEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
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

@objid ("67a60b2f-d45e-41b3-b55c-d10466cf2bbb")
public class BpmnMessageSmClass extends BpmnRootElementSmClass {
    @objid ("5ac74bac-db91-489f-9169-78bb019795da")
    private SmDependency typeDep;

    @objid ("687bb299-2913-4171-bc1c-e45937bed9a2")
    private SmDependency outputMessageDep;

    @objid ("e9425721-95be-4337-b79b-3be2c78d0d53")
    private SmDependency itemRefDep;

    @objid ("9e5592fa-bc5f-45ba-b034-c6cb17a247ca")
    private SmDependency inStateDep;

    @objid ("189b05a8-49b0-4607-bda1-91da903ce0a6")
    private SmDependency eventDefinitionDep;

    @objid ("b8bf7ae4-9bd8-49e8-8aee-c81ed6a72ee8")
    private SmDependency senderDep;

    @objid ("6a0980ee-9389-487b-b798-c4a585961727")
    private SmDependency inputMessageDep;

    @objid ("72871a62-58ca-45e0-a24c-0c4cdfc08140")
    private SmDependency receiverDep;

    @objid ("8b51fa96-49fe-4934-8586-2acefbcb59ce")
    private SmDependency messageFlowDep;

    @objid ("20903f97-4226-425e-bb3e-0218d9903908")
    public BpmnMessageSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c6213989-1e30-4866-b5b1-4b638dc5f265")
    @Override
    public String getName() {
        return "BpmnMessage";
    }

    @objid ("1fdd295c-333e-4ce4-a6bc-5004181a90b1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c2af9a9f-3302-4af5-b7ae-3e882b281d51")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnMessage.class;
    }

    @objid ("8b0f38ba-0907-4107-9e2c-97300bef4d02")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("98bdc86a-2ca6-4d6f-bd7f-cc6e174ef066")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("45a1378d-c1d4-46c6-a4cf-c5e2a134b945")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnMessageObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.outputMessageDep = new OutputMessageSmDependency();
        this.outputMessageDep.init("OutputMessage", this, metamodel.getMClass("BpmnOperation"), 0, -1 );
        registerDependency(this.outputMessageDep);
        
        this.itemRefDep = new ItemRefSmDependency();
        this.itemRefDep.init("ItemRef", this, metamodel.getMClass("BpmnItemDefinition"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.itemRefDep);
        
        this.inStateDep = new InStateSmDependency();
        this.inStateDep.init("InState", this, metamodel.getMClass("State"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.inStateDep);
        
        this.eventDefinitionDep = new EventDefinitionSmDependency();
        this.eventDefinitionDep.init("EventDefinition", this, metamodel.getMClass("BpmnMessageEventDefinition"), 0, -1 );
        registerDependency(this.eventDefinitionDep);
        
        this.senderDep = new SenderSmDependency();
        this.senderDep.init("Sender", this, metamodel.getMClass("BpmnSendTask"), 0, -1 );
        registerDependency(this.senderDep);
        
        this.inputMessageDep = new InputMessageSmDependency();
        this.inputMessageDep.init("InputMessage", this, metamodel.getMClass("BpmnOperation"), 0, -1 );
        registerDependency(this.inputMessageDep);
        
        this.receiverDep = new ReceiverSmDependency();
        this.receiverDep.init("Receiver", this, metamodel.getMClass("BpmnReceiveTask"), 0, -1 );
        registerDependency(this.receiverDep);
        
        this.messageFlowDep = new MessageFlowSmDependency();
        this.messageFlowDep.init("MessageFlow", this, metamodel.getMClass("BpmnMessageFlow"), 0, -1 );
        registerDependency(this.messageFlowDep);
    }

    @objid ("030488f2-d048-44de-a285-11831ef298f3")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("34858d59-3125-4871-97ab-e887092dafa6")
    public SmDependency getOutputMessageDep() {
        if (this.outputMessageDep == null) {
        	this.outputMessageDep = this.getDependencyDef("OutputMessage");
        }
        return this.outputMessageDep;
    }

    @objid ("6bf96273-f5bf-4a08-b193-9ad4dca57ae1")
    public SmDependency getItemRefDep() {
        if (this.itemRefDep == null) {
        	this.itemRefDep = this.getDependencyDef("ItemRef");
        }
        return this.itemRefDep;
    }

    @objid ("a3397ca2-e96e-43c6-a9c0-df61fbb073de")
    public SmDependency getInStateDep() {
        if (this.inStateDep == null) {
        	this.inStateDep = this.getDependencyDef("InState");
        }
        return this.inStateDep;
    }

    @objid ("051bdab8-564d-4171-b9ea-518c22c3b82a")
    public SmDependency getEventDefinitionDep() {
        if (this.eventDefinitionDep == null) {
        	this.eventDefinitionDep = this.getDependencyDef("EventDefinition");
        }
        return this.eventDefinitionDep;
    }

    @objid ("2aa2d8ab-c478-44e6-91b1-e039f75be2a2")
    public SmDependency getSenderDep() {
        if (this.senderDep == null) {
        	this.senderDep = this.getDependencyDef("Sender");
        }
        return this.senderDep;
    }

    @objid ("7cec94b3-8da8-46b7-bc16-8b7435bbb0bb")
    public SmDependency getInputMessageDep() {
        if (this.inputMessageDep == null) {
        	this.inputMessageDep = this.getDependencyDef("InputMessage");
        }
        return this.inputMessageDep;
    }

    @objid ("1cf51cf7-b0dc-4881-a598-64aba387a539")
    public SmDependency getReceiverDep() {
        if (this.receiverDep == null) {
        	this.receiverDep = this.getDependencyDef("Receiver");
        }
        return this.receiverDep;
    }

    @objid ("98244011-7d70-4824-8851-52c02fb31f9d")
    public SmDependency getMessageFlowDep() {
        if (this.messageFlowDep == null) {
        	this.messageFlowDep = this.getDependencyDef("MessageFlow");
        }
        return this.messageFlowDep;
    }

    @objid ("dddd68bb-b374-4b9a-92db-315e09f6203b")
    private static class BpmnMessageObjectFactory implements ISmObjectFactory {
        @objid ("1be0ca03-2c54-45ab-a98c-cf15fe7e9686")
        private BpmnMessageSmClass smClass;

        @objid ("31dc191f-f91f-499a-b846-f5d08d0dcf0e")
        public BpmnMessageObjectFactory(BpmnMessageSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f0147a5f-a8b4-4acb-b850-33e8ac061cee")
        @Override
        public ISmObjectData createData() {
            return new BpmnMessageData(this.smClass);
        }

        @objid ("1cea5787-44b2-4c69-98a7-343a3271ecad")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnMessageImpl();
        }

    }

    @objid ("51dd19c0-e989-4acc-9531-078e996e5239")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("927948d6-05b2-4edb-acd2-bb66043034e7")
        private SmDependency symetricDep;

        @objid ("cfb642f2-d9ab-41bb-8d95-122a07ca0045")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageData) data).mType;
        }

        @objid ("df6535ac-3347-4ab9-b959-bbe4e25a1876")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageData) data).mType = value;
        }

        @objid ("ab2b6796-16d8-40dc-88e2-1d01e06f6365")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getBpmnMessageRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a6ef7a94-2137-498d-8560-95807931c774")
    public static class OutputMessageSmDependency extends SmMultipleDependency {
        @objid ("f9596cd0-299c-43fd-84fb-55ca4e18fd35")
        private SmDependency symetricDep;

        @objid ("27e15e28-b314-4b65-a040-64206b6d2193")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mOutputMessage != null)? ((BpmnMessageData)data).mOutputMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("419ca33f-5007-4983-a5ed-a57cffe124ff")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mOutputMessage = values;
        }

        @objid ("4379e1bb-1bf0-4728-88d4-85783be7c399")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getOutMessageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f8fdad76-05b4-4370-ba47-4afc302966c3")
    public static class ItemRefSmDependency extends SmSingleDependency {
        @objid ("10dce304-4353-459a-9a33-ba66c2cc1daf")
        private SmDependency symetricDep;

        @objid ("9afef058-1985-4a0a-bcb9-1669f643d234")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageData) data).mItemRef;
        }

        @objid ("640a8339-91dd-464d-99be-0009117f2769")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageData) data).mItemRef = value;
        }

        @objid ("94934a00-bcd3-4973-ba0f-f88e0f2a89d9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemDefinitionSmClass)this.getTarget()).getTypedMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6849d737-c74f-4458-8ad3-e39c44391348")
    public static class InStateSmDependency extends SmSingleDependency {
        @objid ("2848a12d-b7a2-4fec-9973-572fdaae917f")
        private SmDependency symetricDep;

        @objid ("e4e79aaa-0eba-4850-8f1b-706246e0bee4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageData) data).mInState;
        }

        @objid ("1906b83b-ffc7-4ce1-a017-cccd960410d8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageData) data).mInState = value;
        }

        @objid ("b4b7b1f5-1c92-4cec-998c-59f839e2dedd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getRequiredStateOfBpmnMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("237fc49f-3ae9-4a1f-aeb0-4c3d8ac1461e")
    public static class EventDefinitionSmDependency extends SmMultipleDependency {
        @objid ("ac01c4f6-941f-482f-bc53-f8fd6da02156")
        private SmDependency symetricDep;

        @objid ("2d76c374-4784-49a8-9903-f632dff2ef19")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mEventDefinition != null)? ((BpmnMessageData)data).mEventDefinition:SmMultipleDependency.EMPTY;
        }

        @objid ("6afc081e-df65-4b59-9456-1a12bd4c1734")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mEventDefinition = values;
        }

        @objid ("abec8813-32c7-4a90-b4c9-a338c26fe1aa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageEventDefinitionSmClass)this.getTarget()).getMessageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("64379a78-6f03-48ee-85e8-fa279bf83e42")
    public static class SenderSmDependency extends SmMultipleDependency {
        @objid ("4d7932b8-f53c-43de-aa16-1d7662ca347b")
        private SmDependency symetricDep;

        @objid ("653305f6-b99d-4b49-abd3-a059ba1369e2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mSender != null)? ((BpmnMessageData)data).mSender:SmMultipleDependency.EMPTY;
        }

        @objid ("8cf4ca81-afd5-4752-badf-535c2d96d256")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mSender = values;
        }

        @objid ("90237a0e-c601-4c37-adbc-a678d8406be8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSendTaskSmClass)this.getTarget()).getMessageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6ffeebc0-ca32-4d64-bad0-e20e7bf86187")
    public static class InputMessageSmDependency extends SmMultipleDependency {
        @objid ("486346f9-61c6-4c66-aee5-d6afeab2b858")
        private SmDependency symetricDep;

        @objid ("9421e58c-b797-4d6d-8b77-4739cb0b127a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mInputMessage != null)? ((BpmnMessageData)data).mInputMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("f18bf20e-81e9-4e76-af06-eabc951c7be3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mInputMessage = values;
        }

        @objid ("25b0ac7e-f3c0-4448-92f3-3510a1cd96e6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getInMessageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("905febfe-a0b9-4986-9767-e265791c48dd")
    public static class ReceiverSmDependency extends SmMultipleDependency {
        @objid ("4ea793e2-0810-4ce6-9c5d-bf3ac9603929")
        private SmDependency symetricDep;

        @objid ("429e7e04-021f-41e4-93d4-a7f92799235f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mReceiver != null)? ((BpmnMessageData)data).mReceiver:SmMultipleDependency.EMPTY;
        }

        @objid ("63040937-e34f-493c-8103-422a6f34248a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mReceiver = values;
        }

        @objid ("28379e4d-3460-4045-9a4d-fcec98008caa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnReceiveTaskSmClass)this.getTarget()).getMessageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("00486824-7724-4beb-877e-fc334ce5a8e0")
    public static class MessageFlowSmDependency extends SmMultipleDependency {
        @objid ("66a6e43c-1b78-4ee2-8ec2-2028e8bbaa8f")
        private SmDependency symetricDep;

        @objid ("c65a95f6-6f12-4c47-aa20-d7a9871a9a25")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMessageData)data).mMessageFlow != null)? ((BpmnMessageData)data).mMessageFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("fb02c6cf-31aa-49b2-bbbb-044e1a315973")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMessageData) data).mMessageFlow = values;
        }

        @objid ("7efb8778-1b8c-4cbd-b73d-11c9bf122ad5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageFlowSmClass)this.getTarget()).getMessageRefDep();
            }
            return this.symetricDep;
        }

    }

}
