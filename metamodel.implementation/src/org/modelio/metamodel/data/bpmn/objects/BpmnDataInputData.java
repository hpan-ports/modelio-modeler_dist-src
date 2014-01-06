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
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnThrowEventData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputImpl;
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

@objid ("0006c016-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataInput.class, factory=BpmnDataInputData.Metadata.ObjectFactory.class)
public class BpmnDataInputData extends BpmnItemAwareElementData {
    @objid ("2c4b55eb-d50a-4d6f-bd6b-bf02d8562822")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("234a2fa8-a073-4c90-9af2-bfb98de6a476")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("8504755a-ad98-471e-932a-eaea644330b7")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("298eef36-b1c8-4af1-8fd9-0c729fa3e23e")
    @SmaMetaAssociation(metaName="OwnerThrowEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.OwnerThrowEventSmDependency.class)
     SmObjectImpl mOwnerThrowEvent;

    @objid ("d47902da-4b52-4184-83b5-c0df8ec6ca53")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8b92-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("eff03aac-c87f-4a24-ac6e-a66390df894f")
        private static SmClass smClass = null;

        @objid ("8bb5a579-d66d-4399-8c1a-5675c5e5ec69")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("901489cb-60ba-49d4-bddc-39fd6291b175")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("aab42cd1-89fc-4aa4-aba1-d97655c3bdaa")
        private static SmDependency OwnerActivityDep = null;

        @objid ("0d84e5d4-cb19-4937-8a20-1744164d3811")
        private static SmDependency OwnerThrowEventDep = null;

        @objid ("18725efb-95ff-43a3-a861-bf6e9e4fdde7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataInputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1bc051aa-2536-4fe8-ab72-f867751accdf")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("2a7fd883-7f75-4891-95d6-23a860629811")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("04344c94-f31f-440c-bcc9-09e60fc883cf")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("469ebf3e-be70-4694-9e15-f0da5768403e")
        public static SmDependency OwnerThrowEventDep() {
            if (OwnerThrowEventDep == null) {
            	OwnerThrowEventDep = classof().getDependencyDef("OwnerThrowEvent");
            }
            return OwnerThrowEventDep;
        }

        @objid ("fbe93d2b-f218-49c9-97ac-fcfc6916d809")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("c00621e5-a63f-429c-bae5-e83a4b504b62")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2792cf62-f22b-4736-9d4e-9e8a80cadd2a")
        public static SmDependency getOwnerThrowEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerThrowEventDep;
        }

        @objid ("4c76f179-fd34-4240-820a-941be2c37c03")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("774c0477-ede9-41ad-927d-24b8ff850567")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("005fcbb6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("69c7af41-db13-4f7d-8d97-34ee13f24116")
            public ISmObjectData createData() {
                return new BpmnDataInputData();
            }

            @objid ("96087a37-7817-4b6b-ad11-7b38553fc38a")
            public SmObjectImpl createImpl() {
                return new BpmnDataInputImpl();
            }

        }

        @objid ("00602d36-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("aaaace29-7382-4cbb-8dfe-738dd41f1910")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mRepresentedParameter;
            }

            @objid ("90dadf2b-b5ac-4d9e-9140-914ef07890a4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mRepresentedParameter = value;
            }

            @objid ("ef044aa9-c3a6-41b0-86ff-34a95cf18653")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataInputDep();
            }

        }

        @objid ("0060a388-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("2ea806f8-90d9-44c7-bce2-ff3c38007251")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("c86bbb6d-ede8-4381-8ccb-c2bc61407a61")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("0ca94349-0318-41a4-a557-41eaef0fa5f1")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep();
            }

        }

        @objid ("006118ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("35fcc785-42fe-4708-a40e-deba0d1fcc32")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerActivity;
            }

            @objid ("899514a9-835f-45a5-8aae-97b7e76622ed")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerActivity = value;
            }

            @objid ("95f672aa-ac6d-4f5a-b986-06ba78a2e182")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.InputSpecificationDep();
            }

        }

        @objid ("00618cda-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerThrowEventSmDependency extends SmSingleDependency {
            @objid ("f5763bfa-4113-41b3-b646-2b4187b17814")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerThrowEvent;
            }

            @objid ("042e056e-9098-4842-a9b6-7d095d3637e6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerThrowEvent = value;
            }

            @objid ("e5bbf0f7-15ab-4f9a-a2d9-6527bc3307f7")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputDep();
            }

        }

    }

}
