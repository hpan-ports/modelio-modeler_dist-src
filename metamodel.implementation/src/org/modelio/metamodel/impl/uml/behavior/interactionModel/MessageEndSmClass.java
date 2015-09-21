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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
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

@objid ("aa51d4fc-b7d0-45a9-94c0-0bca595a6371")
public class MessageEndSmClass extends OccurrenceSpecificationSmClass {
    @objid ("8d6b5927-cb0f-4026-b74e-29a65bdbcafb")
    private SmDependency receivedMessageDep;

    @objid ("566b571b-8a8e-42df-95d5-3ab0c7f0b497")
    private SmDependency sentMessageDep;

    @objid ("a2024254-f1c0-47bd-91a7-23d781767b6d")
    public MessageEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("231b7611-be3b-47ce-9931-fc563eec450a")
    @Override
    public String getName() {
        return "MessageEnd";
    }

    @objid ("05402011-1c47-458d-86ca-c6ccc5c80a57")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("263a5a20-f479-4568-a982-99922ed827f4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return MessageEnd.class;
    }

    @objid ("7e604c56-99c9-4b0e-a250-75362789fbfe")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("bab6ba2f-e7ab-439b-9b9a-7e2353d749f3")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("db72f7ed-d7fd-411f-8177-26fb5d443d10")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("OccurrenceSpecification");
        this.registerFactory(new MessageEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.receivedMessageDep = new ReceivedMessageSmDependency();
        this.receivedMessageDep.init("ReceivedMessage", this, metamodel.getMClass("Message"), 0, 1 , SmDirective.SMCDTODELETE);
        registerDependency(this.receivedMessageDep);
        
        this.sentMessageDep = new SentMessageSmDependency();
        this.sentMessageDep.init("SentMessage", this, metamodel.getMClass("Message"), 0, 1 , SmDirective.SMCDCOMPONENT, SmDirective.SMCDTODELETE);
        registerDependency(this.sentMessageDep);
    }

    @objid ("0d4920ca-f9d1-4f74-ae44-17662ac015f8")
    public SmDependency getReceivedMessageDep() {
        if (this.receivedMessageDep == null) {
        	this.receivedMessageDep = this.getDependencyDef("ReceivedMessage");
        }
        return this.receivedMessageDep;
    }

    @objid ("7b2eca10-ee64-46b8-b801-da7ec4bc75ce")
    public SmDependency getSentMessageDep() {
        if (this.sentMessageDep == null) {
        	this.sentMessageDep = this.getDependencyDef("SentMessage");
        }
        return this.sentMessageDep;
    }

    @objid ("9c6557d1-f3a8-45e6-924f-d63f15cee797")
    private static class MessageEndObjectFactory implements ISmObjectFactory {
        @objid ("bde0ffd3-9c2b-4408-8d49-28caf30ba16d")
        private MessageEndSmClass smClass;

        @objid ("d7feb4c6-05cc-48ca-a781-c15eb70db0fe")
        public MessageEndObjectFactory(MessageEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("61b8c5cc-cbfc-4c96-948d-b9225848e27e")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("c44bc6a5-2a18-4fee-a03a-50a74217b9fe")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("0b2ee58a-198a-4924-b607-0408b91a865a")
    public static class ReceivedMessageSmDependency extends SmSingleDependency {
        @objid ("cfa65bba-3d48-4781-8604-21d8500a9d33")
        private SmDependency symetricDep;

        @objid ("1b8bfc7c-5eb0-439f-9028-60ee79053f86")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageEndData) data).mReceivedMessage;
        }

        @objid ("4b9df118-56ae-477a-a6a9-2d348075a3d5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageEndData) data).mReceivedMessage = value;
        }

        @objid ("73661600-78cd-405c-86b4-cbbc5d465b23")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageSmClass)this.getTarget()).getReceiveEventDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ed247a5b-1e8f-4b3a-85e3-c5b943af565a")
    public static class SentMessageSmDependency extends SmSingleDependency {
        @objid ("ea7e9e33-396a-4854-a136-5b0b105969e6")
        private SmDependency symetricDep;

        @objid ("71ccbaa5-b39e-42c2-b504-7fa049efa0e5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageEndData) data).mSentMessage;
        }

        @objid ("684db20b-47a3-41fa-a333-fc6e44470c18")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageEndData) data).mSentMessage = value;
        }

        @objid ("b9167c6a-648b-48b0-8040-9c507e4c1ba5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageSmClass)this.getTarget()).getSendEventDep();
            }
            return this.symetricDep;
        }

    }

}
