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
    @objid ("89736bcd-cb48-4430-8a44-025c771df9d4")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("e3212a48-4d2f-42fb-89e3-7aab99091fa6")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("6ac4c0d8-f30d-4fc7-85c3-5d15404d2c9e")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("ec6dbfb5-5a18-43ae-af15-671e8c8532e3")
    @SmaMetaAssociation(metaName="OwnerThrowEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.OwnerThrowEventSmDependency.class)
     SmObjectImpl mOwnerThrowEvent;

    @objid ("35db4e4a-a097-4d1d-a644-bc265839fad5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8b92-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("712ccbfa-a6e0-472a-9b25-53163bef2552")
        private static SmClass smClass = null;

        @objid ("49d9b9c5-5cc9-43dc-8bd6-63a650239bf7")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("5362725b-86d9-4176-ac31-d2a1fc8c0706")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("c4829412-3829-43ae-837c-16fded762f57")
        private static SmDependency OwnerActivityDep = null;

        @objid ("c8ec40d1-fd1f-4135-8669-daa9fccdd665")
        private static SmDependency OwnerThrowEventDep = null;

        @objid ("9ed3eb18-c53e-40fb-af6d-cc9a105479d4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataInputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d5da7b97-6c81-422a-a2ba-0bb8266f4c90")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("ecb845da-ed24-4a63-b141-dc158f9c1c32")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("bb3b2625-46a8-4c63-96a1-f318725ef2d4")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("ca9d22be-49fa-4955-b33f-c168d8e851f4")
        public static SmDependency OwnerThrowEventDep() {
            if (OwnerThrowEventDep == null) {
            	OwnerThrowEventDep = classof().getDependencyDef("OwnerThrowEvent");
            }
            return OwnerThrowEventDep;
        }

        @objid ("763f0212-b92f-4bad-b1af-f9a0d118aff1")
        public static SmDependency getOwnerThrowEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerThrowEventDep;
        }

        @objid ("0763d59e-fe1f-4213-9e8f-0922e3562545")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("bb62b25e-af74-4886-ace8-a6c934eb26be")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("e6a7ba8d-b51a-47a6-b981-b614b33a786f")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("6e111e8e-e53d-4811-ad1c-7d68629e32e2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005fcbb6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("96b31286-bff1-4e2c-80e5-06f6718b195d")
            public ISmObjectData createData() {
                return new BpmnDataInputData();
            }

            @objid ("dfdf9067-884a-4eef-8c8a-f3439337bf5d")
            public SmObjectImpl createImpl() {
                return new BpmnDataInputImpl();
            }

        }

        @objid ("00602d36-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("17e25d8f-0dfc-4e1f-8fad-40c8710709ac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mRepresentedParameter;
            }

            @objid ("b8d710dd-edc0-40ff-8065-6e7606db59b5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mRepresentedParameter = value;
            }

            @objid ("44c2c8b4-f06a-4ed7-90c8-eed90250d355")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataInputDep();
            }

        }

        @objid ("0060a388-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("717d6b24-39c0-4e33-938d-84f3a320f511")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("bccefea5-3321-4685-b0f8-7a1bb771402c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("bdcd4d45-007f-47a3-8860-9fa452aeed21")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep();
            }

        }

        @objid ("006118ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("c5c34c3a-9195-4714-997c-c18ecebfbaf5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerActivity;
            }

            @objid ("3deb1644-8869-4387-8d1a-370146d19e99")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerActivity = value;
            }

            @objid ("835744fa-bade-452f-a3ff-e2d3b9059880")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.InputSpecificationDep();
            }

        }

        @objid ("00618cda-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerThrowEventSmDependency extends SmSingleDependency {
            @objid ("9e980dca-5282-4785-949f-405cb77fee1c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerThrowEvent;
            }

            @objid ("98457d00-b681-4aeb-b189-0434fdd402fd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerThrowEvent = value;
            }

            @objid ("4751bbb1-74d6-494e-840b-ebb19353daf3")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputDep();
            }

        }

    }

}
