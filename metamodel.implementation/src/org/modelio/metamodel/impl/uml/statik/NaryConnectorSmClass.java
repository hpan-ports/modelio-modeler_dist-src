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
import org.modelio.metamodel.impl.uml.statik.BindingSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkSmClass;
import org.modelio.metamodel.uml.statik.NaryConnector;
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

@objid ("c774246a-dc30-43bf-bb73-ffd464368bca")
public class NaryConnectorSmClass extends NaryLinkSmClass {
    @objid ("3f5ccfb2-e263-4762-82dc-8241237dc4b2")
    private SmDependency representationDep;

    @objid ("af850d63-dbc5-49f6-87a0-a304bdc73135")
    private SmDependency representedFeatureDep;

    @objid ("da3a51c0-9e12-43c1-807a-41b146675851")
    public NaryConnectorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1db00941-7aef-4bb4-9ab6-e63994d8faa0")
    @Override
    public String getName() {
        return "NaryConnector";
    }

    @objid ("0e0e4881-83e6-48bb-8e61-4e8c624d64ce")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c455c947-02ec-4dee-b002-0aeddfd1f448")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NaryConnector.class;
    }

    @objid ("5fa01b0f-3ef9-4c5b-b5b2-dbc117f78b56")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a9fc99e2-cfd0-4830-a53d-d22dfc2cbb22")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8a538392-4a84-4a5b-afeb-91f93a37dc06")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("NaryLink");
        this.registerFactory(new NaryConnectorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representationDep = new RepresentationSmDependency();
        this.representationDep.init("Representation", this, metamodel.getMClass("Binding"), 0, -1 );
        registerDependency(this.representationDep);
        
        this.representedFeatureDep = new RepresentedFeatureSmDependency();
        this.representedFeatureDep.init("RepresentedFeature", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedFeatureDep);
    }

    @objid ("9a8b9795-ff78-4464-a961-925435bd0843")
    public SmDependency getRepresentationDep() {
        if (this.representationDep == null) {
        	this.representationDep = this.getDependencyDef("Representation");
        }
        return this.representationDep;
    }

    @objid ("2e0a3a7e-d25e-4290-aea3-9788b52b3923")
    public SmDependency getRepresentedFeatureDep() {
        if (this.representedFeatureDep == null) {
        	this.representedFeatureDep = this.getDependencyDef("RepresentedFeature");
        }
        return this.representedFeatureDep;
    }

    @objid ("50dd1596-abb7-4889-8a74-73af1e4492bc")
    private static class NaryConnectorObjectFactory implements ISmObjectFactory {
        @objid ("78876cae-bfb8-4981-be1e-a5f4b53b859b")
        private NaryConnectorSmClass smClass;

        @objid ("dd6eecc8-1dc5-42d9-b17f-391916d516b3")
        public NaryConnectorObjectFactory(NaryConnectorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0db2e78d-03fb-472a-b410-5e34fe51a48d")
        @Override
        public ISmObjectData createData() {
            return new NaryConnectorData(this.smClass);
        }

        @objid ("e7f7140b-5ed9-4104-8f96-0bd0fab86a8f")
        @Override
        public SmObjectImpl createImpl() {
            return new NaryConnectorImpl();
        }

    }

    @objid ("8dcb8abd-bda3-49fa-b266-073d06a43772")
    public static class RepresentationSmDependency extends SmMultipleDependency {
        @objid ("e848c47f-8cc5-4f7b-a54e-bf983a89eaca")
        private SmDependency symetricDep;

        @objid ("98e308a0-072d-431d-9d30-fa7cb263e96a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NaryConnectorData)data).mRepresentation != null)? ((NaryConnectorData)data).mRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("fa84c250-e8a8-4767-aca6-4b9ded051efe")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NaryConnectorData) data).mRepresentation = values;
        }

        @objid ("4158d637-3a70-4b4c-a3f8-cfd6fc50f30c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindingSmClass)this.getTarget()).getConnectorRoleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f2c19446-2cd4-45e6-8836-d741010b8a50")
    public static class RepresentedFeatureSmDependency extends SmSingleDependency {
        @objid ("5f73cbe9-4697-4e1a-aca7-3a6ed9ed7d60")
        private SmDependency symetricDep;

        @objid ("f93dfd76-4f0d-431f-a289-015217a5b93b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NaryConnectorData) data).mRepresentedFeature;
        }

        @objid ("25e7020c-e149-44f3-a825-402601fbfc4c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NaryConnectorData) data).mRepresentedFeature = value;
        }

        @objid ("7105ead1-3d87-4930-977f-0599a0723794")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getRepresentingConnectorDep();
            }
            return this.symetricDep;
        }

    }

}
