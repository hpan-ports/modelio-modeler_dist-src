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
    @objid ("14dedcb7-6cae-434d-8714-c0d9f3fd6875")
    @SmaMetaAttribute(metaName="ParallelMultiple", type=Boolean.class, smAttributeClass=Metadata.ParallelMultipleSmAttribute.class)
     Object mParallelMultiple = false;

    @objid ("59031a7d-d488-4027-9832-5f503fdd3c71")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("6d8ea94b-57a8-4763-a64e-7942c60e0125")
    @SmaMetaAssociation(metaName="DataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.DataOutputSmDependency.class, component = true)
     SmObjectImpl mDataOutput;

    @objid ("ad6ae87a-91c8-40cc-a0b0-d251347205df")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f0dda-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8041609c-0d27-4aaa-9b56-4649814de99b")
        private static SmClass smClass = null;

        @objid ("720ef54d-06ce-413b-bf1d-cb0aa979b27f")
        private static SmAttribute ParallelMultipleAtt = null;

        @objid ("c0d28926-c77d-4b82-926b-f26841186a68")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("8a842e3b-690c-408a-b1f3-3eb142d16377")
        private static SmDependency DataOutputDep = null;

        @objid ("575b7c11-af33-436a-ba2c-74d78f24bf21")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCatchEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("427217c4-a709-4dea-8329-d9624623e477")
        public static SmAttribute ParallelMultipleAtt() {
            if (ParallelMultipleAtt == null) {
            	ParallelMultipleAtt = classof().getAttributeDef("ParallelMultiple");
            }
            return ParallelMultipleAtt;
        }

        @objid ("6e11bc27-c045-4fa8-bc1d-d98b4be4617d")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("c72522fd-3b64-4dc9-b7b4-43745e7af447")
        public static SmDependency DataOutputDep() {
            if (DataOutputDep == null) {
            	DataOutputDep = classof().getDependencyDef("DataOutput");
            }
            return DataOutputDep;
        }

        @objid ("ebeb1eb2-860a-4630-913d-13c83ddebe27")
        public static SmDependency getDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputDep;
        }

        @objid ("7967dc84-785f-416c-b386-d9a79be1a82b")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("13626f0d-0b7d-434b-a4bb-253ce1ecaac9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fea10812-643b-4d8c-b922-f429557ae42c")
        public static SmAttribute getParallelMultipleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParallelMultipleAtt;
        }

        @objid ("004f598e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("000f9d76-2c8b-4e40-b881-16cc6b7d3325")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a4308390-0f6d-4f99-bcc3-71c4f9718aef")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004fcbf8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParallelMultipleSmAttribute extends SmAttribute {
            @objid ("185bd85b-47ab-45aa-948c-63c0f4795b59")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mParallelMultiple;
            }

            @objid ("999d8891-37ab-4e23-870f-6053cc924e9a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCatchEventData) data).mParallelMultiple = value;
            }

        }

        @objid ("005032be-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputSmDependency extends SmSingleDependency {
            @objid ("9ee23073-ae7f-4eaf-ba6f-c092d9355a5c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCatchEventData) data).mDataOutput;
            }

            @objid ("5126b685-3726-4975-b8af-f54b3d37103a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCatchEventData) data).mDataOutput = value;
            }

            @objid ("b458c92e-0eab-4ea8-87f7-0925629763df")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.CatchedDep();
            }

        }

        @objid ("0050aa64-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("521f12fe-a5a1-419b-8034-717cc2eea8b4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCatchEventData)data).mDataOutputAssociation != null)? ((BpmnCatchEventData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("103a3b54-8989-4aa2-9361-84c084819cd4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCatchEventData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnCatchEventData) data).mDataOutputAssociation;
            }

            @objid ("fae890f3-27fb-4a5b-a58c-65b5a2b9b799")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingEventDep();
            }

        }

    }

}
