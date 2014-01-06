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
    @objid ("706f73f5-687b-4c71-aec7-56901dcfdfab")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("ade25552-8a78-4e9b-9653-1b2bdc900718")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007ea626-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("daadacc9-311c-4dbf-8d9c-133c47ae8783")
        private static SmClass smClass = null;

        @objid ("955ee7b8-f2b5-4496-a5f1-48d0701870d9")
        private static SmDependency DefaultFlowDep = null;

        @objid ("05b0ee2a-298b-454e-a993-1793d5a13766")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnInclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("357fdcaf-3c85-4b4b-878f-446aa2dcd426")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("df652e95-7fec-4aa2-99ce-3271137cb265")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("32081308-6192-47e5-9d26-3c91f60a5665")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007ef2f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d08819f3-21c7-45cb-a0cd-c61a4cd88c78")
            public ISmObjectData createData() {
                return new BpmnInclusiveGatewayData();
            }

            @objid ("88bfbd13-c4dc-4755-98ba-75a71edb4671")
            public SmObjectImpl createImpl() {
                return new BpmnInclusiveGatewayImpl();
            }

        }

        @objid ("007f57e2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("60e0387e-1378-4294-a727-c0ab926a932a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnInclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("15a36be6-de54-480c-a70a-b38771f79610")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnInclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("c0f8eea0-023f-41e0-9d9e-6f088c998c3c")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfInclusiveDep();
            }

        }

    }

}
