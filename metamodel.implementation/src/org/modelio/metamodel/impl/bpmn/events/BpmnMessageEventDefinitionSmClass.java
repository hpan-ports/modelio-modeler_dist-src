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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageSmClass;
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

@objid ("497c40d4-2688-4ab1-a8a2-3842dfb95504")
public class BpmnMessageEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("a10e54ed-cfea-4578-ab22-cfd34e7d0101")
    private SmDependency messageRefDep;

    @objid ("cb9e5c07-3380-4788-8b4c-a00ad635e5a6")
    private SmDependency operationRefDep;

    @objid ("9fccf265-07ae-4e1a-82e2-674af1601f7f")
    public BpmnMessageEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d85b5804-852f-4d86-8322-e0bd7144655c")
    @Override
    public String getName() {
        return "BpmnMessageEventDefinition";
    }

    @objid ("3bd5ae87-fcac-430c-95f8-eb25b647182c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bfd6e882-4c43-49ee-8c2c-34ebc51ede6a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnMessageEventDefinition.class;
    }

    @objid ("ae9edb81-1252-4564-8c5b-77a24efc9498")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("424e8c30-e737-4426-97cc-5117999ad9c6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a92803e6-ba22-4748-9abc-4d55dea3caf6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnMessageEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.messageRefDep = new MessageRefSmDependency();
        this.messageRefDep.init("MessageRef", this, metamodel.getMClass("BpmnMessage"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.messageRefDep);
        
        this.operationRefDep = new OperationRefSmDependency();
        this.operationRefDep.init("OperationRef", this, metamodel.getMClass("BpmnOperation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.operationRefDep);
    }

    @objid ("8f73068f-dc49-4f9e-a7e1-43a0038f0038")
    public SmDependency getMessageRefDep() {
        if (this.messageRefDep == null) {
        	this.messageRefDep = this.getDependencyDef("MessageRef");
        }
        return this.messageRefDep;
    }

    @objid ("b30b9f23-2a50-4722-a3e0-5325f9d8fb73")
    public SmDependency getOperationRefDep() {
        if (this.operationRefDep == null) {
        	this.operationRefDep = this.getDependencyDef("OperationRef");
        }
        return this.operationRefDep;
    }

    @objid ("45a92433-59a3-4bb0-9e1b-fce9c4aba6d1")
    private static class BpmnMessageEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("0643eeef-f710-4394-97d8-da1e8c7d6e81")
        private BpmnMessageEventDefinitionSmClass smClass;

        @objid ("f0219d31-7928-4418-9766-08311b702fbb")
        public BpmnMessageEventDefinitionObjectFactory(BpmnMessageEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a7cb1040-662c-4422-8dfa-ead8c5df88e0")
        @Override
        public ISmObjectData createData() {
            return new BpmnMessageEventDefinitionData(this.smClass);
        }

        @objid ("d6dd0c77-ac41-4608-9188-4c3a9d5dd93d")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnMessageEventDefinitionImpl();
        }

    }

    @objid ("bfe68dc4-2bdd-4414-9baa-cd2f3978e4f4")
    public static class MessageRefSmDependency extends SmSingleDependency {
        @objid ("f5a16b6d-ced3-41bd-8ff8-9c09b3c397c1")
        private SmDependency symetricDep;

        @objid ("c1a3d626-52f1-4a2b-b2f9-9409d2800800")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageEventDefinitionData) data).mMessageRef;
        }

        @objid ("e4bcf187-2727-43db-aa57-c669da259c9e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageEventDefinitionData) data).mMessageRef = value;
        }

        @objid ("3f602c34-1ebb-40b1-bb38-9fa3fc9122ad")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMessageSmClass)this.getTarget()).getEventDefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c90be46f-74aa-4cf2-99c5-91fe17921c4b")
    public static class OperationRefSmDependency extends SmSingleDependency {
        @objid ("f99b4916-e4de-4c49-8a1b-b1b936215c3a")
        private SmDependency symetricDep;

        @objid ("ffd7484b-66e3-4089-b5ee-edbfe87ccd9d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMessageEventDefinitionData) data).mOperationRef;
        }

        @objid ("2d16fd75-4b85-4994-aa01-555a08b5e55d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMessageEventDefinitionData) data).mOperationRef = value;
        }

        @objid ("75b74ae3-7687-40e5-8206-4ff2553a2ec3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getEventDefinitionDep();
            }
            return this.symetricDep;
        }

    }

}
