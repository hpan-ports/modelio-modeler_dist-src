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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
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

@objid ("38d34116-8316-413f-93d4-e2b72097ff42")
public class CommunicationMessageSmClass extends ModelElementSmClass {
    @objid ("302802d1-65a7-491b-9c01-6679b8e51cf3")
    private SmAttribute argumentAtt;

    @objid ("c1fe8584-6017-4bc3-acbf-ab3d16aeb443")
    private SmAttribute sequenceAtt;

    @objid ("f8a6a3c3-ec42-4e39-9461-19689acafa4e")
    private SmAttribute sortOfMessageAtt;

    @objid ("3b127faa-5bd9-4e55-bd5d-3d58dbd76acf")
    private SmDependency realizedInformationFlowDep;

    @objid ("2dd4b764-1dd6-47a3-ba84-f3c1b02693f9")
    private SmDependency channelDep;

    @objid ("eda3b055-8e6d-47a1-9a9f-be0ab80a3553")
    private SmDependency invertedChannelDep;

    @objid ("c9b3b156-f269-4bac-a01e-e3fa5353e040")
    private SmDependency invokedDep;

    @objid ("0d2c4636-c7e0-4026-80a7-202ab7e8a5ee")
    private SmDependency signalSignatureDep;

    @objid ("decdf5b1-ea1f-4860-8ed6-fc5e6bd6edd4")
    public CommunicationMessageSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("91fcf083-ea28-4db1-8a12-a2dea6a90052")
    @Override
    public String getName() {
        return "CommunicationMessage";
    }

    @objid ("c82dd08e-6baa-4f58-9971-a12f03a46feb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7ff63a36-510e-440e-9ea3-c04a253c52e5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CommunicationMessage.class;
    }

    @objid ("b058499c-6ab5-410e-a20a-2874229a3e9c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("e599a273-a0be-4b6b-8878-141f14154fad")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("be87cc28-1662-40bb-94f7-e3472cb501cf")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new CommunicationMessageObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.argumentAtt = new ArgumentSmAttribute();
        this.argumentAtt.init("Argument", this, String.class );
        registerAttribute(this.argumentAtt);
        
        this.sequenceAtt = new SequenceSmAttribute();
        this.sequenceAtt.init("Sequence", this, String.class );
        registerAttribute(this.sequenceAtt);
        
        this.sortOfMessageAtt = new SortOfMessageSmAttribute();
        this.sortOfMessageAtt.init("SortOfMessage", this, MessageSort.class );
        registerAttribute(this.sortOfMessageAtt);
        
        
        // Initialize and register the SmDependency
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
        
        this.channelDep = new ChannelSmDependency();
        this.channelDep.init("Channel", this, metamodel.getMClass("CommunicationChannel"), 0, 1 );
        registerDependency(this.channelDep);
        
        this.invertedChannelDep = new InvertedChannelSmDependency();
        this.invertedChannelDep.init("InvertedChannel", this, metamodel.getMClass("CommunicationChannel"), 0, 1 );
        registerDependency(this.invertedChannelDep);
        
        this.invokedDep = new InvokedSmDependency();
        this.invokedDep.init("Invoked", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.invokedDep);
        
        this.signalSignatureDep = new SignalSignatureSmDependency();
        this.signalSignatureDep.init("SignalSignature", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.signalSignatureDep);
    }

    @objid ("f7eb2965-453d-4da7-9ae1-c2e5515db04b")
    public SmAttribute getArgumentAtt() {
        if (this.argumentAtt == null) {
        	this.argumentAtt = this.getAttributeDef("Argument");
        }
        return this.argumentAtt;
    }

    @objid ("c8483571-80a6-4a4c-a6df-c3d7eb5c1551")
    public SmAttribute getSequenceAtt() {
        if (this.sequenceAtt == null) {
        	this.sequenceAtt = this.getAttributeDef("Sequence");
        }
        return this.sequenceAtt;
    }

    @objid ("77f36554-9bbf-4b95-9cbc-5dd27c1d348b")
    public SmAttribute getSortOfMessageAtt() {
        if (this.sortOfMessageAtt == null) {
        	this.sortOfMessageAtt = this.getAttributeDef("SortOfMessage");
        }
        return this.sortOfMessageAtt;
    }

    @objid ("2c0679d1-f4d6-431d-83cc-e8bd38f46a11")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("0cb78529-6a90-47d7-b507-8d13828fe3ba")
    public SmDependency getChannelDep() {
        if (this.channelDep == null) {
        	this.channelDep = this.getDependencyDef("Channel");
        }
        return this.channelDep;
    }

    @objid ("63da46d3-3101-4313-b0e8-44805db28515")
    public SmDependency getInvertedChannelDep() {
        if (this.invertedChannelDep == null) {
        	this.invertedChannelDep = this.getDependencyDef("InvertedChannel");
        }
        return this.invertedChannelDep;
    }

    @objid ("99e0dc3a-db01-4ab3-8a68-ee0320b4f5ba")
    public SmDependency getInvokedDep() {
        if (this.invokedDep == null) {
        	this.invokedDep = this.getDependencyDef("Invoked");
        }
        return this.invokedDep;
    }

    @objid ("1df2915f-ac66-4d4f-a174-424cdc8b4e52")
    public SmDependency getSignalSignatureDep() {
        if (this.signalSignatureDep == null) {
        	this.signalSignatureDep = this.getDependencyDef("SignalSignature");
        }
        return this.signalSignatureDep;
    }

    @objid ("d2a03555-9bdd-495c-938a-79c10eacb3cb")
    private static class CommunicationMessageObjectFactory implements ISmObjectFactory {
        @objid ("e3988a55-2dc2-4922-aa23-880ef5be4770")
        private CommunicationMessageSmClass smClass;

        @objid ("8bf2c102-0394-4825-8a17-152f7b886cc4")
        public CommunicationMessageObjectFactory(CommunicationMessageSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("431f3fcb-6185-4e75-a0b3-6d082f7e1fae")
        @Override
        public ISmObjectData createData() {
            return new CommunicationMessageData(this.smClass);
        }

        @objid ("eee9bf1f-6822-42ca-992f-7c8c81a5c0e9")
        @Override
        public SmObjectImpl createImpl() {
            return new CommunicationMessageImpl();
        }

    }

    @objid ("18f09c62-379f-4816-8a84-8ad7ef6944c8")
    public static class ArgumentSmAttribute extends SmAttribute {
        @objid ("6e8ff992-2944-41a2-9226-1c229e743eab")
        public Object getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mArgument;
        }

        @objid ("ce2b3b7f-49ab-4d9b-ae60-89d41e19c62c")
        public void setValue(ISmObjectData data, Object value) {
            ((CommunicationMessageData) data).mArgument = value;
        }

    }

    @objid ("87d19091-88bf-453e-9845-ba1b4e96bd7d")
    public static class SequenceSmAttribute extends SmAttribute {
        @objid ("cccc3c86-e886-4016-b513-9b3aaf038351")
        public Object getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mSequence;
        }

        @objid ("9b2f34cc-67bb-44c5-8739-ef84e13ad35e")
        public void setValue(ISmObjectData data, Object value) {
            ((CommunicationMessageData) data).mSequence = value;
        }

    }

    @objid ("f765e2cf-cf89-45ce-8111-bef6739cfb09")
    public static class SortOfMessageSmAttribute extends SmAttribute {
        @objid ("8f0ea311-167f-4358-bd60-af37be27b9d9")
        public Object getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mSortOfMessage;
        }

        @objid ("ee1b3991-61e2-40d4-82a5-dc95ad6a5e28")
        public void setValue(ISmObjectData data, Object value) {
            ((CommunicationMessageData) data).mSortOfMessage = value;
        }

    }

    @objid ("83d064f4-99aa-4d99-8248-f4f34e4e0e1c")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("a563a81c-186e-48fc-848a-8d5590543bbb")
        private SmDependency symetricDep;

        @objid ("4f9bab6c-4520-4868-a0b8-a4a5ac657eeb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CommunicationMessageData)data).mRealizedInformationFlow != null)? ((CommunicationMessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("5e530e83-f60b-4a9f-b99d-75fcfd7619d6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CommunicationMessageData) data).mRealizedInformationFlow = values;
        }

        @objid ("b99c0d5d-d2c9-4759-953d-f639a1f18d19")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingCommunicationMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("af795299-b647-46cf-91f2-f030afacbac7")
    public static class ChannelSmDependency extends SmSingleDependency {
        @objid ("7dfcba4a-c923-479c-a5b9-4580c2f6c562")
        private SmDependency symetricDep;

        @objid ("62813951-97c6-4a43-985f-bcb9fe6c7fee")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mChannel;
        }

        @objid ("303353cf-f0a9-4c56-90de-e92a548bf64f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationMessageData) data).mChannel = value;
        }

        @objid ("9feaebfe-6fb1-4b0e-91ac-61ab034e79c0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getStartToEndMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("57ebf940-9526-45e9-a3ba-f784989f7c69")
    public static class InvertedChannelSmDependency extends SmSingleDependency {
        @objid ("5fcac092-263b-452b-9ada-4117826e4c3d")
        private SmDependency symetricDep;

        @objid ("fad5becb-3938-4fa7-8feb-c82171de9f1d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mInvertedChannel;
        }

        @objid ("ff3ef78d-9f19-48dc-bcb4-133475428447")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationMessageData) data).mInvertedChannel = value;
        }

        @objid ("33889bef-ae75-4730-b386-89af6446affa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getEndToStartMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0c010f80-cec5-4b59-9d0c-b0789e453bc9")
    public static class InvokedSmDependency extends SmSingleDependency {
        @objid ("4e23352d-bb2a-463f-9b95-e3546905856c")
        private SmDependency symetricDep;

        @objid ("eba242e2-5464-4753-8b69-7d7d3992e5fa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mInvoked;
        }

        @objid ("cb272c00-0487-4599-81a6-5328014fc97c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationMessageData) data).mInvoked = value;
        }

        @objid ("4162cef3-ea09-4eac-9b94-fd1914e4f06f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCommunicationUsageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bc2ab95e-fae4-4b5b-ab8e-d2e8255dba7f")
    public static class SignalSignatureSmDependency extends SmSingleDependency {
        @objid ("c304236f-bb81-4c0f-816c-98ed1887f047")
        private SmDependency symetricDep;

        @objid ("cad158c7-5c33-422d-8db7-db8f319e3fba")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CommunicationMessageData) data).mSignalSignature;
        }

        @objid ("fc5346de-27a5-4fbb-9fd2-8c522642093d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CommunicationMessageData) data).mSignalSignature = value;
        }

        @objid ("02738531-7af5-40de-bcd8-db7dd9f9e1de")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getCommunicationUsageDep();
            }
            return this.symetricDep;
        }

    }

}
