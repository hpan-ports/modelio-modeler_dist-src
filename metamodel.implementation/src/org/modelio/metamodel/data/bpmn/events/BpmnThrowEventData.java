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
    @objid ("8a694691-9749-4ab6-b37e-c7b7dd23f982")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("06a80f8d-97af-485b-9d4e-a69ce0c25d19")
    @SmaMetaAssociation(metaName="DataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.DataInputSmDependency.class, component = true)
     SmObjectImpl mDataInput;

    @objid ("e8be68bb-3c95-4c09-a20a-0a05ba6893c5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038720-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("170edbcd-fdfc-4607-9a1a-4bea96cbbbb6")
        private static SmClass smClass = null;

        @objid ("405587d0-b622-4243-8389-adf34c7261ee")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("240f2dba-e530-4deb-9cf4-895c7241dc2c")
        private static SmDependency DataInputDep = null;

        @objid ("e25888c6-6cf1-49a3-b87b-b91ab99185c4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("128ec6cf-66cd-4a88-94e4-cbac4a277d55")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("56e9bf9a-08d0-40bf-bafc-6cd001fd6a93")
        public static SmDependency DataInputDep() {
            if (DataInputDep == null) {
            	DataInputDep = classof().getDependencyDef("DataInput");
            }
            return DataInputDep;
        }

        @objid ("5664ed61-a0af-4ac6-93e8-08bf18298c69")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("052497ce-7308-4d5e-87e9-3873f4b8a321")
        public static SmDependency getDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputDep;
        }

        @objid ("392fd412-8dee-4fe8-9c0e-996913ac5999")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("0003cbfe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ff5b42a8-ebe0-4ebb-89f4-960061217f23")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("6b83c551-7147-41fc-adec-172ca42b6e51")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00042f0e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputSmDependency extends SmSingleDependency {
            @objid ("85ee5c6e-9976-4366-b803-c3264dc12291")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnThrowEventData) data).mDataInput;
            }

            @objid ("c566d3b1-6b59-46bf-af50-f0587814f241")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnThrowEventData) data).mDataInput = value;
            }

            @objid ("6f28bd36-835a-41c3-8303-8905ead5b712")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerThrowEventDep();
            }

        }

        @objid ("0004a3b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("870d44b0-a3dc-4021-a8d6-8d9fcd3450d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnThrowEventData)data).mDataInputAssociation != null)? ((BpmnThrowEventData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("4ce6bd47-2196-4e83-9aa9-7c561b15c542")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnThrowEventData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnThrowEventData) data).mDataInputAssociation;
            }

            @objid ("d76ba516-e03a-4fe9-a1a4-d691fdb31ded")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingEventDep();
            }

        }

    }

}
