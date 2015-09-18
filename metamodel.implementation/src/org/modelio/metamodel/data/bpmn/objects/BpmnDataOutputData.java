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
/*   Metamodel version: 9022              */
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
    @objid ("18b1e1db-614b-43b2-882f-26201a03a4b0")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("9c9ffb15-9226-4146-90f9-8c197fa5d9df")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("34728fec-c122-42d4-bf2e-e9936f52fde5")
    @SmaMetaAssociation(metaName="Catched", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.CatchedSmDependency.class)
     SmObjectImpl mCatched;

    @objid ("e4a62581-3ba0-448b-8846-fba3ff37e60f")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("f126c12e-2a79-4fb4-a215-16e300c52329")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031b10e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("368ec48f-1dda-4058-925d-8b9cdf34b02f")
        private static SmClass smClass = null;

        @objid ("cd3792ce-4016-4f45-b588-c9943e217350")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("9c92a910-7eba-47ed-995c-baf5db26d93d")
        private static SmDependency OwnerActivityDep = null;

        @objid ("7274351e-8dbe-47f8-a856-5d8750c937af")
        private static SmDependency CatchedDep = null;

        @objid ("51183f50-843e-4329-ab39-83644b6dbbe7")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("f2ef5b71-adb9-4de7-9bb6-93df32f238b9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataOutputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9ad72d04-19e8-47b7-8d9b-cb28fe287e86")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("bfd413fc-bc38-46c3-8342-217df92ee079")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("a8cbe7ff-0639-43ab-bb42-9345ec3b4953")
        public static SmDependency CatchedDep() {
            if (CatchedDep == null) {
            	CatchedDep = classof().getDependencyDef("Catched");
            }
            return CatchedDep;
        }

        @objid ("f232a684-66a5-4777-8ea5-3f0d0fe74625")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("c19046ca-8562-41c7-815b-a12a9e1f709e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("aa786a56-4a64-44d2-9b46-c0e0e5e5c428")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("9c45a7ab-dbe2-4c57-b8a1-009de6fb7430")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("82da8b13-d57e-47df-8cd4-ac043f8560ed")
        public static SmDependency getCatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CatchedDep;
        }

        @objid ("cfc4dc1e-7ee6-401b-8d4d-3004608db8e9")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("0031f25e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e2fbc27a-6f86-4cb4-b32e-21c0bd8a196a")
            public ISmObjectData createData() {
                return new BpmnDataOutputData();
            }

            @objid ("63712553-9a2a-4b23-a833-e616db0ff881")
            public SmObjectImpl createImpl() {
                return new BpmnDataOutputImpl();
            }

        }

        @objid ("003259ce-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("ebedacad-603e-4fb9-96e4-3103449a5408")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mRepresentedParameter;
            }

            @objid ("fc6209c2-e9d0-4ec1-922b-be7d7581c33f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mRepresentedParameter = value;
            }

            @objid ("9db8221f-ff8c-416c-b333-dcce6210808d")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataOutputDep();
            }

        }

        @objid ("0032d020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("d9c67fab-5254-44bb-80da-6373f8c547d4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerActivity;
            }

            @objid ("c578470b-cac6-4efa-b632-0f1061fc2e20")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerActivity = value;
            }

            @objid ("12477c1c-2395-4434-9d44-53e23df2b15e")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.OutputSpecificationDep();
            }

        }

        @objid ("0033507c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CatchedSmDependency extends SmSingleDependency {
            @objid ("17f7da7d-fad3-4044-85d6-e16b8efd6d8e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mCatched;
            }

            @objid ("1ed27a90-3696-43fa-bcde-01ee4f765e4d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mCatched = value;
            }

            @objid ("d5ce64b9-0683-4860-8da9-48d69253a067")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputDep();
            }

        }

        @objid ("0033c764-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("cf73869d-f34c-4b1a-9c3b-aa1c344a4875")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataOutputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("cd85e679-f478-4ad4-a9e2-ad601358f0ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataOutputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("74457ab7-c84c-462c-99b6-a68f4665627b")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataOutputRefDep();
            }

        }

    }

}
