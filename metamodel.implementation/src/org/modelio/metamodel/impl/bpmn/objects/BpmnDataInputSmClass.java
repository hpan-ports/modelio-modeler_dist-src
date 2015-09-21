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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
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

@objid ("3fc273f8-4522-4900-b978-5df64f292140")
public class BpmnDataInputSmClass extends BpmnItemAwareElementSmClass {
    @objid ("959f6cf7-1f13-4d02-9ae5-257769b5d06c")
    private SmDependency representedParameterDep;

    @objid ("7f583972-8f0b-4bfd-b97d-341714537b17")
    private SmDependency ownerLoopCharacteristicsDep;

    @objid ("d86c9129-764b-4d0b-b573-9ce03f92f5fa")
    private SmDependency ownerActivityDep;

    @objid ("3b9527a0-5e32-4b10-a190-457e7aeb1147")
    private SmDependency ownerThrowEventDep;

    @objid ("97c91e91-82d4-44bc-9d6d-4c583d9e5cae")
    public BpmnDataInputSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("43f31d82-2132-41dc-8677-414cf4484e74")
    @Override
    public String getName() {
        return "BpmnDataInput";
    }

    @objid ("85e2a1e7-37d1-40c7-9a14-33bcd1d1162f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("81dc1033-a6b2-459c-bfc9-4cef77f95f7f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataInput.class;
    }

    @objid ("42761d20-afba-481d-80f6-e0e753b879b6")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c6624a78-d1db-43a8-90d7-3488edc9f4b4")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("dd8e9607-2d15-4bbe-aa06-57531baaff13")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnItemAwareElement");
        this.registerFactory(new BpmnDataInputObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representedParameterDep = new RepresentedParameterSmDependency();
        this.representedParameterDep.init("RepresentedParameter", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedParameterDep);
        
        this.ownerLoopCharacteristicsDep = new OwnerLoopCharacteristicsSmDependency();
        this.ownerLoopCharacteristicsDep.init("OwnerLoopCharacteristics", this, metamodel.getMClass("BpmnMultiInstanceLoopCharacteristics"), 0, 1 );
        registerDependency(this.ownerLoopCharacteristicsDep);
        
        this.ownerActivityDep = new OwnerActivitySmDependency();
        this.ownerActivityDep.init("OwnerActivity", this, metamodel.getMClass("BpmnActivity"), 0, 1 );
        registerDependency(this.ownerActivityDep);
        
        this.ownerThrowEventDep = new OwnerThrowEventSmDependency();
        this.ownerThrowEventDep.init("OwnerThrowEvent", this, metamodel.getMClass("BpmnThrowEvent"), 0, 1 );
        registerDependency(this.ownerThrowEventDep);
    }

    @objid ("47d21cda-4473-4bac-a45c-cde72d3ef026")
    public SmDependency getRepresentedParameterDep() {
        if (this.representedParameterDep == null) {
        	this.representedParameterDep = this.getDependencyDef("RepresentedParameter");
        }
        return this.representedParameterDep;
    }

    @objid ("9f8ffa66-ebd5-4b9e-bc5a-1c5eec7ca95e")
    public SmDependency getOwnerLoopCharacteristicsDep() {
        if (this.ownerLoopCharacteristicsDep == null) {
        	this.ownerLoopCharacteristicsDep = this.getDependencyDef("OwnerLoopCharacteristics");
        }
        return this.ownerLoopCharacteristicsDep;
    }

    @objid ("62462b57-5e1a-4967-bce0-6f43bfc2aebc")
    public SmDependency getOwnerActivityDep() {
        if (this.ownerActivityDep == null) {
        	this.ownerActivityDep = this.getDependencyDef("OwnerActivity");
        }
        return this.ownerActivityDep;
    }

    @objid ("e1ccb848-3659-4a09-9632-ecc72e7d42b6")
    public SmDependency getOwnerThrowEventDep() {
        if (this.ownerThrowEventDep == null) {
        	this.ownerThrowEventDep = this.getDependencyDef("OwnerThrowEvent");
        }
        return this.ownerThrowEventDep;
    }

    @objid ("845b3596-abed-4546-a42d-f4cb22132b4b")
    private static class BpmnDataInputObjectFactory implements ISmObjectFactory {
        @objid ("125e6825-eeae-4155-a868-3164765aaf2a")
        private BpmnDataInputSmClass smClass;

        @objid ("5bb57e26-458e-4369-9dbf-e77c62d5c6ae")
        public BpmnDataInputObjectFactory(BpmnDataInputSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("07b8c746-341e-4f17-b7c1-ee0cbef9341d")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataInputData(this.smClass);
        }

        @objid ("db9921db-41e6-4b2a-8ca7-68108803f3f4")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataInputImpl();
        }

    }

    @objid ("58067a1d-6ee3-44f6-b879-80eb42629024")
    public static class RepresentedParameterSmDependency extends SmSingleDependency {
        @objid ("1ce3e9a5-934f-419f-afc3-d277348c08fc")
        private SmDependency symetricDep;

        @objid ("c59e0d57-5c7a-40bb-8c6d-98466bb77b2f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataInputData) data).mRepresentedParameter;
        }

        @objid ("1e16570f-cc05-4558-b35a-f51c0a9ac4ff")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataInputData) data).mRepresentedParameter = value;
        }

        @objid ("d155bede-1d26-4dce-91f8-6957bd583bf5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getBpmnRepresentingDataInputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("38bbd36c-e623-4526-aca1-3405df490805")
    public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
        @objid ("b7ae6db9-17a6-4fe5-9a97-e5b0fb65c73c")
        private SmDependency symetricDep;

        @objid ("8d027492-2dd5-425a-b97a-ad3a2e3250cd")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataInputData) data).mOwnerLoopCharacteristics;
        }

        @objid ("d88a4480-f684-4401-ab8d-d59558fc0d00")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataInputData) data).mOwnerLoopCharacteristics = value;
        }

        @objid ("c3157d11-315c-4471-ab45-7937bbc7ac39")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMultiInstanceLoopCharacteristicsSmClass)this.getTarget()).getLoopDataInputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("10299c17-2637-411e-a5e5-48802f15c723")
    public static class OwnerActivitySmDependency extends SmSingleDependency {
        @objid ("21064ef7-72e4-4736-942f-19e73dce94a7")
        private SmDependency symetricDep;

        @objid ("2b00042b-3659-4e2b-8fb6-61b8570b33ff")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataInputData) data).mOwnerActivity;
        }

        @objid ("3f79436f-657e-4dd8-a085-e52845725bba")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataInputData) data).mOwnerActivity = value;
        }

        @objid ("2fe49814-a936-4b1e-b905-91a651ce7d09")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getInputSpecificationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cfb39462-bc8a-4a5f-acc0-a237d081d7df")
    public static class OwnerThrowEventSmDependency extends SmSingleDependency {
        @objid ("a3084c62-1137-4005-9ff4-59db5adc3b71")
        private SmDependency symetricDep;

        @objid ("03ff301a-402d-4af7-b70b-c1bb4c66ca91")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataInputData) data).mOwnerThrowEvent;
        }

        @objid ("87a8646b-9a91-44a2-928a-ba376b971979")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataInputData) data).mOwnerThrowEvent = value;
        }

        @objid ("12f4e152-b947-4aee-bc53-f6ad5ff7f617")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnThrowEventSmClass)this.getTarget()).getDataInputDep();
            }
            return this.symetricDep;
        }

    }

}
