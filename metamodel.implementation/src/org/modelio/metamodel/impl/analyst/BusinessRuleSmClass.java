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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
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

@objid ("cd3b250f-a5ab-4c5f-9507-e465957ac4da")
public class BusinessRuleSmClass extends AnalystElementSmClass {
    @objid ("8dd93364-3d8c-4e16-baef-a7e5eaa1a193")
    private SmDependency subRuleDep;

    @objid ("001e395e-6e70-4300-b36b-22514d6ec97f")
    private SmDependency ownerContainerDep;

    @objid ("b3a4f184-2139-4880-ae4a-c90857a4ad22")
    private SmDependency parentRuleDep;

    @objid ("bf97ba08-398d-4a8a-95c4-a7fc8ce8ae50")
    private SmDependency lastRuleVersionDep;

    @objid ("bd1b7e09-664d-4bcf-b7f1-1c9ad991d175")
    private SmDependency archivedRuleVersionDep;

    @objid ("9dcb1c03-58a1-42ec-81fe-b29b6a2bd0e0")
    public BusinessRuleSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a7cf189f-c93a-43b8-80c8-a3481bac3b12")
    @Override
    public String getName() {
        return "BusinessRule";
    }

    @objid ("ebedf580-efaf-430b-af02-513a0f0e2194")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("227627b9-8eab-4007-8e0d-cb0b2beeda8f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BusinessRule.class;
    }

    @objid ("f141dbc3-6362-4899-8dc7-3730b7b4d6cb")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("4dc83523-74cb-4621-b85e-c49e87dedc7d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("97be8cb6-68a3-466f-94db-5d005b368f46")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new BusinessRuleObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subRuleDep = new SubRuleSmDependency();
        this.subRuleDep.init("SubRule", this, metamodel.getMClass("BusinessRule"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subRuleDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("BusinessRuleContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.parentRuleDep = new ParentRuleSmDependency();
        this.parentRuleDep.init("ParentRule", this, metamodel.getMClass("BusinessRule"), 0, 1 );
        registerDependency(this.parentRuleDep);
        
        this.lastRuleVersionDep = new LastRuleVersionSmDependency();
        this.lastRuleVersionDep.init("LastRuleVersion", this, metamodel.getMClass("BusinessRule"), 0, 1 );
        registerDependency(this.lastRuleVersionDep);
        
        this.archivedRuleVersionDep = new ArchivedRuleVersionSmDependency();
        this.archivedRuleVersionDep.init("ArchivedRuleVersion", this, metamodel.getMClass("BusinessRule"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedRuleVersionDep);
    }

    @objid ("7b7a4c10-0242-4ba4-9b49-234a63632814")
    public SmDependency getSubRuleDep() {
        if (this.subRuleDep == null) {
        	this.subRuleDep = this.getDependencyDef("SubRule");
        }
        return this.subRuleDep;
    }

    @objid ("d4cc544f-0074-4299-9603-86d1373fd110")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("65f26383-9340-4b66-a922-060453e1ac21")
    public SmDependency getParentRuleDep() {
        if (this.parentRuleDep == null) {
        	this.parentRuleDep = this.getDependencyDef("ParentRule");
        }
        return this.parentRuleDep;
    }

    @objid ("1759493d-e3cf-4487-b88c-16e18f3acd1f")
    public SmDependency getLastRuleVersionDep() {
        if (this.lastRuleVersionDep == null) {
        	this.lastRuleVersionDep = this.getDependencyDef("LastRuleVersion");
        }
        return this.lastRuleVersionDep;
    }

    @objid ("ce30d689-ae29-4ada-ad28-1591feb915fd")
    public SmDependency getArchivedRuleVersionDep() {
        if (this.archivedRuleVersionDep == null) {
        	this.archivedRuleVersionDep = this.getDependencyDef("ArchivedRuleVersion");
        }
        return this.archivedRuleVersionDep;
    }

    @objid ("9233c74a-b880-4395-b9d7-8da318add411")
    private static class BusinessRuleObjectFactory implements ISmObjectFactory {
        @objid ("6df064af-31a9-488e-bf12-85fec34c7609")
        private BusinessRuleSmClass smClass;

        @objid ("6777e584-8943-438b-bf76-4f65cf4bfc00")
        public BusinessRuleObjectFactory(BusinessRuleSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("fdd9f6d9-c0da-4e92-acb3-53defe7834d2")
        @Override
        public ISmObjectData createData() {
            return new BusinessRuleData(this.smClass);
        }

        @objid ("80676a54-cd9e-4d5f-bd67-f408eed22e8c")
        @Override
        public SmObjectImpl createImpl() {
            return new BusinessRuleImpl();
        }

    }

    @objid ("f31fd575-ba38-4c69-892e-1536b63cdee0")
    public static class SubRuleSmDependency extends SmMultipleDependency {
        @objid ("3b28f8ae-9756-4769-be81-b0d8892fd9cb")
        private SmDependency symetricDep;

        @objid ("a6877775-75df-4df4-8b30-8abb003bbad0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BusinessRuleData)data).mSubRule != null)? ((BusinessRuleData)data).mSubRule:SmMultipleDependency.EMPTY;
        }

        @objid ("9a8d1c0b-4836-46bf-8a74-9c069905cefe")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BusinessRuleData) data).mSubRule = values;
        }

        @objid ("46d40d61-3379-40f6-a07d-c2b0d887dd4c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleSmClass)this.getTarget()).getParentRuleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a5279c03-de6e-4b50-b815-c7e9ced88c3d")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("db18545d-b775-4874-9942-7cfd9006e5e8")
        private SmDependency symetricDep;

        @objid ("cb901c5f-ea33-414a-a17f-58b7cb61e5f7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BusinessRuleData) data).mOwnerContainer;
        }

        @objid ("c1df3b1c-e7da-4a21-8d9b-95034bc73e2b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BusinessRuleData) data).mOwnerContainer = value;
        }

        @objid ("77bec072-bcf0-453f-9020-b096becdf7c3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleContainerSmClass)this.getTarget()).getOwnedRuleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ad3c480f-d120-46af-808e-95f851de3f0a")
    public static class ParentRuleSmDependency extends SmSingleDependency {
        @objid ("3cd1a992-386e-475b-ba52-89d8650ca5fa")
        private SmDependency symetricDep;

        @objid ("ca4d91e3-0ed2-4c69-ba33-23a236085f86")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BusinessRuleData) data).mParentRule;
        }

        @objid ("75646fda-0796-43c1-a527-5b44b4f316b2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BusinessRuleData) data).mParentRule = value;
        }

        @objid ("fcdc7af0-e7c5-444b-a954-9e42739dca13")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleSmClass)this.getTarget()).getSubRuleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("63e5fca7-4b47-4fb3-94ed-1cca7e8d5f9f")
    public static class LastRuleVersionSmDependency extends SmSingleDependency {
        @objid ("b00a5e18-761f-45d3-982d-938832826adc")
        private SmDependency symetricDep;

        @objid ("a6368d6b-ada0-4582-98ab-900051c03871")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BusinessRuleData) data).mLastRuleVersion;
        }

        @objid ("78c6a1f9-d55d-4ac8-a8ea-fa59965cb4a4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BusinessRuleData) data).mLastRuleVersion = value;
        }

        @objid ("b784b60b-a39d-492e-a537-25a45f9a1eac")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleSmClass)this.getTarget()).getArchivedRuleVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("75fa357f-fad2-46b5-8d62-58b1c1ad2a95")
    public static class ArchivedRuleVersionSmDependency extends SmMultipleDependency {
        @objid ("2b4e7622-9f37-4bcc-bfdd-3b3de7a9a128")
        private SmDependency symetricDep;

        @objid ("39f05347-46ed-42cd-ad4f-42b8b18cf98d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BusinessRuleData)data).mArchivedRuleVersion != null)? ((BusinessRuleData)data).mArchivedRuleVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("a92be316-80df-41fc-bf87-5c369ac51852")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BusinessRuleData) data).mArchivedRuleVersion = values;
        }

        @objid ("d8da93ce-9832-4ec1-b598-f1266c059acf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleSmClass)this.getTarget()).getLastRuleVersionDep();
            }
            return this.symetricDep;
        }

    }

}
