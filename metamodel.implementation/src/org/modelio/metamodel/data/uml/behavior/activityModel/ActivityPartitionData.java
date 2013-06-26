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
    @objid ("dbf5566f-d103-415d-8c17-b3c712d28841")
    @SmaMetaAttribute(metaName="IsDimension", type=Boolean.class, smAttributeClass=Metadata.IsDimensionSmAttribute.class)
     Object mIsDimension = false;

    @objid ("8924989a-cf1f-4f07-8195-7d1d4fdc6f14")
    @SmaMetaAttribute(metaName="IsExternal", type=Boolean.class, smAttributeClass=Metadata.IsExternalSmAttribute.class)
     Object mIsExternal = false;

    @objid ("e4a5254a-7f5b-4a9b-9b1b-96900e71b4b8")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("4900c3f9-396d-42ff-b4dd-4b8932cab228")
    @SmaMetaAssociation(metaName="ContainedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.ContainedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mContainedNode = null;

    @objid ("4143837b-091f-4f2a-b0dc-f8d66d177941")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("78f2f8b1-4c1a-4816-ba9e-20fe7a208b5b")
    @SmaMetaAssociation(metaName="SuperPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SuperPartitionSmDependency.class)
     SmObjectImpl mSuperPartition;

    @objid ("5e35e00b-690e-46c2-9fd7-cc6253652f9f")
    @SmaMetaAssociation(metaName="SubPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.SubPartitionSmDependency.class, component = true)
     List<SmObjectImpl> mSubPartition = null;

    @objid ("8a708d2c-eebd-4652-8dfc-aaf967696777")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class)
     List<SmObjectImpl> mIncoming = null;

    @objid ("0c34b745-5519-4965-8b2c-aaae20b4cf19")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8ffc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c0986991-916d-4599-afdc-e7ab689cdbf0")
        private static SmClass smClass = null;

        @objid ("4d5f5e33-58c3-44ad-aaa5-70d5c22df5b6")
        private static SmAttribute IsDimensionAtt = null;

        @objid ("d75c85aa-c0e6-42fc-9585-8eeaa47011b2")
        private static SmAttribute IsExternalAtt = null;

        @objid ("c2f20496-3c15-4c59-b240-e1c8b67f5ccc")
        private static SmDependency RepresentedDep = null;

        @objid ("bbc52aec-f143-4ce0-be9b-8971b48397b5")
        private static SmDependency ContainedNodeDep = null;

        @objid ("6d1a280c-73b1-49be-9342-cbd2678735ed")
        private static SmDependency OutgoingDep = null;

        @objid ("ab35ca19-abd1-44f7-8f94-26dd49f28509")
        private static SmDependency SuperPartitionDep = null;

        @objid ("09507418-1fdf-450e-8130-2c82157b5261")
        private static SmDependency SubPartitionDep = null;

        @objid ("16ff91ed-730f-4284-9f6e-78e9905adac3")
        private static SmDependency IncomingDep = null;

        @objid ("ecb6ab82-38be-4694-b79b-0b442dfb6f95")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityPartitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("020a68a9-6a0f-4cc6-a840-9ae62fa995a5")
        public static SmAttribute IsDimensionAtt() {
            if (IsDimensionAtt == null) {
            	IsDimensionAtt = classof().getAttributeDef("IsDimension");
            }
            return IsDimensionAtt;
        }

        @objid ("21252643-c6a3-43ee-9708-e0d8f5db65e5")
        public static SmAttribute IsExternalAtt() {
            if (IsExternalAtt == null) {
            	IsExternalAtt = classof().getAttributeDef("IsExternal");
            }
            return IsExternalAtt;
        }

        @objid ("1fcb2d68-48b6-4681-8691-45f0d09f54c2")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("9cbf21f6-764f-42de-bf4d-7b3a505b8803")
        public static SmDependency ContainedNodeDep() {
            if (ContainedNodeDep == null) {
            	ContainedNodeDep = classof().getDependencyDef("ContainedNode");
            }
            return ContainedNodeDep;
        }

        @objid ("f27ae9ff-9997-4603-8b1c-8948ed435aba")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("e9bfbffe-97f3-49bd-b808-8426320c1491")
        public static SmDependency SuperPartitionDep() {
            if (SuperPartitionDep == null) {
            	SuperPartitionDep = classof().getDependencyDef("SuperPartition");
            }
            return SuperPartitionDep;
        }

        @objid ("ad602367-e674-4ba4-b170-7cb2b7f86a6a")
        public static SmDependency SubPartitionDep() {
            if (SubPartitionDep == null) {
            	SubPartitionDep = classof().getDependencyDef("SubPartition");
            }
            return SubPartitionDep;
        }

        @objid ("8aa68da9-2399-4ec1-b3fa-9f4b3d00700a")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("a3205c61-f4b8-4afa-8eb7-ad15574d798b")
        public static SmDependency getSuperPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperPartitionDep;
        }

        @objid ("acc2a98a-cf68-484b-83f9-c149240dc4ca")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("803be556-041c-456a-8eab-15a8efdea44a")
        public static SmDependency getSubPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubPartitionDep;
        }

        @objid ("f4739a77-6915-41ed-8a88-4adbf72b6245")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("80c33c01-9d49-4c61-bb68-2fb31b31939b")
        public static SmAttribute getIsDimensionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDimensionAtt;
        }

        @objid ("0754a591-6a18-47cf-b358-adbdec5a4675")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("e2e136cf-e976-4157-8e7e-2951fd43cef4")
        public static SmDependency getContainedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainedNodeDep;
        }

        @objid ("1c432251-8122-4613-af7f-280d749b9578")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ca46f24b-a842-4ffa-bbc8-df00d95bcfe4")
        public static SmAttribute getIsExternalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExternalAtt;
        }

        @objid ("005fd200-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3f6384b0-a0b1-4ff9-8835-9d7a6a18be42")
            public ISmObjectData createData() {
                return new ActivityPartitionData();
            }

            @objid ("5da6889b-3078-4244-a0e0-1532ae6cf82d")
            public SmObjectImpl createImpl() {
                return new ActivityPartitionImpl();
            }

        }

        @objid ("006034f2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDimensionSmAttribute extends SmAttribute {
            @objid ("1599d299-d904-4ed2-805a-bc15e6fed946")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsDimension;
            }

            @objid ("ce3c9df8-5988-457c-ba25-ef31f19f92f0")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsDimension = value;
            }

        }

        @objid ("00609956-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExternalSmAttribute extends SmAttribute {
            @objid ("4d9bb7d3-aa04-4f92-b829-1a821be37158")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsExternal;
            }

            @objid ("d5b43153-1fd9-41a7-8a88-ccedf4e970c8")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsExternal = value;
            }

        }

        @objid ("0060fe82-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("079948c1-9462-49a4-b68c-f81f30b14c82")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mOutgoing != null)? ((ActivityPartitionData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("34bc5925-d21c-4151-b701-3eeed77eb6a9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mOutgoing;
            }

            @objid ("9b2ab541-5302-4a53-9f0c-d1907af2c4e3")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.SourcePartitionDep();
            }

        }

        @objid ("00616304-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("a2e6c936-85be-4ef6-8c71-7df8cff7f87c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mIncoming != null)? ((ActivityPartitionData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("930f6d72-32a0-4f45-9f10-6e5a8d1eceaa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mIncoming;
            }

            @objid ("3187ad6e-8cf7-419d-98ad-c41106626342")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.TargetPartitionDep();
            }

        }

        @objid ("0061cace-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("94b702e3-c30e-479c-aa33-cd5ea1a0732f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mRepresented;
            }

            @objid ("b95244de-a7a4-49e2-9924-e221016a87ca")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mRepresented = value;
            }

            @objid ("9802660c-535c-4f8a-b1f1-fd94f90995c7")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingPartitionDep();
            }

        }

        @objid ("0062431e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubPartitionSmDependency extends SmMultipleDependency {
            @objid ("266756a2-47ce-489d-be5f-d662b92e6b00")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mSubPartition != null)? ((ActivityPartitionData)data).mSubPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("91df0712-48a1-46e3-ab28-c4aa211a6f93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mSubPartition = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mSubPartition;
            }

            @objid ("e3d3cb37-acc8-426b-bce2-b47233f2f50b")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SuperPartitionDep();
            }

        }

        @objid ("0062a9c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperPartitionSmDependency extends SmSingleDependency {
            @objid ("c61fbe26-e9fd-49d0-870c-9ac20f2df1e8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mSuperPartition;
            }

            @objid ("73423302-c520-4652-81f4-d84716491389")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mSuperPartition = value;
            }

            @objid ("9f924845-6837-442f-a873-5724cf46d12d")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SubPartitionDep();
            }

        }

        @objid ("006323a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ContainedNodeSmDependency extends SmMultipleDependency {
            @objid ("9395f9b2-1786-49f3-b1d3-a975a3e137f2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mContainedNode != null)? ((ActivityPartitionData)data).mContainedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("2ee2309a-5601-4387-a514-8623a2305f95")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mContainedNode = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mContainedNode;
            }

            @objid ("e6d9bb26-377c-4ee7-8fc6-fc3344588d7b")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerPartitionDep();
            }

        }

    }

}
