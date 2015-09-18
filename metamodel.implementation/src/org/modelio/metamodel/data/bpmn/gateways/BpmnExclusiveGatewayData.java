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
package org.modelio.metamodel.data.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnExclusiveGatewayImpl;
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

@objid ("000085b6-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnExclusiveGateway.class, factory=BpmnExclusiveGatewayData.Metadata.ObjectFactory.class)
public class BpmnExclusiveGatewayData extends BpmnGatewayData {
    @objid ("5f9da4b2-fdb4-420a-9c8d-1355ea81aa02")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("aafafeeb-78df-4108-81b6-7b77ac57b40a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005831b2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2e1f0bc9-cda1-4eb7-b118-6cc66f6d7af4")
        private static SmClass smClass = null;

        @objid ("35e8002d-3fe3-4fc5-ae35-07bb67b0eff9")
        private static SmDependency DefaultFlowDep = null;

        @objid ("e7685ccd-a93e-4590-a4cb-97c75bcf5ddd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnExclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2406fda2-bcf9-47c1-b483-ab5c0a28c6b6")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("bf93b16f-3259-46ce-9de7-cf9284582207")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("0127e987-bd4d-44e3-9ea5-8c1f74440116")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00587e92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3effd9a6-4c23-41e2-bc1f-7061e643fc51")
            public ISmObjectData createData() {
                return new BpmnExclusiveGatewayData();
            }

            @objid ("81471647-5235-4a43-956b-75fc9a30d127")
            public SmObjectImpl createImpl() {
                return new BpmnExclusiveGatewayImpl();
            }

        }

        @objid ("0058e29c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("b28d2fdc-91c0-4cf2-a7dc-e02153e9ed7e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnExclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("9fb92b21-9245-4d12-ba7b-4ed868865476")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnExclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("aba76a4f-08d2-49d3-8268-ac93d180a9a1")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep();
            }

        }

    }

}
