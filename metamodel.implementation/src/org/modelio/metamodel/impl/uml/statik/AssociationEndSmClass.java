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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.StructuralFeatureSmClass;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
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

@objid ("b262271d-e4c3-46de-a5e0-480accedf845")
public class AssociationEndSmClass extends StructuralFeatureSmClass {
    @objid ("bd93eeff-6bbd-4e10-ace0-34de3fa23d7c")
    private SmAttribute aggregationAtt;

    @objid ("91988fab-e1d6-4a6b-b95c-2d1720af85ea")
    private SmAttribute isChangeableAtt;

    @objid ("ddfbc03c-a71f-45be-97cd-807faee7d219")
    private SmDependency targetDep;

    @objid ("629652f3-136e-431c-aacd-e55f8076e097")
    private SmDependency oppositeOwnerDep;

    @objid ("9074f217-1d4c-46f1-9ae9-8dc44877d968")
    private SmDependency sourceDep;

    @objid ("3dd27c47-3c07-48c8-a7f1-950f293f6ab1")
    private SmDependency occurenceDep;

    @objid ("816bb35c-947f-46ca-be62-cc1eb0185e8f")
    private SmDependency sentDep;

    @objid ("01213a2a-edc7-419e-b18e-e6694cace251")
    private SmDependency qualifierDep;

    @objid ("ca4e3d61-b118-46c3-ad78-0a5bdcd87938")
    private SmDependency oppositeDep;

    @objid ("d7840d10-50cd-4b5b-ad06-97f94843afc7")
    private SmDependency representingObjectNodeDep;

    @objid ("c51c7c4d-37a1-418b-9f09-13d21a6c8a26")
    private SmDependency associationDep;

    @objid ("fdb000e8-6945-4ef3-ab0e-4317e5b3d954")
    private SmDependency representingItemDep;

    @objid ("befc72bb-6de9-46e9-bd51-0fd0d4262ffa")
    public AssociationEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("548beb95-ba7a-480b-bdf0-641211005ff8")
    @Override
    public String getName() {
        return "AssociationEnd";
    }

    @objid ("f5fa65f8-afb1-4765-a286-05a370ec3703")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("75059ef6-48a8-4b56-aef7-af218bdcffaf")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AssociationEnd.class;
    }

    @objid ("96e08f91-9567-4e60-9bc8-58b565cd27cb")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("dd6d1417-49cd-4c7f-ae35-2c89cd96e6a1")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a9a55d1f-ecf1-4b7d-bfdb-94755e9c5ecf")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuralFeature");
        this.registerFactory(new AssociationEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.aggregationAtt = new AggregationSmAttribute();
        this.aggregationAtt.init("Aggregation", this, AggregationKind.class );
        registerAttribute(this.aggregationAtt);
        
        this.isChangeableAtt = new IsChangeableSmAttribute();
        this.isChangeableAtt.init("IsChangeable", this, Boolean.class );
        registerAttribute(this.isChangeableAtt);
        
        
        // Initialize and register the SmDependency
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("Classifier"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
        
        this.oppositeOwnerDep = new OppositeOwnerSmDependency();
        this.oppositeOwnerDep.init("OppositeOwner", this, metamodel.getMClass("AssociationEnd"), 1, 1 );
        registerDependency(this.oppositeOwnerDep);
        
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("Classifier"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceDep);
        
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("LinkEnd"), 0, -1 );
        registerDependency(this.occurenceDep);
        
        this.sentDep = new SentSmDependency();
        this.sentDep.init("Sent", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.sentDep);
        
        this.qualifierDep = new QualifierSmDependency();
        this.qualifierDep.init("Qualifier", this, metamodel.getMClass("Attribute"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.qualifierDep);
        
        this.oppositeDep = new OppositeSmDependency();
        this.oppositeDep.init("Opposite", this, metamodel.getMClass("AssociationEnd"), 1, 1 , SmDirective.SMCDSHAREDCOMPONENT, SmDirective.SMCDPARTOF);
        registerDependency(this.oppositeDep);
        
        this.representingObjectNodeDep = new RepresentingObjectNodeSmDependency();
        this.representingObjectNodeDep.init("RepresentingObjectNode", this, metamodel.getMClass("ObjectNode"), 0, -1 );
        registerDependency(this.representingObjectNodeDep);
        
        this.associationDep = new AssociationSmDependency();
        this.associationDep.init("Association", this, metamodel.getMClass("Association"), 0, 1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.associationDep);
        
        this.representingItemDep = new RepresentingItemSmDependency();
        this.representingItemDep.init("RepresentingItem", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 );
        registerDependency(this.representingItemDep);
    }

    @objid ("56bc298c-e895-412f-ae6b-60e2d1dad9d4")
    public SmAttribute getAggregationAtt() {
        if (this.aggregationAtt == null) {
        	this.aggregationAtt = this.getAttributeDef("Aggregation");
        }
        return this.aggregationAtt;
    }

    @objid ("53b5f2ea-10cb-44ca-9890-8379966f0502")
    public SmAttribute getIsChangeableAtt() {
        if (this.isChangeableAtt == null) {
        	this.isChangeableAtt = this.getAttributeDef("IsChangeable");
        }
        return this.isChangeableAtt;
    }

    @objid ("5f1f2461-972b-4b2e-8ccc-669cfeb81df3")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("ab2164a5-675f-457f-a1db-8c7528ef43ef")
    public SmDependency getOppositeOwnerDep() {
        if (this.oppositeOwnerDep == null) {
        	this.oppositeOwnerDep = this.getDependencyDef("OppositeOwner");
        }
        return this.oppositeOwnerDep;
    }

    @objid ("639dcca5-4b89-4480-bbc5-fea27cb0cefc")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("b3f812f0-d7a7-478c-bb11-1d9dc8e6cfff")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("523a6b48-55a8-45bc-8bdc-80503b7fb0dd")
    public SmDependency getSentDep() {
        if (this.sentDep == null) {
        	this.sentDep = this.getDependencyDef("Sent");
        }
        return this.sentDep;
    }

    @objid ("4c31abfb-9508-4408-88a7-a2c07cf94db2")
    public SmDependency getQualifierDep() {
        if (this.qualifierDep == null) {
        	this.qualifierDep = this.getDependencyDef("Qualifier");
        }
        return this.qualifierDep;
    }

    @objid ("12d69bb4-02ac-44cc-9b94-2ebf75f4d175")
    public SmDependency getOppositeDep() {
        if (this.oppositeDep == null) {
        	this.oppositeDep = this.getDependencyDef("Opposite");
        }
        return this.oppositeDep;
    }

    @objid ("45043486-b94d-44e9-8595-f3413dba4e7f")
    public SmDependency getRepresentingObjectNodeDep() {
        if (this.representingObjectNodeDep == null) {
        	this.representingObjectNodeDep = this.getDependencyDef("RepresentingObjectNode");
        }
        return this.representingObjectNodeDep;
    }

    @objid ("d0dcdc4b-d178-483e-9294-528473591b25")
    public SmDependency getAssociationDep() {
        if (this.associationDep == null) {
        	this.associationDep = this.getDependencyDef("Association");
        }
        return this.associationDep;
    }

    @objid ("c61a3365-c5f5-438f-87e0-bc06d035e539")
    public SmDependency getRepresentingItemDep() {
        if (this.representingItemDep == null) {
        	this.representingItemDep = this.getDependencyDef("RepresentingItem");
        }
        return this.representingItemDep;
    }

    @objid ("0a0a3537-658d-4075-833a-f7f88ff6ec6a")
    private static class AssociationEndObjectFactory implements ISmObjectFactory {
        @objid ("85701ad0-c478-4e4e-a87d-894112c6dfc0")
        private AssociationEndSmClass smClass;

        @objid ("e93b921c-ad53-492e-860b-683a51e8f965")
        public AssociationEndObjectFactory(AssociationEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3f92cf91-03dc-4d09-9fe8-a2a396b53f58")
        @Override
        public ISmObjectData createData() {
            return new AssociationEndData(this.smClass);
        }

        @objid ("f47fe461-e3a2-41d7-a43f-983765f2f34b")
        @Override
        public SmObjectImpl createImpl() {
            return new AssociationEndImpl();
        }

    }

    @objid ("312f4b33-c67a-45fe-a986-a69686439d73")
    public static class AggregationSmAttribute extends SmAttribute {
        @objid ("fce3b3cc-b351-4263-b43c-52fe9bd19fb1")
        public Object getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mAggregation;
        }

        @objid ("8495417d-80de-470f-971f-6e81e2cd3ea9")
        public void setValue(ISmObjectData data, Object value) {
            ((AssociationEndData) data).mAggregation = value;
        }

    }

    @objid ("cdadf224-b830-42aa-8680-55ba2d833623")
    public static class IsChangeableSmAttribute extends SmAttribute {
        @objid ("259d0786-242f-41f7-878a-b7d8d1041909")
        public Object getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mIsChangeable;
        }

        @objid ("9e8fb826-f858-4799-9183-12322196d278")
        public void setValue(ISmObjectData data, Object value) {
            ((AssociationEndData) data).mIsChangeable = value;
        }

    }

    @objid ("060204a8-8c7d-4304-a033-7b4da360e53a")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("abdecb09-b207-4a23-829a-cd123136a8ba")
        private SmDependency symetricDep;

        @objid ("68837cae-85f2-43c7-b14d-f88d417f238c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mTarget;
        }

        @objid ("f753bbd9-7ebd-4c04-8df8-3baf560fe2d1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationEndData) data).mTarget = value;
        }

        @objid ("0aae3705-1972-4b26-a062-dbb93668d248")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getTargetingEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8e8f04f3-a106-401f-9b35-da988645336c")
    public static class OppositeOwnerSmDependency extends SmSingleDependency {
        @objid ("abeee8a6-e3dc-4a6e-813d-fb4c0322f5c9")
        private SmDependency symetricDep;

        @objid ("c880c05e-d5e1-42ba-84cd-855a61a9c384")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mOppositeOwner;
        }

        @objid ("11883d17-809b-4a01-a7e5-c5dcce3143b3")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationEndData) data).mOppositeOwner = value;
        }

        @objid ("9f2133b6-279e-40fe-bed5-80556c62c74f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getOppositeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("05785f1b-2f04-4ab1-b495-8b0ed56df091")
    public static class SourceSmDependency extends SmSingleDependency {
        @objid ("3a801259-d905-4688-9211-2e9e4d2d86aa")
        private SmDependency symetricDep;

        @objid ("9014d5b7-3f60-4a57-9e1e-8b7613995a55")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mSource;
        }

        @objid ("d98b1400-2597-46e9-8b7c-0ee48a046641")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationEndData) data).mSource = value;
        }

        @objid ("91dbd66e-9bad-401b-8718-b64a65d4794b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getOwnedEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7b9680b2-3c39-4316-adce-4bde110cea5d")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("c288a472-c7f4-4558-8190-b43d82bda2f2")
        private SmDependency symetricDep;

        @objid ("021c1050-0de5-45f2-9fe0-ab5dfea7af67")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationEndData)data).mOccurence != null)? ((AssociationEndData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("a2187b9c-26ba-4201-b807-6d1d33c604a8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationEndData) data).mOccurence = values;
        }

        @objid ("4d80e038-aeed-49a8-9079-64634d865202")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ddaeee06-f240-4cc3-bbd2-aa19035c4349")
    public static class SentSmDependency extends SmMultipleDependency {
        @objid ("fe8784f7-e068-4eaa-a2aa-627aa25f9a03")
        private SmDependency symetricDep;

        @objid ("6aa92e36-fe87-433c-beb3-96bd92c31c5f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationEndData)data).mSent != null)? ((AssociationEndData)data).mSent:SmMultipleDependency.EMPTY;
        }

        @objid ("a8a11f4e-15a6-462c-b5ba-ded271df8bc7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationEndData) data).mSent = values;
        }

        @objid ("f6326c2d-b94c-4724-9db4-08d65ac2453a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getChannelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("40b701c3-b580-4c7f-a26f-0a33968a2e93")
    public static class QualifierSmDependency extends SmMultipleDependency {
        @objid ("1069818d-718f-4c2a-9a80-648836afabc3")
        private SmDependency symetricDep;

        @objid ("07a3aa82-ecdf-442f-83c6-34440da3c8df")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationEndData)data).mQualifier != null)? ((AssociationEndData)data).mQualifier:SmMultipleDependency.EMPTY;
        }

        @objid ("1803bfea-6303-4457-9c4b-d43d5d13a3cb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationEndData) data).mQualifier = values;
        }

        @objid ("7a97d498-0abd-4404-880b-029cd941ef04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeSmClass)this.getTarget()).getQualifiedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4c5be391-64df-4b0e-9e16-66ee68dd29ed")
    public static class OppositeSmDependency extends SmSingleDependency {
        @objid ("be3675da-cdab-4b28-b591-e5bc81f26518")
        private SmDependency symetricDep;

        @objid ("72d24020-9329-43a4-aded-c7990a254445")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mOpposite;
        }

        @objid ("55139019-5f6e-412a-9f5c-47a0011c4000")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationEndData) data).mOpposite = value;
        }

        @objid ("c9a23bf9-fb8f-471f-a90d-18b4c0766671")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getOppositeOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2fd3c05e-b4bf-4166-956d-7f417e0badd1")
    public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
        @objid ("7ecdb1e6-7704-4813-b3ef-db8d74bb1f28")
        private SmDependency symetricDep;

        @objid ("913c4df5-b9d1-4747-b747-ace54356f671")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationEndData)data).mRepresentingObjectNode != null)? ((AssociationEndData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
        }

        @objid ("e63b36cc-a723-410f-9c4c-4d5ed6900ed3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationEndData) data).mRepresentingObjectNode = values;
        }

        @objid ("d73e89e3-bada-46d9-83f2-aad05ca4e2fb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getRepresentedRoleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bfba9c0f-ab83-47b0-8538-5710330f3533")
    public static class AssociationSmDependency extends SmSingleDependency {
        @objid ("b7858b0a-1f63-4874-866b-c78fa5c1983f")
        private SmDependency symetricDep;

        @objid ("55080729-b0bc-4a4f-b045-cbbfe936d511")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationEndData) data).mAssociation;
        }

        @objid ("caab248f-0251-4782-a8a3-911010440098")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationEndData) data).mAssociation = value;
        }

        @objid ("37c70aea-5c7d-40a0-90f3-a035c5a161e0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationSmClass)this.getTarget()).getEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("aaf9b117-09cf-4ad4-bb59-11b1f36ceaf2")
    public static class RepresentingItemSmDependency extends SmMultipleDependency {
        @objid ("a59fffe8-d3d5-4f45-91db-0ff4ac575bd4")
        private SmDependency symetricDep;

        @objid ("e07834a8-1ac9-44ed-b313-200bfc84df74")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationEndData)data).mRepresentingItem != null)? ((AssociationEndData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
        }

        @objid ("243b2790-67ee-4f41-92cf-940fcbfcc7f0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationEndData) data).mRepresentingItem = values;
        }

        @objid ("f4bfc08a-4785-4895-9a8b-cd3c89bd8fbe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getRepresentedAssociationEndDep();
            }
            return this.symetricDep;
        }

    }

}
