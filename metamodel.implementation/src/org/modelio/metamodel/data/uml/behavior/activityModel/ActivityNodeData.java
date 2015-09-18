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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.data.uml.behavior.activityModel.StructuredActivityNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
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

@objid ("00290914-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityNode.class, factory=ActivityNodeData.Metadata.ObjectFactory.class)
public abstract class ActivityNodeData extends ModelElementData {
    @objid ("4e7cccfa-e685-45ba-bb0d-5df7ebcbbf16")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e0c2b04d-020e-40c4-ba1c-f73cba5bb928")
    @SmaMetaAssociation(metaName="OwnerPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerPartitionSmDependency.class)
     SmObjectImpl mOwnerPartition;

    @objid ("dbcf7df0-cefa-4e23-b468-555a907cf81d")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("b065a7db-9686-442a-9947-7ff165a4702b")
    @SmaMetaAssociation(metaName="OwnerClause", typeDataClass=ClauseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerClauseSmDependency.class)
     SmObjectImpl mOwnerClause;

    @objid ("f84b48ad-b30f-4887-9193-3dea11979dbb")
    @SmaMetaAssociation(metaName="OwnerNode", typeDataClass=StructuredActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerNodeSmDependency.class)
     SmObjectImpl mOwnerNode;

    @objid ("37348a00-10ea-4b8a-9175-b7a785167a7d")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("bd8bb98e-40e3-44d9-9a3e-71a63f6110d5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000044ca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cb473c9b-49ca-4036-a0ac-721e8e019366")
        private static SmClass smClass = null;

        @objid ("085477d2-b881-4878-85cf-788fd5a84baf")
        private static SmDependency OwnerDep = null;

        @objid ("bd4b342e-d4a4-4ec0-8316-28db1e9c8eff")
        private static SmDependency OwnerPartitionDep = null;

        @objid ("c0e73ee7-2f67-42cc-9c9b-46572f135bea")
        private static SmDependency IncomingDep = null;

        @objid ("81719063-d41d-4cdc-8fee-98f802914fef")
        private static SmDependency OwnerClauseDep = null;

        @objid ("ad43fe3c-c9f7-4479-83c7-328ccaf76626")
        private static SmDependency OwnerNodeDep = null;

        @objid ("5f670450-8fad-487b-8318-aaf13c936d81")
        private static SmDependency OutgoingDep = null;

        @objid ("e3348180-57a3-4b20-8eda-1a946df7b551")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("93faa118-7b6b-4d4b-89d5-43fa71d4f884")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("437ecc87-e566-49ab-9558-739fecf467da")
        public static SmDependency OwnerPartitionDep() {
            if (OwnerPartitionDep == null) {
            	OwnerPartitionDep = classof().getDependencyDef("OwnerPartition");
            }
            return OwnerPartitionDep;
        }

        @objid ("5a66890c-684f-48cb-9ff5-69cad571f82e")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("3675e4a9-c09c-4539-bd21-ccfca8bfd6e1")
        public static SmDependency OwnerClauseDep() {
            if (OwnerClauseDep == null) {
            	OwnerClauseDep = classof().getDependencyDef("OwnerClause");
            }
            return OwnerClauseDep;
        }

        @objid ("d0ccf52a-4371-4d9f-a5d1-7e7d5a11805d")
        public static SmDependency OwnerNodeDep() {
            if (OwnerNodeDep == null) {
            	OwnerNodeDep = classof().getDependencyDef("OwnerNode");
            }
            return OwnerNodeDep;
        }

        @objid ("66c48a95-ab1a-4f0e-908d-7c23e1d93e9c")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("6aed4e28-4f6f-4b14-8c85-1995914da0f6")
        public static SmDependency getOwnerClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerClauseDep;
        }

        @objid ("e02946be-d784-4dfe-b13d-3e77f2e581bd")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("9e901a01-6dc9-4ef3-98ae-eaa03256f68f")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("4e8d3e38-da2d-4984-93d5-0ddefdf83f06")
        public static SmDependency getOwnerNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerNodeDep;
        }

        @objid ("42577be9-d81c-4247-9f2a-4213d55bd76b")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("d1ffce35-aa03-4ac7-9c8c-aa773394d0a5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("57ee62c7-0f03-4edc-9709-c6b0d600cb74")
        public static SmDependency getOwnerPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerPartitionDep;
        }

        @objid ("0000922c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("da146a8b-e97e-4cec-85e7-f314643b3db2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("9496c122-34c2-468b-bb60-898ddf3ca1e5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00010108-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("16c20474-bee1-46f8-966e-258d593ac271")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mIncoming != null)? ((ActivityNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("eba2715d-50c4-48c7-b3c0-cb912c2aba22")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mIncoming;
            }

            @objid ("93ecdc98-f4f0-4dd9-b516-e32c29b412a6")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.TargetDep();
            }

        }

        @objid ("0001732c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("3effe2a4-bf76-40f7-995d-325bef4a452c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mOutgoing != null)? ((ActivityNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("80685688-fea6-4b1a-a637-84745cab49e9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mOutgoing;
            }

            @objid ("04f04676-9826-4e84-9fb9-4663dba4bf4b")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.SourceDep();
            }

        }

        @objid ("0001ec12-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("854655c1-dc40-4209-bd4d-aa9542445c66")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwner;
            }

            @objid ("a0bd8b1f-444d-45be-9e84-600cd218b148")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwner = value;
            }

            @objid ("76f66c67-5fd2-4536-b17f-ec107c7d3a83")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedNodeDep();
            }

        }

        @objid ("000263b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerNodeSmDependency extends SmSingleDependency {
            @objid ("114b3201-6eae-43df-96ae-07e27d571b37")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerNode;
            }

            @objid ("26d3f928-ced9-40c9-9880-85edf9d1ef65")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerNode = value;
            }

            @objid ("15ef71e4-b927-4f95-8f67-a0e8cc7ea75e")
            @Override
            public SmDependency getSymetric() {
                return StructuredActivityNodeData.Metadata.BodyDep();
            }

        }

        @objid ("0002dce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerClauseSmDependency extends SmSingleDependency {
            @objid ("08f9e0fd-e890-4b9d-b3ed-3ff3251f3e34")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerClause;
            }

            @objid ("4bf331e4-7bdb-4360-816d-a59a160c3177")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerClause = value;
            }

            @objid ("0536e314-1611-4d36-9712-52149b7ceeaf")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.BodyDep();
            }

        }

        @objid ("000354da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerPartitionSmDependency extends SmSingleDependency {
            @objid ("7993c263-0d88-4bf8-855f-829a6c2825ac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerPartition;
            }

            @objid ("e426fb2a-8aed-4c16-84c9-b50ae3fd4987")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerPartition = value;
            }

            @objid ("e0a2a222-3185-4093-9fe7-23bc485aa671")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.ContainedNodeDep();
            }

        }

    }

}
