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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionSmClass;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f80e9074-25b1-4e80-8cc7-1775094c0c0e")
public class ExternProcessorSmClass extends ModelElementSmClass {
    @objid ("a96f2c38-efb0-4479-b8fa-f8f3ee7a5fc2")
    private SmAttribute classNameAtt;

    @objid ("fb3795bb-ff56-46cd-a73c-54fa97027bd9")
    private SmDependency ownerQueryDep;

    @objid ("0000ca18-b863-433e-98d1-32d4247b00ee")
    private SmDependency ownerValDefDep;

    @objid ("264d8328-db0d-4a6a-8cca-48591ddf10a7")
    public ExternProcessorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a6f7e06d-345f-4162-973b-7a3a14daebcf")
    @Override
    public String getName() {
        return "ExternProcessor";
    }

    @objid ("53ec0bdb-f9e0-4287-9a24-2c2af4b5f3ff")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("934cbdcf-b965-44aa-ab36-714dbeb63615")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExternProcessor.class;
    }

    @objid ("3b1d47c5-e75b-4536-8c26-db723ce9a81b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0fcbd7b6-2979-4dc3-8736-e14f80233e4b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("01f4d188-fdb6-4728-9f29-02c496770e82")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ExternProcessorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.classNameAtt = new ClassNameSmAttribute();
        this.classNameAtt.init("ClassName", this, String.class );
        registerAttribute(this.classNameAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerQueryDep = new OwnerQuerySmDependency();
        this.ownerQueryDep.init("OwnerQuery", this, metamodel.getMClass("QueryDefinition"), 0, 1 );
        registerDependency(this.ownerQueryDep);
        
        this.ownerValDefDep = new OwnerValDefSmDependency();
        this.ownerValDefDep.init("OwnerValDef", this, metamodel.getMClass("MatrixValueDefinition"), 0, 1 );
        registerDependency(this.ownerValDefDep);
    }

    @objid ("e597725a-f89c-422f-81d4-9884832151f4")
    public SmAttribute getClassNameAtt() {
        if (this.classNameAtt == null) {
        	this.classNameAtt = this.getAttributeDef("ClassName");
        }
        return this.classNameAtt;
    }

    @objid ("128082e9-0953-4ebd-9f24-0addeca4a326")
    public SmDependency getOwnerQueryDep() {
        if (this.ownerQueryDep == null) {
        	this.ownerQueryDep = this.getDependencyDef("OwnerQuery");
        }
        return this.ownerQueryDep;
    }

    @objid ("56278be1-875e-4270-ae1b-2895c46bfc5d")
    public SmDependency getOwnerValDefDep() {
        if (this.ownerValDefDep == null) {
        	this.ownerValDefDep = this.getDependencyDef("OwnerValDef");
        }
        return this.ownerValDefDep;
    }

    @objid ("ea3d1afe-5c7e-49ea-b926-b6e9adacc76c")
    private static class ExternProcessorObjectFactory implements ISmObjectFactory {
        @objid ("56b07753-e09b-447e-93d0-05c389738aee")
        private ExternProcessorSmClass smClass;

        @objid ("8c75e9b8-de16-4cf0-b9c8-e3bc16dc65f5")
        public ExternProcessorObjectFactory(ExternProcessorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("aa09f9a2-ba2c-462b-b93c-1bf5b10689ef")
        @Override
        public ISmObjectData createData() {
            return new ExternProcessorData(this.smClass);
        }

        @objid ("3d041434-bb91-43ea-b0b1-3859ca2bddca")
        @Override
        public SmObjectImpl createImpl() {
            return new ExternProcessorImpl();
        }

    }

    @objid ("9f6a11d2-1a6c-46d1-b227-e6cf7378c5e3")
    public static class ClassNameSmAttribute extends SmAttribute {
        @objid ("fb3c8dde-8b31-4a89-aebe-c70e5da1b586")
        public Object getValue(ISmObjectData data) {
            return ((ExternProcessorData) data).mClassName;
        }

        @objid ("941539d5-ecac-4119-95fa-d921f40b0efa")
        public void setValue(ISmObjectData data, Object value) {
            ((ExternProcessorData) data).mClassName = value;
        }

    }

    @objid ("7d79872b-2f96-49a6-b5a0-c932fa0cc7d6")
    public static class OwnerQuerySmDependency extends SmSingleDependency {
        @objid ("a3438b84-cee4-44bb-81dc-64b315a25b77")
        private SmDependency symetricDep;

        @objid ("244643dd-12d3-4ec9-bb19-1d33e31f7e83")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternProcessorData) data).mOwnerQuery;
        }

        @objid ("f7a4d711-ac2e-4c27-8484-1b36d2fdfa16")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternProcessorData) data).mOwnerQuery = value;
        }

        @objid ("a49ce341-c597-425a-98ef-bc0f7a697445")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getProcessorDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7bf146c6-31e6-4943-8081-fe99a6489015")
    public static class OwnerValDefSmDependency extends SmSingleDependency {
        @objid ("9b02d77b-fb6f-4718-91fe-93ff4310b853")
        private SmDependency symetricDep;

        @objid ("e7407938-3bae-421f-9b3c-7623a99e246e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExternProcessorData) data).mOwnerValDef;
        }

        @objid ("92e96458-a4e9-4c49-beeb-a9512bedb978")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExternProcessorData) data).mOwnerValDef = value;
        }

        @objid ("4cfa4a39-41bd-418c-9e32-9ebb1f9d29af")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixValueDefinitionSmClass)this.getTarget()).getProcessorDep();
            }
            return this.symetricDep;
        }

    }

}
