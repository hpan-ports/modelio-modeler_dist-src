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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
import org.modelio.metamodel.impl.analyst.RequirementContainerSmClass;
import org.modelio.metamodel.impl.analyst.RequirementSmClass;
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

@objid ("a76d049d-6688-4689-b175-446cbb455e6a")
public class RequirementContainerSmClass extends AnalystContainerSmClass {
    @objid ("9388c20b-ed4b-4c76-9553-0871b5d556da")
    private SmDependency ownedRequirementDep;

    @objid ("fbc0d55b-fd12-4ee6-b456-d1bffeac00df")
    private SmDependency ownerContainerDep;

    @objid ("f3eb3e30-f7cc-493f-8ee6-7d54c5e5ba48")
    private SmDependency ownedContainerDep;

    @objid ("53d8abe2-c8ec-43e0-be80-28b453ee098f")
    private SmDependency ownerProjectDep;

    @objid ("ecd67970-bdd8-43fb-b614-fda5d09ec87b")
    public RequirementContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5ae26ac4-d067-44e8-b2ce-8821a40d7977")
    @Override
    public String getName() {
        return "RequirementContainer";
    }

    @objid ("a53ab5cd-65e1-4e4c-8b4a-8a08e5945442")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6a086226-2972-453c-9149-c2adf4b347ff")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return RequirementContainer.class;
    }

    @objid ("13973d0a-3f74-4239-96cd-74720079f76b")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("e06af579-081e-48a3-9d58-f12ae4eec1c1")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("70605e3e-caa5-483e-ace1-3b0a72758367")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new RequirementContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedRequirementDep = new OwnedRequirementSmDependency();
        this.ownedRequirementDep.init("OwnedRequirement", this, metamodel.getMClass("Requirement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedRequirementDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("RequirementContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.ownedContainerDep = new OwnedContainerSmDependency();
        this.ownedContainerDep.init("OwnedContainer", this, metamodel.getMClass("RequirementContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedContainerDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
    }

    @objid ("7dc9bf1c-ba34-41b4-8cec-a64b32c6bb00")
    public SmDependency getOwnedRequirementDep() {
        if (this.ownedRequirementDep == null) {
        	this.ownedRequirementDep = this.getDependencyDef("OwnedRequirement");
        }
        return this.ownedRequirementDep;
    }

    @objid ("147afabb-a328-40ff-b994-8d8fc126b926")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("bf03a4b8-1043-4b18-a05e-07c4988560be")
    public SmDependency getOwnedContainerDep() {
        if (this.ownedContainerDep == null) {
        	this.ownedContainerDep = this.getDependencyDef("OwnedContainer");
        }
        return this.ownedContainerDep;
    }

    @objid ("73505903-8cf3-436b-b55e-131855473a93")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("586733f4-d03f-42b5-81b6-81cd745932ea")
    private static class RequirementContainerObjectFactory implements ISmObjectFactory {
        @objid ("5909e878-ba28-4771-8343-be52fc2cce32")
        private RequirementContainerSmClass smClass;

        @objid ("e1d3c43b-77ae-43fb-b4f5-49120d53f220")
        public RequirementContainerObjectFactory(RequirementContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("151b46dc-3cb1-4e04-a105-a662d6fd9b24")
        @Override
        public ISmObjectData createData() {
            return new RequirementContainerData(this.smClass);
        }

        @objid ("b17206b7-be2d-4928-ba2f-0c88994399e3")
        @Override
        public SmObjectImpl createImpl() {
            return new RequirementContainerImpl();
        }

    }

    @objid ("d56ba275-7c72-4c71-adfb-c57b7ca5a223")
    public static class OwnedRequirementSmDependency extends SmMultipleDependency {
        @objid ("bec819a8-7918-4afc-a9a0-1db8b6584082")
        private SmDependency symetricDep;

        @objid ("c2e49925-5ae0-487d-a893-101e41cf9b04")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequirementContainerData)data).mOwnedRequirement != null)? ((RequirementContainerData)data).mOwnedRequirement:SmMultipleDependency.EMPTY;
        }

        @objid ("133861d4-990a-4010-9fe1-6c5f9a5c06cc")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequirementContainerData) data).mOwnedRequirement = values;
        }

        @objid ("e58d34df-529d-4232-907d-5173e6f09bd7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("10d77602-717b-4770-8314-2a15b1472de9")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("4027d4a8-fdec-42da-af8d-0d06ce9edcd7")
        private SmDependency symetricDep;

        @objid ("58a8b40b-0d36-4642-bfff-6dd31fdd26d3")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequirementContainerData) data).mOwnerContainer;
        }

        @objid ("7e1a1b1b-3f23-4db7-aee5-09a5a3f2cbef")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequirementContainerData) data).mOwnerContainer = value;
        }

        @objid ("8bccdb38-237c-4e7d-92e0-f9c57f26743d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementContainerSmClass)this.getTarget()).getOwnedContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4afa4371-d457-4d9b-9d07-627af2e5679f")
    public static class OwnedContainerSmDependency extends SmMultipleDependency {
        @objid ("924fad0b-7751-4325-9375-23a7ce27bebe")
        private SmDependency symetricDep;

        @objid ("3466007f-88a5-4bab-bffe-5ead057ffe35")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequirementContainerData)data).mOwnedContainer != null)? ((RequirementContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
        }

        @objid ("f0b51df5-b923-42d7-a935-c5ec66b60866")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequirementContainerData) data).mOwnedContainer = values;
        }

        @objid ("40de4ee8-075e-42f7-a02f-186898e57819")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementContainerSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4534c3ab-c9b9-4248-8cbd-41ded7d9dafe")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("0977f07c-f8a9-454e-b774-916919384a1c")
        private SmDependency symetricDep;

        @objid ("3b816741-8d40-4be4-8841-32b8911c7757")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequirementContainerData) data).mOwnerProject;
        }

        @objid ("88267cd2-a04a-4b49-ba1a-a357fd048084")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequirementContainerData) data).mOwnerProject = value;
        }

        @objid ("84015f49-27c4-4fbd-9c14-5b7735db0605")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getRequirementRootDep();
            }
            return this.symetricDep;
        }

    }

}
