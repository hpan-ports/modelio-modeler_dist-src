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
    @objid ("a83fb775-67a0-434b-8ce6-950812509537")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("8b6de92f-08a6-4b51-b11e-3e1a1096db65")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ea626-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fb1dd671-5ad0-4d9d-9b14-b931a81dda92")
        private static SmClass smClass = null;

        @objid ("f0f3991d-9c3c-41b8-8efb-828e727b9a8a")
        private static SmDependency DefaultFlowDep = null;

        @objid ("c66741d1-22f1-45ab-a8cf-66a8f38956f0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("00223dc5-f015-4b45-ac34-0a39fec5ecca")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("61fd7427-15af-430f-8f94-8ab45bb1fb34")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8122001e-f5f9-4957-84e1-bdc65a737a2a")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("007ef2f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f8942419-23bf-46fe-b4f8-2d917cb7dccb")
            public ISmObjectData createData() {
                return new BpmnInclusiveGatewayData();
            }

            @objid ("08dcd89d-b575-4ad3-b720-16f829d05189")
            public SmObjectImpl createImpl() {
                return new BpmnInclusiveGatewayImpl();
            }

        }

        @objid ("007f57e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("037e1db8-a425-4f92-8e6a-9dffb4cccf5e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("00b5a8b4-b5b3-4ae8-ae96-cc527763f27d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("cc592551-04c2-4d19-bc05-8e7a1e4c64c5")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep();
            }

        }

    }

}
