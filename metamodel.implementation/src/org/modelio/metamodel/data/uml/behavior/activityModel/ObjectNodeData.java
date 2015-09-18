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
    @objid ("73a55ff9-0645-443c-a598-dd569373b205")
    @SmaMetaAttribute(metaName="IsControlType", type=Boolean.class, smAttributeClass=Metadata.IsControlTypeSmAttribute.class)
     Object mIsControlType = false;

    @objid ("cddee98a-558d-4593-9004-845f8343566f")
    @SmaMetaAttribute(metaName="Ordering", type=ObjectNodeOrderingKind.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = ObjectNodeOrderingKind.FIFO;

    @objid ("ae297638-a296-477a-9042-a40bfcef862c")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("4ec25348-7b4d-42e4-9daf-50daab3a7806")
    @SmaMetaAttribute(metaName="UpperBound", type=String.class, smAttributeClass=Metadata.UpperBoundSmAttribute.class)
     Object mUpperBound = "1";

    @objid ("ada4dee5-f611-46e3-b574-1f43d8577b66")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("f4dfb532-c1b0-43a5-8c22-369a7f07372e")
    @SmaMetaAssociation(metaName="RepresentedRealParameter", typeDataClass=BehaviorParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRealParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRealParameter;

    @objid ("9b876c4d-4fe5-49b4-8c9f-9877e7082f10")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("d31bb831-74af-4ae4-b063-cc9b5d64dc72")
    @SmaMetaAssociation(metaName="RepresentedRole", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRoleSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRole;

    @objid ("8f239624-3144-433d-a3e0-54955880dc6b")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("7e4767f4-7296-4ca8-9116-aa60f6a956d5")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("a983abc8-10ff-476e-a627-0cd8a557eb81")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00932934-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("494544dc-da04-4a8e-881d-a10035b2cffd")
        private static SmClass smClass = null;

        @objid ("23003baa-450e-4d67-982b-96efa44f7e7b")
        private static SmAttribute IsControlTypeAtt = null;

        @objid ("4823c03b-ec51-4599-9855-9d31819fd346")
        private static SmAttribute OrderingAtt = null;

        @objid ("d2eef981-35d7-40de-88f8-3f991f830582")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("85676392-f821-4da9-86fb-abb63f633c49")
        private static SmAttribute UpperBoundAtt = null;

        @objid ("4b114df5-32e5-4876-b1d1-a2a5353709a2")
        private static SmDependency RepresentedDep = null;

        @objid ("64f597c0-29e7-4484-9d97-d5e8211de11b")
        private static SmDependency RepresentedRealParameterDep = null;

        @objid ("96b98263-219c-4331-9a15-17be479082d4")
        private static SmDependency TypeDep = null;

        @objid ("d50056cc-6da3-4caf-972c-fd3f8812c4c0")
        private static SmDependency RepresentedRoleDep = null;

        @objid ("3f7b8b64-2d40-48de-b7a1-764fe015247f")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("a929b514-e996-4daf-9754-21b85deb0065")
        private static SmDependency InStateDep = null;

        @objid ("9c2e8c90-770f-4ca7-8502-e1034d22e5b7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("84a6a325-3391-4660-a5e8-eba91332a511")
        public static SmAttribute IsControlTypeAtt() {
            if (IsControlTypeAtt == null) {
            	IsControlTypeAtt = classof().getAttributeDef("IsControlType");
            }
            return IsControlTypeAtt;
        }

        @objid ("0edef982-7f5c-4696-a15f-033c58690cd9")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("e5ff534d-1932-46e6-9e50-c6a60d00db04")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("689210bc-abcb-498a-9171-2692048672a0")
        public static SmAttribute UpperBoundAtt() {
            if (UpperBoundAtt == null) {
            	UpperBoundAtt = classof().getAttributeDef("UpperBound");
            }
            return UpperBoundAtt;
        }

        @objid ("31990619-0785-41b9-b01b-84bf5e01679e")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("abaa922e-3ba8-4e8c-8f81-8e994cb3f68e")
        public static SmDependency RepresentedRealParameterDep() {
            if (RepresentedRealParameterDep == null) {
            	RepresentedRealParameterDep = classof().getDependencyDef("RepresentedRealParameter");
            }
            return RepresentedRealParameterDep;
        }

        @objid ("61b017f1-95a8-4b91-96d7-53bced63ad0e")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("0246201d-a745-4691-8ff0-010aca5040dd")
        public static SmDependency RepresentedRoleDep() {
            if (RepresentedRoleDep == null) {
            	RepresentedRoleDep = classof().getDependencyDef("RepresentedRole");
            }
            return RepresentedRoleDep;
        }

        @objid ("e6e4d27a-d7a5-43cc-a032-96bce3256e79")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("afd64501-91da-4603-b9d2-7147fb31920e")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("47e838ad-3b3d-4811-8202-7e67e1c3e320")
        public static SmAttribute getUpperBoundAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UpperBoundAtt;
        }

        @objid ("f2c34c71-0afe-4eb9-891b-0102c4ba4bfb")
        public static SmDependency getRepresentedRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRoleDep;
        }

        @objid ("2c26bfcc-7193-44f2-96f8-e8fb5f9cb3e4")
        public static SmAttribute getIsControlTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlTypeAtt;
        }

        @objid ("0545bcf5-387f-4917-96da-3c5dbe534ace")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("08dfda7f-0cce-46a2-aadb-5d00856770e9")
        public static SmDependency getRepresentedRealParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRealParameterDep;
        }

        @objid ("6a036d7f-df93-4401-adf6-102e9d5d65c1")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("c1a525cf-049e-4907-a371-30382e050279")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("5b051546-d577-4c70-a782-f8d175a6ca76")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e6abe341-2812-4b21-a39f-7aac43d0eeb7")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("043846ae-8280-469b-85dc-bd9743135265")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("d4286177-0afd-47ee-a0d6-b0a0c8436010")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("00936b06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c9020e4b-0735-42fd-9b9c-551469663da8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d860897b-584f-4d64-b1a0-4d1c04789c6c")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0093d00a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsControlTypeSmAttribute extends SmAttribute {
            @objid ("38bdf0bc-cf19-402a-94d7-5bff95db474a")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mIsControlType;
            }

            @objid ("41b6c9e8-b8f4-41d3-9d1f-105c0ab7d8fc")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mIsControlType = value;
            }

        }

        @objid ("009432b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("0a315af2-179c-418f-b35f-d23575a24d0c")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mOrdering;
            }

            @objid ("27e2b0a4-4b9d-47ca-9986-26234e24ec38")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mOrdering = value;
            }

        }

        @objid ("00949634-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("05db2c2b-c85d-49d9-ac88-2e99f4f17ecc")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mSelectionBehavior;
            }

            @objid ("a94b4c69-5ca5-45e7-b599-ec68763cd887")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mSelectionBehavior = value;
            }

        }

        @objid ("0094fa98-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UpperBoundSmAttribute extends SmAttribute {
            @objid ("e27aac8d-8ceb-41e2-af01-0fe6f7665d0f")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mUpperBound;
            }

            @objid ("f501e13f-9153-4d88-9573-2dbadce6c077")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mUpperBound = value;
            }

        }

        @objid ("0095615e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("762f3ebc-de22-4252-a980-01055dcec91b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mType;
            }

            @objid ("60840f68-1bdc-46d9-82e0-21340db0c74d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mType = value;
            }

            @objid ("a72a726c-07aa-4390-b09a-1729cba3ada0")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceObjectNodeDep();
            }

        }

        @objid ("0095d940-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("ba28a03f-729f-4d03-83a0-95e445c4d0c0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mInState;
            }

            @objid ("610df681-3268-466f-8652-024c7b72b989")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mInState = value;
            }

            @objid ("3a6d8223-b7d2-453d-91f6-55fcd40a587b")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfDep();
            }

        }

        @objid ("009652c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("a7c21d82-2cfe-4ddb-8af1-5cc83e83a19b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresented;
            }

            @objid ("f6f9205e-78e4-4680-ac5d-1cd05403d1bd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresented = value;
            }

            @objid ("63e86d24-b79b-4c61-8011-0e6552dac627")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0096cbf2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("5ca9ea71-9c51-45ec-b80d-3a6f0ffa6bba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedAttribute;
            }

            @objid ("acc971fc-bf1c-4f3c-8371-a65102430f31")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedAttribute = value;
            }

            @objid ("40dec7f9-20ab-4c5b-83a5-6395c3be3ac6")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097464a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRoleSmDependency extends SmSingleDependency {
            @objid ("cb3ea3ce-9966-491a-aa1b-9d637af5d043")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRole;
            }

            @objid ("b3c809f6-e25e-4aa4-b8cc-58a4cc1b9063")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRole = value;
            }

            @objid ("6281eecd-aac1-43de-8e00-1b8e58c54479")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097c372-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRealParameterSmDependency extends SmSingleDependency {
            @objid ("08269e24-8776-444c-9543-22e862a2b480")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRealParameter;
            }

            @objid ("65f3bd96-96ff-44ad-b802-16fb377bc310")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRealParameter = value;
            }

            @objid ("93f883e4-82d3-46f7-af50-f67692784be6")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.RepresentingObjectNodeDep();
            }

        }

    }

}
