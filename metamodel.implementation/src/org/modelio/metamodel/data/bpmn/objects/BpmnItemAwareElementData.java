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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementImpl;
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

@objid ("000765a2-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnItemAwareElement.class, factory=BpmnItemAwareElementData.Metadata.ObjectFactory.class)
public abstract class BpmnItemAwareElementData extends BpmnFlowElementData {
    @objid ("1ceec5de-b901-4fed-a5f9-b6bf98a9ba65")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("16c05627-609f-46e5-9743-9b1a12d920d4")
    @SmaMetaAssociation(metaName="TargetOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.TargetOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mTargetOfDataAssociation = null;

    @objid ("ce9cf14d-5980-4938-b243-c2784a77d707")
    @SmaMetaAssociation(metaName="ItemSubjectRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemSubjectRefSmDependency.class, partof = true)
     SmObjectImpl mItemSubjectRef;

    @objid ("9f116817-8674-4f1a-9510-6c347a1156f1")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("3807d3fa-aa32-4ebf-a93c-d4a6bd31d561")
    @SmaMetaAssociation(metaName="RepresentedAssociationEnd", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAssociationEndSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAssociationEnd;

    @objid ("6e63d2f5-2180-482d-8b44-6b05f386712c")
    @SmaMetaAssociation(metaName="DataState", typeDataClass=BpmnDataStateData.class, min=0, max=1, smAssociationClass=Metadata.DataStateSmDependency.class, component = true)
     SmObjectImpl mDataState;

    @objid ("1499ced1-5735-4549-ade3-bd40ab2425d8")
    @SmaMetaAssociation(metaName="SourceOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.SourceOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mSourceOfDataAssociation = null;

    @objid ("6372b943-b357-49c8-abd4-47fe5f9f5d79")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("be9e3d74-a6c0-4eb2-83de-37c549dfd2af")
    @SmaMetaAssociation(metaName="RepresentedInstance", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedInstanceSmDependency.class, partof = true)
     SmObjectImpl mRepresentedInstance;

    @objid ("27b2a06a-7376-437c-bc7e-089163b2925e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00342ba0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8dfd84cd-f4e0-44eb-abe6-978c21168c5b")
        private static SmClass smClass = null;

        @objid ("97f1aa85-67f3-432e-a3f0-a4dad76f4d9b")
        private static SmDependency TypeDep = null;

        @objid ("31b4030b-66aa-4b1c-a59b-4bf528502fd1")
        private static SmDependency TargetOfDataAssociationDep = null;

        @objid ("8eef65fd-4159-4869-94f1-d500e868b58b")
        private static SmDependency ItemSubjectRefDep = null;

        @objid ("ef2c89ef-a493-4156-b786-cdb009a67e84")
        private static SmDependency InStateDep = null;

        @objid ("eda14fed-498b-4be6-b7e2-da24b9192428")
        private static SmDependency RepresentedAssociationEndDep = null;

        @objid ("9f4ac4c9-cea3-4bcb-826d-ab193f942f35")
        private static SmDependency DataStateDep = null;

        @objid ("4ef03de7-4b79-46b7-a49f-e66e288006a7")
        private static SmDependency SourceOfDataAssociationDep = null;

        @objid ("850da71b-77a8-459b-8218-9b03baeefd9d")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("2a55dcf1-a7a4-4776-9bc1-075ba8372969")
        private static SmDependency RepresentedInstanceDep = null;

        @objid ("b494cce8-0d29-459c-b767-76383fc791cc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemAwareElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3d06c219-ebdb-492e-805c-aead8cb721b1")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("7cf33c62-71ec-4a04-87f3-9570e2e60071")
        public static SmDependency TargetOfDataAssociationDep() {
            if (TargetOfDataAssociationDep == null) {
            	TargetOfDataAssociationDep = classof().getDependencyDef("TargetOfDataAssociation");
            }
            return TargetOfDataAssociationDep;
        }

        @objid ("df690f7f-c166-4703-917b-2d243bb3c84a")
        public static SmDependency ItemSubjectRefDep() {
            if (ItemSubjectRefDep == null) {
            	ItemSubjectRefDep = classof().getDependencyDef("ItemSubjectRef");
            }
            return ItemSubjectRefDep;
        }

        @objid ("bda0950d-842b-40a9-8987-592aac5ac474")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("070f6c40-db62-4fcb-93e7-398eea3fc233")
        public static SmDependency RepresentedAssociationEndDep() {
            if (RepresentedAssociationEndDep == null) {
            	RepresentedAssociationEndDep = classof().getDependencyDef("RepresentedAssociationEnd");
            }
            return RepresentedAssociationEndDep;
        }

        @objid ("3938733f-706e-491c-bc70-c0087672c1b1")
        public static SmDependency DataStateDep() {
            if (DataStateDep == null) {
            	DataStateDep = classof().getDependencyDef("DataState");
            }
            return DataStateDep;
        }

        @objid ("0318e922-cc54-4b8f-92a7-4443497251d5")
        public static SmDependency SourceOfDataAssociationDep() {
            if (SourceOfDataAssociationDep == null) {
            	SourceOfDataAssociationDep = classof().getDependencyDef("SourceOfDataAssociation");
            }
            return SourceOfDataAssociationDep;
        }

        @objid ("8f4d82f8-b4e6-4ef6-8bc5-00ca4ab0b004")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("2d738b80-115e-4990-b014-f1015ddea4e1")
        public static SmDependency RepresentedInstanceDep() {
            if (RepresentedInstanceDep == null) {
            	RepresentedInstanceDep = classof().getDependencyDef("RepresentedInstance");
            }
            return RepresentedInstanceDep;
        }

        @objid ("da3ae462-656c-40d3-8224-552d44e3cdc9")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("073a9309-3c30-455e-aa87-d456a84648e8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7f638ab7-09ce-456f-b379-bc3973797ef1")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("e36667e1-07e9-4a45-a1e3-6296af4ea3fc")
        public static SmDependency getDataStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataStateDep;
        }

        @objid ("02803fd9-8664-4d94-92b0-6ef0c1f8c5a3")
        public static SmDependency getRepresentedInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedInstanceDep;
        }

        @objid ("d2998148-1266-4dfa-b88e-c7ec5733bc7f")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("d51db135-b5bb-4bfc-a4a3-ad2952cb70de")
        public static SmDependency getRepresentedAssociationEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAssociationEndDep;
        }

        @objid ("a906600c-a18f-4868-9afe-f3afa1d94f9a")
        public static SmDependency getTargetOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetOfDataAssociationDep;
        }

        @objid ("543dbbc4-402b-4a9d-b811-773e12cb1b90")
        public static SmDependency getItemSubjectRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemSubjectRefDep;
        }

        @objid ("1b884e07-625f-4947-bed8-f7dae5067290")
        public static SmDependency getSourceOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceOfDataAssociationDep;
        }

        @objid ("00346c78-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fd5140bf-8a49-4f8a-986b-bf7471e79b20")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e580f4e6-ca79-4ac9-a549-12d906cb3f23")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0034d352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSubjectRefSmDependency extends SmSingleDependency {
            @objid ("b41f3a99-dc35-4291-b08c-a7fab10fc608")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mItemSubjectRef;
            }

            @objid ("22e75a46-65f1-4219-ac42-fa8409ad76e5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mItemSubjectRef = value;
            }

            @objid ("95dd3c01-1bd6-4b5f-bcf7-075d67bc2ca1")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedItemDep();
            }

        }

        @objid ("00354864-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataStateSmDependency extends SmSingleDependency {
            @objid ("bf1bfaeb-d07b-47b2-be80-6d6600339905")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mDataState;
            }

            @objid ("80c4be59-7b02-401f-860c-c9fce115bf49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mDataState = value;
            }

            @objid ("4fa55721-0c85-4692-8f6a-10bc14a58e12")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.ItemDep();
            }

        }

        @objid ("0035c7a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("6aee18f7-ceb2-464f-96d7-3bda0fe46876")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAttribute;
            }

            @objid ("be79acdd-2821-45bb-802b-cdcb5a0bbf41")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAttribute = value;
            }

            @objid ("9d70c1b4-405c-468a-91bc-9a9d3cd7bbf3")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00363e9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAssociationEndSmDependency extends SmSingleDependency {
            @objid ("18b6d220-bd77-418a-b911-98b45378e0f6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd;
            }

            @objid ("3000a8a9-31bb-451c-984e-bc03742d6463")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd = value;
            }

            @objid ("981fd881-b5a6-437e-afce-5e81c32be929")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("0036b4ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedInstanceSmDependency extends SmSingleDependency {
            @objid ("189f9581-8c3a-4c8b-8beb-e9d4a9d704c1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedInstance;
            }

            @objid ("77fc33b2-eed9-4102-b7bc-cee711da9137")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedInstance = value;
            }

            @objid ("8cf9662f-9252-48c3-ba31-19a37174ee55")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00372d1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("012495c3-7f68-44b3-b023-b4eab28d696f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mSourceOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mSourceOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("4a6f8a04-821d-4a4c-958b-66aad268e792")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mSourceOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mSourceOfDataAssociation;
            }

            @objid ("3fe9b1fd-4eff-46fe-9c9f-2f738fa01033")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("0037939e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("ad145b6c-33ee-4955-ada4-4ac62b8174e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mTargetOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mTargetOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("3c65fe60-fa7e-4104-a6b8-0d8737ed8c3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mTargetOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mTargetOfDataAssociation;
            }

            @objid ("7e2ce41f-373c-4875-9054-894d68f5e07d")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("0037f974-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("44802922-904a-41f3-9c59-47decbae8412")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mType;
            }

            @objid ("6e7648c3-2899-4ed5-ad73-be16f5a39486")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mType = value;
            }

            @objid ("7515db2b-be94-49c7-9ebc-9ec58494d71c")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemAwareRefsDep();
            }

        }

        @objid ("00387444-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("a491e6cd-e4da-4fb7-9a1a-19b7db97432c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mInState;
            }

            @objid ("f1df1e39-8e9a-4c01-af17-2661d4e60636")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mInState = value;
            }

            @objid ("cb47187e-e034-4a68-b557-cdddb3999498")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnItemDep();
            }

        }

    }

}
