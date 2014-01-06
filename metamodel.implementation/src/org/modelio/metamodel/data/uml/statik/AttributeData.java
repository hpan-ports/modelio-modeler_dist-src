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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.statik.AttributeImpl;
import org.modelio.metamodel.uml.statik.Attribute;
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

@objid ("009851b6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Attribute.class, factory=AttributeData.Metadata.ObjectFactory.class)
public class AttributeData extends StructuralFeatureData {
    @objid ("a54b66b3-fd60-4efc-ac52-17ad97e70d12")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("6d50b12f-7d6e-4339-b6f0-ca1f1cabd557")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("01f14bac-07cb-40fb-bfbf-5789ba9d00a7")
    @SmaMetaAttribute(metaName="TargetIsClass", type=Boolean.class, smAttributeClass=Metadata.TargetIsClassSmAttribute.class)
     Object mTargetIsClass = false;

    @objid ("33efc9c2-8acc-4e79-a583-8f16795e9524")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("8d78efe9-edc1-417e-b1f7-aa10231e2cde")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("613fe833-90b8-4019-867b-9b893bf707b0")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("ea01ced5-7ee7-41ae-b165-c792682713ee")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("347655f6-1a77-4487-8e25-214fa29b67da")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("73cbe3dc-1112-4583-9321-0574e011bb71")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("ccc509fb-5449-45f8-85bf-833a32f1318d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00570a9e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0b5012a9-1618-40d1-8bd1-83933b8f80b8")
        private static SmClass smClass = null;

        @objid ("5c5f2bb1-c433-4a6a-abfe-4dcc20823e01")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("f21ef4ea-0675-42dd-a263-b714c3dffc71")
        private static SmAttribute ValueAtt = null;

        @objid ("a1456b08-e4df-43f3-a832-b555f4ccdd52")
        private static SmAttribute TargetIsClassAtt = null;

        @objid ("24c50a9d-5019-48bd-9429-33e07dc5e927")
        private static SmDependency TypeDep = null;

        @objid ("1364d258-68f6-45e5-b95c-62363bc45fb7")
        private static SmDependency OwnerDep = null;

        @objid ("b296e93a-448b-466d-900d-368e5695357f")
        private static SmDependency OccurenceDep = null;

        @objid ("b6406e16-0787-4878-9c86-f5f8601108d1")
        private static SmDependency RepresentingItemDep = null;

        @objid ("f62f00ef-47cf-4f2a-97ec-5c585f04ad7e")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("a0d92e0b-c19a-4e99-bffe-4bfa0b0565b7")
        private static SmDependency QualifiedDep = null;

        @objid ("9d3192c3-e5df-43da-ac12-e54ce23c2ca7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f72e8001-bb0b-4284-b22c-d7d2955da9a8")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("35779f59-d747-4c1a-b70f-6b3cec988dd3")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("cc7fa431-6802-47a7-8d3c-c1a27d9dc2a2")
        public static SmAttribute TargetIsClassAtt() {
            if (TargetIsClassAtt == null) {
            	TargetIsClassAtt = classof().getAttributeDef("TargetIsClass");
            }
            return TargetIsClassAtt;
        }

        @objid ("8050e42d-2029-46f8-96cd-baa852d6c283")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d66f4f45-aa76-4189-9694-e99db5f094ca")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("ec13484a-8b7d-456c-8549-4889064c4cda")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("0b7c9651-89cc-402f-9ebe-1d84de3ed136")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("f3d64857-401f-4a06-aa53-13b6e524d761")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("54cdb54c-15f7-4251-82cf-565976dea417")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("d632e920-bb36-4de9-8d07-712a2f45d5f8")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("95d074f7-5247-4892-ac57-b9454cf67886")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("9c214eed-86c7-4f5e-8fc7-550b24cf7c38")
        public static SmAttribute getTargetIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetIsClassAtt;
        }

        @objid ("410ce00d-7ea9-4f0c-a3fe-eddc879bd0a0")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("fae88af5-bd0d-439d-ab78-c05a758d8ce0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d54c9680-1b92-4527-b673-7cb548c595b3")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("5f44d548-e656-4e10-8e73-faf4853ac83c")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("9bbc8f51-93ae-491c-ae6b-417471578191")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("2573ef89-d196-46a9-9042-3a74ccfb3630")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("3f7301a2-d645-4747-910c-a3205041f07c")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("00574c0c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cb95e455-e9c3-4eb4-8ebc-4cb27085133b")
            public ISmObjectData createData() {
                return new AttributeData();
            }

            @objid ("397e61f2-49c5-45dd-8d19-672526632115")
            public SmObjectImpl createImpl() {
                return new AttributeImpl();
            }

        }

        @objid ("0057ace2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("c61562fb-18ac-4254-9020-bdea98106fd2")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTypeConstraint;
            }

            @objid ("b38f379a-3c47-466d-bcba-aeb0c071fdd2")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTypeConstraint = value;
            }

        }

        @objid ("00580f48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("b27bd9a1-3385-4928-a0dc-2d81769a3fd7")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mValue;
            }

            @objid ("a74e7f7e-b56d-46db-9b23-18d02e6e5610")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mValue = value;
            }

        }

        @objid ("00587104-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetIsClassSmAttribute extends SmAttribute {
            @objid ("9e26d53e-7962-4c00-bd8c-0a588e669e10")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTargetIsClass;
            }

            @objid ("88222b60-64d7-42c9-8996-3c8e1a0fb867")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTargetIsClass = value;
            }

        }

        @objid ("0058d568-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("d68486ff-1b11-401a-af26-f8c66ce0ca7b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mOccurence != null)? ((AttributeData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("671ae7c8-dd44-4b3e-aeb8-39bafc0231c8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mOccurence;
            }

            @objid ("cc8ed6e5-7626-488b-9ed4-f7e125e26d6b")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.BaseDep();
            }

        }

        @objid ("00593d3c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("f41bcd5c-f8a6-46b8-bbfe-ebc497e928b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mQualified;
            }

            @objid ("50858743-d9b2-4e63-a1c3-56a17b8e9ea6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mQualified = value;
            }

            @objid ("e8e51b0b-59a0-450b-a6cb-0b4c4f1b6ce4")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.QualifierDep();
            }

        }

        @objid ("0059b4ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("7612b748-91b1-4a43-a84c-ac2876774244")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mType;
            }

            @objid ("0db008e7-9fed-4901-aaec-597244b3773e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mType = value;
            }

            @objid ("aec6e5c2-5b7c-43bb-8416-87a2433850fe")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ObjectDep();
            }

        }

        @objid ("005a2c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("d8a83daf-6d53-4f44-9df7-d6af4259b1d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingObjectNode != null)? ((AttributeData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("a4222886-543b-436e-960a-5373e6a56744")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingObjectNode;
            }

            @objid ("2be4a6ea-b644-4da1-b011-2523ba9adc80")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005a9416-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("4cc3d8a8-24c9-4c5c-8fec-523cce20c019")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingItem != null)? ((AttributeData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("a5ae8ea0-b4b8-409c-ab72-801682ebabc9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingItem;
            }

            @objid ("beb06fa8-fbcb-4857-a183-e17d834bbcce")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005afb04-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("64644415-67be-48a7-8eaa-5f4fc6b58f3e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mOwner;
            }

            @objid ("5db85ec7-c8e8-47e3-9183-949533e01fc8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mOwner = value;
            }

            @objid ("d2344734-6fe1-4404-93e1-cf4a3a86b55d")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedAttributeDep();
            }

        }

    }

}
