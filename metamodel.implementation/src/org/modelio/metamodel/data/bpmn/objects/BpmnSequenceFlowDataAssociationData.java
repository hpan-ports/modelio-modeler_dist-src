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
    @objid ("b22a04bd-35bf-4432-bbc5-06f275d7a575")
    @SmaMetaAssociation(metaName="Connected", typeDataClass=BpmnSequenceFlowData.class, min=1, max=1, smAssociationClass=Metadata.ConnectedSmDependency.class, partof = true)
     SmObjectImpl mConnected;

    @objid ("57904f7c-b023-4ff0-8a96-6784722ab344")
    @SmaMetaAssociation(metaName="DataAssociation", typeDataClass=BpmnDataAssociationData.class, min=2, max=2, smAssociationClass=Metadata.DataAssociationSmDependency.class, partof = true)
     List<SmObjectImpl> mDataAssociation = null;

    @objid ("33b11c9f-5e15-481f-b83e-dcf1da491e03")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00478df8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6dc8c365-d834-4da9-9af5-e3dfbea2f00b")
        private static SmClass smClass = null;

        @objid ("39e5a70d-3be0-4b1a-8d1e-35c479881f51")
        private static SmDependency ConnectedDep = null;

        @objid ("bc9699b5-c582-45c9-84f2-783a6f158638")
        private static SmDependency DataAssociationDep = null;

        @objid ("d0e50637-2d4b-4516-a1af-df45c8786139")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("71377514-ca72-456f-b228-38ec3a8159fc")
        public static SmDependency ConnectedDep() {
            if (ConnectedDep == null) {
            	ConnectedDep = classof().getDependencyDef("Connected");
            }
            return ConnectedDep;
        }

        @objid ("92efd621-9a3a-490a-a3ba-04d548aa9959")
        public static SmDependency DataAssociationDep() {
            if (DataAssociationDep == null) {
            	DataAssociationDep = classof().getDependencyDef("DataAssociation");
            }
            return DataAssociationDep;
        }

        @objid ("007114dc-d5e8-4142-991e-db8afeebf396")
        public static SmDependency getConnectedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectedDep;
        }

        @objid ("e59c0aac-403c-4596-9dba-251117cdda1e")
        public static SmDependency getDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataAssociationDep;
        }

        @objid ("c3433e16-02bf-46d0-be00-714c61b574c2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0047ced0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cd88a485-f48b-4c5d-98f2-883c0bab2cf8")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowDataAssociationData();
            }

            @objid ("ff83268f-788c-49e1-aa88-0cf996cf869a")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowDataAssociationImpl();
            }

        }

        @objid ("004830f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DataAssociationSmDependency extends SmMultipleDependency {
            @objid ("9f7bf9ae-73f4-492f-8232-9aa4d6e89b52")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowDataAssociationData)data).mDataAssociation != null)? ((BpmnSequenceFlowDataAssociationData)data).mDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("6f647828-104d-43f8-b80f-d1f38a24b691")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation;
            }

            @objid ("5fd943f0-e2bb-44d3-890f-8875a0d5de2b")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.VisualShortCutDep();
            }

        }

        @objid ("00489356-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectedSmDependency extends SmSingleDependency {
            @objid ("97159c25-b6aa-471f-8255-3495d6af9884")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowDataAssociationData) data).mConnected;
            }

            @objid ("6fc1bc1f-ead4-4710-9fd1-14d22076a106")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowDataAssociationData) data).mConnected = value;
            }

            @objid ("e97b236e-662d-4624-80da-271b1c4e8d97")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.ConnectorDep();
            }

        }

    }

}
