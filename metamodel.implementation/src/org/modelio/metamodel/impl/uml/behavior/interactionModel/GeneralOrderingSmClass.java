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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
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

@objid ("23872769-b62e-47ff-875f-f283aa96d3a6")
public class GeneralOrderingSmClass extends ElementSmClass {
    @objid ("d71495c9-909b-4c1a-8168-2527d4e00844")
    private SmDependency beforeDep;

    @objid ("0439407a-9be5-4953-8750-b3cf6d5a27ac")
    private SmDependency afterDep;

    @objid ("97c89b2c-5a81-42c6-89ef-f4ec70f19b60")
    public GeneralOrderingSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c430eb86-6254-4e4f-acdf-a0b886cd4b61")
    @Override
    public String getName() {
        return "GeneralOrdering";
    }

    @objid ("2ec5827d-07ed-49a4-b80b-30e2460a842b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ab1aff13-ac63-4ff5-bad0-e59e90f8a2ae")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return GeneralOrdering.class;
    }

    @objid ("1d7d292d-b769-41ea-bab3-26e02441ee7c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("36643e9a-ea11-4a2e-859f-7295c3d057a8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("418ffd53-2444-4f60-a1b8-8c02e6ba5cf5")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new GeneralOrderingObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.beforeDep = new BeforeSmDependency();
        this.beforeDep.init("Before", this, metamodel.getMClass("OccurrenceSpecification"), 1, 1 );
        registerDependency(this.beforeDep);
        
        this.afterDep = new AfterSmDependency();
        this.afterDep.init("After", this, metamodel.getMClass("OccurrenceSpecification"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.afterDep);
    }

    @objid ("7719ab7b-1794-4a5d-a1bf-3027d575384d")
    public SmDependency getBeforeDep() {
        if (this.beforeDep == null) {
        	this.beforeDep = this.getDependencyDef("Before");
        }
        return this.beforeDep;
    }

    @objid ("b07a3561-9417-4ab5-8964-b20f71103f7b")
    public SmDependency getAfterDep() {
        if (this.afterDep == null) {
        	this.afterDep = this.getDependencyDef("After");
        }
        return this.afterDep;
    }

    @objid ("aee13e65-72ce-40f5-8725-1739f0cccf5a")
    private static class GeneralOrderingObjectFactory implements ISmObjectFactory {
        @objid ("2c6d1c99-64d3-4e86-82d5-1d9f068afe23")
        private GeneralOrderingSmClass smClass;

        @objid ("7638e8c5-092c-45dd-92fa-ef4b41a1bc0f")
        public GeneralOrderingObjectFactory(GeneralOrderingSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8243d9fc-3781-4c49-ad2d-36c5c18a71da")
        @Override
        public ISmObjectData createData() {
            return new GeneralOrderingData(this.smClass);
        }

        @objid ("13271704-154e-41f5-8d3a-e148a3e77627")
        @Override
        public SmObjectImpl createImpl() {
            return new GeneralOrderingImpl();
        }

    }

    @objid ("f4175aae-267c-4069-b127-23f0b436f7e3")
    public static class BeforeSmDependency extends SmSingleDependency {
        @objid ("1b8fcbb2-90fc-47b2-af74-71fd1653e807")
        private SmDependency symetricDep;

        @objid ("0b5694b8-cfcb-449e-8dfb-2f017ca19040")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GeneralOrderingData) data).mBefore;
        }

        @objid ("09a1d149-c26a-45d3-8d72-45b77ed6ee37")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GeneralOrderingData) data).mBefore = value;
        }

        @objid ("34017af9-8cd0-4b0d-9565-308393b1e6fa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OccurrenceSpecificationSmClass)this.getTarget()).getToAfterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9f9f433d-dc93-437c-a7ab-5c7d11986366")
    public static class AfterSmDependency extends SmSingleDependency {
        @objid ("a0fb049e-1608-425f-b781-380e762ed58a")
        private SmDependency symetricDep;

        @objid ("9b5abff2-b40b-4398-9ff8-22efd48a4b00")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GeneralOrderingData) data).mAfter;
        }

        @objid ("f0c222f8-18d1-4855-b31c-5c977d2967dc")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GeneralOrderingData) data).mAfter = value;
        }

        @objid ("33435769-e813-46b5-ab37-d25797c35136")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OccurrenceSpecificationSmClass)this.getTarget()).getToBeforeDep();
            }
            return this.symetricDep;
        }

    }

}
