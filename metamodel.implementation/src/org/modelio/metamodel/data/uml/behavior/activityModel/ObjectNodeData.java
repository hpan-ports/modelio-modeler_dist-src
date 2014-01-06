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
    @objid ("da1ed415-4167-4119-aa72-9aae16302098")
    @SmaMetaAttribute(metaName="IsControlType", type=Boolean.class, smAttributeClass=Metadata.IsControlTypeSmAttribute.class)
     Object mIsControlType = false;

    @objid ("767b2d37-7ef0-498f-880e-89b7a575e56d")
    @SmaMetaAttribute(metaName="Ordering", type=ObjectNodeOrderingKind.class, smAttributeClass=Metadata.OrderingSmAttribute.class)
     Object mOrdering = ObjectNodeOrderingKind.FIFO;

    @objid ("b7c734b9-1aaf-4987-ba0c-4ea0880c8074")
    @SmaMetaAttribute(metaName="SelectionBehavior", type=String.class, smAttributeClass=Metadata.SelectionBehaviorSmAttribute.class)
     Object mSelectionBehavior = "";

    @objid ("45392cdb-9255-4fef-89c1-7f11eea7e03c")
    @SmaMetaAttribute(metaName="UpperBound", type=String.class, smAttributeClass=Metadata.UpperBoundSmAttribute.class)
     Object mUpperBound = "1";

    @objid ("95d9882d-c025-482b-9997-787f6d9ca371")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     SmObjectImpl mRepresented;

    @objid ("a3bfda1c-fe85-4fdc-9ad3-4cb61254c2cb")
    @SmaMetaAssociation(metaName="RepresentedRealParameter", typeDataClass=BehaviorParameterData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRealParameterSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRealParameter;

    @objid ("d49713c5-9702-49f6-88d5-12cc5107ed1a")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("59de0acc-496a-4d26-8550-0ffc28c7a116")
    @SmaMetaAssociation(metaName="RepresentedRole", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedRoleSmDependency.class, partof = true)
     SmObjectImpl mRepresentedRole;

    @objid ("c1d972ae-7167-4c94-ab11-6500f7d16af2")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("4755f7d1-aa7d-4024-b32e-78dbc79d241c")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("b46bea2a-6b4d-41af-9c0c-cdc10a5a5910")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00932934-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9684b3f0-3951-41f1-a43d-a8130329acb1")
        private static SmClass smClass = null;

        @objid ("f543a0ab-bca2-4e79-a3ca-d8ed16b59844")
        private static SmAttribute IsControlTypeAtt = null;

        @objid ("a20d4e4c-05a8-49f9-93b0-9c88140302ab")
        private static SmAttribute OrderingAtt = null;

        @objid ("c620262e-3e98-43be-9d01-9df088f8d066")
        private static SmAttribute SelectionBehaviorAtt = null;

        @objid ("00420f8e-a1b1-4949-92eb-d33b6a67e634")
        private static SmAttribute UpperBoundAtt = null;

        @objid ("a7a0832e-0e0a-4e97-b2fa-cae2689d927f")
        private static SmDependency RepresentedDep = null;

        @objid ("1792692c-6b18-4634-ad45-43fd0c80312f")
        private static SmDependency RepresentedRealParameterDep = null;

        @objid ("ac2c3a42-1b7a-4397-81c8-05189d52156b")
        private static SmDependency TypeDep = null;

        @objid ("6432f693-cee9-4382-8ec2-a51aa0087f0e")
        private static SmDependency RepresentedRoleDep = null;

        @objid ("e33d8c79-a370-436e-bf06-f3113af48aef")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("a273d645-850e-4bea-8cab-bf8228767dc3")
        private static SmDependency InStateDep = null;

        @objid ("80dfc8a5-2c5d-4d71-b34a-4f3cb06bc036")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ObjectNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a80b0d88-bea1-4645-8e40-2e81f72a5f7f")
        public static SmAttribute IsControlTypeAtt() {
            if (IsControlTypeAtt == null) {
            	IsControlTypeAtt = classof().getAttributeDef("IsControlType");
            }
            return IsControlTypeAtt;
        }

        @objid ("ed7e70e6-9089-42e5-95e7-094ed8dba0f7")
        public static SmAttribute OrderingAtt() {
            if (OrderingAtt == null) {
            	OrderingAtt = classof().getAttributeDef("Ordering");
            }
            return OrderingAtt;
        }

        @objid ("0e6a2f98-4d20-410a-9b1c-7c959ae49fae")
        public static SmAttribute SelectionBehaviorAtt() {
            if (SelectionBehaviorAtt == null) {
            	SelectionBehaviorAtt = classof().getAttributeDef("SelectionBehavior");
            }
            return SelectionBehaviorAtt;
        }

        @objid ("daa8d8ee-f860-4960-b469-3bebf712d280")
        public static SmAttribute UpperBoundAtt() {
            if (UpperBoundAtt == null) {
            	UpperBoundAtt = classof().getAttributeDef("UpperBound");
            }
            return UpperBoundAtt;
        }

        @objid ("de81dd93-bf1c-4f0c-9924-23794bd1155c")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("a2dad23f-8b56-40ca-afa4-a43b41367823")
        public static SmDependency RepresentedRealParameterDep() {
            if (RepresentedRealParameterDep == null) {
            	RepresentedRealParameterDep = classof().getDependencyDef("RepresentedRealParameter");
            }
            return RepresentedRealParameterDep;
        }

        @objid ("a77d9bd1-e479-4e34-9835-54a295d25128")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("e7c38058-bd81-4eac-9ed4-f1465fe4d7ea")
        public static SmDependency RepresentedRoleDep() {
            if (RepresentedRoleDep == null) {
            	RepresentedRoleDep = classof().getDependencyDef("RepresentedRole");
            }
            return RepresentedRoleDep;
        }

        @objid ("b6971101-c53a-4ec7-a950-669201c2ce7c")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("67dbc7c9-267d-4bd4-a367-aacd904303e0")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("a24771ef-31b2-40ad-8363-25a2b9da27f4")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("42f2db3f-7a00-4c56-bcd3-106a1704f56c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0a00b351-8cd7-44c2-84ed-19a4a2203281")
        public static SmAttribute getIsControlTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlTypeAtt;
        }

        @objid ("89ff0ca6-651a-43b7-b343-380c89baddfd")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("ca9fffd5-c846-42f6-95c2-87a2eecade9d")
        public static SmDependency getRepresentedRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRoleDep;
        }

        @objid ("ceea4581-298c-4234-be22-b3a433822f59")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("ccb026ca-be03-4ab5-a25d-725912aa1b66")
        public static SmAttribute getUpperBoundAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UpperBoundAtt;
        }

        @objid ("aae3b9f9-4764-4bf3-b2ec-892882fe6be4")
        public static SmAttribute getSelectionBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SelectionBehaviorAtt;
        }

        @objid ("42f2a480-9b4c-4434-aa69-1f2ecfce19a3")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("4b28ef17-2ef9-4a67-898c-cfcf2274f801")
        public static SmDependency getRepresentedRealParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedRealParameterDep;
        }

        @objid ("406f4c84-8b0e-4f2c-93c1-ed0d2fdec283")
        public static SmAttribute getOrderingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OrderingAtt;
        }

        @objid ("00936b06-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d44a2c15-98d6-4fdb-a831-88a8b194dfd0")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("fe6c6cb0-2f4a-4edb-baa9-51bc9460d725")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0093d00a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsControlTypeSmAttribute extends SmAttribute {
            @objid ("89a59e31-d7aa-411d-afa0-85c2ee2ee799")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mIsControlType;
            }

            @objid ("0af07608-5cbc-4542-8ca2-d80e6664c8ef")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mIsControlType = value;
            }

        }

        @objid ("009432b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OrderingSmAttribute extends SmAttribute {
            @objid ("bd033261-4eb6-4dcf-b332-3291123f2858")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mOrdering;
            }

            @objid ("b92528e7-74f9-4258-83de-67322a93c7f6")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mOrdering = value;
            }

        }

        @objid ("00949634-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SelectionBehaviorSmAttribute extends SmAttribute {
            @objid ("ad6da63f-9c6b-4c4b-bc3d-ea0677481fe2")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mSelectionBehavior;
            }

            @objid ("7f1cc1f5-e1f1-4e48-8cae-be291399a84a")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mSelectionBehavior = value;
            }

        }

        @objid ("0094fa98-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UpperBoundSmAttribute extends SmAttribute {
            @objid ("c3eff2d1-7b8d-4d1a-8016-932c6e59a9a7")
            public Object getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mUpperBound;
            }

            @objid ("eb09eda6-416f-4ac2-9ac9-cf4775add6d4")
            public void setValue(ISmObjectData data, Object value) {
                ((ObjectNodeData) data).mUpperBound = value;
            }

        }

        @objid ("0095615e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("4bb67771-f21a-4f5e-836b-41feab84a9fa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mType;
            }

            @objid ("80b33892-9192-4c16-9f82-f8f4ebeb90f4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mType = value;
            }

            @objid ("9d1032d4-9da1-4e82-89aa-faa253f35b02")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceObjectNodeDep();
            }

        }

        @objid ("0095d940-c4c2-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("822321ba-21b4-495f-a927-7ebfabc15d45")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mInState;
            }

            @objid ("b1876226-8072-4f61-8482-9877ad62e0a9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mInState = value;
            }

            @objid ("3bf34c2e-3c2b-40a3-a174-2d42cb52d8af")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfDep();
            }

        }

        @objid ("009652c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("6594b6a2-9e30-40dd-b13c-e95a38b32d6d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresented;
            }

            @objid ("c236287d-238e-4d63-b109-ae1baedad046")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresented = value;
            }

            @objid ("787e0bd5-9d24-41c0-a7e4-c720f3c76d25")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0096cbf2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("433e7a34-bc61-404d-9de0-f6d6cf89f596")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedAttribute;
            }

            @objid ("8fea7415-1581-42ce-8877-2fd1b2349804")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedAttribute = value;
            }

            @objid ("26823d94-5a5d-4cc5-981e-07589e3320f2")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097464a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRoleSmDependency extends SmSingleDependency {
            @objid ("29d03a5b-8f85-4051-ba40-beebc822f400")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRole;
            }

            @objid ("e0889468-e334-495d-abf6-9b7fb303d66d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRole = value;
            }

            @objid ("6b73e5a5-cf58-4c97-b85b-97c583f6f234")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingObjectNodeDep();
            }

        }

        @objid ("0097c372-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedRealParameterSmDependency extends SmSingleDependency {
            @objid ("c9c5fb3c-5639-4260-b5ab-c7627354bdc6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ObjectNodeData) data).mRepresentedRealParameter;
            }

            @objid ("9b98db47-6cf4-4ce5-975f-8c2c96cf91e0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ObjectNodeData) data).mRepresentedRealParameter = value;
            }

            @objid ("3d9bafc7-bbb9-45ba-a6e8-605fd65c7082")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.RepresentingObjectNodeDep();
            }

        }

    }

}
