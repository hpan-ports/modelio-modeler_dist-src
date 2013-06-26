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
    @objid ("9feb7fd4-c0e8-415e-b4d7-7c238ada15f1")
    @SmaMetaAttribute(metaName="Ordering", type=AdHocOrdering.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = AdHocOrdering.PARALLELORDERING;

    @objid ("3cbc7557-a2c8-407f-b58d-2788698ff338")
    @SmaMetaAttribute(metaName="CancelRemainingInstances", type=Boolean.class, smAttributeClass=Metadata.CancelRemainingInstancesSmAttribute.class)
     Object mCancelRemainingInstances = true;

    @objid ("72cdd372-b07a-4749-8b44-425a8e04db88")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("4ec47f3e-8e0b-4dc7-b468-82b6a2e0efb2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000dc9a6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4b1c427d-e4da-447e-a76d-423b075a1e02")
        private static SmClass smClass = null;

        @objid ("939cefd6-b39f-47cb-8484-3d2202421cce")
        private static SmAttribute OrderingAtt = null;

        @objid ("e6399e0c-9a75-4e67-9926-944364c17fd8")
        private static SmAttribute CancelRemainingInstancesAtt = null;

        @objid ("b0574759-bafe-4b5c-b1d2-45990d3a4f5d")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("6a5b4976-73b3-458c-b7a9-e436fd707759")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnAdHocSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("93061a32-b7a1-4a56-9666-290c5c34bc4a")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("3d54b5f7-bba4-4461-9511-077aa8ddab88")
        public static SmAttribute CancelRemainingInstancesAtt() {
            if (CancelRemainingInstancesAtt == null) {
            	CancelRemainingInstancesAtt = classof().getAttributeDef("CancelRemainingInstances");
            }
            return CancelRemainingInstancesAtt;
        }

        @objid ("204ec7a0-f720-4fff-8ffa-20ceebcfb548")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("ce4bdddd-94be-4e70-9077-283beccbf583")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("bd540b2d-ef63-4f4f-8e2f-6c3fd2eee02c")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("1f210f5a-9151-43a2-94d5-fb693ffffebb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1919c721-9976-462f-9525-a8c1dfe32083")
        public static SmAttribute getCancelRemainingInstancesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CancelRemainingInstancesAtt;
        }

        @objid ("000e0b1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("437da079-eb73-44cd-a3a4-57d494397f19")
            public ISmObjectData createData() {
                return new BpmnAdHocSubProcessData();
            }

            @objid ("0a7e8d09-f121-40f2-8215-b283af3fbf6b")
            public SmObjectImpl createImpl() {
                return new BpmnAdHocSubProcessImpl();
            }

        }

        @objid ("000e6c76-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("45caacfe-c986-4259-81df-02ffb9c5b6e9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mOrdering;
            }

            @objid ("517b7935-de77-4431-bf5c-2c0f6644dfbb")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mOrdering = value;
            }

        }

        @objid ("000ece6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CancelRemainingInstancesSmAttribute extends SmAttribute {
            @objid ("8b0b4971-dbac-45c9-ac9c-75b65ed80050")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances;
            }

            @objid ("f0d64182-bd51-4e9f-bcb7-7698c8d92022")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances = value;
            }

        }

        @objid ("000f3020-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("2c8c9e8e-4781-4624-939f-cebd1dde9373")
            public Object getValue(ISmObjectData data) {
                return ((BpmnAdHocSubProcessData) data).mCompletionCondition;
            }

            @objid ("2305e0d5-7b7b-4ebf-b411-2aa4c667ce3a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnAdHocSubProcessData) data).mCompletionCondition = value;
            }

        }

    }

}
