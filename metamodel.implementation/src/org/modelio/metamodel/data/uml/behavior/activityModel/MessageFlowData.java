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
    @objid ("bdf75b9c-d54f-4084-aed0-10c158b2a196")
    @SmaMetaAssociation(metaName="TargetPartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.TargetPartitionSmDependency.class, partof = true)
     SmObjectImpl mTargetPartition;

    @objid ("25fd7fc3-7fb4-4421-a14f-deb2227e93e3")
    @SmaMetaAssociation(metaName="SourcePartition", typeDataClass=ActivityPartitionData.class, min=0, max=1, smAssociationClass=Metadata.SourcePartitionSmDependency.class)
     SmObjectImpl mSourcePartition;

    @objid ("60b9185c-7682-4da3-811b-a252089aa00f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00678cf2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3833d37a-b20a-47e4-bf0c-36d2fb84cfd9")
        private static SmClass smClass = null;

        @objid ("a3d0a19a-2f62-430f-a25e-85cea83fe077")
        private static SmDependency TargetPartitionDep = null;

        @objid ("6e32507d-fbc8-4c96-a2a3-99967cf9fa43")
        private static SmDependency SourcePartitionDep = null;

        @objid ("69937190-b35c-4c40-a4fa-096defb1168a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f8fd1a5a-f9b5-4a04-875d-4a76cc3f66de")
        public static SmDependency TargetPartitionDep() {
            if (TargetPartitionDep == null) {
            	TargetPartitionDep = classof().getDependencyDef("TargetPartition");
            }
            return TargetPartitionDep;
        }

        @objid ("a0b3ef7f-5975-491a-ac46-c45f12beaabd")
        public static SmDependency SourcePartitionDep() {
            if (SourcePartitionDep == null) {
            	SourcePartitionDep = classof().getDependencyDef("SourcePartition");
            }
            return SourcePartitionDep;
        }

        @objid ("b65856a3-75bd-4955-a3dc-ee411ef220ff")
        public static SmDependency getSourcePartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourcePartitionDep;
        }

        @objid ("e757e958-3faa-4dfc-b4d6-2c98836364d0")
        public static SmDependency getTargetPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetPartitionDep;
        }

        @objid ("9399c99a-952c-429f-bded-9e64503b9784")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0067ce7e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3c7896c4-96b3-45a2-954b-0d2ef6752bf8")
            public ISmObjectData createData() {
                return new MessageFlowData();
            }

            @objid ("55160a4e-8a75-4d5d-ae00-f564549ff0ef")
            public SmObjectImpl createImpl() {
                return new MessageFlowImpl();
            }

        }

        @objid ("006830b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourcePartitionSmDependency extends SmSingleDependency {
            @objid ("55845ea8-7251-4219-bf61-2f76fde89efe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mSourcePartition;
            }

            @objid ("db6483c0-cc9d-4ea9-a1e1-026eaa9c868c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mSourcePartition = value;
            }

            @objid ("c7c5d82f-e044-4471-a6f9-d2d1098d8064")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.OutgoingDep();
            }

        }

        @objid ("0068a51a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetPartitionSmDependency extends SmSingleDependency {
            @objid ("22b2bd26-efac-4e71-b4f0-b7806f2dd8ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageFlowData) data).mTargetPartition;
            }

            @objid ("32735ed9-653b-44e2-a771-24b1031bd554")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageFlowData) data).mTargetPartition = value;
            }

            @objid ("b7f4e63c-b03c-4cef-9295-33ce29fdcce9")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.IncomingDep();
            }

        }

    }

}
