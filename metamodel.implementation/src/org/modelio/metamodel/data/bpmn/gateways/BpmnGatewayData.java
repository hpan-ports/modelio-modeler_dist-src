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
    @objid ("74b760c8-e36b-44d7-ad81-9755e0f56176")
    @SmaMetaAttribute(metaName="GatewayDirection", type=BpmnGatewayDirection.class, smAttributeClass=Metadata.GatewayDirectionSmAttribute.class)
     Object mGatewayDirection = BpmnGatewayDirection.UNSPECIFIEDDIRECTION;

    @objid ("7f7009a3-9fac-4075-bd4c-7ce0ddad9480")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008b7680-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cf4303f4-2532-437d-aa92-92cdbb61a6cf")
        private static SmClass smClass = null;

        @objid ("7d32cb9a-cfca-4000-a931-6f671b1b80b2")
        private static SmAttribute GatewayDirectionAtt = null;

        @objid ("746afc70-bd79-4b07-8e11-1869bd053443")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnGatewayData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("24569754-0b71-490c-bca9-3008f9b4ab52")
        public static SmAttribute GatewayDirectionAtt() {
            if (GatewayDirectionAtt == null) {
            	GatewayDirectionAtt = classof().getAttributeDef("GatewayDirection");
            }
            return GatewayDirectionAtt;
        }

        @objid ("f11c8d89-34be-485d-901c-f546bbe7a374")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("943b2ec7-97c3-4722-9cb1-e16f600c7c59")
        public static SmAttribute getGatewayDirectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GatewayDirectionAtt;
        }

        @objid ("008bb7b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6142e5ed-79f5-417c-9861-3f2ab8b0d8c3")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("71341bca-a3d0-441b-a75c-bd6dcce188d9")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("008c1a5e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GatewayDirectionSmAttribute extends SmAttribute {
            @objid ("d338a48e-a559-4978-87f9-fdddc3d8e321")
            public Object getValue(ISmObjectData data) {
                return ((BpmnGatewayData) data).mGatewayDirection;
            }

            @objid ("c0eab40a-3f63-478f-89f7-f60aecdf90b5")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnGatewayData) data).mGatewayDirection = value;
            }

        }

    }

}
