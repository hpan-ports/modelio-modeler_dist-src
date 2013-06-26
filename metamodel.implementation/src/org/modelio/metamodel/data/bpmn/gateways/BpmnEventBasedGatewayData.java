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
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnEventBasedGatewayImpl;
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

@objid ("00985c10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEventBasedGateway.class, factory=BpmnEventBasedGatewayData.Metadata.ObjectFactory.class)
public class BpmnEventBasedGatewayData extends BpmnGatewayData {
    @objid ("66397228-1cd9-45c2-9820-f4f6e2b9535d")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("2a0d1e94-f623-40ec-a143-ade3e48b5595")
    @SmaMetaAttribute(metaName="EventGatewayType", type=BpmnEventBasedGatewayType.class, smAttributeClass=Metadata.EventGatewayTypeSmAttribute.class)
     Object mEventGatewayType = BpmnEventBasedGatewayType.EXCLUSIVEGATEWAY;

    @objid ("bcaee160-9c74-4162-9efe-180be461cf0f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00099124-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("457aca69-58af-45f8-ad72-be5cfa526e45")
        private static SmClass smClass = null;

        @objid ("29f40d09-04d9-47d4-878b-928773660bd9")
        private static SmAttribute InstanciateAtt = null;

        @objid ("dd201fad-6852-4687-8492-495fbc92dfc9")
        private static SmAttribute EventGatewayTypeAtt = null;

        @objid ("b8ca40b2-f7db-4a64-ac21-cf5b70b1e4c1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventBasedGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f18c6b89-088c-4861-992c-dabd9665f279")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("3f7ace29-96af-4fdc-a5fc-c0f694a2e63d")
        public static SmAttribute EventGatewayTypeAtt() {
            if (EventGatewayTypeAtt == null) {
            	EventGatewayTypeAtt = classof().getAttributeDef("EventGatewayType");
            }
            return EventGatewayTypeAtt;
        }

        @objid ("39663cec-524c-4325-b256-2bfac4637a35")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("10bc578e-6650-4fcf-b488-ac02bc05d416")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("26b724dc-9bf6-4c25-925b-b4e12523e2e6")
        public static SmAttribute getEventGatewayTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventGatewayTypeAtt;
        }

        @objid ("0009e34a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("34fcdaf5-c6d2-4c7e-a848-5370ab0f4141")
            public ISmObjectData createData() {
                return new BpmnEventBasedGatewayData();
            }

            @objid ("e6aaca70-1d3c-49e8-b84d-2da0a3f546fc")
            public SmObjectImpl createImpl() {
                return new BpmnEventBasedGatewayImpl();
            }

        }

        @objid ("000a5870-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("a1f1cb88-404d-420e-a0a0-7262a058ebb6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mInstanciate;
            }

            @objid ("89913fad-e596-4ab9-a7a5-a988d6113cd9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mInstanciate = value;
            }

        }

        @objid ("000acbc0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventGatewayTypeSmAttribute extends SmAttribute {
            @objid ("c6e19327-1c76-4aa3-9e86-8d4359282e6c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mEventGatewayType;
            }

            @objid ("628253c4-3eba-4e35-b6a9-d90c398940d2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mEventGatewayType = value;
            }

        }

    }

}
