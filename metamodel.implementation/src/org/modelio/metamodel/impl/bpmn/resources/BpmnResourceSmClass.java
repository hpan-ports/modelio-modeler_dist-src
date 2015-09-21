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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
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

@objid ("c1f59956-870a-44c7-bfe4-146d808cbdbe")
public class BpmnResourceSmClass extends BpmnRootElementSmClass {
    @objid ("fec5ecf2-dae8-4208-8ea0-9bdf4ca0cf63")
    private SmDependency resourceroleRefsDep;

    @objid ("7fc53c5c-e9e8-4ac6-9404-2b93982eacf7")
    private SmDependency parameterDep;

    @objid ("1bb79a35-c8d2-46a1-bb49-6bf917d8fa92")
    public BpmnResourceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("eecd4778-ca58-44ee-bbda-ae7f93e635c9")
    @Override
    public String getName() {
        return "BpmnResource";
    }

    @objid ("114001c5-970b-4999-a15b-99daff64a61b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f3fb1e43-e442-470d-9766-31112e2589e0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnResource.class;
    }

    @objid ("334c36ec-570d-4d17-bc7f-ce2608a7b523")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("407e4330-ff4f-458c-bb08-095196b89dbf")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("867b8aba-1e42-45a0-b87a-9f67bf0b4abb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnRootElement");
        this.registerFactory(new BpmnResourceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.resourceroleRefsDep = new ResourceroleRefsSmDependency();
        this.resourceroleRefsDep.init("ResourceroleRefs", this, metamodel.getMClass("BpmnResourceRole"), 0, -1 );
        registerDependency(this.resourceroleRefsDep);
        
        this.parameterDep = new ParameterSmDependency();
        this.parameterDep.init("Parameter", this, metamodel.getMClass("BpmnResourceParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.parameterDep);
    }

    @objid ("a803ad00-727b-4eb7-98b5-1ad822a72a71")
    public SmDependency getResourceroleRefsDep() {
        if (this.resourceroleRefsDep == null) {
        	this.resourceroleRefsDep = this.getDependencyDef("ResourceroleRefs");
        }
        return this.resourceroleRefsDep;
    }

    @objid ("be4543bb-d07d-48a9-82f7-12a03b0ea658")
    public SmDependency getParameterDep() {
        if (this.parameterDep == null) {
        	this.parameterDep = this.getDependencyDef("Parameter");
        }
        return this.parameterDep;
    }

    @objid ("f0c3b4f7-a4db-4f14-a686-bf69a30bdac1")
    private static class BpmnResourceObjectFactory implements ISmObjectFactory {
        @objid ("443f91ba-a42a-4da3-a6ac-d634846cb4d4")
        private BpmnResourceSmClass smClass;

        @objid ("c0992dcc-c240-41f0-b7c2-4014fb951098")
        public BpmnResourceObjectFactory(BpmnResourceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("7939e1d1-0673-4c86-89a5-457a3d7a3214")
        @Override
        public ISmObjectData createData() {
            return new BpmnResourceData(this.smClass);
        }

        @objid ("9ddf0a77-6090-471b-bf7a-fcbc6be41781")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnResourceImpl();
        }

    }

    @objid ("92c03e5d-972f-4b96-9e19-6807f7fb0e59")
    public static class ResourceroleRefsSmDependency extends SmMultipleDependency {
        @objid ("d501e54a-a26e-4853-942b-27c8d6353cc5")
        private SmDependency symetricDep;

        @objid ("faa840e9-222a-4def-a5df-12a2c79efdca")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnResourceData)data).mResourceroleRefs != null)? ((BpmnResourceData)data).mResourceroleRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("8aa6af78-ba05-42ae-a219-24c612728ee9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnResourceData) data).mResourceroleRefs = values;
        }

        @objid ("228422e1-c319-4ba4-b94e-06bf6b990fd2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceRoleSmClass)this.getTarget()).getResourceRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("120c6384-09f8-4e78-84a7-059e2bd54604")
    public static class ParameterSmDependency extends SmMultipleDependency {
        @objid ("d38b50a9-a44b-4fdb-beb6-01ac985785e1")
        private SmDependency symetricDep;

        @objid ("71af0e83-dc21-47aa-988d-98397f189fa4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnResourceData)data).mParameter != null)? ((BpmnResourceData)data).mParameter:SmMultipleDependency.EMPTY;
        }

        @objid ("1f87e2c2-0635-4e9d-8d17-9a6a9ec65435")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnResourceData) data).mParameter = values;
        }

        @objid ("8a6382d7-3b21-4eed-b8dc-414eddfc1d05")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceParameterSmClass)this.getTarget()).getResourceDep();
            }
            return this.symetricDep;
        }

    }

}
