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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.statik.RaisedException;
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

@objid ("b960d404-5093-4b35-8dd7-972452bceb08")
public class RaisedExceptionSmClass extends ModelElementSmClass {
    @objid ("16afc9bc-e167-41aa-92b4-f24ed0818fc7")
    private SmDependency thrownTypeDep;

    @objid ("3e671697-d4cf-40d8-9622-0b932f40fb70")
    private SmDependency throwerDep;

    @objid ("030568b4-67fe-413e-b879-e85a4b7a4730")
    public RaisedExceptionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5e04308d-c88d-4d1b-868d-b6bf3cd74316")
    @Override
    public String getName() {
        return "RaisedException";
    }

    @objid ("e2e3fc55-d2de-4824-81a6-cad927d1fdce")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bcf58b38-7fd0-48f6-99c7-368a90d9b3d3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return RaisedException.class;
    }

    @objid ("24c7c555-0c5d-41a2-9b19-e68ff16fd636")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d0f96375-086c-415b-a889-a1edc3a5acab")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("67bd2c7c-2533-4aa1-a314-1ddb57239f39")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new RaisedExceptionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.thrownTypeDep = new ThrownTypeSmDependency();
        this.thrownTypeDep.init("ThrownType", this, metamodel.getMClass("Classifier"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.thrownTypeDep);
        
        this.throwerDep = new ThrowerSmDependency();
        this.throwerDep.init("Thrower", this, metamodel.getMClass("Operation"), 1, 1 );
        registerDependency(this.throwerDep);
    }

    @objid ("bf2dc30c-e5e6-4e1d-9d0f-f330f0a61ed4")
    public SmDependency getThrownTypeDep() {
        if (this.thrownTypeDep == null) {
        	this.thrownTypeDep = this.getDependencyDef("ThrownType");
        }
        return this.thrownTypeDep;
    }

    @objid ("6142dd33-26d3-49b4-9555-af504dac9bac")
    public SmDependency getThrowerDep() {
        if (this.throwerDep == null) {
        	this.throwerDep = this.getDependencyDef("Thrower");
        }
        return this.throwerDep;
    }

    @objid ("886f1ffa-951d-47f4-8c80-684fd1849981")
    private static class RaisedExceptionObjectFactory implements ISmObjectFactory {
        @objid ("f8bbf1e2-a8d6-4859-812f-e980c3b7f3e0")
        private RaisedExceptionSmClass smClass;

        @objid ("554c4396-3552-471b-88ee-3388d223fb3c")
        public RaisedExceptionObjectFactory(RaisedExceptionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("dbc04d67-2ae2-45f7-9a97-5731b39073ef")
        @Override
        public ISmObjectData createData() {
            return new RaisedExceptionData(this.smClass);
        }

        @objid ("3d432aea-79a1-4bf3-9b97-bbb805d1d1e7")
        @Override
        public SmObjectImpl createImpl() {
            return new RaisedExceptionImpl();
        }

    }

    @objid ("a931d294-859c-4489-9f4b-7dd15e902899")
    public static class ThrownTypeSmDependency extends SmSingleDependency {
        @objid ("c472e279-2962-4f91-8412-334fe9d8289a")
        private SmDependency symetricDep;

        @objid ("13eb54df-0808-42ff-b512-f1bfc82ee32c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RaisedExceptionData) data).mThrownType;
        }

        @objid ("9667ebeb-804b-4831-b0bd-945839c8be2c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RaisedExceptionData) data).mThrownType = value;
        }

        @objid ("4b1d2259-7f1e-4198-8fc4-069c02cbdab2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getThrowingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6ca3b92a-d9e8-4104-826a-1addab55405d")
    public static class ThrowerSmDependency extends SmSingleDependency {
        @objid ("8db40d94-9389-46d3-92e5-0740ee6b2914")
        private SmDependency symetricDep;

        @objid ("a6b049a6-1e34-4a23-932c-6bbb4f9a2c82")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RaisedExceptionData) data).mThrower;
        }

        @objid ("fc733578-ef73-45dd-a762-38cf2a3ab8ab")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RaisedExceptionData) data).mThrower = value;
        }

        @objid ("3801f3d8-e34e-408b-9a98-1e26558e29a1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getThrownDep();
            }
            return this.symetricDep;
        }

    }

}
