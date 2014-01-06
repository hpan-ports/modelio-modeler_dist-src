/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("00061d64-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataOutput.class, factory=BpmnDataOutputData.Metadata.ObjectFactory.class)
public class BpmnDataOutputData extends BpmnItemAwareElementData {
    @objid ("46e6ca81-0577-4a60-8f02-1c4096048a11")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("a87c5b58-d52f-421c-9d93-ec4a530106d3")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("4ae95554-2408-4145-b186-77c580257d6b")
    @SmaMetaAssociation(metaName="Catched", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.CatchedSmDependency.class)
     SmObjectImpl mCatched;

    @objid ("528d252c-ae75-4b38-90b2-198793c1718c")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("59ba72da-f0c8-426d-9b7e-57bb39bd6d52")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031b10e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a2df957f-3356-45a8-93d5-022b72e8025f")
        private static SmClass smClass = null;

        @objid ("e9aea56a-6633-4058-8c53-539a0faf54b4")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("3825e135-73e7-481c-a799-da8a32b6b409")
        private static SmDependency OwnerActivityDep = null;

        @objid ("9b075c06-6867-44cb-aab7-eacb656ef949")
        private static SmDependency CatchedDep = null;

        @objid ("8f801ce8-7a29-41d1-afe8-9d301b352d27")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("83ab6ba5-b8f8-4ab0-8256-8755167690d8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataOutputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6570510-21f3-4293-ae96-1dacf3a33c3b")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("c25a4bb0-5c22-42a6-bd13-70fa17804ee6")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("e519186e-d7b0-4a97-b23c-6373c9f494f2")
        public static SmDependency CatchedDep() {
            if (CatchedDep == null) {
            	CatchedDep = classof().getDependencyDef("Catched");
            }
            return CatchedDep;
        }

        @objid ("6aedf333-2bf5-4b42-adee-87a1747676ca")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("ba645a74-c3c8-43aa-a29a-d4acbc83b1f1")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("89774fca-fcd5-4a26-a226-17188b6514ec")
        public static SmDependency getCatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CatchedDep;
        }

        @objid ("af8a59d3-db4a-42ca-a96d-db5b2264acbd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e1a8d3df-47ed-4db4-8301-bc69d08c3ce4")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("1fc49e20-cef6-4b2c-8659-c7f8c7c90b8b")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("0031f25e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7f84f570-185e-46f9-82b8-2ebff5cdd681")
            public ISmObjectData createData() {
                return new BpmnDataOutputData();
            }

            @objid ("f67e4787-9f92-4840-84b8-f028d33c7e8c")
            public SmObjectImpl createImpl() {
                return new BpmnDataOutputImpl();
            }

        }

        @objid ("003259ce-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("e241b3a4-f34d-4c02-9613-4c65ee33f289")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mRepresentedParameter;
            }

            @objid ("7b3fcc4d-50e2-496d-976b-e20b4561eb3d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mRepresentedParameter = value;
            }

            @objid ("609c39eb-416e-481c-80b1-cac0e60fa4c0")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataOutputDep();
            }

        }

        @objid ("0032d020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("2d6a3c7e-469a-4a49-98f8-f211391ce53a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerActivity;
            }

            @objid ("6764486c-2241-48ea-bc09-dde7286896a0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerActivity = value;
            }

            @objid ("fdd518f4-13dd-404a-9fda-5b8f1bb04813")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.OutputSpecificationDep();
            }

        }

        @objid ("0033507c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CatchedSmDependency extends SmSingleDependency {
            @objid ("291d0c2a-ef18-4be9-8c57-b4fff3bc75dd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mCatched;
            }

            @objid ("f5e52bb0-2780-491d-9a6f-517da1289ccf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mCatched = value;
            }

            @objid ("5bf7dd59-003f-478c-9ee9-e3c31f5deaef")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputDep();
            }

        }

        @objid ("0033c764-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("7d4bb6af-b5b4-4626-bba1-ead20035d6de")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("7253d0f2-c8ee-4575-bc54-d2e3f1c79665")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("f9888b46-a013-4043-b1b6-e1513b0a3628")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep();
            }

        }

    }

}
