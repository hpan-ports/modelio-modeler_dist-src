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
    @objid ("86b02276-d0f9-455f-a06c-54b8df984ba9")
    @SmaMetaAttribute(metaName="Ordering", type=AdHocOrdering.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = AdHocOrdering.PARALLELORDERING;

    @objid ("67ae1d08-0bf6-422e-9045-0c3508047ec1")
    @SmaMetaAttribute(metaName="CancelRemainingInstances", type=Boolean.class, smAttributeClass=Metadata.CancelRemainingInstancesSmAttribute.class)
     Object mCancelRemainingInstances = true;

    @objid ("36eb4760-4523-42e4-8424-e76b4fd0c4c6")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("119f18d4-77bf-4774-a354-7185b1238831")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000dc9a6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("10619460-9741-4088-a106-c15e078b7696")
        private static SmClass smClass = null;

        @objid ("010606c5-b815-4315-b4ac-135f9469410a")
        private static SmAttribute OrderingAtt = null;

        @objid ("1dc75374-48a3-446a-8244-39178da1a66d")
        private static SmAttribute CancelRemainingInstancesAtt = null;

        @objid ("cede59e8-fed7-42b4-9a48-9121b602c340")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("b6e58366-902c-4a72-879e-ff754144f067")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAdHocSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bd2cc013-bf73-451b-b076-9fbcee6d9b8b")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("8758b1c1-4035-41d0-8ebf-0f1c40c61927")
        public static SmAttribute CancelRemainingInstancesAtt() {
            if (CancelRemainingInstancesAtt == null) {
            	CancelRemainingInstancesAtt = classof().getAttributeDef("CancelRemainingInstances");
            }
            return CancelRemainingInstancesAtt;
        }

        @objid ("f36c90c9-fd78-45f3-bc3c-f11213d719d3")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("31926ec4-6cd0-44b0-9254-bf8498e4a06a")
        public static SmAttribute getCancelRemainingInstancesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelRemainingInstancesAtt;
        }

        @objid ("d0065c07-caec-4ab1-83e4-b75c544c69eb")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("32e98edd-51bb-4283-b902-f510a97498d4")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("9acef20b-c9f9-4696-810b-757092e3bf9d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000e0b1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bb318880-a706-4f8e-83aa-8b422a809ae8")
            public ISmObjectData createData() {
                return new BpmnAdHocSubProcessData();
            }

            @objid ("26df1e80-9f88-4ec6-b243-eb5654f44c81")
            public SmObjectImpl createImpl() {
                return new BpmnAdHocSubProcessImpl();
            }

        }

        @objid ("000e6c76-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("9c267f14-bed5-4e32-9e19-cee652d2932c")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mOrdering;
            }

            @objid ("72555446-6642-4463-8689-88636e4f294f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mOrdering = value;
            }

        }

        @objid ("000ece6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CancelRemainingInstancesSmAttribute extends SmAttribute {
            @objid ("c1909c64-073a-4094-a408-9ad630fb7da6")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances;
            }

            @objid ("1f187e3e-acd1-4943-88b0-1ac359585083")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances = value;
            }

        }

        @objid ("000f3020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("9b03d688-df3f-429c-ab2b-d9525943a2f3")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCompletionCondition;
            }

            @objid ("4c3d9b83-b178-42e3-9f3a-6bf9546720b4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCompletionCondition = value;
            }

        }

    }

}
