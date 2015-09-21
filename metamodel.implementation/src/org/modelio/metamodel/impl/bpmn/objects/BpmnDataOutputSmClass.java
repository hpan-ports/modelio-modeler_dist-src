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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
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

@objid ("27dfd40d-8eb0-4c4b-9f14-bb8971a44059")
public class BpmnDataOutputSmClass extends BpmnItemAwareElementSmClass {
    @objid ("b35fcc79-4edf-4d34-a881-9d38569a22ea")
    private SmDependency representedParameterDep;

    @objid ("45144a84-5a80-461b-81cf-b678dff8edf3")
    private SmDependency ownerActivityDep;

    @objid ("6c98bc46-96d2-48d3-abaf-494c09ce075b")
    private SmDependency catchedDep;

    @objid ("d6742f52-ec86-461a-ab1e-6ee9f4913f14")
    private SmDependency ownerLoopCharacteristicsDep;

    @objid ("b1727a75-67df-46e9-94f1-00881a837a26")
    public BpmnDataOutputSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4d4f65bc-dfe5-40a6-96b9-a0d7d68fdbd7")
    @Override
    public String getName() {
        return "BpmnDataOutput";
    }

    @objid ("cd6cf185-1405-41c1-95c0-a9d14c86fdbe")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a5630560-c044-453b-be0d-fd5fb772e681")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataOutput.class;
    }

    @objid ("6c73c27a-5ad7-44b1-a364-813bad4be8b5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("392807f5-dba3-44af-a59e-bfc5942e898b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1955685e-b837-4373-a524-ea5e8162402a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnItemAwareElement");
        this.registerFactory(new BpmnDataOutputObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representedParameterDep = new RepresentedParameterSmDependency();
        this.representedParameterDep.init("RepresentedParameter", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedParameterDep);
        
        this.ownerActivityDep = new OwnerActivitySmDependency();
        this.ownerActivityDep.init("OwnerActivity", this, metamodel.getMClass("BpmnActivity"), 0, 1 );
        registerDependency(this.ownerActivityDep);
        
        this.catchedDep = new CatchedSmDependency();
        this.catchedDep.init("Catched", this, metamodel.getMClass("BpmnCatchEvent"), 0, 1 );
        registerDependency(this.catchedDep);
        
        this.ownerLoopCharacteristicsDep = new OwnerLoopCharacteristicsSmDependency();
        this.ownerLoopCharacteristicsDep.init("OwnerLoopCharacteristics", this, metamodel.getMClass("BpmnMultiInstanceLoopCharacteristics"), 0, 1 );
        registerDependency(this.ownerLoopCharacteristicsDep);
    }

    @objid ("d9b50570-e23a-41c6-bdb0-12db18fe6e4d")
    public SmDependency getRepresentedParameterDep() {
        if (this.representedParameterDep == null) {
        	this.representedParameterDep = this.getDependencyDef("RepresentedParameter");
        }
        return this.representedParameterDep;
    }

    @objid ("4f8d5b44-76ad-4de3-a3cd-168f139481a3")
    public SmDependency getOwnerActivityDep() {
        if (this.ownerActivityDep == null) {
        	this.ownerActivityDep = this.getDependencyDef("OwnerActivity");
        }
        return this.ownerActivityDep;
    }

    @objid ("e4f28195-643a-4594-b96e-db91fa429d3a")
    public SmDependency getCatchedDep() {
        if (this.catchedDep == null) {
        	this.catchedDep = this.getDependencyDef("Catched");
        }
        return this.catchedDep;
    }

    @objid ("a688e9a9-3e2d-4175-ba33-28e6d235d300")
    public SmDependency getOwnerLoopCharacteristicsDep() {
        if (this.ownerLoopCharacteristicsDep == null) {
        	this.ownerLoopCharacteristicsDep = this.getDependencyDef("OwnerLoopCharacteristics");
        }
        return this.ownerLoopCharacteristicsDep;
    }

    @objid ("5657b30b-83bb-4125-86a5-0840783d0b6e")
    private static class BpmnDataOutputObjectFactory implements ISmObjectFactory {
        @objid ("1aaf89f6-aaa3-422e-8abc-f01e6b6b0b9a")
        private BpmnDataOutputSmClass smClass;

        @objid ("7595f1eb-491d-45cd-ad92-08b934a11c5f")
        public BpmnDataOutputObjectFactory(BpmnDataOutputSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("31b1aaf9-fc94-4ed6-8950-2eecd9f70d9f")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataOutputData(this.smClass);
        }

        @objid ("472e3f3a-19ea-4494-b735-b1e99246e72f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataOutputImpl();
        }

    }

    @objid ("7fe4940c-36cb-40e7-a90a-6c4b0b517f06")
    public static class RepresentedParameterSmDependency extends SmSingleDependency {
        @objid ("ea9e7665-9a00-4846-9ff6-10c82de033b2")
        private SmDependency symetricDep;

        @objid ("f390910e-90ad-41bf-a60b-dd0fa1df7bc3")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataOutputData) data).mRepresentedParameter;
        }

        @objid ("1959eda5-ee9d-4804-8cd1-cd79d272b727")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataOutputData) data).mRepresentedParameter = value;
        }

        @objid ("58a00e7e-2a30-4a1e-ae61-cbac81bf73e5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getBpmnRepresentingDataOutputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c1d17fcb-ef4b-4731-b113-08c9d8471d47")
    public static class OwnerActivitySmDependency extends SmSingleDependency {
        @objid ("55f18d58-983f-4a94-97d3-6d204acdcdfd")
        private SmDependency symetricDep;

        @objid ("103379b8-5c38-4d69-add7-9f5bfd4aefe0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataOutputData) data).mOwnerActivity;
        }

        @objid ("f2a53eee-a085-4cb8-85ad-c890136d31c2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataOutputData) data).mOwnerActivity = value;
        }

        @objid ("bb934039-4da5-4f0e-9654-b8458f560ed9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getOutputSpecificationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b8299d07-3dee-4317-8aa6-98917cb0ba93")
    public static class CatchedSmDependency extends SmSingleDependency {
        @objid ("ebf4b24c-e1fd-4d29-b754-2f41be854d0d")
        private SmDependency symetricDep;

        @objid ("6858f053-2810-4df8-9897-b3b022764952")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataOutputData) data).mCatched;
        }

        @objid ("8f43d433-909f-4f9e-9282-dfc0eda50c86")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataOutputData) data).mCatched = value;
        }

        @objid ("7fe6c1b7-3d53-4b3d-9945-dd049bb74cd7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCatchEventSmClass)this.getTarget()).getDataOutputDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a0ef8c18-1901-4843-8600-762896bb34dd")
    public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
        @objid ("622d6a69-7782-40bc-bce4-1c214ead02f0")
        private SmDependency symetricDep;

        @objid ("93a693fa-2d9b-44b0-a1ea-b318e7638219")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnDataOutputData) data).mOwnerLoopCharacteristics;
        }

        @objid ("48f0636b-7901-4b12-b88d-486a3275f989")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnDataOutputData) data).mOwnerLoopCharacteristics = value;
        }

        @objid ("d1717795-f500-43e3-bab5-b40cb42a3015")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMultiInstanceLoopCharacteristicsSmClass)this.getTarget()).getLoopDataOutputRefDep();
            }
            return this.symetricDep;
        }

    }

}
