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
    @objid ("393dafb4-947e-4a83-bdce-4e7d85ec30ba")
    @SmaMetaAttribute(metaName="IsDimension", type=Boolean.class, smAttributeClass=Metadata.IsDimensionSmAttribute.class)
     Object mIsDimension = false;

    @objid ("fb5a79f5-280c-4902-8d48-17cd4facb437")
    @SmaMetaAttribute(metaName="IsExternal", type=Boolean.class, smAttributeClass=Metadata.IsExternalSmAttribute.class)
     Object mIsExternal = false;

    @objid ("c27c2b30-139a-4881-8079-cb76dba82afb")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("7888af57-8794-456f-8aff-bde35f8f611f")
    @SmaMetaAssociation(metaName="ContainedNode", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.ContainedNodeSmDependency.class, component = true)
     List<SmObjectImpl> mContainedNode = null;

    @objid ("55f4191b-3d6a-40dd-b0b1-d5718b4b7fe0")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("dfd40838-526c-40a6-9b7c-748e7904c951")
    @SmaMetaAssociation(metaName="SuperPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SuperPartitionSmDependency.class)
     SmObjectImpl mSuperPartition;

    @objid ("989dd828-f07a-41c2-b2b0-416c78738fde")
    @SmaMetaAssociation(metaName="SubPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.SubPartitionSmDependency.class, component = true)
     List<SmObjectImpl> mSubPartition = null;

    @objid ("d7c0fb0b-de8b-49ed-9177-8075dd797bf5")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=MessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class)
     List<SmObjectImpl> mIncoming = null;

    @objid ("01f47e27-23fd-4cfb-8a8b-192b83e9a825")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005f8ffc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("00b78c97-390d-47db-b927-d3e4de5e2e2d")
        private static SmClass smClass = null;

        @objid ("0d361bcf-d711-4b4d-8011-abd7b9b0f54f")
        private static SmAttribute IsDimensionAtt = null;

        @objid ("2157bf2b-355b-49a0-8118-527d251664b7")
        private static SmAttribute IsExternalAtt = null;

        @objid ("f406bc9f-8aac-4dfe-b64b-743468be7236")
        private static SmDependency RepresentedDep = null;

        @objid ("95a3e07b-ace0-4439-897d-7576d68d1321")
        private static SmDependency ContainedNodeDep = null;

        @objid ("04fdf854-664e-4925-89c9-512425e2baa8")
        private static SmDependency OutgoingDep = null;

        @objid ("3e0c765d-1d87-4571-993a-a566754eb48f")
        private static SmDependency SuperPartitionDep = null;

        @objid ("9f3cbca5-caee-414d-9196-3e3baa778807")
        private static SmDependency SubPartitionDep = null;

        @objid ("f5de7165-c903-45a4-96ac-a5a06facbb3b")
        private static SmDependency IncomingDep = null;

        @objid ("22cf9fec-228d-42aa-8d4c-b1b59860e701")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityPartitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("654f699e-5d46-49da-ba2a-51ef20ba9d14")
        public static SmAttribute IsDimensionAtt() {
            if (IsDimensionAtt == null) {
            	IsDimensionAtt = classof().getAttributeDef("IsDimension");
            }
            return IsDimensionAtt;
        }

        @objid ("051b64ab-2e6e-449d-9b4c-b2af661bf584")
        public static SmAttribute IsExternalAtt() {
            if (IsExternalAtt == null) {
            	IsExternalAtt = classof().getAttributeDef("IsExternal");
            }
            return IsExternalAtt;
        }

        @objid ("bfc98512-0b25-4bec-a292-53146209719e")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("82f9ddf3-8e57-45ae-a9da-ca84429178cf")
        public static SmDependency ContainedNodeDep() {
            if (ContainedNodeDep == null) {
            	ContainedNodeDep = classof().getDependencyDef("ContainedNode");
            }
            return ContainedNodeDep;
        }

        @objid ("314ca5c2-5ebc-4bfc-88ee-7cd8bc54d20c")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("fd004fef-a8c4-4988-871a-1f6f20634013")
        public static SmDependency SuperPartitionDep() {
            if (SuperPartitionDep == null) {
            	SuperPartitionDep = classof().getDependencyDef("SuperPartition");
            }
            return SuperPartitionDep;
        }

        @objid ("811d7bb2-d288-48c4-907c-dc539ebc24d1")
        public static SmDependency SubPartitionDep() {
            if (SubPartitionDep == null) {
            	SubPartitionDep = classof().getDependencyDef("SubPartition");
            }
            return SubPartitionDep;
        }

        @objid ("28b51f9f-d425-4443-8bfa-b97ee78c9e90")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("a9da0125-e3fe-43ab-9e5d-1594f2b4de71")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7bd805c0-76b5-4069-9010-8a0a596f8c44")
        public static SmAttribute getIsExternalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExternalAtt;
        }

        @objid ("88b2db45-9eaf-46ac-97fd-cabf5ee5f923")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("ac7b6dc5-a19d-4d01-9fd2-b425d47a7f6f")
        public static SmAttribute getIsDimensionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDimensionAtt;
        }

        @objid ("02684e5e-67d2-41a2-a276-ee79e28ef01d")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("b73b4b7c-8327-4f74-bafe-b08606a7dc01")
        public static SmDependency getSuperPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperPartitionDep;
        }

        @objid ("0af19fb2-4f58-44d9-b8e4-aeaf170a0b21")
        public static SmDependency getContainedNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainedNodeDep;
        }

        @objid ("9f4922a0-88ed-4fab-9b0c-026ecebf137d")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("a8e04725-6b03-4767-a3de-43fad3f06fdc")
        public static SmDependency getSubPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubPartitionDep;
        }

        @objid ("005fd200-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d160c25a-7c90-4894-86b6-f54c45a29ffa")
            public ISmObjectData createData() {
                return new ActivityPartitionData();
            }

            @objid ("27eb25ba-2625-420e-b80b-74aa5956a762")
            public SmObjectImpl createImpl() {
                return new ActivityPartitionImpl();
            }

        }

        @objid ("006034f2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsDimensionSmAttribute extends SmAttribute {
            @objid ("c250797c-d37c-416a-b468-a293f62b1010")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsDimension;
            }

            @objid ("05479e8e-7504-440c-bd62-709125019dec")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsDimension = value;
            }

        }

        @objid ("00609956-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExternalSmAttribute extends SmAttribute {
            @objid ("16f513fd-e252-4b6b-b3ae-b644924f8e56")
            public Object getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mIsExternal;
            }

            @objid ("53a70929-7d5d-41cb-9d58-53b3c678c50a")
            public void setValue(ISmObjectData data, Object value) {
                ((ActivityPartitionData) data).mIsExternal = value;
            }

        }

        @objid ("0060fe82-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("5b04b293-8cb2-44f6-a540-0460955d4619")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mOutgoing != null)? ((ActivityPartitionData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("d4ef95dd-1c01-4279-abaa-9938b0d3203a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mOutgoing;
            }

            @objid ("e0a9ad77-6a6e-42be-9743-96c14e31c71c")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.SourcePartitionDep();
            }

        }

        @objid ("00616304-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("89874784-c582-49fc-9f82-84c2e5ca4ba3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mIncoming != null)? ((ActivityPartitionData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("0e55aaa8-e7b0-46b5-b970-3f2c09fdc5e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mIncoming;
            }

            @objid ("1331ead1-d425-4010-8234-9b8f4db3bc04")
            @Override
            public SmDependency getSymetric() {
                return MessageFlowData.Metadata.TargetPartitionDep();
            }

        }

        @objid ("0061cace-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("55bbd5db-37ce-40db-9102-a4906bd1f516")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mRepresented;
            }

            @objid ("034afd1c-fdbc-4295-8755-eb094b109537")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mRepresented = value;
            }

            @objid ("184189e3-79f3-40d5-9767-de16bcf0c11f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingPartitionDep();
            }

        }

        @objid ("0062431e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubPartitionSmDependency extends SmMultipleDependency {
            @objid ("660f18e6-8ce9-4062-b36c-560e3ea2c131")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mSubPartition != null)? ((ActivityPartitionData)data).mSubPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("74c30222-8cf5-4fc2-8f55-ef279da4aaca")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mSubPartition = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mSubPartition;
            }

            @objid ("8014ac39-ecde-4884-b5e8-1de1a7c2fce3")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SuperPartitionDep();
            }

        }

        @objid ("0062a9c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperPartitionSmDependency extends SmSingleDependency {
            @objid ("5ee16793-33c4-42ba-a589-9fe9289d6389")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityPartitionData) data).mSuperPartition;
            }

            @objid ("97e1a7e8-6cb6-4f83-a355-08f1f1690496")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityPartitionData) data).mSuperPartition = value;
            }

            @objid ("f05298ec-ea0f-4b8a-b8bc-9a08192ae72b")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.SubPartitionDep();
            }

        }

        @objid ("006323a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ContainedNodeSmDependency extends SmMultipleDependency {
            @objid ("76fb04f3-8a0b-449c-a0ce-16544fce62f4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityPartitionData)data).mContainedNode != null)? ((ActivityPartitionData)data).mContainedNode:SmMultipleDependency.EMPTY;
            }

            @objid ("3e126e43-e374-4858-94aa-a450bc3453ff")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityPartitionData) data).mContainedNode = new ArrayList<>(initialCapacity);
                return ((ActivityPartitionData) data).mContainedNode;
            }

            @objid ("23971772-26ba-4d0b-a9d2-27829c407767")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerPartitionDep();
            }

        }

    }

}
