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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.OutputPinSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("90f6045c-3241-4b56-a0d9-fb3745c723b3")
public class ActivityActionSmClass extends ActivityNodeSmClass {
    @objid ("d1a1115f-097c-4765-83f3-bc6e29daf42e")
    private SmAttribute isMultipleInstanceAtt;

    @objid ("77419ccc-f5c6-48fc-a041-a6994670a0e3")
    private SmAttribute isCompensationAtt;

    @objid ("d4b2985e-fb83-4226-9c61-2bea19ba9596")
    private SmDependency outputDep;

    @objid ("aa3f9fff-034a-43d7-990b-a940cdf10f3b")
    private SmDependency inputDep;

    @objid ("b1c45c98-4d2c-4c7e-82de-618b194fbc87")
    private SmDependency handlerDep;

    @objid ("ca0566db-063f-4b36-88a6-d0b3d8c7f140")
    public ActivityActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("33f5cc87-3350-4824-a0b9-e3df845060c0")
    @Override
    public String getName() {
        return "ActivityAction";
    }

    @objid ("41633eb9-3b6d-444c-9a39-ebc17b63bd69")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e5f48356-877b-4a60-b1dc-75c869d53116")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityAction.class;
    }

    @objid ("ae4765e0-236c-4521-ac34-65e33e1bb948")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b3754129-a910-4bdf-8ccd-039c1e78f4cf")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("ec9190ad-3a72-4d60-af59-6cabfd42c70c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityNode");
        this.registerFactory(new ActivityActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isMultipleInstanceAtt = new IsMultipleInstanceSmAttribute();
        this.isMultipleInstanceAtt.init("IsMultipleInstance", this, Boolean.class );
        registerAttribute(this.isMultipleInstanceAtt);
        
        this.isCompensationAtt = new IsCompensationSmAttribute();
        this.isCompensationAtt.init("IsCompensation", this, Boolean.class );
        registerAttribute(this.isCompensationAtt);
        
        
        // Initialize and register the SmDependency
        this.outputDep = new OutputSmDependency();
        this.outputDep.init("Output", this, metamodel.getMClass("OutputPin"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.outputDep);
        
        this.inputDep = new InputSmDependency();
        this.inputDep.init("Input", this, metamodel.getMClass("InputPin"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.inputDep);
        
        this.handlerDep = new HandlerSmDependency();
        this.handlerDep.init("Handler", this, metamodel.getMClass("ExceptionHandler"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.handlerDep);
    }

    @objid ("05088f6f-9306-44f7-acc7-eda97d9b43e3")
    public SmAttribute getIsMultipleInstanceAtt() {
        if (this.isMultipleInstanceAtt == null) {
        	this.isMultipleInstanceAtt = this.getAttributeDef("IsMultipleInstance");
        }
        return this.isMultipleInstanceAtt;
    }

    @objid ("22bc100a-5ea1-42e3-b4d6-b543c6ae5e93")
    public SmAttribute getIsCompensationAtt() {
        if (this.isCompensationAtt == null) {
        	this.isCompensationAtt = this.getAttributeDef("IsCompensation");
        }
        return this.isCompensationAtt;
    }

    @objid ("c6b5ce00-bfe9-43a8-a418-4953d29fe503")
    public SmDependency getOutputDep() {
        if (this.outputDep == null) {
        	this.outputDep = this.getDependencyDef("Output");
        }
        return this.outputDep;
    }

    @objid ("057ba85d-c5bc-4634-969b-0793812be9f1")
    public SmDependency getInputDep() {
        if (this.inputDep == null) {
        	this.inputDep = this.getDependencyDef("Input");
        }
        return this.inputDep;
    }

    @objid ("136828e7-60a8-43ad-9813-63a1df9e6ceb")
    public SmDependency getHandlerDep() {
        if (this.handlerDep == null) {
        	this.handlerDep = this.getDependencyDef("Handler");
        }
        return this.handlerDep;
    }

    @objid ("fb72516a-5fc7-4b06-bdff-9fc933a4e125")
    private static class ActivityActionObjectFactory implements ISmObjectFactory {
        @objid ("acae54da-02a0-4626-affa-8a2754ca7517")
        private ActivityActionSmClass smClass;

        @objid ("9a34f850-858b-4b47-9f1a-3c9552d4423a")
        public ActivityActionObjectFactory(ActivityActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5db0a7c7-76fe-4247-a63b-a7457c22cfb5")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("ab665e39-a231-485c-a003-20e2bf1187f3")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("78e2f457-a5a2-45fe-88cd-05f123ae345b")
    public static class IsMultipleInstanceSmAttribute extends SmAttribute {
        @objid ("5d26eba8-70f6-4883-8614-b24d8f14ed02")
        public Object getValue(ISmObjectData data) {
            return ((ActivityActionData) data).mIsMultipleInstance;
        }

        @objid ("4c29aa32-391e-492b-836c-5e42c94a9df2")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityActionData) data).mIsMultipleInstance = value;
        }

    }

    @objid ("2b17ed45-4ba2-4bf2-9834-104de968ff93")
    public static class IsCompensationSmAttribute extends SmAttribute {
        @objid ("08c3608b-0178-43af-a2f3-9de82eeabd11")
        public Object getValue(ISmObjectData data) {
            return ((ActivityActionData) data).mIsCompensation;
        }

        @objid ("f0272c13-84c5-4055-9909-70a4fb65d6d7")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityActionData) data).mIsCompensation = value;
        }

    }

    @objid ("46806646-ca5e-480d-8ff1-07b3309b86bc")
    public static class OutputSmDependency extends SmMultipleDependency {
        @objid ("d31bad4a-6bf1-4312-9d86-5a8c80a1ba31")
        private SmDependency symetricDep;

        @objid ("30545876-bd8d-48c7-9093-3700fccd6e8d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityActionData)data).mOutput != null)? ((ActivityActionData)data).mOutput:SmMultipleDependency.EMPTY;
        }

        @objid ("7c513cea-2b5b-4d29-bae7-cde684b68b28")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityActionData) data).mOutput = values;
        }

        @objid ("d35e435b-a841-4b31-9271-edb7de6f51a8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OutputPinSmClass)this.getTarget()).getOutputingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("909337af-0109-4509-b651-c7231f64bdfc")
    public static class InputSmDependency extends SmMultipleDependency {
        @objid ("810bbf09-341c-4b36-b3d4-3779d222c4f7")
        private SmDependency symetricDep;

        @objid ("d180395e-20c3-4ee8-ac72-6d1d2bd3e701")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityActionData)data).mInput != null)? ((ActivityActionData)data).mInput:SmMultipleDependency.EMPTY;
        }

        @objid ("7c0e7477-5728-47f8-ac89-a965df4a0adf")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityActionData) data).mInput = values;
        }

        @objid ("c37894cb-8f8d-4e94-b2ac-2d5a97d25eea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InputPinSmClass)this.getTarget()).getInputingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("830bddd7-2ae7-40a8-8810-0a30b8a265f9")
    public static class HandlerSmDependency extends SmMultipleDependency {
        @objid ("19800369-8091-4b24-9df1-f3d62083854e")
        private SmDependency symetricDep;

        @objid ("252f2908-9bcd-47dd-b279-adfa0f7a0c59")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityActionData)data).mHandler != null)? ((ActivityActionData)data).mHandler:SmMultipleDependency.EMPTY;
        }

        @objid ("6df2ed56-35f3-4546-9b40-0466fa0324da")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityActionData) data).mHandler = values;
        }

        @objid ("52137516-5401-4745-a5b4-fa075b21f59b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExceptionHandlerSmClass)this.getTarget()).getProtectedNodeDep();
            }
            return this.symetricDep;
        }

    }

}
