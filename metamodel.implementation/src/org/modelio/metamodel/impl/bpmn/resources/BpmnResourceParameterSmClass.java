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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterBindingSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceSmClass;
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

@objid ("5a6847cb-a94a-4380-b40b-1c6bd8001307")
public class BpmnResourceParameterSmClass extends BpmnBaseElementSmClass {
    @objid ("5f7dc41b-5503-448a-bdb8-0f7be08412c6")
    private SmAttribute isRequiredAtt;

    @objid ("bca49628-9400-4459-bd9d-1bc5a6599bb9")
    private SmDependency resourceDep;

    @objid ("05ce3f84-e7d9-4b40-8176-f1c04983e9d4")
    private SmDependency typeDep;

    @objid ("b69f5536-4171-4137-ba99-69b2ffb8b24a")
    private SmDependency parameterBindingRefsDep;

    @objid ("c26da368-20e2-4ad7-ae3d-cb3707777f74")
    public BpmnResourceParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a26c659b-2b11-49dc-aba4-12b417cf064b")
    @Override
    public String getName() {
        return "BpmnResourceParameter";
    }

    @objid ("7c63a4e7-94a1-4c9b-a345-89395d5af296")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("937058c4-bd8a-46f9-b918-3f0989ecaed7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnResourceParameter.class;
    }

    @objid ("9a85a5c2-2cac-47ae-8204-d57b2d5454b0")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("1c8e56e7-f9a3-4043-a3d9-d33ff19fbcf4")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("67234b18-33fd-4fca-86be-a488740cc8b5")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnResourceParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isRequiredAtt = new IsRequiredSmAttribute();
        this.isRequiredAtt.init("IsRequired", this, Boolean.class );
        registerAttribute(this.isRequiredAtt);
        
        
        // Initialize and register the SmDependency
        this.resourceDep = new ResourceSmDependency();
        this.resourceDep.init("Resource", this, metamodel.getMClass("BpmnResource"), 1, 1 );
        registerDependency(this.resourceDep);
        
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("BpmnItemDefinition"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.parameterBindingRefsDep = new ParameterBindingRefsSmDependency();
        this.parameterBindingRefsDep.init("ParameterBindingRefs", this, metamodel.getMClass("BpmnResourceParameterBinding"), 0, -1 );
        registerDependency(this.parameterBindingRefsDep);
    }

    @objid ("93767313-e4ad-4ca0-b09a-c4b5ac08ceb3")
    public SmAttribute getIsRequiredAtt() {
        if (this.isRequiredAtt == null) {
        	this.isRequiredAtt = this.getAttributeDef("IsRequired");
        }
        return this.isRequiredAtt;
    }

    @objid ("2ba3c2c1-e810-4bcc-b8e6-f8a2d04e396f")
    public SmDependency getResourceDep() {
        if (this.resourceDep == null) {
        	this.resourceDep = this.getDependencyDef("Resource");
        }
        return this.resourceDep;
    }

    @objid ("5bec0b1d-4b2f-4e2d-8fe1-ea59be9cbef5")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("a79e774b-82a2-4b41-ab1a-e3442b6a8707")
    public SmDependency getParameterBindingRefsDep() {
        if (this.parameterBindingRefsDep == null) {
        	this.parameterBindingRefsDep = this.getDependencyDef("ParameterBindingRefs");
        }
        return this.parameterBindingRefsDep;
    }

    @objid ("d174a498-d511-4b2d-adbf-ab7588eeae91")
    private static class BpmnResourceParameterObjectFactory implements ISmObjectFactory {
        @objid ("bc2cc197-0e1e-43d7-8ba2-e2f0d0e42769")
        private BpmnResourceParameterSmClass smClass;

        @objid ("05b26579-2efc-41de-a699-0bbebcbafbd5")
        public BpmnResourceParameterObjectFactory(BpmnResourceParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("70bfc77b-b5c3-46d4-a0c5-91f2e091c5c5")
        @Override
        public ISmObjectData createData() {
            return new BpmnResourceParameterData(this.smClass);
        }

        @objid ("bd7d974d-4d06-4855-9b82-3d09ff51c4bc")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnResourceParameterImpl();
        }

    }

    @objid ("664c182c-a01b-4db0-84a9-6d8a6216560c")
    public static class IsRequiredSmAttribute extends SmAttribute {
        @objid ("1f226433-eab6-4376-a4ea-60d193a124c8")
        public Object getValue(ISmObjectData data) {
            return ((BpmnResourceParameterData) data).mIsRequired;
        }

        @objid ("0b461cdb-4307-4c02-9d77-6c3f709c7294")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnResourceParameterData) data).mIsRequired = value;
        }

    }

    @objid ("066041bd-0def-4393-99d2-5c5071630c91")
    public static class ResourceSmDependency extends SmSingleDependency {
        @objid ("ceed09ea-c7cf-4058-871e-169068fcc197")
        private SmDependency symetricDep;

        @objid ("ab654588-b2ad-473b-8d6d-2ad733f605e1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceParameterData) data).mResource;
        }

        @objid ("b3f5633a-a8ab-43a7-8bbe-a1a0c2420ea8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceParameterData) data).mResource = value;
        }

        @objid ("11344f3d-c52d-44b8-8c9e-04388846764e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceSmClass)this.getTarget()).getParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9ef51d03-a472-494a-b354-75a813b35bd8")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("98fa36cd-dc40-4f8b-aebb-29d6be55eff5")
        private SmDependency symetricDep;

        @objid ("a89636a5-7df9-450b-9064-d1ea99a2632c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceParameterData) data).mType;
        }

        @objid ("d66a1f07-713b-4f05-a4ed-02756de08f17")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceParameterData) data).mType = value;
        }

        @objid ("7f2efc3c-ebce-483d-b1c8-7e004b503bc6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemDefinitionSmClass)this.getTarget()).getTypedResourceParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1d1d44bd-4930-4762-8ee8-57faede83965")
    public static class ParameterBindingRefsSmDependency extends SmMultipleDependency {
        @objid ("61dfc895-808c-4271-8f52-56819bcb6690")
        private SmDependency symetricDep;

        @objid ("d15b2e08-ba47-4196-9c3d-c8ce3777d7c0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnResourceParameterData)data).mParameterBindingRefs != null)? ((BpmnResourceParameterData)data).mParameterBindingRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("5200e4fb-76bb-4e34-9cc4-c5a7b0409b3a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnResourceParameterData) data).mParameterBindingRefs = values;
        }

        @objid ("7da40b51-9bb2-4efe-8441-48e9b0fcf107")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceParameterBindingSmClass)this.getTarget()).getParameterRefDep();
            }
            return this.symetricDep;
        }

    }

}
