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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1648b8b3-570e-4f03-92ab-6e61b22d1b02")
public class DataTypeSmClass extends GeneralClassSmClass {
    @objid ("85924a25-64af-449f-81a9-2faf5dbca27c")
    public DataTypeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3b6ac0c5-deec-49f7-a658-7bffde60c63a")
    @Override
    public String getName() {
        return "DataType";
    }

    @objid ("4e1fee18-2226-495d-acda-93438dd91682")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("49b64b41-1e12-426d-add7-3c86b577c38d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DataType.class;
    }

    @objid ("2ffd1aa3-d527-4655-b967-0c9c53959363")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("f5bf4b3e-395d-4d04-bfcc-338b33abe8a5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e72b6bdb-fbe0-4e28-9328-901fdbc9d6d4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new DataTypeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("651ae97e-658e-4bbf-9f7a-ab4fdebcb4c1")
    private static class DataTypeObjectFactory implements ISmObjectFactory {
        @objid ("fa91f7e0-3580-486b-9f7f-c8fec5b6c7e7")
        private DataTypeSmClass smClass;

        @objid ("be2992fa-001e-440e-811d-8a8062a9a952")
        public DataTypeObjectFactory(DataTypeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9752a5fb-79a4-465c-8330-26fb2adee4fe")
        @Override
        public ISmObjectData createData() {
            return new DataTypeData(this.smClass);
        }

        @objid ("42874abb-0b57-463b-9940-8ffaf9d3572a")
        @Override
        public SmObjectImpl createImpl() {
            return new DataTypeImpl();
        }

    }

}
