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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AttributeLinkData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.impl.uml.statik.InstanceImpl;
import org.modelio.metamodel.uml.statik.Instance;
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

@objid ("000dc94c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Instance.class, factory=InstanceData.Metadata.ObjectFactory.class)
public class InstanceData extends ModelElementData {
    @objid ("7ffab88b-e8a1-4a5c-a0ab-880e8da75403")
    @SmaMetaAttribute(metaName="IsConstant", type=Boolean.class, smAttributeClass=Metadata.IsConstantSmAttribute.class)
     Object mIsConstant = false;

    @objid ("73e8d36a-96df-484c-8a36-ade2c6b230ac")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("428aedc4-9c7a-46be-9b1c-c038d1c163bf")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("14f5d52a-c93b-4b52-895c-cf9426e02b4d")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("a274ff5e-117b-4b45-891f-3550df61cd87")
    @SmaMetaAssociation(metaName="RepresentedCommunicationNode", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedCommunicationNodeSmDependency.class)
     List<SmObjectImpl> mRepresentedCommunicationNode = null;

    @objid ("aaca41a3-c889-4e8a-be19-f8048e01bfe3")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("d14f1d3c-3212-44b2-a07d-f391c3ed6a0b")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("bae03fd0-6913-4d9c-ba1b-c0f4aee781c0")
    @SmaMetaAssociation(metaName="Base", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("dfe82f08-b8f9-4190-a163-5a2c43373bb1")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("02c90e49-dfd6-42b5-809f-0e8b38c5c5e2")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("ad7cbeca-9561-4967-94bc-8eb997ce6fc8")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("aa41814a-9483-4d4b-ab5b-593b0382ae58")
    @SmaMetaAssociation(metaName="RepresentedLifeLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedLifeLineSmDependency.class)
     List<SmObjectImpl> mRepresentedLifeLine = null;

    @objid ("91f19599-7388-413b-a7a6-7f8201bf2c04")
    @SmaMetaAssociation(metaName="Slot", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.SlotSmDependency.class, component = true)
     List<SmObjectImpl> mSlot = null;

    @objid ("8524eb76-e5ce-4d5c-868b-0ae638cb16b4")
    @SmaMetaAssociation(metaName="Part", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.PartSmDependency.class, component = true)
     List<SmObjectImpl> mPart = null;

    @objid ("fba82249-913a-45ca-a878-eecfd36a6e16")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("09804f08-62c8-49ec-869d-f31084d4e2af")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005abbd0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("69597bf5-8e9c-48b2-aeff-394cc21655b4")
        private static SmClass smClass = null;

        @objid ("2ae2469a-2bd4-411c-9c84-25e543ff0760")
        private static SmAttribute IsConstantAtt = null;

        @objid ("4650e1de-d6bf-4d8b-96ca-cf4bf85ffdbf")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("e34d03d1-c7df-4ba2-a1f1-f7127e6cd637")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("37804466-f986-4ea5-96fb-b31ad59d3614")
        private static SmAttribute ValueAtt = null;

        @objid ("c35f61b6-c49d-47c9-a991-fa524588f810")
        private static SmDependency RepresentedCommunicationNodeDep = null;

        @objid ("30fff0b5-4e13-4be6-85ee-a6dd6c0f5fb9")
        private static SmDependency RepresentingItemDep = null;

        @objid ("2312d6ea-1153-407c-bcdc-0850b55a19be")
        private static SmDependency OwnedEndDep = null;

        @objid ("56d7bec4-7d92-4933-9feb-f0cfa78822ca")
        private static SmDependency BaseDep = null;

        @objid ("2817ff3b-41f1-4097-bc78-71153772ef07")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("9d031ee6-49c0-4775-81fa-29913e3d4e01")
        private static SmDependency OwnerDep = null;

        @objid ("553ea343-11a4-45d2-ab5e-2583d300d35c")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("4d1964f2-c4e3-4b06-add4-7324a44532e7")
        private static SmDependency RepresentedLifeLineDep = null;

        @objid ("bef05d21-24e1-46c2-b551-abf9f35bcde9")
        private static SmDependency SlotDep = null;

        @objid ("7b4eff69-bab0-49f9-b6d5-13e92baea310")
        private static SmDependency PartDep = null;

        @objid ("f5c723ac-3ebf-4d8f-94f4-5f2d87ec998e")
        private static SmDependency TargetingEndDep = null;

        @objid ("1d7ad34e-2344-4b2d-bda2-a73491f90f45")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ec8f889f-bc31-41f7-b0de-4e8e497901c2")
        public static SmAttribute IsConstantAtt() {
            if (IsConstantAtt == null) {
            	IsConstantAtt = classof().getAttributeDef("IsConstant");
            }
            return IsConstantAtt;
        }

        @objid ("fd6e2130-5ded-43b3-bc64-97a318a03e76")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("38d4d5bf-165b-4021-9c7b-7b904319b050")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("17e6cc53-3024-4a69-868e-d61de8d35cec")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("6b81875e-7a8f-4dfd-935d-39c2887153b1")
        public static SmDependency RepresentedCommunicationNodeDep() {
            if (RepresentedCommunicationNodeDep == null) {
            	RepresentedCommunicationNodeDep = classof().getDependencyDef("RepresentedCommunicationNode");
            }
            return RepresentedCommunicationNodeDep;
        }

        @objid ("20fdd7d3-30e8-41ae-8c80-e71bcf9079e0")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("5227e9f6-8cee-4397-b365-66b6741d4ee9")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("044e3a68-742b-41df-b5b9-ccb0462fa7d4")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("fd41fa8b-f874-4842-88e7-fede4b3e57ba")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("dff3fd40-7430-40a8-a3d1-66f16ce3608b")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a8ee1e83-447d-4340-a1ac-00020b15f48f")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("7d1fbd12-6c22-4dae-beb4-37a0790d281f")
        public static SmDependency RepresentedLifeLineDep() {
            if (RepresentedLifeLineDep == null) {
            	RepresentedLifeLineDep = classof().getDependencyDef("RepresentedLifeLine");
            }
            return RepresentedLifeLineDep;
        }

        @objid ("b9867947-9d90-4064-aa0e-e417b66a6aad")
        public static SmDependency SlotDep() {
            if (SlotDep == null) {
            	SlotDep = classof().getDependencyDef("Slot");
            }
            return SlotDep;
        }

        @objid ("925668fc-f69b-4b4a-ba38-1bb51b685334")
        public static SmDependency PartDep() {
            if (PartDep == null) {
            	PartDep = classof().getDependencyDef("Part");
            }
            return PartDep;
        }

        @objid ("42f246d0-3457-4127-8e58-47101bc83e18")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("0b9e7370-1257-4397-829d-b3a89d5255a2")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("f0862688-63d3-4706-88b2-e6855f4e1d92")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("f531ae5a-ee7f-48ee-9eab-c4aad24ef983")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("d2765b0b-b7fe-469c-aade-81408e5509ff")
        public static SmDependency getRepresentedCommunicationNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedCommunicationNodeDep;
        }

        @objid ("1f709feb-a40d-4938-ab76-217f9ae2cfdd")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("0148e882-d18c-46ff-b748-b0b99acdda7a")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("57f99272-ab97-4be2-8499-be7cbe73ff72")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("4880215b-784e-4a61-a263-7d553bdb624b")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("27637b7e-0db4-424e-9cfc-ea9ccb899b95")
        public static SmDependency getSlotDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SlotDep;
        }

        @objid ("f5378914-ea4b-4263-bfea-8b103f1b8568")
        public static SmAttribute getIsConstantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConstantAtt;
        }

        @objid ("18e65564-a9a3-4899-a3cf-6a58eef70d23")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("123b304d-add1-4bd7-8061-281b366eceb5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("51f669b6-be3b-4c89-abaa-840cdeb0eff6")
        public static SmDependency getPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartDep;
        }

        @objid ("f65661c5-661a-4cef-aa34-76faf3b50ee6")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("e207e5b0-b807-4333-91ef-cbbcd4141713")
        public static SmDependency getRepresentedLifeLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedLifeLineDep;
        }

        @objid ("18065b17-b69f-4286-bae1-c4b5e77c7104")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("005afbfe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b5c67588-33a8-4224-b0dc-6a9e0f8e0572")
            public ISmObjectData createData() {
                return new InstanceData();
            }

            @objid ("64d353b6-4c27-46d7-9830-550e6eb3dc00")
            public SmObjectImpl createImpl() {
                return new InstanceImpl();
            }

        }

        @objid ("005b5d74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConstantSmAttribute extends SmAttribute {
            @objid ("af12cf70-f6d9-4dc8-8b3b-51d1c23ef149")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mIsConstant;
            }

            @objid ("f3527597-cfc7-47b0-8b41-e77976333f86")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mIsConstant = value;
            }

        }

        @objid ("005bc61a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("0da2bb0d-6567-45ad-a1c4-69b8888eeef8")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMin;
            }

            @objid ("be5d200a-e5eb-4256-8020-f2b5d83a5b5b")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMin = value;
            }

        }

        @objid ("005c2876-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("30ac48cb-755e-40e5-a8e8-70e23397033a")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMax;
            }

            @objid ("81856638-eb2b-4328-be66-2e8365a74ecc")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMax = value;
            }

        }

        @objid ("005c894c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("92119ec4-ac23-443e-aeac-5ac1c06ef9e0")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mValue;
            }

            @objid ("a70990c4-2a7c-4a89-b9eb-79bf417ea435")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mValue = value;
            }

        }

        @objid ("005cee5a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SlotSmDependency extends SmMultipleDependency {
            @objid ("4acdb5b0-5081-4f39-bacc-91f1786cbbfa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mSlot != null)? ((InstanceData)data).mSlot:SmMultipleDependency.EMPTY;
            }

            @objid ("dba87633-b5a5-423c-b965-69458631450a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mSlot = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mSlot;
            }

            @objid ("0320fbbe-b623-4986-8f7a-e5a74ae887f2")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.AttributedDep();
            }

        }

        @objid ("005db5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("d8f8f7f4-7a34-40ea-a065-95d871eaedfc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mBase;
            }

            @objid ("83008263-d599-4918-90f5-7c7360a6e2f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mBase = value;
            }

            @objid ("a733cda2-ac47-4e9e-8a8c-d0890df08903")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RepresentingDep();
            }

        }

        @objid ("005e2c48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("f842e8a6-e56f-44c2-9a23-084d362d63ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mOwner;
            }

            @objid ("026e6408-1841-4b9a-86ef-ccd4b1a6a786")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mOwner = value;
            }

            @objid ("a6d7b813-51ed-4d4b-9925-d185c5689b57")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.DeclaredDep();
            }

        }

        @objid ("005ea3da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartSmDependency extends SmMultipleDependency {
            @objid ("2862593f-838c-4747-ba39-7fb376d0b3df")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mPart != null)? ((InstanceData)data).mPart:SmMultipleDependency.EMPTY;
            }

            @objid ("dd0548c3-3d49-4e8d-ab40-80ad31775d4e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mPart = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mPart;
            }

            @objid ("6ce30bab-e58b-4f03-b944-69048212668d")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.ClusterDep();
            }

        }

        @objid ("005f099c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedLifeLineSmDependency extends SmMultipleDependency {
            @objid ("a877e144-e08c-4752-808d-261585a33a9b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedLifeLine != null)? ((InstanceData)data).mRepresentedLifeLine:SmMultipleDependency.EMPTY;
            }

            @objid ("d259d12f-13cb-471d-9179-feb177ffbf20")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedLifeLine = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedLifeLine;
            }

            @objid ("81321fdc-79aa-4ef8-b4c6-f0b41eb15795")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.RepresentedDep();
            }

        }

        @objid ("005f7120-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("e949373b-60fb-49b7-81f1-ad18a9c58893")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingObjectNode != null)? ((InstanceData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("4e9d77ee-2bc5-4ee5-89a2-51d15433de31")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingObjectNode;
            }

            @objid ("9a11ccc7-008e-4bee-ba1d-b0ffc5a656c6")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("005fd868-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedCommunicationNodeSmDependency extends SmMultipleDependency {
            @objid ("bcb89168-07a2-4960-9f7b-54664e4413d8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedCommunicationNode != null)? ((InstanceData)data).mRepresentedCommunicationNode:SmMultipleDependency.EMPTY;
            }

            @objid ("cb4ff21a-7052-4109-8991-309cfff5f612")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedCommunicationNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedCommunicationNode;
            }

            @objid ("71911b83-20c6-43ab-82d7-ec9d6174c28b")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("006043c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("e1800477-ca8a-414f-bc5a-301af10d700c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingItem != null)? ((InstanceData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("2f379947-0a48-48fd-8555-693934dfe71a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingItem;
            }

            @objid ("023ef302-0d26-40e1-99ce-c0e4983f4f29")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedInstanceDep();
            }

        }

        @objid ("00967792-18c8-1080-943a-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("96d1dba4-10da-42cb-9476-d8c89c6ecea2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedEnd != null)? ((InstanceData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("46660043-2983-45f0-b5be-a2287c9f447c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedEnd;
            }

            @objid ("cb9fb6ee-ff53-4d1a-b9ba-b1d4518df7fc")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.SourceDep();
            }

        }

        @objid ("0000eeca-18c9-1080-943a-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("61fbd5c4-bbd8-47ae-87d4-b0d45ee22119")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mTargetingEnd != null)? ((InstanceData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("aea73ccb-63ea-411b-aa79-ddf85dda57ac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mTargetingEnd;
            }

            @objid ("1381c4a0-86f0-4b93-9c27-8b793b13faa3")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.TargetDep();
            }

        }

        @objid ("0032b838-17f4-10a1-88a0-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("bcbd4b3a-40ad-4733-945e-52ac81c71cb3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedNaryEnd != null)? ((InstanceData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("0f5e833d-594a-45b9-b6aa-446c70fbee40")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedNaryEnd;
            }

            @objid ("2bef5b01-4855-4a9d-8554-9ff9695e6c72")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.SourceDep();
            }

        }

    }

}
