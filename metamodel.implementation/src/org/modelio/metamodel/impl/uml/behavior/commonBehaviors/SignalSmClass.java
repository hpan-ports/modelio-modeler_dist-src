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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptSignalActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.SendSignalActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.DataFlowSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
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

@objid ("c89cedee-1c4a-4e97-82b0-fd0e6622b708")
public class SignalSmClass extends GeneralClassSmClass {
    @objid ("38edd67d-f6e7-4a48-a10a-615fd04a168f")
    private SmAttribute isEventAtt;

    @objid ("9c0796ae-8e7c-4f99-87a1-4016d2a6f639")
    private SmAttribute isExceptionAtt;

    @objid ("537be34a-21a5-44a1-920c-6abc254a40c4")
    private SmDependency senderDep;

    @objid ("0b0bcbb7-6948-4451-b720-92022fac5166")
    private SmDependency usageDep;

    @objid ("15e4a0b6-a07c-4d55-90df-304a2296179a")
    private SmDependency sendsDep;

    @objid ("09c819ee-3e8f-440f-bef2-d9c3b4d79d2e")
    private SmDependency pBaseDep;

    @objid ("0f8461ef-edf7-4e73-98bb-8f03c8c0a54a")
    private SmDependency oBaseDep;

    @objid ("74d095a5-6638-483a-9571-0e74e79fd649")
    private SmDependency communicationUsageDep;

    @objid ("64ebf65c-4cf3-4ec3-a6e3-15f12fd25f4b")
    private SmDependency dOccurenceDep;

    @objid ("1c8667fc-6551-4ee4-b55a-3a50a076f658")
    private SmDependency eOccurenceDep;

    @objid ("238aa343-1edc-46fc-98ad-ffa88341c5fc")
    private SmDependency baseDep;

    @objid ("8d068356-b76a-4380-bf79-6d370bd3ef61")
    private SmDependency receiverDep;

    @objid ("443957e3-f101-4ebb-976d-ff453d1319c6")
    public SignalSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7e79440e-4f9c-4f03-b62c-16ed328bcdfe")
    @Override
    public String getName() {
        return "Signal";
    }

    @objid ("8e71d7ee-58df-424d-ad1f-14ba6c26fea6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0809f522-f857-457b-b209-590b04434325")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Signal.class;
    }

    @objid ("f1c57c5c-3ca8-4414-a425-70d30a039e7e")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("9e474c9a-59b6-40a8-a3ee-fe52608fc636")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f4dc82af-805c-4e29-8c32-673d026d918a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new SignalObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isEventAtt = new IsEventSmAttribute();
        this.isEventAtt.init("IsEvent", this, Boolean.class );
        registerAttribute(this.isEventAtt);
        
        this.isExceptionAtt = new IsExceptionSmAttribute();
        this.isExceptionAtt.init("IsException", this, Boolean.class );
        registerAttribute(this.isExceptionAtt);
        
        
        // Initialize and register the SmDependency
        this.senderDep = new SenderSmDependency();
        this.senderDep.init("Sender", this, metamodel.getMClass("SendSignalAction"), 0, -1 );
        registerDependency(this.senderDep);
        
        this.usageDep = new UsageSmDependency();
        this.usageDep.init("Usage", this, metamodel.getMClass("Message"), 0, -1 );
        registerDependency(this.usageDep);
        
        this.sendsDep = new SendsSmDependency();
        this.sendsDep.init("Sends", this, metamodel.getMClass("Transition"), 0, -1 );
        registerDependency(this.sendsDep);
        
        this.pBaseDep = new PBaseSmDependency();
        this.pBaseDep.init("PBase", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.pBaseDep);
        
        this.oBaseDep = new OBaseSmDependency();
        this.oBaseDep.init("OBase", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.oBaseDep);
        
        this.communicationUsageDep = new CommunicationUsageSmDependency();
        this.communicationUsageDep.init("CommunicationUsage", this, metamodel.getMClass("CommunicationMessage"), 0, -1 );
        registerDependency(this.communicationUsageDep);
        
        this.dOccurenceDep = new DOccurenceSmDependency();
        this.dOccurenceDep.init("DOccurence", this, metamodel.getMClass("DataFlow"), 0, -1 );
        registerDependency(this.dOccurenceDep);
        
        this.eOccurenceDep = new EOccurenceSmDependency();
        this.eOccurenceDep.init("EOccurence", this, metamodel.getMClass("Event"), 0, -1 );
        registerDependency(this.eOccurenceDep);
        
        this.baseDep = new BaseSmDependency();
        this.baseDep.init("Base", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.baseDep);
        
        this.receiverDep = new ReceiverSmDependency();
        this.receiverDep.init("Receiver", this, metamodel.getMClass("AcceptSignalAction"), 0, -1 );
        registerDependency(this.receiverDep);
    }

    @objid ("cd720889-8d33-4346-b569-777321c3f943")
    public SmAttribute getIsEventAtt() {
        if (this.isEventAtt == null) {
        	this.isEventAtt = this.getAttributeDef("IsEvent");
        }
        return this.isEventAtt;
    }

    @objid ("b41b294c-064d-4589-81a7-d912022d8584")
    public SmAttribute getIsExceptionAtt() {
        if (this.isExceptionAtt == null) {
        	this.isExceptionAtt = this.getAttributeDef("IsException");
        }
        return this.isExceptionAtt;
    }

    @objid ("fa8b2f9b-24b6-44ed-9e6e-77ba7c42ffe9")
    public SmDependency getSenderDep() {
        if (this.senderDep == null) {
        	this.senderDep = this.getDependencyDef("Sender");
        }
        return this.senderDep;
    }

    @objid ("203d6a27-0c12-4458-9b6c-e5d8d68b5396")
    public SmDependency getUsageDep() {
        if (this.usageDep == null) {
        	this.usageDep = this.getDependencyDef("Usage");
        }
        return this.usageDep;
    }

    @objid ("aae45393-4225-46ba-be47-44c112d05587")
    public SmDependency getSendsDep() {
        if (this.sendsDep == null) {
        	this.sendsDep = this.getDependencyDef("Sends");
        }
        return this.sendsDep;
    }

    @objid ("8fc6a143-e4f9-46c0-a10c-5c46b7903f79")
    public SmDependency getPBaseDep() {
        if (this.pBaseDep == null) {
        	this.pBaseDep = this.getDependencyDef("PBase");
        }
        return this.pBaseDep;
    }

    @objid ("30cde6a8-0bf4-439f-9cf1-be16425f8158")
    public SmDependency getOBaseDep() {
        if (this.oBaseDep == null) {
        	this.oBaseDep = this.getDependencyDef("OBase");
        }
        return this.oBaseDep;
    }

    @objid ("7e325f02-ba19-47b9-b00f-3c13690263a3")
    public SmDependency getCommunicationUsageDep() {
        if (this.communicationUsageDep == null) {
        	this.communicationUsageDep = this.getDependencyDef("CommunicationUsage");
        }
        return this.communicationUsageDep;
    }

    @objid ("720737a1-9402-45fb-b68c-e43237ea9d62")
    public SmDependency getDOccurenceDep() {
        if (this.dOccurenceDep == null) {
        	this.dOccurenceDep = this.getDependencyDef("DOccurence");
        }
        return this.dOccurenceDep;
    }

    @objid ("4868c787-3323-43db-9a52-7ecdae280102")
    public SmDependency getEOccurenceDep() {
        if (this.eOccurenceDep == null) {
        	this.eOccurenceDep = this.getDependencyDef("EOccurence");
        }
        return this.eOccurenceDep;
    }

    @objid ("2c1d8744-77a1-49c3-aff7-20cae29acb0c")
    public SmDependency getBaseDep() {
        if (this.baseDep == null) {
        	this.baseDep = this.getDependencyDef("Base");
        }
        return this.baseDep;
    }

    @objid ("f7d89839-ac98-4206-bb4f-1668625722c1")
    public SmDependency getReceiverDep() {
        if (this.receiverDep == null) {
        	this.receiverDep = this.getDependencyDef("Receiver");
        }
        return this.receiverDep;
    }

    @objid ("a0a7aa14-5525-4035-af69-aff626e38ed5")
    private static class SignalObjectFactory implements ISmObjectFactory {
        @objid ("9c7649bf-805c-4e0c-a932-797429a4d8bb")
        private SignalSmClass smClass;

        @objid ("7d250182-120f-46de-9f2a-91d587a9be13")
        public SignalObjectFactory(SignalSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3af2086c-600e-494f-b410-ca150fb77224")
        @Override
        public ISmObjectData createData() {
            return new SignalData(this.smClass);
        }

        @objid ("3a8656e1-718c-4cd7-9475-1635579d6daf")
        @Override
        public SmObjectImpl createImpl() {
            return new SignalImpl();
        }

    }

    @objid ("32996c05-6d83-4b75-aa24-8a423b7e5e52")
    public static class IsEventSmAttribute extends SmAttribute {
        @objid ("e00e35c7-ae44-4fd0-b7e0-18082160321c")
        public Object getValue(ISmObjectData data) {
            return ((SignalData) data).mIsEvent;
        }

        @objid ("4a138d89-bd0b-48ce-8909-c46ef75d4435")
        public void setValue(ISmObjectData data, Object value) {
            ((SignalData) data).mIsEvent = value;
        }

    }

    @objid ("05613feb-c642-4b0d-9fc0-7eed65a2f951")
    public static class IsExceptionSmAttribute extends SmAttribute {
        @objid ("3ea1216d-0ce3-48f8-bd28-48e84026fe9f")
        public Object getValue(ISmObjectData data) {
            return ((SignalData) data).mIsException;
        }

        @objid ("03362f17-0ba9-43fb-8fe7-a882e4ca2665")
        public void setValue(ISmObjectData data, Object value) {
            ((SignalData) data).mIsException = value;
        }

    }

    @objid ("df7f254e-f040-4d0d-b128-e29147faed0e")
    public static class SenderSmDependency extends SmMultipleDependency {
        @objid ("1704b545-7391-4a56-bd4a-d23b93afdc62")
        private SmDependency symetricDep;

        @objid ("c512f84d-be92-4c1c-873a-8223dc7beba4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mSender != null)? ((SignalData)data).mSender:SmMultipleDependency.EMPTY;
        }

        @objid ("6c073510-c16c-481d-8fdf-fee8819c4fa2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mSender = values;
        }

        @objid ("cbcc0632-9251-4f0e-8edc-fbdb0aac6e35")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SendSignalActionSmClass)this.getTarget()).getSentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("37a30416-288f-41eb-adcf-e9d16d7248c2")
    public static class UsageSmDependency extends SmMultipleDependency {
        @objid ("6b6f3b1d-e211-4b8b-a48f-f9285965b4e6")
        private SmDependency symetricDep;

        @objid ("b3f7515c-42af-4341-b2b2-c85a38fe312c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mUsage != null)? ((SignalData)data).mUsage:SmMultipleDependency.EMPTY;
        }

        @objid ("46be631f-b72d-4f05-9ed9-a614cf869025")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mUsage = values;
        }

        @objid ("1e46ffec-20c5-4fa3-9658-83a56bd7701e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageSmClass)this.getTarget()).getSignalSignatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e565d0cc-b3c6-4e35-8873-90e031c2c3e6")
    public static class SendsSmDependency extends SmMultipleDependency {
        @objid ("40242df4-87fe-4f44-8a04-5d83795a5d0a")
        private SmDependency symetricDep;

        @objid ("1d5049df-1fed-4e04-9713-17ca51ec3ba7")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mSends != null)? ((SignalData)data).mSends:SmMultipleDependency.EMPTY;
        }

        @objid ("8604df9a-eda0-4a8e-ab7a-6c118824f17c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mSends = values;
        }

        @objid ("4340436a-abef-4489-bc4d-04e91d123212")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getEffectsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("29cb315e-f607-401b-860b-456c5c57e65b")
    public static class PBaseSmDependency extends SmSingleDependency {
        @objid ("d7bb66b0-8c5d-4d37-a5e3-f855361a4ee7")
        private SmDependency symetricDep;

        @objid ("4c762c05-5adf-4e9f-b057-87e81b5bc47b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SignalData) data).mPBase;
        }

        @objid ("099aeb54-5fc0-42be-a69b-b97dd33a68a5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SignalData) data).mPBase = value;
        }

        @objid ("cb302ce9-79e1-477d-a290-0b9923a732c8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getSRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9980a685-bc62-461f-8eb8-1f8421ffeaa4")
    public static class OBaseSmDependency extends SmSingleDependency {
        @objid ("7eb9ec21-bfe3-4b4e-abfc-f261a89ba7e3")
        private SmDependency symetricDep;

        @objid ("5f43a008-0994-4265-ad88-76670689823d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SignalData) data).mOBase;
        }

        @objid ("2e85c1af-8dd3-4c6e-bc9d-0298d43b63a9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SignalData) data).mOBase = value;
        }

        @objid ("b78f8fe8-014a-403a-9f19-84094b977b88")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getSRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("faa25654-dbd3-40bb-80a5-5824050bdced")
    public static class CommunicationUsageSmDependency extends SmMultipleDependency {
        @objid ("86fa5dde-bd58-4190-820d-b9f9931cbe6d")
        private SmDependency symetricDep;

        @objid ("2b66e042-a3bb-44a7-9b04-ea6d8b3a44f8")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mCommunicationUsage != null)? ((SignalData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
        }

        @objid ("cb7e471c-03f9-46bd-8556-2d4b895880a1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mCommunicationUsage = values;
        }

        @objid ("18fba1c1-4e7a-4b8d-a208-5e492423ad4a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationMessageSmClass)this.getTarget()).getSignalSignatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0d0e9c8b-83dd-4a1b-9b44-de025987908a")
    public static class DOccurenceSmDependency extends SmMultipleDependency {
        @objid ("cafe96d8-6021-4cd5-94b9-3991ede6da9f")
        private SmDependency symetricDep;

        @objid ("b022843d-9c05-484f-bcd4-e991e635586e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mDOccurence != null)? ((SignalData)data).mDOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("167b5b1b-7ad6-413c-ab91-675a741b1360")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mDOccurence = values;
        }

        @objid ("e4f12315-be03-43fc-ac32-13b54ffe8760")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DataFlowSmClass)this.getTarget()).getSModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("82a01df0-1d91-47a5-8b51-334349455e2e")
    public static class EOccurenceSmDependency extends SmMultipleDependency {
        @objid ("095ab9f3-b78b-4764-9b90-89835df85720")
        private SmDependency symetricDep;

        @objid ("6644ec41-d83a-4682-bb4b-8dbdc024ebb3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mEOccurence != null)? ((SignalData)data).mEOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("1a12a54f-613a-4321-8e46-453744937680")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mEOccurence = values;
        }

        @objid ("37750f54-f159-40eb-8e42-b425a919a88e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EventSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5b38c9a1-4f2b-4e11-a4a7-fd3cd413d9a0")
    public static class BaseSmDependency extends SmSingleDependency {
        @objid ("16a9da74-c991-472a-9226-b6ad55498b84")
        private SmDependency symetricDep;

        @objid ("9abe47eb-02af-4402-acb7-0aec40934ae7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SignalData) data).mBase;
        }

        @objid ("1cdb804a-c286-4782-b3f4-a1caf5e73ebe")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SignalData) data).mBase = value;
        }

        @objid ("5b922c53-18ed-4c9a-b012-2274214697f2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getSRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8b0e416e-a05d-4570-8372-20fa4767a418")
    public static class ReceiverSmDependency extends SmMultipleDependency {
        @objid ("3e0de168-258f-4ee9-9313-b668b800ed33")
        private SmDependency symetricDep;

        @objid ("28dfd164-b9d3-43c6-bdc3-bef5083f7ffe")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((SignalData)data).mReceiver != null)? ((SignalData)data).mReceiver:SmMultipleDependency.EMPTY;
        }

        @objid ("af509307-b682-4fe1-9d70-ba1423cf514c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((SignalData) data).mReceiver = values;
        }

        @objid ("15e9dced-53c3-4335-bc45-c7c8e422d571")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AcceptSignalActionSmClass)this.getTarget()).getAcceptedDep();
            }
            return this.symetricDep;
        }

    }

}
