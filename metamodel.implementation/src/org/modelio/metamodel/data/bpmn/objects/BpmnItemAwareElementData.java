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
    @objid ("a1a45582-8574-4ea2-b547-641fb090531f")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("77d5ff1b-4fd2-4bd3-a3a4-b735adbd0dcb")
    @SmaMetaAssociation(metaName="TargetOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.TargetOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mTargetOfDataAssociation = null;

    @objid ("779061ac-2a69-4133-b03e-96d067fb86d4")
    @SmaMetaAssociation(metaName="ItemSubjectRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemSubjectRefSmDependency.class, partof = true)
     SmObjectImpl mItemSubjectRef;

    @objid ("e32588f6-930d-4d1f-832f-b3be0136316b")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("650034db-5c0d-4796-84b4-358537c10012")
    @SmaMetaAssociation(metaName="RepresentedAssociationEnd", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAssociationEndSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAssociationEnd;

    @objid ("97723664-ae89-47f2-b4a5-688b435d34ad")
    @SmaMetaAssociation(metaName="DataState", typeDataClass=BpmnDataStateData.class, min=0, max=1, smAssociationClass=Metadata.DataStateSmDependency.class, component = true)
     SmObjectImpl mDataState;

    @objid ("91316630-5262-46e7-b505-fb04c38c2e36")
    @SmaMetaAssociation(metaName="SourceOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.SourceOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mSourceOfDataAssociation = null;

    @objid ("9051565c-8907-4869-947b-e45a0a5d83a8")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("71acfd09-8a71-4ed8-a600-3d741fad116d")
    @SmaMetaAssociation(metaName="RepresentedInstance", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedInstanceSmDependency.class, partof = true)
     SmObjectImpl mRepresentedInstance;

    @objid ("4107e32e-b480-45af-8efa-c5be44dadad6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00342ba0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b31b7386-c2e5-448a-9be5-df83a5a15ebe")
        private static SmClass smClass = null;

        @objid ("6b6c1832-1d15-47c2-b82b-44c1cf25df9e")
        private static SmDependency TypeDep = null;

        @objid ("f3e85ad1-6daa-42e6-ab86-cf84accef358")
        private static SmDependency TargetOfDataAssociationDep = null;

        @objid ("dd3bef79-e0df-4977-aaf1-b591461d9df7")
        private static SmDependency ItemSubjectRefDep = null;

        @objid ("4eddeaee-20e2-4b7e-af66-99a223411b14")
        private static SmDependency InStateDep = null;

        @objid ("ef4ddd32-d904-4ae5-b830-0bc1fd9e9012")
        private static SmDependency RepresentedAssociationEndDep = null;

        @objid ("89d68244-d1f8-46f6-9938-033f0eed3bb3")
        private static SmDependency DataStateDep = null;

        @objid ("cb731fa0-81e5-483f-9d90-cf838595c9d1")
        private static SmDependency SourceOfDataAssociationDep = null;

        @objid ("9977b69b-d173-4f00-b56e-0d42d71c87d4")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("b621a647-6a0f-4ef7-b08e-de55012567b4")
        private static SmDependency RepresentedInstanceDep = null;

        @objid ("c93ad154-0aa5-4203-850d-c94f0d021358")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemAwareElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1f34248a-2de8-4330-8877-b50305b13300")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("fcb4949b-7671-4720-8477-bf66586fdd4c")
        public static SmDependency TargetOfDataAssociationDep() {
            if (TargetOfDataAssociationDep == null) {
            	TargetOfDataAssociationDep = classof().getDependencyDef("TargetOfDataAssociation");
            }
            return TargetOfDataAssociationDep;
        }

        @objid ("a77834af-d165-4baa-ab0b-16d6891a4c52")
        public static SmDependency ItemSubjectRefDep() {
            if (ItemSubjectRefDep == null) {
            	ItemSubjectRefDep = classof().getDependencyDef("ItemSubjectRef");
            }
            return ItemSubjectRefDep;
        }

        @objid ("54836e9c-1fc0-4193-93e2-68860d19dcc3")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("e99e8a00-2872-4ff9-acb8-f018faa97660")
        public static SmDependency RepresentedAssociationEndDep() {
            if (RepresentedAssociationEndDep == null) {
            	RepresentedAssociationEndDep = classof().getDependencyDef("RepresentedAssociationEnd");
            }
            return RepresentedAssociationEndDep;
        }

        @objid ("daea6cc2-e3fd-4842-864c-722e95d70394")
        public static SmDependency DataStateDep() {
            if (DataStateDep == null) {
            	DataStateDep = classof().getDependencyDef("DataState");
            }
            return DataStateDep;
        }

        @objid ("bd041f5e-5cf3-4fa3-ac55-4a96804c8e57")
        public static SmDependency SourceOfDataAssociationDep() {
            if (SourceOfDataAssociationDep == null) {
            	SourceOfDataAssociationDep = classof().getDependencyDef("SourceOfDataAssociation");
            }
            return SourceOfDataAssociationDep;
        }

        @objid ("42f8d356-dbc0-48d5-b874-f9319009f488")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("c894fa3f-b0c9-459e-bbfb-9a3718b41535")
        public static SmDependency RepresentedInstanceDep() {
            if (RepresentedInstanceDep == null) {
            	RepresentedInstanceDep = classof().getDependencyDef("RepresentedInstance");
            }
            return RepresentedInstanceDep;
        }

        @objid ("1b3495ed-363a-468e-9e48-8f11fcdfd0b2")
        public static SmDependency getDataStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataStateDep;
        }

        @objid ("ecb96ff4-84ae-4d0d-9f4a-2ed5bf1335af")
        public static SmDependency getRepresentedAssociationEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAssociationEndDep;
        }

        @objid ("24c7b6c9-8d4b-4de5-9748-7b3f08a7f190")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("74e0f07b-0393-4bd7-a6f7-ae07b4186e2f")
        public static SmDependency getSourceOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceOfDataAssociationDep;
        }

        @objid ("1170bfa0-252d-4dd6-a039-74930eda46db")
        public static SmDependency getTargetOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetOfDataAssociationDep;
        }

        @objid ("5463c2a6-1d4d-4f24-8f79-b25ab5766167")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("3ed5c34c-66a6-42f3-a5c0-69e020013009")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("96f0a52e-b803-4195-8ae1-779c39a65d04")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("96fd0972-a421-4cc5-8457-973c02fd01eb")
        public static SmDependency getRepresentedInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedInstanceDep;
        }

        @objid ("80fec405-cb4e-4938-a221-a261b933d363")
        public static SmDependency getItemSubjectRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemSubjectRefDep;
        }

        @objid ("00346c78-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fd7ebc5d-cce4-4e1a-b867-7c493a5a6851")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("6c87f62c-78c6-4acb-84f5-1ef76971c5b4")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0034d352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSubjectRefSmDependency extends SmSingleDependency {
            @objid ("ac02ba5a-7e88-404b-8f71-c5aad60448b0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mItemSubjectRef;
            }

            @objid ("13e42961-9b07-455c-9670-fe3d03743535")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mItemSubjectRef = value;
            }

            @objid ("b1e43eb9-d841-43fa-bff6-7c2538ae45e6")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedItemDep();
            }

        }

        @objid ("00354864-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataStateSmDependency extends SmSingleDependency {
            @objid ("86526a63-c55e-4a9e-860b-6f07ee8fbd98")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mDataState;
            }

            @objid ("42506bd2-d874-45f2-9ef8-a5b379123349")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mDataState = value;
            }

            @objid ("66790617-1302-43c7-ba25-fa20cfd569cf")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.ItemDep();
            }

        }

        @objid ("0035c7a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("92a6f574-a586-41d2-b8fc-4b9b2253a8f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAttribute;
            }

            @objid ("7b80860a-e4e3-4b8a-899b-a34786fadc35")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAttribute = value;
            }

            @objid ("a9f44190-f3ae-42d1-a42a-e45af834bfdb")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00363e9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAssociationEndSmDependency extends SmSingleDependency {
            @objid ("cb8721db-dee8-4017-b466-06f6bcca95a2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd;
            }

            @objid ("351a2335-4b9a-4b7c-8c6e-9ba2401beb7c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd = value;
            }

            @objid ("cde33b7a-ba22-4445-8b1c-1cfc17d5d234")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("0036b4ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedInstanceSmDependency extends SmSingleDependency {
            @objid ("96e49667-1137-406d-8d3d-dc7c96d877c0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedInstance;
            }

            @objid ("513e3899-b37d-44d7-aeb2-412c87e70cae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedInstance = value;
            }

            @objid ("a541b093-3fa6-4db4-a5b7-9db88c10eb55")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00372d1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("14df7a61-f51a-41d0-ae7d-a607ac3e310e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mSourceOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mSourceOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("487c453e-754b-4ab2-b426-73a1d871831d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mSourceOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mSourceOfDataAssociation;
            }

            @objid ("bf7e01c8-d5ce-4337-a7fe-30329acb2cf0")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("0037939e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("19e89dad-5b0c-4627-9127-855e96506ed8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mTargetOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mTargetOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("d32eecd8-9199-4efb-a213-ea90a7efecac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mTargetOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mTargetOfDataAssociation;
            }

            @objid ("f367bbc9-7b27-4140-9a76-08ca39f72193")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("0037f974-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("5d468b18-7655-43b5-a090-feb417c8f8df")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mType;
            }

            @objid ("39265481-fd41-473e-8f43-e853abdf3590")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mType = value;
            }

            @objid ("7f95b172-5ef4-4223-b080-42414e48122a")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemAwareRefsDep();
            }

        }

        @objid ("00387444-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("e10d2f6d-b820-4006-82ca-194ce35ea128")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mInState;
            }

            @objid ("0fa30c8c-7368-451e-8b8e-2438493fafc8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mInState = value;
            }

            @objid ("66286ea3-70bd-4303-81cd-4816db270c25")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnItemDep();
            }

        }

    }

}
