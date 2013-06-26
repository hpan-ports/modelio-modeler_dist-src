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
    @objid ("be35b3f9-be9d-45f3-919c-a0ede3f5e5b0")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("134832c8-7643-4779-98a5-d2962246ed14")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005831b2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("989066e7-ecff-4d7f-af24-c65dc55efe3f")
        private static SmClass smClass = null;

        @objid ("c8511daf-28b1-499f-baf6-254f5e271758")
        private static SmDependency DefaultFlowDep = null;

        @objid ("4c39f800-dd7f-45d0-9f6f-3efb685522d1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnExclusiveGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dce2c9bf-6dc6-4648-b52b-fb8a18a169ac")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("ae5c7efc-036c-4b33-be51-a5ff2d8b6fa9")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("e8d6226b-fc8f-485d-a40b-c7561927d0ae")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00587e92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("17e0b855-9e6c-4725-b7ee-334d838d145e")
            public ISmObjectData createData() {
                return new BpmnExclusiveGatewayData();
            }

            @objid ("120e44fb-884f-455a-88b4-ef2104f61fbd")
            public SmObjectImpl createImpl() {
                return new BpmnExclusiveGatewayImpl();
            }

        }

        @objid ("0058e29c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("cdefaa71-a26a-4f16-a288-4f0b38714609")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnExclusiveGatewayData) data).mDefaultFlow;
            }

            @objid ("6bd0bfc0-8b6c-47fc-9831-0f58ce47ca0f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnExclusiveGatewayData) data).mDefaultFlow = value;
            }

            @objid ("9123dee8-e273-42f5-a8a5-953bccde6adf")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultOfExclusiveDep();
            }

        }

    }

}
