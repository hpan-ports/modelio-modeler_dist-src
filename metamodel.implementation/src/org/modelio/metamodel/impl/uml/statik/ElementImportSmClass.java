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
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("f1131a92-11a8-41a4-baeb-56e593167c82")
public class ElementImportSmClass extends ModelElementSmClass {
    @objid ("162782a3-29a3-4b50-baf9-44ffffec3a92")
    private SmAttribute visibilityAtt;

    @objid ("e5652e74-007c-4b03-8c7c-8bd2a14e437b")
    private SmDependency importingNameSpaceDep;

    @objid ("365e5a06-e577-4d05-9d35-be6353cef18f")
    private SmDependency importedElementDep;

    @objid ("1677d07e-0813-468b-b31e-771953dd6c82")
    private SmDependency importingOperationDep;

    @objid ("862157e3-9bf6-4066-9bf2-daae430b45d7")
    public ElementImportSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("94f1730b-8ea7-4bf6-9c7c-7854794586cf")
    @Override
    public String getName() {
        return "ElementImport";
    }

    @objid ("494f251f-2025-4eee-974b-7f6010daa755")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("99e24436-e911-4ec9-8253-d4dca0d3e88e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ElementImport.class;
    }

    @objid ("46d0618f-47a6-406e-94e0-bc8744e6c509")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("9f114f63-441a-47b2-b0e8-5edcb8bda7a6")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3fb9d5c8-8146-4180-9db3-8f842d7249b0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ElementImportObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.visibilityAtt = new VisibilitySmAttribute();
        this.visibilityAtt.init("Visibility", this, VisibilityMode.class );
        registerAttribute(this.visibilityAtt);
        
        
        // Initialize and register the SmDependency
        this.importingNameSpaceDep = new ImportingNameSpaceSmDependency();
        this.importingNameSpaceDep.init("ImportingNameSpace", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.importingNameSpaceDep);
        
        this.importedElementDep = new ImportedElementSmDependency();
        this.importedElementDep.init("ImportedElement", this, metamodel.getMClass("NameSpace"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.importedElementDep);
        
        this.importingOperationDep = new ImportingOperationSmDependency();
        this.importingOperationDep.init("ImportingOperation", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.importingOperationDep);
    }

    @objid ("08a3188a-1c5d-4866-9cb9-c589a8c17d27")
    public SmAttribute getVisibilityAtt() {
        if (this.visibilityAtt == null) {
        	this.visibilityAtt = this.getAttributeDef("Visibility");
        }
        return this.visibilityAtt;
    }

    @objid ("681772c5-34e1-424d-b4e1-2605e4ba0899")
    public SmDependency getImportingNameSpaceDep() {
        if (this.importingNameSpaceDep == null) {
        	this.importingNameSpaceDep = this.getDependencyDef("ImportingNameSpace");
        }
        return this.importingNameSpaceDep;
    }

    @objid ("596b5923-f3c3-45dd-8a1e-dbec204b14ef")
    public SmDependency getImportedElementDep() {
        if (this.importedElementDep == null) {
        	this.importedElementDep = this.getDependencyDef("ImportedElement");
        }
        return this.importedElementDep;
    }

    @objid ("0931ae5c-75f7-4b14-b967-988b9a2060c8")
    public SmDependency getImportingOperationDep() {
        if (this.importingOperationDep == null) {
        	this.importingOperationDep = this.getDependencyDef("ImportingOperation");
        }
        return this.importingOperationDep;
    }

    @objid ("6621c671-14c2-49df-abe0-23da44919c8e")
    private static class ElementImportObjectFactory implements ISmObjectFactory {
        @objid ("8d923df2-09e9-42c1-aa0b-2ef30e463f20")
        private ElementImportSmClass smClass;

        @objid ("1db5f19b-f4d8-4bda-9eb4-c310296f1d06")
        public ElementImportObjectFactory(ElementImportSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("24e0fa4a-7167-4d97-924e-da8bba260f89")
        @Override
        public ISmObjectData createData() {
            return new ElementImportData(this.smClass);
        }

        @objid ("73e8ac18-1dde-4f81-add2-00600c276449")
        @Override
        public SmObjectImpl createImpl() {
            return new ElementImportImpl();
        }

    }

    @objid ("94823c31-1bf0-4f65-bd6d-949335e79733")
    public static class VisibilitySmAttribute extends SmAttribute {
        @objid ("c8b15072-7434-458d-8ab0-78e12d4eaae1")
        public Object getValue(ISmObjectData data) {
            return ((ElementImportData) data).mVisibility;
        }

        @objid ("b609ea55-1d36-4f12-b7fc-060ef3fb298a")
        public void setValue(ISmObjectData data, Object value) {
            ((ElementImportData) data).mVisibility = value;
        }

    }

    @objid ("28e08b98-8565-4cb0-ab42-e3a0c7acd5f4")
    public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
        @objid ("5f239bbb-d91e-4bfa-8700-948c69fa98d1")
        private SmDependency symetricDep;

        @objid ("de85a128-5ca0-40cb-bdd2-793b89c6b013")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ElementImportData) data).mImportingNameSpace;
        }

        @objid ("0d96a78b-6367-451d-bb9b-56fcdbe035ae")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ElementImportData) data).mImportingNameSpace = value;
        }

        @objid ("9c711d0f-e90b-4dce-81b1-b42ccb15f8b8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedImportDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("aa417515-c114-40ad-91fa-c737e32fb720")
    public static class ImportedElementSmDependency extends SmSingleDependency {
        @objid ("87bd2d01-53c7-4b8c-8c23-f2955f2d8e6e")
        private SmDependency symetricDep;

        @objid ("f14782bf-b12c-4381-9c13-b45c0066eca8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ElementImportData) data).mImportedElement;
        }

        @objid ("bb12018a-1764-4de2-abe1-fb19952adc78")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ElementImportData) data).mImportedElement = value;
        }

        @objid ("dd270ed0-fd9c-4936-a6e7-a55c25c53434")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getImportingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("351ab446-fe45-4adb-b698-ed9930361ca7")
    public static class ImportingOperationSmDependency extends SmSingleDependency {
        @objid ("2564f40d-ba1c-4029-a464-4908abe7de74")
        private SmDependency symetricDep;

        @objid ("ff207c21-da5a-4d99-9236-5950de6acdc1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ElementImportData) data).mImportingOperation;
        }

        @objid ("d32ddbfd-0adc-4452-b508-34db0c70a980")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ElementImportData) data).mImportingOperation = value;
        }

        @objid ("a6559b65-5601-47ec-9059-3317b2efcde3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOwnedImportDep();
            }
            return this.symetricDep;
        }

    }

}
