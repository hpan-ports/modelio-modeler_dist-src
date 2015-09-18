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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.MessageFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
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

@objid ("00384dac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MessageFlow.class, factory=MessageFlowData.Metadata.ObjectFactory.class)
public class MessageFlowData extends ActivityEdgeData {
    @objid ("53e73a98-f578-4f5e-b513-ee5aeea95231")
    @SmaMetaAssociation(metaName="TargetPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.TargetPartitionSmDependency.class, partof = true)
     SmObjectImpl mTargetPartition;

    @objid ("310728ae-612f-4c6a-9f48-8346ebe487d5")
    @SmaMetaAssociation(metaName="SourcePartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SourcePartitionSmDependency.class)
     SmObjectImpl mSourcePartition;

    @objid ("dfb5aa0c-a3e7-4594-9754-8b1ed03b9fda")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00678cf2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("db8ff474-97f5-414e-8347-710f2e31ed78")
        private static SmClass smClass = null;

        @objid ("c3cfc58d-c28b-4055-aeae-86338ff655d7")
        private static SmDependency TargetPartitionDep = null;

        @objid ("30bdcce9-28a2-4684-b682-7895aac92a47")
        private static SmDependency SourcePartitionDep = null;

        @objid ("652a6612-b329-4e42-a573-2ea122790419")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("941909ab-abfe-4990-b26e-13d06b47b94d")
        public static SmDependency TargetPartitionDep() {
            if (TargetPartitionDep == null) {
            	TargetPartitionDep = classof().getDependencyDef("TargetPartition");
            }
            return TargetPartitionDep;
        }

        @objid ("dac080e4-6795-49a3-8b37-abfd86ef2b14")
        public static SmDependency SourcePartitionDep() {
            if (SourcePartitionDep == null) {
            	SourcePartitionDep = classof().getDependencyDef("SourcePartition");
            }
            return SourcePartitionDep;
        }

        @objid ("36ff698d-5fa5-4463-a744-8fccaa0f78cb")
        public static SmDependency getSourcePartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourcePartitionDep;
        }

        @objid ("8710f9c7-ccef-4597-ba19-79a7058c9b87")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ea48a900-4c5c-4083-a1a5-5f5cea18c1e0")
        public static SmDependency getTargetPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetPartitionDep;
        }

        @objid ("0067ce7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("418c4636-3e94-401a-a237-43dd5269c1bf")
            public ISmObjectData createData() {
                return new MessageFlowData();
            }

            @objid ("8979436a-b5cd-4242-b306-571dceb35817")
            public SmObjectImpl createImpl() {
                return new MessageFlowImpl();
            }

        }

        @objid ("006830b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourcePartitionSmDependency extends SmSingleDependency {
            @objid ("fbfabeb6-20e8-4644-a3bb-b6ec3394c478")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mSourcePartition;
            }

            @objid ("1d04a4fd-dc0d-4fe0-b8f7-68787f2fa2b0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mSourcePartition = value;
            }

            @objid ("c1ab351b-7eb4-4e27-90d7-c7aba6b6fff8")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.OutgoingDep();
            }

        }

        @objid ("0068a51a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetPartitionSmDependency extends SmSingleDependency {
            @objid ("10a4fb19-c8c8-4e13-86db-b842082af972")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mTargetPartition;
            }

            @objid ("bee0aaba-71fd-4388-8c90-6ee2c8c2271d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mTargetPartition = value;
            }

            @objid ("3ba6c688-ac7c-45ab-9029-860b35dd9085")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.IncomingDep();
            }

        }

    }

}
