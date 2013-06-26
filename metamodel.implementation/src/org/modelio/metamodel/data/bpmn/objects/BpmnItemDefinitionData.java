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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemDefinitionImpl;
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

@objid ("00080bd8-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnItemDefinition.class, factory=BpmnItemDefinitionData.Metadata.ObjectFactory.class)
public class BpmnItemDefinitionData extends BpmnRootElementData {
    @objid ("7ddec6f7-cf77-4242-818b-b304fdd1f6a6")
    @SmaMetaAttribute(metaName="ItemKind", type=BpmnItemKind.class, smAttributeClass=Metadata.ItemKindSmAttribute.class)
     Object mItemKind = BpmnItemKind.INFORMATION;

    @objid ("d8e93c9e-b4b5-41ee-966e-0acbfe8bb523")
    @SmaMetaAttribute(metaName="IsCollection", type=Boolean.class, smAttributeClass=Metadata.IsCollectionSmAttribute.class)
     Object mIsCollection = false;

    @objid ("46f41c7f-4686-4e37-8d95-08876c1b93dc")
    @SmaMetaAssociation(metaName="StructureRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.StructureRefSmDependency.class, partof = true)
     SmObjectImpl mStructureRef;

    @objid ("d246570a-da33-4ffc-80bd-b0746dd75c64")
    @SmaMetaAssociation(metaName="TypedMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.TypedMessageSmDependency.class)
     List<SmObjectImpl> mTypedMessage = null;

    @objid ("4c5eaf5e-0b72-4caf-ab37-cd274ad8dbab")
    @SmaMetaAssociation(metaName="TypedItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.TypedItemSmDependency.class)
     List<SmObjectImpl> mTypedItem = null;

    @objid ("ddf4f1fe-9384-4556-a691-d2eb433325f1")
    @SmaMetaAssociation(metaName="TypedResourceParameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypedResourceParameterSmDependency.class)
     List<SmObjectImpl> mTypedResourceParameter = null;

    @objid ("98816bfc-d9fb-465e-aa42-43ba85e5e805")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00390076-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8f46ef34-74d6-4d47-b2d8-f25a4d21bc9a")
        private static SmClass smClass = null;

        @objid ("468aae88-9313-4c09-b191-dd5e895c9ae3")
        private static SmAttribute ItemKindAtt = null;

        @objid ("139e23e3-a339-4782-9902-9df8023f7be7")
        private static SmAttribute IsCollectionAtt = null;

        @objid ("405b1184-6b05-44a8-bdca-2a321b4c7a34")
        private static SmDependency StructureRefDep = null;

        @objid ("55be7fc5-ddc0-4c51-96a6-44b65052c9e2")
        private static SmDependency TypedMessageDep = null;

        @objid ("23f47f58-700d-44fd-95b8-79dccc818e45")
        private static SmDependency TypedItemDep = null;

        @objid ("c21f9b9d-9b38-4e13-b06e-705a6c6ca0ea")
        private static SmDependency TypedResourceParameterDep = null;

        @objid ("2be86e94-1746-481c-8c7a-325541a60b0c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f42c31f8-f785-4b61-b7e5-8084e1ab69f4")
        public static SmAttribute ItemKindAtt() {
            if (ItemKindAtt == null) {
            	ItemKindAtt = classof().getAttributeDef("ItemKind");
            }
            return ItemKindAtt;
        }

        @objid ("bb2dcb52-7a7e-4578-9a28-6d034a838a5f")
        public static SmAttribute IsCollectionAtt() {
            if (IsCollectionAtt == null) {
            	IsCollectionAtt = classof().getAttributeDef("IsCollection");
            }
            return IsCollectionAtt;
        }

        @objid ("dd77b80c-220a-422c-9016-8662f57f19c6")
        public static SmDependency StructureRefDep() {
            if (StructureRefDep == null) {
            	StructureRefDep = classof().getDependencyDef("StructureRef");
            }
            return StructureRefDep;
        }

        @objid ("0883d4de-66a9-471e-8f21-25c1c420d539")
        public static SmDependency TypedMessageDep() {
            if (TypedMessageDep == null) {
            	TypedMessageDep = classof().getDependencyDef("TypedMessage");
            }
            return TypedMessageDep;
        }

        @objid ("6ad743f4-fa54-409c-b681-188ed0dd4186")
        public static SmDependency TypedItemDep() {
            if (TypedItemDep == null) {
            	TypedItemDep = classof().getDependencyDef("TypedItem");
            }
            return TypedItemDep;
        }

        @objid ("df1c9a6e-6907-408f-b02b-431619283208")
        public static SmDependency TypedResourceParameterDep() {
            if (TypedResourceParameterDep == null) {
            	TypedResourceParameterDep = classof().getDependencyDef("TypedResourceParameter");
            }
            return TypedResourceParameterDep;
        }

        @objid ("1f131645-de17-4eb4-acf3-aed5dcdd4c6d")
        public static SmDependency getTypedItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedItemDep;
        }

        @objid ("e5ec276b-0835-4238-9a6a-36ff6465e551")
        public static SmAttribute getIsCollectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCollectionAtt;
        }

        @objid ("28c232a0-2a41-49ce-816b-f8cb66c060ba")
        public static SmDependency getTypedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedMessageDep;
        }

        @objid ("c5e6c602-7c45-400a-8b15-36ca5677f21e")
        public static SmDependency getTypedResourceParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedResourceParameterDep;
        }

        @objid ("32f0244d-3894-4b4e-926e-8010e7711b20")
        public static SmAttribute getItemKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemKindAtt;
        }

        @objid ("e0b020fb-7302-41b8-812b-43c86c7c7f15")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1c03d7e7-b3d8-4b96-8d90-b3b41e2b0fc6")
        public static SmDependency getStructureRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StructureRefDep;
        }

        @objid ("00394090-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("22473641-2bc3-442f-9c90-bf0b3821b96c")
            public ISmObjectData createData() {
                return new BpmnItemDefinitionData();
            }

            @objid ("9a10a366-f6dd-4380-b3ce-0704b90dfd23")
            public SmObjectImpl createImpl() {
                return new BpmnItemDefinitionImpl();
            }

        }

        @objid ("0039a198-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ItemKindSmAttribute extends SmAttribute {
            @objid ("af995bf5-db60-4cd2-9d27-33ec7274032a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mItemKind;
            }

            @objid ("df845303-a204-410f-88de-6a1890e425a4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mItemKind = value;
            }

        }

        @objid ("003ad428-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsCollectionSmAttribute extends SmAttribute {
            @objid ("59830a01-f7a5-4ad2-8b64-e2905bccfff2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mIsCollection;
            }

            @objid ("a74aaa51-a0e1-40ff-a363-b65010474ba3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mIsCollection = value;
            }

        }

        @objid ("003b3b70-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StructureRefSmDependency extends SmSingleDependency {
            @objid ("ded8505e-c9fe-47e0-a892-a3b6465b0996")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mStructureRef;
            }

            @objid ("d53db101-c600-4e90-88da-ef6d47ad6bdc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemDefinitionData) data).mStructureRef = value;
            }

            @objid ("ed2b8705-49b7-4ba6-908e-f58cc6d93783")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemDefinitionRefsDep();
            }

        }

        @objid ("003bb0c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedMessageSmDependency extends SmMultipleDependency {
            @objid ("cb1f6b13-52e2-4c16-8ee7-d1c6876cc87e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedMessage != null)? ((BpmnItemDefinitionData)data).mTypedMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("8d264cda-8271-4d3b-b288-ae8390afcd87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedMessage = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedMessage;
            }

            @objid ("752b303b-b7a7-4c8f-b291-620fb9530959")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ItemRefDep();
            }

        }

        @objid ("003c1bc6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedItemSmDependency extends SmMultipleDependency {
            @objid ("e2cbbc94-391e-4ece-ae14-aa6e3c62ea42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedItem != null)? ((BpmnItemDefinitionData)data).mTypedItem:SmMultipleDependency.EMPTY;
            }

            @objid ("9d47c7bf-b19e-49ba-8d5a-72bc339e8f67")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedItem = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedItem;
            }

            @objid ("3619a397-6dec-4e0b-8fca-618a00f42579")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.ItemSubjectRefDep();
            }

        }

        @objid ("003c80b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedResourceParameterSmDependency extends SmMultipleDependency {
            @objid ("112f59f3-ce18-4632-9735-7a73618bc756")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedResourceParameter != null)? ((BpmnItemDefinitionData)data).mTypedResourceParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("53949f41-8c68-4029-90a6-29801a3fde47")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedResourceParameter = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedResourceParameter;
            }

            @objid ("7032089a-770c-4d01-95ab-2d8d8aa14c50")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.TypeDep();
            }

        }

    }

}
