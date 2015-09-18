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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.MessageFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
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

@objid ("002a3320-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityPartition.class, factory=ActivityPartitionData.Metadata.ObjectFactory.class)
public class ActivityPartitionData extends ActivityGroupData {
    @objid ("caa55c0f-6f82-45e3-9c9f-d2447ebfec99")
    @SmaMetaAttribute(metaName="IsDimension", type=Boolean.class, smAttributeClass=Metadata.IsDimensionSmAttribute.class)
     Object mIsDimension = false;

    @objid ("ce6160e8-2c54-486e-a701-59fa7e6f056e")
    @SmaMetaAttribute(metaName="IsExternal", type=Boolean.class, smAttributeClass=Metadata.IsExternalSmAttribute.class)
     Object mIsExternal = false;

    @objid ("dddeb1cf-ab0c-43e0-a2ab-5ffd2277aa8d")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("b591d0de-945f-4112-86b6-6114f4d93a11")
    @SmaMetaAssociation(metaName="ContainedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.ContainedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mContainedNode = null;

    @objid ("bba57b6d-b4f2-4844-8f46-5466dd807baa")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("4565345f-4b1e-4721-a209-7a0ff8e3e720")
    @SmaMetaAssociation(metaName="SuperPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SuperPartitionSmDependency.class)
     SmObjectImpl mSuperPartition;

    @objid ("1a5e9412-bf51-4845-b25b-59d68eeea06d")
    @SmaMetaAssociation(metaName="SubPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.SubPartitionSmDependency.class, component = true)
     List<SmObjectImpl> mSubPartition = null;

    @objid ("2d1ccc5c-6c91-49f6-abe9-d693a4b48833")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class)
     List<SmObjectImpl> mIncoming = null;

    @objid ("89944766-e704-48da-87e1-cf58523cf3d9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8ffc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d206709c-179f-46ad-9b58-187838fb6435")
        private static SmClass smClass = null;

        @objid ("e0d35a99-72db-41c6-bab7-9d2268ab47c0")
        private static SmAttribute IsDimensionAtt = null;

        @objid ("0da7611f-d9b5-44a5-9583-bbcfe51d3289")
        private static SmAttribute IsExternalAtt = null;

        @objid ("f8c30230-4ca1-4a7e-8ec0-78bb4309dfca")
        private static SmDependency RepresentedDep = null;

        @objid ("20e3fb7f-e3f6-4979-a3ed-d4ac1febd2cf")
        private static SmDependency ContainedNodeDep = null;

        @objid ("5ee38b3c-61d3-4129-a06b-656b511d8650")
        private static SmDependency OutgoingDep = null;

        @objid ("e6b6ea0b-c54b-44e6-b675-0ca8b4239ead")
        private static SmDependency SuperPartitionDep = null;

        @objid ("85f1fe2a-220f-4822-b6f8-eb2a7a3605ce")
        private static SmDependency SubPartitionDep = null;

        @objid ("4732d667-8376-4a5a-b6de-e14a7e035923")
        private static SmDependency IncomingDep = null;

        @objid ("1c7e99f8-72ba-42bc-b5a2-f9ae2bfa1350")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityPartitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("48a17630-6322-4ba7-aa68-aa2a17822cc6")
        public static SmAttribute IsDimensionAtt() {
            if (IsDimensionAtt == null) {
            	IsDimensionAtt = classof().getAttributeDef("IsDimension");
            }
            return IsDimensionAtt;
        }

        @objid ("b24e8fc6-ae9a-41ef-9564-679c78cf90c8")
        public static SmAttribute IsExternalAtt() {
            if (IsExternalAtt == null) {
            	IsExternalAtt = classof().getAttributeDef("IsExternal");
            }
            return IsExternalAtt;
        }

        @objid ("5b79ea5a-8144-4d4c-8cc7-f24af5d3da5f")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("872c96f0-a514-4097-b3de-1bf6b3c23ac3")
        public static SmDependency ContainedNodeDep() {
            if (ContainedNodeDep == null) {
            	ContainedNodeDep = classof().getDependencyDef("ContainedNode");
            }
            return ContainedNodeDep;
        }

        @objid ("c95c4b97-e84d-4539-8f0b-e1c7d2c27b2e")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("6163be2d-b5de-47da-b1d3-c851981bdff7")
        public static SmDependency SuperPartitionDep() {
            if (SuperPartitionDep == null) {
            	SuperPartitionDep = classof().getDependencyDef("SuperPartition");
            }
            return SuperPartitionDep;
        }

        @objid ("e8644969-eb99-45b1-9cd9-7589fde3b72f")
        public static SmDependency SubPartitionDep() {
            if (SubPartitionDep == null) {
            	SubPartitionDep = classof().getDependencyDef("SubPartition");
            }
            return SubPartitionDep;
        }

        @objid ("d4d64eef-f398-4fa5-8ed4-f947e2cf1a44")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("373ff60d-51fe-409c-b162-57e3813272fe")
        public static SmDependency getContainedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainedNodeDep;
        }

        @objid ("0bf1cb54-06b6-446d-bbf9-b7d5cc065855")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("cf2b6245-7028-4396-b234-8dfd8178900f")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("56343586-711e-4b56-a3d8-da3fe8ab964d")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("e44eb0fc-cc3b-4861-957f-0aa64607e882")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("366f1236-9563-47a9-8740-dbed3d1240a2")
        public static SmDependency getSubPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubPartitionDep;
        }

        @objid ("0e3be716-cadb-4b33-a432-eb11cab211e8")
        public static SmAttribute getIsDimensionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDimensionAtt;
        }

        @objid ("bd95451d-4532-43a8-bd2a-d17932414717")
        public static SmAttribute getIsExternalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExternalAtt;
        }

        @objid ("195ddddb-23c8-4d4a-93fa-6882c0d3f823")
        public static SmDependency getSuperPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperPartitionDep;
        }

        @objid ("005fd200-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a378aac3-2be4-4191-895c-01629187c908")
            public ISmObjectData createData() {
                return new ActivityPartitionData();
            }

            @objid ("5665b1c8-3290-4c0e-a757-bc05a0a8f4f6")
            public SmObjectImpl createImpl() {
                return new ActivityPartitionImpl();
            }

        }

        @objid ("006034f2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDimensionSmAttribute extends SmAttribute {
            @objid ("6ac5cce2-7d79-4ddd-a436-88b6220c634e")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsDimension;
            }

            @objid ("7494406e-3de8-41d6-817d-b87a6e887672")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsDimension = value;
            }

        }

        @objid ("00609956-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExternalSmAttribute extends SmAttribute {
            @objid ("8b083c12-52e9-4649-b64f-94bdd0350e95")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsExternal;
            }

            @objid ("03552463-a7ab-4ec7-b34c-879ed7fd705e")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsExternal = value;
            }

        }

        @objid ("0060fe82-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("e6eaca0c-7c73-4953-a83c-af9e6cdfa9de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mOutgoing != null)? ((ActivityPartitionData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("c4aec2f2-c17b-4115-b35f-06a36130aebc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mOutgoing;
            }

            @objid ("26004603-92f3-4de5-af37-b86258a4770c")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.SourcePartitionDep();
            }

        }

        @objid ("00616304-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("2a976534-25ed-4f6b-a833-f1ac7dac1a71")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mIncoming != null)? ((ActivityPartitionData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("0c748c38-4477-4a2d-a6ba-7363cf210bcf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mIncoming;
            }

            @objid ("d01da235-3e66-43f3-ad5d-01a8c35764f4")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.TargetPartitionDep();
            }

        }

        @objid ("0061cace-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("fab488ce-e54f-43ef-b54a-e9ea3825d647")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mRepresented;
            }

            @objid ("2b194300-a3a8-49af-b302-d007306cc974")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mRepresented = value;
            }

            @objid ("61302fd1-bd27-40c2-8cb6-00c62730467f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingPartitionDep();
            }

        }

        @objid ("0062431e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubPartitionSmDependency extends SmMultipleDependency {
            @objid ("2a6b5b5e-7d5a-481c-844f-a0a8f24209c5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mSubPartition != null)? ((ActivityPartitionData)data).mSubPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("1249a5e4-74e4-4e0a-867c-efeeae6fb988")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mSubPartition = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mSubPartition;
            }

            @objid ("c24023da-e529-45e7-af96-051618790d13")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SuperPartitionDep();
            }

        }

        @objid ("0062a9c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperPartitionSmDependency extends SmSingleDependency {
            @objid ("d9a47286-0114-4e98-99b8-3faee4b15471")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mSuperPartition;
            }

            @objid ("b6558163-5ff9-4a6b-acc9-5b54ae5fe96d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mSuperPartition = value;
            }

            @objid ("e3cd005d-bddb-4373-b3b6-99872cff5bd1")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SubPartitionDep();
            }

        }

        @objid ("006323a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ContainedNodeSmDependency extends SmMultipleDependency {
            @objid ("3e48ff0a-85ab-458f-8b87-d83b56a47b36")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mContainedNode != null)? ((ActivityPartitionData)data).mContainedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("ef033bc6-176c-4b86-aba4-4ab250ecdf02")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mContainedNode = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mContainedNode;
            }

            @objid ("43e55420-8241-4884-ae68-297175472352")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerPartitionDep();
            }

        }

    }

}
