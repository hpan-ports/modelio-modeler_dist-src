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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
import org.modelio.metamodel.impl.analyst.DictionarySmClass;
import org.modelio.metamodel.impl.analyst.TermSmClass;
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

@objid ("391e23d1-98b1-42df-ba98-3fdc49fa0b5c")
public class TermSmClass extends AnalystElementSmClass {
    @objid ("da0ccbe4-f939-4b51-b202-77e8bf9dd16a")
    private SmDependency ownerDictionaryDep;

    @objid ("11f4e7c5-29e8-48b5-b947-29660d934e21")
    private SmDependency archivedTermVersionDep;

    @objid ("3350fecc-e0ff-43a5-b5ac-7508f08381ff")
    private SmDependency lastTermVersionDep;

    @objid ("932ecf80-703c-46d3-96be-929b12dfe9a7")
    public TermSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3ea77751-2358-4aeb-b373-c09f5b873189")
    @Override
    public String getName() {
        return "Term";
    }

    @objid ("74322a37-7f8f-418f-93de-2ac8ec33fc3b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("218f7e25-b808-400d-8130-065a6fbebbcf")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Term.class;
    }

    @objid ("abe717e3-127b-4ad9-802f-a4fcc6bed50c")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("38b45368-fb61-4bb2-bd76-003a84f4d9de")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("6819f370-7ead-4187-bbfd-ce898ac8ba3a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new TermObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDictionaryDep = new OwnerDictionarySmDependency();
        this.ownerDictionaryDep.init("OwnerDictionary", this, metamodel.getMClass("Dictionary"), 0, 1 );
        registerDependency(this.ownerDictionaryDep);
        
        this.archivedTermVersionDep = new ArchivedTermVersionSmDependency();
        this.archivedTermVersionDep.init("ArchivedTermVersion", this, metamodel.getMClass("Term"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedTermVersionDep);
        
        this.lastTermVersionDep = new LastTermVersionSmDependency();
        this.lastTermVersionDep.init("LastTermVersion", this, metamodel.getMClass("Term"), 0, 1 );
        registerDependency(this.lastTermVersionDep);
    }

    @objid ("2a23e967-343e-401c-b37a-4dd1960de77c")
    public SmDependency getOwnerDictionaryDep() {
        if (this.ownerDictionaryDep == null) {
        	this.ownerDictionaryDep = this.getDependencyDef("OwnerDictionary");
        }
        return this.ownerDictionaryDep;
    }

    @objid ("cb301f9d-96a5-434f-8933-77f6a889d5e5")
    public SmDependency getArchivedTermVersionDep() {
        if (this.archivedTermVersionDep == null) {
        	this.archivedTermVersionDep = this.getDependencyDef("ArchivedTermVersion");
        }
        return this.archivedTermVersionDep;
    }

    @objid ("7255ff8f-d332-48cf-b557-6bb8a807b354")
    public SmDependency getLastTermVersionDep() {
        if (this.lastTermVersionDep == null) {
        	this.lastTermVersionDep = this.getDependencyDef("LastTermVersion");
        }
        return this.lastTermVersionDep;
    }

    @objid ("54e6efe3-61a3-403c-b6e8-9a4607d6dd1f")
    private static class TermObjectFactory implements ISmObjectFactory {
        @objid ("01496b6b-8d9a-4a99-bd7c-22731a6a710f")
        private TermSmClass smClass;

        @objid ("101ef084-9a7d-4a38-9067-f8741fe080c7")
        public TermObjectFactory(TermSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("cbeab7a2-85cd-4871-adbd-d6b2afe50c82")
        @Override
        public ISmObjectData createData() {
            return new TermData(this.smClass);
        }

        @objid ("7d5e7818-88c6-42e5-92e6-8d1c1f1a0c00")
        @Override
        public SmObjectImpl createImpl() {
            return new TermImpl();
        }

    }

    @objid ("b402d934-47f8-4410-a77b-d9d5ba32c1d7")
    public static class OwnerDictionarySmDependency extends SmSingleDependency {
        @objid ("4960579d-c700-48cf-bdf1-ec3a803dadbc")
        private SmDependency symetricDep;

        @objid ("044510cf-961f-4e61-94b0-6e72ec831926")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TermData) data).mOwnerDictionary;
        }

        @objid ("c9ef0bb2-6941-47c8-a92c-afbd94507cab")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TermData) data).mOwnerDictionary = value;
        }

        @objid ("2cc395a0-5fd4-4c0a-ab72-1af047ea9c54")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DictionarySmClass)this.getTarget()).getOwnedTermDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e0558ef6-d1dc-4b63-81d5-2ac94f4ea59b")
    public static class ArchivedTermVersionSmDependency extends SmMultipleDependency {
        @objid ("8b4cb876-7a15-463b-b385-2e268acf64f1")
        private SmDependency symetricDep;

        @objid ("e0b5f980-9b0f-4ec0-ad14-f408dd821938")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((TermData)data).mArchivedTermVersion != null)? ((TermData)data).mArchivedTermVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("638e5ce0-eaa0-407c-844b-96aad10caf2c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((TermData) data).mArchivedTermVersion = values;
        }

        @objid ("7d39cf56-eb61-4339-8a75-57b7ab67111b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TermSmClass)this.getTarget()).getLastTermVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7e6f398b-35fb-483d-8c2c-9b23e2c12e17")
    public static class LastTermVersionSmDependency extends SmSingleDependency {
        @objid ("7a4a2b35-b0d3-49ae-b159-e28cbbbaacb7")
        private SmDependency symetricDep;

        @objid ("7b09076b-644f-4708-aa16-5ca6ebfd0a7d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TermData) data).mLastTermVersion;
        }

        @objid ("6f535e80-f84d-4972-abf5-83d517c8cbbf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TermData) data).mLastTermVersion = value;
        }

        @objid ("20ea4d19-8f81-4b41-9e01-aa97ff8c50ba")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TermSmClass)this.getTarget()).getArchivedTermVersionDep();
            }
            return this.symetricDep;
        }

    }

}
