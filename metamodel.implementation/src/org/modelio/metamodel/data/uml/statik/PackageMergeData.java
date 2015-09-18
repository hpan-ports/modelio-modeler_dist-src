/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.statik.PackageMergeImpl;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("00177474-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PackageMerge.class, factory=PackageMergeData.Metadata.ObjectFactory.class)
public class PackageMergeData extends ModelElementData {
    @objid ("32d11bbf-422d-4f6f-ac18-03cc960e5131")
    @SmaMetaAssociation(metaName="MergedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.MergedPackageSmDependency.class, partof = true)
     SmObjectImpl mMergedPackage;

    @objid ("7197e5f3-7988-4cb3-9a15-eff58f194beb")
    @SmaMetaAssociation(metaName="ReceivingPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ReceivingPackageSmDependency.class)
     SmObjectImpl mReceivingPackage;

    @objid ("b6c6d5fd-9642-445c-82b2-af99624d818b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00698020-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e252da57-3be5-464d-b33f-4832e91235f0")
        private static SmClass smClass = null;

        @objid ("d0f46632-e58e-4d4f-92f6-5ced4acbde1a")
        private static SmDependency MergedPackageDep = null;

        @objid ("cca7f2ca-f454-4384-b282-8f95c2c8a2d8")
        private static SmDependency ReceivingPackageDep = null;

        @objid ("8bb04f6b-5a3d-4e2b-bcbb-dac4cf398f07")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageMergeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dcd1dbe2-ec21-41ae-bea0-8aaa415afe5c")
        public static SmDependency MergedPackageDep() {
            if (MergedPackageDep == null) {
            	MergedPackageDep = classof().getDependencyDef("MergedPackage");
            }
            return MergedPackageDep;
        }

        @objid ("d7e93345-0224-4546-84cf-f55a24d9e158")
        public static SmDependency ReceivingPackageDep() {
            if (ReceivingPackageDep == null) {
            	ReceivingPackageDep = classof().getDependencyDef("ReceivingPackage");
            }
            return ReceivingPackageDep;
        }

        @objid ("95cf1614-e706-4829-80db-aaefda36c91f")
        public static SmDependency getReceivingPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingPackageDep;
        }

        @objid ("54c23402-cef7-4c65-a918-c9f6de27c527")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2313a30a-4368-46e3-bbd0-6fed483d7225")
        public static SmDependency getMergedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergedPackageDep;
        }

        @objid ("0069c1ac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0d64d95b-10e7-40f4-81e6-ea2621ed901d")
            public ISmObjectData createData() {
                return new PackageMergeData();
            }

            @objid ("6b0db9ef-0bdf-4ebe-ac3e-26dcf3ba9f85")
            public SmObjectImpl createImpl() {
                return new PackageMergeImpl();
            }

        }

        @objid ("006a2426-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingPackageSmDependency extends SmSingleDependency {
            @objid ("55483981-2d66-425b-a73c-166ee39849ac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mReceivingPackage;
            }

            @objid ("702652c8-af3a-4bbc-aa13-144d419a2399")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mReceivingPackage = value;
            }

            @objid ("f4d2f893-9c76-4559-b11a-7954d2632c0a")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.MergeDep();
            }

        }

        @objid ("006a9870-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergedPackageSmDependency extends SmSingleDependency {
            @objid ("a1e40a1a-6f09-4586-9025-4c3fca6ddae3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mMergedPackage;
            }

            @objid ("054ee5bf-6887-4b52-9410-edc1acda38fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mMergedPackage = value;
            }

            @objid ("4815768b-f52a-4c7e-9ab7-0173be51df77")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.ReceivingMergeDep();
            }

        }

    }

}
