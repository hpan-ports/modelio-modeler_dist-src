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
    @objid ("8728e534-545e-42e5-955f-f2e422c6a02e")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("bccdcb6b-4ee6-4156-9eca-34f495834190")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("fd62bce6-f63b-45f3-af2f-59b28d65c07f")
    @SmaMetaAttribute(metaName="TargetIsClass", type=Boolean.class, smAttributeClass=Metadata.TargetIsClassSmAttribute.class)
     Object mTargetIsClass = false;

    @objid ("2c3d26ae-c93e-43a5-ac61-6d9255736509")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("93b43f13-878e-4948-8cd7-06f337451b75")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("0fca593a-9435-47db-8380-f804970dd5b8")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("687f2359-4ece-44bc-a709-2746eb7e92d3")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("f11a5884-c480-42ad-9a62-bdd06c0a87af")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("cca9d2cf-b361-4f59-8d64-01364d3d9894")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("6d4d076d-b892-4e22-8a15-fe017d874176")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00570a9e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6835ab6f-1fa7-48e3-9a8e-2c3202ba3160")
        private static SmClass smClass = null;

        @objid ("7c7a68c7-5c62-4997-bd86-920b859162a4")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("d15d7a97-4387-4d3b-8542-7baeb3a4ce38")
        private static SmAttribute ValueAtt = null;

        @objid ("206f4785-299d-45b3-aad6-d2e16e3b033b")
        private static SmAttribute TargetIsClassAtt = null;

        @objid ("220b2c4e-7f01-404d-8e6e-7f05c9da0de8")
        private static SmDependency TypeDep = null;

        @objid ("6b94d124-5154-48c3-9ba8-9cf745343680")
        private static SmDependency OwnerDep = null;

        @objid ("0ec61c14-47c3-4120-8eb9-b0e2a062ee10")
        private static SmDependency OccurenceDep = null;

        @objid ("21460df5-aa33-4070-b805-3198f4d88b40")
        private static SmDependency RepresentingItemDep = null;

        @objid ("91eecba4-7b40-454c-ada5-d8a18ec1010f")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("35c0c032-0016-489e-b9dc-650f14cb21ee")
        private static SmDependency QualifiedDep = null;

        @objid ("f622a9a1-fb79-454c-97e4-4cabeeba3007")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("377a9f6e-1f39-4230-b0ab-5d540cb19142")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("19255fff-3c15-428d-8280-27765c674661")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("8b9d010e-e5d0-433d-b011-7b318eeb7d4a")
        public static SmAttribute TargetIsClassAtt() {
            if (TargetIsClassAtt == null) {
            	TargetIsClassAtt = classof().getAttributeDef("TargetIsClass");
            }
            return TargetIsClassAtt;
        }

        @objid ("f0a324ee-af93-47e7-95da-c6c70cf0c48f")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("82071ffa-d99a-401f-a118-d187eb05b4a4")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("b6e23e5c-6936-4da7-9c50-3c8efdd99feb")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("034dbfd2-308c-4eb9-94b2-43a9482dabc0")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("15b3c595-2ce1-4137-a128-e36154e843f9")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("6e9a2b9a-aa4f-4696-89ec-8ce91cdc9583")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("01d8c59a-a822-4507-b3f7-b45b815005c9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ce6195ff-a7de-4bcf-b947-68e6b1ec1457")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("13d12420-374f-44d8-b00f-48c50e7bfccd")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("f7ba7c9c-b485-4f02-a9ac-b94ef4170953")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("33dd2ecf-33b6-485c-b825-2b5a7a37bdd7")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("caa752c6-d105-4c56-aa5c-ad42da55af66")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("517a93e6-b9c3-41f3-b0ab-62e6b858eb12")
        public static SmAttribute getTargetIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetIsClassAtt;
        }

        @objid ("395e91b7-4417-4ba7-bca9-4ea342951210")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("b2bf7b2a-b8fd-489e-a671-68cff14d3901")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("96248d44-31df-4696-8eba-e8c2d7ac44da")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("00574c0c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1566e069-3d1c-4bdf-9772-a886110e6bbe")
            public ISmObjectData createData() {
                return new AttributeData();
            }

            @objid ("0f647246-f256-469e-affc-e41c4338411b")
            public SmObjectImpl createImpl() {
                return new AttributeImpl();
            }

        }

        @objid ("0057ace2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("9afbbb94-6e9d-4c22-ad94-6c0cc437269a")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTypeConstraint;
            }

            @objid ("79961298-aed0-44ec-92a8-b1d471baf87a")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTypeConstraint = value;
            }

        }

        @objid ("00580f48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("574f08e3-54b6-4444-9875-02b6eb87e704")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mValue;
            }

            @objid ("a5fd2d07-6540-4f2b-a245-2f4741ff5206")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mValue = value;
            }

        }

        @objid ("00587104-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetIsClassSmAttribute extends SmAttribute {
            @objid ("fe8d1e3e-978e-49fc-9fda-ea1f98fd70d3")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTargetIsClass;
            }

            @objid ("5e6948b3-be97-4c99-acd9-aa82dc127ad6")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTargetIsClass = value;
            }

        }

        @objid ("0058d568-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("cde848ca-e849-47c4-967a-d74bace4e1fa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mOccurence != null)? ((AttributeData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("e329bbb9-5a0a-447c-a6b0-356fc8f4dd17")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mOccurence;
            }

            @objid ("f1433c18-08d6-4c24-9a80-808ba34e06a2")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.BaseDep();
            }

        }

        @objid ("00593d3c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("fba71f83-6ffb-4b07-82e9-7382e6f28f50")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mQualified;
            }

            @objid ("e7e0e13a-d6fd-491f-945a-f405c2ed6cf3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mQualified = value;
            }

            @objid ("6ee5a409-3354-4960-b1c0-7a0380655cb2")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.QualifierDep();
            }

        }

        @objid ("0059b4ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("aec77e8f-f430-410e-8e80-17eaf69c902b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mType;
            }

            @objid ("8b7e39df-918a-46ab-9262-6e5a302e13e1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mType = value;
            }

            @objid ("4b12a229-f1c0-40a3-8efa-de1a468b5fcf")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ObjectDep();
            }

        }

        @objid ("005a2c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("9c821205-4339-494e-ba79-4ddc243f90ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingObjectNode != null)? ((AttributeData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("0e0ac900-d98e-4c2b-91db-0f4d3bf60356")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingObjectNode;
            }

            @objid ("b2df211b-842a-4497-b3e3-50f614962e4d")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005a9416-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("c65f67f0-0cd2-4ce1-b693-25e5d6e16622")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingItem != null)? ((AttributeData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("719d1574-46b2-4303-9816-e5ff1804da91")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingItem;
            }

            @objid ("c8886e7c-4f65-4086-8f01-49a53b12bc98")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005afb04-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("0dfa5ea7-e57a-49f8-8467-abf83259f02c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mOwner;
            }

            @objid ("89b0bb28-e527-4221-bd3a-82e24596061b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mOwner = value;
            }

            @objid ("ccb157a1-e689-4e70-b6fb-9db440a6331b")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedAttributeDep();
            }

        }

    }

}
