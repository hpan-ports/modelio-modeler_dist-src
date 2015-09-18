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
    @objid ("e958310d-bc9e-457b-8875-443dd9f31035")
    @SmaMetaAttribute(metaName="IsConstant", type=Boolean.class, smAttributeClass=Metadata.IsConstantSmAttribute.class)
     Object mIsConstant = false;

    @objid ("1962ab9d-b381-4dcc-98d2-a9adf4deb55d")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("941c5b1b-be1b-4e7a-9388-633b8b44b9eb")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("733439bb-c7b5-4af7-a5fd-260016a498ee")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("c9471235-1e0a-41d7-8760-f459b6e34ee7")
    @SmaMetaAssociation(metaName="RepresentedCommunicationNode", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedCommunicationNodeSmDependency.class)
     List<SmObjectImpl> mRepresentedCommunicationNode = null;

    @objid ("d513bf0d-22b7-4fc8-9edc-23160e15d50c")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("9e3919b2-dac0-4866-bf4e-1a646c5f81c0")
    @SmaMetaAssociation(metaName="OwnedEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("dc6b308b-eecb-41ae-9602-79283d8a5775")
    @SmaMetaAssociation(metaName="Base", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("bc254aad-00e1-4c34-95f3-d0481405a457")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("5cc28a0f-57b3-484f-addf-d7e476cba980")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("8d8538e8-b6f8-46da-84e7-5e5001d64836")
    @SmaMetaAssociation(metaName="OwnedNaryEnd", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedNaryEndSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("e28499b4-88a3-4ba0-9607-fc453735b8ad")
    @SmaMetaAssociation(metaName="RepresentedLifeLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedLifeLineSmDependency.class)
     List<SmObjectImpl> mRepresentedLifeLine = null;

    @objid ("15aa923d-5971-4748-b9d3-ec61daba6897")
    @SmaMetaAssociation(metaName="Slot", typeDataClass=AttributeLinkData.class, min=0, max=-1, smAssociationClass=Metadata.SlotSmDependency.class, component = true)
     List<SmObjectImpl> mSlot = null;

    @objid ("5103e38a-82fe-41c6-96fc-d7ef8f7ccd2d")
    @SmaMetaAssociation(metaName="Part", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.PartSmDependency.class, component = true)
     List<SmObjectImpl> mPart = null;

    @objid ("adf27e0c-3b32-40aa-8db4-dcab22eb4c52")
    @SmaMetaAssociation(metaName="TargetingEnd", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.TargetingEndSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("3bb7f756-49ee-4661-ac85-13c9003d1e67")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005abbd0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("653b2a65-c311-49af-a4db-9f5482c7b263")
        private static SmClass smClass = null;

        @objid ("3beffd6f-6d40-4f64-bcfb-77d004d78c7b")
        private static SmAttribute IsConstantAtt = null;

        @objid ("1183d7dd-e503-448e-a398-be9c09241f5b")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("4cc9f72f-6ed2-49e7-ae1f-4404bdd5f487")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("910177fd-5c06-425b-b71b-4f262a9f706b")
        private static SmAttribute ValueAtt = null;

        @objid ("396c54d9-97e3-4e74-a298-bb978be8e82d")
        private static SmDependency RepresentedCommunicationNodeDep = null;

        @objid ("dfe5e68a-f4f4-4386-9ecf-c9c19b3f5ec2")
        private static SmDependency RepresentingItemDep = null;

        @objid ("ecb8257f-40de-471a-9686-f73d604611e4")
        private static SmDependency OwnedEndDep = null;

        @objid ("d6b78524-f4d8-4665-9745-e3c94a27f636")
        private static SmDependency BaseDep = null;

        @objid ("93034870-9e69-4358-9383-5ecea090565e")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("5024ba05-abed-491e-8e72-469d49e619b7")
        private static SmDependency OwnerDep = null;

        @objid ("634ba479-de8a-47bd-bce5-e866d63df34f")
        private static SmDependency OwnedNaryEndDep = null;

        @objid ("28d6f5bb-4c85-4049-b6db-14e9c71bee86")
        private static SmDependency RepresentedLifeLineDep = null;

        @objid ("021cd456-6da7-4fbf-898d-14de46dbdb0c")
        private static SmDependency SlotDep = null;

        @objid ("18518bbb-740a-4e6f-949d-4de803515dd1")
        private static SmDependency PartDep = null;

        @objid ("9ba104a6-4ce3-44b2-988e-6df8e3ef7022")
        private static SmDependency TargetingEndDep = null;

        @objid ("faa95dcc-9c54-46df-a6a0-63d4e10dd23e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InstanceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e7a613f4-c5bd-4f6f-935c-61a931007177")
        public static SmAttribute IsConstantAtt() {
            if (IsConstantAtt == null) {
            	IsConstantAtt = classof().getAttributeDef("IsConstant");
            }
            return IsConstantAtt;
        }

        @objid ("90cf888b-a0b5-4bf0-89b1-c8e011e34d1e")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("4bfd814a-db7a-4509-b71c-c257615c0ef8")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("ec41c1fc-227c-4dfd-88a1-3fe4736f5de2")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("767e9d74-891f-45be-9fde-453407d8298a")
        public static SmDependency RepresentedCommunicationNodeDep() {
            if (RepresentedCommunicationNodeDep == null) {
            	RepresentedCommunicationNodeDep = classof().getDependencyDef("RepresentedCommunicationNode");
            }
            return RepresentedCommunicationNodeDep;
        }

        @objid ("d441392c-5c8d-4d67-b447-7784f14908be")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("9059a84e-2dc9-49d1-b061-743f181dc10a")
        public static SmDependency OwnedEndDep() {
            if (OwnedEndDep == null) {
            	OwnedEndDep = classof().getDependencyDef("OwnedEnd");
            }
            return OwnedEndDep;
        }

        @objid ("492bf332-d0bf-45c3-af5e-18c7ff605b8e")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("0397c678-d8d6-479f-9351-38e264dc7795")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("7650189e-059e-4117-a711-eac309cdafdc")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("3fc4f06d-890f-44d3-83a1-9ee134ec11aa")
        public static SmDependency OwnedNaryEndDep() {
            if (OwnedNaryEndDep == null) {
            	OwnedNaryEndDep = classof().getDependencyDef("OwnedNaryEnd");
            }
            return OwnedNaryEndDep;
        }

        @objid ("9facb1f6-9626-4dc4-880a-15719b8bd29b")
        public static SmDependency RepresentedLifeLineDep() {
            if (RepresentedLifeLineDep == null) {
            	RepresentedLifeLineDep = classof().getDependencyDef("RepresentedLifeLine");
            }
            return RepresentedLifeLineDep;
        }

        @objid ("8e085244-ac8b-4a64-bb25-c4204a8c9714")
        public static SmDependency SlotDep() {
            if (SlotDep == null) {
            	SlotDep = classof().getDependencyDef("Slot");
            }
            return SlotDep;
        }

        @objid ("07701e88-b520-45bc-84f8-848252df5acf")
        public static SmDependency PartDep() {
            if (PartDep == null) {
            	PartDep = classof().getDependencyDef("Part");
            }
            return PartDep;
        }

        @objid ("9c3b4214-b693-46b3-9da3-2bf38212878a")
        public static SmDependency TargetingEndDep() {
            if (TargetingEndDep == null) {
            	TargetingEndDep = classof().getDependencyDef("TargetingEnd");
            }
            return TargetingEndDep;
        }

        @objid ("b0b3ce79-a4aa-4344-ae6a-6a9fb35dce19")
        public static SmDependency getPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartDep;
        }

        @objid ("9552d36d-4562-460a-a20f-d33a1a23c4a1")
        public static SmDependency getTargetingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetingEndDep;
        }

        @objid ("57083d95-0628-44b8-8842-d946a2e51e16")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("f41d037c-e4b2-4d4d-8c41-a62b77758aab")
        public static SmDependency getOwnedNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedNaryEndDep;
        }

        @objid ("4f226414-1393-4458-886d-44591d03c76d")
        public static SmAttribute getIsConstantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConstantAtt;
        }

        @objid ("3849528d-1b98-49c9-95bd-3532cf9ca0b7")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("3a013b0e-52a9-42ac-9a13-3a5c157d0b0b")
        public static SmDependency getRepresentedLifeLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedLifeLineDep;
        }

        @objid ("02be99d9-bc9b-40d6-b9f1-b78b652c0841")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("62cfb5ad-4b49-4a46-8b7d-3a4667ecc938")
        public static SmDependency getOwnedEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedEndDep;
        }

        @objid ("f96407f6-efe7-45f4-aced-548dba39990a")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e752cd73-4d65-420f-bcc7-8cfcf7931c98")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("e3db68c6-b606-486c-9950-fc1ed8a66b64")
        public static SmDependency getRepresentedCommunicationNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedCommunicationNodeDep;
        }

        @objid ("9bae33ad-62d7-4881-89c1-b283b261d961")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("b9ab1865-2736-4a27-a7f1-4bd8c2b1965a")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("d55618a4-cf5b-41e6-84b6-292d668e65a6")
        public static SmDependency getSlotDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SlotDep;
        }

        @objid ("030de58c-df43-4e57-8657-9e1c3dfa625f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005afbfe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fa572d63-5e17-4792-8338-6c1f71e6288c")
            public ISmObjectData createData() {
                return new InstanceData();
            }

            @objid ("494bf117-ac69-427f-af5c-ee99a23ad408")
            public SmObjectImpl createImpl() {
                return new InstanceImpl();
            }

        }

        @objid ("005b5d74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConstantSmAttribute extends SmAttribute {
            @objid ("cc16c786-3050-498d-9308-70f2356ff05f")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mIsConstant;
            }

            @objid ("cf387553-52e2-4804-bffa-9f86b6b962e5")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mIsConstant = value;
            }

        }

        @objid ("005bc61a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("60833039-3722-4a1a-8315-a19d79ed366c")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMin;
            }

            @objid ("7682ed3e-fc7e-4ce5-b4ee-382d89b949b6")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMin = value;
            }

        }

        @objid ("005c2876-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("f39c62f5-fbe1-4dca-98ea-e7698845cfa8")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mMultiplicityMax;
            }

            @objid ("661aaa68-f00e-45c5-ba20-9d81bbb27a7c")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mMultiplicityMax = value;
            }

        }

        @objid ("005c894c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("58000d8e-c37c-411f-9248-f41e47e44d86")
            public Object getValue(ISmObjectData data) {
                return ((InstanceData) data).mValue;
            }

            @objid ("4151b2ef-1047-4688-a4ef-c6cf1886563e")
            public void setValue(ISmObjectData data, Object value) {
                ((InstanceData) data).mValue = value;
            }

        }

        @objid ("005cee5a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SlotSmDependency extends SmMultipleDependency {
            @objid ("f41082ea-a07b-49fd-90b2-9d858bd6451b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mSlot != null)? ((InstanceData)data).mSlot:SmMultipleDependency.EMPTY;
            }

            @objid ("c33033d7-7ec5-4ea7-9e10-5d9ba4bfd6d8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mSlot = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mSlot;
            }

            @objid ("ad35721a-db2c-4042-9b0a-9f0a34d4cfcc")
            @Override
            public SmDependency getSymetric() {
                return AttributeLinkData.Metadata.AttributedDep();
            }

        }

        @objid ("005db5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("3aeafbc7-c2cc-4b4b-af2b-dc8777dc1941")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mBase;
            }

            @objid ("7b343a02-5019-4017-a07d-52afe0826994")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mBase = value;
            }

            @objid ("157b2390-d282-4266-a410-80fa179b92c3")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RepresentingDep();
            }

        }

        @objid ("005e2c48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("18fbd9f1-9122-46f8-9b11-f70970b07a4f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InstanceData) data).mOwner;
            }

            @objid ("dd0bf5a6-1e62-426d-ade9-614e6579eba0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InstanceData) data).mOwner = value;
            }

            @objid ("8e84a0a6-6123-4eee-8b57-06a507ed2cac")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.DeclaredDep();
            }

        }

        @objid ("005ea3da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartSmDependency extends SmMultipleDependency {
            @objid ("876699b3-2933-4309-8e49-1b0cefbe0f1e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mPart != null)? ((InstanceData)data).mPart:SmMultipleDependency.EMPTY;
            }

            @objid ("29d93daf-a510-4aaa-866f-7459ed212294")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mPart = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mPart;
            }

            @objid ("98d524e7-51b2-48a1-aa47-805fcd3c1a9e")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.ClusterDep();
            }

        }

        @objid ("005f099c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedLifeLineSmDependency extends SmMultipleDependency {
            @objid ("d86d56c8-dce0-4e79-a962-ea11024e8d47")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedLifeLine != null)? ((InstanceData)data).mRepresentedLifeLine:SmMultipleDependency.EMPTY;
            }

            @objid ("92334227-b400-45de-a679-a117cbea29cc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedLifeLine = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedLifeLine;
            }

            @objid ("ed5ccb16-2b1c-40fc-9e31-ecc7378e3aab")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.RepresentedDep();
            }

        }

        @objid ("005f7120-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("0b76c291-692a-49b3-a2ea-3ce9b5602596")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingObjectNode != null)? ((InstanceData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("3cbefbb1-bee3-4764-8d2d-d6c6c438f071")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingObjectNode;
            }

            @objid ("165a61fd-469e-471d-99a2-b729ce04da20")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("005fd868-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentedCommunicationNodeSmDependency extends SmMultipleDependency {
            @objid ("2c84aacc-24ca-4eb2-be63-76f6da7313fa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentedCommunicationNode != null)? ((InstanceData)data).mRepresentedCommunicationNode:SmMultipleDependency.EMPTY;
            }

            @objid ("816f09ef-2e45-4b62-8594-122c8b863e56")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentedCommunicationNode = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentedCommunicationNode;
            }

            @objid ("b8e1aa2a-b240-43a5-9ee2-0e5cbd5de7b6")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.RepresentedDep();
            }

        }

        @objid ("006043c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("a767ddd4-e28f-4106-85a1-9566db931f1f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mRepresentingItem != null)? ((InstanceData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("2d5f6525-00ca-49ef-8b1e-8fa30732c495")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mRepresentingItem;
            }

            @objid ("d3a4b92c-0ee0-406a-aea4-aef414bb9082")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedInstanceDep();
            }

        }

        @objid ("00967792-18c8-1080-943a-001ec947cd2a")
        public static class OwnedEndSmDependency extends SmMultipleDependency {
            @objid ("7b420559-004b-415c-a8f2-981344a44664")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedEnd != null)? ((InstanceData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("99c3d7c1-e6ae-4634-92bd-5a57f0250b3b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedEnd;
            }

            @objid ("245e79d6-a96c-44b3-b60a-3e09e84a268f")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.SourceDep();
            }

        }

        @objid ("0000eeca-18c9-1080-943a-001ec947cd2a")
        public static class TargetingEndSmDependency extends SmMultipleDependency {
            @objid ("29b63d0f-5cab-4b22-a6c2-5669d3974b14")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mTargetingEnd != null)? ((InstanceData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("d604bd4d-d69e-4f21-ad80-d989e8f79655")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mTargetingEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mTargetingEnd;
            }

            @objid ("8f2f2c8e-f72f-4b23-9877-0c41f9775b6f")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.TargetDep();
            }

        }

        @objid ("0032b838-17f4-10a1-88a0-001ec947cd2a")
        public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
            @objid ("3bd1f0ba-ab68-4830-951d-189869a673bb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InstanceData)data).mOwnedNaryEnd != null)? ((InstanceData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("39beb804-de78-46c5-83f9-2892631c3d8b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InstanceData) data).mOwnedNaryEnd = new ArrayList<>(initialCapacity);
                return ((InstanceData) data).mOwnedNaryEnd;
            }

            @objid ("3b9abf75-6aa3-46d2-b838-1aba210ab3b7")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.SourceDep();
            }

        }

    }

}
