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
    @objid ("96fe0818-d7db-4488-b454-dc6f6844bc01")
    @SmaMetaAttribute(metaName="ItemKind", type=BpmnItemKind.class, smAttributeClass=Metadata.ItemKindSmAttribute.class)
     Object mItemKind = BpmnItemKind.INFORMATION;

    @objid ("d83f6d8e-2d7d-46d0-b785-9b305f5caf5a")
    @SmaMetaAttribute(metaName="IsCollection", type=Boolean.class, smAttributeClass=Metadata.IsCollectionSmAttribute.class)
     Object mIsCollection = false;

    @objid ("eeb37c31-1889-406c-9106-f7697be898bf")
    @SmaMetaAssociation(metaName="StructureRef", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.StructureRefSmDependency.class, partof = true)
     SmObjectImpl mStructureRef;

    @objid ("9223271a-9267-43c8-9ead-1d42b8987ab2")
    @SmaMetaAssociation(metaName="TypedMessage", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.TypedMessageSmDependency.class)
     List<SmObjectImpl> mTypedMessage = null;

    @objid ("878c5d19-c33a-4b30-879a-38db8a8a5729")
    @SmaMetaAssociation(metaName="TypedItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.TypedItemSmDependency.class)
     List<SmObjectImpl> mTypedItem = null;

    @objid ("500c15cc-d370-4a4b-a66d-b934ae39bad7")
    @SmaMetaAssociation(metaName="TypedResourceParameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypedResourceParameterSmDependency.class)
     List<SmObjectImpl> mTypedResourceParameter = null;

    @objid ("744614fd-99bb-4819-9e15-c3d4846e0bae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00390076-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c3c984cb-0156-4318-a43b-be12d4698855")
        private static SmClass smClass = null;

        @objid ("15ab539c-a723-4e53-ad78-d65ce5d98093")
        private static SmAttribute ItemKindAtt = null;

        @objid ("5b6c0b08-cd59-49f3-b669-5ecbd3038a6a")
        private static SmAttribute IsCollectionAtt = null;

        @objid ("f641abb0-2cce-46e6-abd4-bbfc60111979")
        private static SmDependency StructureRefDep = null;

        @objid ("e0f732d7-32a0-4024-a492-651bbbb3e758")
        private static SmDependency TypedMessageDep = null;

        @objid ("96606b07-d141-4a34-b316-a547d5d18218")
        private static SmDependency TypedItemDep = null;

        @objid ("4a02f3a3-bb1a-4317-b5b6-1407eabc1801")
        private static SmDependency TypedResourceParameterDep = null;

        @objid ("e7be5c40-3ad4-41cd-9174-8e0a8113e78d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f14d63cc-0dcd-4f85-a0da-dad36b8ec4c6")
        public static SmAttribute ItemKindAtt() {
            if (ItemKindAtt == null) {
            	ItemKindAtt = classof().getAttributeDef("ItemKind");
            }
            return ItemKindAtt;
        }

        @objid ("3d07dd9b-6f6d-4a41-8eff-62d6a5d4646a")
        public static SmAttribute IsCollectionAtt() {
            if (IsCollectionAtt == null) {
            	IsCollectionAtt = classof().getAttributeDef("IsCollection");
            }
            return IsCollectionAtt;
        }

        @objid ("f8574a34-5447-4e71-832c-10127ae135f3")
        public static SmDependency StructureRefDep() {
            if (StructureRefDep == null) {
            	StructureRefDep = classof().getDependencyDef("StructureRef");
            }
            return StructureRefDep;
        }

        @objid ("78fe19a8-4bb2-4a1a-9d7b-bc97eb52eea9")
        public static SmDependency TypedMessageDep() {
            if (TypedMessageDep == null) {
            	TypedMessageDep = classof().getDependencyDef("TypedMessage");
            }
            return TypedMessageDep;
        }

        @objid ("b252c581-ff9a-4ff2-97c6-7e09bcf34c0f")
        public static SmDependency TypedItemDep() {
            if (TypedItemDep == null) {
            	TypedItemDep = classof().getDependencyDef("TypedItem");
            }
            return TypedItemDep;
        }

        @objid ("520240e9-58e5-4b9e-a01b-725287c93d3f")
        public static SmDependency TypedResourceParameterDep() {
            if (TypedResourceParameterDep == null) {
            	TypedResourceParameterDep = classof().getDependencyDef("TypedResourceParameter");
            }
            return TypedResourceParameterDep;
        }

        @objid ("1786bcd8-72c7-40e8-b7e2-d136f20f4c78")
        public static SmDependency getStructureRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StructureRefDep;
        }

        @objid ("c19fdfc0-2ea3-47f9-9996-3aac472e426a")
        public static SmDependency getTypedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedMessageDep;
        }

        @objid ("a0823fdb-9627-466c-a60a-8e13d3eeb27b")
        public static SmDependency getTypedResourceParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedResourceParameterDep;
        }

        @objid ("8af990f6-dba9-4441-8bc2-b9742b2b201d")
        public static SmDependency getTypedItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedItemDep;
        }

        @objid ("bf0367d0-80f5-4565-bbe7-17920461ecd9")
        public static SmAttribute getIsCollectionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCollectionAtt;
        }

        @objid ("cc9a14f7-496d-4413-ba2d-c432639798f5")
        public static SmAttribute getItemKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemKindAtt;
        }

        @objid ("4b184e2b-aab7-4c10-906e-d84de65465b3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00394090-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b1f4f13c-a035-4103-9813-827a155f9602")
            public ISmObjectData createData() {
                return new BpmnItemDefinitionData();
            }

            @objid ("4fa1f00c-a7e2-40a9-98c1-01718211ca75")
            public SmObjectImpl createImpl() {
                return new BpmnItemDefinitionImpl();
            }

        }

        @objid ("0039a198-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ItemKindSmAttribute extends SmAttribute {
            @objid ("bad0aa2b-8fe8-42f2-9f82-a56163a9f57d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mItemKind;
            }

            @objid ("c9024db4-d2df-4e0c-9c8b-f7d5fa9c3980")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mItemKind = value;
            }

        }

        @objid ("003ad428-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsCollectionSmAttribute extends SmAttribute {
            @objid ("3788c8c5-00e1-4814-a285-f2b9d4d49acf")
            public Object getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mIsCollection;
            }

            @objid ("26d88900-ebea-4572-b72c-3365194545d7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnItemDefinitionData) data).mIsCollection = value;
            }

        }

        @objid ("003b3b70-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StructureRefSmDependency extends SmSingleDependency {
            @objid ("f507c9b1-5887-4ad5-8790-adf056494542")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemDefinitionData) data).mStructureRef;
            }

            @objid ("66152903-9a77-4561-a3fc-8cc61e1d8f0b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemDefinitionData) data).mStructureRef = value;
            }

            @objid ("3a91e514-36a1-40c2-9a9a-f5b8661be35b")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemDefinitionRefsDep();
            }

        }

        @objid ("003bb0c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedMessageSmDependency extends SmMultipleDependency {
            @objid ("3c03b03d-0135-4fa9-8cba-a73acf839dda")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedMessage != null)? ((BpmnItemDefinitionData)data).mTypedMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("1e630ec0-40f7-4e74-9551-d0a8ea8db48d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedMessage = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedMessage;
            }

            @objid ("c4d31fd4-5ec5-4987-8a2c-498d933de1e0")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ItemRefDep();
            }

        }

        @objid ("003c1bc6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedItemSmDependency extends SmMultipleDependency {
            @objid ("f004be48-3c55-48f1-ab26-682c32e9082f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedItem != null)? ((BpmnItemDefinitionData)data).mTypedItem:SmMultipleDependency.EMPTY;
            }

            @objid ("9434ec72-d214-4b32-98f5-f466b7cd89a4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedItem = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedItem;
            }

            @objid ("0e7c54b4-9dfb-45fd-82e9-dd97a426d350")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.ItemSubjectRefDep();
            }

        }

        @objid ("003c80b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypedResourceParameterSmDependency extends SmMultipleDependency {
            @objid ("cf05c771-9877-4702-ac1a-704754ffae67")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemDefinitionData)data).mTypedResourceParameter != null)? ((BpmnItemDefinitionData)data).mTypedResourceParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("da8d84b4-9226-47e5-84d5-0556aa910023")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemDefinitionData) data).mTypedResourceParameter = new ArrayList<>(initialCapacity);
                return ((BpmnItemDefinitionData) data).mTypedResourceParameter;
            }

            @objid ("fe6c1a5e-f969-4bad-9bbe-a9024c6d5447")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.TypeDep();
            }

        }

    }

}
