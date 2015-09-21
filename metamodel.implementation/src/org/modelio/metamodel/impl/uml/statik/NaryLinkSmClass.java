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
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndSmClass;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("56a1be66-9aa3-4aee-a7a1-458bda97db4a")
public class NaryLinkSmClass extends ModelElementSmClass {
    @objid ("9f5d28bb-45f7-44d1-bc9d-044ce91d2c61")
    private SmDependency naryLinkEndDep;

    @objid ("f7b9dc53-cc47-4b57-8cdd-88365eb91afe")
    private SmDependency modelDep;

    @objid ("08f8fa62-8b67-416d-a7c6-7687afdc5830")
    private SmDependency realizedInformationFlowDep;

    @objid ("92ac2cd0-1f06-4f8e-b86c-be6396f0910b")
    private SmDependency sentDep;

    @objid ("cde85fcb-9d37-4f37-b67d-8dc0b9caec44")
    public NaryLinkSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("8a23de3c-3b04-4cca-af9b-c675656fb1b6")
    @Override
    public String getName() {
        return "NaryLink";
    }

    @objid ("be7eac86-294b-4517-a395-f16f7d592c23")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a24a7805-e561-4230-84e8-146ceb5c1927")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryLink.class;
    }

    @objid ("f094c3d3-ae7d-4991-86f6-c1f3063e83aa")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("68837782-df98-4925-b067-e29329f5d53c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1d6bd813-b650-4d71-aa96-1fe001b0ac8e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new NaryLinkObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.naryLinkEndDep = new NaryLinkEndSmDependency();
        this.naryLinkEndDep.init("NaryLinkEnd", this, metamodel.getMClass("NaryLinkEnd"), 0, -1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.naryLinkEndDep);
        
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("NaryAssociation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.modelDep);
        
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
        
        this.sentDep = new SentSmDependency();
        this.sentDep.init("Sent", this, metamodel.getMClass("CommunicationChannel"), 0, -1 );
        registerDependency(this.sentDep);
    }

    @objid ("0a578067-6801-47b9-aaf2-85addcfaf32c")
    public SmDependency getNaryLinkEndDep() {
        if (this.naryLinkEndDep == null) {
        	this.naryLinkEndDep = this.getDependencyDef("NaryLinkEnd");
        }
        return this.naryLinkEndDep;
    }

    @objid ("aec33c35-b252-4798-87e7-4223ff039851")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("2c5750a0-55c7-4386-8fd9-79a3b0a676a7")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("c9b4e877-2b90-4fb0-9a89-afcfc3fafeb8")
    public SmDependency getSentDep() {
        if (this.sentDep == null) {
        	this.sentDep = this.getDependencyDef("Sent");
        }
        return this.sentDep;
    }

    @objid ("c0b1a0a1-b7d4-4ec3-97e4-6131d5c79ff0")
    private static class NaryLinkObjectFactory implements ISmObjectFactory {
        @objid ("aa17ae02-374c-4fe8-bf71-c139a9002cbf")
        private NaryLinkSmClass smClass;

        @objid ("f8f573df-2228-4038-a352-16dd12253a51")
        public NaryLinkObjectFactory(NaryLinkSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2ab70732-78da-4ff6-bc01-034714244c2e")
        @Override
        public ISmObjectData createData() {
            return new NaryLinkData(this.smClass);
        }

        @objid ("16e92c6c-ddc4-49c9-9a8f-70e7e2b80a47")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryLinkImpl();
        }

    }

    @objid ("792a3da4-de65-4556-8086-1d6603818be4")
    public static class NaryLinkEndSmDependency extends SmMultipleDependency {
        @objid ("7277e75d-14d6-4888-94ca-3e274636cf1b")
        private SmDependency symetricDep;

        @objid ("7e410339-d3b6-4ae6-81d7-ea1a7e4b30cd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryLinkData)data).mNaryLinkEnd != null)? ((NaryLinkData)data).mNaryLinkEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("f650b0f1-47b8-4522-9e87-5820e33f6a14")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryLinkData) data).mNaryLinkEnd = values;
        }

        @objid ("cdf9d310-9297-4b59-b793-9c3420931f86")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkEndSmClass)this.getTarget()).getNaryLinkDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ac631ce8-6116-4fef-8eeb-2303900e7d68")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("92c8089e-8312-46d0-aa26-b6a82b9d8331")
        private SmDependency symetricDep;

        @objid ("bab40371-e4f5-40ae-a4ec-ac015cf04ab4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryLinkData) data).mModel;
        }

        @objid ("51d23e7a-5f1f-4d48-bc74-07bdd96c3dcf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryLinkData) data).mModel = value;
        }

        @objid ("e81480b6-384d-4c4c-ae60-6c545b6213c6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryAssociationSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e1aa8343-b1aa-43bf-ae30-bd6dc28a9c8f")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("9aea5766-34f4-487f-bb47-6d225e8a103c")
        private SmDependency symetricDep;

        @objid ("f157633d-b7a7-479d-9f83-1b0ff03f6c44")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryLinkData)data).mRealizedInformationFlow != null)? ((NaryLinkData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("9b71dcaf-57eb-42c9-a30b-beb67ee3e25c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryLinkData) data).mRealizedInformationFlow = values;
        }

        @objid ("65be9f4e-6fd2-4135-a6f0-944d608ad87d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingNaryLinkDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c33a4afd-a1f7-4db1-a14c-77649b372dad")
    public static class SentSmDependency extends SmMultipleDependency {
        @objid ("c36fe2ec-e42a-455c-a9b1-ecbf3d3577a1")
        private SmDependency symetricDep;

        @objid ("0dbb6c60-09f9-4a0e-b46d-b9a85609d484")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryLinkData)data).mSent != null)? ((NaryLinkData)data).mSent:SmMultipleDependency.EMPTY;
        }

        @objid ("97480af4-4375-4f6f-a8f0-2b2a7302f99a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryLinkData) data).mSent = values;
        }

        @objid ("16b482d5-2157-4c36-8809-3e69d19e7ad4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationChannelSmClass)this.getTarget()).getNaryChannelDep();
            }
            return this.symetricDep;
        }

    }

}
