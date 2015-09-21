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
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnAssociationSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
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

@objid ("1c593681-5de5-4212-904d-ddce18beddaf")
public class BpmnBaseElementSmClass extends ModelElementSmClass {
    @objid ("03f4de3b-c323-496b-8cdb-f4c1fb83c7a6")
    private SmDependency outgoingAssocDep;

    @objid ("d86b3ebc-cb04-4ee8-80a9-4ffc6273f95b")
    private SmDependency incomingAssocDep;

    @objid ("1174cb3f-40f1-4662-8ed8-be98502a9790")
    private SmDependency incomingFlowDep;

    @objid ("a7da2c21-7bac-40f9-8fb5-f98af9d6c8e4")
    private SmDependency outgoingFlowDep;

    @objid ("a68a2301-ec39-46b7-8b57-18f4ccc15e1c")
    public BpmnBaseElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f67f2900-ae0c-4d53-b036-8821b3d1ab37")
    @Override
    public String getName() {
        return "BpmnBaseElement";
    }

    @objid ("50294c05-e79f-4311-b3b5-a7ce90a950f5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7dc5d40d-9953-4526-8b75-f5d64e5d8627")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnBaseElement.class;
    }

    @objid ("4a9daf28-b6e4-46de-81c9-5d19c3856a8b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("69be3471-adc9-43e1-9923-d33c015ca378")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("d08bc65c-0ac8-4a82-b597-e09160d36496")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new BpmnBaseElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.outgoingAssocDep = new OutgoingAssocSmDependency();
        this.outgoingAssocDep.init("OutgoingAssoc", this, metamodel.getMClass("BpmnAssociation"), 0, -1 );
        registerDependency(this.outgoingAssocDep);
        
        this.incomingAssocDep = new IncomingAssocSmDependency();
        this.incomingAssocDep.init("IncomingAssoc", this, metamodel.getMClass("BpmnAssociation"), 0, -1 );
        registerDependency(this.incomingAssocDep);
        
        this.incomingFlowDep = new IncomingFlowSmDependency();
        this.incomingFlowDep.init("IncomingFlow", this, metamodel.getMClass("BpmnMessageFlow"), 0, -1 );
        registerDependency(this.incomingFlowDep);
        
        this.outgoingFlowDep = new OutgoingFlowSmDependency();
        this.outgoingFlowDep.init("OutgoingFlow", this, metamodel.getMClass("BpmnMessageFlow"), 0, -1 );
        registerDependency(this.outgoingFlowDep);
    }

    @objid ("3440df3b-a792-44f6-b3ca-9e7fd206fb64")
    public SmDependency getOutgoingAssocDep() {
        if (this.outgoingAssocDep == null) {
        	this.outgoingAssocDep = this.getDependencyDef("OutgoingAssoc");
        }
        return this.outgoingAssocDep;
    }

    @objid ("bf9a73eb-b6cc-4712-ac17-91d71e23780d")
    public SmDependency getIncomingAssocDep() {
        if (this.incomingAssocDep == null) {
        	this.incomingAssocDep = this.getDependencyDef("IncomingAssoc");
        }
        return this.incomingAssocDep;
    }

    @objid ("a8d06128-d079-4086-9beb-acf5e8e5881b")
    public SmDependency getIncomingFlowDep() {
        if (this.incomingFlowDep == null) {
        	this.incomingFlowDep = this.getDependencyDef("IncomingFlow");
        }
        return this.incomingFlowDep;
    }

    @objid ("6664ee12-b3bb-4e09-974f-f52ac816eec1")
    public SmDependency getOutgoingFlowDep() {
        if (this.outgoingFlowDep == null) {
        	this.outgoingFlowDep = this.getDependencyDef("OutgoingFlow");
        }
        return this.outgoingFlowDep;
    }

    @objid ("23e0efd5-18bd-4192-9d52-18100a46abd4")
    private static class BpmnBaseElementObjectFactory implements ISmObjectFactory {
        @objid ("5ed0cf40-eaeb-44a7-bbe3-317d3b01e5c3")
        private BpmnBaseElementSmClass smClass;

        @objid ("2cd7ecb9-3ec7-418d-9cfc-12663d37c2d1")
        public BpmnBaseElementObjectFactory(BpmnBaseElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("01569b08-8ff5-4d5e-a82a-9f016a514474")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("c1f743e9-7e57-4f47-b347-9868d3f55daa")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("51c0946f-9d5c-4441-85dd-8fee5f846384")
    public static class OutgoingAssocSmDependency extends SmMultipleDependency {
        @objid ("f867c519-126f-4e0c-930a-24f653f2282e")
        private SmDependency symetricDep;

        @objid ("de346024-5ce7-43fc-aba0-0851c6d190a6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnBaseElementData)data).mOutgoingAssoc != null)? ((BpmnBaseElementData)data).mOutgoingAssoc:SmMultipleDependency.EMPTY;
        }

        @objid ("8e301abd-9d11-431a-a0ad-a9d246b78050")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnBaseElementData) data).mOutgoingAssoc = values;
        }

        @objid ("1eb25b99-72aa-4d85-a00d-aab7da6c492c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnAssociationSmClass)this.getTarget()).getSourceRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a4b80f10-fdda-4248-8742-29071704d752")
    public static class IncomingAssocSmDependency extends SmMultipleDependency {
        @objid ("a7e4db02-37df-4ee6-8bf0-8b5b067b7bb7")
        private SmDependency symetricDep;

        @objid ("c8306711-ff4e-44c4-ac7b-5c7afbd9666e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnBaseElementData)data).mIncomingAssoc != null)? ((BpmnBaseElementData)data).mIncomingAssoc:SmMultipleDependency.EMPTY;
        }

        @objid ("ebcb834a-b1ce-4e82-8bfd-556625ac3a9a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnBaseElementData) data).mIncomingAssoc = values;
        }

        @objid ("7cee3f70-d03a-479e-9af5-b7b047c0eab2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnAssociationSmClass)this.getTarget()).getTargetRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a4be3e4d-fe50-47b8-9624-abd5b6c348bd")
    public static class IncomingFlowSmDependency extends SmMultipleDependency {
        @objid ("e34d4584-3592-4bb5-8096-1209365ec321")
        private SmDependency symetricDep;

        @objid ("278f3889-e9c7-4369-98e4-99731ebffa09")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnBaseElementData)data).mIncomingFlow != null)? ((BpmnBaseElementData)data).mIncomingFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("5f7fd987-5efc-4022-860a-08101ca9f6be")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnBaseElementData) data).mIncomingFlow = values;
        }

        @objid ("158b8874-abe7-482e-994a-cabee3fcc8f6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageFlowSmClass)this.getTarget()).getTargetRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c447553b-9aed-4f1a-bd42-a0e9af26a4c1")
    public static class OutgoingFlowSmDependency extends SmMultipleDependency {
        @objid ("a4e88c2c-79b2-4583-8a14-6b1f8ee53964")
        private SmDependency symetricDep;

        @objid ("3e6c1544-3863-4032-badc-9ddf874f11cb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnBaseElementData)data).mOutgoingFlow != null)? ((BpmnBaseElementData)data).mOutgoingFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("78db8870-f94b-4730-b350-91aa13cdc1dd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnBaseElementData) data).mOutgoingFlow = values;
        }

        @objid ("4722a84b-a197-4943-a18e-3b7eae2585a5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageFlowSmClass)this.getTarget()).getSourceRefDep();
            }
            return this.symetricDep;
        }

    }

}
