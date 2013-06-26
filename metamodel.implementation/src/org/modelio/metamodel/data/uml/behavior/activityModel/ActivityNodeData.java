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
    @objid ("12623c56-d44d-449a-95cc-add90958ee7a")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("aa67c965-7eeb-4336-b0a0-d986677604b9")
    @SmaMetaAssociation(metaName="OwnerPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerPartitionSmDependency.class)
     SmObjectImpl mOwnerPartition;

    @objid ("35455123-7100-40e9-8e5c-0518e54fc7df")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("f99cc220-a2c9-4279-a635-d19992ffb92d")
    @SmaMetaAssociation(metaName="OwnerClause", typeDataClass=ClauseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerClauseSmDependency.class)
     SmObjectImpl mOwnerClause;

    @objid ("22a0291b-8787-4ee0-82f6-42475cb1b484")
    @SmaMetaAssociation(metaName="OwnerNode", typeDataClass=StructuredActivityNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerNodeSmDependency.class)
     SmObjectImpl mOwnerNode;

    @objid ("6cc8ceb7-e87f-4b9d-9fde-893e31fada9e")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, component = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("90f8e174-9e45-4cb1-8184-9efeff158210")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000044ca-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("80f366e3-0ae1-4827-bc9f-dc07450ca42d")
        private static SmClass smClass = null;

        @objid ("5b5817b8-6b0e-4989-aa35-7369f2a4cdcc")
        private static SmDependency OwnerDep = null;

        @objid ("698ef549-19d9-4fd2-b48a-d608659c710e")
        private static SmDependency OwnerPartitionDep = null;

        @objid ("b1e5f6e8-5406-4376-b707-72b310d2b69f")
        private static SmDependency IncomingDep = null;

        @objid ("88c8bf32-f50e-4fa6-89bb-60a7ee429da9")
        private static SmDependency OwnerClauseDep = null;

        @objid ("cc4eb014-a56a-4459-9f68-7e76b070ea34")
        private static SmDependency OwnerNodeDep = null;

        @objid ("f190bbd9-0254-43e1-b07e-78852dc7435d")
        private static SmDependency OutgoingDep = null;

        @objid ("a6a4678f-6888-4fbd-9fef-95d8fd2292c2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f4dc9ad3-d634-4c7b-8b10-b4e9e6552d6d")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c1250012-c0c9-4bc8-ba35-fcc574884f5e")
        public static SmDependency OwnerPartitionDep() {
            if (OwnerPartitionDep == null) {
            	OwnerPartitionDep = classof().getDependencyDef("OwnerPartition");
            }
            return OwnerPartitionDep;
        }

        @objid ("8fb701d9-060c-46c0-93fc-92e8a35e5afc")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("b8bbee89-e1e4-4be8-a074-bbd9df49463f")
        public static SmDependency OwnerClauseDep() {
            if (OwnerClauseDep == null) {
            	OwnerClauseDep = classof().getDependencyDef("OwnerClause");
            }
            return OwnerClauseDep;
        }

        @objid ("476ce30c-a546-4ecc-a333-09dbe164f4d7")
        public static SmDependency OwnerNodeDep() {
            if (OwnerNodeDep == null) {
            	OwnerNodeDep = classof().getDependencyDef("OwnerNode");
            }
            return OwnerNodeDep;
        }

        @objid ("c44c4df9-8cb8-4e08-a9ca-cd8ad73bb7a0")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("42e5f930-a0fa-45c4-b9a6-666b84ea2aed")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("25410d1e-b4d6-465e-85e0-17175b72812c")
        public static SmDependency getOwnerPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerPartitionDep;
        }

        @objid ("067eb972-2350-46e9-a64a-a9914dd4a8c1")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("92d2a91c-24b9-430e-b152-4a3d49da92d7")
        public static SmDependency getOwnerClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerClauseDep;
        }

        @objid ("f6c1a84d-8612-4a1e-9f52-512d54c5b52d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56759980-4350-4ed8-a899-60d9a4216278")
        public static SmDependency getOwnerNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerNodeDep;
        }

        @objid ("9b1579cf-c0b9-498e-b007-5f623049a416")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("0000922c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5507e2b8-d06b-4b48-be7e-698b3c3eed35")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("2c9768b4-48b0-414b-97c4-319156dd7b7a")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00010108-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("243e4cec-6a33-44f9-8da2-b97a427d5612")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mIncoming != null)? ((ActivityNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("df6afc57-fe6f-4d5b-acf0-3c26c65096ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mIncoming;
            }

            @objid ("b927a0fd-4bc6-43ce-8f66-be06b6b49d7b")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.TargetDep();
            }

        }

        @objid ("0001732c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("2997f0eb-2af9-47ed-bcbc-f2d801477d01")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ActivityNodeData)data).mOutgoing != null)? ((ActivityNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("55a28433-38b6-4451-a1c6-d5e43c7c4320")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ActivityNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((ActivityNodeData) data).mOutgoing;
            }

            @objid ("7e380b26-9b94-4275-b110-892cd2916c93")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.SourceDep();
            }

        }

        @objid ("0001ec12-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3387f837-f47f-4376-8651-008d5e8b69f7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwner;
            }

            @objid ("2bf30d09-551a-45da-aba8-9aab8325d22a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwner = value;
            }

            @objid ("8209e5fc-c4ee-4870-9ff9-c876d99d3f80")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedNodeDep();
            }

        }

        @objid ("000263b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerNodeSmDependency extends SmSingleDependency {
            @objid ("9e7cefad-7a89-4f33-87c8-dadcd1fc7eeb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerNode;
            }

            @objid ("56238bc0-c8f6-4bb0-8405-2fe0d0b506d7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerNode = value;
            }

            @objid ("375658c3-bc05-44ac-b062-3d4a104ddf35")
            @Override
            public SmDependency getSymetric() {
                return StructuredActivityNodeData.Metadata.BodyDep();
            }

        }

        @objid ("0002dce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerClauseSmDependency extends SmSingleDependency {
            @objid ("e9b139b8-a320-4e73-995e-9e804b8cf8fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerClause;
            }

            @objid ("49d5d0cd-21fb-4b37-a64b-68528e3f44f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerClause = value;
            }

            @objid ("494fbd10-521a-4777-860d-db82acf15791")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.BodyDep();
            }

        }

        @objid ("000354da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerPartitionSmDependency extends SmSingleDependency {
            @objid ("bfaaa51f-025f-4d37-ac14-4545abd328aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityNodeData) data).mOwnerPartition;
            }

            @objid ("9a9fdd5b-9022-4bce-abcb-4e8af25c59f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityNodeData) data).mOwnerPartition = value;
            }

            @objid ("772e8bf7-9c5c-4ab9-a2b2-954d15113b3c")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.ContainedNodeDep();
            }

        }

    }

}
