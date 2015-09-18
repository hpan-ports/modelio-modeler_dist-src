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
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnInclusiveGatewayImpl;
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

@objid ("00020c38-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnInclusiveGateway.class, factory=BpmnInclusiveGatewayData.Metadata.ObjectFactory.class)
public class BpmnInclusiveGatewayData extends BpmnGatewayData {
    @objid ("1c900dd8-b51e-47d6-9d59-dfb354b83a16")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("1c41037e-45f8-469d-bd65-fbc0e183ecb0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ea626-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("490b1537-a5ea-4063-8e40-c7c61877bc1c")
        private static SmClass smClass = null;

        @objid ("49c0dc2e-eadf-4c57-9366-6292548012b9")
        private static SmDependency DefaultFlowDep = null;

        @objid ("862abc10-76ec-452b-8860-92f47f448296")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cebd5d10-6fac-49f7-b713-be353b00c7a2")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("aafa5a34-653f-4f42-8027-42e765fe462e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b8dbfaa8-8ca7-40e3-8f39-b0e2295ee5f4")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("007ef2f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c61ea3fb-a0ea-4e01-a781-8fe455deca4d")
            public ISmObjectData createData() {
                return new BpmnInclusiveGatewayData();
            }

            @objid ("07b126be-67f1-42fc-b0dc-7b44c9dcab1a")
            public SmObjectImpl createImpl() {
                return new BpmnInclusiveGatewayImpl();
            }

        }

        @objid ("007f57e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("8258c641-a873-4931-8fb7-bd2fbfc12320")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("9d90a193-ae74-4736-ac41-b3a2d414fb75")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("dfb7b542-e3dd-4037-9560-3353d4361d44")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep();
            }

        }

    }

}
