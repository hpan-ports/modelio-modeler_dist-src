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
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.impl.bpmn.activities.BpmnComplexBehaviorDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventSmClass;
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

@objid ("0c7e2bb3-5654-4514-8de6-3b68a364fb8f")
public class BpmnImplicitThrowEventSmClass extends BpmnThrowEventSmClass {
    @objid ("eaa7e358-9134-4ec5-afbb-4099b6d4e936")
    private SmDependency ownerDep;

    @objid ("1ca96d35-0f2a-4de7-aca7-39334f55d6ea")
    public BpmnImplicitThrowEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7cba97de-0b4a-4d20-8a82-54200a1fb979")
    @Override
    public String getName() {
        return "BpmnImplicitThrowEvent";
    }

    @objid ("4b131015-0722-4feb-8a6a-6ef8cd061b56")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5a4ea088-f5f5-461c-974f-1a4ec2dceb70")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnImplicitThrowEvent.class;
    }

    @objid ("08d38f18-c143-41ea-b710-799da3bb1ade")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7d02de2f-77c0-4e60-8e39-c0e470d6e4c7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("def1c5c7-8b72-464b-b7b0-3b24d0f69eba")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnThrowEvent");
        this.registerFactory(new BpmnImplicitThrowEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("BpmnComplexBehaviorDefinition"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("a7fda79e-2637-4fe5-ac26-94c76fed1ba8")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("14709aa8-fc2d-4644-a711-68c5a3cfc391")
    private static class BpmnImplicitThrowEventObjectFactory implements ISmObjectFactory {
        @objid ("af55960c-d807-4d79-b904-c190d1fd6182")
        private BpmnImplicitThrowEventSmClass smClass;

        @objid ("7476f913-5363-4925-a794-1bc933d15b45")
        public BpmnImplicitThrowEventObjectFactory(BpmnImplicitThrowEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("23ce39f2-3c94-4645-9d8b-2c300135d3a6")
        @Override
        public ISmObjectData createData() {
            return new BpmnImplicitThrowEventData(this.smClass);
        }

        @objid ("196fb636-d27a-4456-a425-7b85ca1a8f6a")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnImplicitThrowEventImpl();
        }

    }

    @objid ("1daa306c-c12e-4299-8c8a-6882194edc3d")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("cac6bff5-6ed2-460f-a437-afb7824cc6ab")
        private SmDependency symetricDep;

        @objid ("3add0150-9f5c-4ac9-aff2-068373b787d6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnImplicitThrowEventData) data).mOwner;
        }

        @objid ("d8f2c8d5-c161-4acd-a5a5-ecf0229b16fc")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnImplicitThrowEventData) data).mOwner = value;
        }

        @objid ("652a0a84-65fa-47a8-a380-05fad5c6ec56")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnComplexBehaviorDefinitionSmClass)this.getTarget()).getEventDep();
            }
            return this.symetricDep;
        }

    }

}
