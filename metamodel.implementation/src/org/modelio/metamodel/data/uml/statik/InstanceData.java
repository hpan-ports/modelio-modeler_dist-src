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
    @objid ("3fdf87c5-df7d-4b43-bc75-852fcfc30338")
    @SmaMetaAttribute(metaName="IsConstant", type=Boolean.class, smAttributeClass=Metadata.IsConstantSmAttribute.class)
     Object mIsConstant = false;

    @objid ("c5901ce5-9430-4389-8876-58928996fe35")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("56addcdc-2524-4fbb-8f3e-4cc8290a51cb")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("ddcacb97-4ec9-418d-9eaa-20fe86bd228b")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("1e3fac1a-bf19-4449-a1b3-2a0617f3a421")
    @SmaMetaAssociation(metaName="RepresentedCommunicationNode", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedCommunicationNodeSmDependency.class)
     List<SmObjectImpl> mRepresentedCommunicationNode = null;

    @objid ("55952d94-2731-4bf4-91eb-1b6bdc23e9c5")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("06e45066-c9aa-40a9-b3ba-62abd5b1ae1e")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("7c97f34c-04ad-4d0f-acce-695f4cf40e20")
    @SmaMetaAssociation(metaName="Base", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("6cbd3be7-33a9-4b05-be34-481d21164f85")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("753267a2-629e-4c4a-bed1-32f9245ce11b")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("d2026eea-6e4e-4735-acd0-bd1b13611396")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("9a870d05-56a0-4552-9826-1d9b179c7e80")
    @SmaMetaAssociation(metaName="RepresentedLifeLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedLifeLineSmDependency.class)
     List<SmObjectImpl> mRepresentedLifeLine = null;

    @objid ("9ec68a2f-b65c-4040-98d3-93b3ebbec1b9")
    @SmaMetaAssociation(metaName="Slot", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.SlotSmDependency.class, component = true)
     List<SmObjectImpl> mSlot = null;

    @objid ("839668e2-dbcf-46ee-882a-1179d0697f27")
    @SmaMetaAssociation(metaName="Part", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.PartSmDependency.class, component = true)
     List<SmObjectImpl> mPart = null;

    @objid ("fee6436f-cd49-43f7-9e97-7515c57db161")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("4c2decbd-6162-4e81-b15a-081128dd47f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005abbd0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("604cf17d-6f1f-4495-8ecf-9ad5c6e66dde")
        private static SmClass smClass = null;

        @objid ("b46b6f1f-833c-415d-98ce-703ceb6a1dfd")
        private static SmAttribute IsConstantAtt = null;

        @objid ("abcdc726-4764-4782-b5f4-df232aabd9e8")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("dce40890-e10e-4e97-bab8-0702bd9936e9")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("424b2d40-5646-4640-bb2e-5d8f0fede358")
        private static SmAttribute ValueAtt = null;

        @objid ("a7877303-b402-4681-9e27-b42c1e2b8ec0")
        private static SmDependency RepresentedCommunicationNodeDep = null;

        @objid ("7eba8a49-5256-4db7-a739-6f97b931a7db")
        private static SmDependency RepresentingItemDep = null;

        @objid ("d296c18b-c454-4d3b-b0f8-8d74c7b2d2d8")
        private static SmDependency OwnedEndDep = null;

        @objid ("5c3e4ae3-46de-4136-9a27-cb68650fc232")
        private static SmDependency BaseDep = null;

        @objid ("55c3090c-69a7-442d-a6b8-9cbb6e232372")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("549c48db-5eb7-414c-a70a-dca13aef689c")
        private static SmDependency OwnerDep = null;

        @objid ("8d97d5d5-c041-4ea8-b107-32933691102e")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("58481bd9-3ed5-45b6-8d94-653b2477dac8")
        private static SmDependency RepresentedLifeLineDep = null;

        @objid ("a24d2b62-7226-4f6d-8c65-dfbbffc93b56")
        private static SmDependency SlotDep = null;

        @objid ("91ef68a4-25ea-4ad6-95c2-b5918e593825")
        private static SmDependency PartDep = null;

        @objid ("ca8c38d3-0cc8-4e0a-854a-0dd3cf71d8d4")
        private static SmDependency TargetingEndDep = null;

        @objid ("dfb61b97-bc50-4602-8deb-ebbe2956f434")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("793d92ba-7a2b-4a41-9038-67747092d985")
        public static SmAttribute IsConstantAtt() {
            if (IsConstantAtt == null) {
            	IsConstantAtt = classof().getAttributeDef("IsConstant");
            }
            return IsConstantAtt;
        }

        @objid ("e0308cae-ed1b-487a-b362-8b0d717c1ea3")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("4b4ec360-2852-43a4-89dd-48c4cf88e126")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("9efb08ab-47cf-473a-9e10-54dae260c301")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("3ddf5e30-6aef-4e58-854f-568d2574acee")
        public static SmDependency RepresentedCommunicationNodeDep() {
            if (RepresentedCommunicationNodeDep == null) {
            	RepresentedCommunicationNodeDep = classof().getDependencyDef("RepresentedCommunicationNode");
            }
            return RepresentedCommunicationNodeDep;
        }

        @objid ("48fc1ceb-254b-40a7-90e0-44ad4f0f93bd")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("96c22c7f-7e51-43e4-9a07-437019ea3930")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("b8fdc4e2-a71f-4abe-8c7a-8c493bb6798a")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("3a8560b0-cf2c-4272-a45c-09f3d45074d6")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("34e184a6-8e6e-49e4-bbb4-edc96cb6086b")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("6c4b1008-e2c6-4dda-8b01-c765933c6fb5")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("783a6236-b559-48ee-9aaa-0515f08b7f4f")
        public static SmDependency RepresentedLifeLineDep() {
            if (RepresentedLifeLineDep == null) {
            	RepresentedLifeLineDep = classof().getDependencyDef("RepresentedLifeLine");
            }
            return RepresentedLifeLineDep;
        }

        @objid ("0f947ac9-0cb7-41f4-9b71-023e542d51f9")
        public static SmDependency SlotDep() {
            if (SlotDep == null) {
            	SlotDep = classof().getDependencyDef("Slot");
            }
            return SlotDep;
        }

        @objid ("739361e7-ea3e-4c68-9f35-714d4acb5136")
        public static SmDependency PartDep() {
            if (PartDep == null) {
            	PartDep = classof().getDependencyDef("Part");
            }
            return PartDep;
        }

        @objid ("57c73c43-bf87-45c8-a287-179544aea3f6")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("7035ba4d-cf6f-4972-9644-75f79f97f345")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("649e8173-6691-46a7-918b-1228c4e9f376")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("ac3b28cc-a48c-4201-bed1-004a4619680f")
        public static SmAttribute getIsConstantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConstantAtt;
        }

        @objid ("143d5c76-a85d-4bc2-b81e-cc07f18d23ac")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3d129ca5-795e-4b29-85bd-a489773b1e25")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("abb7bde0-e128-40b7-b790-5ebc33c8a148")
        public static SmDependency getPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartDep;
        }

        @objid ("1c6a83b3-f3ab-48b1-8534-fde0586949c7")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("693e0c02-be77-40eb-ba0e-61341bc89512")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("5f01bcc6-37d1-4b05-bfd1-d688495aaad2")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("29d1115d-f565-46eb-a4d8-79aa5c433a3f")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("03a175a1-c559-4f0c-bb4f-4a3f3161b8b2")
        public static SmDependency getRepresentedLifeLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedLifeLineDep;
        }

        @objid ("ad50ecdf-c6cd-4a92-a37d-6626312dfb93")
        public static SmDependency getRepresentedCommunicationNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedCommunicationNodeDep;
        }

        @objid ("0ae2c6cd-6652-4abb-a8f7-36e4ef98457e")
        public static SmDependency getSlotDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SlotDep;
        }

        @objid ("bba6fba0-8039-4fa1-8ab9-d93c4ab6b2cd")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("aa50b722-b3e1-4c25-821f-e940fc955ec6")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("37015504-a9fa-4999-ab61-861d794f3f02")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("005afbfe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2e87e083-27d7-41ad-afa2-43205996ab95")
            public ISmObjectData createData() {
                return new InstanceData();
            }

            @objid ("3705f3f3-e152-4832-adec-32e8ab44868c")
            public SmObjectImpl createImpl() {
                return new InstanceImpl();
            }

        }

        @objid ("005b5d74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConstantSmAttribute extends SmAttribute {
            @objid ("11c26067-594f-4e5d-a474-beefbf463365")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mIsConstant;
            }

            @objid ("dc4337a6-32a3-4c84-b57e-21fccbe92d13")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mIsConstant = value;
            }

        }

        @objid ("005bc61a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("96f121c0-be14-447b-b456-ef64c1e68f89")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMin;
            }

            @objid ("27146efd-ba6a-46c2-ae28-a5a30b3f4663")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMin = value;
            }

        }

        @objid ("005c2876-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("67677506-ea43-444a-a6f5-2a5f3cc470fa")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMax;
            }

            @objid ("fa3aafc6-3e05-4fca-bfe1-80e3a8309dab")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMax = value;
            }

        }

        @objid ("005c894c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("9b331698-004e-455b-861b-42aa5a141eb1")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mValue;
            }

            @objid ("aff1070c-9060-4d3c-8457-c0730b6bdf11")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mValue = value;
            }

        }

        @objid ("005cee5a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SlotSmDependency extends SmMultipleDependency {
            @objid ("bd5d5f30-acf8-4fc1-8cd3-9f0321001641")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mSlot != null)? ((InstanceData)data).mSlot:SmMultipleDependency.EMPTY;
            }

            @objid ("a5a43885-7222-4558-a35a-90518b20015f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mSlot = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mSlot;
            }

            @objid ("dae6aabe-9124-49ba-85fc-fcd3880cddcd")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.AttributedDep();
            }

        }

        @objid ("005db5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("ced627d6-e27c-4c30-9f0e-1e6d56d32163")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mBase;
            }

            @objid ("0ca6c2e2-4ffe-47a2-92eb-61590218aaff")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mBase = value;
            }

            @objid ("5ae77875-8092-4f93-9e4b-641e07dce79b")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RepresentingDep();
            }

        }

        @objid ("005e2c48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a44acc70-b46d-449e-b0e8-ba4cfed06f96")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mOwner;
            }

            @objid ("05dbb90b-c43f-4151-9700-3e00cb8e4063")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mOwner = value;
            }

            @objid ("9179ad4b-109e-43a5-8ec1-16a9f9a0e46e")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.DeclaredDep();
            }

        }

        @objid ("005ea3da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartSmDependency extends SmMultipleDependency {
            @objid ("f585d47b-80f4-4823-a964-4f530bd8d4bc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mPart != null)? ((InstanceData)data).mPart:SmMultipleDependency.EMPTY;
            }

            @objid ("38c18120-6faf-4003-92a6-487c4a9e9a3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mPart = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mPart;
            }

            @objid ("20ecf3c1-cf7c-427e-87ad-b292c05ffc14")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.ClusterDep();
            }

        }

        @objid ("005f099c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedLifeLineSmDependency extends SmMultipleDependency {
            @objid ("431abada-0209-4ac6-8405-54175eb13dda")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedLifeLine != null)? ((InstanceData)data).mRepresentedLifeLine:SmMultipleDependency.EMPTY;
            }

            @objid ("89317593-a50c-42f4-9c5d-c9ae1abcc846")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedLifeLine = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedLifeLine;
            }

            @objid ("adb96edd-5822-45d5-a999-f1294ab9ece9")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.RepresentedDep();
            }

        }

        @objid ("005f7120-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("8a58c260-8365-4cbf-81de-a2dcafb457a9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingObjectNode != null)? ((InstanceData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("871def92-c764-4881-8784-fa8f9f083710")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingObjectNode;
            }

            @objid ("c2d26e49-a3a2-422f-bbab-17fb7a387298")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("005fd868-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedCommunicationNodeSmDependency extends SmMultipleDependency {
            @objid ("816349de-ae86-4c62-ae90-27fe376da21e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedCommunicationNode != null)? ((InstanceData)data).mRepresentedCommunicationNode:SmMultipleDependency.EMPTY;
            }

            @objid ("3b4ead99-309f-4044-8e6d-cf5bada354d9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedCommunicationNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedCommunicationNode;
            }

            @objid ("0aba04b5-1578-4f1b-98bc-69cf71998d14")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("006043c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("aa0b46bb-d466-4e65-b85f-74466394112e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingItem != null)? ((InstanceData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("c144bba1-e240-454b-a9f5-64cf19b0ff07")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingItem;
            }

            @objid ("fc351c08-ac9f-407d-b204-87b13fc35580")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedInstanceDep();
            }

        }

        @objid ("00967792-18c8-1080-943a-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("c9f57b7e-6aea-48e9-805b-774d8e7a4a90")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedEnd != null)? ((InstanceData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("a1beab29-1ba3-4797-86da-a24fa5b13927")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedEnd;
            }

            @objid ("3f7a026b-7802-4a44-94f3-aba61e2bee37")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.SourceDep();
            }

        }

        @objid ("0000eeca-18c9-1080-943a-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("46898d21-c71c-47a6-9b4f-30856ad2539b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mTargetingEnd != null)? ((InstanceData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("68112905-c808-4f77-98eb-1c3e1a993a35")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mTargetingEnd;
            }

            @objid ("d5c6ab90-3dd3-4ffe-a4db-13938941eda0")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.TargetDep();
            }

        }

        @objid ("0032b838-17f4-10a1-88a0-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("b2b67200-8a6d-46bd-b0b1-3c2161659cab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedNaryEnd != null)? ((InstanceData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("869a756c-d2a3-475f-ba2d-ac27b1837e93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedNaryEnd;
            }

            @objid ("43320008-f6d6-4716-b0a3-365aa6bc4c71")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.SourceDep();
            }

        }

    }

}
