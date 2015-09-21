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
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
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

@objid ("39416ded-b2ce-4147-ba75-16700e174130")
public class DictionarySmClass extends AnalystContainerSmClass {
    @objid ("54cd251e-b086-4f6a-b1e3-acef1541791b")
    private SmDependency ownedDictionaryDep;

    @objid ("7ae4e104-f045-4342-98f7-2e7890a36ecb")
    private SmDependency ownerDictionaryDep;

    @objid ("6d4ede01-097f-49c9-9300-609c0e95a0de")
    private SmDependency ownerProjectDep;

    @objid ("764f2c1c-184b-41b5-9ad2-d3b87a76975c")
    private SmDependency ownedTermDep;

    @objid ("74aea038-db50-4992-9ad2-c4d74be42b03")
    public DictionarySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("48bf11e2-07f7-47ec-b466-93041900b312")
    @Override
    public String getName() {
        return "Dictionary";
    }

    @objid ("31998cc7-c768-4343-97a0-e122c5a71c9c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4b73a096-d6a4-4504-8b41-855bdc7035c0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Dictionary.class;
    }

    @objid ("7483aca3-a69a-4adf-ae4a-335c1b0bc887")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("40882b37-b0d9-451a-bdcc-5c4792bf7759")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d2c19e96-6aa1-426c-8ef1-2a267f229b3d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new DictionaryObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedDictionaryDep = new OwnedDictionarySmDependency();
        this.ownedDictionaryDep.init("OwnedDictionary", this, metamodel.getMClass("Dictionary"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedDictionaryDep);
        
        this.ownerDictionaryDep = new OwnerDictionarySmDependency();
        this.ownerDictionaryDep.init("OwnerDictionary", this, metamodel.getMClass("Dictionary"), 0, 1 );
        registerDependency(this.ownerDictionaryDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
        
        this.ownedTermDep = new OwnedTermSmDependency();
        this.ownedTermDep.init("OwnedTerm", this, metamodel.getMClass("Term"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedTermDep);
    }

    @objid ("0d5ea597-5c44-47ee-a3d4-d598f3ae38ad")
    public SmDependency getOwnedDictionaryDep() {
        if (this.ownedDictionaryDep == null) {
        	this.ownedDictionaryDep = this.getDependencyDef("OwnedDictionary");
        }
        return this.ownedDictionaryDep;
    }

    @objid ("c24c480e-750e-43f8-91c5-b4d8b0bb7f32")
    public SmDependency getOwnerDictionaryDep() {
        if (this.ownerDictionaryDep == null) {
        	this.ownerDictionaryDep = this.getDependencyDef("OwnerDictionary");
        }
        return this.ownerDictionaryDep;
    }

    @objid ("b23190d0-9daa-4236-a81c-1316e0639b40")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("a150a0fa-900a-4d56-8ef5-3e23c3ffb988")
    public SmDependency getOwnedTermDep() {
        if (this.ownedTermDep == null) {
        	this.ownedTermDep = this.getDependencyDef("OwnedTerm");
        }
        return this.ownedTermDep;
    }

    @objid ("bf7bc797-279a-4f17-b1c8-74e42ef00cc2")
    private static class DictionaryObjectFactory implements ISmObjectFactory {
        @objid ("75650d95-3f4f-4418-b537-67d57b32c2c9")
        private DictionarySmClass smClass;

        @objid ("6631f570-fbb0-401e-80cf-9cac9d43de27")
        public DictionaryObjectFactory(DictionarySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("821ef63b-fd84-490b-89f4-65780ca04d65")
        @Override
        public ISmObjectData createData() {
            return new DictionaryData(this.smClass);
        }

        @objid ("38a15153-6220-4020-bab1-aa9633aa37e7")
        @Override
        public SmObjectImpl createImpl() {
            return new DictionaryImpl();
        }

    }

    @objid ("8fdb01e3-e470-40b7-aed9-9658747e1843")
    public static class OwnedDictionarySmDependency extends SmMultipleDependency {
        @objid ("81d34afd-6628-4e77-bfea-57c55b107310")
        private SmDependency symetricDep;

        @objid ("4c536744-b04b-4989-a055-fbef0cacd5a3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((DictionaryData)data).mOwnedDictionary != null)? ((DictionaryData)data).mOwnedDictionary:SmMultipleDependency.EMPTY;
        }

        @objid ("6b0008b6-da23-4b89-8b33-fddb803800dc")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((DictionaryData) data).mOwnedDictionary = values;
        }

        @objid ("38104125-e688-4a63-a800-4700f491ea7c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DictionarySmClass)this.getTarget()).getOwnerDictionaryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7a910e69-8b19-48a1-ab95-0a6b740f9e92")
    public static class OwnerDictionarySmDependency extends SmSingleDependency {
        @objid ("ea0082fa-c897-45c1-85f4-ecb398c3f366")
        private SmDependency symetricDep;

        @objid ("92790b66-4b31-47be-b4f7-308fccfc4027")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DictionaryData) data).mOwnerDictionary;
        }

        @objid ("1803935c-280d-4183-b666-a06c553a3bbd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DictionaryData) data).mOwnerDictionary = value;
        }

        @objid ("e5ae2ddc-8579-4dfe-bedc-a621b9a45d6e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DictionarySmClass)this.getTarget()).getOwnedDictionaryDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1b2e0daf-884e-4815-8699-043fbe3df94a")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("1be9d49d-105f-47a2-b9ed-f8ad781fb789")
        private SmDependency symetricDep;

        @objid ("76e0bd16-9458-496e-9e0c-95d4fc313021")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DictionaryData) data).mOwnerProject;
        }

        @objid ("bbdf4c6f-9183-4b72-b8bc-4cf77d6101f2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DictionaryData) data).mOwnerProject = value;
        }

        @objid ("287a4361-868e-4079-8823-208c0eb5b19e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getDictionaryRootDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("07fc8273-bf24-4955-8fb6-88d6f16f88b2")
    public static class OwnedTermSmDependency extends SmMultipleDependency {
        @objid ("df861bfe-6d6e-4760-97fb-81e337d7e931")
        private SmDependency symetricDep;

        @objid ("625e0dbb-7696-4eef-976f-d1fe3d432b07")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((DictionaryData)data).mOwnedTerm != null)? ((DictionaryData)data).mOwnedTerm:SmMultipleDependency.EMPTY;
        }

        @objid ("05c508ad-2c6b-4c49-886c-115a83a5915c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((DictionaryData) data).mOwnedTerm = values;
        }

        @objid ("54f84979-44b3-4cd5-8f50-74f30a293d4f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TermSmClass)this.getTarget()).getOwnerDictionaryDep();
            }
            return this.symetricDep;
        }

    }

}
