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
    @objid ("1000580a-cd6f-4cfc-bc7d-7969c20329ab")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("fcabdb06-5fc3-4054-a44c-5f0c18dc7b60")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005831b2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0eda0145-fd85-4241-bee3-8ded00258cce")
        private static SmClass smClass = null;

        @objid ("3fe8ffab-ed82-4b46-bfe3-22e2ccc57008")
        private static SmDependency DefaultFlowDep = null;

        @objid ("7912ccfa-727e-4b8b-9f11-3fa2e6145c29")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnExclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c0a2087-b736-416d-91bf-6357e946e0a8")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("f75b6380-c7af-4fc3-9ff2-07d65ed57bd8")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("6b1d97be-50f3-40a1-bcb5-a7a3ab65bcb1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00587e92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("210f8b92-19ff-4fe8-ba26-05d1b82e1f26")
            public ISmObjectData createData() {
                return new BpmnExclusiveGatewayData();
            }

            @objid ("7dccda44-3095-41bc-9e42-faad32917e38")
            public SmObjectImpl createImpl() {
                return new BpmnExclusiveGatewayImpl();
            }

        }

        @objid ("0058e29c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("a28aee2a-233a-4a16-a515-06a4d4a8c7d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnExclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("ebfdbdef-93ff-4d42-be16-9083d4fa5914")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnExclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("c53164b8-b69a-4a1a-b76a-d73cc356aee4")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep();
            }

        }

    }

}
