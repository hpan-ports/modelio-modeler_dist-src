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
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
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

@objid ("6b9384d1-347f-4630-884c-d89cf3f86843")
public class ParameterSmClass extends ModelElementSmClass {
    @objid ("8c0fdb22-4052-40d8-91a7-1161979e47c2")
    private SmAttribute parameterPassingAtt;

    @objid ("885ad48b-54c4-4c28-8131-1ec0af0f6012")
    private SmAttribute multiplicityMinAtt;

    @objid ("c8fb51b0-e6ce-45fb-9fae-f250599019ff")
    private SmAttribute multiplicityMaxAtt;

    @objid ("835a0f93-eecf-4a36-9f7f-db8e460c0830")
    private SmAttribute typeConstraintAtt;

    @objid ("6473a3fb-4481-4c52-870f-ef5b5e9409d8")
    private SmAttribute defaultValueAtt;

    @objid ("7038257b-a4a0-4dae-8f31-59e2966a9090")
    private SmAttribute isOrderedAtt;

    @objid ("d98fe1ee-7595-4667-9e85-7ce84d9964c6")
    private SmAttribute isUniqueAtt;

    @objid ("0c71e3af-260c-4436-a91c-8f724448f5fb")
    private SmAttribute isExceptionAtt;

    @objid ("2e510d4c-a2eb-467e-94f9-840931a956ee")
    private SmAttribute isStreamAtt;

    @objid ("31b0c145-f8a6-4e3d-88fc-327dfd5df287")
    private SmAttribute effectAtt;

    @objid ("7e2209ca-76eb-4f07-8f77-efd08888e433")
    private SmDependency bpmnRepresentingDataInputDep;

    @objid ("d0ba328d-3b92-4d9d-a614-b1379e24f475")
    private SmDependency typeDep;

    @objid ("5dfcafe7-e669-40c1-85d7-4fe0046d5183")
    private SmDependency composedDep;

    @objid ("63997455-d92c-42d7-ae6b-5d2e9c5383a1")
    private SmDependency matchingDep;

    @objid ("1cbcb05f-ecde-4d03-9c0c-eb943e8c8cfa")
    private SmDependency bpmnRepresentingDataOutputDep;

    @objid ("2950f177-92de-4222-8c81-cc9db375b154")
    private SmDependency sRepresentationDep;

    @objid ("3c6422e0-0df9-4d57-bcb8-e724062df518")
    private SmDependency returnedDep;

    @objid ("973235cb-0578-4498-8b9c-e964122c77ba")
    private SmDependency behaviorParamDep;

    @objid ("551ccc4f-f2df-4162-9aa6-059ed7d8370c")
    public ParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b8b95f31-c181-44f5-929d-dd2243e08514")
    @Override
    public String getName() {
        return "Parameter";
    }

    @objid ("8387d3ae-9ce7-476b-96b0-846d67066860")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f93f75d5-3422-4f8c-b502-192da34de35f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Parameter.class;
    }

    @objid ("f720c22a-6b6a-4f34-bb2e-fc2a2d2f4a90")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cc6bb383-961c-40c2-bd30-adc348856569")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7efe57cd-d1a5-4c9a-b6b7-e7037ae89757")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.parameterPassingAtt = new ParameterPassingSmAttribute();
        this.parameterPassingAtt.init("ParameterPassing", this, PassingMode.class );
        registerAttribute(this.parameterPassingAtt);
        
        this.multiplicityMinAtt = new MultiplicityMinSmAttribute();
        this.multiplicityMinAtt.init("MultiplicityMin", this, String.class );
        registerAttribute(this.multiplicityMinAtt);
        
        this.multiplicityMaxAtt = new MultiplicityMaxSmAttribute();
        this.multiplicityMaxAtt.init("MultiplicityMax", this, String.class );
        registerAttribute(this.multiplicityMaxAtt);
        
        this.typeConstraintAtt = new TypeConstraintSmAttribute();
        this.typeConstraintAtt.init("TypeConstraint", this, String.class );
        registerAttribute(this.typeConstraintAtt);
        
        this.defaultValueAtt = new DefaultValueSmAttribute();
        this.defaultValueAtt.init("DefaultValue", this, String.class );
        registerAttribute(this.defaultValueAtt);
        
        this.isOrderedAtt = new IsOrderedSmAttribute();
        this.isOrderedAtt.init("IsOrdered", this, Boolean.class );
        registerAttribute(this.isOrderedAtt);
        
        this.isUniqueAtt = new IsUniqueSmAttribute();
        this.isUniqueAtt.init("IsUnique", this, Boolean.class );
        registerAttribute(this.isUniqueAtt);
        
        this.isExceptionAtt = new IsExceptionSmAttribute();
        this.isExceptionAtt.init("IsException", this, Boolean.class );
        registerAttribute(this.isExceptionAtt);
        
        this.isStreamAtt = new IsStreamSmAttribute();
        this.isStreamAtt.init("IsStream", this, Boolean.class );
        registerAttribute(this.isStreamAtt);
        
        this.effectAtt = new EffectSmAttribute();
        this.effectAtt.init("Effect", this, ParameterEffectKind.class );
        registerAttribute(this.effectAtt);
        
        
        // Initialize and register the SmDependency
        this.bpmnRepresentingDataInputDep = new BpmnRepresentingDataInputSmDependency();
        this.bpmnRepresentingDataInputDep.init("BpmnRepresentingDataInput", this, metamodel.getMClass("BpmnDataInput"), 0, -1 );
        registerDependency(this.bpmnRepresentingDataInputDep);
        
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.composedDep = new ComposedSmDependency();
        this.composedDep.init("Composed", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.composedDep);
        
        this.matchingDep = new MatchingSmDependency();
        this.matchingDep.init("Matching", this, metamodel.getMClass("Pin"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.matchingDep);
        
        this.bpmnRepresentingDataOutputDep = new BpmnRepresentingDataOutputSmDependency();
        this.bpmnRepresentingDataOutputDep.init("BpmnRepresentingDataOutput", this, metamodel.getMClass("BpmnDataOutput"), 0, -1 );
        registerDependency(this.bpmnRepresentingDataOutputDep);
        
        this.sRepresentationDep = new SRepresentationSmDependency();
        this.sRepresentationDep.init("SRepresentation", this, metamodel.getMClass("Signal"), 0, -1 );
        registerDependency(this.sRepresentationDep);
        
        this.returnedDep = new ReturnedSmDependency();
        this.returnedDep.init("Returned", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.returnedDep);
        
        this.behaviorParamDep = new BehaviorParamSmDependency();
        this.behaviorParamDep.init("BehaviorParam", this, metamodel.getMClass("BehaviorParameter"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.behaviorParamDep);
    }

    @objid ("e869ade0-36c6-4b8a-9942-72a9e5e828fd")
    public SmAttribute getParameterPassingAtt() {
        if (this.parameterPassingAtt == null) {
        	this.parameterPassingAtt = this.getAttributeDef("ParameterPassing");
        }
        return this.parameterPassingAtt;
    }

    @objid ("4287cc8d-7f64-4e8c-9c79-106344d52857")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("0fd3b173-c409-4987-bc1b-ce04e4901fed")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("adc1301e-461a-441c-a918-af2a2b5e5f38")
    public SmAttribute getTypeConstraintAtt() {
        if (this.typeConstraintAtt == null) {
        	this.typeConstraintAtt = this.getAttributeDef("TypeConstraint");
        }
        return this.typeConstraintAtt;
    }

    @objid ("3f96bf17-b1df-4d01-9c8a-b62bd2d5be1c")
    public SmAttribute getDefaultValueAtt() {
        if (this.defaultValueAtt == null) {
        	this.defaultValueAtt = this.getAttributeDef("DefaultValue");
        }
        return this.defaultValueAtt;
    }

    @objid ("216c368f-1dea-4c0d-87c0-6ab802198a41")
    public SmAttribute getIsOrderedAtt() {
        if (this.isOrderedAtt == null) {
        	this.isOrderedAtt = this.getAttributeDef("IsOrdered");
        }
        return this.isOrderedAtt;
    }

    @objid ("06eee633-1eca-41ae-ba6d-a63451d826dc")
    public SmAttribute getIsUniqueAtt() {
        if (this.isUniqueAtt == null) {
        	this.isUniqueAtt = this.getAttributeDef("IsUnique");
        }
        return this.isUniqueAtt;
    }

    @objid ("a92e1a5f-0e51-452d-a911-df9b3226870a")
    public SmAttribute getIsExceptionAtt() {
        if (this.isExceptionAtt == null) {
        	this.isExceptionAtt = this.getAttributeDef("IsException");
        }
        return this.isExceptionAtt;
    }

    @objid ("c6aac8bc-27f0-4873-9b5b-60054733c1fb")
    public SmAttribute getIsStreamAtt() {
        if (this.isStreamAtt == null) {
        	this.isStreamAtt = this.getAttributeDef("IsStream");
        }
        return this.isStreamAtt;
    }

    @objid ("6efbbe86-2554-4f97-a9d2-c87319da8efd")
    public SmAttribute getEffectAtt() {
        if (this.effectAtt == null) {
        	this.effectAtt = this.getAttributeDef("Effect");
        }
        return this.effectAtt;
    }

    @objid ("2af9c057-88a1-4ea9-bbab-739b1cff5f2f")
    public SmDependency getBpmnRepresentingDataInputDep() {
        if (this.bpmnRepresentingDataInputDep == null) {
        	this.bpmnRepresentingDataInputDep = this.getDependencyDef("BpmnRepresentingDataInput");
        }
        return this.bpmnRepresentingDataInputDep;
    }

    @objid ("17807334-8fee-44f1-b8c3-36fb1876475e")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("b0f87408-027c-4663-ab33-cca64e37c7c6")
    public SmDependency getComposedDep() {
        if (this.composedDep == null) {
        	this.composedDep = this.getDependencyDef("Composed");
        }
        return this.composedDep;
    }

    @objid ("369f6da6-ce61-4681-a7ec-9128ea362664")
    public SmDependency getMatchingDep() {
        if (this.matchingDep == null) {
        	this.matchingDep = this.getDependencyDef("Matching");
        }
        return this.matchingDep;
    }

    @objid ("03b93410-ef7a-4495-8c2a-2505fc8ad7bb")
    public SmDependency getBpmnRepresentingDataOutputDep() {
        if (this.bpmnRepresentingDataOutputDep == null) {
        	this.bpmnRepresentingDataOutputDep = this.getDependencyDef("BpmnRepresentingDataOutput");
        }
        return this.bpmnRepresentingDataOutputDep;
    }

    @objid ("adff1c21-f55a-4f0d-981d-2a10135c6359")
    public SmDependency getSRepresentationDep() {
        if (this.sRepresentationDep == null) {
        	this.sRepresentationDep = this.getDependencyDef("SRepresentation");
        }
        return this.sRepresentationDep;
    }

    @objid ("c95d2361-7647-4ce3-9917-5467cd38fdb7")
    public SmDependency getReturnedDep() {
        if (this.returnedDep == null) {
        	this.returnedDep = this.getDependencyDef("Returned");
        }
        return this.returnedDep;
    }

    @objid ("99672bd9-079e-4329-a4ac-c7e7450a0eee")
    public SmDependency getBehaviorParamDep() {
        if (this.behaviorParamDep == null) {
        	this.behaviorParamDep = this.getDependencyDef("BehaviorParam");
        }
        return this.behaviorParamDep;
    }

    @objid ("9f9a3d1a-c952-427d-bf6e-caa419a99f55")
    private static class ParameterObjectFactory implements ISmObjectFactory {
        @objid ("dcdc4808-f36c-4144-b3a2-f0451ab8e9a8")
        private ParameterSmClass smClass;

        @objid ("670491f8-de1b-40d6-a669-4f4f6ef9d18a")
        public ParameterObjectFactory(ParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("64761d4d-1a15-4447-86d6-dfba4c8d477d")
        @Override
        public ISmObjectData createData() {
            return new ParameterData(this.smClass);
        }

        @objid ("ee1e370c-a065-4446-8f2f-3c6d15c9ec2f")
        @Override
        public SmObjectImpl createImpl() {
            return new ParameterImpl();
        }

    }

    @objid ("5b88cbe7-158c-46e8-94cf-856af67b018e")
    public static class ParameterPassingSmAttribute extends SmAttribute {
        @objid ("ac042ba4-f57e-44d3-8e47-a615d98a3085")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mParameterPassing;
        }

        @objid ("8439d27d-d2fe-41b2-b4a1-e7ea745d9e9a")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mParameterPassing = value;
        }

    }

    @objid ("5e2c13bd-0850-429b-9e74-89bd958582e9")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("6c4b2b7b-7390-43f2-a107-3aa45a81dcd5")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mMultiplicityMin;
        }

        @objid ("a18bf6f7-aba8-48a7-97dc-4dd7d4feeca0")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mMultiplicityMin = value;
        }

    }

    @objid ("8c964745-c3bb-48cd-b8c1-15c600283c71")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("801861b9-3ccc-4c59-bae5-928749b859f6")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mMultiplicityMax;
        }

        @objid ("b6de3941-a111-43dd-93fe-829e86bd02fe")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mMultiplicityMax = value;
        }

    }

    @objid ("c7eda5d8-bb9a-4e5f-a352-7ed37ed2a2ad")
    public static class TypeConstraintSmAttribute extends SmAttribute {
        @objid ("452dfe63-2f58-4909-ab79-0da5e098c3bd")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mTypeConstraint;
        }

        @objid ("545a3e50-82cd-49da-8c8d-b719b82df0e4")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mTypeConstraint = value;
        }

    }

    @objid ("e9fb271d-39e6-4705-8c74-d74e788b4730")
    public static class DefaultValueSmAttribute extends SmAttribute {
        @objid ("eb42c5bd-4362-47bc-9bd6-353a964a5374")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mDefaultValue;
        }

        @objid ("0efa2662-53db-4746-a00c-65b15f29383b")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mDefaultValue = value;
        }

    }

    @objid ("212b0686-d5b1-474f-a47b-675f2fb09039")
    public static class IsOrderedSmAttribute extends SmAttribute {
        @objid ("25b70cbd-ea3f-4ad5-bdae-c14d5804a78a")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mIsOrdered;
        }

        @objid ("8fb2bbdd-7c1a-4c72-8624-391960342e03")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mIsOrdered = value;
        }

    }

    @objid ("9ef567b8-de44-4f16-bfb3-b3fc56a9f18a")
    public static class IsUniqueSmAttribute extends SmAttribute {
        @objid ("ba8dba09-2d2e-49aa-a4da-307e7a20a6d7")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mIsUnique;
        }

        @objid ("f9b609b3-6c0b-4310-9922-c38a5157857d")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mIsUnique = value;
        }

    }

    @objid ("24197111-5938-4a61-b6a7-9a3f0e2d375a")
    public static class IsExceptionSmAttribute extends SmAttribute {
        @objid ("0c3691a0-59c6-48e7-9a40-776685da9109")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mIsException;
        }

        @objid ("eeb2dce3-2e00-4059-81e3-5249717753bb")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mIsException = value;
        }

    }

    @objid ("6a01f31c-c13b-489f-bdf8-0dede6f14e8f")
    public static class IsStreamSmAttribute extends SmAttribute {
        @objid ("6838e28d-40e1-4eb1-9176-22d65617daee")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mIsStream;
        }

        @objid ("968ba322-ff6e-4597-b7bb-ac0ebab29447")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mIsStream = value;
        }

    }

    @objid ("3c61634a-9dc7-446d-9fa6-39ddcf7e78a6")
    public static class EffectSmAttribute extends SmAttribute {
        @objid ("faf00aea-987c-490f-bd92-fbf60a2f498b")
        public Object getValue(ISmObjectData data) {
            return ((ParameterData) data).mEffect;
        }

        @objid ("380d47a6-0d60-4895-909f-edfba74e832d")
        public void setValue(ISmObjectData data, Object value) {
            ((ParameterData) data).mEffect = value;
        }

    }

    @objid ("8a4e1c80-d116-4fbe-9bb3-c0ca8b6913b8")
    public static class BpmnRepresentingDataInputSmDependency extends SmMultipleDependency {
        @objid ("7c4a1d6b-1b91-43e3-9bfd-6de2a12dd917")
        private SmDependency symetricDep;

        @objid ("4c1c7c3a-a120-47b3-aa18-faaf35f92a9b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ParameterData)data).mBpmnRepresentingDataInput != null)? ((ParameterData)data).mBpmnRepresentingDataInput:SmMultipleDependency.EMPTY;
        }

        @objid ("ce1447ce-4116-486f-a315-7e9a57b4dff1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ParameterData) data).mBpmnRepresentingDataInput = values;
        }

        @objid ("2bbac21a-7a23-4f9d-ac91-10917beae7b1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataInputSmClass)this.getTarget()).getRepresentedParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("84d0d209-230b-46d9-928f-3e18713d55bb")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("b7583622-287f-4154-b13e-aa1ef4abf7a1")
        private SmDependency symetricDep;

        @objid ("7b34d363-7703-438b-b424-c9bc3fc30bfe")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ParameterData) data).mType;
        }

        @objid ("64febe83-d084-48b8-8407-0c0a32db29ea")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ParameterData) data).mType = value;
        }

        @objid ("d4c3033f-a496-4c4a-a273-4c2ad4ec12df")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4a94558a-f464-4fbd-8afa-e3b4029c0095")
    public static class ComposedSmDependency extends SmSingleDependency {
        @objid ("b06d84ab-780d-4c58-83c6-5c78587ec14f")
        private SmDependency symetricDep;

        @objid ("62011bfb-1c21-418d-8ab5-e93576aa0782")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ParameterData) data).mComposed;
        }

        @objid ("445bfd91-b3c3-4a12-9027-423c37dc5b25")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ParameterData) data).mComposed = value;
        }

        @objid ("0eb6f856-84fb-4f59-9745-febf2ecff2b3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getIODep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ddc8e645-c4a3-4721-891e-226f45a779e7")
    public static class MatchingSmDependency extends SmMultipleDependency {
        @objid ("ef9f887a-84e8-4093-b0b9-b5dfb592c67d")
        private SmDependency symetricDep;

        @objid ("1977b9e0-975c-4a02-9ea0-c01b2f15e6ec")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ParameterData)data).mMatching != null)? ((ParameterData)data).mMatching:SmMultipleDependency.EMPTY;
        }

        @objid ("f8566680-771d-48ac-8cd3-a6c49d745d28")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ParameterData) data).mMatching = values;
        }

        @objid ("ae6eacfe-eadd-413a-98f3-36706eb17f5a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PinSmClass)this.getTarget()).getMatchedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("16108ce6-b5bd-4855-802c-2dd28630dccc")
    public static class BpmnRepresentingDataOutputSmDependency extends SmMultipleDependency {
        @objid ("5a64cd23-26c5-4ce1-ad76-41adf1a8f991")
        private SmDependency symetricDep;

        @objid ("8865c164-831d-49dc-8548-a55ad6a66a1f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ParameterData)data).mBpmnRepresentingDataOutput != null)? ((ParameterData)data).mBpmnRepresentingDataOutput:SmMultipleDependency.EMPTY;
        }

        @objid ("02a22013-6358-47de-8638-8a0522f34e71")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ParameterData) data).mBpmnRepresentingDataOutput = values;
        }

        @objid ("1011f04e-7fd5-4b0b-882e-4632fc574610")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataOutputSmClass)this.getTarget()).getRepresentedParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fcc666cc-79cd-4807-8abf-c84dcf70d583")
    public static class SRepresentationSmDependency extends SmMultipleDependency {
        @objid ("48da7316-c732-443b-a746-901b24ac2c85")
        private SmDependency symetricDep;

        @objid ("726ece0a-b2ef-4d6e-962c-55a048a15362")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ParameterData)data).mSRepresentation != null)? ((ParameterData)data).mSRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("c3c5b62d-856d-419e-a9dc-0183c73055dd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ParameterData) data).mSRepresentation = values;
        }

        @objid ("7b22a1c1-460c-4279-b99d-c8707c34c97c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getPBaseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e85d6e55-74cf-4599-9d16-4ecd40230706")
    public static class ReturnedSmDependency extends SmSingleDependency {
        @objid ("e2379d0e-277c-47a6-afc1-393e3ae70554")
        private SmDependency symetricDep;

        @objid ("939d6433-c759-412a-a416-daa09d802d59")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ParameterData) data).mReturned;
        }

        @objid ("aa0c1b79-9def-47a5-8a59-0fb585fae569")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ParameterData) data).mReturned = value;
        }

        @objid ("de838e37-b046-437f-b2a6-0d38b6cfcd50")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getReturnDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("73256698-7b3a-4d4f-8212-30adcc6965eb")
    public static class BehaviorParamSmDependency extends SmMultipleDependency {
        @objid ("615bc523-c258-40b8-a30a-568c754425a7")
        private SmDependency symetricDep;

        @objid ("9cb89c47-f40c-4233-81d6-d1caf4367498")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ParameterData)data).mBehaviorParam != null)? ((ParameterData)data).mBehaviorParam:SmMultipleDependency.EMPTY;
        }

        @objid ("1a6734b3-f004-4f0b-a950-3553edc24d95")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ParameterData) data).mBehaviorParam = values;
        }

        @objid ("71c08e6a-0edc-4e8a-b5a6-96c77e691f63")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorParameterSmClass)this.getTarget()).getMappedDep();
            }
            return this.symetricDep;
        }

    }

}
