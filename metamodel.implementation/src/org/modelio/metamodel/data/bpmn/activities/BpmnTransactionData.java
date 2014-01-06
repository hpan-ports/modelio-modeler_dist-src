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
    @objid ("968fbda5-a8fc-4e2a-a608-976dceb7ee46")
    @SmaMetaAttribute(metaName="Protocol", type=String.class, smAttributeClass=Metadata.ProtocolSmAttribute.class)
     Object mProtocol = "";

    @objid ("0142f627-2b4b-43a8-bc11-98467a1a91b4")
    @SmaMetaAttribute(metaName="Method", type=TransactionMethod.class, smAttributeClass=Metadata.MethodSmAttribute.class)
     Object mMethod = TransactionMethod.COMPENSATETRANSACTION;

    @objid ("f9eacff6-1bcf-4d68-a898-773dc5bd6e33")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003853ce-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1a024ac8-9288-458a-bb16-c3a755b2aacc")
        private static SmClass smClass = null;

        @objid ("c15aaa3d-6c30-4d7e-8728-1d6c8d884423")
        private static SmAttribute ProtocolAtt = null;

        @objid ("afeb92e1-3174-48da-ac3d-ae35f8064893")
        private static SmAttribute MethodAtt = null;

        @objid ("71f77db5-6c7c-48da-b49e-2a305a73f7af")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTransactionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6c08f951-0800-46b7-ac21-5a021880ca13")
        public static SmAttribute ProtocolAtt() {
            if (ProtocolAtt == null) {
            	ProtocolAtt = classof().getAttributeDef("Protocol");
            }
            return ProtocolAtt;
        }

        @objid ("c8c311a6-8d85-4eda-b7da-41b218865e50")
        public static SmAttribute MethodAtt() {
            if (MethodAtt == null) {
            	MethodAtt = classof().getAttributeDef("Method");
            }
            return MethodAtt;
        }

        @objid ("05c1b595-7145-4d12-ac11-0991a68d7941")
        public static SmAttribute getProtocolAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProtocolAtt;
        }

        @objid ("5e348e90-7b55-46ba-9d95-7dd72c7728af")
        public static SmAttribute getMethodAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MethodAtt;
        }

        @objid ("52778542-0008-4fb2-8441-13600a03b288")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003893b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("02dfcead-7835-4f17-b6f2-f8f3246d823e")
            public ISmObjectData createData() {
                return new BpmnTransactionData();
            }

            @objid ("53775ce3-d595-47f5-9d36-26873c03ecb0")
            public SmObjectImpl createImpl() {
                return new BpmnTransactionImpl();
            }

        }

        @objid ("0038f450-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProtocolSmAttribute extends SmAttribute {
            @objid ("53790543-c237-4bf6-99fe-0e0a24991c51")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mProtocol;
            }

            @objid ("a7e6d57f-b0ef-40a2-8d5d-d8dc3e92bb22")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mProtocol = value;
            }

        }

        @objid ("003953dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MethodSmAttribute extends SmAttribute {
            @objid ("07f7c8a9-cbd2-415a-9426-24b5f42c81ed")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTransactionData) data).mMethod;
            }

            @objid ("1a4fde26-f2c1-4717-a19b-4046ae0bdece")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTransactionData) data).mMethod = value;
            }

        }

    }

}
