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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkSmClass;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureSmClass;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
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

@objid ("9a08c956-ddd8-4831-b050-a8b0220aff38")
public class InformationFlowSmClass extends ModelElementSmClass {
    @objid ("0e5df200-ad45-46ce-a843-9e2561b9e2b8")
    private SmDependency ownerDep;

    @objid ("8809c681-346a-45d9-8c65-87eb77600d6c")
    private SmDependency informationSourceDep;

    @objid ("6820ae53-e156-48a1-a786-be2a748ba52f")
    private SmDependency informationTargetDep;

    @objid ("b87dea47-b479-4bcf-ad67-0aa6958ba170")
    private SmDependency realizingActivityEdgeDep;

    @objid ("b13c5ca4-f519-40c9-8242-00704a735a80")
    private SmDependency realizingCommunicationMessageDep;

    @objid ("82fa1929-5539-40af-9d63-3472f56094a6")
    private SmDependency realizingFeatureDep;

    @objid ("46ffc796-e8f5-4c4e-a41f-20ca6e2f0af1")
    private SmDependency realizingLinkDep;

    @objid ("842e09b2-b0d2-4fba-9c74-8293839508b7")
    private SmDependency realizingMessageDep;

    @objid ("a332456d-9703-4785-9587-94c7f038ac52")
    private SmDependency realizingNaryLinkDep;

    @objid ("e297eebb-0d40-47cb-8697-6f649b0c8074")
    private SmDependency conveyedDep;

    @objid ("d2239b5f-fabe-4597-8bed-b85dd2166ae0")
    private SmDependency channelDep;

    @objid ("bab02534-8f71-49be-b056-362377060ac5")
    public InformationFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a77d2032-90cc-4a5a-adee-8b0f2112c641")
    @Override
    public String getName() {
        return "InformationFlow";
    }

    @objid ("7ba34775-7d61-421f-998f-3ebe6db88afe")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("99de9907-cf7f-412c-a082-a7105268f5df")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InformationFlow.class;
    }

    @objid ("48aa7f00-3434-41d9-a298-e6948c852d0b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("dc558cd3-f41f-40fe-957d-c877aedd0c64")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("30e60689-f848-48c8-964e-62793c3637fe")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new InformationFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.informationSourceDep = new InformationSourceSmDependency();
        this.informationSourceDep.init("InformationSource", this, metamodel.getMClass("ModelElement"), 1, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.informationSourceDep);
        
        this.informationTargetDep = new InformationTargetSmDependency();
        this.informationTargetDep.init("InformationTarget", this, metamodel.getMClass("ModelElement"), 1, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.informationTargetDep);
        
        this.realizingActivityEdgeDep = new RealizingActivityEdgeSmDependency();
        this.realizingActivityEdgeDep.init("RealizingActivityEdge", this, metamodel.getMClass("ActivityEdge"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingActivityEdgeDep);
        
        this.realizingCommunicationMessageDep = new RealizingCommunicationMessageSmDependency();
        this.realizingCommunicationMessageDep.init("RealizingCommunicationMessage", this, metamodel.getMClass("CommunicationMessage"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingCommunicationMessageDep);
        
        this.realizingFeatureDep = new RealizingFeatureSmDependency();
        this.realizingFeatureDep.init("RealizingFeature", this, metamodel.getMClass("StructuralFeature"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingFeatureDep);
        
        this.realizingLinkDep = new RealizingLinkSmDependency();
        this.realizingLinkDep.init("RealizingLink", this, metamodel.getMClass("LinkEnd"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingLinkDep);
        
        this.realizingMessageDep = new RealizingMessageSmDependency();
        this.realizingMessageDep.init("RealizingMessage", this, metamodel.getMClass("Message"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingMessageDep);
        
        this.realizingNaryLinkDep = new RealizingNaryLinkSmDependency();
        this.realizingNaryLinkDep.init("RealizingNaryLink", this, metamodel.getMClass("NaryLink"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.realizingNaryLinkDep);
        
        this.conveyedDep = new ConveyedSmDependency();
        this.conveyedDep.init("Conveyed", this, metamodel.getMClass("Classifier"), 1, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.conveyedDep);
        
        this.channelDep = new ChannelSmDependency();
        this.channelDep.init("Channel", this, metamodel.getMClass("AssociationEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.channelDep);
    }

    @objid ("7ac60ea1-9f6a-40b3-b155-def9f9499d56")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("1d197c90-2b7a-48e0-a966-ff4bccf68056")
    public SmDependency getInformationSourceDep() {
        if (this.informationSourceDep == null) {
        	this.informationSourceDep = this.getDependencyDef("InformationSource");
        }
        return this.informationSourceDep;
    }

    @objid ("5d8db081-dd5e-4bd2-899d-de47c1350aaf")
    public SmDependency getInformationTargetDep() {
        if (this.informationTargetDep == null) {
        	this.informationTargetDep = this.getDependencyDef("InformationTarget");
        }
        return this.informationTargetDep;
    }

    @objid ("02798e49-b804-44af-b0c9-99f1255342fe")
    public SmDependency getRealizingActivityEdgeDep() {
        if (this.realizingActivityEdgeDep == null) {
        	this.realizingActivityEdgeDep = this.getDependencyDef("RealizingActivityEdge");
        }
        return this.realizingActivityEdgeDep;
    }

    @objid ("632464b8-ffa1-44a6-8b63-2b6f68b0709e")
    public SmDependency getRealizingCommunicationMessageDep() {
        if (this.realizingCommunicationMessageDep == null) {
        	this.realizingCommunicationMessageDep = this.getDependencyDef("RealizingCommunicationMessage");
        }
        return this.realizingCommunicationMessageDep;
    }

    @objid ("47cd6368-f91e-467b-b9fb-cdc003a6bb1f")
    public SmDependency getRealizingFeatureDep() {
        if (this.realizingFeatureDep == null) {
        	this.realizingFeatureDep = this.getDependencyDef("RealizingFeature");
        }
        return this.realizingFeatureDep;
    }

    @objid ("945981c6-eb4c-4ab5-b925-d7128e2423e3")
    public SmDependency getRealizingLinkDep() {
        if (this.realizingLinkDep == null) {
        	this.realizingLinkDep = this.getDependencyDef("RealizingLink");
        }
        return this.realizingLinkDep;
    }

    @objid ("c0bdc06e-58e9-4cb6-83d6-0405b91ab3c3")
    public SmDependency getRealizingMessageDep() {
        if (this.realizingMessageDep == null) {
        	this.realizingMessageDep = this.getDependencyDef("RealizingMessage");
        }
        return this.realizingMessageDep;
    }

    @objid ("a59c0770-3dfd-49af-9a18-36d2d7fba14d")
    public SmDependency getRealizingNaryLinkDep() {
        if (this.realizingNaryLinkDep == null) {
        	this.realizingNaryLinkDep = this.getDependencyDef("RealizingNaryLink");
        }
        return this.realizingNaryLinkDep;
    }

    @objid ("e5bc1e4c-fbb1-4cdf-b1cf-23846fa82e89")
    public SmDependency getConveyedDep() {
        if (this.conveyedDep == null) {
        	this.conveyedDep = this.getDependencyDef("Conveyed");
        }
        return this.conveyedDep;
    }

    @objid ("b2886392-ed7f-4287-bea4-2afbaa1abf46")
    public SmDependency getChannelDep() {
        if (this.channelDep == null) {
        	this.channelDep = this.getDependencyDef("Channel");
        }
        return this.channelDep;
    }

    @objid ("d5c20516-31d5-42ab-8a63-44c6957cda0a")
    private static class InformationFlowObjectFactory implements ISmObjectFactory {
        @objid ("ab7f63e4-1598-4c6f-a6a6-ce2ff9b5b39f")
        private InformationFlowSmClass smClass;

        @objid ("4cf635c7-b55a-4f67-b650-05f506e4f8aa")
        public InformationFlowObjectFactory(InformationFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b84a8b69-0975-4437-ae53-30a6e9f164a5")
        @Override
        public ISmObjectData createData() {
            return new InformationFlowData(this.smClass);
        }

        @objid ("7e29001d-997e-44ae-b04e-e4b08d69aaa7")
        @Override
        public SmObjectImpl createImpl() {
            return new InformationFlowImpl();
        }

    }

    @objid ("b49b1421-dec6-499e-b2bf-99d63da9e559")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("ce82d2f5-8295-458e-8a20-aaa6c0a810ac")
        private SmDependency symetricDep;

        @objid ("e69cf2cc-e21a-4e97-a780-0e2beba9ffc2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InformationFlowData) data).mOwner;
        }

        @objid ("213e320e-d0d8-41ee-8963-cd23e3fe39c1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InformationFlowData) data).mOwner = value;
        }

        @objid ("cb6d887e-1931-4a00-bb47-01401cf6d0be")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("28ab7406-8895-49fb-beeb-9e971b3110e7")
    public static class InformationSourceSmDependency extends SmMultipleDependency {
        @objid ("7ff4c5f0-f4f8-42d3-bb77-138bbea1ee19")
        private SmDependency symetricDep;

        @objid ("dd860100-af1d-43db-ad27-d773a7f90921")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mInformationSource != null)? ((InformationFlowData)data).mInformationSource:SmMultipleDependency.EMPTY;
        }

        @objid ("11080557-584d-4756-a5ba-d00e8a020cd6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mInformationSource = values;
        }

        @objid ("1fae1ebb-965b-4aee-abbb-7b2fca0bf199")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getSentInfoDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ed3ce5b8-9bb0-4cb7-95ed-92993a823f31")
    public static class InformationTargetSmDependency extends SmMultipleDependency {
        @objid ("a4cab252-6047-430b-a612-8a8015aec0d9")
        private SmDependency symetricDep;

        @objid ("2f9ab9e3-18b6-4ea6-aea9-5c988d236fcc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mInformationTarget != null)? ((InformationFlowData)data).mInformationTarget:SmMultipleDependency.EMPTY;
        }

        @objid ("3279d9e7-c47f-49f5-96ba-3cc7ff745687")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mInformationTarget = values;
        }

        @objid ("1a198c52-27d8-45e0-90f0-933c27578233")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getReceivedInfoDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f4c20cfa-42f0-4dc1-9b5a-de32d5e4ba22")
    public static class RealizingActivityEdgeSmDependency extends SmMultipleDependency {
        @objid ("2308ec04-3366-4523-8f3f-33eb59438129")
        private SmDependency symetricDep;

        @objid ("bbd6e750-89a8-4c51-8511-73603f017050")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingActivityEdge != null)? ((InformationFlowData)data).mRealizingActivityEdge:SmMultipleDependency.EMPTY;
        }

        @objid ("4d9e7372-6e41-4d08-900b-fdb42669b2cb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingActivityEdge = values;
        }

        @objid ("ac1890be-f817-4bdd-b433-c40e74c2e6bb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityEdgeSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("08d58bf0-928c-4a5b-a7fc-d99d847c2e09")
    public static class RealizingCommunicationMessageSmDependency extends SmMultipleDependency {
        @objid ("0eeec37f-af58-4e98-9b80-ca56e292794a")
        private SmDependency symetricDep;

        @objid ("b63f0171-1ca2-45bf-93ac-353c556d3fcd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingCommunicationMessage != null)? ((InformationFlowData)data).mRealizingCommunicationMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("24b79f1d-dc32-404b-8cce-55bbdc41709c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingCommunicationMessage = values;
        }

        @objid ("2d3085b0-966f-4ec1-b492-9fc6c5128b37")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationMessageSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("93617998-0531-432e-8e43-376c374b41ee")
    public static class RealizingFeatureSmDependency extends SmMultipleDependency {
        @objid ("7dd27e22-533e-48ad-bcab-1ef9b9d3efbd")
        private SmDependency symetricDep;

        @objid ("a89ec2d1-5aa8-412e-b3dc-54afd6d1d387")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingFeature != null)? ((InformationFlowData)data).mRealizingFeature:SmMultipleDependency.EMPTY;
        }

        @objid ("50efe20b-44ae-4cff-add0-c7751aae9f13")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingFeature = values;
        }

        @objid ("84c37f03-1954-496e-a61b-aa45b6bae95f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StructuralFeatureSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4b577695-751f-4849-9e09-ad59c91fae84")
    public static class RealizingLinkSmDependency extends SmMultipleDependency {
        @objid ("728ed8ae-763c-481b-a1a0-f5a5f8c0a5f2")
        private SmDependency symetricDep;

        @objid ("9aeb5b97-4d84-4b68-b19c-89832412aa37")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingLink != null)? ((InformationFlowData)data).mRealizingLink:SmMultipleDependency.EMPTY;
        }

        @objid ("8e8027d5-21bb-40fe-a0a0-aa3a0eee3eab")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingLink = values;
        }

        @objid ("8aae562a-c160-4729-bc1d-a2ca649aa4fe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1ebc2284-8de0-478a-9165-81e6c65f0015")
    public static class RealizingMessageSmDependency extends SmMultipleDependency {
        @objid ("6b1ac95e-52a0-49d5-93b2-31a27e396425")
        private SmDependency symetricDep;

        @objid ("fb265315-07fc-4b6f-a743-27ae2935d339")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingMessage != null)? ((InformationFlowData)data).mRealizingMessage:SmMultipleDependency.EMPTY;
        }

        @objid ("30eac36a-d6f2-49f0-b4a7-70f7618bdef8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingMessage = values;
        }

        @objid ("8bc6e291-7258-44cf-aaf1-43e4c67cb165")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7fc39b29-b726-403f-baa9-9c77a649b4cf")
    public static class RealizingNaryLinkSmDependency extends SmMultipleDependency {
        @objid ("da4ac4bf-0247-42ea-b7b8-b2935fc82213")
        private SmDependency symetricDep;

        @objid ("2d32b3e2-7e2d-4840-9d44-2d28fb2a2e9f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mRealizingNaryLink != null)? ((InformationFlowData)data).mRealizingNaryLink:SmMultipleDependency.EMPTY;
        }

        @objid ("b516a2d6-f360-4cbf-a338-8b821372c0d3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mRealizingNaryLink = values;
        }

        @objid ("ab862faf-3919-4d21-bf27-895423026147")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkSmClass)this.getTarget()).getRealizedInformationFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d1667431-f57c-4320-9756-9f68982d2778")
    public static class ConveyedSmDependency extends SmMultipleDependency {
        @objid ("f8e09442-5344-4b95-87e7-b3652e7c7ce6")
        private SmDependency symetricDep;

        @objid ("92e36538-35dd-4a61-9b33-0e275020fc51")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InformationFlowData)data).mConveyed != null)? ((InformationFlowData)data).mConveyed:SmMultipleDependency.EMPTY;
        }

        @objid ("070ee4e1-1e9d-40b6-a2da-115debe7383a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InformationFlowData) data).mConveyed = values;
        }

        @objid ("84299699-ac0a-4ef1-8646-7044e8b9c0c3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getConveyerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("72942074-320e-472a-945c-15398e2a38ed")
    public static class ChannelSmDependency extends SmSingleDependency {
        @objid ("90605f77-cd1a-46ff-9356-5f0b745ccbc1")
        private SmDependency symetricDep;

        @objid ("7abc9779-00a3-4c31-98f5-7ef9b63f7d90")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InformationFlowData) data).mChannel;
        }

        @objid ("6f726ec2-5264-4cc7-aa3b-bd6fa05acaa4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InformationFlowData) data).mChannel = value;
        }

        @objid ("1a430538-36ae-4ae4-86e7-45222493d688")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getSentDep();
            }
            return this.symetricDep;
        }

    }

}
