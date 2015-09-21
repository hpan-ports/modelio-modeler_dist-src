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
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterBindingSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeSmClass;
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

@objid ("1319bcee-ac9f-40ae-9ffb-8b062f330cac")
public class BpmnResourceRoleSmClass extends BpmnBaseElementSmClass {
    @objid ("6d7491cc-9001-491e-a23e-6028bcc7ce1a")
    private SmDependency resourceRefDep;

    @objid ("ecb5dfd4-c923-42ee-a504-b46117d3202d")
    private SmDependency annotatedDep;

    @objid ("56793f9e-b3b8-4adc-927a-b4c9ea6eec7e")
    private SmDependency resourceParameterBindingDep;

    @objid ("3508f4fa-78dd-4126-960b-cdeb08b9ea03")
    private SmDependency processDep;

    @objid ("78268e35-063a-4e3b-a73e-57dc390451b1")
    public BpmnResourceRoleSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f810518a-7aa8-4b17-aa57-ffa96dcb2a4a")
    @Override
    public String getName() {
        return "BpmnResourceRole";
    }

    @objid ("8cb3c512-64b5-4de2-8e7c-ce9f00d456f1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1c50c545-ab34-4632-9e51-f70ec6db2678")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnResourceRole.class;
    }

    @objid ("5ae06452-4231-4102-8a68-2f8945fe5540")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("2c2c9288-61ac-4ff3-96e2-95f7f2ae6b46")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("44f061ae-3058-41fc-81c7-72f8e26d001f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnResourceRoleObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.resourceRefDep = new ResourceRefSmDependency();
        this.resourceRefDep.init("ResourceRef", this, metamodel.getMClass("BpmnResource"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.resourceRefDep);
        
        this.annotatedDep = new AnnotatedSmDependency();
        this.annotatedDep.init("Annotated", this, metamodel.getMClass("BpmnFlowNode"), 0, 1 );
        registerDependency(this.annotatedDep);
        
        this.resourceParameterBindingDep = new ResourceParameterBindingSmDependency();
        this.resourceParameterBindingDep.init("ResourceParameterBinding", this, metamodel.getMClass("BpmnResourceParameterBinding"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.resourceParameterBindingDep);
        
        this.processDep = new ProcessSmDependency();
        this.processDep.init("Process", this, metamodel.getMClass("BpmnProcess"), 0, 1 );
        registerDependency(this.processDep);
    }

    @objid ("d2a040c1-f72a-4b24-bcd3-ed83a2d12235")
    public SmDependency getResourceRefDep() {
        if (this.resourceRefDep == null) {
        	this.resourceRefDep = this.getDependencyDef("ResourceRef");
        }
        return this.resourceRefDep;
    }

    @objid ("b7291b9a-4127-45d3-bcc2-ba7e286f7438")
    public SmDependency getAnnotatedDep() {
        if (this.annotatedDep == null) {
        	this.annotatedDep = this.getDependencyDef("Annotated");
        }
        return this.annotatedDep;
    }

    @objid ("f37e67a0-273f-454e-8aa1-bfb06f502863")
    public SmDependency getResourceParameterBindingDep() {
        if (this.resourceParameterBindingDep == null) {
        	this.resourceParameterBindingDep = this.getDependencyDef("ResourceParameterBinding");
        }
        return this.resourceParameterBindingDep;
    }

    @objid ("618ecaf1-7b6b-4010-bccd-3db532af7968")
    public SmDependency getProcessDep() {
        if (this.processDep == null) {
        	this.processDep = this.getDependencyDef("Process");
        }
        return this.processDep;
    }

    @objid ("8600cc23-02aa-4357-a836-91ef8bc1114d")
    private static class BpmnResourceRoleObjectFactory implements ISmObjectFactory {
        @objid ("aab3bc81-63ad-4351-9b31-65092fe77444")
        private BpmnResourceRoleSmClass smClass;

        @objid ("42393831-c5c0-4001-968d-51e8af3a6000")
        public BpmnResourceRoleObjectFactory(BpmnResourceRoleSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("38534c85-e42e-4931-b231-7e974b32ab6f")
        @Override
        public ISmObjectData createData() {
            return new BpmnResourceRoleData(this.smClass);
        }

        @objid ("3adc9c91-d7da-4ba7-8403-2bc895fccefe")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnResourceRoleImpl();
        }

    }

    @objid ("1dd584ce-01c2-4ebb-9094-b47308955b90")
    public static class ResourceRefSmDependency extends SmSingleDependency {
        @objid ("8ddf6790-c98f-451e-b1f3-9ed2111d3182")
        private SmDependency symetricDep;

        @objid ("05800b88-280d-467d-96e8-b63b9df2a7f8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceRoleData) data).mResourceRef;
        }

        @objid ("34d7c0dc-421d-47bd-987b-c9c2c3624011")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceRoleData) data).mResourceRef = value;
        }

        @objid ("c585aa17-5e02-4380-a81f-99d50dee7534")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceSmClass)this.getTarget()).getResourceroleRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("00471dfb-0bee-4429-b792-fd08f1f0b956")
    public static class AnnotatedSmDependency extends SmSingleDependency {
        @objid ("62fb2b5b-7c45-4512-914d-f4a25dade6e4")
        private SmDependency symetricDep;

        @objid ("b8b288ad-1e04-4deb-ba46-2de74e807b03")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceRoleData) data).mAnnotated;
        }

        @objid ("0dfde214-8503-4b96-9157-073ba3cc7981")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceRoleData) data).mAnnotated = value;
        }

        @objid ("25034942-cde7-406d-adde-3d312df6e555")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowNodeSmClass)this.getTarget()).getResourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a320b058-739a-4f41-82cc-4ca1e22d321b")
    public static class ResourceParameterBindingSmDependency extends SmMultipleDependency {
        @objid ("2232cb6d-1021-4f05-a90d-55f8d1708a65")
        private SmDependency symetricDep;

        @objid ("cf2ebb84-617f-4fda-b568-a6408b5e768e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnResourceRoleData)data).mResourceParameterBinding != null)? ((BpmnResourceRoleData)data).mResourceParameterBinding:SmMultipleDependency.EMPTY;
        }

        @objid ("873dfcb6-480c-43a5-8915-a545b9a65a1f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnResourceRoleData) data).mResourceParameterBinding = values;
        }

        @objid ("d2fa8402-a94f-444b-b0c7-b640ec79a909")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceParameterBindingSmClass)this.getTarget()).getResourceRoleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("632433e8-a5ca-4b14-8c90-79685bcdb668")
    public static class ProcessSmDependency extends SmSingleDependency {
        @objid ("045fc613-7d6a-4e02-8471-b181f414411b")
        private SmDependency symetricDep;

        @objid ("ca200da4-51c2-4030-926e-8ddc3ebccfd1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceRoleData) data).mProcess;
        }

        @objid ("bf9c10a4-47a6-4d3b-911f-e34a15979702")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceRoleData) data).mProcess = value;
        }

        @objid ("338fcd3a-71ff-4f5a-ab68-04e0979f338d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getResourceDep();
            }
            return this.symetricDep;
        }

    }

}
