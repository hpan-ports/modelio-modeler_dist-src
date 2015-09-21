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
import org.modelio.metamodel.impl.uml.statik.ClassSmClass;
import org.modelio.metamodel.impl.uml.statik.ComponentRealizationSmClass;
import org.modelio.metamodel.uml.statik.Component;
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

@objid ("be561684-0faa-4b90-a406-2ee10bd255a4")
public class ComponentSmClass extends ClassSmClass {
    @objid ("579e7cc0-877c-4859-bb8c-bc34230cd5cf")
    private SmDependency realizationDep;

    @objid ("035d7410-11fc-4971-b946-a7670c803a83")
    public ComponentSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("652af268-c6f6-4c96-a623-63a62157652b")
    @Override
    public String getName() {
        return "Component";
    }

    @objid ("307e8278-9811-4ede-8973-7ebe7a3b57e8")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3e7fac0c-ef95-4b0d-8bda-c1ab9f779e40")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Component.class;
    }

    @objid ("ec018ef4-1ed1-4587-ab6e-2902bdc2e2e7")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("d686a2a8-70de-40c4-a548-b5227205f67e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ce025f22-ba8d-448c-986c-fe074654af2a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Class");
        this.registerFactory(new ComponentObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.realizationDep = new RealizationSmDependency();
        this.realizationDep.init("Realization", this, metamodel.getMClass("ComponentRealization"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.realizationDep);
    }

    @objid ("e489a08d-e11b-4b5e-9544-68d8d572f79e")
    public SmDependency getRealizationDep() {
        if (this.realizationDep == null) {
        	this.realizationDep = this.getDependencyDef("Realization");
        }
        return this.realizationDep;
    }

    @objid ("c0eae424-b6d8-467f-b655-7877dff7cca8")
    private static class ComponentObjectFactory implements ISmObjectFactory {
        @objid ("85e9a33d-ef60-4328-9d65-60460727bf92")
        private ComponentSmClass smClass;

        @objid ("c881ddb6-17cb-4080-964d-5ff611aae038")
        public ComponentObjectFactory(ComponentSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ca821fd8-2167-4101-b14e-5e7ee512417f")
        @Override
        public ISmObjectData createData() {
            return new ComponentData(this.smClass);
        }

        @objid ("237c4782-a4e6-44b7-908f-f7357790b8fc")
        @Override
        public SmObjectImpl createImpl() {
            return new ComponentImpl();
        }

    }

    @objid ("735128a4-c8f6-4e5c-8a7b-94d235753196")
    public static class RealizationSmDependency extends SmMultipleDependency {
        @objid ("8786771d-6381-46fe-b2e9-c8a7b80a7646")
        private SmDependency symetricDep;

        @objid ("cd27a310-c74b-46bb-bada-3d59667235fe")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ComponentData)data).mRealization != null)? ((ComponentData)data).mRealization:SmMultipleDependency.EMPTY;
        }

        @objid ("075b73ff-6d36-41d5-92f8-f89386657788")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ComponentData) data).mRealization = values;
        }

        @objid ("013dac92-c132-478f-afbc-2b3d693f002b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ComponentRealizationSmClass)this.getTarget()).getAbstractionDep();
            }
            return this.symetricDep;
        }

    }

}
