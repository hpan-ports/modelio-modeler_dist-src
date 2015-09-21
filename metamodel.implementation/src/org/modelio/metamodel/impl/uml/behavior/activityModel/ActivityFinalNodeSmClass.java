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
import org.modelio.metamodel.impl.uml.behavior.activityModel.FinalNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0e2fb08a-7baa-443b-b80d-f9ba53347a78")
public class ActivityFinalNodeSmClass extends FinalNodeSmClass {
    @objid ("13e610dd-fa03-4498-968f-35d5bbfd6f4e")
    public ActivityFinalNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a52666d7-31e7-4cf1-8ddf-b5f263ae56f0")
    @Override
    public String getName() {
        return "ActivityFinalNode";
    }

    @objid ("848d0397-8481-47b7-89dc-3bd3adc00c26")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("892852fc-40e8-44a6-adac-577097423547")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityFinalNode.class;
    }

    @objid ("3cd273f0-074e-432e-a515-e3a8e70cd09d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("637d0fd4-1578-46ba-b9d9-202b774acfb3")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3f593358-d453-4f28-9a16-a860e72de424")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("FinalNode");
        this.registerFactory(new ActivityFinalNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("6c0c5baf-800f-4ed7-98f1-d2986d8d0baa")
    private static class ActivityFinalNodeObjectFactory implements ISmObjectFactory {
        @objid ("bf410c2d-ffe7-48ee-b72c-9c8dda3ddf6a")
        private ActivityFinalNodeSmClass smClass;

        @objid ("f98f579e-4914-4328-8325-e3929a6dbfae")
        public ActivityFinalNodeObjectFactory(ActivityFinalNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4208ce99-4c90-408c-af64-ba46a2531933")
        @Override
        public ISmObjectData createData() {
            return new ActivityFinalNodeData(this.smClass);
        }

        @objid ("2eabe694-269b-40bd-98d3-b328a4be08bc")
        @Override
        public SmObjectImpl createImpl() {
            return new ActivityFinalNodeImpl();
        }

    }

}
