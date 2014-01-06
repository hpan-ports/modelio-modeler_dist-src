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
    @objid ("e39f85c6-9bde-49a2-9db1-3e73448ed8eb")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("2a37924e-7a02-4783-b43b-77fd9a6c8e1b")
    @SmaMetaAssociation(metaName="OwnerPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerPartitionSmDependency.class)
     SmObjectImpl mOwnerPartition;

    @objid ("96e00b14-da09-45c1-85c1-d984ea3edb27")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("9cc27b30-d22f-464c-90ce-25bfedf3bebd")
    @SmaMetaAssociation(metaName="OwnerClause", typeDataClass=ClauseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerClauseSmDependency.class)
     SmObjectImpl mOwnerClause;

    @objid ("5763ee27-d6a8-4b49-a1cd-7e2ef537212d")
    @SmaMetaAssociation(metaName="OwnerNode", typeDataClass=StructuredActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerNodeSmDependency.class)
     SmObjectImpl mOwnerNode;

    @objid ("ea14b4ce-866a-4f86-89a3-8d7c88a613be")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("b96b5c3f-caa7-423f-b488-65663ee9906b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000044ca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8ec6b084-7ae9-4d78-9f94-2967b51ad909")
        private static SmClass smClass = null;

        @objid ("057a196b-7acf-45a8-932d-057bd76a59c4")
        private static SmDependency OwnerDep = null;

        @objid ("d8df882b-067b-4816-a0c4-090e7a2d0e25")
        private static SmDependency OwnerPartitionDep = null;

        @objid ("53c1b11c-0c32-4bba-815d-64fb0d91a282")
        private static SmDependency IncomingDep = null;

        @objid ("5ef16855-0b38-4d0e-bff4-773d0030a551")
        private static SmDependency OwnerClauseDep = null;

        @objid ("7353c7fa-9957-4425-a8c3-32945c92e8a4")
        private static SmDependency OwnerNodeDep = null;

        @objid ("17b8eaac-0313-44be-8083-dc1fcdc8bb88")
        private static SmDependency OutgoingDep = null;

        @objid ("f1a144c6-2f48-477b-b196-f78aaafa6f93")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e58507ca-555e-4615-8898-4def10d224bf")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("7a8b30d9-910d-4055-8a98-5fd0495a5dfa")
        public static SmDependency OwnerPartitionDep() {
            if (OwnerPartitionDep == null) {
            	OwnerPartitionDep = classof().getDependencyDef("OwnerPartition");
            }
            return OwnerPartitionDep;
        }

        @objid ("7111ba20-e137-47e9-b9cb-38b2507a206d")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("a4e78a1c-3a12-46b3-9c58-583ec2d7a403")
        public static SmDependency OwnerClauseDep() {
            if (OwnerClauseDep == null) {
            	OwnerClauseDep = classof().getDependencyDef("OwnerClause");
            }
            return OwnerClauseDep;
        }

        @objid ("75ca56e2-6c6f-4c99-a721-ffa4ffc5835b")
        public static SmDependency OwnerNodeDep() {
            if (OwnerNodeDep == null) {
            	OwnerNodeDep = classof().getDependencyDef("OwnerNode");
            }
            return OwnerNodeDep;
        }

        @objid ("8538ee90-caa6-4384-934e-c74fdc2516d5")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("6699cf43-50ff-4063-814e-379e2cb46081")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("df0c45bc-0179-4890-936c-c48cd2645747")
        public static SmDependency getOwnerNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerNodeDep;
        }

        @objid ("254e636e-672e-4fac-8240-c8d51ad104b4")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("affe7d48-f465-4a07-986a-ccca5bc78beb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("be2d0cc9-c623-4bf5-97b4-c4d6f39fe878")
        public static SmDependency getOwnerClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerClauseDep;
        }

        @objid ("c03cf062-ddb1-4a10-b8ec-a5acadf1d4f0")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("852a23bc-b130-47c4-a37f-0fa84d04c79a")
        public static SmDependency getOwnerPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerPartitionDep;
        }

        @objid ("0000922c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("17a33544-34a5-4040-9089-041df0db0d3b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("4f4a37b7-e4f5-4819-b102-769329d3de09")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00010108-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("a74edbe7-38d3-48d0-aded-d43756255d5a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mIncoming != null)? ((ActivityNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("6e6aacb9-d9de-432b-b859-f72e9a316ac2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mIncoming;
            }

            @objid ("3aef6b2d-daf5-4840-8a98-2ef5ab91961e")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.TargetDep();
            }

        }

        @objid ("0001732c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("fbb0c6f8-53a9-4adc-9bbf-d17f62f5eed1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mOutgoing != null)? ((ActivityNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("252e1949-508f-4126-9adc-4d738ffade0d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mOutgoing;
            }

            @objid ("a5c95d11-c342-44f6-bd83-951f5ae21e07")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.SourceDep();
            }

        }

        @objid ("0001ec12-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("82bb6012-f65a-4aea-b0ce-13fa29dde114")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwner;
            }

            @objid ("fc1ac3a3-da77-4faf-938e-8d6465f01e5d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwner = value;
            }

            @objid ("1bc967b7-991a-4c99-b765-51e3a782a206")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedNodeDep();
            }

        }

        @objid ("000263b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerNodeSmDependency extends SmSingleDependency {
            @objid ("83875e38-2a51-49f0-bf87-aa8354b9a3fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerNode;
            }

            @objid ("3e033150-1a27-43ae-9012-5f2cf8007e6d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerNode = value;
            }

            @objid ("f709abed-9b5d-4e37-9324-28703ae07926")
            @Override
            public SmDependency getSymetric() {
                return StructuredActivityNodeData.Metadata.BodyDep();
            }

        }

        @objid ("0002dce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerClauseSmDependency extends SmSingleDependency {
            @objid ("22ea82bb-77e2-40b8-b5af-7857eff1a5d3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerClause;
            }

            @objid ("5909f129-b4dd-47eb-aa31-0ea6c0d5c65f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerClause = value;
            }

            @objid ("feb0a393-6ad4-489a-a2e2-b70b67230d48")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.BodyDep();
            }

        }

        @objid ("000354da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerPartitionSmDependency extends SmSingleDependency {
            @objid ("8a56f076-478e-41c7-bb3d-95c8273d1e0a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerPartition;
            }

            @objid ("ff00eb20-eaf7-4ecf-af41-91edf157d2ad")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerPartition = value;
            }

            @objid ("2338d018-a8e5-4d62-8dae-f3a316dfc45b")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.ContainedNodeDep();
            }

        }

    }

}
