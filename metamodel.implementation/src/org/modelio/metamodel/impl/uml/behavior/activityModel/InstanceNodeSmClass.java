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
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("862cba32-9690-4ed1-9234-5f4f1162a549")
public class InstanceNodeSmClass extends ObjectNodeSmClass {
    @objid ("688897c4-01e3-47b4-aedb-ac85b313e7b9")
    public InstanceNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9ffd8de4-136f-441b-a225-a69e5f619864")
    @Override
    public String getName() {
        return "InstanceNode";
    }

    @objid ("1325f7a0-b34b-4c5d-9e9c-8c2b7f606ed6")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7469e640-a630-400d-8a38-8680331efdc4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InstanceNode.class;
    }

    @objid ("2276a36a-8f7c-4a72-b393-4428afaf14ae")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("089abb83-485f-4b5c-8c02-f01e5370206a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("de6a6ca7-b432-4fd8-8fa1-251c5ccf41d0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ObjectNode");
        this.registerFactory(new InstanceNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("cb74d74f-66fb-4384-90a9-4938eb3d7637")
    private static class InstanceNodeObjectFactory implements ISmObjectFactory {
        @objid ("14ad22af-1fba-4956-9361-95de4138e979")
        private InstanceNodeSmClass smClass;

        @objid ("92ef9206-7ab0-41c2-b7cc-4f25c96e01be")
        public InstanceNodeObjectFactory(InstanceNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("93c958e8-e2bd-4583-a60b-ec688d5d75b8")
        @Override
        public ISmObjectData createData() {
            return new InstanceNodeData(this.smClass);
        }

        @objid ("f19a61d1-1614-4d5f-8e68-73d8113fd41d")
        @Override
        public SmObjectImpl createImpl() {
            return new InstanceNodeImpl();
        }

    }

}
