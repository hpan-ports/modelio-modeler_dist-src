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
    @objid ("6d08b3c9-9428-4f53-92bf-cb61d6098799")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("27ab4380-d88e-4dce-b7ad-00c5413847c9")
    @SmaMetaAttribute(metaName="EventGatewayType", type=BpmnEventBasedGatewayType.class, smAttributeClass=Metadata.EventGatewayTypeSmAttribute.class)
     Object mEventGatewayType = BpmnEventBasedGatewayType.EXCLUSIVEGATEWAY;

    @objid ("a106bec3-f5c1-41e6-ae80-b051f9700943")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00099124-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fcf35616-068e-4162-b500-de18a546b7ea")
        private static SmClass smClass = null;

        @objid ("5c7bedf8-b72c-495c-bbd8-19af9084d847")
        private static SmAttribute InstanciateAtt = null;

        @objid ("ddb0ee7d-3e27-44e9-9216-b00c1c816e2f")
        private static SmAttribute EventGatewayTypeAtt = null;

        @objid ("741bd6f9-3983-4d3e-91e7-fab42e31b44a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventBasedGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("913ec13e-75b6-492c-b704-ec91b80d37e7")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("e71bdfc3-98ef-43ef-91f2-e5da79a69b88")
        public static SmAttribute EventGatewayTypeAtt() {
            if (EventGatewayTypeAtt == null) {
            	EventGatewayTypeAtt = classof().getAttributeDef("EventGatewayType");
            }
            return EventGatewayTypeAtt;
        }

        @objid ("1e75ec14-944a-46eb-ae3b-a14c3dc57416")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("36469430-5636-4832-8af5-04035a014297")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("dcc0af96-a41f-440e-bea9-ec7762622d6e")
        public static SmAttribute getEventGatewayTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventGatewayTypeAtt;
        }

        @objid ("0009e34a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2664fe95-dceb-4922-930e-05e6c000df8a")
            public ISmObjectData createData() {
                return new BpmnEventBasedGatewayData();
            }

            @objid ("0540ef34-d27a-46f0-b41e-85efe95d71b2")
            public SmObjectImpl createImpl() {
                return new BpmnEventBasedGatewayImpl();
            }

        }

        @objid ("000a5870-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("09887945-ca3a-4f00-8fe2-d4978ae15ba0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mInstanciate;
            }

            @objid ("65f02200-5a98-41e9-adbe-2ed793a26343")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mInstanciate = value;
            }

        }

        @objid ("000acbc0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventGatewayTypeSmAttribute extends SmAttribute {
            @objid ("a9e636b0-d550-4de3-b354-b86c8ee49caf")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mEventGatewayType;
            }

            @objid ("7adc7b2f-5b05-4112-848a-511ae9d90534")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mEventGatewayType = value;
            }

        }

    }

}
