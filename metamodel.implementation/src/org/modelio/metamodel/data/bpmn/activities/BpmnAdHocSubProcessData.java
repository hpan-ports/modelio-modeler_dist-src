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
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnAdHocSubProcessImpl;
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

@objid ("007e3c68-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnAdHocSubProcess.class, factory=BpmnAdHocSubProcessData.Metadata.ObjectFactory.class)
public class BpmnAdHocSubProcessData extends BpmnSubProcessData {
    @objid ("c93448f2-1a56-432f-8f2e-58e06f434936")
    @SmaMetaAttribute(metaName="Ordering", type=AdHocOrdering.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = AdHocOrdering.PARALLELORDERING;

    @objid ("0930f799-a3d0-4068-ad6e-49dbb8a16728")
    @SmaMetaAttribute(metaName="CancelRemainingInstances", type=Boolean.class, smAttributeClass=Metadata.CancelRemainingInstancesSmAttribute.class)
     Object mCancelRemainingInstances = true;

    @objid ("f2d2724c-7664-465e-bb68-5c9b9554c87e")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("58bc331d-d824-4764-8e40-731e95f2b517")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000dc9a6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("87e61a1c-7959-47d4-a80e-a91e7cef49fe")
        private static SmClass smClass = null;

        @objid ("81642268-3ba5-4202-9356-6b7a44e72be5")
        private static SmAttribute OrderingAtt = null;

        @objid ("6a0a175d-4251-4456-97b5-ac90709911e0")
        private static SmAttribute CancelRemainingInstancesAtt = null;

        @objid ("41b646f6-4f9c-4495-bcb3-00e06281632b")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("7abc591b-4ac2-44fb-8319-93a107b41c35")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAdHocSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("01fbd19b-c279-4dc6-acd5-2f61b0ee0898")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("6647e49a-7eb7-4592-b8d4-2bbc077c19ba")
        public static SmAttribute CancelRemainingInstancesAtt() {
            if (CancelRemainingInstancesAtt == null) {
            	CancelRemainingInstancesAtt = classof().getAttributeDef("CancelRemainingInstances");
            }
            return CancelRemainingInstancesAtt;
        }

        @objid ("5306da69-324a-42e0-b9e1-e75c35c3a3ef")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("8ced6b2a-1380-4582-93b1-33a5a6aef63c")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("05a0b4e9-dc8d-483d-91b3-9dbb30822359")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("51e0ef07-c302-4c4d-8f46-7822ce49d764")
        public static SmAttribute getCancelRemainingInstancesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelRemainingInstancesAtt;
        }

        @objid ("6dc19806-76f7-48ad-93be-68347138356e")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("000e0b1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1397970d-0ea3-42d1-8a24-95134278a705")
            public ISmObjectData createData() {
                return new BpmnAdHocSubProcessData();
            }

            @objid ("e2b801d4-aeb6-4cf1-8dba-ed250afc376a")
            public SmObjectImpl createImpl() {
                return new BpmnAdHocSubProcessImpl();
            }

        }

        @objid ("000e6c76-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("0988d775-9e14-4c4d-8119-2e098d2f0c1f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mOrdering;
            }

            @objid ("d122b0f7-08e0-4576-8abb-e2816bccb34b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mOrdering = value;
            }

        }

        @objid ("000ece6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CancelRemainingInstancesSmAttribute extends SmAttribute {
            @objid ("ff30068a-9d57-4a2b-9e5b-1cc843a75569")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances;
            }

            @objid ("f35af6aa-b982-4b4d-a724-13abbe16c24b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances = value;
            }

        }

        @objid ("000f3020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("fdcb0da4-f57f-4a1e-a9f4-b9b9266f32b1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCompletionCondition;
            }

            @objid ("589e9e90-bd77-4051-8cb8-81b33a9a3da8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCompletionCondition = value;
            }

        }

    }

}
