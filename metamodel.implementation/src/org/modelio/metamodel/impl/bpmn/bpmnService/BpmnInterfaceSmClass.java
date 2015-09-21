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
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
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

@objid ("6656867f-8de6-4af5-9946-c6cc4acc1e7c")
public class BpmnInterfaceSmClass extends BpmnRootElementSmClass {
    @objid ("cafed0a1-a772-4f41-8ab9-838aa896837a")
    private SmDependency implementationRefDep;

    @objid ("70bcc775-8a93-474d-8149-f15bcd0dd931")
    private SmDependency operationDep;

    @objid ("5f94f530-ebd3-4b72-9731-c924cd61590e")
    private SmDependency participantRefDep;

    @objid ("41c1290c-ba78-4b1b-bd11-557fb53a3cb7")
    public BpmnInterfaceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("594aed1b-a114-466e-bc3d-d5aa29627f9e")
    @Override
    public String getName() {
        return "BpmnInterface";
    }

    @objid ("3c0aeced-bda2-42f6-bd5e-82715e95104e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0afd6eb1-127e-4af5-8e7d-174d8cd6a799")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnInterface.class;
    }

    @objid ("47810ac3-9445-46e2-b406-40db76a570c0")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0d99a4e4-5f92-4118-8061-ba2c76a0c997")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ad30c7ef-1c14-40b5-855c-446e5ea990e5")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnInterfaceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.implementationRefDep = new ImplementationRefSmDependency();
        this.implementationRefDep.init("ImplementationRef", this, metamodel.getMClass("GeneralClass"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.implementationRefDep);
        
        this.operationDep = new OperationSmDependency();
        this.operationDep.init("Operation", this, metamodel.getMClass("BpmnOperation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.operationDep);
        
        this.participantRefDep = new ParticipantRefSmDependency();
        this.participantRefDep.init("ParticipantRef", this, metamodel.getMClass("BpmnParticipant"), 0, -1 );
        registerDependency(this.participantRefDep);
    }

    @objid ("8cfc6dc0-bec5-4a4b-92a8-fbd054268a90")
    public SmDependency getImplementationRefDep() {
        if (this.implementationRefDep == null) {
        	this.implementationRefDep = this.getDependencyDef("ImplementationRef");
        }
        return this.implementationRefDep;
    }

    @objid ("b1252cc3-0465-422e-9ea3-aab1eb94ff24")
    public SmDependency getOperationDep() {
        if (this.operationDep == null) {
        	this.operationDep = this.getDependencyDef("Operation");
        }
        return this.operationDep;
    }

    @objid ("0be7f61c-4e49-4d1f-96c9-812b57930366")
    public SmDependency getParticipantRefDep() {
        if (this.participantRefDep == null) {
        	this.participantRefDep = this.getDependencyDef("ParticipantRef");
        }
        return this.participantRefDep;
    }

    @objid ("7dd4b576-3171-4af7-b245-510ebc8dbcf9")
    private static class BpmnInterfaceObjectFactory implements ISmObjectFactory {
        @objid ("4c296677-8032-4693-bcf8-f5553b2599b4")
        private BpmnInterfaceSmClass smClass;

        @objid ("fe5a5c51-e3c4-4109-b576-001afa2a8a7a")
        public BpmnInterfaceObjectFactory(BpmnInterfaceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d4ba01ce-2d9e-418e-9262-e265943ad50f")
        @Override
        public ISmObjectData createData() {
            return new BpmnInterfaceData(this.smClass);
        }

        @objid ("3c3b2d1c-105c-41bb-a987-ce71ab28fa5b")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnInterfaceImpl();
        }

    }

    @objid ("17e838d7-5845-474d-96e8-62c110e22436")
    public static class ImplementationRefSmDependency extends SmSingleDependency {
        @objid ("73b70e32-3b34-4705-8cf3-bea6e5fdb31c")
        private SmDependency symetricDep;

        @objid ("43659465-9d48-451c-b74d-7cd406910ec9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnInterfaceData) data).mImplementationRef;
        }

        @objid ("968e728e-38dd-4dda-9f04-e68e8a46fa07")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnInterfaceData) data).mImplementationRef = value;
        }

        @objid ("b8cb050c-33ce-4309-976b-df491bb26959")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralClassSmClass)this.getTarget()).getBpmnInterfaceRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8065e188-1ee8-4716-97b3-6d56c96777c9")
    public static class OperationSmDependency extends SmMultipleDependency {
        @objid ("a98d876c-4add-4b48-9349-8bc166537c1e")
        private SmDependency symetricDep;

        @objid ("417780df-7fd5-4f39-9839-a89e015b6e49")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnInterfaceData)data).mOperation != null)? ((BpmnInterfaceData)data).mOperation:SmMultipleDependency.EMPTY;
        }

        @objid ("c8405e45-5313-4b70-b883-d5d4343db825")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnInterfaceData) data).mOperation = values;
        }

        @objid ("672233ad-157b-4443-bc00-15af249109d4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getBpmnInterfaceRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("78c6b55b-ea26-4c0c-a4db-9a04a65c435f")
    public static class ParticipantRefSmDependency extends SmMultipleDependency {
        @objid ("03e1a8ee-8dd7-43fc-9d8f-3387276ba632")
        private SmDependency symetricDep;

        @objid ("a11e7256-ba06-4fec-a600-10f6e74ef3ae")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnInterfaceData)data).mParticipantRef != null)? ((BpmnInterfaceData)data).mParticipantRef:SmMultipleDependency.EMPTY;
        }

        @objid ("ed00162e-ab28-49f9-b72f-cd6575466fc5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnInterfaceData) data).mParticipantRef = values;
        }

        @objid ("86b9da0e-d708-4752-a82a-564af9fc8af1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getInterfaceRefsDep();
            }
            return this.symetricDep;
        }

    }

}
