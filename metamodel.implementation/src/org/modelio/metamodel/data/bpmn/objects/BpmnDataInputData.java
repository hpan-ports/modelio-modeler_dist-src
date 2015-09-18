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
    @objid ("99fda1f3-707a-4258-bda6-4089be398cfb")
    @SmaMetaAssociation(metaName="RepresentedParameter", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedParameter;

    @objid ("8617d6e5-a3ae-46d9-84db-8283f3a3b582")
    @SmaMetaAssociation(metaName="OwnerLoopCharacteristics", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.OwnerLoopCharacteristicsSmDependency.class)
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("a78bab5d-61ca-49ee-81ed-00379bf00097")
    @SmaMetaAssociation(metaName="OwnerActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerActivitySmDependency.class)
     SmObjectImpl mOwnerActivity;

    @objid ("80a7f7a2-e633-418f-83a9-5e610058f6f1")
    @SmaMetaAssociation(metaName="OwnerThrowEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.OwnerThrowEventSmDependency.class)
     SmObjectImpl mOwnerThrowEvent;

    @objid ("a3dcb60a-e7ea-44b9-89a0-383375a5e2b2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8b92-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2de9b253-7bf2-429c-aaa0-718a6526a447")
        private static SmClass smClass = null;

        @objid ("13440431-4e1a-41ae-996b-180e1be48d1e")
        private static SmDependency RepresentedParameterDep = null;

        @objid ("ad59dba6-2fb9-4cc7-ad58-96c8b6885c00")
        private static SmDependency OwnerLoopCharacteristicsDep = null;

        @objid ("6e6ab0cc-4444-4d51-8f38-c144dbbb58ca")
        private static SmDependency OwnerActivityDep = null;

        @objid ("c0e0519f-68cf-4466-a823-b25bb601861c")
        private static SmDependency OwnerThrowEventDep = null;

        @objid ("d63943bf-b343-4a41-a93d-f212c1a23871")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataInputData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8b617f53-d5c0-455f-b1d2-6736d487de15")
        public static SmDependency RepresentedParameterDep() {
            if (RepresentedParameterDep == null) {
            	RepresentedParameterDep = classof().getDependencyDef("RepresentedParameter");
            }
            return RepresentedParameterDep;
        }

        @objid ("86a19fde-068e-48d5-9489-816c3d11a7ee")
        public static SmDependency OwnerLoopCharacteristicsDep() {
            if (OwnerLoopCharacteristicsDep == null) {
            	OwnerLoopCharacteristicsDep = classof().getDependencyDef("OwnerLoopCharacteristics");
            }
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("366a309a-f923-4e9d-8138-6876dba99ed0")
        public static SmDependency OwnerActivityDep() {
            if (OwnerActivityDep == null) {
            	OwnerActivityDep = classof().getDependencyDef("OwnerActivity");
            }
            return OwnerActivityDep;
        }

        @objid ("24b0dca3-8c1c-4403-8fe2-c8b0ffca1479")
        public static SmDependency OwnerThrowEventDep() {
            if (OwnerThrowEventDep == null) {
            	OwnerThrowEventDep = classof().getDependencyDef("OwnerThrowEvent");
            }
            return OwnerThrowEventDep;
        }

        @objid ("ef2ada32-0a9a-4fda-b7ca-8419a0613660")
        public static SmDependency getOwnerThrowEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerThrowEventDep;
        }

        @objid ("5fa4d2bd-d094-4980-a8c0-8f8b39e4ca7d")
        public static SmDependency getOwnerLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerLoopCharacteristicsDep;
        }

        @objid ("49f5ff48-7d00-494d-8ce5-4cac7af684a1")
        public static SmDependency getRepresentedParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedParameterDep;
        }

        @objid ("754e81e3-a75a-4833-a879-482d36221cea")
        public static SmDependency getOwnerActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerActivityDep;
        }

        @objid ("5853cc31-f6e3-4e13-aca3-9896537d0e66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005fcbb6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("eb874922-3e41-49ee-894a-e6375d33f4c1")
            public ISmObjectData createData() {
                return new BpmnDataInputData();
            }

            @objid ("80e2a00e-9174-410d-98b8-3bbd9c6fe0d9")
            public SmObjectImpl createImpl() {
                return new BpmnDataInputImpl();
            }

        }

        @objid ("00602d36-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedParameterSmDependency extends SmSingleDependency {
            @objid ("caf8cb59-0395-4047-8c1a-1786e9e3beaf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mRepresentedParameter;
            }

            @objid ("390a649a-70e0-477d-a3f5-4d000b7895f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mRepresentedParameter = value;
            }

            @objid ("05c5812e-a891-4143-a630-29ad98118d34")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.BpmnRepresentingDataInputDep();
            }

        }

        @objid ("0060a388-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerLoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("c6ae5137-6831-4c9f-81cf-b7110103b511")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerLoopCharacteristics;
            }

            @objid ("61fa4acd-218e-4e0c-b37c-4934accc416b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerLoopCharacteristics = value;
            }

            @objid ("076eb4c0-9a6a-4222-8a7b-5b5de6958e1d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.LoopDataInputDep();
            }

        }

        @objid ("006118ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerActivitySmDependency extends SmSingleDependency {
            @objid ("a230ed2d-7a83-487c-8ea9-ca5256f8515a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerActivity;
            }

            @objid ("824ba91b-270b-4727-9d41-7002ec991bc8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerActivity = value;
            }

            @objid ("3e36f522-05d2-422b-b4e1-a931a79dac8b")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.InputSpecificationDep();
            }

        }

        @objid ("00618cda-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerThrowEventSmDependency extends SmSingleDependency {
            @objid ("1dc0bc4f-e20f-4d94-9269-62d2f3a789d3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataInputData) data).mOwnerThrowEvent;
            }

            @objid ("d93778aa-358c-4ddb-858c-660a9ee90795")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataInputData) data).mOwnerThrowEvent = value;
            }

            @objid ("086dffd5-24d7-4f11-9e1c-308caa41bd13")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputDep();
            }

        }

    }

}
