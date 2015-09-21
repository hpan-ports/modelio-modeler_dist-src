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
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkSmClass;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceSmClass;
import org.modelio.metamodel.uml.statik.LinkEnd;
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

@objid ("707721c4-21c9-43f3-b94b-301e87a7913f")
public class LinkEndSmClass extends ModelElementSmClass {
    @objid ("8b20a531-0ae1-461f-a680-7f018087c4d9")
    private SmAttribute isOrderedAtt;

    @objid ("0d802f21-a61c-45ff-aa45-ab61141cf8ae")
    private SmAttribute isUniqueAtt;

    @objid ("5012b2b9-4a0a-417c-95b0-affb21ba22ce")
    private SmAttribute multiplicityMaxAtt;

    @objid ("429c76ed-e171-40e6-89a1-9e534d447a54")
    private SmAttribute multiplicityMinAtt;

    @objid ("59c095d7-b682-42ef-838b-5fc0edce988c")
    private SmDependency linkDep;

    @objid ("dca4623c-f303-4e76-bd43-b417626bf5d8")
    private SmDependency targetDep;

    @objid ("9e7bde97-ecee-4073-9f28-90929d926e25")
    private SmDependency oppositeOwnerDep;

    @objid ("3d14ea19-cad3-4146-8a1d-86e8a2963056")
    private SmDependency realizedInformationFlowDep;

    @objid ("a060e8fb-456a-47e0-bc3e-21376f20bc59")
    private SmDependency modelDep;

    @objid ("e6f05448-df8d-420a-a510-d5f275097170")
    private SmDependency consumerDep;

    @objid ("56aeb8b1-97a7-4d01-bd6e-db3dac2f183b")
    private SmDependency oppositeDep;

    @objid ("f5c39d4b-6467-4e62-a878-207c44459b50")
    private SmDependency sourceDep;

    @objid ("bc06b067-e049-4efa-aaaa-3fa566ae09d3")
    private SmDependency providerDep;

    @objid ("d5b59321-77eb-461d-87de-e2803fd47fbf")
    public LinkEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("863ee84e-5c38-451a-a5d1-6671e0f04303")
    @Override
    public String getName() {
        return "LinkEnd";
    }

    @objid ("66cdfba8-a18c-4c8e-bc8e-9a91415fa1a7")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1ba48ac1-fee0-4c15-9469-3b7221d99026")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return LinkEnd.class;
    }

    @objid ("05f53316-1b86-49bd-a8fc-4894098b34a4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a0611b63-b2e7-4b25-9a31-9b86b48868c5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ae3c301d-872f-4f17-9939-11a3d0463c11")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new LinkEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isOrderedAtt = new IsOrderedSmAttribute();
        this.isOrderedAtt.init("IsOrdered", this, Boolean.class );
        registerAttribute(this.isOrderedAtt);
        
        this.isUniqueAtt = new IsUniqueSmAttribute();
        this.isUniqueAtt.init("IsUnique", this, Boolean.class );
        registerAttribute(this.isUniqueAtt);
        
        this.multiplicityMaxAtt = new MultiplicityMaxSmAttribute();
        this.multiplicityMaxAtt.init("MultiplicityMax", this, String.class );
        registerAttribute(this.multiplicityMaxAtt);
        
        this.multiplicityMinAtt = new MultiplicityMinSmAttribute();
        this.multiplicityMinAtt.init("MultiplicityMin", this, String.class );
        registerAttribute(this.multiplicityMinAtt);
        
        
        // Initialize and register the SmDependency
        this.linkDep = new LinkSmDependency();
        this.linkDep.init("Link", this, metamodel.getMClass("Link"), 0, 1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.linkDep);
        
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("Instance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
        
        this.oppositeOwnerDep = new OppositeOwnerSmDependency();
        this.oppositeOwnerDep.init("OppositeOwner", this, metamodel.getMClass("LinkEnd"), 1, 1 );
        registerDependency(this.oppositeOwnerDep);
        
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
        
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("AssociationEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.modelDep);
        
        this.consumerDep = new ConsumerSmDependency();
        this.consumerDep.init("Consumer", this, metamodel.getMClass("RequiredInterface"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.consumerDep);
        
        this.oppositeDep = new OppositeSmDependency();
        this.oppositeDep.init("Opposite", this, metamodel.getMClass("LinkEnd"), 1, 1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.oppositeDep);
        
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("Instance"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceDep);
        
        this.providerDep = new ProviderSmDependency();
        this.providerDep.init("Provider", this, metamodel.getMClass("ProvidedInterface"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.providerDep);
    }

    @objid ("66ee2278-6342-4b19-ab49-5a76ff53fcfc")
    public SmAttribute getIsOrderedAtt() {
        if (this.isOrderedAtt == null) {
        	this.isOrderedAtt = this.getAttributeDef("IsOrdered");
        }
        return this.isOrderedAtt;
    }

    @objid ("65557e7f-ffef-4e1d-9735-fd836c77caf5")
    public SmAttribute getIsUniqueAtt() {
        if (this.isUniqueAtt == null) {
        	this.isUniqueAtt = this.getAttributeDef("IsUnique");
        }
        return this.isUniqueAtt;
    }

    @objid ("2f518cd2-cf36-4d52-9edf-a6c982ff4f14")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("b021e742-ac02-4e1f-8ef4-2e0a9f5ec4ea")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("d6a4717c-4323-46bf-b5c3-15f5282e30f0")
    public SmDependency getLinkDep() {
        if (this.linkDep == null) {
        	this.linkDep = this.getDependencyDef("Link");
        }
        return this.linkDep;
    }

    @objid ("137b999a-bf3c-4cf8-a77c-ece5bf7d942c")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("a9a522ee-9518-46ef-a8e8-c7ff02ec6e59")
    public SmDependency getOppositeOwnerDep() {
        if (this.oppositeOwnerDep == null) {
        	this.oppositeOwnerDep = this.getDependencyDef("OppositeOwner");
        }
        return this.oppositeOwnerDep;
    }

    @objid ("4802f968-ef14-484d-aa24-00a95868d9a2")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("f2de439e-b0c6-4829-a63a-5f62eb0f50db")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("7632eef8-fe83-4262-91a1-ba3c0857eff7")
    public SmDependency getConsumerDep() {
        if (this.consumerDep == null) {
        	this.consumerDep = this.getDependencyDef("Consumer");
        }
        return this.consumerDep;
    }

    @objid ("c2c31ca1-fafb-4d2c-9def-817565f55d21")
    public SmDependency getOppositeDep() {
        if (this.oppositeDep == null) {
        	this.oppositeDep = this.getDependencyDef("Opposite");
        }
        return this.oppositeDep;
    }

    @objid ("84ac15c0-3315-42a8-85b8-8dee9a45d39c")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("d2d0d0a6-4a47-48e3-93b2-4234e8a2d554")
    public SmDependency getProviderDep() {
        if (this.providerDep == null) {
        	this.providerDep = this.getDependencyDef("Provider");
        }
        return this.providerDep;
    }

    @objid ("9edc2734-cb64-4c8f-9081-e5d942f8a1cb")
    private static class LinkEndObjectFactory implements ISmObjectFactory {
        @objid ("f429f75b-c56b-4615-825a-5b9fc71c9217")
        private LinkEndSmClass smClass;

        @objid ("10bb123f-06fc-4eb2-abcb-c990052f8529")
        public LinkEndObjectFactory(LinkEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9a3df595-2271-4ddc-990c-b1ebfd62a74b")
        @Override
        public ISmObjectData createData() {
            return new LinkEndData(this.smClass);
        }

        @objid ("ff254692-102c-4822-94e8-72684c872cee")
        @Override
        public SmObjectImpl createImpl() {
            return new LinkEndImpl();
        }

    }

    @objid ("0c84a4c0-c80b-4fb7-af5b-6dbd8c02faa7")
    public static class IsOrderedSmAttribute extends SmAttribute {
        @objid ("27daebdd-7e3a-40f4-9461-e67d93a21841")
        public Object getValue(ISmObjectData data) {
            return ((LinkEndData) data).mIsOrdered;
        }

        @objid ("1f8787ee-c5aa-440c-b17b-4c1ccdbd7f80")
        public void setValue(ISmObjectData data, Object value) {
            ((LinkEndData) data).mIsOrdered = value;
        }

    }

    @objid ("febb9189-4128-4aad-a27d-d8cce9e82715")
    public static class IsUniqueSmAttribute extends SmAttribute {
        @objid ("0a91697c-ec77-4a40-8127-95ec8e743f20")
        public Object getValue(ISmObjectData data) {
            return ((LinkEndData) data).mIsUnique;
        }

        @objid ("ee26aedd-e3af-4316-b968-0d5e774be3dd")
        public void setValue(ISmObjectData data, Object value) {
            ((LinkEndData) data).mIsUnique = value;
        }

    }

    @objid ("e8d450de-3bc5-45b2-bcdb-6464da55cc92")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("eb58d8d3-f6fb-461d-ad48-3b7a21fecb2a")
        public Object getValue(ISmObjectData data) {
            return ((LinkEndData) data).mMultiplicityMax;
        }

        @objid ("08be66e5-dc8e-4ede-8ae1-326a16fe9710")
        public void setValue(ISmObjectData data, Object value) {
            ((LinkEndData) data).mMultiplicityMax = value;
        }

    }

    @objid ("fca520ff-1816-4d3b-8223-8ecf2c147b77")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("212c7b0c-4cbb-4cb8-b519-5c3eb0dcd876")
        public Object getValue(ISmObjectData data) {
            return ((LinkEndData) data).mMultiplicityMin;
        }

        @objid ("f27fd28e-9803-495e-829e-c7bd884b8d43")
        public void setValue(ISmObjectData data, Object value) {
            ((LinkEndData) data).mMultiplicityMin = value;
        }

    }

    @objid ("b70c35e9-4917-48b2-9699-c4cb603c6127")
    public static class LinkSmDependency extends SmSingleDependency {
        @objid ("babd825f-3eee-4a5d-bb79-6fd5d59b909c")
        private SmDependency symetricDep;

        @objid ("dd567f6e-556e-4fb8-b14a-42a629328b71")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mLink;
        }

        @objid ("7897c317-67f8-41c4-bce8-ead73d2944ab")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mLink = value;
        }

        @objid ("f2da598a-8ca9-4787-bc57-bc637e9f9bf6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkSmClass)this.getTarget()).getLinkEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b3656f92-9687-41b6-820a-de167c931a14")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("371f780f-39fa-42d8-b601-00557619ae11")
        private SmDependency symetricDep;

        @objid ("041826bd-e6cc-4e88-b517-76287cac8d72")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mTarget;
        }

        @objid ("77a57515-54c2-4aeb-84c9-2ad677ad74b8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mTarget = value;
        }

        @objid ("86da4734-c1b9-4464-a7ef-b49976703b2d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getTargetingEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c76782f3-2ce1-4c06-a7f6-48bf7597a906")
    public static class OppositeOwnerSmDependency extends SmSingleDependency {
        @objid ("a19e8c1d-d8b5-424c-bb3a-67c405d01f7b")
        private SmDependency symetricDep;

        @objid ("fdfea0dd-885d-4b7b-9e3e-c802e16a5aad")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mOppositeOwner;
        }

        @objid ("4e294417-1b7d-4740-aeb1-4e1ad24462a2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mOppositeOwner = value;
        }

        @objid ("d5b68812-fda2-406f-bbdb-e76da16fe835")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getOppositeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("81bb8699-6d2a-4859-b909-8a92f27efba5")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("bab512c8-3071-4e74-a371-1de971ab8903")
        private SmDependency symetricDep;

        @objid ("7d04c3bc-cc7d-45ae-8cc9-3ead3edb54fa")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((LinkEndData)data).mRealizedInformationFlow != null)? ((LinkEndData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("24b48885-9d74-424c-a128-6b1c69d97c80")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((LinkEndData) data).mRealizedInformationFlow = values;
        }

        @objid ("b95853a5-4cc5-414e-ab59-c3f8d8711c9e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingLinkDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b41a1949-869a-456a-8e01-5452bddc12d9")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("b0c50aa1-d5c1-459e-a018-b8da95367d6f")
        private SmDependency symetricDep;

        @objid ("7c4b7071-4f60-41e3-8c99-abebf53ea91a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mModel;
        }

        @objid ("92f7210c-9638-48f9-96a7-6bac455be9e2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mModel = value;
        }

        @objid ("bfb2618b-0702-4572-96cf-16f908f0389b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d3ce4a9a-4915-4acf-9b6f-eac1993320c9")
    public static class ConsumerSmDependency extends SmSingleDependency {
        @objid ("4e006892-7874-4d8d-a215-e91fc3bec694")
        private SmDependency symetricDep;

        @objid ("013a4cf3-19a6-4e13-adca-b7c71673e988")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mConsumer;
        }

        @objid ("16b5e4d6-9bc7-4809-9de6-f45fc8789ab7")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mConsumer = value;
        }

        @objid ("22001a76-865b-4d97-81b3-83862d6a2612")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequiredInterfaceSmClass)this.getTarget()).getProviderDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("150b5609-e333-4f8c-9790-3a525710d289")
    public static class OppositeSmDependency extends SmSingleDependency {
        @objid ("832f0a32-c876-4f05-9c9a-bfc2147c02ef")
        private SmDependency symetricDep;

        @objid ("f68ebe8f-9f67-465c-8b33-f21f7db7c750")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mOpposite;
        }

        @objid ("55152d04-e45b-402c-a77d-00f622e77365")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mOpposite = value;
        }

        @objid ("743091c5-d1e2-4d26-958f-977c2e52b000")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getOppositeOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("dba4329d-a003-4631-9f4e-865e674555ba")
    public static class SourceSmDependency extends SmSingleDependency {
        @objid ("11af1a0b-d8a6-40c5-924e-481347ce6c62")
        private SmDependency symetricDep;

        @objid ("166385bf-2930-4aa8-83cf-dd52b9b3f70f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mSource;
        }

        @objid ("24558b83-c012-4436-8470-3f9eb8045481")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mSource = value;
        }

        @objid ("df6bcdf0-7b66-4e25-a21c-141a22768b67")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getOwnedEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7a75fefb-3f80-40b7-a2d6-967509df1bcb")
    public static class ProviderSmDependency extends SmSingleDependency {
        @objid ("7b10a93c-31ca-4fd0-b886-e104b97c6409")
        private SmDependency symetricDep;

        @objid ("c5110de5-6ed0-47df-8a5b-09b8f35ebc65")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LinkEndData) data).mProvider;
        }

        @objid ("1baff894-ea7c-47c8-8f2e-6528f82c22c4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LinkEndData) data).mProvider = value;
        }

        @objid ("06c23b7c-b2ad-4d83-a4dc-3f1dfe499bb9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProvidedInterfaceSmClass)this.getTarget()).getConsumerDep();
            }
            return this.symetricDep;
        }

    }

}
