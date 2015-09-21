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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
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

@objid ("116cae41-1412-4845-aca2-dc7851e2ae73")
public class InputPinSmClass extends PinSmClass {
    @objid ("fbbb0fb9-a70c-48f6-9094-44ed26b479f3")
    private SmAttribute isSelfAtt;

    @objid ("6d86ad2a-159d-4a7e-9b61-c05f3c94f9ca")
    private SmDependency handlerDep;

    @objid ("8abe5e87-ae80-4249-83f6-f190376feda7")
    private SmDependency inputingDep;

    @objid ("b94136e2-3a80-4be4-a1e9-af3020f9305a")
    public InputPinSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d6e2f795-0ad3-4530-a77a-21e39546bbb2")
    @Override
    public String getName() {
        return "InputPin";
    }

    @objid ("cf3aee61-efd4-4c33-9e24-518ac1f89860")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("49969b4f-8e39-4483-b490-e48a8433d9e5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InputPin.class;
    }

    @objid ("2b46c298-028e-4d84-a39e-eec81f9a5881")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("72090221-70ea-4840-b9c4-d953ff7a9ac9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8585a666-f991-4c42-ae53-b33700e4822b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Pin");
        this.registerFactory(new InputPinObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isSelfAtt = new IsSelfSmAttribute();
        this.isSelfAtt.init("IsSelf", this, Boolean.class );
        registerAttribute(this.isSelfAtt);
        
        
        // Initialize and register the SmDependency
        this.handlerDep = new HandlerSmDependency();
        this.handlerDep.init("Handler", this, metamodel.getMClass("ExceptionHandler"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.handlerDep);
        
        this.inputingDep = new InputingSmDependency();
        this.inputingDep.init("Inputing", this, metamodel.getMClass("ActivityAction"), 0, 1 );
        registerDependency(this.inputingDep);
    }

    @objid ("75d94e32-5b5e-4df8-ae3c-34756bd5bc88")
    public SmAttribute getIsSelfAtt() {
        if (this.isSelfAtt == null) {
        	this.isSelfAtt = this.getAttributeDef("IsSelf");
        }
        return this.isSelfAtt;
    }

    @objid ("3f587398-a8ed-4c06-a6a7-67b879e1f84d")
    public SmDependency getHandlerDep() {
        if (this.handlerDep == null) {
        	this.handlerDep = this.getDependencyDef("Handler");
        }
        return this.handlerDep;
    }

    @objid ("f26f9c26-e951-4032-b2d4-9cec13febc74")
    public SmDependency getInputingDep() {
        if (this.inputingDep == null) {
        	this.inputingDep = this.getDependencyDef("Inputing");
        }
        return this.inputingDep;
    }

    @objid ("3bba4f7f-ad0c-4d66-a71d-140806258bd4")
    private static class InputPinObjectFactory implements ISmObjectFactory {
        @objid ("61e7a809-3ff9-406a-b51e-48dacd9f7709")
        private InputPinSmClass smClass;

        @objid ("22b2bdfa-ff7c-41bf-bb1b-a8b357afe4a8")
        public InputPinObjectFactory(InputPinSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2bf45037-9eaf-4327-bbd8-be68dfa48c9d")
        @Override
        public ISmObjectData createData() {
            return new InputPinData(this.smClass);
        }

        @objid ("e1a8a6cb-c552-4697-8baf-faa67bd5366d")
        @Override
        public SmObjectImpl createImpl() {
            return new InputPinImpl();
        }

    }

    @objid ("849c6cd8-9e4d-4cad-ae86-3917909f9417")
    public static class IsSelfSmAttribute extends SmAttribute {
        @objid ("d9ef8d8d-610d-45cc-876e-9d75e5825a3b")
        public Object getValue(ISmObjectData data) {
            return ((InputPinData) data).mIsSelf;
        }

        @objid ("aeb2e736-84a6-4a97-b6aa-f1e4e6eb66d1")
        public void setValue(ISmObjectData data, Object value) {
            ((InputPinData) data).mIsSelf = value;
        }

    }

    @objid ("4c903846-3339-4213-bde9-e3796407b7bb")
    public static class HandlerSmDependency extends SmMultipleDependency {
        @objid ("890b30c3-8b18-497d-a52e-8c0d709c64b0")
        private SmDependency symetricDep;

        @objid ("9e63c192-4df2-4b6f-a3a0-2f8fc901f704")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InputPinData)data).mHandler != null)? ((InputPinData)data).mHandler:SmMultipleDependency.EMPTY;
        }

        @objid ("80cfb84c-a4e8-461e-87b5-2f0c848555b0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InputPinData) data).mHandler = values;
        }

        @objid ("0f721498-0381-4327-bfe0-873bc39a816a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExceptionHandlerSmClass)this.getTarget()).getExceptionInputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1fb35290-ffd2-45ad-96d6-f8d33eba5f1b")
    public static class InputingSmDependency extends SmSingleDependency {
        @objid ("617c411a-b831-4c6a-970d-36e00daa110c")
        private SmDependency symetricDep;

        @objid ("e127024b-337f-4481-8634-bee9fc8f9742")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InputPinData) data).mInputing;
        }

        @objid ("ffe3e68c-acd2-468d-a962-ebae5c164d80")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InputPinData) data).mInputing = value;
        }

        @objid ("a2998d8a-3a3f-451a-951b-c668aa97b1b1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityActionSmClass)this.getTarget()).getInputDep();
            }
            return this.symetricDep;
        }

    }

}
