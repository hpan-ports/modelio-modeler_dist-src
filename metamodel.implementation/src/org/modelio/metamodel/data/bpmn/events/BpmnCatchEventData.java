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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventImpl;
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

@objid ("008909ea-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCatchEvent.class, factory=BpmnCatchEventData.Metadata.ObjectFactory.class)
public abstract class BpmnCatchEventData extends BpmnEventData {
    @objid ("1fbc93f8-dea1-4d33-b3a8-528922c1be30")
    @SmaMetaAttribute(metaName="ParallelMultiple", type=Boolean.class, smAttributeClass=Metadata.ParallelMultipleSmAttribute.class)
     Object mParallelMultiple = false;

    @objid ("6d7d9152-649f-488c-a75d-9dc063e9b5fc")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("be8ec097-ddbf-437a-af2f-a5bfb4b033ce")
    @SmaMetaAssociation(metaName="DataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.DataOutputSmDependency.class, component = true)
     SmObjectImpl mDataOutput;

    @objid ("073591cf-0216-477f-813a-d9ee896a7680")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f0dda-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1bff6441-3136-4204-9e12-c048ca068f17")
        private static SmClass smClass = null;

        @objid ("2a3182dc-68e4-47d1-b213-949544606918")
        private static SmAttribute ParallelMultipleAtt = null;

        @objid ("4f62de75-987f-4ae6-b16d-f05f5f1bf2cd")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("81704358-4b0b-4ec8-b101-a05df4862b4a")
        private static SmDependency DataOutputDep = null;

        @objid ("63bc1cba-981d-4a65-b2c4-b6e99840810a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c602b1bf-fd4e-4cc4-af0e-036f71007918")
        public static SmAttribute ParallelMultipleAtt() {
            if (ParallelMultipleAtt == null) {
            	ParallelMultipleAtt = classof().getAttributeDef("ParallelMultiple");
            }
            return ParallelMultipleAtt;
        }

        @objid ("cac441dd-76a3-4c40-a6e1-7ba5d3ca94f3")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("afb5ad23-2813-4223-86c4-0511d0f75afd")
        public static SmDependency DataOutputDep() {
            if (DataOutputDep == null) {
            	DataOutputDep = classof().getDependencyDef("DataOutput");
            }
            return DataOutputDep;
        }

        @objid ("fea431e8-725a-456e-800d-17c1e826f968")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("5945c336-d862-4d00-b2b3-492d82cead5f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("45e40fcf-1db6-44fa-b27a-255abba026fd")
        public static SmAttribute getParallelMultipleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParallelMultipleAtt;
        }

        @objid ("88cddae2-0548-45ef-a3f3-e79d86774aca")
        public static SmDependency getDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputDep;
        }

        @objid ("004f598e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79b0e701-c069-4f13-add5-dfa31d1b6da5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("1343ecb9-803e-412b-b928-c6985e41c3ff")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004fcbf8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParallelMultipleSmAttribute extends SmAttribute {
            @objid ("19fdc8a1-89d6-422e-9d8c-d248e4080ff6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mParallelMultiple;
            }

            @objid ("3e044827-818e-4666-a103-bc4298cb10de")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCatchEventData) data).mParallelMultiple = value;
            }

        }

        @objid ("005032be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputSmDependency extends SmSingleDependency {
            @objid ("11764ff3-abf9-4bcf-b825-edc7341ddbe2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mDataOutput;
            }

            @objid ("3e486d6b-3afe-4b89-b3b0-bd002e293186")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCatchEventData) data).mDataOutput = value;
            }

            @objid ("331db158-88d3-4ce5-8f37-f249dbf0eadd")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.CatchedDep();
            }

        }

        @objid ("0050aa64-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("9fcfcb78-6ed6-4a7f-878f-b2c1a5914dc9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCatchEventData)data).mDataOutputAssociation != null)? ((BpmnCatchEventData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("7ecd8b78-7619-4125-a949-c5a0d8802784")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCatchEventData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnCatchEventData) data).mDataOutputAssociation;
            }

            @objid ("291e6982-0efc-49f6-b341-183846c32610")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingEventDep();
            }

        }

    }

}
