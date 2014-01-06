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
    @objid ("69526b49-4c70-4b9b-9d0f-aaac649134ff")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("20aa9d5d-62c6-488b-bdc0-7a777734ddbd")
    @SmaMetaAssociation(metaName="DataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.DataInputSmDependency.class, component = true)
     SmObjectImpl mDataInput;

    @objid ("3fd74ee5-abc6-4705-8103-bca10abd0d1d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038720-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("50910935-2cc8-45fe-9d74-00d9fe79877c")
        private static SmClass smClass = null;

        @objid ("21c36405-77fa-4452-beb6-1c751feb173a")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("240f8980-c06d-4d87-b081-38b6bcbf3b38")
        private static SmDependency DataInputDep = null;

        @objid ("b7ca1298-12f8-45a8-b971-48846a5a6d2a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnThrowEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7354ab23-b7c6-411a-aab0-fdc71e7083dd")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("8197a43f-64bd-410c-ae46-eeb29026723d")
        public static SmDependency DataInputDep() {
            if (DataInputDep == null) {
            	DataInputDep = classof().getDependencyDef("DataInput");
            }
            return DataInputDep;
        }

        @objid ("c841d0c0-23ec-4cff-affa-f092d2e21f17")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("4d06c6af-3bec-4630-a324-d7197d3b0d5c")
        public static SmDependency getDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputDep;
        }

        @objid ("97f4d619-abad-42c5-8508-0b855ecac173")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0003cbfe-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("31b14eab-bb24-42ec-9ef7-2949965f4d80")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3f5165c2-b175-40bd-9fc4-4aa341967034")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00042f0e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputSmDependency extends SmSingleDependency {
            @objid ("f839288f-7060-4737-ae7f-e4a16bdbc51c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnThrowEventData) data).mDataInput;
            }

            @objid ("e5b76bf3-3acd-41ee-b7f1-eac23988049a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnThrowEventData) data).mDataInput = value;
            }

            @objid ("5960ce52-8bae-4973-9d03-529e745ac25c")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerThrowEventDep();
            }

        }

        @objid ("0004a3b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("18f9b5de-50f1-4bff-bcce-6a9eff790465")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnThrowEventData)data).mDataInputAssociation != null)? ((BpmnThrowEventData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("c5103dcb-2634-4505-bf3a-c25daa527d51")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnThrowEventData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnThrowEventData) data).mDataInputAssociation;
            }

            @objid ("61aa217e-bc67-48da-a7d3-ef6b8d8f9171")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingEventDep();
            }

        }

    }

}
