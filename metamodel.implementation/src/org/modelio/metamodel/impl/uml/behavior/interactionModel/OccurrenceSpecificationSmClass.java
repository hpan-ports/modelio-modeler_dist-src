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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GeneralOrderingSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("aef59fb3-f2e2-4e01-85ed-20b1b90fb246")
public class OccurrenceSpecificationSmClass extends InteractionFragmentSmClass {
    @objid ("fdfb2402-f207-4271-9679-a9e84c45ac6f")
    private SmDependency toAfterDep;

    @objid ("95b20362-b69d-4be8-b129-ccf07d0c6065")
    private SmDependency toBeforeDep;

    @objid ("e5bf5881-0891-4a17-b492-dae8936a8167")
    public OccurrenceSpecificationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ae88c963-9229-496a-923c-99590e7962ef")
    @Override
    public String getName() {
        return "OccurrenceSpecification";
    }

    @objid ("dba01bd0-e6dc-4b9d-ba0e-b63b7808fa81")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b594df52-6d5f-4958-b2bf-a667a5ada796")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return OccurrenceSpecification.class;
    }

    @objid ("0ccd4543-50d6-48a3-8971-543bc30e2037")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cbc28a91-99e3-4ca9-8afd-36a420203a3f")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("a7403061-5ab3-4ee7-97c8-e55971dfacd1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionFragment");
        this.registerFactory(new OccurrenceSpecificationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.toAfterDep = new ToAfterSmDependency();
        this.toAfterDep.init("ToAfter", this, metamodel.getMClass("GeneralOrdering"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.toAfterDep);
        
        this.toBeforeDep = new ToBeforeSmDependency();
        this.toBeforeDep.init("ToBefore", this, metamodel.getMClass("GeneralOrdering"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.toBeforeDep);
    }

    @objid ("fb546d53-f296-49f8-87e0-2b557da102d5")
    public SmDependency getToAfterDep() {
        if (this.toAfterDep == null) {
        	this.toAfterDep = this.getDependencyDef("ToAfter");
        }
        return this.toAfterDep;
    }

    @objid ("db7ea7b8-6a38-404a-8535-04549f27f6d3")
    public SmDependency getToBeforeDep() {
        if (this.toBeforeDep == null) {
        	this.toBeforeDep = this.getDependencyDef("ToBefore");
        }
        return this.toBeforeDep;
    }

    @objid ("7a1b8597-e850-454b-9a2d-a6f7d9f206d4")
    private static class OccurrenceSpecificationObjectFactory implements ISmObjectFactory {
        @objid ("aa26f43f-f876-43d8-81d2-1b363d23c5be")
        private OccurrenceSpecificationSmClass smClass;

        @objid ("9a4d1290-f2ca-42d0-a9a9-62b26bc404c2")
        public OccurrenceSpecificationObjectFactory(OccurrenceSpecificationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("59d21cb5-1c65-4085-ae1f-f2d6bdf87923")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("86782dde-8e14-4e20-ad0e-03ca257e6684")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("34dbe523-de1f-44e4-aa20-135a5c5d4a89")
    public static class ToAfterSmDependency extends SmMultipleDependency {
        @objid ("dac05427-e436-47cf-8e14-c31f533e3424")
        private SmDependency symetricDep;

        @objid ("6add3885-16d2-40c6-860b-180f2ce89c60")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OccurrenceSpecificationData)data).mToAfter != null)? ((OccurrenceSpecificationData)data).mToAfter:SmMultipleDependency.EMPTY;
        }

        @objid ("3f65ee06-41bb-4ea5-b43e-b931d3b66b3e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OccurrenceSpecificationData) data).mToAfter = values;
        }

        @objid ("ab4b4856-ff4c-4249-907a-b1deea1da412")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralOrderingSmClass)this.getTarget()).getBeforeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c960bc64-6e67-4f0f-83aa-f920925b7fb7")
    public static class ToBeforeSmDependency extends SmMultipleDependency {
        @objid ("e8677890-7e6a-4a8a-bb28-d64e45ce60a8")
        private SmDependency symetricDep;

        @objid ("8d56955d-c600-423c-9b82-2115a2bbc8a8")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OccurrenceSpecificationData)data).mToBefore != null)? ((OccurrenceSpecificationData)data).mToBefore:SmMultipleDependency.EMPTY;
        }

        @objid ("901ea094-842e-47eb-839f-8896c154aa5b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OccurrenceSpecificationData) data).mToBefore = values;
        }

        @objid ("894528b9-26af-408f-809e-030184272957")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GeneralOrderingSmClass)this.getTarget()).getAfterDep();
            }
            return this.symetricDep;
        }

    }

}
