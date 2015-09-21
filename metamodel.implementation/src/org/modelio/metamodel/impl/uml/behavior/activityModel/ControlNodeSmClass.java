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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ControlNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("3cdd22d4-0911-4788-b3a1-dd23e0f8fe44")
public class ControlNodeSmClass extends ActivityNodeSmClass {
    @objid ("c458386c-c434-4f03-8224-d76bef7e3815")
    public ControlNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1b04b63a-4976-432f-923a-f552783648a4")
    @Override
    public String getName() {
        return "ControlNode";
    }

    @objid ("6a35297c-6cfd-49d2-af35-f34c3d121025")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("79b34e95-1969-4478-80a9-b398a221aad4")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ControlNode.class;
    }

    @objid ("0523f1e1-0fd7-4adf-9abd-9dd82782a8da")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5993535a-0344-4c0f-984d-5883660d2324")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("9543e3d1-6eee-43d1-bb69-e0c684ae3cc1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityNode");
        this.registerFactory(new ControlNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("79d13f99-b1eb-447c-b280-24383afa96f7")
    private static class ControlNodeObjectFactory implements ISmObjectFactory {
        @objid ("9fdae520-aa9e-47be-ba1c-b46dc7e92b13")
        private ControlNodeSmClass smClass;

        @objid ("7711fde6-5e17-4a54-b746-679abece28e4")
        public ControlNodeObjectFactory(ControlNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e077a924-36f8-430a-8dfc-55f5ce1829f5")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("d10562f1-436b-4095-b98a-6d4fd8499ec9")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

}
