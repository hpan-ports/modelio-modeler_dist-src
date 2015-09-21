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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassAssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkSmClass;
import org.modelio.metamodel.uml.statik.NaryAssociation;
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

@objid ("8713ac34-9f32-4ab4-b3ee-79e367ec168e")
public class NaryAssociationSmClass extends ModelElementSmClass {
    @objid ("7c343cc1-d85c-4293-828e-d9d53f3bd33d")
    private SmDependency occurenceDep;

    @objid ("a3340ec6-a497-4692-bc3c-d735fb82b037")
    private SmDependency naryEndDep;

    @objid ("e6684dec-1827-4a11-8898-bd2279f197cc")
    private SmDependency linkToClassDep;

    @objid ("88b59eb2-e8ca-4d1d-ab75-13f53ebf4a25")
    public NaryAssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5df8696e-a090-4442-a393-03d682524ca9")
    @Override
    public String getName() {
        return "NaryAssociation";
    }

    @objid ("6b44fa8e-b0f7-44ca-a8e9-2eef9a285bd4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bab60e26-5435-4ed6-bc8f-b5c686f78f83")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryAssociation.class;
    }

    @objid ("e251ab5a-d44a-477e-ba70-698021a32374")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a7669e8a-0c13-4db1-950c-e572434c6a6f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("4e7cb557-d769-4963-bfcc-011b7390b745")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new NaryAssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("NaryLink"), 0, -1 );
        registerDependency(this.occurenceDep);
        
        this.naryEndDep = new NaryEndSmDependency();
        this.naryEndDep.init("NaryEnd", this, metamodel.getMClass("NaryAssociationEnd"), 0, -1 , SmDirective.SMCDSHAREDCOMPONENT);
        registerDependency(this.naryEndDep);
        
        this.linkToClassDep = new LinkToClassSmDependency();
        this.linkToClassDep.init("LinkToClass", this, metamodel.getMClass("ClassAssociation"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.linkToClassDep);
    }

    @objid ("badd8a89-35a7-4371-a5c4-09586b77fd57")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("e0bc3f7f-d9be-4316-8042-628c91827e70")
    public SmDependency getNaryEndDep() {
        if (this.naryEndDep == null) {
        	this.naryEndDep = this.getDependencyDef("NaryEnd");
        }
        return this.naryEndDep;
    }

    @objid ("03bb118b-54c4-4131-835a-f6b489db83d7")
    public SmDependency getLinkToClassDep() {
        if (this.linkToClassDep == null) {
        	this.linkToClassDep = this.getDependencyDef("LinkToClass");
        }
        return this.linkToClassDep;
    }

    @objid ("62486e9c-4a08-4fa0-9cf9-493315edc6a3")
    private static class NaryAssociationObjectFactory implements ISmObjectFactory {
        @objid ("f8b00f1a-b46c-43db-9652-a99bbe526d9a")
        private NaryAssociationSmClass smClass;

        @objid ("cf4e54bd-a577-41de-9887-ddb24d717198")
        public NaryAssociationObjectFactory(NaryAssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("259e5072-009c-4d4f-b300-95453b50c4c5")
        @Override
        public ISmObjectData createData() {
            return new NaryAssociationData(this.smClass);
        }

        @objid ("44816241-3f71-4286-89f7-952a058f8a45")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryAssociationImpl();
        }

    }

    @objid ("eb08d68a-4c9b-43f9-a27f-c3e7e5ffe446")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("7b847168-b485-4dde-b7da-28b5b97a7b5e")
        private SmDependency symetricDep;

        @objid ("ed785330-d9b5-4b81-84d3-971aec6551af")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryAssociationData)data).mOccurence != null)? ((NaryAssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("03d4b192-6837-4b2c-80d1-50da3fb05e78")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryAssociationData) data).mOccurence = values;
        }

        @objid ("0ad737fa-d334-427a-80bf-feb16402e2d0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b0a324a8-0af7-4650-9348-996bfc4cb2de")
    public static class NaryEndSmDependency extends SmMultipleDependency {
        @objid ("3ace0287-abeb-4e52-be00-e152f52d8cf5")
        private SmDependency symetricDep;

        @objid ("8c97f0fa-8293-4e50-820f-aadafd67e635")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryAssociationData)data).mNaryEnd != null)? ((NaryAssociationData)data).mNaryEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("2fcae00f-a1aa-4d35-a3f9-13fd7bc181a6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryAssociationData) data).mNaryEnd = values;
        }

        @objid ("9368fb42-0c7d-4805-976d-56504d8b5771")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryAssociationEndSmClass)this.getTarget()).getNaryAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f962d317-1a6a-4352-ab11-9efff9136fcb")
    public static class LinkToClassSmDependency extends SmSingleDependency {
        @objid ("a2070700-4c66-42c7-99de-43aa91acabcd")
        private SmDependency symetricDep;

        @objid ("9431d87b-5a10-425d-b727-b3eebf58a5a2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryAssociationData) data).mLinkToClass;
        }

        @objid ("1d118db2-5b7d-4bdd-85ac-2081b6ff6f9b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryAssociationData) data).mLinkToClass = value;
        }

        @objid ("14843a9d-2f2f-48ca-90fd-c0a699a42c0f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassAssociationSmClass)this.getTarget()).getNaryAssociationPartDep();
            }
            return this.symetricDep;
        }

    }

}
