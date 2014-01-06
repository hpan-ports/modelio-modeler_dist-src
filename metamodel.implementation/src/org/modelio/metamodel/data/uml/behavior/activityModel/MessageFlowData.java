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
    @objid ("7098b2be-ab37-4f00-955c-99538f755182")
    @SmaMetaAssociation(metaName="TargetPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.TargetPartitionSmDependency.class, partof = true)
     SmObjectImpl mTargetPartition;

    @objid ("159b0df4-cc28-4f56-9038-5078b92f7880")
    @SmaMetaAssociation(metaName="SourcePartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SourcePartitionSmDependency.class)
     SmObjectImpl mSourcePartition;

    @objid ("c63cbaed-d0d6-4ca1-bdd7-6e5bead973c0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00678cf2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b41de03c-d2d9-42b4-af33-125e48538a21")
        private static SmClass smClass = null;

        @objid ("8250eb87-2622-4de9-bce9-63ff62d22b43")
        private static SmDependency TargetPartitionDep = null;

        @objid ("d3de8de2-6d46-4805-8ece-053a009bf422")
        private static SmDependency SourcePartitionDep = null;

        @objid ("df2fd972-2aac-4d7c-bb9f-52b89ac34b80")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3e2ba94b-38f7-4194-8c42-2dd0a688646e")
        public static SmDependency TargetPartitionDep() {
            if (TargetPartitionDep == null) {
            	TargetPartitionDep = classof().getDependencyDef("TargetPartition");
            }
            return TargetPartitionDep;
        }

        @objid ("d109bbbe-725b-4b4b-9451-cf52eb0d2ca7")
        public static SmDependency SourcePartitionDep() {
            if (SourcePartitionDep == null) {
            	SourcePartitionDep = classof().getDependencyDef("SourcePartition");
            }
            return SourcePartitionDep;
        }

        @objid ("65264570-b38b-4d07-93f8-e1edf2ace1c7")
        public static SmDependency getTargetPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetPartitionDep;
        }

        @objid ("6fc90fff-6a31-45b5-8fc6-b1f946265701")
        public static SmDependency getSourcePartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourcePartitionDep;
        }

        @objid ("ac87ab00-9119-4e79-b592-1943d733f8bc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0067ce7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2f25f219-1262-464d-89b8-72fd43015bf7")
            public ISmObjectData createData() {
                return new MessageFlowData();
            }

            @objid ("b84ddb0e-4e87-4560-988a-22e891f98f6b")
            public SmObjectImpl createImpl() {
                return new MessageFlowImpl();
            }

        }

        @objid ("006830b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourcePartitionSmDependency extends SmSingleDependency {
            @objid ("cbb0853d-764e-4cb6-aa07-f3f64891394d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mSourcePartition;
            }

            @objid ("b2f077e0-aec0-41bc-b7f1-7af4959d280c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mSourcePartition = value;
            }

            @objid ("a49ffe50-fc60-4fbc-ae4e-09fed0eb071a")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.OutgoingDep();
            }

        }

        @objid ("0068a51a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetPartitionSmDependency extends SmSingleDependency {
            @objid ("235d3e25-d9d3-4843-b1b0-c950773abbda")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mTargetPartition;
            }

            @objid ("b6fa4bc2-8bb1-46bb-87b4-dea8e39f6ca1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mTargetPartition = value;
            }

            @objid ("079227de-2376-4dea-be33-2e0a51362f34")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.IncomingDep();
            }

        }

    }

}
