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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnServiceTaskSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnMessageEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
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

@objid ("0fe74703-9e94-4efe-a402-d2b779a10567")
public class BpmnOperationSmClass extends BpmnBaseElementSmClass {
    @objid ("839634c2-9363-417c-825a-d24262f5ce7c")
    private SmDependency senderDep;

    @objid ("83b2e26d-cf32-4faf-8a57-342730cdbeeb")
    private SmDependency inMessageRefDep;

    @objid ("80d4f996-c301-4ec8-a7ef-b049f7849069")
    private SmDependency callerDep;

    @objid ("08878897-580f-4d23-8c05-6e823efd4463")
    private SmDependency outMessageRefDep;

    @objid ("226a9fd0-c3fb-4b84-85bf-61feb24e50e0")
    private SmDependency eventDefinitionDep;

    @objid ("951833a4-f85d-42d3-b2bd-46f54afc63d3")
    private SmDependency implementationRefDep;

    @objid ("2d732677-dc89-4627-b649-38a8beb8419b")
    private SmDependency bpmnInterfaceRefDep;

    @objid ("7796b4db-5c75-4f19-850f-d61a0dc9c500")
    private SmDependency receiverDep;

    @objid ("6a98b4b6-6956-4d4a-9cb8-7074bdece922")
    public BpmnOperationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0234410e-2b94-4b2c-9454-5cb48b10dd60")
    @Override
    public String getName() {
        return "BpmnOperation";
    }

    @objid ("f8c3e447-0f0e-47a0-afdb-a17ae97d4bc2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("146cbbe3-980c-4a8a-985c-cc58268eefe5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnOperation.class;
    }

    @objid ("735fa93a-73f0-4df7-a513-2cdcd8d6f7df")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("434739b8-c302-4d39-b14a-4bc3ea42bc07")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("48c58cdd-9a55-4561-b39c-3b674bb63af8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnOperationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.senderDep = new SenderSmDependency();
        this.senderDep.init("Sender", this, metamodel.getMClass("BpmnSendTask"), 0, -1 );
        registerDependency(this.senderDep);
        
        this.inMessageRefDep = new InMessageRefSmDependency();
        this.inMessageRefDep.init("InMessageRef", this, metamodel.getMClass("BpmnMessage"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.inMessageRefDep);
        
        this.callerDep = new CallerSmDependency();
        this.callerDep.init("Caller", this, metamodel.getMClass("BpmnServiceTask"), 0, -1 );
        registerDependency(this.callerDep);
        
        this.outMessageRefDep = new OutMessageRefSmDependency();
        this.outMessageRefDep.init("OutMessageRef", this, metamodel.getMClass("BpmnMessage"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.outMessageRefDep);
        
        this.eventDefinitionDep = new EventDefinitionSmDependency();
        this.eventDefinitionDep.init("EventDefinition", this, metamodel.getMClass("BpmnMessageEventDefinition"), 0, -1 );
        registerDependency(this.eventDefinitionDep);
        
        this.implementationRefDep = new ImplementationRefSmDependency();
        this.implementationRefDep.init("ImplementationRef", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.implementationRefDep);
        
        this.bpmnInterfaceRefDep = new BpmnInterfaceRefSmDependency();
        this.bpmnInterfaceRefDep.init("BpmnInterfaceRef", this, metamodel.getMClass("BpmnInterface"), 1, 1 );
        registerDependency(this.bpmnInterfaceRefDep);
        
        this.receiverDep = new ReceiverSmDependency();
        this.receiverDep.init("Receiver", this, metamodel.getMClass("BpmnReceiveTask"), 0, -1 );
        registerDependency(this.receiverDep);
    }

    @objid ("af0f5a98-673f-4bed-8b3a-294829e779ea")
    public SmDependency getSenderDep() {
        if (this.senderDep == null) {
        	this.senderDep = this.getDependencyDef("Sender");
        }
        return this.senderDep;
    }

    @objid ("272021d6-50d3-42b2-a12a-281a2f02f765")
    public SmDependency getInMessageRefDep() {
        if (this.inMessageRefDep == null) {
        	this.inMessageRefDep = this.getDependencyDef("InMessageRef");
        }
        return this.inMessageRefDep;
    }

    @objid ("a17ff67b-3fff-401f-a9be-7c1f4787af0e")
    public SmDependency getCallerDep() {
        if (this.callerDep == null) {
        	this.callerDep = this.getDependencyDef("Caller");
        }
        return this.callerDep;
    }

    @objid ("18f03ceb-2908-427b-9d66-46ace1f01d5e")
    public SmDependency getOutMessageRefDep() {
        if (this.outMessageRefDep == null) {
        	this.outMessageRefDep = this.getDependencyDef("OutMessageRef");
        }
        return this.outMessageRefDep;
    }

    @objid ("6ddbb7f3-9a6d-4894-ab0d-c93df329c3a7")
    public SmDependency getEventDefinitionDep() {
        if (this.eventDefinitionDep == null) {
        	this.eventDefinitionDep = this.getDependencyDef("EventDefinition");
        }
        return this.eventDefinitionDep;
    }

    @objid ("a4619209-a9af-40f6-8f4f-675c1d382d72")
    public SmDependency getImplementationRefDep() {
        if (this.implementationRefDep == null) {
        	this.implementationRefDep = this.getDependencyDef("ImplementationRef");
        }
        return this.implementationRefDep;
    }

    @objid ("79ff352f-67c4-42be-ab28-37d1f47ff72a")
    public SmDependency getBpmnInterfaceRefDep() {
        if (this.bpmnInterfaceRefDep == null) {
        	this.bpmnInterfaceRefDep = this.getDependencyDef("BpmnInterfaceRef");
        }
        return this.bpmnInterfaceRefDep;
    }

    @objid ("3663d641-85a7-400b-98d0-623e9e7df5d7")
    public SmDependency getReceiverDep() {
        if (this.receiverDep == null) {
        	this.receiverDep = this.getDependencyDef("Receiver");
        }
        return this.receiverDep;
    }

    @objid ("f00e3c43-7ff7-449c-af11-3ed17aefcd3c")
    private static class BpmnOperationObjectFactory implements ISmObjectFactory {
        @objid ("a8303604-4ef7-432f-970c-27046437be3c")
        private BpmnOperationSmClass smClass;

        @objid ("8c0d3c62-495b-4c09-8562-8f1c0250e729")
        public BpmnOperationObjectFactory(BpmnOperationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8a4e9455-7bad-4e28-a041-d732678543a0")
        @Override
        public ISmObjectData createData() {
            return new BpmnOperationData(this.smClass);
        }

        @objid ("5f71623c-2a01-434e-b09a-66a3e1e5923f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnOperationImpl();
        }

    }

    @objid ("339da8ce-f116-402a-adc0-860cc949d28e")
    public static class SenderSmDependency extends SmMultipleDependency {
        @objid ("85d923e6-941d-4a0e-a710-a7be3e53763a")
        private SmDependency symetricDep;

        @objid ("62bd0d4c-a5d1-42c0-a8f5-ddb07c3d6ded")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnOperationData)data).mSender != null)? ((BpmnOperationData)data).mSender:SmMultipleDependency.EMPTY;
        }

        @objid ("7d0ad85c-42b6-4698-af9b-0f3f99c4720a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnOperationData) data).mSender = values;
        }

        @objid ("85d72aad-7b42-4c66-b642-91524dbebb0c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSendTaskSmClass)this.getTarget()).getOperationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2ff5b268-826b-4929-bee2-1e8641e8508a")
    public static class InMessageRefSmDependency extends SmSingleDependency {
        @objid ("471ae824-8ff3-4fa8-a16d-f0887a722d0c")
        private SmDependency symetricDep;

        @objid ("cc42dbda-6967-4474-aa82-dd4c2b924ec4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnOperationData) data).mInMessageRef;
        }

        @objid ("30cf898c-9baa-428f-af41-c4057582c925")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnOperationData) data).mInMessageRef = value;
        }

        @objid ("20434de5-3de5-4983-b54f-3bfc4c136823")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getInputMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fb949280-355c-44db-9dea-045819063588")
    public static class CallerSmDependency extends SmMultipleDependency {
        @objid ("33c6382c-bbd8-4cc4-9647-9b69fc617dbe")
        private SmDependency symetricDep;

        @objid ("827a31c7-e9bc-40ae-b178-6280c2d640bc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnOperationData)data).mCaller != null)? ((BpmnOperationData)data).mCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("a1d0b8bb-06b6-411e-9f2b-8b7f8c34f568")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnOperationData) data).mCaller = values;
        }

        @objid ("ac0d604c-d265-4de1-b1f7-58a88adf4c09")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnServiceTaskSmClass)this.getTarget()).getOperationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("aa5fb575-bae7-4a2f-abea-4319893b2533")
    public static class OutMessageRefSmDependency extends SmSingleDependency {
        @objid ("ee720b9a-df98-4b0d-8dbb-993e27e46a70")
        private SmDependency symetricDep;

        @objid ("bf18051a-dcfb-42d0-8ce0-f7e55acd66af")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnOperationData) data).mOutMessageRef;
        }

        @objid ("184b6ca8-0f7f-4b7d-aaf6-d40aac7fabe5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnOperationData) data).mOutMessageRef = value;
        }

        @objid ("087e2465-9692-4f81-bd0d-2a1a6945ccc8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getOutputMessageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2473de1f-3d4e-4ecd-acfd-4553ef659654")
    public static class EventDefinitionSmDependency extends SmMultipleDependency {
        @objid ("bf09dc24-44b4-4b34-a36f-9fd013b2bc44")
        private SmDependency symetricDep;

        @objid ("64f53130-d960-4b94-8a75-ccc5561c505b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnOperationData)data).mEventDefinition != null)? ((BpmnOperationData)data).mEventDefinition:SmMultipleDependency.EMPTY;
        }

        @objid ("3882fd98-7fcc-4e88-b961-d475b7089caa")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnOperationData) data).mEventDefinition = values;
        }

        @objid ("0384101f-3430-4ff5-b140-c2033d109ffa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageEventDefinitionSmClass)this.getTarget()).getOperationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("59b343d8-21f5-4942-b77c-ddba906699ef")
    public static class ImplementationRefSmDependency extends SmSingleDependency {
        @objid ("9c560516-9f8d-4fb2-8e72-feb5e1221ec9")
        private SmDependency symetricDep;

        @objid ("9f157f96-6979-4f08-b262-8cf17c22c011")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnOperationData) data).mImplementationRef;
        }

        @objid ("dfedee94-b8f9-45a8-9b9b-2dc91ae465ad")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnOperationData) data).mImplementationRef = value;
        }

        @objid ("f9522eea-9910-4d32-b94e-7e38dcc8eb04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getBpmnOperationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cc066b8d-f41c-4ee4-a5a7-5b3bdd4a82f2")
    public static class BpmnInterfaceRefSmDependency extends SmSingleDependency {
        @objid ("8ce7309e-8d72-4072-88e3-76d030ecce4b")
        private SmDependency symetricDep;

        @objid ("745a44e2-99f4-42bd-99ce-61604f4d0765")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnOperationData) data).mBpmnInterfaceRef;
        }

        @objid ("a265debe-4469-4267-8233-0755e19cf303")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnOperationData) data).mBpmnInterfaceRef = value;
        }

        @objid ("36701edd-f876-44ee-aa91-026ff69eea70")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnInterfaceSmClass)this.getTarget()).getOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f8cce949-eda5-4e78-8e78-6e3de437ea1a")
    public static class ReceiverSmDependency extends SmMultipleDependency {
        @objid ("ba2ea0bf-78a1-404e-a147-3f84f6929f98")
        private SmDependency symetricDep;

        @objid ("ad0bfe58-feb1-40ef-a7d7-207eccca95e9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnOperationData)data).mReceiver != null)? ((BpmnOperationData)data).mReceiver:SmMultipleDependency.EMPTY;
        }

        @objid ("7101be0b-54e9-4bfa-81da-c2c287d016df")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnOperationData) data).mReceiver = values;
        }

        @objid ("7d9314bf-1f2c-491f-8b3b-cdddd567ccd8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnReceiveTaskSmClass)this.getTarget()).getOperationRefDep();
            }
            return this.symetricDep;
        }

    }

}
