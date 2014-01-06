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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
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

@objid ("0038ffd6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectFlow.class, factory=ObjectFlowData.Metadata.ObjectFactory.class)
public class ObjectFlowData extends ActivityEdgeData {
    @objid ("a69bb9eb-9404-40fc-aefb-a197462129a8")
    @SmaMetaAttribute(metaName="TransformationBehavior", type=String.class, smAttributeClass=Metadata.TransformationBehaviorSmAttribute.class)
     Object mTransformationBehavior = "";

    @objid ("75783269-e822-48fd-9f84-812c65206b8d")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("aaf1c91c-c005-40ea-b959-489f3f556a11")
    @SmaMetaAttribute(metaName="IsMultiCast", type=Boolean.class, smAttributeClass=Metadata.IsMultiCastSmAttribute.class)
     Object mIsMultiCast = false;

    @objid ("624ffb1b-aa1a-48a4-a291-44a769c76941")
    @SmaMetaAttribute(metaName="IsMultiReceive", type=Boolean.class, smAttributeClass=Metadata.IsMultiReceiveSmAttribute.class)
     Object mIsMultiReceive = false;

    @objid ("0515b9b8-440e-402a-a3c6-80ab98895576")
    @SmaMetaAttribute(metaName="Effect", type=ObjectFlowEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ObjectFlowEffectKind.READFLOW;

    @objid ("fc5eca3b-9c2c-4536-9843-ef85f84ebb86")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006907f8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("267c00e6-c722-4e91-b63e-a9a085e29c7c")
        private static SmClass smClass = null;

        @objid ("447f9278-bd06-4ba9-86ea-d57157262a0b")
        private static SmAttribute TransformationBehaviorAtt = null;

        @objid ("ff98070d-d6d9-497b-9fab-afb7c8eb1f8e")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("dbbac348-aaf6-4209-8bce-1967a2653974")
        private static SmAttribute IsMultiCastAtt = null;

        @objid ("49560db2-c58f-4ab0-afde-59f1bdda1f7a")
        private static SmAttribute IsMultiReceiveAtt = null;

        @objid ("a3af27a4-6d8a-4c9b-85d0-1c69e56da04c")
        private static SmAttribute EffectAtt = null;

        @objid ("4af45185-3fb8-4f56-b027-178905587d23")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("011243c8-7eba-4899-a53b-6071d66a835d")
        public static SmAttribute TransformationBehaviorAtt() {
            if (TransformationBehaviorAtt == null) {
            	TransformationBehaviorAtt = classof().getAttributeDef("TransformationBehavior");
            }
            return TransformationBehaviorAtt;
        }

        @objid ("2647e44d-6cea-4d68-b596-d876d5fe7055")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("fabb3161-2a56-492d-a5fc-02e7baec905c")
        public static SmAttribute IsMultiCastAtt() {
            if (IsMultiCastAtt == null) {
            	IsMultiCastAtt = classof().getAttributeDef("IsMultiCast");
            }
            return IsMultiCastAtt;
        }

        @objid ("826b582a-46b4-4de4-afd2-72d66e95c495")
        public static SmAttribute IsMultiReceiveAtt() {
            if (IsMultiReceiveAtt == null) {
            	IsMultiReceiveAtt = classof().getAttributeDef("IsMultiReceive");
            }
            return IsMultiReceiveAtt;
        }

        @objid ("7f35b5d6-048b-46b9-8b5b-6bc6464837fc")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("ea81da03-7ad3-4cca-b278-bbe6e63919a5")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("7498dcf8-7b09-494c-9ede-d345207c0f6d")
        public static SmAttribute getIsMultiCastAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiCastAtt;
        }

        @objid ("2f56a500-46a1-4108-aaec-dfb75cc32508")
        public static SmAttribute getIsMultiReceiveAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsMultiReceiveAtt;
        }

        @objid ("fcf28e2e-7d3c-4ab6-ab9f-8209907626fb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("717e6c0f-8846-45e5-98b0-6df2bf95574e")
        public static SmAttribute getTransformationBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransformationBehaviorAtt;
        }

        @objid ("e3d3340f-f4b8-4995-9581-198ff3eef2a9")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("00695320-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3b2456cd-c56c-4ee8-b4ed-d9dcdc625654")
            public ISmObjectData createData() {
                return new ObjectFlowData();
            }

            @objid ("ccab6b95-2c8f-40a2-927c-6d1580089c87")
            public SmObjectImpl createImpl() {
                return new ObjectFlowImpl();
            }

        }

        @objid ("0069b5d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TransformationBehaviorSmAttribute extends SmAttribute {
            @objid ("cdd43205-afd8-49dc-9bb1-f883011abc79")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mTransformationBehavior;
            }

            @objid ("205b084c-47b9-4368-b1d9-a1b36287bac7")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mTransformationBehavior = value;
            }

        }

        @objid ("006a1670-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("2544a186-45ad-4dd3-a74e-3a84d1074254")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mSelectionBehavior;
            }

            @objid ("22e5c3d5-b64f-44b8-99af-70ddf43a0a53")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mSelectionBehavior = value;
            }

        }

        @objid ("006a7854-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiCastSmAttribute extends SmAttribute {
            @objid ("13fe17a2-813f-4802-a596-df651f35e882")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiCast;
            }

            @objid ("e0dec473-0b21-4d82-a012-3221462e717b")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiCast = value;
            }

        }

        @objid ("006ada56-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsMultiReceiveSmAttribute extends SmAttribute {
            @objid ("3a9d536b-214e-40c1-ba16-f4cd099e0456")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mIsMultiReceive;
            }

            @objid ("791066d6-c6fd-4006-a216-7ec487be182e")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mIsMultiReceive = value;
            }

        }

        @objid ("006b3cf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("2e83e057-be35-4ece-9c5c-a51278684fb2")
            public Object getValue(ISmObjectData data) {
                return ((ObjectFlowData) data).mEffect;
            }

            @objid ("fa284f30-d1cc-4a43-94c2-dcb518581d2f")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectFlowData) data).mEffect = value;
            }

        }

    }

}
