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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
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

@objid ("90df93f3-3d77-459d-8522-3bcaa78554db")
public class LocalPropertyTableSmClass extends PropertyTableSmClass {
    @objid ("2a8206fa-b242-4b6c-b5e2-2b37cace52bb")
    private SmDependency localAnnotedDep;

    @objid ("b9e3e948-b91b-44fd-a362-54a13c566b4d")
    public LocalPropertyTableSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("82f2714f-2bd2-4954-970b-b47472dde19e")
    @Override
    public String getName() {
        return "LocalPropertyTable";
    }

    @objid ("c32410d4-4d9b-4236-9596-8e57bd0d31ed")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("432df55b-710b-4d22-b288-9c26d6bffcad")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return LocalPropertyTable.class;
    }

    @objid ("27d27bed-b74a-43b8-84ee-dcf2a6046e6d")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("33fae621-8a96-486e-8e0c-00057fe6c15d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("65d6edd7-bd74-46f5-982d-31acb41fe2b4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("PropertyTable");
        this.registerFactory(new LocalPropertyTableObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.localAnnotedDep = new LocalAnnotedSmDependency();
        this.localAnnotedDep.init("LocalAnnoted", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.localAnnotedDep);
    }

    @objid ("bc255fcb-81ce-4290-b2c8-03e54851d3ec")
    public SmDependency getLocalAnnotedDep() {
        if (this.localAnnotedDep == null) {
        	this.localAnnotedDep = this.getDependencyDef("LocalAnnoted");
        }
        return this.localAnnotedDep;
    }

    @objid ("5334e687-50f8-431e-920d-d2a134f3d7ed")
    private static class LocalPropertyTableObjectFactory implements ISmObjectFactory {
        @objid ("a0e5e333-d8db-42d4-9047-ba5ec00aa4ac")
        private LocalPropertyTableSmClass smClass;

        @objid ("297fc4bc-8794-4d56-8764-9209d9efc595")
        public LocalPropertyTableObjectFactory(LocalPropertyTableSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d8517970-9038-4b85-8373-fceecf35c11f")
        @Override
        public ISmObjectData createData() {
            return new LocalPropertyTableData(this.smClass);
        }

        @objid ("c5e4a128-12d4-4603-b07e-14a60933e06c")
        @Override
        public SmObjectImpl createImpl() {
            return new LocalPropertyTableImpl();
        }

    }

    @objid ("e5f30693-da9f-490a-938e-83a87d46bfbc")
    public static class LocalAnnotedSmDependency extends SmSingleDependency {
        @objid ("a7b4d16c-7ae2-4b58-9c25-382e08c09ef8")
        private SmDependency symetricDep;

        @objid ("d30bad8d-af20-4c34-b424-38273f615113")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LocalPropertyTableData) data).mLocalAnnoted;
        }

        @objid ("a36ed9e5-8562-415f-aba9-6063f8140645")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LocalPropertyTableData) data).mLocalAnnoted = value;
        }

        @objid ("617b11b2-3d64-4dd7-b086-4e835b433d4d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getLocalPropertiesDep();
            }
            return this.symetricDep;
        }

    }

}
