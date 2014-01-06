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
    @objid ("6bf52b75-03fc-4835-a1c7-c3b758c2347e")
    @SmaMetaAssociation(metaName="Connected", typeDataClass=BpmnSequenceFlowData.class, min=1, max=1, smAssociationClass=Metadata.ConnectedSmDependency.class, partof = true)
     SmObjectImpl mConnected;

    @objid ("768a5f1e-e18e-4f74-b578-3db10ecefcff")
    @SmaMetaAssociation(metaName="DataAssociation", typeDataClass=BpmnDataAssociationData.class, min=2, max=2, smAssociationClass=Metadata.DataAssociationSmDependency.class, partof = true)
     List<SmObjectImpl> mDataAssociation = null;

    @objid ("d1e5b5c2-4214-4c69-b747-587ff7eab7ae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00478df8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a44e2d4d-30d2-4eb2-8c25-12986d485d7e")
        private static SmClass smClass = null;

        @objid ("51730fb9-5609-4437-91a5-39aee2796716")
        private static SmDependency ConnectedDep = null;

        @objid ("c3dfe9ce-6435-449a-8c7a-8008b358147d")
        private static SmDependency DataAssociationDep = null;

        @objid ("03d31820-62a1-4f5c-b855-d7cee0018d1f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("49df9767-54ea-4bfe-a1dc-59a4d8e459aa")
        public static SmDependency ConnectedDep() {
            if (ConnectedDep == null) {
            	ConnectedDep = classof().getDependencyDef("Connected");
            }
            return ConnectedDep;
        }

        @objid ("0428bda0-9d2d-4c2a-9ec0-e4403043bb4f")
        public static SmDependency DataAssociationDep() {
            if (DataAssociationDep == null) {
            	DataAssociationDep = classof().getDependencyDef("DataAssociation");
            }
            return DataAssociationDep;
        }

        @objid ("53897324-3452-4149-97a2-41beecf3314e")
        public static SmDependency getConnectedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectedDep;
        }

        @objid ("9d3a5764-7bfa-46f9-8084-f88739727ec3")
        public static SmDependency getDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataAssociationDep;
        }

        @objid ("bb6cfc5c-3d86-4e61-8fe9-060e8244ef9e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0047ced0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3fe4bfa6-4622-4ebc-9bc5-2a990862b50a")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowDataAssociationData();
            }

            @objid ("72f453d2-72a7-45de-83d4-ee76a767b659")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowDataAssociationImpl();
            }

        }

        @objid ("004830f0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DataAssociationSmDependency extends SmMultipleDependency {
            @objid ("5f8af63f-caa6-45e3-a78b-5a5fe3f95a20")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowDataAssociationData)data).mDataAssociation != null)? ((BpmnSequenceFlowDataAssociationData)data).mDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("4faee220-c7ef-4606-806c-999931a197fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowDataAssociationData) data).mDataAssociation;
            }

            @objid ("446d9fdd-1fb8-484e-ad48-1362813d6776")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.VisualShortCutDep();
            }

        }

        @objid ("00489356-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConnectedSmDependency extends SmSingleDependency {
            @objid ("911841e4-a43d-484b-a3e4-b76d21665bb8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowDataAssociationData) data).mConnected;
            }

            @objid ("2b7c3ff4-2675-4273-837f-2dfa292665db")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowDataAssociationData) data).mConnected = value;
            }

            @objid ("1bb222f8-6dcf-47be-a462-d2384b9337f2")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.ConnectorDep();
            }

        }

    }

}
