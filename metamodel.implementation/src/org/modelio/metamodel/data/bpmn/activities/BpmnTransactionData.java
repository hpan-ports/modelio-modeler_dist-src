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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTransactionImpl;
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

@objid ("0085d32e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTransaction.class, factory=BpmnTransactionData.Metadata.ObjectFactory.class)
public class BpmnTransactionData extends BpmnSubProcessData {
    @objid ("a1fdea15-9862-41c0-878e-e34ecf978c32")
    @SmaMetaAttribute(metaName="Protocol", type=String.class, smAttributeClass=Metadata.ProtocolSmAttribute.class)
     Object mProtocol = "";

    @objid ("467551f5-339d-4afd-aa31-3db4de2da189")
    @SmaMetaAttribute(metaName="Method", type=TransactionMethod.class, smAttributeClass=Metadata.MethodSmAttribute.class)
     Object mMethod = TransactionMethod.COMPENSATETRANSACTION;

    @objid ("61cce2df-4cc7-449d-8457-913407899706")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003853ce-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c2e779b6-6aa8-4f41-b331-cc6f36c84135")
        private static SmClass smClass = null;

        @objid ("6104c4d5-21d3-4ee4-ad2a-74c1b0e931f4")
        private static SmAttribute ProtocolAtt = null;

        @objid ("2cafa575-b1c1-40ed-aeae-66f5107fac1c")
        private static SmAttribute MethodAtt = null;

        @objid ("06f9e09a-0ecc-4d45-a4ec-91d30047d292")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTransactionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1a688f58-a37c-4d13-8a8b-01897b88dad3")
        public static SmAttribute ProtocolAtt() {
            if (ProtocolAtt == null) {
            	ProtocolAtt = classof().getAttributeDef("Protocol");
            }
            return ProtocolAtt;
        }

        @objid ("5be0a62a-1a25-42e1-a03d-59f00d8073c5")
        public static SmAttribute MethodAtt() {
            if (MethodAtt == null) {
            	MethodAtt = classof().getAttributeDef("Method");
            }
            return MethodAtt;
        }

        @objid ("95aadafb-8a7f-40d9-9dff-14d3c90aec84")
        public static SmAttribute getMethodAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MethodAtt;
        }

        @objid ("7d7956e5-7f42-4c1d-9ab1-9768a3e74634")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e97b9b75-7624-495f-830d-c48552ec4962")
        public static SmAttribute getProtocolAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtocolAtt;
        }

        @objid ("003893b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d03b85b1-748c-4e24-b90a-5f46cbf9ae38")
            public ISmObjectData createData() {
                return new BpmnTransactionData();
            }

            @objid ("b6cc3078-382a-4b30-8109-943535ddab1e")
            public SmObjectImpl createImpl() {
                return new BpmnTransactionImpl();
            }

        }

        @objid ("0038f450-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProtocolSmAttribute extends SmAttribute {
            @objid ("c1924ae8-5fd8-4487-bbfb-b1fda3a9d6da")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mProtocol;
            }

            @objid ("c6603a8c-835c-417e-b744-195930620170")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mProtocol = value;
            }

        }

        @objid ("003953dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MethodSmAttribute extends SmAttribute {
            @objid ("252affa2-3939-4123-b2d3-66d2f37ba6d8")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mMethod;
            }

            @objid ("b77cd14d-fa57-4ca4-be50-660e1940ff0c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mMethod = value;
            }

        }

    }

}
