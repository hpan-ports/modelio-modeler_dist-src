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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.impl.bpmn.activities.BpmnLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnBoundaryEventSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnCompensateEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeSmClass;
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

@objid ("aae718e0-b605-413c-a620-6fb67af356c4")
public class BpmnActivitySmClass extends BpmnFlowNodeSmClass {
    @objid ("cd440290-ad0c-49ab-9549-b274d2b279e6")
    private SmAttribute isForCompensationAtt;

    @objid ("3c523991-f08e-48e5-82de-f26eb3e6bdea")
    private SmAttribute startQuantityAtt;

    @objid ("673b0e16-b65e-4dc3-9789-e920722456ae")
    private SmAttribute completionQuantityAtt;

    @objid ("3f5618d2-c02f-4e2b-8637-392114adbb4f")
    private SmDependency compensateEventDefinitionsDep;

    @objid ("5f90d523-985c-494c-a13f-d4c54271c29a")
    private SmDependency inputSpecificationDep;

    @objid ("e6b134e1-8b4a-44b9-b2a3-0943ea7c173b")
    private SmDependency dataInputAssociationDep;

    @objid ("2979c63f-112f-4f30-ba16-08fb137cde7e")
    private SmDependency outputSpecificationDep;

    @objid ("fd40a8db-dcae-4d70-b89d-0d15675b17f5")
    private SmDependency loopCharacteristicsDep;

    @objid ("cf1fd280-eff8-417e-8f16-a5111c3726b9")
    private SmDependency boundaryEventRefDep;

    @objid ("c50fc3f0-7a4f-4d7f-b0c6-295c120eeb1c")
    private SmDependency dataOutputAssociationDep;

    @objid ("a666eb72-81a9-4369-9c14-3f8c6965e9b0")
    private SmDependency defaultFlowDep;

    @objid ("2b9e0938-2315-4e19-855d-013cfa1da535")
    public BpmnActivitySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ed790e3d-8970-4b3b-a7a8-0b26d01ff46f")
    @Override
    public String getName() {
        return "BpmnActivity";
    }

    @objid ("a5ed7ad4-f051-42e0-9eb1-8078da29dc40")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6313ad4c-3c41-45a0-91b6-2196c31203b3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnActivity.class;
    }

    @objid ("ae0165bd-0d08-41da-844d-c8786e5a903e")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("985b2886-52f1-4ac3-aa08-03c05dd3bb90")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f04f1ed0-3d01-436a-8665-82d7965ccf4e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowNode");
        this.registerFactory(new BpmnActivityObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isForCompensationAtt = new IsForCompensationSmAttribute();
        this.isForCompensationAtt.init("IsForCompensation", this, Boolean.class );
        registerAttribute(this.isForCompensationAtt);
        
        this.startQuantityAtt = new StartQuantitySmAttribute();
        this.startQuantityAtt.init("StartQuantity", this, Integer.class );
        registerAttribute(this.startQuantityAtt);
        
        this.completionQuantityAtt = new CompletionQuantitySmAttribute();
        this.completionQuantityAtt.init("CompletionQuantity", this, Integer.class );
        registerAttribute(this.completionQuantityAtt);
        
        
        // Initialize and register the SmDependency
        this.compensateEventDefinitionsDep = new CompensateEventDefinitionsSmDependency();
        this.compensateEventDefinitionsDep.init("CompensateEventDefinitions", this, metamodel.getMClass("BpmnCompensateEventDefinition"), 0, -1 );
        registerDependency(this.compensateEventDefinitionsDep);
        
        this.inputSpecificationDep = new InputSpecificationSmDependency();
        this.inputSpecificationDep.init("InputSpecification", this, metamodel.getMClass("BpmnDataInput"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.inputSpecificationDep);
        
        this.dataInputAssociationDep = new DataInputAssociationSmDependency();
        this.dataInputAssociationDep.init("DataInputAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataInputAssociationDep);
        
        this.outputSpecificationDep = new OutputSpecificationSmDependency();
        this.outputSpecificationDep.init("OutputSpecification", this, metamodel.getMClass("BpmnDataOutput"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.outputSpecificationDep);
        
        this.loopCharacteristicsDep = new LoopCharacteristicsSmDependency();
        this.loopCharacteristicsDep.init("LoopCharacteristics", this, metamodel.getMClass("BpmnLoopCharacteristics"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.loopCharacteristicsDep);
        
        this.boundaryEventRefDep = new BoundaryEventRefSmDependency();
        this.boundaryEventRefDep.init("BoundaryEventRef", this, metamodel.getMClass("BpmnBoundaryEvent"), 0, -1 , SmDirective.SMCDPARTOF, SmDirective.SMCDTODELETE);
        registerDependency(this.boundaryEventRefDep);
        
        this.dataOutputAssociationDep = new DataOutputAssociationSmDependency();
        this.dataOutputAssociationDep.init("DataOutputAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataOutputAssociationDep);
        
        this.defaultFlowDep = new DefaultFlowSmDependency();
        this.defaultFlowDep.init("DefaultFlow", this, metamodel.getMClass("BpmnSequenceFlow"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defaultFlowDep);
    }

    @objid ("81cd1053-1d5c-4c94-9e19-b95da31d1195")
    public SmAttribute getIsForCompensationAtt() {
        if (this.isForCompensationAtt == null) {
        	this.isForCompensationAtt = this.getAttributeDef("IsForCompensation");
        }
        return this.isForCompensationAtt;
    }

    @objid ("cbcf91b2-0833-45f6-80b6-9bdee9252491")
    public SmAttribute getStartQuantityAtt() {
        if (this.startQuantityAtt == null) {
        	this.startQuantityAtt = this.getAttributeDef("StartQuantity");
        }
        return this.startQuantityAtt;
    }

    @objid ("fdd1ffdd-df53-495c-bc40-47b9bf4cdcec")
    public SmAttribute getCompletionQuantityAtt() {
        if (this.completionQuantityAtt == null) {
        	this.completionQuantityAtt = this.getAttributeDef("CompletionQuantity");
        }
        return this.completionQuantityAtt;
    }

    @objid ("8e1217d6-621e-409c-ac93-3f47f4a0337c")
    public SmDependency getCompensateEventDefinitionsDep() {
        if (this.compensateEventDefinitionsDep == null) {
        	this.compensateEventDefinitionsDep = this.getDependencyDef("CompensateEventDefinitions");
        }
        return this.compensateEventDefinitionsDep;
    }

    @objid ("1199f7a9-cd01-492b-97a6-756d34ac8525")
    public SmDependency getInputSpecificationDep() {
        if (this.inputSpecificationDep == null) {
        	this.inputSpecificationDep = this.getDependencyDef("InputSpecification");
        }
        return this.inputSpecificationDep;
    }

    @objid ("4623ee1c-909f-4b4d-bdd1-c63acf8374a2")
    public SmDependency getDataInputAssociationDep() {
        if (this.dataInputAssociationDep == null) {
        	this.dataInputAssociationDep = this.getDependencyDef("DataInputAssociation");
        }
        return this.dataInputAssociationDep;
    }

    @objid ("13e2963b-3b48-4b38-888c-c67bdf10b9fe")
    public SmDependency getOutputSpecificationDep() {
        if (this.outputSpecificationDep == null) {
        	this.outputSpecificationDep = this.getDependencyDef("OutputSpecification");
        }
        return this.outputSpecificationDep;
    }

    @objid ("6defa3d4-ee31-466a-ac60-a4228fa321f1")
    public SmDependency getLoopCharacteristicsDep() {
        if (this.loopCharacteristicsDep == null) {
        	this.loopCharacteristicsDep = this.getDependencyDef("LoopCharacteristics");
        }
        return this.loopCharacteristicsDep;
    }

    @objid ("0eeb9f65-1d09-4277-96a5-0c328282fe19")
    public SmDependency getBoundaryEventRefDep() {
        if (this.boundaryEventRefDep == null) {
        	this.boundaryEventRefDep = this.getDependencyDef("BoundaryEventRef");
        }
        return this.boundaryEventRefDep;
    }

    @objid ("cffd550f-441a-45f3-9d12-17a87734d1e5")
    public SmDependency getDataOutputAssociationDep() {
        if (this.dataOutputAssociationDep == null) {
        	this.dataOutputAssociationDep = this.getDependencyDef("DataOutputAssociation");
        }
        return this.dataOutputAssociationDep;
    }

    @objid ("1b92f314-a9ac-461b-bd7e-74ce4fb86997")
    public SmDependency getDefaultFlowDep() {
        if (this.defaultFlowDep == null) {
        	this.defaultFlowDep = this.getDependencyDef("DefaultFlow");
        }
        return this.defaultFlowDep;
    }

    @objid ("8adc2463-2b4f-4b8e-b067-bee9df19de06")
    private static class BpmnActivityObjectFactory implements ISmObjectFactory {
        @objid ("dbe055ed-d5b5-424d-a100-02f445cd0e4b")
        private BpmnActivitySmClass smClass;

        @objid ("9890b94a-d00c-4a1b-9524-b95ce38c147b")
        public BpmnActivityObjectFactory(BpmnActivitySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ee536ca9-9776-4f1c-ac10-d91a24442a2e")
        @Override
        public ISmObjectData createData() {
            return new BpmnActivityData(this.smClass);
        }

        @objid ("aa7ac564-1bf8-4ad2-b76c-64379a62856f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnActivityImpl();
        }

    }

    @objid ("56c2e2a7-8e1c-4c49-9804-8be4e9db6166")
    public static class IsForCompensationSmAttribute extends SmAttribute {
        @objid ("aff35737-a84b-4800-9bfb-b32961d8fe90")
        public Object getValue(ISmObjectData data) {
            return ((BpmnActivityData) data).mIsForCompensation;
        }

        @objid ("d23bf719-2b9d-4b32-bfb9-9e58d4532815")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnActivityData) data).mIsForCompensation = value;
        }

    }

    @objid ("daceb1bb-6963-474c-ac33-75a4bc7f945e")
    public static class StartQuantitySmAttribute extends SmAttribute {
        @objid ("db385d3a-bd8f-4e2b-9a07-860b8c648389")
        public Object getValue(ISmObjectData data) {
            return ((BpmnActivityData) data).mStartQuantity;
        }

        @objid ("180faf2f-a260-4886-9d47-3b094a27e309")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnActivityData) data).mStartQuantity = value;
        }

    }

    @objid ("53294b9f-4d73-4692-8ee9-4a1e0feb9d8e")
    public static class CompletionQuantitySmAttribute extends SmAttribute {
        @objid ("d8c23f9d-8891-412f-9b0e-5d3304eef7ca")
        public Object getValue(ISmObjectData data) {
            return ((BpmnActivityData) data).mCompletionQuantity;
        }

        @objid ("f573c87d-717d-4348-bfbb-6eb4daf98bd1")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnActivityData) data).mCompletionQuantity = value;
        }

    }

    @objid ("9e288f09-c68a-49ce-a622-c40e8c78df75")
    public static class CompensateEventDefinitionsSmDependency extends SmMultipleDependency {
        @objid ("074e694a-3d3d-4ad4-8f74-4ac51ab25060")
        private SmDependency symetricDep;

        @objid ("66d62755-c7f4-4ff3-b99c-4f0ac5afbde1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mCompensateEventDefinitions != null)? ((BpmnActivityData)data).mCompensateEventDefinitions:SmMultipleDependency.EMPTY;
        }

        @objid ("12f93f39-3bf9-406c-8022-7dc4b8b85d7f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mCompensateEventDefinitions = values;
        }

        @objid ("ba448938-9932-445c-b442-5bc178b378c5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCompensateEventDefinitionSmClass)this.getTarget()).getActivityRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("25634f3f-0409-4d24-9796-868433222e6a")
    public static class InputSpecificationSmDependency extends SmMultipleDependency {
        @objid ("7359813e-093b-4b6b-a6a5-a39b362d1d76")
        private SmDependency symetricDep;

        @objid ("ced9ce10-1589-4dad-8427-055d404b8754")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mInputSpecification != null)? ((BpmnActivityData)data).mInputSpecification:SmMultipleDependency.EMPTY;
        }

        @objid ("9101895b-2318-4c56-9421-8e50426463be")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mInputSpecification = values;
        }

        @objid ("38025f42-7f1e-4643-96e6-31b418daeeb4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataInputSmClass)this.getTarget()).getOwnerActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("12fd0eec-b123-4a3b-b5da-82b898207e42")
    public static class DataInputAssociationSmDependency extends SmMultipleDependency {
        @objid ("455eafb4-07b3-469d-8f1a-fcfe773a41b0")
        private SmDependency symetricDep;

        @objid ("407d2c50-5d4d-4fa7-9439-f23189ca6f75")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mDataInputAssociation != null)? ((BpmnActivityData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("165b395a-9fc5-4ea6-bf44-e1f7bf670c2a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mDataInputAssociation = values;
        }

        @objid ("08298518-5c7a-4b8c-bc2d-eecad6b84a0b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getStartingActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b73b335f-67c1-4632-ae00-4faab8d705ee")
    public static class OutputSpecificationSmDependency extends SmMultipleDependency {
        @objid ("6e57d2ec-aa55-4984-b0b5-d2df7682c89c")
        private SmDependency symetricDep;

        @objid ("2d4ea20f-3e42-4662-8d3d-d6d218d87483")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mOutputSpecification != null)? ((BpmnActivityData)data).mOutputSpecification:SmMultipleDependency.EMPTY;
        }

        @objid ("06f3a072-074f-4e47-888c-b3080be47444")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mOutputSpecification = values;
        }

        @objid ("5ccfaadd-cf39-4c2e-875c-f5d318ee0253")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataOutputSmClass)this.getTarget()).getOwnerActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("759f5593-bff0-4819-9734-46236098d331")
    public static class LoopCharacteristicsSmDependency extends SmSingleDependency {
        @objid ("8821639f-5578-4267-b281-7543e0e34640")
        private SmDependency symetricDep;

        @objid ("8935250e-02ee-4f3e-aece-2a595c746419")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnActivityData) data).mLoopCharacteristics;
        }

        @objid ("6fcc5170-2d57-4d56-a27f-9dc2fc1bfb40")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnActivityData) data).mLoopCharacteristics = value;
        }

        @objid ("da59602b-2ebd-4dbd-8d1a-6bb2effc2f2b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLoopCharacteristicsSmClass)this.getTarget()).getOwnerActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eb63bdb1-4f1a-4e51-a755-44522d91ee61")
    public static class BoundaryEventRefSmDependency extends SmMultipleDependency {
        @objid ("36b17cd7-0927-4651-aed5-434dd55e2396")
        private SmDependency symetricDep;

        @objid ("da364228-8b4f-4d23-b392-2af8b3b6078e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mBoundaryEventRef != null)? ((BpmnActivityData)data).mBoundaryEventRef:SmMultipleDependency.EMPTY;
        }

        @objid ("84152d48-8deb-4d72-9fad-42ec19edb977")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mBoundaryEventRef = values;
        }

        @objid ("bfc5e76d-0ff0-41a5-9604-01aa12f01d25")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBoundaryEventSmClass)this.getTarget()).getAttachedToRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("acfd8625-3bf5-4d4c-9aa1-971431d748e3")
    public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
        @objid ("920d4232-afa2-41fc-b632-736f057ad10f")
        private SmDependency symetricDep;

        @objid ("227c2f99-206b-4da5-a280-8623af16d4db")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnActivityData)data).mDataOutputAssociation != null)? ((BpmnActivityData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("3f9609e1-4485-443e-828d-43da5d163412")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnActivityData) data).mDataOutputAssociation = values;
        }

        @objid ("624de348-05aa-4c49-9431-ab6567d7fff8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getEndingActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9c6526d2-35c8-41da-bfdf-2f68f9a3c105")
    public static class DefaultFlowSmDependency extends SmSingleDependency {
        @objid ("86e1ca47-f1d5-4b92-a51a-13460a9b785e")
        private SmDependency symetricDep;

        @objid ("ed13f1ea-237d-4d77-bc2b-62ba21482da7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnActivityData) data).mDefaultFlow;
        }

        @objid ("85cadda0-7ad7-4bfd-bda8-57196eeef639")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnActivityData) data).mDefaultFlow = value;
        }

        @objid ("de034124-a19c-437c-93c4-20f28f6723f1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getDefaultFromDep();
            }
            return this.symetricDep;
        }

    }

}
