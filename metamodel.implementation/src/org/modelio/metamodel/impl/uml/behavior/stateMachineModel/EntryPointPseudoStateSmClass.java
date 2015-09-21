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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.AbstractPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
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

@objid ("235804a1-d997-4750-84a6-c6994e26fecd")
public class EntryPointPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("00648f14-ca92-4ae9-b1ab-d52a8d2ae31f")
    private SmDependency entryOfDep;

    @objid ("1b8fd27f-9056-4b67-b3be-9850f12f65cb")
    private SmDependency connectionDep;

    @objid ("1f4a67f1-deb0-4075-947c-e31486559fcc")
    private SmDependency entryOfMachineDep;

    @objid ("0028d5c4-8e0f-47f9-a18c-022196cc95fe")
    public EntryPointPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("bd0ff69f-8f31-47ca-99c1-e5cd8bf24970")
    @Override
    public String getName() {
        return "EntryPointPseudoState";
    }

    @objid ("e774a557-8ce9-4795-8df4-5d5a7ffd7a5f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c826002c-1e20-4a13-86d0-6a847b31a5f8")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return EntryPointPseudoState.class;
    }

    @objid ("c69b38eb-8fa5-4ab7-aafb-dd8293700983")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("979e7ba1-b772-4df7-84f3-c465a10291b7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("01d7367c-e4ec-4648-b2d4-54424e455d06")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new EntryPointPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.entryOfDep = new EntryOfSmDependency();
        this.entryOfDep.init("EntryOf", this, metamodel.getMClass("State"), 0, 1 );
        registerDependency(this.entryOfDep);
        
        this.connectionDep = new ConnectionSmDependency();
        this.connectionDep.init("Connection", this, metamodel.getMClass("ConnectionPointReference"), 0, -1 );
        registerDependency(this.connectionDep);
        
        this.entryOfMachineDep = new EntryOfMachineSmDependency();
        this.entryOfMachineDep.init("EntryOfMachine", this, metamodel.getMClass("StateMachine"), 0, 1 );
        registerDependency(this.entryOfMachineDep);
    }

    @objid ("5204ef9f-5688-429c-8fdf-c9d86a039e21")
    public SmDependency getEntryOfDep() {
        if (this.entryOfDep == null) {
        	this.entryOfDep = this.getDependencyDef("EntryOf");
        }
        return this.entryOfDep;
    }

    @objid ("7daa49cb-462d-4e77-940d-2af8b9e55e6f")
    public SmDependency getConnectionDep() {
        if (this.connectionDep == null) {
        	this.connectionDep = this.getDependencyDef("Connection");
        }
        return this.connectionDep;
    }

    @objid ("125489c7-a083-4396-8e0a-7a9567b19320")
    public SmDependency getEntryOfMachineDep() {
        if (this.entryOfMachineDep == null) {
        	this.entryOfMachineDep = this.getDependencyDef("EntryOfMachine");
        }
        return this.entryOfMachineDep;
    }

    @objid ("de50ec82-1413-4b5d-9752-a66ef637c459")
    private static class EntryPointPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("3a29948e-1d7f-4c89-a113-22e9e597f1f7")
        private EntryPointPseudoStateSmClass smClass;

        @objid ("0f45d691-043c-4406-8cc8-e9ff22a76ec6")
        public EntryPointPseudoStateObjectFactory(EntryPointPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("5b4f6222-bde7-461e-92e8-4b50a819db29")
        @Override
        public ISmObjectData createData() {
            return new EntryPointPseudoStateData(this.smClass);
        }

        @objid ("4784986e-81e0-44ae-98c9-79d048a9987f")
        @Override
        public SmObjectImpl createImpl() {
            return new EntryPointPseudoStateImpl();
        }

    }

    @objid ("3315cc40-aadd-4d1c-ad42-a61743b2bf50")
    public static class EntryOfSmDependency extends SmSingleDependency {
        @objid ("2f09fd48-a448-4970-be5e-193b0bc3ec2c")
        private SmDependency symetricDep;

        @objid ("39264088-2499-4e80-b7de-9a36091ed533")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EntryPointPseudoStateData) data).mEntryOf;
        }

        @objid ("b32bd617-38e2-41fe-a91c-a061cd460b41")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EntryPointPseudoStateData) data).mEntryOf = value;
        }

        @objid ("d52409b4-126d-49e8-b2c0-9fae5cc84af3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getEntryPointDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e7dd882-c03c-43ec-92a2-5f223da2b98e")
    public static class ConnectionSmDependency extends SmMultipleDependency {
        @objid ("95f7f66b-0e24-4e2d-ae0b-e04da9e17347")
        private SmDependency symetricDep;

        @objid ("d2e3d230-4b5c-4681-a238-b74a86a9f890")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EntryPointPseudoStateData)data).mConnection != null)? ((EntryPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
        }

        @objid ("0996ecac-416c-47bf-9274-9f65beb2e93f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EntryPointPseudoStateData) data).mConnection = values;
        }

        @objid ("6aa251e9-a5c9-4b2f-8444-64f6e9aa3abe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConnectionPointReferenceSmClass)this.getTarget()).getEntryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4e10b256-9285-44fc-92e8-3c4515abae24")
    public static class EntryOfMachineSmDependency extends SmSingleDependency {
        @objid ("d29b2fa0-2ab3-42a8-82f2-e959cd359bf1")
        private SmDependency symetricDep;

        @objid ("dc4cd65f-1602-45d9-9603-f17c583bb00c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EntryPointPseudoStateData) data).mEntryOfMachine;
        }

        @objid ("4f105962-5f70-4b6a-af22-b8a0deed9543")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EntryPointPseudoStateData) data).mEntryOfMachine = value;
        }

        @objid ("821647f1-53e3-4367-a813-55cb66a3abdc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateMachineSmClass)this.getTarget()).getEntryPointDep();
            }
            return this.symetricDep;
        }

    }

}
