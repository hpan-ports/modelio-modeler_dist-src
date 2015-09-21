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
import org.modelio.metamodel.impl.uml.infrastructure.properties.EnumeratedPropertyTypeSmClass;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
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

@objid ("248ccc62-bd28-427d-bfd3-d3abff00fd40")
public class PropertyEnumerationLitteralSmClass extends ModelElementSmClass {
    @objid ("5f3beefc-9328-4407-b326-530a56f06584")
    private SmDependency ownerDep;

    @objid ("b1ce8157-8fbb-4d4c-a792-b4d92ef7bc44")
    public PropertyEnumerationLitteralSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("fdf8f34b-3c4d-4bbc-b1e8-76a41ef2b3d9")
    @Override
    public String getName() {
        return "PropertyEnumerationLitteral";
    }

    @objid ("8aef97a7-cb20-4ee1-9570-28d730c0268e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("78d46033-7b4e-48f6-817d-393ac71fe9fe")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PropertyEnumerationLitteral.class;
    }

    @objid ("2bbcb12f-b9f7-4fe2-a321-9386a85f42fd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("567eaf1d-49b4-47b0-8855-d6cc46c16b74")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1898a443-383c-46b7-8f74-06ae32c7bc52")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PropertyEnumerationLitteralObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("EnumeratedPropertyType"), 1, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("bdf36dcd-3b25-4c88-a287-f50e6411c40c")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("e4464fac-25c1-45d3-801d-a6289293d0b2")
    private static class PropertyEnumerationLitteralObjectFactory implements ISmObjectFactory {
        @objid ("e509b31e-6656-4434-b6d9-b75f7e438a0e")
        private PropertyEnumerationLitteralSmClass smClass;

        @objid ("71108f47-a407-4b4d-b5ac-5a1961eb4fcc")
        public PropertyEnumerationLitteralObjectFactory(PropertyEnumerationLitteralSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f66f21e1-0081-4163-911e-12fbb9d35d14")
        @Override
        public ISmObjectData createData() {
            return new PropertyEnumerationLitteralData(this.smClass);
        }

        @objid ("f550b83d-ade2-4ce7-a7d7-2617d63b7f7d")
        @Override
        public SmObjectImpl createImpl() {
            return new PropertyEnumerationLitteralImpl();
        }

    }

    @objid ("75532c15-3257-4d11-a9a5-8fcaaa510cc8")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("9a24affc-4c9f-49b9-b9b4-58e1f35d0d80")
        private SmDependency symetricDep;

        @objid ("09c306a6-15fa-4874-84ed-29c9afdc1781")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PropertyEnumerationLitteralData) data).mOwner;
        }

        @objid ("be866227-13cd-4fdf-b6a9-f20504326815")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PropertyEnumerationLitteralData) data).mOwner = value;
        }

        @objid ("f8f7831b-bfdd-4615-b80e-407b4cc14a04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EnumeratedPropertyTypeSmClass)this.getTarget()).getLitteralDep();
            }
            return this.symetricDep;
        }

    }

}
