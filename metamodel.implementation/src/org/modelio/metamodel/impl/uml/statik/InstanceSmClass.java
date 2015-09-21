/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.AttributeLinkSmClass;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndSmClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d02f7ac8-f93a-44a1-acfd-0f9ced01cb4c")
public class InstanceSmClass extends ModelElementSmClass {
    @objid ("3daae60f-5c33-45e2-a105-22602fcbcc4c")
    private SmAttribute isConstantAtt;

    @objid ("a9b95253-3f68-4c73-90d0-3f02458b4dc7")
    private SmAttribute multiplicityMinAtt;

    @objid ("3c9daf83-4fb7-40df-9d33-2a50c18fa839")
    private SmAttribute multiplicityMaxAtt;

    @objid ("053214da-8965-46ac-a4f0-94b294f89215")
    private SmAttribute valueAtt;

    @objid ("3a23d01d-8c34-475f-a370-21e5011ac210")
    private SmDependency representedCommunicationNodeDep;

    @objid ("8be82689-d7a4-4ff5-92a5-9ef0d51dda88")
    private SmDependency representingItemDep;

    @objid ("31a4908c-dd42-4c50-abfa-5b362f518bc0")
    private SmDependency ownedEndDep;

    @objid ("7ab9265e-bdfe-4146-a70a-da0e9e35d8d6")
    private SmDependency baseDep;

    @objid ("913718a5-f3f9-480a-b447-3608f8ecc869")
    private SmDependency representingObjectNodeDep;

    @objid ("db7d31e4-9db9-432d-84be-58cfa3410c81")
    private SmDependency ownerDep;

    @objid ("d67e7536-b2f4-45b1-8313-21498565662a")
    private SmDependency ownedNaryEndDep;

    @objid ("6d32231d-c2c4-4fbf-9dd1-6f31d1296eef")
    private SmDependency representedLifeLineDep;

    @objid ("0f8c8ae8-a384-4f85-b576-5c5ef5f6785d")
    private SmDependency slotDep;

    @objid ("073db930-e953-4698-ac85-4246be78dffe")
    private SmDependency partDep;

    @objid ("be427570-a5a3-458d-a408-81ceb0d11208")
    private SmDependency targetingEndDep;

    @objid ("fede7d59-9576-4b4c-a1bb-8d8acb8b8033")
    public InstanceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("19ca5ca7-25bf-47c3-a367-8ebf04b97d8c")
    @Override
    public String getName() {
        return "Instance";
    }

    @objid ("5ad9deca-5508-4bda-affd-8ceaa5597179")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0e9e2ca5-1f9d-425f-ad14-e6045b8bd5c2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Instance.class;
    }

    @objid ("153e5c29-2704-4b0c-99c0-dfe574777c25")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b4d24055-9cfd-47a1-91ad-898040a540a6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5e7ea094-8b2e-49d5-a764-7771de0ea475")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new InstanceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isConstantAtt = new IsConstantSmAttribute();
        this.isConstantAtt.init("IsConstant", this, Boolean.class );
        registerAttribute(this.isConstantAtt);
        
        this.multiplicityMinAtt = new MultiplicityMinSmAttribute();
        this.multiplicityMinAtt.init("MultiplicityMin", this, String.class );
        registerAttribute(this.multiplicityMinAtt);
        
        this.multiplicityMaxAtt = new MultiplicityMaxSmAttribute();
        this.multiplicityMaxAtt.init("MultiplicityMax", this, String.class );
        registerAttribute(this.multiplicityMaxAtt);
        
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        
        // Initialize and register the SmDependency
        this.representedCommunicationNodeDep = new RepresentedCommunicationNodeSmDependency();
        this.representedCommunicationNodeDep.init("RepresentedCommunicationNode", this, metamodel.getMClass("CommunicationNode"), 0, -1 );
        registerDependency(this.representedCommunicationNodeDep);
        
        this.representingItemDep = new RepresentingItemSmDependency();
        this.representingItemDep.init("RepresentingItem", this, metamodel.getMClass("BpmnItemAwareElement"), 0, -1 );
        registerDependency(this.representingItemDep);
        
        this.ownedEndDep = new OwnedEndSmDependency();
        this.ownedEndDep.init("OwnedEnd", this, metamodel.getMClass("LinkEnd"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedEndDep);
        
        this.baseDep = new BaseSmDependency();
        this.baseDep.init("Base", this, metamodel.getMClass("NameSpace"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.baseDep);
        
        this.representingObjectNodeDep = new RepresentingObjectNodeSmDependency();
        this.representingObjectNodeDep.init("RepresentingObjectNode", this, metamodel.getMClass("ObjectNode"), 0, -1 );
        registerDependency(this.representingObjectNodeDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.ownedNaryEndDep = new OwnedNaryEndSmDependency();
        this.ownedNaryEndDep.init("OwnedNaryEnd", this, metamodel.getMClass("NaryLinkEnd"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedNaryEndDep);
        
        this.representedLifeLineDep = new RepresentedLifeLineSmDependency();
        this.representedLifeLineDep.init("RepresentedLifeLine", this, metamodel.getMClass("Lifeline"), 0, -1 );
        registerDependency(this.representedLifeLineDep);
        
        this.slotDep = new SlotSmDependency();
        this.slotDep.init("Slot", this, metamodel.getMClass("AttributeLink"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.slotDep);
        
        this.partDep = new PartSmDependency();
        this.partDep.init("Part", this, metamodel.getMClass("BindableInstance"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.partDep);
        
        this.targetingEndDep = new TargetingEndSmDependency();
        this.targetingEndDep.init("TargetingEnd", this, metamodel.getMClass("LinkEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.targetingEndDep);
    }

    @objid ("93cc60df-7624-49e0-a137-b4c123638819")
    public SmAttribute getIsConstantAtt() {
        if (this.isConstantAtt == null) {
        	this.isConstantAtt = this.getAttributeDef("IsConstant");
        }
        return this.isConstantAtt;
    }

    @objid ("878936da-e774-49c9-b73a-937efc7dfaf6")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("fb502fc8-1eb6-44aa-be4d-93dd1888574f")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("f659c57a-3b33-42cd-9027-042d305580e5")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("a23bac4b-33a0-46c5-b54f-f671f9551006")
    public SmDependency getRepresentedCommunicationNodeDep() {
        if (this.representedCommunicationNodeDep == null) {
        	this.representedCommunicationNodeDep = this.getDependencyDef("RepresentedCommunicationNode");
        }
        return this.representedCommunicationNodeDep;
    }

    @objid ("085a456b-3936-4e29-b723-951d9f064790")
    public SmDependency getRepresentingItemDep() {
        if (this.representingItemDep == null) {
        	this.representingItemDep = this.getDependencyDef("RepresentingItem");
        }
        return this.representingItemDep;
    }

    @objid ("e70fd402-cb52-4dc6-a624-3055b88ca40f")
    public SmDependency getOwnedEndDep() {
        if (this.ownedEndDep == null) {
        	this.ownedEndDep = this.getDependencyDef("OwnedEnd");
        }
        return this.ownedEndDep;
    }

    @objid ("cb840d1f-bf9d-450d-94dd-d1bed8c085f6")
    public SmDependency getBaseDep() {
        if (this.baseDep == null) {
        	this.baseDep = this.getDependencyDef("Base");
        }
        return this.baseDep;
    }

    @objid ("a37280c9-e6fc-4452-9e16-4befd770df68")
    public SmDependency getRepresentingObjectNodeDep() {
        if (this.representingObjectNodeDep == null) {
        	this.representingObjectNodeDep = this.getDependencyDef("RepresentingObjectNode");
        }
        return this.representingObjectNodeDep;
    }

    @objid ("4442dfbb-257f-4308-a3f2-9673a9b9fbb2")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("03949b77-a8c6-417f-a437-ac2cfaa772c4")
    public SmDependency getOwnedNaryEndDep() {
        if (this.ownedNaryEndDep == null) {
        	this.ownedNaryEndDep = this.getDependencyDef("OwnedNaryEnd");
        }
        return this.ownedNaryEndDep;
    }

    @objid ("b97a5fb0-0ad2-4639-91e4-909bbeedf874")
    public SmDependency getRepresentedLifeLineDep() {
        if (this.representedLifeLineDep == null) {
        	this.representedLifeLineDep = this.getDependencyDef("RepresentedLifeLine");
        }
        return this.representedLifeLineDep;
    }

    @objid ("5dc8c0b4-e511-47e6-9b8d-3abbcfd3fb9e")
    public SmDependency getSlotDep() {
        if (this.slotDep == null) {
        	this.slotDep = this.getDependencyDef("Slot");
        }
        return this.slotDep;
    }

    @objid ("09c2d080-7a51-440f-b9d5-cde4482ec35b")
    public SmDependency getPartDep() {
        if (this.partDep == null) {
        	this.partDep = this.getDependencyDef("Part");
        }
        return this.partDep;
    }

    @objid ("c910526b-1010-4bd2-a533-0e744cda51e9")
    public SmDependency getTargetingEndDep() {
        if (this.targetingEndDep == null) {
        	this.targetingEndDep = this.getDependencyDef("TargetingEnd");
        }
        return this.targetingEndDep;
    }

    @objid ("4fa75f70-e960-4911-8c64-9f051a73a88c")
    private static class InstanceObjectFactory implements ISmObjectFactory {
        @objid ("d55c329d-75eb-4148-9757-756d88b2fc10")
        private InstanceSmClass smClass;

        @objid ("a2f02bcd-4bb4-4a3c-9299-f2a23d9a8fee")
        public InstanceObjectFactory(InstanceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("afa7ea55-f7ac-42f3-9797-611aa7a279b2")
        @Override
        public ISmObjectData createData() {
            return new InstanceData(this.smClass);
        }

        @objid ("76adf522-a71b-4ef6-91ab-707e7c0f71d2")
        @Override
        public SmObjectImpl createImpl() {
            return new InstanceImpl();
        }

    }

    @objid ("d94cd305-cc8c-40b9-8f9d-172ea78449b1")
    public static class IsConstantSmAttribute extends SmAttribute {
        @objid ("29c645e3-0f42-447f-8764-772c446776f2")
        public Object getValue(ISmObjectData data) {
            return ((InstanceData) data).mIsConstant;
        }

        @objid ("e7bcebd3-8223-4fb1-b13e-c443543593fb")
        public void setValue(ISmObjectData data, Object value) {
            ((InstanceData) data).mIsConstant = value;
        }

    }

    @objid ("5faf8f9e-5dd7-4ae4-bae3-fbc42927fc4e")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("825ee654-0bf3-4ca0-bba6-b245d4564649")
        public Object getValue(ISmObjectData data) {
            return ((InstanceData) data).mMultiplicityMin;
        }

        @objid ("cde11bbd-030b-42c6-a658-af2af16c5d7d")
        public void setValue(ISmObjectData data, Object value) {
            ((InstanceData) data).mMultiplicityMin = value;
        }

    }

    @objid ("5dc81f53-ad6c-4d5a-92c6-0939bd8ddf71")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("98257ab0-76a6-42e8-a1bc-10178b1b2b58")
        public Object getValue(ISmObjectData data) {
            return ((InstanceData) data).mMultiplicityMax;
        }

        @objid ("50b8a350-aff5-48a0-b857-0a5f3af15939")
        public void setValue(ISmObjectData data, Object value) {
            ((InstanceData) data).mMultiplicityMax = value;
        }

    }

    @objid ("8429d3cb-0c16-4d20-a8e9-81ef88d1cef0")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("5cabbd79-041e-4df3-b99f-2f7821ce85f4")
        public Object getValue(ISmObjectData data) {
            return ((InstanceData) data).mValue;
        }

        @objid ("9ca9c66e-cfef-44f2-a505-c082cfd49567")
        public void setValue(ISmObjectData data, Object value) {
            ((InstanceData) data).mValue = value;
        }

    }

    @objid ("5d4602f7-e6bf-4cb3-89c1-b62b5ad7dc64")
    public static class RepresentedCommunicationNodeSmDependency extends SmMultipleDependency {
        @objid ("1373965d-a5ce-4b6a-b533-d3830d32a7a5")
        private SmDependency symetricDep;

        @objid ("1a8c3181-c94d-435a-9c23-9e3eb7071aa5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mRepresentedCommunicationNode != null)? ((InstanceData)data).mRepresentedCommunicationNode:SmMultipleDependency.EMPTY;
        }

        @objid ("fe581d5c-0211-45cf-9847-9c2ea805aa7e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mRepresentedCommunicationNode = values;
        }

        @objid ("9b79ac25-7da4-44b9-83fa-587f5b480ac9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationNodeSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e81c32a-b504-4e5e-8a23-530aeb75147f")
    public static class RepresentingItemSmDependency extends SmMultipleDependency {
        @objid ("7cd5dafb-0acd-4e77-b21f-72763fecf027")
        private SmDependency symetricDep;

        @objid ("32debb56-e870-47e1-b559-246ea7b2c9ba")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mRepresentingItem != null)? ((InstanceData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
        }

        @objid ("b850d9c3-9b41-4b16-bc57-96e08bec1047")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mRepresentingItem = values;
        }

        @objid ("d8004484-47dd-4ac3-a5d1-74dfb3a24239")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnItemAwareElementSmClass)this.getTarget()).getRepresentedInstanceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("678e3808-f94d-4b1f-9bce-ec5adac791b9")
    public static class OwnedEndSmDependency extends SmMultipleDependency {
        @objid ("b376f077-2fe1-4bd4-9c0d-638c4b444889")
        private SmDependency symetricDep;

        @objid ("6cd3bcf2-cee9-480c-b573-dcfd3f5992ac")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mOwnedEnd != null)? ((InstanceData)data).mOwnedEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("3473e046-c3ff-43c5-991c-806e3225e581")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mOwnedEnd = values;
        }

        @objid ("e1b9b1b7-f0e9-4fb8-889f-f94d40a92fed")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("08245a58-5c75-42cb-8a94-e2f16e3f45d2")
    public static class BaseSmDependency extends SmSingleDependency {
        @objid ("9f9ff274-70a5-43ba-aa62-4ac0b7925fcc")
        private SmDependency symetricDep;

        @objid ("b5b519aa-8a67-4bca-8283-bcbbeb0c34f2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InstanceData) data).mBase;
        }

        @objid ("088f2400-9123-440c-91ad-89cca60e2ec0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InstanceData) data).mBase = value;
        }

        @objid ("e4d5e000-f322-40bb-99ea-dd08332406a3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getRepresentingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4e593110-8f82-4941-9f4d-2eaef62d6b83")
    public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
        @objid ("8f6d85aa-0834-4fa4-a2ec-dd0ff7967f8e")
        private SmDependency symetricDep;

        @objid ("68ffe689-a42a-4a21-b5b8-e254636aca23")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mRepresentingObjectNode != null)? ((InstanceData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
        }

        @objid ("e6c3b9b0-1db7-43f3-8a7d-219072b46e81")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mRepresentingObjectNode = values;
        }

        @objid ("baa45335-e7e5-4dd4-a17d-52f9d877c553")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e4303ae-41d1-4cd2-91e1-1422de9693b4")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("689a70c0-7928-4164-a09f-4cc99c041f79")
        private SmDependency symetricDep;

        @objid ("dd8802e7-2f35-451e-8b96-a636c45496fe")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InstanceData) data).mOwner;
        }

        @objid ("6bf1f6ba-e0ac-4944-b1b2-d4337a9b83aa")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InstanceData) data).mOwner = value;
        }

        @objid ("5226da58-c8af-4483-b2ef-2bdf7c876a40")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getDeclaredDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("76826f78-be85-41ae-9011-7cb645cd1888")
    public static class OwnedNaryEndSmDependency extends SmMultipleDependency {
        @objid ("5192b6a8-929f-4cb5-8ebe-5967a0959469")
        private SmDependency symetricDep;

        @objid ("963e7bda-5d27-4a30-931b-f73d619f1be9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mOwnedNaryEnd != null)? ((InstanceData)data).mOwnedNaryEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("947e211d-e647-42db-a050-8cac95230725")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mOwnedNaryEnd = values;
        }

        @objid ("6d654547-7854-4196-86f6-ef614c1c0543")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkEndSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0061f473-8956-4e26-92c1-fbe07662bc6d")
    public static class RepresentedLifeLineSmDependency extends SmMultipleDependency {
        @objid ("9c203e82-f33c-4151-b111-7d9fd2ef1f0a")
        private SmDependency symetricDep;

        @objid ("ba19a4c2-25fe-4305-ba38-a111f37d7e88")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mRepresentedLifeLine != null)? ((InstanceData)data).mRepresentedLifeLine:SmMultipleDependency.EMPTY;
        }

        @objid ("07f8584c-81ae-41e2-b8bd-f3c35bf059fb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mRepresentedLifeLine = values;
        }

        @objid ("c8bf3c11-d128-40f7-85b3-67aee5336544")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LifelineSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1e715314-2598-4b29-be6b-b3490e5ea26b")
    public static class SlotSmDependency extends SmMultipleDependency {
        @objid ("979b0156-55e2-4194-8e57-246ad9413620")
        private SmDependency symetricDep;

        @objid ("a37649ac-3a6d-4f06-bb57-046bc93da482")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mSlot != null)? ((InstanceData)data).mSlot:SmMultipleDependency.EMPTY;
        }

        @objid ("79a1a30c-62bd-4885-b3f9-b6471109c8af")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mSlot = values;
        }

        @objid ("d47c1fbc-562d-47b4-8f79-9486deaa5801")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AttributeLinkSmClass)this.getTarget()).getAttributedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d55ee644-7b91-4799-852d-9872a8be64b5")
    public static class PartSmDependency extends SmMultipleDependency {
        @objid ("5cd4c307-9aca-4127-a99f-289ffa54ad5e")
        private SmDependency symetricDep;

        @objid ("dc02b909-b0cf-4203-9e2c-4cb3c5fbd608")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mPart != null)? ((InstanceData)data).mPart:SmMultipleDependency.EMPTY;
        }

        @objid ("883dc3d0-7ee9-41d2-ae60-de561898133e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mPart = values;
        }

        @objid ("31284578-b485-4c27-b803-9d09b464af42")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindableInstanceSmClass)this.getTarget()).getClusterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("48adc32a-2a09-4186-9c8f-08f9013970ce")
    public static class TargetingEndSmDependency extends SmMultipleDependency {
        @objid ("68e4c464-31d3-4a66-971e-33b2143d2e92")
        private SmDependency symetricDep;

        @objid ("891b342f-0dc1-4f5c-8778-7efc67bd3070")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InstanceData)data).mTargetingEnd != null)? ((InstanceData)data).mTargetingEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("adb6689e-b0d6-478d-be9e-cbf8c3024651")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InstanceData) data).mTargetingEnd = values;
        }

        @objid ("3f393098-5063-4720-af74-b4fbcff31036")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

}
