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
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGatewayDirection;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewayImpl;
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

@objid ("00015806-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnGateway.class, factory=BpmnGatewayData.Metadata.ObjectFactory.class)
public abstract class BpmnGatewayData extends BpmnFlowNodeData {
    @objid ("1f8b401c-1dca-4581-971d-ed5ddce59501")
    @SmaMetaAttribute(metaName="GatewayDirection", type=BpmnGatewayDirection.class, smAttributeClass=Metadata.GatewayDirectionSmAttribute.class)
     Object mGatewayDirection = BpmnGatewayDirection.UNSPECIFIEDDIRECTION;

    @objid ("c4ad0bd9-af58-452a-ac4c-865a58ed2811")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b7680-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f026b720-a9e0-469f-b0cb-15888fb1ce7d")
        private static SmClass smClass = null;

        @objid ("246e4b5c-85ac-490b-af92-81f55dbbea0c")
        private static SmAttribute GatewayDirectionAtt = null;

        @objid ("d6b47ef3-0fab-4fee-84f0-2d87fa4d393d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d525393c-25e9-4d54-8acc-3bc2f73049cd")
        public static SmAttribute GatewayDirectionAtt() {
            if (GatewayDirectionAtt == null) {
            	GatewayDirectionAtt = classof().getAttributeDef("GatewayDirection");
            }
            return GatewayDirectionAtt;
        }

        @objid ("4efc4f81-13e1-4605-af40-fbbb8d4d7113")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("61b0c423-4f27-4a7e-b2c0-0d7f7923525c")
        public static SmAttribute getGatewayDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GatewayDirectionAtt;
        }

        @objid ("008bb7b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("033e0388-b6c5-46b1-a5ab-3dae99f69d30")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f9ee7e2d-96d1-4e65-85fc-5923e19ad055")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c1a5e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GatewayDirectionSmAttribute extends SmAttribute {
            @objid ("561b8e23-f79c-403f-85d3-c88784a1f3ad")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGatewayData) data).mGatewayDirection;
            }

            @objid ("0c9ea72a-d99e-44dc-a243-10f331ed17f1")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGatewayData) data).mGatewayDirection = value;
            }

        }

    }

}
