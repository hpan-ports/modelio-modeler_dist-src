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
    @objid ("0ee3d006-3320-40ef-a2f2-f61f4b7f7f21")
    @SmaMetaAttribute(metaName="GatewayDirection", type=BpmnGatewayDirection.class, smAttributeClass=Metadata.GatewayDirectionSmAttribute.class)
     Object mGatewayDirection = BpmnGatewayDirection.UNSPECIFIEDDIRECTION;

    @objid ("c9a8ed46-8949-4005-be41-5bbd44ded5e0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b7680-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b88b78c3-48de-4573-a7c7-289f317ed5f4")
        private static SmClass smClass = null;

        @objid ("1c0028b1-ddec-4811-9a61-2aef170d91bb")
        private static SmAttribute GatewayDirectionAtt = null;

        @objid ("443812ed-e33f-4352-9e6d-d3de1852804b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fff78c9e-66d7-4374-8f1c-fd3df9407bda")
        public static SmAttribute GatewayDirectionAtt() {
            if (GatewayDirectionAtt == null) {
            	GatewayDirectionAtt = classof().getAttributeDef("GatewayDirection");
            }
            return GatewayDirectionAtt;
        }

        @objid ("4223c747-9aa2-48df-8a61-d2fb4ffc3087")
        public static SmAttribute getGatewayDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GatewayDirectionAtt;
        }

        @objid ("bad07319-0eae-4b71-adc0-e9d99fc18c67")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008bb7b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aa78b0ae-0415-4db6-b099-ee3627b7addf")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("ea102674-c8f0-45ed-8f7b-7b3dcf4ca68f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c1a5e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GatewayDirectionSmAttribute extends SmAttribute {
            @objid ("b07508f5-ea2d-4511-b485-ebc400e92a65")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGatewayData) data).mGatewayDirection;
            }

            @objid ("a880a6f2-6c6e-403e-9ff4-29216844da3d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGatewayData) data).mGatewayDirection = value;
            }

        }

    }

}
