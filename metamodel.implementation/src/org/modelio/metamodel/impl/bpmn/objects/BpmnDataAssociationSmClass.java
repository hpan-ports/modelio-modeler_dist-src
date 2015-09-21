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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnSequenceFlowDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
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

@objid ("60a0168a-f7a2-4200-952d-c4446d0864aa")
public class BpmnDataAssociationSmClass extends BpmnBaseElementSmClass {
    @objid ("0c9791c2-3393-4dcb-94f4-2f105d5abf1f")
    private SmAttribute assignmentAtt;

    @objid ("6a2414ec-2a00-48c8-998d-7f3e3e2b6adc")
    private SmAttribute transfomationAtt;

    @objid ("33cfb1c4-51a0-4be3-8c20-24504dd58041")
    private SmAttribute languageAtt;

    @objid ("9eaef084-2eb3-4e8a-b787-061a94817dac")
    private SmDependency sourceRefDep;

    @objid ("17782301-0c3c-4fda-81c4-31e7b4d9d17a")
    private SmDependency targetRefDep;

    @objid ("556f160f-a5fc-4bd9-ac34-b1d42515e69a")
    private SmDependency endingActivityDep;

    @objid ("5905a8fa-d398-4b30-8009-30e5a52ebd72")
    private SmDependency startingActivityDep;

    @objid ("28b326fe-bf90-43d7-bd1c-5e4c51e5e05d")
    private SmDependency startingEventDep;

    @objid ("4a3cd5cb-b8d4-4354-beba-050a9b7cc0f6")
    private SmDependency visualShortCutDep;

    @objid ("8f013f7b-c047-487b-be44-bf312679a88a")
    private SmDependency endingEventDep;

    @objid ("0bae7e6a-337a-48f1-b82c-e2cd282d15bf")
    public BpmnDataAssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9ff98de4-8d8b-44c7-8c5a-73d13185fdb8")
    @Override
    public String getName() {
        return "BpmnDataAssociation";
    }

    @objid ("b0ca3976-a9b7-4957-8bae-d9fec31e59c4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2a0bc95c-3bcd-4b3a-97e7-1553613478ea")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataAssociation.class;
    }

    @objid ("e988a638-e092-42b8-ad4e-6fc80e2128bd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("518e85fa-d733-4656-b71c-546cfd00d828")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("159fa234-ee8d-4591-8f93-ce96552d8d98")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnDataAssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.assignmentAtt = new AssignmentSmAttribute();
        this.assignmentAtt.init("Assignment", this, String.class );
        registerAttribute(this.assignmentAtt);
        
        this.transfomationAtt = new TransfomationSmAttribute();
        this.transfomationAtt.init("Transfomation", this, String.class );
        registerAttribute(this.transfomationAtt);
        
        this.languageAtt = new LanguageSmAttribute();
        this.languageAtt.init("Language", this, String.class );
        registerAttribute(this.languageAtt);
        
        
        // Initialize and register the SmDependency
        this.sourceRefDep = new SourceRefSmDependency();
        this.sourceRefDep.init("SourceRef", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceRefDep);
        
        this.targetRefDep = new TargetRefSmDependency();
        this.targetRefDep.init("TargetRef", this, metamodel.getMClass("BpmnItemAwareElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetRefDep);
        
        this.endingActivityDep = new EndingActivitySmDependency();
        this.endingActivityDep.init("EndingActivity", this, metamodel.getMClass("BpmnActivity"), 0, 1 );
        registerDependency(this.endingActivityDep);
        
        this.startingActivityDep = new StartingActivitySmDependency();
        this.startingActivityDep.init("StartingActivity", this, metamodel.getMClass("BpmnActivity"), 0, 1 );
        registerDependency(this.startingActivityDep);
        
        this.startingEventDep = new StartingEventSmDependency();
        this.startingEventDep.init("StartingEvent", this, metamodel.getMClass("BpmnThrowEvent"), 0, 1 );
        registerDependency(this.startingEventDep);
        
        this.visualShortCutDep = new VisualShortCutSmDependency();
        this.visualShortCutDep.init("VisualShortCut", this, metamodel.getMClass("BpmnSequenceFlowDataAssociation"), 0, -1 );
        registerDependency(this.visualShortCutDep);
        
        this.endingEventDep = new EndingEventSmDependency();
        this.endingEventDep.init("EndingEvent", this, metamodel.getMClass("BpmnCatchEvent"), 0, 1 );
        registerDependency(this.endingEventDep);
    }

    @objid ("9601cd7c-bab7-4523-98e4-cd44694df530")
    public SmAttribute getAssignmentAtt() {
        if (this.assignmentAtt == null) {
        	this.assignmentAtt = this.getAttributeDef("Assignment");
        }
        return this.assignmentAtt;
    }

    @objid ("0472b474-783f-4abe-84c2-c64274fe7cb0")
    public SmAttribute getTransfomationAtt() {
        if (this.transfomationAtt == null) {
        	this.transfomationAtt = this.getAttributeDef("Transfomation");
        }
        return this.transfomationAtt;
    }

    @objid ("524dfcc1-fbaa-4d5b-a642-ecfa7c43c8b8")
    public SmAttribute getLanguageAtt() {
        if (this.languageAtt == null) {
        	this.languageAtt = this.getAttributeDef("Language");
        }
        return this.languageAtt;
    }

    @objid ("a547f02d-959f-4ca2-abd2-a43162e568ae")
    public SmDependency getSourceRefDep() {
        if (this.sourceRefDep == null) {
        	this.sourceRefDep = this.getDependencyDef("SourceRef");
        }
        return this.sourceRefDep;
    }

    @objid ("a3210d3a-4105-4352-9702-19d76d626af5")
    public SmDependency getTargetRefDep() {
        if (this.targetRefDep == null) {
        	this.targetRefDep = this.getDependencyDef("TargetRef");
        }
        return this.targetRefDep;
    }

    @objid ("f5b24f9b-36ac-4da0-83a0-d1638b824375")
    public SmDependency getEndingActivityDep() {
        if (this.endingActivityDep == null) {
        	this.endingActivityDep = this.getDependencyDef("EndingActivity");
        }
        return this.endingActivityDep;
    }

    @objid ("4e8cab35-95b6-4fca-b53e-3ecd1198b7c6")
    public SmDependency getStartingActivityDep() {
        if (this.startingActivityDep == null) {
        	this.startingActivityDep = this.getDependencyDef("StartingActivity");
        }
        return this.startingActivityDep;
    }

    @objid ("e6ef1dc8-986a-48a3-b40c-1fc28afe4b4e")
    public SmDependency getStartingEventDep() {
        if (this.startingEventDep == null) {
        	this.startingEventDep = this.getDependencyDef("StartingEvent");
        }
        return this.startingEventDep;
    }

    @objid ("e842e3fd-5308-40a6-96b3-269ffeff536c")
    public SmDependency getVisualShortCutDep() {
        if (this.visualShortCutDep == null) {
        	this.visualShortCutDep = this.getDependencyDef("VisualShortCut");
        }
        return this.visualShortCutDep;
    }

    @objid ("68944fc6-dd8b-4a5e-8846-dae3f7845a69")
    public SmDependency getEndingEventDep() {
        if (this.endingEventDep == null) {
        	this.endingEventDep = this.getDependencyDef("EndingEvent");
        }
        return this.endingEventDep;
    }

    @objid ("9a90d6a1-d054-44df-846f-bb4ba6eb9e18")
    private static class BpmnDataAssociationObjectFactory implements ISmObjectFactory {
        @objid ("5805f603-e57d-4a37-96e3-29d588151197")
        private BpmnDataAssociationSmClass smClass;

        @objid ("6fe40e04-0408-4c8d-b16f-dcdf12ec0824")
        public BpmnDataAssociationObjectFactory(BpmnDataAssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ee9686a9-6196-4e0b-87e8-ebf907270f18")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataAssociationData(this.smClass);
        }

        @objid ("4b99668f-8741-4e84-a15e-a46c4eb31436")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataAssociationImpl();
        }

    }

    @objid ("b5ed45ca-80b6-4473-8301-492488179a8b")
    public static class AssignmentSmAttribute extends SmAttribute {
        @objid ("e082f5fb-6634-4c80-8e9a-ebbe93f104be")
        public Object getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mAssignment;
        }

        @objid ("5b80e074-91c6-488a-95fe-d75b6d5e851d")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnDataAssociationData) data).mAssignment = value;
        }

    }

    @objid ("939a22ca-b65d-4404-917c-f36e1b86dac2")
    public static class TransfomationSmAttribute extends SmAttribute {
        @objid ("63bfa2e5-b4df-47d9-9e56-6c06f0ba5b8e")
        public Object getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mTransfomation;
        }

        @objid ("00a2eae7-1681-41d4-a7ab-0c71958414f3")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnDataAssociationData) data).mTransfomation = value;
        }

    }

    @objid ("af553fc5-9ab3-4f08-b365-3f96cef49634")
    public static class LanguageSmAttribute extends SmAttribute {
        @objid ("da230036-66bf-47b9-9c4d-053bf6d024d5")
        public Object getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mLanguage;
        }

        @objid ("03ea1c65-3a44-45a3-b71a-cf72656fbf6c")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnDataAssociationData) data).mLanguage = value;
        }

    }

    @objid ("1112100b-23a8-468f-b311-b88c2c0b81b4")
    public static class SourceRefSmDependency extends SmMultipleDependency {
        @objid ("b5360042-5e14-41fd-8aac-bdaf482b2748")
        private SmDependency symetricDep;

        @objid ("efdfe5ac-f820-4ac0-b165-3fd01adcad6b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnDataAssociationData)data).mSourceRef != null)? ((BpmnDataAssociationData)data).mSourceRef:SmMultipleDependency.EMPTY;
        }

        @objid ("0a30843e-ec93-4c3e-affd-4d761b39f2f1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnDataAssociationData) data).mSourceRef = values;
        }

        @objid ("fd434df4-4be9-419e-9cc1-84a9de4c4b49")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getSourceOfDataAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9f54cc3e-f6cc-4302-b4d9-2aa00b78f13b")
    public static class TargetRefSmDependency extends SmSingleDependency {
        @objid ("bfdcca3b-d735-42f1-ab75-74963a261dd6")
        private SmDependency symetricDep;

        @objid ("46475430-b6b7-4e55-8cfc-fe0f710f4f67")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mTargetRef;
        }

        @objid ("1e1f5f1d-6776-4c11-b2f1-f986552294dd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataAssociationData) data).mTargetRef = value;
        }

        @objid ("488bf785-cc2e-48c4-9d61-f23353bf716c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getTargetOfDataAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("85a01478-694c-4c0d-aa7a-afefa7055c5b")
    public static class EndingActivitySmDependency extends SmSingleDependency {
        @objid ("f306db6c-d1da-4302-b798-1e90f7b8785a")
        private SmDependency symetricDep;

        @objid ("522214b2-4a5b-49b8-ba48-37e48ff5a5ce")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mEndingActivity;
        }

        @objid ("1af95fff-3265-4924-997d-5076effb6274")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataAssociationData) data).mEndingActivity = value;
        }

        @objid ("78961abf-5df9-4472-96a6-4a3b7847f194")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getDataOutputAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d618c321-53b5-4e5e-8024-886858180cad")
    public static class StartingActivitySmDependency extends SmSingleDependency {
        @objid ("01165155-2849-4729-9b98-14066beb12c9")
        private SmDependency symetricDep;

        @objid ("7f855178-6bb0-485f-9b08-b3b510a8b79d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mStartingActivity;
        }

        @objid ("524c92e7-48e7-4fb7-89da-af6eac360ebb")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataAssociationData) data).mStartingActivity = value;
        }

        @objid ("e3cea970-0a67-4fd0-84a1-875c18e4e0d0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getDataInputAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0ff07f22-5ec8-405f-9bf4-1e456fb94027")
    public static class StartingEventSmDependency extends SmSingleDependency {
        @objid ("5c684ac5-c85b-4140-9a23-74b7c7e59830")
        private SmDependency symetricDep;

        @objid ("dc5c00d5-5f93-4d3e-b463-c6895f0e0269")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mStartingEvent;
        }

        @objid ("9a490503-129e-4677-84ad-fdbeb570bc43")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataAssociationData) data).mStartingEvent = value;
        }

        @objid ("e2f7a9ab-6857-4fee-8477-27d995f07707")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnThrowEventSmClass)this.getTarget()).getDataInputAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2f5a1b3c-d441-4af3-bac1-6dcec57a9e0d")
    public static class VisualShortCutSmDependency extends SmMultipleDependency {
        @objid ("04fd11d0-9cf7-46b3-8c93-ca48c145e5dc")
        private SmDependency symetricDep;

        @objid ("096cf7ca-b0e8-43ab-9790-91010e380c74")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnDataAssociationData)data).mVisualShortCut != null)? ((BpmnDataAssociationData)data).mVisualShortCut:SmMultipleDependency.EMPTY;
        }

        @objid ("3c4c3e6e-09be-42c5-9b0d-60dc31d55adf")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnDataAssociationData) data).mVisualShortCut = values;
        }

        @objid ("2ee9e138-ca12-4ce3-a96a-6280e8201afa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowDataAssociationSmClass)this.getTarget()).getDataAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("51e68d4a-1533-4c78-8929-aacee4b25b0a")
    public static class EndingEventSmDependency extends SmSingleDependency {
        @objid ("05306e36-acc0-412c-b4c3-6361a833ddb8")
        private SmDependency symetricDep;

        @objid ("7ec2e8b8-6aee-4bfc-befb-dcc69f7aa071")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataAssociationData) data).mEndingEvent;
        }

        @objid ("8458ba0f-732f-4d43-8be2-d39e8b730ffb")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataAssociationData) data).mEndingEvent = value;
        }

        @objid ("ba679569-0c02-438a-9b9f-2c600e6896f7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCatchEventSmClass)this.getTarget()).getDataOutputAssociationDep();
            }
            return this.symetricDep;
        }

    }

}
