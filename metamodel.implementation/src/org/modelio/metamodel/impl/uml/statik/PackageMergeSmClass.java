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
import org.modelio.metamodel.impl.uml.statik.PackageSmClass;
import org.modelio.metamodel.uml.statik.PackageMerge;
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

@objid ("ac032bd6-64d6-4ff8-bc0b-7bcf311eb66c")
public class PackageMergeSmClass extends ModelElementSmClass {
    @objid ("bf82dc08-c12c-4531-8085-d2615f0c22a1")
    private SmDependency mergedPackageDep;

    @objid ("58687677-8e67-4f74-9642-731193e34b3c")
    private SmDependency receivingPackageDep;

    @objid ("09912276-1dc0-41e4-98f5-7982d450e462")
    public PackageMergeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5870bde3-928a-4d5e-9831-888dcf0c3cfe")
    @Override
    public String getName() {
        return "PackageMerge";
    }

    @objid ("b77100e2-de22-44c0-9031-f2aed1bb3c18")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("2cdfd14d-038f-4008-ad68-9682855e4c69")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return PackageMerge.class;
    }

    @objid ("d78d0026-dcfa-4592-b0b0-e48abe93175b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5b98aff2-4dc8-4b68-b240-0b0f1db88875")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("4ac060da-4b53-4227-95f8-c49e1ceb670a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new PackageMergeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.mergedPackageDep = new MergedPackageSmDependency();
        this.mergedPackageDep.init("MergedPackage", this, metamodel.getMClass("Package"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.mergedPackageDep);
        
        this.receivingPackageDep = new ReceivingPackageSmDependency();
        this.receivingPackageDep.init("ReceivingPackage", this, metamodel.getMClass("Package"), 1, 1 );
        registerDependency(this.receivingPackageDep);
    }

    @objid ("24a29ee9-11de-4281-9aae-49512250a997")
    public SmDependency getMergedPackageDep() {
        if (this.mergedPackageDep == null) {
        	this.mergedPackageDep = this.getDependencyDef("MergedPackage");
        }
        return this.mergedPackageDep;
    }

    @objid ("abcf49de-ff5c-4c43-8bdf-6dc08d1de3ef")
    public SmDependency getReceivingPackageDep() {
        if (this.receivingPackageDep == null) {
        	this.receivingPackageDep = this.getDependencyDef("ReceivingPackage");
        }
        return this.receivingPackageDep;
    }

    @objid ("34cce497-deac-4cab-9aff-c8448e10d6d8")
    private static class PackageMergeObjectFactory implements ISmObjectFactory {
        @objid ("2c816aec-0bcd-4006-8a8c-ba6bae50ff21")
        private PackageMergeSmClass smClass;

        @objid ("a27c377f-1a06-4e9e-8690-b5fa21f8163d")
        public PackageMergeObjectFactory(PackageMergeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2efa6463-07f4-4f04-bab5-54dc1a155c15")
        @Override
        public ISmObjectData createData() {
            return new PackageMergeData(this.smClass);
        }

        @objid ("442ef0f2-ac00-4a81-bfa5-207ea71bccfe")
        @Override
        public SmObjectImpl createImpl() {
            return new PackageMergeImpl();
        }

    }

    @objid ("631242d0-618b-462a-9fcc-a93cf0ad0efd")
    public static class MergedPackageSmDependency extends SmSingleDependency {
        @objid ("bbdaa3a9-7882-452c-959d-576abdad8def")
        private SmDependency symetricDep;

        @objid ("df351eb3-da05-4627-8764-2e7a67772137")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageMergeData) data).mMergedPackage;
        }

        @objid ("32c81bb8-dc9d-4e45-8cbf-aa90c15c4e0b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageMergeData) data).mMergedPackage = value;
        }

        @objid ("382993a6-fe13-4b2d-9b07-35a59dfd0bb8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageSmClass)this.getTarget()).getReceivingMergeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("53ba4a56-fe26-4ea5-8c9b-a9ca804ec64c")
    public static class ReceivingPackageSmDependency extends SmSingleDependency {
        @objid ("53593b6c-6ed7-46fc-9663-a26e207d1368")
        private SmDependency symetricDep;

        @objid ("28bdb4c3-05c8-4f2b-99a5-40cbe83211bd")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageMergeData) data).mReceivingPackage;
        }

        @objid ("15ed64ab-c053-4fc0-a898-b35b816959ab")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageMergeData) data).mReceivingPackage = value;
        }

        @objid ("f4563978-9ba2-4115-832a-42f5c0d5457f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageSmClass)this.getTarget()).getMergeDep();
            }
            return this.symetricDep;
        }

    }

}
