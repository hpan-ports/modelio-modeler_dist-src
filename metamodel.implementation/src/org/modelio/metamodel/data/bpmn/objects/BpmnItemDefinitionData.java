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
    @objid ("90e3344e-e137-40c1-914f-c0b30794f9b5")
    @SmaMetaAttribute(metaName="ItemKind", type=BpmnItemKind.class, smAttributeClass=Metadata.ItemKindSmAttribute.class)
     Object mItemKind = BpmnItemKind.INFORMATION;

    @objid ("cc685d3f-0588-49aa-989a-909abed4a76f")
    @SmaMetaAttribute(metaName="IsCollection", type=Boolean.class, smAttributeClass=Metadata.IsCollectionSmAttribute.class)
     Object mIsCollection = false;

    @objid ("464f1c97-a770-43f7-9014-505f6d847485")
    @SmaMetaAssociation(metaName="StructureRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.StructureRefSmDependency.class, partof = true)
     SmObjectImpl mStructureRef;

    @objid ("c7716a89-ad5c-428d-9a74-bc7054e64577")
    @SmaMetaAssociation(metaName="TypedMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.TypedMessageSmDependency.class)
     List<SmObjectImpl> mTypedMessage = null;

    @objid ("d95f557c-74f9-4b36-9d6c-b9c0f1df099c")
    @SmaMetaAssociation(metaName="TypedItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.TypedItemSmDependency.class)
     List<SmObjectImpl> mTypedItem = null;

    @objid ("a11df4a3-26f1-4748-9f36-a76869bd5622")
    @SmaMetaAssociation(metaName="TypedResourceParameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypedResourceParameterSmDependency.class)
     List<SmObjectImpl> mTypedResourceParameter = null;

    @objid ("426dfa80-ede2-4a84-b153-8a8f5b41ea32")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00390076-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("319dd189-b4b9-4ad0-9bd3-3112bb9f275d")
        private static SmClass smClass = null;

        @objid ("4eb2ad87-a8b4-4525-9aed-3819e5291bcc")
        private static SmAttribute ItemKindAtt = null;

        @objid ("da8e4768-42fb-4c49-a5e6-2fc78aa935ad")
        private static SmAttribute IsCollectionAtt = null;

        @objid ("c8dc6782-979f-476b-bd93-c6f0bdf4f73f")
        private static SmDependency StructureRefDep = null;

        @objid ("9aa637a0-54b3-417a-b0f8-3a5b338ad5c8")
        private static SmDependency TypedMessageDep = null;

        @objid ("5e1259c8-0d4f-4c65-8aaa-76b93b6b183d")
        private static SmDependency TypedItemDep = null;

        @objid ("5b2ba9a4-bf3b-4b65-a84e-309acca57c1c")
        private static SmDependency TypedResourceParameterDep = null;

        @objid ("9832b49d-633d-4b62-b617-1c9268dd4b65")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d653d464-c95f-412f-b33c-6d15cc468083")
        public static SmAttribute ItemKindAtt() {
            if (ItemKindAtt == null) {
            	ItemKindAtt = classof().getAttributeDef("ItemKind");
            }
            return ItemKindAtt;
        }

        @objid ("493b874e-0430-4a04-bb93-12b21a258fee")
        public static SmAttribute IsCollectionAtt() {
            if (IsCollectionAtt == null) {
            	IsCollectionAtt = classof().getAttributeDef("IsCollection");
            }
            return IsCollectionAtt;
        }

        @objid ("dc4d9c4e-8eea-48cb-967e-a376646c133a")
        public static SmDependency StructureRefDep() {
            if (StructureRefDep == null) {
            	StructureRefDep = classof().getDependencyDef("StructureRef");
            }
            return StructureRefDep;
        }

        @objid ("efff8adc-aea3-473d-80b1-a94a78268f72")
        public static SmDependency TypedMessageDep() {
            if (TypedMessageDep == null) {
            	TypedMessageDep = classof().getDependencyDef("TypedMessage");
            }
            return TypedMessageDep;
        }

        @objid ("43448a26-dc4f-47b5-89c2-f838d917e124")
        public static SmDependency TypedItemDep() {
            if (TypedItemDep == null) {
            	TypedItemDep = classof().getDependencyDef("TypedItem");
            }
            return TypedItemDep;
        }

        @objid ("bcc146ee-e844-490a-9d47-ebf9244e2735")
        public static SmDependency TypedResourceParameterDep() {
            if (TypedResourceParameterDep == null) {
            	TypedResourceParameterDep = classof().getDependencyDef("TypedResourceParameter");
            }
            return TypedResourceParameterDep;
        }

        @objid ("48826ef5-739c-4c09-bc9f-b658328efd5e")
        public static SmAttribute getIsCollectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCollectionAtt;
        }

        @objid ("8334528b-c497-4ef4-b3df-e82f06177b3f")
        public static SmDependency getTypedResourceParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedResourceParameterDep;
        }

        @objid ("69c4ba3a-9cb1-40f5-b5f8-665bc6c121d0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fc8459f1-c10a-465b-a6e8-632ccb0718a3")
        public static SmDependency getTypedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedMessageDep;
        }

        @objid ("85080d9a-a82d-4bf3-9c92-7c79215d10c3")
        public static SmAttribute getItemKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemKindAtt;
        }

        @objid ("1faed4ea-08ac-45d8-9df5-6bc8975c1252")
        public static SmDependency getStructureRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StructureRefDep;
        }

        @objid ("fed438f8-9290-4c32-9cd8-7a8cb4fd9881")
        public static SmDependency getTypedItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedItemDep;
        }

        @objid ("00394090-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3e0c9803-d86c-46d5-a2f5-5f94e50464db")
            public ISmObjectData createData() {
                return new BpmnItemDefinitionData();
            }

            @objid ("e5b5b188-10b2-4897-96f0-584fc1eab01a")
            public SmObjectImpl createImpl() {
                return new BpmnItemDefinitionImpl();
            }

        }

        @objid ("0039a198-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ItemKindSmAttribute extends SmAttribute {
            @objid ("8a50bed3-8865-4293-863e-661f1258862b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mItemKind;
            }

            @objid ("acfe8a3f-2504-4106-bd06-2c43dbc1aed4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mItemKind = value;
            }

        }

        @objid ("003ad428-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsCollectionSmAttribute extends SmAttribute {
            @objid ("caef6eda-4dd7-493b-b21d-f7f3a35ad712")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mIsCollection;
            }

            @objid ("3bbbe64b-cce9-4f2b-a306-61267ae7b5fc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mIsCollection = value;
            }

        }

        @objid ("003b3b70-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StructureRefSmDependency extends SmSingleDependency {
            @objid ("31d5716b-cf61-46ed-83ed-30579c8ed687")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mStructureRef;
            }

            @objid ("ccc9c6a6-1c2b-4df9-a301-7680053fb019")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemDefinitionData) data).mStructureRef = value;
            }

            @objid ("dafb492f-72c4-4edf-a7d2-d4698f66309f")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemDefinitionRefsDep();
            }

        }

        @objid ("003bb0c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedMessageSmDependency extends SmMultipleDependency {
            @objid ("d938aa32-b8e5-4ce2-af01-2da30657ab40")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedMessage != null)? ((BpmnItemDefinitionData)data).mTypedMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("ea9885c6-b588-4bb4-a2f6-44be8f8aadd2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedMessage = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedMessage;
            }

            @objid ("2bb82c37-2205-419f-9d2d-7f3c4d832363")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ItemRefDep();
            }

        }

        @objid ("003c1bc6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedItemSmDependency extends SmMultipleDependency {
            @objid ("a5c370b7-8afb-4fbc-912d-4b95771e1da8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedItem != null)? ((BpmnItemDefinitionData)data).mTypedItem:SmMultipleDependency.EMPTY;
            }

            @objid ("a2b88623-5081-4e7c-9a80-c521188f9411")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedItem = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedItem;
            }

            @objid ("2b50a1e4-cb79-4e77-af97-f5d073cab419")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.ItemSubjectRefDep();
            }

        }

        @objid ("003c80b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedResourceParameterSmDependency extends SmMultipleDependency {
            @objid ("a13c7a4a-a38b-4dd6-b1e6-272a440fda72")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedResourceParameter != null)? ((BpmnItemDefinitionData)data).mTypedResourceParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("7ee206e4-02a3-46aa-89fe-a2fd40f29b9b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedResourceParameter = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedResourceParameter;
            }

            @objid ("68ffc83f-e7dd-4306-a9f0-31c11844dd0b")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.TypeDep();
            }

        }

    }

}
