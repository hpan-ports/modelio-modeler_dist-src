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
    @objid ("c26be1c7-25d5-46b8-8675-4b9794afd7ea")
    @SmaMetaAttribute(metaName="Protocol", type=String.class, smAttributeClass=Metadata.ProtocolSmAttribute.class)
     Object mProtocol = "";

    @objid ("195f8ded-7f59-4a44-9412-e9c222b71f2d")
    @SmaMetaAttribute(metaName="Method", type=TransactionMethod.class, smAttributeClass=Metadata.MethodSmAttribute.class)
     Object mMethod = TransactionMethod.COMPENSATETRANSACTION;

    @objid ("a57076d8-be40-4095-aeab-e6032df64f87")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003853ce-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5a7d0236-2f80-44ab-8e9e-7cfa4474a618")
        private static SmClass smClass = null;

        @objid ("74209d00-510d-46d8-ba99-ff2317cf661d")
        private static SmAttribute ProtocolAtt = null;

        @objid ("1d61ad4b-2df5-4207-b634-01ffdd7ca072")
        private static SmAttribute MethodAtt = null;

        @objid ("c4d4e4d2-dad2-4ddd-81c4-27063b2afabf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTransactionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("33fee8bc-e860-42f3-ac39-9835de660448")
        public static SmAttribute ProtocolAtt() {
            if (ProtocolAtt == null) {
            	ProtocolAtt = classof().getAttributeDef("Protocol");
            }
            return ProtocolAtt;
        }

        @objid ("898a63b4-a730-4b72-9fbd-e5580f8d208b")
        public static SmAttribute MethodAtt() {
            if (MethodAtt == null) {
            	MethodAtt = classof().getAttributeDef("Method");
            }
            return MethodAtt;
        }

        @objid ("7549b101-0a86-4f92-bd70-588422ac4572")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dd2abdb3-8230-4e24-84f6-18c51baa022b")
        public static SmAttribute getProtocolAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtocolAtt;
        }

        @objid ("f05f1e9a-d47d-49bd-8c39-2b315143b226")
        public static SmAttribute getMethodAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MethodAtt;
        }

        @objid ("003893b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d67c0560-46d0-4b2a-923a-981a28fafc5d")
            public ISmObjectData createData() {
                return new BpmnTransactionData();
            }

            @objid ("3484577d-86ee-462f-9e71-3ca4e964435c")
            public SmObjectImpl createImpl() {
                return new BpmnTransactionImpl();
            }

        }

        @objid ("0038f450-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProtocolSmAttribute extends SmAttribute {
            @objid ("171b903f-dd18-4147-9b78-37917fe58824")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mProtocol;
            }

            @objid ("68748d77-964e-4d77-b6a9-8d6b5fd543f9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mProtocol = value;
            }

        }

        @objid ("003953dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MethodSmAttribute extends SmAttribute {
            @objid ("d4d9528f-4dc8-4a42-b85a-85a0d20852c1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mMethod;
            }

            @objid ("67ae0540-9189-43bc-bcad-4202272f71b6")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mMethod = value;
            }

        }

    }

}
