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
import org.modelio.metamodel.impl.uml.statik.PackageSmClass;
import org.modelio.metamodel.uml.statik.PackageImport;
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

@objid ("2b5a751d-bf5a-4826-8664-010d1d624c31")
public class PackageImportSmClass extends ModelElementSmClass {
    @objid ("f44f0243-ed08-4a40-8798-c196cb56622e")
    private SmAttribute visibilityAtt;

    @objid ("be9a282d-3486-4107-b226-db40b1651b86")
    private SmDependency importingOperationDep;

    @objid ("7708b667-2fb0-45d4-9ff7-a9a80d2c2f1a")
    private SmDependency importingNameSpaceDep;

    @objid ("7b7b416d-32c0-40bd-ad97-4f4b27a3a19a")
    private SmDependency importedPackageDep;

    @objid ("b93fa1be-dcd6-44d2-bb93-9e7cba379b90")
    public PackageImportSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4fab9f03-be5a-4112-a8be-034719ae3f19")
    @Override
    public String getName() {
        return "PackageImport";
    }

    @objid ("ef653be9-8697-473d-ad4d-e6f6c98519cb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("41817b67-4237-4478-95a1-c84370cd25f2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PackageImport.class;
    }

    @objid ("c7e80f8c-9c71-495f-9a2c-25cbf8d02f74")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("79faba02-3e7b-4cb9-8d8c-42c189824180")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("109e4edf-f801-4348-ba3b-fa3430ea0ec7")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PackageImportObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.visibilityAtt = new VisibilitySmAttribute();
        this.visibilityAtt.init("Visibility", this, VisibilityMode.class );
        registerAttribute(this.visibilityAtt);
        
        
        // Initialize and register the SmDependency
        this.importingOperationDep = new ImportingOperationSmDependency();
        this.importingOperationDep.init("ImportingOperation", this, metamodel.getMClass("Operation"), 0, 1 );
        registerDependency(this.importingOperationDep);
        
        this.importingNameSpaceDep = new ImportingNameSpaceSmDependency();
        this.importingNameSpaceDep.init("ImportingNameSpace", this, metamodel.getMClass("NameSpace"), 0, 1 );
        registerDependency(this.importingNameSpaceDep);
        
        this.importedPackageDep = new ImportedPackageSmDependency();
        this.importedPackageDep.init("ImportedPackage", this, metamodel.getMClass("Package"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.importedPackageDep);
    }

    @objid ("104e9abf-6080-4002-8d3f-6262fa6bbd73")
    public SmAttribute getVisibilityAtt() {
        if (this.visibilityAtt == null) {
        	this.visibilityAtt = this.getAttributeDef("Visibility");
        }
        return this.visibilityAtt;
    }

    @objid ("c5e74a37-4957-4b6f-85d4-f0b47eee4004")
    public SmDependency getImportingOperationDep() {
        if (this.importingOperationDep == null) {
        	this.importingOperationDep = this.getDependencyDef("ImportingOperation");
        }
        return this.importingOperationDep;
    }

    @objid ("0cd8c2e5-ffd9-4693-9c8a-49849ea6f4a1")
    public SmDependency getImportingNameSpaceDep() {
        if (this.importingNameSpaceDep == null) {
        	this.importingNameSpaceDep = this.getDependencyDef("ImportingNameSpace");
        }
        return this.importingNameSpaceDep;
    }

    @objid ("2aaa5cef-38ff-44c3-b5e8-707d7e13e6bb")
    public SmDependency getImportedPackageDep() {
        if (this.importedPackageDep == null) {
        	this.importedPackageDep = this.getDependencyDef("ImportedPackage");
        }
        return this.importedPackageDep;
    }

    @objid ("e2d28c24-19f9-4dc9-ba93-5aff21fc29df")
    private static class PackageImportObjectFactory implements ISmObjectFactory {
        @objid ("9c8f69e3-d4f1-48ac-8d97-593983c65401")
        private PackageImportSmClass smClass;

        @objid ("2ce64dfd-cb56-4bdb-a894-179ba2e1ef8c")
        public PackageImportObjectFactory(PackageImportSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bb6f0a1b-6b11-4489-9bc9-15a90e7be81b")
        @Override
        public ISmObjectData createData() {
            return new PackageImportData(this.smClass);
        }

        @objid ("a25255f3-9db1-48ff-aa05-207f95fbb65d")
        @Override
        public SmObjectImpl createImpl() {
            return new PackageImportImpl();
        }

    }

    @objid ("5256b43d-7237-476c-9afe-ec467cfa1c48")
    public static class VisibilitySmAttribute extends SmAttribute {
        @objid ("f597d7e4-79a8-41ca-a507-b35e6232f8e6")
        public Object getValue(ISmObjectData data) {
            return ((PackageImportData) data).mVisibility;
        }

        @objid ("526f482a-6417-4715-be9b-ab982037be48")
        public void setValue(ISmObjectData data, Object value) {
            ((PackageImportData) data).mVisibility = value;
        }

    }

    @objid ("85080e16-d4f6-4d30-b731-b50241b08631")
    public static class ImportingOperationSmDependency extends SmSingleDependency {
        @objid ("51f0ebef-4821-4255-bb8a-90a886bbff53")
        private SmDependency symetricDep;

        @objid ("ba9e645f-5ce4-44f4-a17b-86ba44a88d3a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageImportData) data).mImportingOperation;
        }

        @objid ("4d381555-a746-4053-89d5-0f5c8c5bdf48")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageImportData) data).mImportingOperation = value;
        }

        @objid ("dcb056a5-2d0c-4fd7-96e0-867a0d22258e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOwnedPackageImportDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4367c58b-be6f-4f19-9792-207cd0bce391")
    public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
        @objid ("53565571-b871-494b-b122-076b85dca691")
        private SmDependency symetricDep;

        @objid ("9e6f0eb6-389a-42b9-9b6c-7dca5e4fa5ca")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageImportData) data).mImportingNameSpace;
        }

        @objid ("926262c5-f129-45c5-9e09-fba4de812f7c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageImportData) data).mImportingNameSpace = value;
        }

        @objid ("869b1acb-bb11-4204-8317-f33bc89058f8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getOwnedPackageImportDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0a5d7f6a-5424-4ad4-994a-4d8c55a43f73")
    public static class ImportedPackageSmDependency extends SmSingleDependency {
        @objid ("c17a8a35-a9b6-4517-a0d4-29f36f553d6b")
        private SmDependency symetricDep;

        @objid ("c6e0ec15-eb75-4687-ac5d-e6b757e86aca")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageImportData) data).mImportedPackage;
        }

        @objid ("a0482346-5c11-40c8-88cb-745e0a4911bf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageImportData) data).mImportedPackage = value;
        }

        @objid ("84a44420-ef85-43b2-aba6-e0ac4e856f4f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageSmClass)this.getTarget()).getPackageImportingDep();
            }
            return this.symetricDep;
        }

    }

}
