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
    @objid ("40829e02-5f65-4e46-8afc-ccf0346a11e9")
    @SmaMetaAttribute(metaName="ParallelMultiple", type=Boolean.class, smAttributeClass=Metadata.ParallelMultipleSmAttribute.class)
     Object mParallelMultiple = false;

    @objid ("e4480c1c-9aaa-4306-8192-9247687a35f7")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("658b26a8-72e1-4760-a972-7796a42a80b0")
    @SmaMetaAssociation(metaName="DataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.DataOutputSmDependency.class, component = true)
     SmObjectImpl mDataOutput;

    @objid ("155be713-2637-4819-a176-6940634d6653")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f0dda-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("de5b54ff-f315-4a60-83a1-c6ef4aba371c")
        private static SmClass smClass = null;

        @objid ("0db0a6b2-189f-45c3-946f-3d46d6881253")
        private static SmAttribute ParallelMultipleAtt = null;

        @objid ("3a121335-df00-4726-b7f5-f2a37e6dc480")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("ce5377e6-6eee-4c44-bb3b-57bca03f9896")
        private static SmDependency DataOutputDep = null;

        @objid ("978ade61-5cb0-4f28-b846-7e8f89f86194")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ff142df9-1ba6-42a3-9c74-c199ac4bee2e")
        public static SmAttribute ParallelMultipleAtt() {
            if (ParallelMultipleAtt == null) {
            	ParallelMultipleAtt = classof().getAttributeDef("ParallelMultiple");
            }
            return ParallelMultipleAtt;
        }

        @objid ("75784db5-c276-43f8-8c3a-a1bc524f3460")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("8d50a2ee-068f-4c46-99a6-e8ecf0689c30")
        public static SmDependency DataOutputDep() {
            if (DataOutputDep == null) {
            	DataOutputDep = classof().getDependencyDef("DataOutput");
            }
            return DataOutputDep;
        }

        @objid ("2275bcf3-7b62-4b8e-a231-e1c22b16778b")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("d75b07f2-09f9-46ef-9243-5074e8563e3f")
        public static SmDependency getDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputDep;
        }

        @objid ("81fbc947-1857-435d-a36a-9782936eb028")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6db1c60c-290f-4d8b-83b7-f61621ecf1b8")
        public static SmAttribute getParallelMultipleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParallelMultipleAtt;
        }

        @objid ("004f598e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("61b8cd54-277e-47b2-af8c-bfccd14e1f84")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("79434bf1-1f6c-498d-ba97-2d7b1e05d1ee")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004fcbf8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParallelMultipleSmAttribute extends SmAttribute {
            @objid ("dc4d2250-21ff-4062-af45-cae5f93c67c0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mParallelMultiple;
            }

            @objid ("20874179-4410-4b8a-876f-5a5284c7d31a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCatchEventData) data).mParallelMultiple = value;
            }

        }

        @objid ("005032be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputSmDependency extends SmSingleDependency {
            @objid ("b3c0b60b-622b-41b4-8407-4da08da51c41")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mDataOutput;
            }

            @objid ("7b120c3c-66e3-476a-829c-9de4709b2533")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCatchEventData) data).mDataOutput = value;
            }

            @objid ("76b0d804-b1f8-48e7-803b-b811b9dac019")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.CatchedDep();
            }

        }

        @objid ("0050aa64-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("76370ae2-08ef-47a9-93d2-51f09e7e80fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCatchEventData)data).mDataOutputAssociation != null)? ((BpmnCatchEventData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("6a27f93a-4e3b-4963-b9f5-2d1b0ac76f43")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCatchEventData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnCatchEventData) data).mDataOutputAssociation;
            }

            @objid ("26e25b6d-f777-4550-a63e-cffe6c1a79b2")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingEventDep();
            }

        }

    }

}
