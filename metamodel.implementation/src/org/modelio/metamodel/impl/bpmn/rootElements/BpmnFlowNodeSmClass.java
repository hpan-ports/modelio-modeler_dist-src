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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("099437a9-c4b0-48dd-8511-54c9ea9b442e")
public class BpmnFlowNodeSmClass extends BpmnFlowElementSmClass {
    @objid ("cc0961a4-5c2e-47bd-86ee-d2f4f8e9d46a")
    private SmDependency outgoingDep;

    @objid ("bee9fa0b-f992-4a49-9c1e-1f085b43a1b7")
    private SmDependency resourceDep;

    @objid ("511ec050-8747-4e2b-9381-a516b3567591")
    private SmDependency incomingDep;

    @objid ("9c126c39-70ec-405c-bc91-d1d0519a6f12")
    public BpmnFlowNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ae7f60cf-a983-417b-af5b-c4474ba74579")
    @Override
    public String getName() {
        return "BpmnFlowNode";
    }

    @objid ("8b69a522-0c75-4814-8a61-018d6d087535")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4506f18a-5d5d-41b2-96a9-24f9c9e492c9")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnFlowNode.class;
    }

    @objid ("6b5f6428-6983-43cf-a5e8-014bcae6ba5c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9282fb62-fc01-440b-b53a-ba6c00acaf2b")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("ca1c2c67-e286-4a4e-b80f-26f3f5a26d1f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowElement");
        this.registerFactory(new BpmnFlowNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.outgoingDep = new OutgoingSmDependency();
        this.outgoingDep.init("Outgoing", this, metamodel.getMClass("BpmnSequenceFlow"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.outgoingDep);
        
        this.resourceDep = new ResourceSmDependency();
        this.resourceDep.init("Resource", this, metamodel.getMClass("BpmnResourceRole"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.resourceDep);
        
        this.incomingDep = new IncomingSmDependency();
        this.incomingDep.init("Incoming", this, metamodel.getMClass("BpmnSequenceFlow"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.incomingDep);
    }

    @objid ("6c4945ac-fd4a-4e3d-8b76-93907f2a1a0f")
    public SmDependency getOutgoingDep() {
        if (this.outgoingDep == null) {
        	this.outgoingDep = this.getDependencyDef("Outgoing");
        }
        return this.outgoingDep;
    }

    @objid ("cd8a2ea1-5ac3-4100-ba7d-2c8ee1463a11")
    public SmDependency getResourceDep() {
        if (this.resourceDep == null) {
        	this.resourceDep = this.getDependencyDef("Resource");
        }
        return this.resourceDep;
    }

    @objid ("e652f475-b290-4125-b0eb-883bc3f47ac8")
    public SmDependency getIncomingDep() {
        if (this.incomingDep == null) {
        	this.incomingDep = this.getDependencyDef("Incoming");
        }
        return this.incomingDep;
    }

    @objid ("6e8efe49-5ce6-4e38-9645-b6654024892e")
    private static class BpmnFlowNodeObjectFactory implements ISmObjectFactory {
        @objid ("1324eb03-daed-4177-80f3-05c789b887e1")
        private BpmnFlowNodeSmClass smClass;

        @objid ("60462aef-25bf-4e8c-9167-1b2cac204ca5")
        public BpmnFlowNodeObjectFactory(BpmnFlowNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9761fb7b-3ac5-48a8-aad4-4cee6c03f299")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("e6ad55f9-6879-4117-836b-8fcd5b9cc281")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("389b6d37-2b9e-465b-846d-ac7b2e5990c2")
    public static class OutgoingSmDependency extends SmMultipleDependency {
        @objid ("ca559d8a-3506-42df-8706-ab7be7fbaaef")
        private SmDependency symetricDep;

        @objid ("6cad8c58-03d0-4448-9fd1-24255c6be96d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnFlowNodeData)data).mOutgoing != null)? ((BpmnFlowNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
        }

        @objid ("f294e8aa-e974-4517-8675-9a42eee7c62c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnFlowNodeData) data).mOutgoing = values;
        }

        @objid ("b7b80bba-9c01-4af1-aa02-e98b2ce1942e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getSourceRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("96bcb255-aa6c-42b1-a848-40a6536133b4")
    public static class ResourceSmDependency extends SmMultipleDependency {
        @objid ("851344d1-df34-43f8-81df-1235600cf919")
        private SmDependency symetricDep;

        @objid ("ad390afb-c11e-4b65-93d0-7ed07ca2fb70")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnFlowNodeData)data).mResource != null)? ((BpmnFlowNodeData)data).mResource:SmMultipleDependency.EMPTY;
        }

        @objid ("516901ef-a753-4307-b73a-86f5c95f385f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnFlowNodeData) data).mResource = values;
        }

        @objid ("bca49a55-12e5-458c-8b0b-55bbb4203bab")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceRoleSmClass)this.getTarget()).getAnnotatedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4e73fe86-5a7c-47dd-bdce-186e6cfb4dd4")
    public static class IncomingSmDependency extends SmMultipleDependency {
        @objid ("b9c86d2c-1d0e-4377-b5a4-81d87a803aea")
        private SmDependency symetricDep;

        @objid ("779321b3-5215-49c5-9d0c-0aa8f7fe3de5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnFlowNodeData)data).mIncoming != null)? ((BpmnFlowNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
        }

        @objid ("b17bffcc-c267-4cfe-b18f-0618fff0fdc5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnFlowNodeData) data).mIncoming = values;
        }

        @objid ("c932e158-1ce2-4549-9f54-91c2f2f3a0e7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getTargetRefDep();
            }
            return this.symetricDep;
        }

    }

}
