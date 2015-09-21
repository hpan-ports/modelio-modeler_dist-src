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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0363e7b8-f4aa-486c-99ad-34c234137424")
public class DependencySmClass extends ModelElementSmClass {
    @objid ("8433d700-3fef-42d3-b605-b737d5ceca58")
    private SmAttribute dependsOnIdAtt;

    @objid ("67950a89-e67d-4e4a-8955-480208accf60")
    private SmAttribute dependsOnNameAtt;

    @objid ("c4ea9567-4b11-4bf1-af3e-a919fc227c00")
    private SmDependency dependsOnDep;

    @objid ("70a136a8-65cf-470e-90c7-af036b95d823")
    private SmDependency impactedDep;

    @objid ("3c941879-3ef0-4801-b560-3c7238b9753d")
    public DependencySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5ae8befb-6503-4347-b3b7-55673e0143ac")
    @Override
    public String getName() {
        return "Dependency";
    }

    @objid ("6a4fa052-6a42-42d0-8c9a-bb6120ed2187")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8ed688b1-5178-4daa-b4a7-6f47b0376abe")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Dependency.class;
    }

    @objid ("6e31d766-fb7e-4aeb-b13a-a34d8c69a899")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d6af1d09-5885-4afb-a694-7a11ba0c287f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("31d9de08-7a7e-4b44-bad8-8c793caf7ea8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new DependencyObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.dependsOnIdAtt = new DependsOnIdSmAttribute();
        this.dependsOnIdAtt.init("DependsOnId", this, String.class , SmDirective.FPINDEXED);
        registerAttribute(this.dependsOnIdAtt);
        
        this.dependsOnNameAtt = new DependsOnNameSmAttribute();
        this.dependsOnNameAtt.init("DependsOnName", this, String.class );
        registerAttribute(this.dependsOnNameAtt);
        
        
        // Initialize and register the SmDependency
        this.dependsOnDep = new DependsOnSmDependency();
        this.dependsOnDep.init("DependsOn", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.dependsOnDep);
        
        this.impactedDep = new ImpactedSmDependency();
        this.impactedDep.init("Impacted", this, metamodel.getMClass("ModelElement"), 1, 1 );
        registerDependency(this.impactedDep);
    }

    @objid ("390a35bc-ee2b-4fc0-8608-30b327c3bc13")
    public SmAttribute getDependsOnIdAtt() {
        if (this.dependsOnIdAtt == null) {
        	this.dependsOnIdAtt = this.getAttributeDef("DependsOnId");
        }
        return this.dependsOnIdAtt;
    }

    @objid ("96636722-fbcf-4e2a-96b0-5bb97d71baf0")
    public SmAttribute getDependsOnNameAtt() {
        if (this.dependsOnNameAtt == null) {
        	this.dependsOnNameAtt = this.getAttributeDef("DependsOnName");
        }
        return this.dependsOnNameAtt;
    }

    @objid ("c18c8d28-8713-4757-84cb-b088f07d2402")
    public SmDependency getDependsOnDep() {
        if (this.dependsOnDep == null) {
        	this.dependsOnDep = this.getDependencyDef("DependsOn");
        }
        return this.dependsOnDep;
    }

    @objid ("4134b7d5-2944-4188-8f7f-f46a2e2b946c")
    public SmDependency getImpactedDep() {
        if (this.impactedDep == null) {
        	this.impactedDep = this.getDependencyDef("Impacted");
        }
        return this.impactedDep;
    }

    @objid ("9809b5c4-0611-43fa-8af6-88df2ab6089e")
    private static class DependencyObjectFactory implements ISmObjectFactory {
        @objid ("d7011db5-51f0-4f47-8142-bc27fbbe6d45")
        private DependencySmClass smClass;

        @objid ("b36ad3ca-e69b-47ae-89b9-0f1b03c303cc")
        public DependencyObjectFactory(DependencySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3965c5bf-7a3f-4a56-ac59-8fbdbd33b544")
        @Override
        public ISmObjectData createData() {
            return new DependencyData(this.smClass);
        }

        @objid ("6cb8ec8f-9eb2-44ed-ac6d-df9b2777ea88")
        @Override
        public SmObjectImpl createImpl() {
            return new DependencyImpl();
        }

    }

    @objid ("66fc9d81-60a6-46fe-ac2d-62c020d2d935")
    public static class DependsOnIdSmAttribute extends SmAttribute {
        @objid ("093dac2a-24b5-40e4-8ef5-3525384d7572")
        public Object getValue(ISmObjectData data) {
            return ((DependencyData) data).mDependsOnId;
        }

        @objid ("41f9aee9-623e-4fef-96e4-0d094506c49c")
        public void setValue(ISmObjectData data, Object value) {
            ((DependencyData) data).mDependsOnId = value;
        }

    }

    @objid ("1aa24168-a4f9-4524-9757-e0d7a89765f5")
    public static class DependsOnNameSmAttribute extends SmAttribute {
        @objid ("56f3d52a-48d7-409b-87ba-c7fda3552e43")
        public Object getValue(ISmObjectData data) {
            return ((DependencyData) data).mDependsOnName;
        }

        @objid ("fb723205-6d63-4825-b476-600262a926a9")
        public void setValue(ISmObjectData data, Object value) {
            ((DependencyData) data).mDependsOnName = value;
        }

    }

    @objid ("dd257374-2599-4653-94a4-696b9e935e89")
    public static class DependsOnSmDependency extends SmSingleDependency {
        @objid ("baafec60-55b0-4279-93cb-8cf4ce68e8c4")
        private SmDependency symetricDep;

        @objid ("35f8693c-6800-4fbe-a688-653dc123b565")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DependencyData) data).mDependsOn;
        }

        @objid ("ae4bff26-6232-4985-a5e0-ab2c6aa12982")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DependencyData) data).mDependsOn = value;
        }

        @objid ("78e03182-7361-4eaa-ba5a-daaeb6f95733")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getImpactedDependencyDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0a97100e-7c1b-4dbd-8a93-86678a73148d")
    public static class ImpactedSmDependency extends SmSingleDependency {
        @objid ("7fdf923e-c1f8-4145-895d-8a27b2606282")
        private SmDependency symetricDep;

        @objid ("ace6cf38-53f6-4edb-ad3c-c3e256dec48a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DependencyData) data).mImpacted;
        }

        @objid ("c8af4738-48c9-4805-85c5-ecd14dea2c8e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DependencyData) data).mImpacted = value;
        }

        @objid ("3f73638f-537c-4401-90a4-220dded2ea58")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getDependsOnDependencyDep();
            }
            return this.symetricDep;
        }

    }

}
