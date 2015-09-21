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
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
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

@objid ("93a2c0de-6f98-4374-9fa7-dc48f0ae1bd7")
public class BpmnReceiveTaskSmClass extends BpmnTaskSmClass {
    @objid ("792e7bca-4117-4076-aa36-5c96b84e498e")
    private SmAttribute implementationAtt;

    @objid ("d9614966-7a25-4548-8272-2f39dda23894")
    private SmAttribute instanciateAtt;

    @objid ("7e5c86d7-bf11-417a-b9a0-1a4b9db13369")
    private SmDependency messageRefDep;

    @objid ("6d209df5-46d0-4630-9d46-bacfae4e8f99")
    private SmDependency operationRefDep;

    @objid ("7e0395e6-d93b-4abd-b717-626ad34e6361")
    private SmDependency calledOperationDep;

    @objid ("cc8918ff-ff67-4c37-b0d0-0fa6e67e9646")
    public BpmnReceiveTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4d52a067-2b8a-48a7-9f28-cb99dd30abfb")
    @Override
    public String getName() {
        return "BpmnReceiveTask";
    }

    @objid ("dddc2ffb-9e1a-4e94-ace5-9b786d347931")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5729059f-348e-456b-a8ce-1f6e15d0d223")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnReceiveTask.class;
    }

    @objid ("c9b509f6-c3ad-4d67-b746-529ceb8818e9")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4676c5d0-4cc0-4c10-8299-92330a081c48")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e1b1b6ad-bd5d-4e43-9329-77094e1875d8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnReceiveTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.implementationAtt = new ImplementationSmAttribute();
        this.implementationAtt.init("Implementation", this, String.class );
        registerAttribute(this.implementationAtt);
        
        this.instanciateAtt = new InstanciateSmAttribute();
        this.instanciateAtt.init("Instanciate", this, Boolean.class );
        registerAttribute(this.instanciateAtt);
        
        
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

    @objid ("e77d4edb-912c-45f3-a178-39dcf760163e")
    public SmAttribute getImplementationAtt() {
        if (this.implementationAtt == null) {
        	this.implementationAtt = this.getAttributeDef("Implementation");
        }
        return this.implementationAtt;
    }

    @objid ("71d41f55-3323-42e4-a91d-a0edbc116a90")
    public SmAttribute getInstanciateAtt() {
        if (this.instanciateAtt == null) {
        	this.instanciateAtt = this.getAttributeDef("Instanciate");
        }
        return this.instanciateAtt;
    }

    @objid ("d6aba13f-c796-47af-8526-6544ff1629e6")
    public SmDependency getMessageRefDep() {
        if (this.messageRefDep == null) {
        	this.messageRefDep = this.getDependencyDef("MessageRef");
        }
        return this.messageRefDep;
    }

    @objid ("d7197a1a-4c2d-457d-a36a-82c4acc33d60")
    public SmDependency getOperationRefDep() {
        if (this.operationRefDep == null) {
        	this.operationRefDep = this.getDependencyDef("OperationRef");
        }
        return this.operationRefDep;
    }

    @objid ("4214e6e3-0bf0-4657-bb5c-66e849787ec5")
    public SmDependency getCalledOperationDep() {
        if (this.calledOperationDep == null) {
        	this.calledOperationDep = this.getDependencyDef("CalledOperation");
        }
        return this.calledOperationDep;
    }

    @objid ("e78f85c4-e34f-47b4-8d3d-28b61213e54d")
    private static class BpmnReceiveTaskObjectFactory implements ISmObjectFactory {
        @objid ("b3b297bb-250c-47fb-9d5e-5d1604514798")
        private BpmnReceiveTaskSmClass smClass;

        @objid ("285fa473-ab9f-463c-877a-911a221acc80")
        public BpmnReceiveTaskObjectFactory(BpmnReceiveTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3f1428ce-8275-49a7-88ee-c5007c7c665e")
        @Override
        public ISmObjectData createData() {
            return new BpmnReceiveTaskData(this.smClass);
        }

        @objid ("2804d663-a0e9-4a67-a59c-8d40a63395bf")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnReceiveTaskImpl();
        }

    }

    @objid ("32b5f4ae-64d6-4bce-8e2f-7247f1e4d20f")
    public static class ImplementationSmAttribute extends SmAttribute {
        @objid ("5ae61a85-e5fa-4410-a3be-18b4cabe0ce7")
        public Object getValue(ISmObjectData data) {
            return ((BpmnReceiveTaskData) data).mImplementation;
        }

        @objid ("01527c98-e18a-43f6-95c1-dff4a6192684")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnReceiveTaskData) data).mImplementation = value;
        }

    }

    @objid ("d7218831-9f04-498b-a0ca-82558f50948f")
    public static class InstanciateSmAttribute extends SmAttribute {
        @objid ("248d2e67-d9d0-4fb9-9437-0df1810d301b")
        public Object getValue(ISmObjectData data) {
            return ((BpmnReceiveTaskData) data).mInstanciate;
        }

        @objid ("6b2e5259-a32c-429c-ae74-12e71ef1c50c")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnReceiveTaskData) data).mInstanciate = value;
        }

    }

    @objid ("ca3153a7-2157-4c64-98cc-c464e411f285")
    public static class MessageRefSmDependency extends SmSingleDependency {
        @objid ("c570bc69-2dae-45c3-9926-3a0c850df06e")
        private SmDependency symetricDep;

        @objid ("64051fc8-5877-4a57-95db-68b8ff707a87")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnReceiveTaskData) data).mMessageRef;
        }

        @objid ("297d6eab-ea0d-4fe4-a8e0-99cf5beb1596")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnReceiveTaskData) data).mMessageRef = value;
        }

        @objid ("9bd2d1b7-e885-42f0-ab3f-a4ad4a9101e0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getReceiverDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e7405b76-1076-44a4-a4b9-fab7622aaf40")
    public static class OperationRefSmDependency extends SmSingleDependency {
        @objid ("b64eb550-3f5f-40c8-af05-e0be06afc093")
        private SmDependency symetricDep;

        @objid ("60a09e64-e850-4000-9e06-fcadc15577ea")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnReceiveTaskData) data).mOperationRef;
        }

        @objid ("ce3ca848-a3b9-47d8-bb3e-d3ba076bb05d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnReceiveTaskData) data).mOperationRef = value;
        }

        @objid ("f9f39815-6720-42d5-9dcf-c720b159bcd8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getReceiverDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("94dc95e9-3f88-41b2-9509-f9a6de9b0e86")
    public static class CalledOperationSmDependency extends SmSingleDependency {
        @objid ("82db77fe-8fcd-4d07-8a5b-918793159698")
        private SmDependency symetricDep;

        @objid ("f9ab58f4-87bd-44c7-91ec-9788bb767d0b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnReceiveTaskData) data).mCalledOperation;
        }

        @objid ("9a43aa1a-9e2a-420a-b234-19093d98f6da")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnReceiveTaskData) data).mCalledOperation = value;
        }

        @objid ("f129b039-d95e-4cb3-bef3-02e373ebd44d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCallerReceiveTaskDep();
            }
            return this.symetricDep;
        }

    }

}
