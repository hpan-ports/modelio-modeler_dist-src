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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivitySmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
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

@objid ("22b4d7a0-d812-413f-9aa3-c308aab80b35")
public class ActivityGroupSmClass extends ModelElementSmClass {
    @objid ("42b92fad-4b40-48e1-acec-303130339f74")
    private SmDependency inActivityDep;

    @objid ("cc50ffcc-1b39-45b5-acc3-43a961a0e38c")
    public ActivityGroupSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e6b83a44-9deb-42dd-a130-988fa8631a0d")
    @Override
    public String getName() {
        return "ActivityGroup";
    }

    @objid ("66ac8713-2019-4ffc-84d9-9d7c6e1f2e6f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d1ff3f4c-bef4-4dfd-ab04-5fde2aa71203")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityGroup.class;
    }

    @objid ("337bca33-df7b-4567-b0ef-cae97cdb51b8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b82d4bfc-9640-4cc3-9c70-d6ff3de0297e")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("788b45da-cd25-4c2b-8209-5ac4a6302b27")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ActivityGroupObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.inActivityDep = new InActivitySmDependency();
        this.inActivityDep.init("InActivity", this, metamodel.getMClass("Activity"), 0, 1 );
        registerDependency(this.inActivityDep);
    }

    @objid ("0a71fc86-c444-4b7a-bf3a-5ea5d4038190")
    public SmDependency getInActivityDep() {
        if (this.inActivityDep == null) {
        	this.inActivityDep = this.getDependencyDef("InActivity");
        }
        return this.inActivityDep;
    }

    @objid ("9fd8cc8c-3ebf-46ce-9abc-a074e0fd3397")
    private static class ActivityGroupObjectFactory implements ISmObjectFactory {
        @objid ("c32f57c4-47c1-4ae0-bfdc-d44570650d4d")
        private ActivityGroupSmClass smClass;

        @objid ("3e2e260a-892b-432d-b32b-810399fb02e1")
        public ActivityGroupObjectFactory(ActivityGroupSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("77da6f2b-3269-455e-ba6a-75aceba97e0a")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("7969da2c-9876-4687-8ba1-060c6ceefe3c")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("7268552e-120a-4235-b601-2b4bc3a92dbc")
    public static class InActivitySmDependency extends SmSingleDependency {
        @objid ("12d705a6-0944-444f-b894-59b2cefb560c")
        private SmDependency symetricDep;

        @objid ("6fc493e6-1ea9-4ff7-8876-24eac493e5f9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityGroupData) data).mInActivity;
        }

        @objid ("16eb765a-487c-4c6b-9e59-fd3c9b652faf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityGroupData) data).mInActivity = value;
        }

        @objid ("e5d6a49b-5092-42dd-961f-49723f672ce1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivitySmClass)this.getTarget()).getOwnedGroupDep();
            }
            return this.symetricDep;
        }

    }

}
