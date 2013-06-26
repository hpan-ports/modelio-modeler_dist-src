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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("a0d41ee9-23a6-4dc7-b726-effccfecb477")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("1b084dd2-54aa-42c7-a1ea-581658607bae")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("d592df26-982a-412b-9068-db10767c2e65")
    @SmaMetaAssociation(metaName="Catched", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.CatchedSmDependency.class)
     SmObjectImpl mCatched;

    @objid ("0303df5e-1827-4d32-a89c-d9278949cc55")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("9ae3d48f-8fb7-4f8e-aa1e-c6ac454316d7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031b10e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9ec32a2b-0fc7-401d-af48-ddfddcd41fe6")
        private static SmClass smClass = null;

        @objid ("f33137f6-979c-4d5b-a198-6bfceff7ab73")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("eb2d8f0d-4a8b-49e3-b26b-54da9746d6cd")
        private static SmDependency OwnerActivityDep = null;

        @objid ("68488466-a317-4737-845e-f05436c7832d")
        private static SmDependency CatchedDep = null;

        @objid ("db84ec11-d0a5-42cf-b66c-9d1658d2ef2e")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("1ad26a9b-2206-4f71-8349-96f2c20c5247")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataOutputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("875fa8b8-0990-4f6f-986d-00768e0c3eca")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("6d8638d3-ff97-470e-946d-e82cf821081d")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("1feec7a8-3e95-4ae7-b3e9-e2d86784d3bc")
        public static SmDependency CatchedDep() {
            if (CatchedDep == null) {
            	CatchedDep = classof().getDependencyDef("Catched");
            }
            return CatchedDep;
        }

        @objid ("d2026752-1ed4-47f3-a3dd-dc5fadd3bc55")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("7b55518b-4c54-4e95-bea0-fe17a94be6a3")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("458b166a-8792-4f91-9b04-2ebf3830a0c8")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("b5c2a366-afa9-4b25-a783-085ed008b12a")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("9571212b-5d7c-4b35-ae49-40a2835e2f6c")
        public static SmDependency getCatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CatchedDep;
        }

        @objid ("b3a2ef96-b54e-499d-ba9a-828794f6c913")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0031f25e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a1ae93b4-c18b-47b9-a3c9-f8d5682df0b1")
            public ISmObjectData createData() {
                return new BpmnDataOutputData();
            }

            @objid ("195e3cbb-3b5c-46c9-96f7-267decae99b7")
            public SmObjectImpl createImpl() {
                return new BpmnDataOutputImpl();
            }

        }

        @objid ("003259ce-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("bf5b6478-545a-45f7-9f12-e944bc894768")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mRepresentedParameter;
            }

            @objid ("b318203d-c75a-41d7-8a76-738ffc1dc949")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mRepresentedParameter = value;
            }

            @objid ("f992e753-bb78-406f-a147-96876909a76e")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataOutputDep();
            }

        }

        @objid ("0032d020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("cd2cc74a-b2e2-46c7-8f60-b1148a971470")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerActivity;
            }

            @objid ("a0d72881-1778-472b-bab1-3d52e48e5f0c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerActivity = value;
            }

            @objid ("5da4aadb-57bd-4494-beed-de748d866e86")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.OutputSpecificationDep();
            }

        }

        @objid ("0033507c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CatchedSmDependency extends SmSingleDependency {
            @objid ("4f4b739d-a366-4016-9a9b-282c26df105d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mCatched;
            }

            @objid ("3cb84857-f37b-4e71-9820-f22f9dd6281a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mCatched = value;
            }

            @objid ("169e3086-8126-4bee-a112-9bbf6118d6e3")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputDep();
            }

        }

        @objid ("0033c764-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("9c181b6f-a524-405d-ad0c-0fa85675c2a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("68c01bd2-496f-48d1-9058-23a904e5f8bc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("64d18b76-8f97-4f64-b039-9eca82768585")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep();
            }

        }

    }

}
