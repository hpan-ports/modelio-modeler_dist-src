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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("04f79303-9c8c-48a9-bb47-fb6f72f5ee81")
    @SmaMetaAssociation(metaName="MergedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.MergedPackageSmDependency.class, partof = true)
     SmObjectImpl mMergedPackage;

    @objid ("a4ff8568-993a-410f-9006-fe53fbce56e3")
    @SmaMetaAssociation(metaName="ReceivingPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ReceivingPackageSmDependency.class)
     SmObjectImpl mReceivingPackage;

    @objid ("c5799373-31d4-4feb-bb79-8a6614b5b5da")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00698020-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e2b96b95-3994-4a11-a871-6119b4381e8a")
        private static SmClass smClass = null;

        @objid ("aacd8f78-d488-4ca0-a5e5-86feea32267c")
        private static SmDependency MergedPackageDep = null;

        @objid ("a0b5c791-7473-4d30-bd93-b4949c7c6c3e")
        private static SmDependency ReceivingPackageDep = null;

        @objid ("e88a84c1-b08e-430f-bbfd-0bd86d55ec56")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageMergeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("81470dbd-d229-4a1e-ac32-8ee1be3d50ac")
        public static SmDependency MergedPackageDep() {
            if (MergedPackageDep == null) {
            	MergedPackageDep = classof().getDependencyDef("MergedPackage");
            }
            return MergedPackageDep;
        }

        @objid ("271b64fa-f4f4-4850-95e7-df50f5b59497")
        public static SmDependency ReceivingPackageDep() {
            if (ReceivingPackageDep == null) {
            	ReceivingPackageDep = classof().getDependencyDef("ReceivingPackage");
            }
            return ReceivingPackageDep;
        }

        @objid ("ae5bb093-c8f1-4ec3-b9a6-1e54a08f0bb4")
        public static SmDependency getReceivingPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingPackageDep;
        }

        @objid ("fef2840f-9b31-4652-8180-137cdaeb26c9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bfcee078-0602-4fac-a179-b8e217ef1902")
        public static SmDependency getMergedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergedPackageDep;
        }

        @objid ("0069c1ac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0087b8dc-cc8a-4f54-a02e-6c17976a48fd")
            public ISmObjectData createData() {
                return new PackageMergeData();
            }

            @objid ("817873f8-3ec6-4a13-9ef2-fda4321e3e32")
            public SmObjectImpl createImpl() {
                return new PackageMergeImpl();
            }

        }

        @objid ("006a2426-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingPackageSmDependency extends SmSingleDependency {
            @objid ("1f447333-3ec1-415d-b7a0-44a33649f31b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mReceivingPackage;
            }

            @objid ("90aead62-e720-4742-a637-218bb1d4e3c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mReceivingPackage = value;
            }

            @objid ("ffa070ed-7570-4795-a1bf-9dcb02ecb0d0")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.MergeDep();
            }

        }

        @objid ("006a9870-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergedPackageSmDependency extends SmSingleDependency {
            @objid ("38fc705a-3a33-4066-9cd7-28c43ed67cc9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mMergedPackage;
            }

            @objid ("af45bf80-2313-408f-b252-27c5257c8538")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mMergedPackage = value;
            }

            @objid ("219f4eae-5fb5-4aac-969e-1d68eeced945")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.ReceivingMergeDep();
            }

        }

    }

}
