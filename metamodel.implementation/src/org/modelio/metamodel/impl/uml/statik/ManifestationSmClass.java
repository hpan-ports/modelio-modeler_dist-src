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
import org.modelio.metamodel.impl.uml.statik.ArtifactSmClass;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("4f4fd4c5-a171-4fa9-899d-85c75ae4e972")
public class ManifestationSmClass extends ModelElementSmClass {
    @objid ("178902dd-d974-4aad-bcf0-f653a0e5bcc1")
    private SmDependency utilizedElementDep;

    @objid ("cdb32ff1-6622-4153-8399-26582602d407")
    private SmDependency ownerDep;

    @objid ("73f027da-fa46-4d94-a90e-7ac6acc40bcb")
    public ManifestationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("aaf8a04c-f079-4d5b-ba18-aa2b81d84740")
    @Override
    public String getName() {
        return "Manifestation";
    }

    @objid ("be489460-5bf2-430a-9ce4-2a894d7660a5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5581cb9c-3561-49ed-b8e5-d4a44fd74b8a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Manifestation.class;
    }

    @objid ("e8629254-cda1-40fc-b3b6-717fac0750c6")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cb18757b-5625-4919-b336-e517ab312676")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("79ef2354-e2fc-4305-a650-af16689873b4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ManifestationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.utilizedElementDep = new UtilizedElementSmDependency();
        this.utilizedElementDep.init("UtilizedElement", this, metamodel.getMClass("ModelElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.utilizedElementDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Artifact"), 1, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("ec7e51aa-d39a-4a58-b357-7b81b251c4aa")
    public SmDependency getUtilizedElementDep() {
        if (this.utilizedElementDep == null) {
        	this.utilizedElementDep = this.getDependencyDef("UtilizedElement");
        }
        return this.utilizedElementDep;
    }

    @objid ("57568174-2810-4125-943b-c92cc3f4f6b3")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("30b02caa-8491-43a5-ac5a-275828170707")
    private static class ManifestationObjectFactory implements ISmObjectFactory {
        @objid ("93192a66-fe56-4d72-978f-e1a3c2f1ef18")
        private ManifestationSmClass smClass;

        @objid ("304a1968-4e61-4ac5-832d-33a5ec50fd50")
        public ManifestationObjectFactory(ManifestationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0b254839-88dc-4d0a-a487-6dd9c08914f7")
        @Override
        public ISmObjectData createData() {
            return new ManifestationData(this.smClass);
        }

        @objid ("2177f02a-03bf-4467-b242-0b95c67c54bc")
        @Override
        public SmObjectImpl createImpl() {
            return new ManifestationImpl();
        }

    }

    @objid ("261d32d7-7b9a-4343-a7df-0d41f64690bf")
    public static class UtilizedElementSmDependency extends SmSingleDependency {
        @objid ("095fe406-027b-4e2c-b65f-8c4c2d4f08fd")
        private SmDependency symetricDep;

        @objid ("3d34b612-89cd-426c-b107-b5cbdf1c0bc8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ManifestationData) data).mUtilizedElement;
        }

        @objid ("eda98eab-3800-4303-b21d-955e7368eff9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ManifestationData) data).mUtilizedElement = value;
        }

        @objid ("eaa5e2b1-f9e7-4e25-87fc-cbd456459ec9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getManifestingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cc881641-00dc-4b94-933e-9507fe6ad467")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("95832af8-f442-4b90-804b-c933f63f1645")
        private SmDependency symetricDep;

        @objid ("52e515ad-24eb-479e-9cea-af7d107985fa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ManifestationData) data).mOwner;
        }

        @objid ("f5606ab5-8d3a-4d0b-99d2-c2bda391441c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ManifestationData) data).mOwner = value;
        }

        @objid ("7143f5ff-56a8-4320-8e3b-7f1b10bc696e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ArtifactSmClass)this.getTarget()).getUtilizedDep();
            }
            return this.symetricDep;
        }

    }

}
