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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.impl.bpmn.events.BpmnThrowEventImpl;
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

@objid ("009614d2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnThrowEvent.class, factory=BpmnThrowEventData.Metadata.ObjectFactory.class)
public abstract class BpmnThrowEventData extends BpmnEventData {
    @objid ("1d8e6bb0-61e8-4e7b-b563-36f5ce76e25f")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("ee0e977b-7bac-40b3-b5e9-64e33353c79f")
    @SmaMetaAssociation(metaName="DataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.DataInputSmDependency.class, component = true)
     SmObjectImpl mDataInput;

    @objid ("fd3bf564-3446-49da-8cda-566514919077")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038720-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dc62e26d-283a-4732-8314-6cd58ad68e4f")
        private static SmClass smClass = null;

        @objid ("78df499c-d3d0-4b9f-b07f-ea6300fa5956")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("fd452d93-a72f-4aae-af28-c2dedf5ef7a9")
        private static SmDependency DataInputDep = null;

        @objid ("d71e0e74-52f2-4b7c-8450-50d3f5865aad")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fbce8f4a-63f0-4f6b-90a0-2fe78f07adc2")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("4ade72a7-672b-470d-9a0a-71e7adcea853")
        public static SmDependency DataInputDep() {
            if (DataInputDep == null) {
            	DataInputDep = classof().getDependencyDef("DataInput");
            }
            return DataInputDep;
        }

        @objid ("f3d6054d-ef43-456a-a05e-753915f29190")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("02d19472-dae0-41fe-b314-80fddebdaf01")
        public static SmDependency getDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputDep;
        }

        @objid ("f3fef697-a827-46c2-a974-14cc6925e71c")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("0003cbfe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7db52852-77fe-4e62-966f-c346ce111cfc")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("7bd3dc27-f7d7-4f9e-8a59-d7f24a647098")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00042f0e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputSmDependency extends SmSingleDependency {
            @objid ("f3fc84a9-a721-4cfc-8e58-388af0105bf4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnThrowEventData) data).mDataInput;
            }

            @objid ("511a70bb-dc55-43ed-a312-60916a200d3d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnThrowEventData) data).mDataInput = value;
            }

            @objid ("681e9f64-a009-41d9-9dc2-63ee7aa815c0")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerThrowEventDep();
            }

        }

        @objid ("0004a3b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("0eaf1854-c96e-4bc9-a15a-c6341f88e13a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnThrowEventData)data).mDataInputAssociation != null)? ((BpmnThrowEventData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("1b5d2d52-8292-433c-89dd-5ce78d5e413e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnThrowEventData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnThrowEventData) data).mDataInputAssociation;
            }

            @objid ("3aa166e9-0b52-49c5-9517-184bfcf59009")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingEventDep();
            }

        }

    }

}
