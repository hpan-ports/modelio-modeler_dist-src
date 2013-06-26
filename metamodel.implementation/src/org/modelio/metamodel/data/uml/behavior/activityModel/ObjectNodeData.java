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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
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

@objid ("0039b58e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ObjectNode.class, factory=ObjectNodeData.Metadata.ObjectFactory.class)
public abstract class ObjectNodeData extends ActivityNodeData {
    @objid ("2a94aaa5-d9f1-4f7d-971f-41bbecd91edc")
    @SmaMetaAttribute(metaName="IsControlType", type=Boolean.class, smAttributeClass=Metadata.IsControlTypeSmAttribute.class)
     Object mIsControlType = false;

    @objid ("76a25345-8003-4cf9-baaa-e09855f07097")
    @SmaMetaAttribute(metaName="Ordering", type=ObjectNodeOrderingKind.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = ObjectNodeOrderingKind.FIFO;

    @objid ("972a0033-cdb7-44be-babe-b1af0e4459bc")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("36c807c1-0562-4861-a5a8-1e2abd03a0c7")
    @SmaMetaAttribute(metaName="UpperBound", type=String.class, smAttributeClass=Metadata.UpperBoundSmAttribute.class)
     Object mUpperBound = "1";

    @objid ("177b8ab8-069a-4185-9e07-13dd6666d2fb")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("61284642-fbff-4b8c-a099-81e3a6a491b3")
    @SmaMetaAssociation(metaName="RepresentedRealParameter", typeDataClass=BehaviorParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRealParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRealParameter;

    @objid ("aafd4add-8059-4347-9ab5-f1e307e2edd4")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("91a8d25a-3b0e-4740-9269-e35622635881")
    @SmaMetaAssociation(metaName="RepresentedRole", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRoleSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRole;

    @objid ("151d616b-aebc-43e8-ac31-1f499b2e1636")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("ebe1b887-860d-41de-bd6f-05d376ee990c")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("f0ed8112-a609-478f-bf16-4aea3265dd8c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00932934-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("09d12687-b8fc-468d-8f83-92d5ac74e025")
        private static SmClass smClass = null;

        @objid ("092cb205-4519-4872-a2f6-17fa24d52d1f")
        private static SmAttribute IsControlTypeAtt = null;

        @objid ("68a47cf9-757f-46df-bbf5-3c14b198004e")
        private static SmAttribute OrderingAtt = null;

        @objid ("a292fc8c-abb8-4082-9ea0-d56b17cfacf3")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("7cac5978-33d0-4328-b3d3-0421e72b1251")
        private static SmAttribute UpperBoundAtt = null;

        @objid ("208a60bc-155b-41cb-acce-f715e4b47931")
        private static SmDependency RepresentedDep = null;

        @objid ("b64a597c-22d6-46ef-9e7f-001db3d5af87")
        private static SmDependency RepresentedRealParameterDep = null;

        @objid ("edc0a237-d250-4ecf-9b98-cf07350241cd")
        private static SmDependency TypeDep = null;

        @objid ("314502e3-9010-4254-8e90-282b4307f834")
        private static SmDependency RepresentedRoleDep = null;

        @objid ("cfedd47f-45ad-4ab2-89c0-c176ad42d3b8")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("0800e27d-d312-497f-8afc-c1615e7a368d")
        private static SmDependency InStateDep = null;

        @objid ("cb0b8d25-ee0e-4d79-8a67-7c87639902e4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e52c9f7a-0cfb-4c78-a57d-d099d79938d6")
        public static SmAttribute IsControlTypeAtt() {
            if (IsControlTypeAtt == null) {
            	IsControlTypeAtt = classof().getAttributeDef("IsControlType");
            }
            return IsControlTypeAtt;
        }

        @objid ("809d9ff2-325f-40b3-a011-45ca4e6dd760")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("c5c7768e-dd69-4d14-8859-ead3d22bd7a8")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("e7071ffa-ffe6-43b3-859f-5d419fd506fa")
        public static SmAttribute UpperBoundAtt() {
            if (UpperBoundAtt == null) {
            	UpperBoundAtt = classof().getAttributeDef("UpperBound");
            }
            return UpperBoundAtt;
        }

        @objid ("c527cdc2-c809-430d-8aba-8ff9c7ff5416")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("9341da7b-d3b4-402b-804d-d27ca2d18121")
        public static SmDependency RepresentedRealParameterDep() {
            if (RepresentedRealParameterDep == null) {
            	RepresentedRealParameterDep = classof().getDependencyDef("RepresentedRealParameter");
            }
            return RepresentedRealParameterDep;
        }

        @objid ("39bda992-77b2-4db2-996c-b28c146249bc")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("206a0119-0c40-4ca6-9db2-e1ade54f19d2")
        public static SmDependency RepresentedRoleDep() {
            if (RepresentedRoleDep == null) {
            	RepresentedRoleDep = classof().getDependencyDef("RepresentedRole");
            }
            return RepresentedRoleDep;
        }

        @objid ("87380517-33f2-4e6f-8d6e-b009ed468029")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("9d3812f0-a004-4504-aedd-48441e17004d")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("6567bae4-ffa5-4737-b926-589a72a9606f")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("5d9814b7-15ec-4563-b698-56ab4eac1d7c")
        public static SmAttribute getIsControlTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlTypeAtt;
        }

        @objid ("17d40a6f-150c-4575-af87-c6c88dbafcb6")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("38822dfa-b7bf-47e1-a92a-d1014a36151f")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("e3438b43-77ed-4903-9538-6b69fc627952")
        public static SmDependency getRepresentedRealParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRealParameterDep;
        }

        @objid ("df7340bb-aac3-46a6-ba53-d50b74a44098")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5d686118-5fe7-42dc-9d68-72e2f17ba504")
        public static SmAttribute getUpperBoundAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UpperBoundAtt;
        }

        @objid ("c25abbfc-46a2-4242-84f3-ddf356b0d347")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("75cdfd45-4ab7-4e78-b286-e147508b5478")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("d2384056-3c10-4495-9729-c7214e588cab")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("d41c2103-cf33-4c4b-aa17-a0b7ba411190")
        public static SmDependency getRepresentedRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRoleDep;
        }

        @objid ("00936b06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8c6ffd5c-b183-4de7-9465-a7f4c4d8e70f")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("35b82b60-3101-45cb-9033-889f007c8379")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0093d00a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsControlTypeSmAttribute extends SmAttribute {
            @objid ("76731f64-d5e1-4039-84a1-769a58c96716")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mIsControlType;
            }

            @objid ("5ffba549-2591-4621-a6c7-8c6ce59c8217")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mIsControlType = value;
            }

        }

        @objid ("009432b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("2b39f8f5-5727-4242-8b1a-3ff700917c0a")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mOrdering;
            }

            @objid ("b3039552-bb1b-45c0-96a9-d6531c00c39a")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mOrdering = value;
            }

        }

        @objid ("00949634-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("12fcc0c1-f926-4934-b195-c0011b98533e")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mSelectionBehavior;
            }

            @objid ("0dda8e24-e7b0-4e61-affa-2bdc5ef61232")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mSelectionBehavior = value;
            }

        }

        @objid ("0094fa98-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UpperBoundSmAttribute extends SmAttribute {
            @objid ("f4994923-1c25-4969-a7fc-9b531b8b0531")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mUpperBound;
            }

            @objid ("92065a21-5db1-4d9e-8149-86440a9f3db6")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mUpperBound = value;
            }

        }

        @objid ("0095615e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("3595ecfa-119e-468e-90ab-d2b4fce607cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mType;
            }

            @objid ("8e5cee2a-362a-4f8b-b16d-b51e9774449b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mType = value;
            }

            @objid ("346c4267-5b18-43af-a3bc-dfbfccfe7057")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceObjectNodeDep();
            }

        }

        @objid ("0095d940-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("95d4ee0d-872d-4512-aff0-7c9e7720d718")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mInState;
            }

            @objid ("f3e4bf66-537b-4607-9e14-2b675c1b1985")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mInState = value;
            }

            @objid ("b2b966df-9d85-41cc-8a50-2b75dab84293")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfDep();
            }

        }

        @objid ("009652c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("11fe6846-bd10-47a0-bfa6-a6c44014a231")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresented;
            }

            @objid ("62ae6a76-8319-4bb5-85b4-65fc893af0e3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresented = value;
            }

            @objid ("8c44aa84-24b2-4ceb-bd5a-0f233a4ea828")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0096cbf2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("b824dc55-f87e-4562-9049-e0ac618e3c8e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedAttribute;
            }

            @objid ("5e588789-9fbb-49b9-ac77-f27601cc8429")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedAttribute = value;
            }

            @objid ("4b6a55c5-5725-47c9-9e76-3b2ce79d5f26")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097464a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRoleSmDependency extends SmSingleDependency {
            @objid ("f41dcf43-d04a-451b-95c4-9b75917d6b08")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRole;
            }

            @objid ("d44a9dd9-3d11-4302-a000-feabda4f3912")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRole = value;
            }

            @objid ("40da5d8d-0fe3-4fdb-8d9e-a45f092305f6")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097c372-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRealParameterSmDependency extends SmSingleDependency {
            @objid ("6241ac45-a27c-43ea-8a45-0ad80e529c9c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRealParameter;
            }

            @objid ("b7a3e575-8994-4ce4-bacd-2e0e8c7cac14")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRealParameter = value;
            }

            @objid ("9ed1cec8-45ab-4ceb-8167-ef5ccd61cdd3")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.RepresentingObjectNodeDep();
            }

        }

    }

}
