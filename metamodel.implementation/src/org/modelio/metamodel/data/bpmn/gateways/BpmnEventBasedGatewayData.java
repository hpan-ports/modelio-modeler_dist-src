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
    @objid ("627a61ca-ad7b-4ee1-8b68-0a7bd720c491")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("23653eeb-bae4-4cab-bb3e-a89c87d19a1b")
    @SmaMetaAttribute(metaName="EventGatewayType", type=BpmnEventBasedGatewayType.class, smAttributeClass=Metadata.EventGatewayTypeSmAttribute.class)
     Object mEventGatewayType = BpmnEventBasedGatewayType.EXCLUSIVEGATEWAY;

    @objid ("b2d6307a-6a00-480e-a037-b4b22226aab0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00099124-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("da577ad3-d86d-4a6a-bfa6-d6c9ae44f089")
        private static SmClass smClass = null;

        @objid ("4a81304e-9a72-4b01-8a2f-8db2830a4064")
        private static SmAttribute InstanciateAtt = null;

        @objid ("e8322fb2-a6a9-414b-a9c5-6e6b1986ad05")
        private static SmAttribute EventGatewayTypeAtt = null;

        @objid ("2ddf4c52-4bc1-4b90-80cc-b5801eeb2422")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventBasedGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a3643047-e5ee-4040-9911-caa6ddd3dd22")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("a44eca5f-c16a-487a-bfe0-b06633c4c516")
        public static SmAttribute EventGatewayTypeAtt() {
            if (EventGatewayTypeAtt == null) {
            	EventGatewayTypeAtt = classof().getAttributeDef("EventGatewayType");
            }
            return EventGatewayTypeAtt;
        }

        @objid ("eb1d6def-0085-4fe0-a13e-ff41bf853793")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fd35946a-bab1-4b3d-88a1-7e534b231651")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("8fdef5ad-407c-4e0f-a912-31ad09de7c52")
        public static SmAttribute getEventGatewayTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventGatewayTypeAtt;
        }

        @objid ("0009e34a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d7d9b354-a11b-4cf0-b6da-540d2d0908af")
            public ISmObjectData createData() {
                return new BpmnEventBasedGatewayData();
            }

            @objid ("7d561606-be2f-4717-b316-d2c18d553059")
            public SmObjectImpl createImpl() {
                return new BpmnEventBasedGatewayImpl();
            }

        }

        @objid ("000a5870-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("622d19a2-0eda-45f8-bbe5-82154532c860")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mInstanciate;
            }

            @objid ("51826e02-88bd-4634-a96b-69a1774e25f8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mInstanciate = value;
            }

        }

        @objid ("000acbc0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventGatewayTypeSmAttribute extends SmAttribute {
            @objid ("737d26ff-95d2-4cb2-9acb-de5384f150e4")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEventBasedGatewayData) data).mEventGatewayType;
            }

            @objid ("f507c4a4-d733-4dff-a1b2-707fa4b40f34")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEventBasedGatewayData) data).mEventGatewayType = value;
            }

        }

    }

}
