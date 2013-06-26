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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnSequenceFlowDataAssociationImpl;
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

@objid ("00057d32-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSequenceFlowDataAssociation.class, factory=BpmnSequenceFlowDataAssociationData.Metadata.ObjectFactory.class)
public class BpmnSequenceFlowDataAssociationData extends BpmnBaseElementData {
    @objid ("ba57527f-66fc-4ad2-a15a-9ce032811ae6")
    @SmaMetaAssociation(metaName="Connected", typeDataClass=BpmnSequenceFlowData.class, min=1, max=1, smAssociationClass=Metadata.ConnectedSmDependency.class, partof = true)
     SmObjectImpl mConnected;

    @objid ("5ce589b6-1625-4d53-b0d1-cb331a3a1905")
    @SmaMetaAssociation(metaName="DataAssociation", typeDataClass=BpmnDataAssociationData.class, min=2, max=2, smAssociationClass=Metadata.DataAssociationSmDependency.class, partof = true)
     List<SmObjectImpl> mDataAssociation = null;

    @objid ("4aff5ecb-ad45-4882-8d19-4c23bd204a8a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00478df8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d9eb56db-f36b-40ed-87e2-a899165130c7")
        private static SmClass smClass = null;

        @objid ("0c641bb5-9da7-4b1c-8c93-ba0320ba747d")
        private static SmDependency ConnectedDep = null;

        @objid ("e1a26566-5f26-4169-861d-6e7753c3cff2")
        private static SmDependency DataAssociationDep = null;

        @objid ("c6001f39-9514-4f9d-829f-a2685656d90a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6e3a66ba-0d65-4222-a512-3ee5a64c9b0d")
        public static SmDependency ConnectedDep() {
            if (ConnectedDep == null) {
            	ConnectedDep = classof().getDependencyDef("Connected");
            }
            return ConnectedDep;
        }

        @objid ("0d7e0901-6c10-4410-87f1-4964985b5fb9")
        public static SmDependency DataAssociationDep() {
            if (DataAssociationDep == null) {
            	DataAssociationDep = classof().getDependencyDef("DataAssociation");
            }
            return DataAssociationDep;
        }

        @objid ("f822371e-8024-4d29-8451-65209d5fbd8f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fc8b51ae-25d8-4d86-8388-17bb4a16317d")
        public static SmDependency getConnectedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectedDep;
        }

        @objid ("386aa7e8-d530-4d06-bf6c-83c5f8f2eaa0")
        public static SmDependency getDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataAssociationDep;
        }

        @objid ("0047ced0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a2f73da0-1dae-4dab-b201-e998b2432682")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowDataAssociationData();
            }

            @objid ("047a5ab2-4cab-4e39-809e-1f64f927847c")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowDataAssociationImpl();
            }

        }

        @objid ("004830f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DataAssociationSmDependency extends SmMultipleDependency {
            @objid ("c26283d9-59c0-4a40-a145-7ef1717ce564")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowDataAssociationData)data).mDataAssociation != null)? ((BpmnSequenceFlowDataAssociationData)data).mDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("d36a88c7-6ab8-495f-a4c6-e458390495f9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation;
            }

            @objid ("dfd3c5bf-4536-4a05-bbe0-95ceb68c5cfd")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.VisualShortCutDep();
            }

        }

        @objid ("00489356-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectedSmDependency extends SmSingleDependency {
            @objid ("0f996442-236d-4391-b087-f52e403d56fa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowDataAssociationData) data).mConnected;
            }

            @objid ("ba5e9079-e71f-45c9-9c58-b034aaf056a6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowDataAssociationData) data).mConnected = value;
            }

            @objid ("a77a5e69-fd51-4ec9-84bb-cf3cb766fba4")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.ConnectorDep();
            }

        }

    }

}
