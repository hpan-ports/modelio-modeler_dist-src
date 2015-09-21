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
import org.modelio.metamodel.analyst.Risk;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
import org.modelio.metamodel.impl.analyst.RiskContainerSmClass;
import org.modelio.metamodel.impl.analyst.RiskSmClass;
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

@objid ("b5e551c0-727d-479f-af32-c5b28296f72b")
public class RiskSmClass extends AnalystElementSmClass {
    @objid ("a51c7b09-3a4c-4ac0-a23e-8a22a9ddaa4d")
    private SmDependency subRiskDep;

    @objid ("8c19fb5b-75cc-42b6-8dfc-854a9207e549")
    private SmDependency ownerContainerDep;

    @objid ("7f3af5e6-336f-4ec2-8685-c31ec83ee2e1")
    private SmDependency parentRiskDep;

    @objid ("8a244eaf-c95f-4e46-98a0-5d99bddd5fa1")
    private SmDependency archivedRiskVersionDep;

    @objid ("dedeb8d2-b131-4889-854b-25ea4df294e2")
    private SmDependency lastRiskVersionDep;

    @objid ("1419ac9b-a4fe-4f05-8aa5-17576090991a")
    public RiskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f8a7c12d-f7d9-4908-8882-43b6588ded94")
    @Override
    public String getName() {
        return "Risk";
    }

    @objid ("2c892f3b-8bdf-49d7-87e9-fbc40dc38b0a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9055");
    }

    @objid ("5d93e6ba-a283-4b3e-beb8-c3eed9eef14f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Risk.class;
    }

    @objid ("65bab446-3cf6-4f55-b489-8b508e2ef106")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("506614aa-3294-476d-b5c8-6fd83d87d9d5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d1c99f28-7507-45b7-a75b-a07bdd891360")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new RiskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subRiskDep = new SubRiskSmDependency();
        this.subRiskDep.init("SubRisk", this, metamodel.getMClass("Risk"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subRiskDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("RiskContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.parentRiskDep = new ParentRiskSmDependency();
        this.parentRiskDep.init("ParentRisk", this, metamodel.getMClass("Risk"), 0, 1 );
        registerDependency(this.parentRiskDep);
        
        this.archivedRiskVersionDep = new ArchivedRiskVersionSmDependency();
        this.archivedRiskVersionDep.init("ArchivedRiskVersion", this, metamodel.getMClass("Risk"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedRiskVersionDep);
        
        this.lastRiskVersionDep = new LastRiskVersionSmDependency();
        this.lastRiskVersionDep.init("LastRiskVersion", this, metamodel.getMClass("Risk"), 0, 1 );
        registerDependency(this.lastRiskVersionDep);
    }

    @objid ("abbb251a-0635-466f-8f7e-152146bc8431")
    public SmDependency getSubRiskDep() {
        if (this.subRiskDep == null) {
        	this.subRiskDep = this.getDependencyDef("SubRisk");
        }
        return this.subRiskDep;
    }

    @objid ("79a57d59-3e5c-4c07-9514-00e1100ed183")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("58fb1b71-e444-4a79-bd8d-785796b34b3f")
    public SmDependency getParentRiskDep() {
        if (this.parentRiskDep == null) {
        	this.parentRiskDep = this.getDependencyDef("ParentRisk");
        }
        return this.parentRiskDep;
    }

    @objid ("8fbb23ef-019a-488c-b04d-b37514f2a4fe")
    public SmDependency getArchivedRiskVersionDep() {
        if (this.archivedRiskVersionDep == null) {
        	this.archivedRiskVersionDep = this.getDependencyDef("ArchivedRiskVersion");
        }
        return this.archivedRiskVersionDep;
    }

    @objid ("01cd1416-8f9d-4943-95b1-42d9cd73cfaa")
    public SmDependency getLastRiskVersionDep() {
        if (this.lastRiskVersionDep == null) {
        	this.lastRiskVersionDep = this.getDependencyDef("LastRiskVersion");
        }
        return this.lastRiskVersionDep;
    }

    @objid ("8e1f8a4e-da49-43c4-ac56-6c8a0e69011c")
    private static class RiskObjectFactory implements ISmObjectFactory {
        @objid ("8f9218ae-b2f2-412f-ad7f-fe99cecb330d")
        private RiskSmClass smClass;

        @objid ("0f420d92-77a4-4252-8b4d-bad5a387c2fb")
        public RiskObjectFactory(RiskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("60e4979e-07ea-4d78-a256-4ce5b3189df6")
        @Override
        public ISmObjectData createData() {
            return new RiskData(this.smClass);
        }

        @objid ("8d1089d8-edda-430c-8c12-4811bfc4c2cc")
        @Override
        public SmObjectImpl createImpl() {
            return new RiskImpl();
        }

    }

    @objid ("7c116c96-9e32-4983-99b7-2d0f149ab9c8")
    public static class SubRiskSmDependency extends SmMultipleDependency {
        @objid ("3632fef4-f70f-4b1b-a8eb-4126961cfe88")
        private SmDependency symetricDep;

        @objid ("dae87c00-e652-40d8-a0a4-166d0e0680d1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RiskData)data).mSubRisk != null)? ((RiskData)data).mSubRisk:SmMultipleDependency.EMPTY;
        }

        @objid ("57f92f46-432c-445a-9438-267f772f9c27")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RiskData) data).mSubRisk = values;
        }

        @objid ("cdd9fe01-d94b-494f-8e3d-8feda8159ec7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskSmClass)this.getTarget()).getParentRiskDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3e89a6b3-a1db-47db-83d6-b8a285e28304")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("14ede17d-03e1-4db2-9b31-ce0d4277bc7f")
        private SmDependency symetricDep;

        @objid ("dcbc0ed3-b365-4b2a-b58a-473cde0a7882")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RiskData) data).mOwnerContainer;
        }

        @objid ("988bcf6d-6060-432a-9e1d-9c921ac986ef")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RiskData) data).mOwnerContainer = value;
        }

        @objid ("f86a6c84-9c14-454e-8737-26f115cbb705")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskContainerSmClass)this.getTarget()).getOwnedRiskDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("83adbbe6-3df6-4a2f-a47d-f97d1181d314")
    public static class ParentRiskSmDependency extends SmSingleDependency {
        @objid ("59fa842e-51b7-48c2-8ce3-a1569cc9068c")
        private SmDependency symetricDep;

        @objid ("0e9efe12-ec08-4974-ac79-6797929787dd")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RiskData) data).mParentRisk;
        }

        @objid ("d6487588-34fe-4601-89cc-bc6140e81dcd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RiskData) data).mParentRisk = value;
        }

        @objid ("f6a07522-370c-495d-8992-ec2b959492b9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskSmClass)this.getTarget()).getSubRiskDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("db827254-a716-4fda-876d-b0cf25a1c244")
    public static class ArchivedRiskVersionSmDependency extends SmMultipleDependency {
        @objid ("c6a756c1-db91-48e8-a784-15e5713953c6")
        private SmDependency symetricDep;

        @objid ("03504545-de62-49fc-a645-e3acb04dbb1c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RiskData)data).mArchivedRiskVersion != null)? ((RiskData)data).mArchivedRiskVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("f0dfc437-fd18-46fe-8598-144478ceea31")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RiskData) data).mArchivedRiskVersion = values;
        }

        @objid ("b251b3f6-04ed-45ed-8504-bca681b25571")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskSmClass)this.getTarget()).getLastRiskVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8308e76c-14ac-43bf-adea-20514f10f7f0")
    public static class LastRiskVersionSmDependency extends SmSingleDependency {
        @objid ("43b7085e-3d28-48ea-ae89-5a30567b1f35")
        private SmDependency symetricDep;

        @objid ("5ed1bcb7-4502-49f9-9104-71359c7b9fc2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RiskData) data).mLastRiskVersion;
        }

        @objid ("3eb951e4-a319-4036-ac4d-ab7d9518283e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RiskData) data).mLastRiskVersion = value;
        }

        @objid ("50696d89-ae2c-4d84-83d4-261a6484578e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskSmClass)this.getTarget()).getArchivedRiskVersionDep();
            }
            return this.symetricDep;
        }

    }

}
