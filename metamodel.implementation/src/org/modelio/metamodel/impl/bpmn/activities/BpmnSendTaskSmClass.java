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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("036bd8e7-e725-4cb4-89a6-00823472c340")
public class BpmnSendTaskSmClass extends BpmnTaskSmClass {
    @objid ("a8b7cb41-750b-4da8-8a4f-f0b51d4a2ad4")
    private SmAttribute implementationAtt;

    @objid ("4855f7e7-fcd0-480d-9f7f-85aa0405d69c")
    private SmDependency messageRefDep;

    @objid ("7994d43e-fdd6-4957-a8e1-f5ae16ee7612")
    private SmDependency operationRefDep;

    @objid ("6424c8bd-6f65-44d1-8d53-25dfcfad13de")
    private SmDependency calledOperationDep;

    @objid ("76c2bf1a-a605-4663-b732-dae0da71350b")
    public BpmnSendTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7fe016d3-afe7-4ba0-85a8-8e160eece717")
    @Override
    public String getName() {
        return "BpmnSendTask";
    }

    @objid ("24fffa13-144f-4037-a731-a06a5898156d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("45b0ba61-16fa-493a-847b-4a10931feb3b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSendTask.class;
    }

    @objid ("9582dff7-c0db-4770-81e7-11db698025b2")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b4de4c23-8448-4fb4-b489-72d5477f030c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("80245042-c68b-432e-af05-e2a9a833c902")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnSendTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.implementationAtt = new ImplementationSmAttribute();
        this.implementationAtt.init("Implementation", this, String.class );
        registerAttribute(this.implementationAtt);
        
        
        // Initialize and register the SmDependency
        this.messageRefDep = new MessageRefSmDependency();
        this.messageRefDep.init("MessageRef", this, metamodel.getMClass("BpmnMessage"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.messageRefDep);
        
        this.operationRefDep = new OperationRefSmDependency();
        this.operationRefDep.init("OperationRef", this, metamodel.getMClass("BpmnOperation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.operationRefDep);
        
        this.calledOperationDep = new CalledOperationSmDependency();
        this.calledOperationDep.init("CalledOperation", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledOperationDep);
    }

    @objid ("ce53e85b-2d20-436c-b87d-42aac839315c")
    public SmAttribute getImplementationAtt() {
        if (this.implementationAtt == null) {
        	this.implementationAtt = this.getAttributeDef("Implementation");
        }
        return this.implementationAtt;
    }

    @objid ("5398a6f4-f3fe-47f5-b819-ddc81444c8fb")
    public SmDependency getMessageRefDep() {
        if (this.messageRefDep == null) {
        	this.messageRefDep = this.getDependencyDef("MessageRef");
        }
        return this.messageRefDep;
    }

    @objid ("48046bfb-c266-4f5e-9894-7fbb66301692")
    public SmDependency getOperationRefDep() {
        if (this.operationRefDep == null) {
        	this.operationRefDep = this.getDependencyDef("OperationRef");
        }
        return this.operationRefDep;
    }

    @objid ("be5d60db-bb9a-4b1e-8af2-b06f77c3faa2")
    public SmDependency getCalledOperationDep() {
        if (this.calledOperationDep == null) {
        	this.calledOperationDep = this.getDependencyDef("CalledOperation");
        }
        return this.calledOperationDep;
    }

    @objid ("58551993-d915-493e-8e73-c015fbf45054")
    private static class BpmnSendTaskObjectFactory implements ISmObjectFactory {
        @objid ("a98c7a54-e70b-45ea-b96f-8958f08a70df")
        private BpmnSendTaskSmClass smClass;

        @objid ("7b7923a0-ddce-45da-a951-4027c2b0ea3c")
        public BpmnSendTaskObjectFactory(BpmnSendTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("90aee256-ab41-4aca-8832-52d75bd28244")
        @Override
        public ISmObjectData createData() {
            return new BpmnSendTaskData(this.smClass);
        }

        @objid ("9b0ea8ed-930a-4bdb-a9cf-9be19d808a9d")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSendTaskImpl();
        }

    }

    @objid ("3d8ca334-605f-4c24-ae74-f6cfdcbae078")
    public static class ImplementationSmAttribute extends SmAttribute {
        @objid ("2bdd6617-02d8-4bce-bceb-38933bd56d4b")
        public Object getValue(ISmObjectData data) {
            return ((BpmnSendTaskData) data).mImplementation;
        }

        @objid ("fbbf4810-2f12-4b52-8981-487454d5a31e")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnSendTaskData) data).mImplementation = value;
        }

    }

    @objid ("aa81bf3f-9b89-449e-b722-212107efeac5")
    public static class MessageRefSmDependency extends SmSingleDependency {
        @objid ("2892336a-2e29-4a4c-88bd-f1f754465a79")
        private SmDependency symetricDep;

        @objid ("8dd6a261-c6f9-44a3-bc72-1374876311c1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSendTaskData) data).mMessageRef;
        }

        @objid ("248b3355-f41e-4a24-a6be-de9992b5e284")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSendTaskData) data).mMessageRef = value;
        }

        @objid ("7692b7ae-73c9-45ca-ba0f-76ea11a08216")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getSenderDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6d13ae12-0201-463a-860e-14927e2783da")
    public static class OperationRefSmDependency extends SmSingleDependency {
        @objid ("37bf4b1c-d873-4810-ac91-f65277e3cbb6")
        private SmDependency symetricDep;

        @objid ("f8bdc087-a08b-403a-bf38-41581beb589f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSendTaskData) data).mOperationRef;
        }

        @objid ("d2871c94-2e83-40b7-b4bd-efb8ff2c2dd2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSendTaskData) data).mOperationRef = value;
        }

        @objid ("54728348-3f65-46e3-9c93-70256d3062b2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getSenderDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4dbcbfc7-0d0d-4ec0-8332-b0a68a9ac3c8")
    public static class CalledOperationSmDependency extends SmSingleDependency {
        @objid ("14b41e27-b218-4cf8-a3a7-c860e010f2f0")
        private SmDependency symetricDep;

        @objid ("bc3adfc8-b078-48e3-a76f-f6af1cfaaebc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSendTaskData) data).mCalledOperation;
        }

        @objid ("51869f46-b04f-4df2-9fb9-af040eddf9a7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSendTaskData) data).mCalledOperation = value;
        }

        @objid ("e6ae82a8-eb0f-4cbc-b163-0c26905be0df")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCallerSendTaskDep();
            }
            return this.symetricDep;
        }

    }

}
