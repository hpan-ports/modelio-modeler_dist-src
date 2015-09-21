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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b0385a6c-1cd1-4e16-a2d8-4b18d6303053")
public class ActivityParameterNodeSmClass extends ObjectNodeSmClass {
    @objid ("8887dcb2-6887-4ea0-bce0-fe6bcb5bf29e")
    public ActivityParameterNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("cbc09307-3a18-4480-a5b1-9b6f356f1d14")
    @Override
    public String getName() {
        return "ActivityParameterNode";
    }

    @objid ("8e73ab42-ec73-4d65-8a82-913d445011a5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7dafc090-55b2-4b36-b5d6-217ea2fd3458")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityParameterNode.class;
    }

    @objid ("7bf8dd75-68cd-4a61-b1bc-7d193b8d908e")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("2ee8b30e-e74d-4bfe-9d65-8b09a8129579")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b764c940-423c-4c0f-849f-841916e496fb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ObjectNode");
        this.registerFactory(new ActivityParameterNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("c3966cb2-08ac-431b-9603-049341d83526")
    private static class ActivityParameterNodeObjectFactory implements ISmObjectFactory {
        @objid ("84a99623-4fdd-4690-b9ca-fd4cd0547492")
        private ActivityParameterNodeSmClass smClass;

        @objid ("57e856b4-8844-4994-aa34-d086ebab5db2")
        public ActivityParameterNodeObjectFactory(ActivityParameterNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ee28bc2a-62a4-4c82-85b2-2e7a072b6bba")
        @Override
        public ISmObjectData createData() {
            return new ActivityParameterNodeData(this.smClass);
        }

        @objid ("030f3c58-b6d3-4bff-9437-88a3513b5826")
        @Override
        public SmObjectImpl createImpl() {
            return new ActivityParameterNodeImpl();
        }

    }

}
