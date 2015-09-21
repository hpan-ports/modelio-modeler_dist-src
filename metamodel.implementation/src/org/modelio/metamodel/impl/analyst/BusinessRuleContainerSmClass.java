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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
import org.modelio.metamodel.impl.analyst.BusinessRuleContainerSmClass;
import org.modelio.metamodel.impl.analyst.BusinessRuleSmClass;
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

@objid ("f737b3ad-cf14-4d7b-96c0-c56672acb7e3")
public class BusinessRuleContainerSmClass extends AnalystContainerSmClass {
    @objid ("0665a58d-47cb-4ea5-84be-05763acd2408")
    private SmDependency ownedRuleDep;

    @objid ("73b2204f-e8d2-41ad-9de7-c61a6fd5196d")
    private SmDependency ownerContainerDep;

    @objid ("14340f4c-a342-4e6c-a685-387769692d92")
    private SmDependency ownedContainerDep;

    @objid ("dd86bfa5-4d2f-4f64-9eb7-49ca30fbe5d5")
    private SmDependency ownerProjectDep;

    @objid ("a32db485-3a70-4ddc-b344-a2cc30edddd4")
    public BusinessRuleContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4ff32bdc-14ec-4904-84b8-dc737d470100")
    @Override
    public String getName() {
        return "BusinessRuleContainer";
    }

    @objid ("2a7ff7cf-119f-4063-af4c-d686a179627b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("00ff5015-24ed-4f05-be15-b7b65c410f4e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BusinessRuleContainer.class;
    }

    @objid ("e40eaf92-e6e1-4e49-912d-65af85391d7d")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("04c961f6-db54-4847-8678-2241b5a9f2ab")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("19def1d1-0429-488e-9a1e-36220d336dc8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new BusinessRuleContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedRuleDep = new OwnedRuleSmDependency();
        this.ownedRuleDep.init("OwnedRule", this, metamodel.getMClass("BusinessRule"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedRuleDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("BusinessRuleContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.ownedContainerDep = new OwnedContainerSmDependency();
        this.ownedContainerDep.init("OwnedContainer", this, metamodel.getMClass("BusinessRuleContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedContainerDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
    }

    @objid ("c965f3d2-375d-4a5e-bc18-218779bfe2e5")
    public SmDependency getOwnedRuleDep() {
        if (this.ownedRuleDep == null) {
        	this.ownedRuleDep = this.getDependencyDef("OwnedRule");
        }
        return this.ownedRuleDep;
    }

    @objid ("7ab3554f-3321-4a7a-989f-e0e4cb64b53e")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("98532912-3575-47b6-91d5-74f17f8326cc")
    public SmDependency getOwnedContainerDep() {
        if (this.ownedContainerDep == null) {
        	this.ownedContainerDep = this.getDependencyDef("OwnedContainer");
        }
        return this.ownedContainerDep;
    }

    @objid ("69ae9e64-80e2-42de-9e57-0a3e2a0fd7ce")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("7a2e8913-3a3a-4395-b622-9a99caf2ab0d")
    private static class BusinessRuleContainerObjectFactory implements ISmObjectFactory {
        @objid ("e17c1cee-f574-4f4e-b65c-84770f286bf8")
        private BusinessRuleContainerSmClass smClass;

        @objid ("322e95c1-db00-47e0-9a34-a467d3f5fd61")
        public BusinessRuleContainerObjectFactory(BusinessRuleContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b27f6aea-6255-4672-99b7-f6602129f281")
        @Override
        public ISmObjectData createData() {
            return new BusinessRuleContainerData(this.smClass);
        }

        @objid ("a14920fc-8433-425f-9da6-eb03f478061c")
        @Override
        public SmObjectImpl createImpl() {
            return new BusinessRuleContainerImpl();
        }

    }

    @objid ("b26ee805-5600-411d-909f-c56f0846cd00")
    public static class OwnedRuleSmDependency extends SmMultipleDependency {
        @objid ("4fc2e469-a379-4fb0-bcea-dffe35af30f9")
        private SmDependency symetricDep;

        @objid ("6f1522ce-22a5-40a0-9eed-83683dbfd833")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BusinessRuleContainerData)data).mOwnedRule != null)? ((BusinessRuleContainerData)data).mOwnedRule:SmMultipleDependency.EMPTY;
        }

        @objid ("09be57a8-66d8-4a7a-88c7-dcd0e8139dc9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BusinessRuleContainerData) data).mOwnedRule = values;
        }

        @objid ("9c17ed77-ddca-4d17-bcce-6829dc127c4e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("09098210-a195-4c5a-b809-652433569481")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("45ffd847-1ce3-42ec-a659-c3fe2323b720")
        private SmDependency symetricDep;

        @objid ("0d5f71e2-8715-4ca9-89d5-ef281449a754")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BusinessRuleContainerData) data).mOwnerContainer;
        }

        @objid ("889074e3-a690-4479-a99f-4b4c00d191e5")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BusinessRuleContainerData) data).mOwnerContainer = value;
        }

        @objid ("3bb9d3c7-c0e6-4043-912e-6b108040630b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleContainerSmClass)this.getTarget()).getOwnedContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c43b5185-763b-49eb-b66f-d28d4eb25886")
    public static class OwnedContainerSmDependency extends SmMultipleDependency {
        @objid ("ec96ecfd-1087-4174-850d-628d43936bcf")
        private SmDependency symetricDep;

        @objid ("8c743dfb-5491-458c-8a4c-26ee453acc31")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BusinessRuleContainerData)data).mOwnedContainer != null)? ((BusinessRuleContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
        }

        @objid ("e19b169f-85dc-4133-9c74-4584c91fe850")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BusinessRuleContainerData) data).mOwnedContainer = values;
        }

        @objid ("8488eb5e-07e9-4711-8ca1-935a2c861fa4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleContainerSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("affe244f-1a21-4c11-afdc-19840d067e1e")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("2e69084a-ff2a-47db-ba5e-bc768af8a77f")
        private SmDependency symetricDep;

        @objid ("17abec48-25ac-43b3-8beb-9d4c44628ac0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BusinessRuleContainerData) data).mOwnerProject;
        }

        @objid ("9dc99976-f58e-4000-9ea5-0d43879b6606")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BusinessRuleContainerData) data).mOwnerProject = value;
        }

        @objid ("9603995e-2750-4ed8-9c68-40ed975fdcd9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getBusinessRuleRootDep();
            }
            return this.symetricDep;
        }

    }

}
