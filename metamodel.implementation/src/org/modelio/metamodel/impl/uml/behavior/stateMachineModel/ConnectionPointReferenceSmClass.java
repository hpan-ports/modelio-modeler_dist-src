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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
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

@objid ("954c673f-50e5-43b4-9c35-0fb3cdbcfd12")
public class ConnectionPointReferenceSmClass extends StateVertexSmClass {
    @objid ("85b6c612-f0aa-4411-9846-5f526bc07402")
    private SmDependency exitDep;

    @objid ("2b85a4c6-b897-49ad-9d22-edf1eb7d71a7")
    private SmDependency entryDep;

    @objid ("3716011c-af88-4d9c-b519-c51c28b50829")
    private SmDependency ownerStateDep;

    @objid ("76953270-17a6-4b54-88f8-d455aa9e3fcd")
    public ConnectionPointReferenceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f9484649-5ebc-49fd-ac47-b82aedaedebf")
    @Override
    public String getName() {
        return "ConnectionPointReference";
    }

    @objid ("6664a687-641a-4823-b966-19a6c47faf3e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e233c41e-7248-4271-9448-aa9b19d9c7f5")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ConnectionPointReference.class;
    }

    @objid ("7edda1c6-c8a0-4936-933d-ee4f91a485c7")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("10c92ef6-50b7-4614-991e-ebbe9f6a021b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1d140c82-9469-4905-94e8-03e57af7f05b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StateVertex");
        this.registerFactory(new ConnectionPointReferenceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.exitDep = new ExitSmDependency();
        this.exitDep.init("Exit", this, metamodel.getMClass("ExitPointPseudoState"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.exitDep);
        
        this.entryDep = new EntrySmDependency();
        this.entryDep.init("Entry", this, metamodel.getMClass("EntryPointPseudoState"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.entryDep);
        
        this.ownerStateDep = new OwnerStateSmDependency();
        this.ownerStateDep.init("OwnerState", this, metamodel.getMClass("State"), 0, 1 );
        registerDependency(this.ownerStateDep);
    }

    @objid ("800a6f43-f4ed-4335-a483-975485eefc66")
    public SmDependency getExitDep() {
        if (this.exitDep == null) {
        	this.exitDep = this.getDependencyDef("Exit");
        }
        return this.exitDep;
    }

    @objid ("17b82ed4-5ca0-41e1-ba79-6903a91cc207")
    public SmDependency getEntryDep() {
        if (this.entryDep == null) {
        	this.entryDep = this.getDependencyDef("Entry");
        }
        return this.entryDep;
    }

    @objid ("966b97b9-9fc9-405e-bc2d-91000397e0dc")
    public SmDependency getOwnerStateDep() {
        if (this.ownerStateDep == null) {
        	this.ownerStateDep = this.getDependencyDef("OwnerState");
        }
        return this.ownerStateDep;
    }

    @objid ("c4a1ebba-9b0a-4201-9d61-3e7baa9435ae")
    private static class ConnectionPointReferenceObjectFactory implements ISmObjectFactory {
        @objid ("122cdc51-a1eb-4b46-aa56-09ae1fbfb306")
        private ConnectionPointReferenceSmClass smClass;

        @objid ("553d4a02-b0e1-4a9e-8e95-5f7c79a590ef")
        public ConnectionPointReferenceObjectFactory(ConnectionPointReferenceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d2e4edde-2707-473d-86a0-0761783b104b")
        @Override
        public ISmObjectData createData() {
            return new ConnectionPointReferenceData(this.smClass);
        }

        @objid ("8d1e6d36-f922-453b-bbb8-3a27e88f46d6")
        @Override
        public SmObjectImpl createImpl() {
            return new ConnectionPointReferenceImpl();
        }

    }

    @objid ("b5a4dcc6-a171-4b35-8d70-daea9a169c4a")
    public static class ExitSmDependency extends SmSingleDependency {
        @objid ("2a681df6-df9c-4adb-b78c-736ba0ae112f")
        private SmDependency symetricDep;

        @objid ("363f4634-1a97-40b7-a02a-904799c2b6ef")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ConnectionPointReferenceData) data).mExit;
        }

        @objid ("19ddaa25-c233-453e-ac9a-df8a4fb7d91d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ConnectionPointReferenceData) data).mExit = value;
        }

        @objid ("903037b4-086c-4241-94c8-57c1e337a3c1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExitPointPseudoStateSmClass)this.getTarget()).getConnectionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1173da32-1d38-4516-8bdb-10c882c0eaaf")
    public static class EntrySmDependency extends SmSingleDependency {
        @objid ("0eb8b9df-04ff-48bd-a625-5987765a5cc3")
        private SmDependency symetricDep;

        @objid ("380adce7-da96-4ec1-8256-b5a5828f10fc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ConnectionPointReferenceData) data).mEntry;
        }

        @objid ("61642e42-a6c8-4da5-a354-a3fa6db34cc7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ConnectionPointReferenceData) data).mEntry = value;
        }

        @objid ("2f65cbe0-ce03-4d03-b8e2-177ec29c52c0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EntryPointPseudoStateSmClass)this.getTarget()).getConnectionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("23c3cbde-74dc-4bcb-aec8-e6693dacc4cb")
    public static class OwnerStateSmDependency extends SmSingleDependency {
        @objid ("f3fe45de-bc35-423e-9c00-22bf2d706eac")
        private SmDependency symetricDep;

        @objid ("d7b94eb5-fbe2-4800-a26d-55fa60798e06")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ConnectionPointReferenceData) data).mOwnerState;
        }

        @objid ("12ae6bc3-ec9c-41b7-9afc-9ce80612b0d8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ConnectionPointReferenceData) data).mOwnerState = value;
        }

        @objid ("68f4cfe1-c4c1-44eb-aa5a-6c15d12d459c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getConnectionDep();
            }
            return this.symetricDep;
        }

    }

}
