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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionRegionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
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

@objid ("ce238240-a882-429d-80cd-99a484941658")
public class ExpansionNodeSmClass extends ObjectNodeSmClass {
    @objid ("e3598003-7157-4945-bbf6-a93c27832cb4")
    private SmDependency regionAsOutputDep;

    @objid ("e4789a41-84d7-4540-998b-d7444f833efd")
    private SmDependency regionAsInputDep;

    @objid ("602e42da-a615-408d-a3e9-9bc9ed1138e3")
    public ExpansionNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6c0e067a-1e48-4889-8c2f-0aa2f987d602")
    @Override
    public String getName() {
        return "ExpansionNode";
    }

    @objid ("338d3e4e-3796-4c6d-adf2-5ff5b01083fa")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("08df5d53-6cf6-43af-90a5-5aa20d60dcf0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExpansionNode.class;
    }

    @objid ("0d89002a-70a5-4abf-a3cf-bad4942d48da")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("51db3dc4-1c5c-416a-b7cb-11f1ef54e0cb")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("81aea58c-58bd-4ee9-9878-02e6f91d94e6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ObjectNode");
        this.registerFactory(new ExpansionNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.regionAsOutputDep = new RegionAsOutputSmDependency();
        this.regionAsOutputDep.init("RegionAsOutput", this, metamodel.getMClass("ExpansionRegion"), 0, 1 );
        registerDependency(this.regionAsOutputDep);
        
        this.regionAsInputDep = new RegionAsInputSmDependency();
        this.regionAsInputDep.init("RegionAsInput", this, metamodel.getMClass("ExpansionRegion"), 0, 1 );
        registerDependency(this.regionAsInputDep);
    }

    @objid ("2ce8af43-8d83-40a8-ad1a-0dc28ab51370")
    public SmDependency getRegionAsOutputDep() {
        if (this.regionAsOutputDep == null) {
        	this.regionAsOutputDep = this.getDependencyDef("RegionAsOutput");
        }
        return this.regionAsOutputDep;
    }

    @objid ("1918bc16-f714-4736-a6bf-06553bb35dd5")
    public SmDependency getRegionAsInputDep() {
        if (this.regionAsInputDep == null) {
        	this.regionAsInputDep = this.getDependencyDef("RegionAsInput");
        }
        return this.regionAsInputDep;
    }

    @objid ("f804111b-ded2-4c5e-a9b5-71caf0b29602")
    private static class ExpansionNodeObjectFactory implements ISmObjectFactory {
        @objid ("21fbd46f-53c6-48ae-a8d7-78b0b4f015a1")
        private ExpansionNodeSmClass smClass;

        @objid ("d8e908cc-a636-4709-a119-6e0e64f047ab")
        public ExpansionNodeObjectFactory(ExpansionNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a594b720-38e9-4f0f-ad55-9d4adcac9afc")
        @Override
        public ISmObjectData createData() {
            return new ExpansionNodeData(this.smClass);
        }

        @objid ("9c8857df-854e-453d-baef-96867744915f")
        @Override
        public SmObjectImpl createImpl() {
            return new ExpansionNodeImpl();
        }

    }

    @objid ("98e0e380-7759-4a36-89f4-fafa570fc904")
    public static class RegionAsOutputSmDependency extends SmSingleDependency {
        @objid ("90d9efa0-3d46-4b9c-9bc8-02c146d3c6bb")
        private SmDependency symetricDep;

        @objid ("88598a2d-40c5-4dd9-9796-739e63391a58")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExpansionNodeData) data).mRegionAsOutput;
        }

        @objid ("7510c846-3902-40fb-a187-4b1beb1f4717")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExpansionNodeData) data).mRegionAsOutput = value;
        }

        @objid ("337c56e7-fa92-408f-bfb3-332d2cd532a8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExpansionRegionSmClass)this.getTarget()).getOutputElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4722885f-db9e-446f-bda7-7d9861ba76b9")
    public static class RegionAsInputSmDependency extends SmSingleDependency {
        @objid ("54abdbe2-ffe9-4010-bef2-8d4d02af2966")
        private SmDependency symetricDep;

        @objid ("944ba0dc-3e6d-47b9-9221-83f85f166388")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExpansionNodeData) data).mRegionAsInput;
        }

        @objid ("8c6a6ec5-a827-4446-8836-cc57141cd093")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExpansionNodeData) data).mRegionAsInput = value;
        }

        @objid ("0fbc448e-c03f-4572-a9be-e7162318f800")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExpansionRegionSmClass)this.getTarget()).getInputElementDep();
            }
            return this.symetricDep;
        }

    }

}
