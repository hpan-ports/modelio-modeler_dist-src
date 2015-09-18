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
    @objid ("9b7ca72c-4a6f-423b-8e0c-936a7a1ec9e6")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("ead9bcb7-7f7e-4dad-bac3-c6b77dff5842")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("b752ef32-63d4-4176-b6f5-02ddd3831213")
    @SmaMetaAttribute(metaName="TargetIsClass", type=Boolean.class, smAttributeClass=Metadata.TargetIsClassSmAttribute.class)
     Object mTargetIsClass = false;

    @objid ("e63d6a90-5109-405e-98a8-266f72d91e91")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("23b4b3e4-714c-46b1-bdab-150b333e3125")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("84455725-874e-44fc-9e72-bd2b84725193")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("63e3bc8a-0ea5-4cb1-867b-01bd95c61996")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("83ad6e9a-984f-48a5-b29c-f7a592038ed8")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("7f689309-4541-4c7b-b45a-8015df55476b")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("3c7377a2-0a81-463f-b0ff-56d05ebe25e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00570a9e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2b1a9f8f-244a-46f2-b7c4-44660ee9dc5e")
        private static SmClass smClass = null;

        @objid ("f5b94ab6-9221-4582-8d3e-c2eb2f3c687c")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("48740a7c-3bdb-4fad-988c-6fedc153dd51")
        private static SmAttribute ValueAtt = null;

        @objid ("d3043f32-5e0c-439b-be25-44c749bc1c91")
        private static SmAttribute TargetIsClassAtt = null;

        @objid ("6378c46f-b8be-493f-a167-bdab710b3a12")
        private static SmDependency TypeDep = null;

        @objid ("aef1158f-a8a0-4cf3-a157-33e417654b03")
        private static SmDependency OwnerDep = null;

        @objid ("05ebd25c-f1c6-4e9d-85b5-f62f0ee4b73c")
        private static SmDependency OccurenceDep = null;

        @objid ("54872d76-95ab-40d5-a332-cde91cd71d7e")
        private static SmDependency RepresentingItemDep = null;

        @objid ("e89014d6-0357-4754-a9ef-9585e4fb8a65")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("4af1872c-a2c0-475b-b20d-f3db628bbd86")
        private static SmDependency QualifiedDep = null;

        @objid ("edf52d3b-2a10-4329-9e11-e1ad7050891c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bf8dd288-6264-4ffb-854e-1f2d0d783d6f")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("3028377f-fd0a-4c6d-87f4-dfdc9e597d67")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("159ee69d-cf9a-4cab-aecc-6cdea86cf0d0")
        public static SmAttribute TargetIsClassAtt() {
            if (TargetIsClassAtt == null) {
            	TargetIsClassAtt = classof().getAttributeDef("TargetIsClass");
            }
            return TargetIsClassAtt;
        }

        @objid ("60b283c8-28f6-4050-9f20-76ada819a874")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("42e9f0af-da09-4365-b544-1adcf6418213")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e7b3dc44-53a1-4b8f-a9c3-1bf8dd9bc1be")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("77c3afb3-8f08-4602-920b-1ec2edb34794")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("6bed4f2d-54e3-4be7-bbd9-4b6a94ec574a")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("c9145574-3afe-493f-9b86-50e8a36382a0")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("d88aca46-da36-4add-89d3-500c5b4c93df")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a33e66aa-cda5-4021-8756-fed8d2d26ddd")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("57c70ae9-0e5e-41cd-aede-dbf627986f41")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("3567651b-ae3e-4c59-9d71-b3db1e00363d")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("feff0aaa-d4a9-40ef-a7d5-070a8c608c13")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("1f5a477b-a4f6-444c-96cd-3475b9191f8e")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("ea5f2b48-f602-4d9a-bc66-c8e848c5f2f6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8329aad0-dabc-4e34-a82e-cf99a803c5d4")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("3e9be998-44a9-47d9-b8d3-5296e4ebbcf8")
        public static SmAttribute getTargetIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetIsClassAtt;
        }

        @objid ("cae0fdcc-582b-4697-83ef-4726f3f12dc8")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("00574c0c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("49bc4356-16c2-48a7-8b8b-bf36555187e7")
            public ISmObjectData createData() {
                return new AttributeData();
            }

            @objid ("90ee45e8-8be0-4c49-8c8f-12058c07569a")
            public SmObjectImpl createImpl() {
                return new AttributeImpl();
            }

        }

        @objid ("0057ace2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("0c508e9c-a183-4a29-9a4a-22345d310bd8")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTypeConstraint;
            }

            @objid ("3cc30cd4-d0d3-4915-8b04-16d73c606029")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTypeConstraint = value;
            }

        }

        @objid ("00580f48-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("89698895-b8de-4be3-933e-3c930c36ac91")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mValue;
            }

            @objid ("e110c1bc-91c5-45bf-9ce2-86c6486a1ce1")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mValue = value;
            }

        }

        @objid ("00587104-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetIsClassSmAttribute extends SmAttribute {
            @objid ("ae986976-61c9-4d37-8957-58d547390d4b")
            public Object getValue(ISmObjectData data) {
                return ((AttributeData) data).mTargetIsClass;
            }

            @objid ("9a01e16d-9990-4f02-8b59-35f80b04ce80")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeData) data).mTargetIsClass = value;
            }

        }

        @objid ("0058d568-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("bfcbf8bb-3ec4-478d-89cb-04cb1fa3c42c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mOccurence != null)? ((AttributeData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("af9cdcb2-341b-49ef-a61b-8fbdb0ded6a5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mOccurence;
            }

            @objid ("66889f43-4f74-4acb-9711-c704cf7d8abd")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.BaseDep();
            }

        }

        @objid ("00593d3c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("ea018664-821a-49a1-bec3-45ce2f8d6a83")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mQualified;
            }

            @objid ("0a801b77-b1d0-4a6e-9444-05e5a77cacf8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mQualified = value;
            }

            @objid ("ea9ffd9d-360b-4029-baff-6809365f924a")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.QualifierDep();
            }

        }

        @objid ("0059b4ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("c9e7ba78-7b90-4c62-9f89-75f9f98397ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mType;
            }

            @objid ("3c8439d1-d176-40d2-b5ec-9abc724ca5ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mType = value;
            }

            @objid ("99ee7d77-16a2-431d-935f-c61d86a2100e")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.ObjectDep();
            }

        }

        @objid ("005a2c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("771d099e-1f89-4ac9-9348-739e9d5e2608")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingObjectNode != null)? ((AttributeData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("96cbfa5e-9f53-42d3-9be0-55c77a558c93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingObjectNode;
            }

            @objid ("9bd5a9ee-5d19-417f-abdc-d68aaa0971bb")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005a9416-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("39817c34-ce94-4224-8647-930aafdf2db4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AttributeData)data).mRepresentingItem != null)? ((AttributeData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("d4e6d3f1-60c4-4b62-be12-b11a36f704bc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AttributeData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AttributeData) data).mRepresentingItem;
            }

            @objid ("f5a75170-6e9b-4cbb-b3da-8e6e7cac795b")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAttributeDep();
            }

        }

        @objid ("005afb04-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("b3294cbe-a66b-469e-bcc8-9a071e3c1fc2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeData) data).mOwner;
            }

            @objid ("d434f9a5-aed8-4488-a8f4-7649a73638e8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeData) data).mOwner = value;
            }

            @objid ("335b3e1b-65f8-47cb-af86-6486aa2cb212")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedAttributeDep();
            }

        }

    }

}
