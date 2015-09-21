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
import org.modelio.metamodel.impl.uml.statik.AssociationEndSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassAssociationSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkSmClass;
import org.modelio.metamodel.uml.statik.Association;
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

@objid ("cd569d79-73f0-4df0-b323-377f6551adad")
public class AssociationSmClass extends ModelElementSmClass {
    @objid ("412a2fc5-e6bb-49a3-80ef-d545c77ea31e")
    private SmDependency occurenceDep;

    @objid ("814346ee-ed48-49c8-a53f-27287d3e9e6c")
    private SmDependency endDep;

    @objid ("ae66eb3b-6de2-4575-855f-16fff23c07e4")
    private SmDependency linkToClassDep;

    @objid ("04da0c53-0018-4e77-81ab-0fef13d9d055")
    public AssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e8dd6711-5620-429d-a18d-eb0583c6acc8")
    @Override
    public String getName() {
        return "Association";
    }

    @objid ("4832e4c8-bcbe-4794-b7af-92c06a79265a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("328e8b49-4317-4104-8baf-6ad409767da2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Association.class;
    }

    @objid ("47199d32-6296-482f-b338-a353b5eff1c0")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d27a3283-56fe-447d-8e0a-d6f4aa03bacd")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("916bfb7d-5281-42f9-85ef-154ba95ec2da")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new AssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("Link"), 0, -1 );
        registerDependency(this.occurenceDep);
        
        this.endDep = new EndSmDependency();
        this.endDep.init("End", this, metamodel.getMClass("AssociationEnd"), 2, 2 );
        registerDependency(this.endDep);
        
        this.linkToClassDep = new LinkToClassSmDependency();
        this.linkToClassDep.init("LinkToClass", this, metamodel.getMClass("ClassAssociation"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.linkToClassDep);
    }

    @objid ("c5b37ada-2643-43ef-8799-c86455acd0e8")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("d7eb7f8b-0d32-4fa0-a58c-8db12ddca8f6")
    public SmDependency getEndDep() {
        if (this.endDep == null) {
        	this.endDep = this.getDependencyDef("End");
        }
        return this.endDep;
    }

    @objid ("dd17bbc9-570f-42f4-891b-ea3b8e520b49")
    public SmDependency getLinkToClassDep() {
        if (this.linkToClassDep == null) {
        	this.linkToClassDep = this.getDependencyDef("LinkToClass");
        }
        return this.linkToClassDep;
    }

    @objid ("99e3f5cd-df66-4a05-96aa-b1ed0ee78f0c")
    private static class AssociationObjectFactory implements ISmObjectFactory {
        @objid ("99803ea2-cf5e-49c9-8144-de62042278dd")
        private AssociationSmClass smClass;

        @objid ("594bc343-5693-40c3-a21d-be244b5416fa")
        public AssociationObjectFactory(AssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("af131a95-d1e6-4b0d-90cb-849b03125990")
        @Override
        public ISmObjectData createData() {
            return new AssociationData(this.smClass);
        }

        @objid ("1c48d8b7-1fe5-416e-b451-3845955b75ef")
        @Override
        public SmObjectImpl createImpl() {
            return new AssociationImpl();
        }

    }

    @objid ("4539bac2-c680-4282-b73f-3858ae3a380b")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("70035f8b-ae94-4b85-b98c-f25511309233")
        private SmDependency symetricDep;

        @objid ("df67263f-ee6e-4cb6-a190-5666a7ccc390")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationData)data).mOccurence != null)? ((AssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("52579477-4d5a-49bd-adb3-8d55fca19978")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationData) data).mOccurence = values;
        }

        @objid ("c0956107-af80-473f-b501-ef4d5c63e1a7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("77dbd1ae-b6c6-41a5-8dfa-61572d9b080c")
    public static class EndSmDependency extends SmMultipleDependency {
        @objid ("4336a1c4-6c4a-421a-aaf5-06dd916e7554")
        private SmDependency symetricDep;

        @objid ("1092b2f0-f1e2-4d49-a877-3d744292a9e5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AssociationData)data).mEnd != null)? ((AssociationData)data).mEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("087c8ced-4d78-4b43-8d18-e53e28fabcf7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AssociationData) data).mEnd = values;
        }

        @objid ("d9ffd7ba-d1b3-4fbf-b410-92d4c8c7d567")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AssociationEndSmClass)this.getTarget()).getAssociationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("dc1790c4-b578-497d-99ad-f1156a306bb3")
    public static class LinkToClassSmDependency extends SmSingleDependency {
        @objid ("d70aed1e-ab9d-401a-aa6b-f987b20b9ad7")
        private SmDependency symetricDep;

        @objid ("b5f1a415-ec72-426d-9475-d018d2edf2ed")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AssociationData) data).mLinkToClass;
        }

        @objid ("c61489d4-ea6f-49ed-861a-335a889303ef")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AssociationData) data).mLinkToClass = value;
        }

        @objid ("b5432022-c6b6-424c-a64a-26409d692a50")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassAssociationSmClass)this.getTarget()).getAssociationPartDep();
            }
            return this.symetricDep;
        }

    }

}
