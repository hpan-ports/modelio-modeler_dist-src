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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkSmClass;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceSmClass;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a91d81a7-d547-490d-82a6-9d566149073e")
public class NaryLinkEndSmClass extends ModelElementSmClass {
    @objid ("b059162d-34bd-4f18-b40f-852210f989d1")
    private SmAttribute isOrderedAtt;

    @objid ("623bfff9-d8ba-43c0-b783-db35695e3c63")
    private SmAttribute isUniqueAtt;

    @objid ("1f84cc4e-6b8f-466a-91ba-8f396eb17be8")
    private SmAttribute multiplicityMaxAtt;

    @objid ("127143d7-fb07-45cb-b4fb-b1ab93b64472")
    private SmAttribute multiplicityMinAtt;

    @objid ("407e5ad4-10ff-4795-ab67-1ddfb4753386")
    private SmDependency sourceDep;

    @objid ("982b1233-f0c9-46b6-86e0-4a4294f109df")
    private SmDependency naryLinkDep;

    @objid ("2b9a5aee-7536-40a7-b835-dc6181580c64")
    private SmDependency consumerDep;

    @objid ("43be2682-b125-4437-a227-9dfd78c7660f")
    private SmDependency providerDep;

    @objid ("3ffa5bfe-5bd0-4015-8443-e2303304a196")
    public NaryLinkEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("888e27f3-5049-4e0d-baf0-ea62a10f35df")
    @Override
    public String getName() {
        return "NaryLinkEnd";
    }

    @objid ("6d6b3c54-cabb-4d88-955b-c25526aae79c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7d1b49bf-d59d-4f82-ba5a-8d505b37272e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryLinkEnd.class;
    }

    @objid ("c37775a9-8b45-4a60-bdb2-430f837180a8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("63fe0e2e-77e6-4106-b9cf-5bc0f2da21b9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("48d9f3f1-a84f-4501-bfe3-b73be34a8b7f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new NaryLinkEndObjectFactory(this));
        
        
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
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("Instance"), 1, 1 );
        registerDependency(this.sourceDep);
        
        this.naryLinkDep = new NaryLinkSmDependency();
        this.naryLinkDep.init("NaryLink", this, metamodel.getMClass("NaryLink"), 0, 1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.naryLinkDep);
        
        this.consumerDep = new ConsumerSmDependency();
        this.consumerDep.init("Consumer", this, metamodel.getMClass("RequiredInterface"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.consumerDep);
        
        this.providerDep = new ProviderSmDependency();
        this.providerDep.init("Provider", this, metamodel.getMClass("ProvidedInterface"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.providerDep);
    }

    @objid ("114f784b-ecf6-427a-adda-57469f294051")
    public SmAttribute getIsOrderedAtt() {
        if (this.isOrderedAtt == null) {
        	this.isOrderedAtt = this.getAttributeDef("IsOrdered");
        }
        return this.isOrderedAtt;
    }

    @objid ("e700330b-9916-4751-9d0a-dfc33d70a174")
    public SmAttribute getIsUniqueAtt() {
        if (this.isUniqueAtt == null) {
        	this.isUniqueAtt = this.getAttributeDef("IsUnique");
        }
        return this.isUniqueAtt;
    }

    @objid ("8fb45976-69f0-451d-821b-cac526124fe9")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("4eba913e-6434-428e-9ad4-275edef8536a")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("19a09688-946c-4d33-9a78-9fc02f5a21ae")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("25203ee1-fb67-4486-aaf8-2c106a3a177e")
    public SmDependency getNaryLinkDep() {
        if (this.naryLinkDep == null) {
        	this.naryLinkDep = this.getDependencyDef("NaryLink");
        }
        return this.naryLinkDep;
    }

    @objid ("2a2e2f05-66ad-4998-a425-76dc368c07d1")
    public SmDependency getConsumerDep() {
        if (this.consumerDep == null) {
        	this.consumerDep = this.getDependencyDef("Consumer");
        }
        return this.consumerDep;
    }

    @objid ("b686f741-2c35-462e-af2f-9a1f79817b53")
    public SmDependency getProviderDep() {
        if (this.providerDep == null) {
        	this.providerDep = this.getDependencyDef("Provider");
        }
        return this.providerDep;
    }

    @objid ("c2f1b0a7-e543-47ff-bca3-5a9d48c7366d")
    private static class NaryLinkEndObjectFactory implements ISmObjectFactory {
        @objid ("95b7d2fc-29ef-4b88-a8d0-8ccde3b2d789")
        private NaryLinkEndSmClass smClass;

        @objid ("8d8d71d7-9d4c-4f67-887e-4b25dbc656be")
        public NaryLinkEndObjectFactory(NaryLinkEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9eb84acf-532d-4280-a838-e7e76cd48e5c")
        @Override
        public ISmObjectData createData() {
            return new NaryLinkEndData(this.smClass);
        }

        @objid ("bfe59154-ebf3-45c2-a779-b11ea1e2c469")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryLinkEndImpl();
        }

    }

    @objid ("3f4d9a15-da45-4590-889b-a0d7e56425ea")
    public static class IsOrderedSmAttribute extends SmAttribute {
        @objid ("c8eb8702-4cc1-4967-964e-5e0b18899da6")
        public Object getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mIsOrdered;
        }

        @objid ("7d183ff2-cbe2-4ec8-8ad4-ad9c24a168d0")
        public void setValue(ISmObjectData data, Object value) {
            ((NaryLinkEndData) data).mIsOrdered = value;
        }

    }

    @objid ("06ed2715-9d00-4a7c-bcb0-da8b3f47b52e")
    public static class IsUniqueSmAttribute extends SmAttribute {
        @objid ("f186a9d2-cd40-4da2-bbac-4937a52f0845")
        public Object getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mIsUnique;
        }

        @objid ("488b6fa6-ef35-46ea-8f51-efbbb9759c62")
        public void setValue(ISmObjectData data, Object value) {
            ((NaryLinkEndData) data).mIsUnique = value;
        }

    }

    @objid ("39860325-8d55-4598-bc99-606208d1d1b4")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("38e5357e-f2dd-4f96-86d9-62e2083d9561")
        public Object getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mMultiplicityMax;
        }

        @objid ("17f0a5c9-062f-4219-a0ff-1f3eb36d463d")
        public void setValue(ISmObjectData data, Object value) {
            ((NaryLinkEndData) data).mMultiplicityMax = value;
        }

    }

    @objid ("3cf6b16a-1012-48a5-83cd-0d8af0d59492")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("b5627fc4-1a8e-4e7a-b31e-d5f38fcd06af")
        public Object getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mMultiplicityMin;
        }

        @objid ("73e6d6b8-5f13-42aa-a86b-9c0249a944c2")
        public void setValue(ISmObjectData data, Object value) {
            ((NaryLinkEndData) data).mMultiplicityMin = value;
        }

    }

    @objid ("72b98052-c6cb-4f9b-aa21-1f5ff4faee9c")
    public static class SourceSmDependency extends SmSingleDependency {
        @objid ("f08e9f4d-4e34-4610-996b-0778065b0112")
        private SmDependency symetricDep;

        @objid ("2d8319af-21b0-47f0-8fa1-f3c1e7ee5373")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mSource;
        }

        @objid ("6bd898b7-e492-47f7-a3e6-d0494332a112")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryLinkEndData) data).mSource = value;
        }

        @objid ("c34466a9-0244-4205-8241-7d997b9a0a43")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getOwnedNaryEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("29a1fda9-083e-4302-8c61-ccbe06acaaa6")
    public static class NaryLinkSmDependency extends SmSingleDependency {
        @objid ("ef63c5e3-64b9-4efd-9c80-ae6239d85795")
        private SmDependency symetricDep;

        @objid ("30c72fd7-e811-4161-921f-bc480d45a4bc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mNaryLink;
        }

        @objid ("c1fa24bd-28a7-49f0-a749-f3aaa1f6ddf4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryLinkEndData) data).mNaryLink = value;
        }

        @objid ("7d5bf603-2d55-4bc5-a87c-e8d4d08eeeeb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkSmClass)this.getTarget()).getNaryLinkEndDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9472f429-fc33-4b15-8b67-f1b2ca48bb6f")
    public static class ConsumerSmDependency extends SmSingleDependency {
        @objid ("c660d3fc-7bf4-4439-84fc-52770830abcb")
        private SmDependency symetricDep;

        @objid ("ef1b8594-650b-40d9-83ef-4322e2aff558")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mConsumer;
        }

        @objid ("1d0fc149-a7b8-455b-bc3b-25b4cdb2ecbe")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryLinkEndData) data).mConsumer = value;
        }

        @objid ("173d918c-e700-4455-86c1-b946373197e6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequiredInterfaceSmClass)this.getTarget()).getNaryProviderDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ed959a85-23d8-4f20-bbba-4a461f2f1b82")
    public static class ProviderSmDependency extends SmSingleDependency {
        @objid ("e033c85b-0193-43f6-88e5-b18323c2146f")
        private SmDependency symetricDep;

        @objid ("181078e8-78d1-4412-adaf-f1f0273b83a0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryLinkEndData) data).mProvider;
        }

        @objid ("f10b3fd3-2b9e-484c-a33e-b3a2a5df03cc")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryLinkEndData) data).mProvider = value;
        }

        @objid ("d554e9ef-27af-425b-bae8-2b918a2d30f4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProvidedInterfaceSmClass)this.getTarget()).getNaryConsumerDep();
            }
            return this.symetricDep;
        }

    }

}
