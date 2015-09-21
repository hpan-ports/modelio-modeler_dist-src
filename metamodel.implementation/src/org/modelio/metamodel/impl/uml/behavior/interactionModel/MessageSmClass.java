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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
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

@objid ("8c7c5c80-1e3c-40f4-96bd-887108a36523")
public class MessageSmClass extends ModelElementSmClass {
    @objid ("ca4cf78b-716f-4968-9a1e-e6ebb27ef1ed")
    private SmAttribute argumentAtt;

    @objid ("d661a3d7-91d3-447d-960f-a1a55ebfc83d")
    private SmAttribute kindOfMessageAtt;

    @objid ("bcb081f1-ec62-4239-a19b-f89bf4c57db2")
    private SmAttribute sortOfMessageAtt;

    @objid ("34fbdf87-bc30-4d1b-9947-f82d5e0481d3")
    private SmDependency signalSignatureDep;

    @objid ("6b794022-f2c7-4861-b1ba-c67baf70bfd0")
    private SmDependency receiveEventDep;

    @objid ("d31455a6-4861-464c-b626-9caa71eb58b3")
    private SmDependency sendEventDep;

    @objid ("be9d4313-6b84-4b54-8edc-6e3b3c1f19ef")
    private SmDependency invokedDep;

    @objid ("28300c60-2ae8-46d0-b738-afdf3aa38298")
    private SmDependency realizedInformationFlowDep;

    @objid ("b7053471-f358-46ca-b7c7-c7c11d70bd31")
    public MessageSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("292d3553-2a6f-4f27-b3e0-95831bf8b66e")
    @Override
    public String getName() {
        return "Message";
    }

    @objid ("7534e28c-0028-44dd-9826-95dc8699d9ec")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f4328434-aa5a-4eb0-996c-b37b769599b7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Message.class;
    }

    @objid ("d34ca1c7-52a9-48fd-9fcc-d89e2f2c9be1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7ba60bf7-e3a5-4def-84f2-878e88ddb043")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("387bf43a-9029-405e-8fae-5d53a4bb8d5a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new MessageObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.argumentAtt = new ArgumentSmAttribute();
        this.argumentAtt.init("Argument", this, String.class );
        registerAttribute(this.argumentAtt);
        
        this.kindOfMessageAtt = new KindOfMessageSmAttribute();
        this.kindOfMessageAtt.init("KindOfMessage", this, MessageKind.class );
        registerAttribute(this.kindOfMessageAtt);
        
        this.sortOfMessageAtt = new SortOfMessageSmAttribute();
        this.sortOfMessageAtt.init("SortOfMessage", this, MessageSort.class );
        registerAttribute(this.sortOfMessageAtt);
        
        
        // Initialize and register the SmDependency
        this.signalSignatureDep = new SignalSignatureSmDependency();
        this.signalSignatureDep.init("SignalSignature", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.signalSignatureDep);
        
        this.receiveEventDep = new ReceiveEventSmDependency();
        this.receiveEventDep.init("ReceiveEvent", this, metamodel.getMClass("MessageEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.receiveEventDep);
        
        this.sendEventDep = new SendEventSmDependency();
        this.sendEventDep.init("SendEvent", this, metamodel.getMClass("MessageEnd"), 0, 1 );
        registerDependency(this.sendEventDep);
        
        this.invokedDep = new InvokedSmDependency();
        this.invokedDep.init("Invoked", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.invokedDep);
        
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
    }

    @objid ("557aed6d-4c47-4ec6-96ec-2061aec4c76e")
    public SmAttribute getArgumentAtt() {
        if (this.argumentAtt == null) {
        	this.argumentAtt = this.getAttributeDef("Argument");
        }
        return this.argumentAtt;
    }

    @objid ("4a9fe83f-eeb0-4aed-8a80-055d67be47f6")
    public SmAttribute getKindOfMessageAtt() {
        if (this.kindOfMessageAtt == null) {
        	this.kindOfMessageAtt = this.getAttributeDef("KindOfMessage");
        }
        return this.kindOfMessageAtt;
    }

    @objid ("9d226e26-fa57-4716-b86e-301b6112398a")
    public SmAttribute getSortOfMessageAtt() {
        if (this.sortOfMessageAtt == null) {
        	this.sortOfMessageAtt = this.getAttributeDef("SortOfMessage");
        }
        return this.sortOfMessageAtt;
    }

    @objid ("c62420ed-56af-4cf9-84e1-3e0ad51ee1fc")
    public SmDependency getSignalSignatureDep() {
        if (this.signalSignatureDep == null) {
        	this.signalSignatureDep = this.getDependencyDef("SignalSignature");
        }
        return this.signalSignatureDep;
    }

    @objid ("82b322b5-15a2-4cb5-a6b8-8140132d285b")
    public SmDependency getReceiveEventDep() {
        if (this.receiveEventDep == null) {
        	this.receiveEventDep = this.getDependencyDef("ReceiveEvent");
        }
        return this.receiveEventDep;
    }

    @objid ("2634a603-6f0d-4151-858d-d60648c02058")
    public SmDependency getSendEventDep() {
        if (this.sendEventDep == null) {
        	this.sendEventDep = this.getDependencyDef("SendEvent");
        }
        return this.sendEventDep;
    }

    @objid ("6aec2877-549c-41cf-beff-ac171ef4f703")
    public SmDependency getInvokedDep() {
        if (this.invokedDep == null) {
        	this.invokedDep = this.getDependencyDef("Invoked");
        }
        return this.invokedDep;
    }

    @objid ("84307205-37d2-4332-8eba-c6f69734bbbb")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("b5e73ea1-240c-4bbe-ac4f-670b7ff6229d")
    private static class MessageObjectFactory implements ISmObjectFactory {
        @objid ("b2ba594a-451e-40f0-8530-b04155715207")
        private MessageSmClass smClass;

        @objid ("815d06f5-0a00-489c-84e9-773dcfb9eb91")
        public MessageObjectFactory(MessageSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b70b956f-1ec3-4dea-ae46-9bac47c0c369")
        @Override
        public ISmObjectData createData() {
            return new MessageData(this.smClass);
        }

        @objid ("f1061a48-1a66-4a59-a6ec-587aaea025c4")
        @Override
        public SmObjectImpl createImpl() {
            return new MessageImpl();
        }

    }

    @objid ("8315acd8-5894-4ffc-9fce-d135c16eb7de")
    public static class ArgumentSmAttribute extends SmAttribute {
        @objid ("dab10e94-4f4f-4098-977f-c0fc8d835c0d")
        public Object getValue(ISmObjectData data) {
            return ((MessageData) data).mArgument;
        }

        @objid ("73d77a58-213f-4c26-a9ba-d6846e24953c")
        public void setValue(ISmObjectData data, Object value) {
            ((MessageData) data).mArgument = value;
        }

    }

    @objid ("686b4980-5d5a-4f9f-aea4-2fa90236b908")
    public static class KindOfMessageSmAttribute extends SmAttribute {
        @objid ("fb244333-1649-42ee-b350-416795d13e2b")
        public Object getValue(ISmObjectData data) {
            return ((MessageData) data).mKindOfMessage;
        }

        @objid ("970234bf-473f-4774-92e1-9ef143d3ba84")
        public void setValue(ISmObjectData data, Object value) {
            ((MessageData) data).mKindOfMessage = value;
        }

    }

    @objid ("113994ed-43a0-4f7d-8412-eedcc08a7c75")
    public static class SortOfMessageSmAttribute extends SmAttribute {
        @objid ("558392ed-d71c-47cc-b5e0-27794be378fd")
        public Object getValue(ISmObjectData data) {
            return ((MessageData) data).mSortOfMessage;
        }

        @objid ("08587a9a-5448-4fcc-ab73-d864519ab6f3")
        public void setValue(ISmObjectData data, Object value) {
            ((MessageData) data).mSortOfMessage = value;
        }

    }

    @objid ("1e2a45c5-2179-4f83-a5a8-16218590cf58")
    public static class SignalSignatureSmDependency extends SmSingleDependency {
        @objid ("833d6990-1fc3-43dd-a883-bbdc1fc713b1")
        private SmDependency symetricDep;

        @objid ("1d9c2755-2cfb-44fc-ac58-2fd331555cbb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageData) data).mSignalSignature;
        }

        @objid ("5666a198-e371-46e0-880e-4ab75ca9f6da")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageData) data).mSignalSignature = value;
        }

        @objid ("45d1f953-ea99-4bf4-8098-71bc55026953")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getUsageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b61bb2bf-530c-42ad-b95a-d4ab33e20396")
    public static class ReceiveEventSmDependency extends SmSingleDependency {
        @objid ("a43026d0-bd6e-416d-b9d2-2288c8827737")
        private SmDependency symetricDep;

        @objid ("94fdcadd-37c0-4286-8403-64414d753550")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageData) data).mReceiveEvent;
        }

        @objid ("5e63565f-db72-4463-9b79-dfdfb621e565")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageData) data).mReceiveEvent = value;
        }

        @objid ("eeccf944-4338-41be-b2e4-6154d51b5756")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageEndSmClass)this.getTarget()).getReceivedMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bc76b2f3-be18-464b-bd3b-bc7393bdabfd")
    public static class SendEventSmDependency extends SmSingleDependency {
        @objid ("33ffb155-9584-4c77-8114-32a52cc6ca0b")
        private SmDependency symetricDep;

        @objid ("d239ac2d-2bd1-45cf-931f-ae3d62f674b4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageData) data).mSendEvent;
        }

        @objid ("e2a8a10c-bda6-47f3-884e-724113a64e3f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageData) data).mSendEvent = value;
        }

        @objid ("9b472876-637b-499b-b1db-6dec5047d2f0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageEndSmClass)this.getTarget()).getSentMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3ca91ca1-61d5-457b-a1e0-1a614a6ede08")
    public static class InvokedSmDependency extends SmSingleDependency {
        @objid ("b7f2a757-9978-4a56-beba-f2fda22443bb")
        private SmDependency symetricDep;

        @objid ("034146f2-51fe-4923-b6ee-95d58652b6b9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageData) data).mInvoked;
        }

        @objid ("55bb90db-7f55-4871-a57c-54dad7dc04a4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageData) data).mInvoked = value;
        }

        @objid ("385a0eb2-fe60-40ce-933e-e38093d4454f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getUsageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("01250425-e41e-4acb-8d64-f8a89097a5e6")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("59400776-6db6-4d6b-a4f7-fe5517b1c796")
        private SmDependency symetricDep;

        @objid ("51b28144-e1d2-4982-84ac-7687c8072fcb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((MessageData)data).mRealizedInformationFlow != null)? ((MessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("2d66e8f6-67d3-4a79-94b6-1fa0bcf3d027")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((MessageData) data).mRealizedInformationFlow = values;
        }

        @objid ("42ffd78a-79cc-48c8-9b75-d15f4917eaa0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingMessageDep();
            }
            return this.symetricDep;
        }

    }

}
