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
/*   Metamodel version: 9019              */
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
    @objid ("f790b6f7-59bc-4f81-9033-165a93e1c9a5")
    @SmaMetaAssociation(metaName="MergedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.MergedPackageSmDependency.class, partof = true)
     SmObjectImpl mMergedPackage;

    @objid ("54a0fe4d-0da2-4d74-81ff-60d61d78a233")
    @SmaMetaAssociation(metaName="ReceivingPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ReceivingPackageSmDependency.class)
     SmObjectImpl mReceivingPackage;

    @objid ("db830aba-48c8-4d33-b911-d9e467d4fe74")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00698020-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("aadda0c5-a271-422c-bb59-ebd9e1bd060d")
        private static SmClass smClass = null;

        @objid ("eb899bed-26a1-4fdf-80e1-e49be081a542")
        private static SmDependency MergedPackageDep = null;

        @objid ("e0b3a1d7-91e8-43cb-b49d-c53ef291f211")
        private static SmDependency ReceivingPackageDep = null;

        @objid ("924febed-79f8-4199-901f-a598bbce5087")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageMergeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("15298a3f-135a-4659-a5fe-3537e2115afc")
        public static SmDependency MergedPackageDep() {
            if (MergedPackageDep == null) {
            	MergedPackageDep = classof().getDependencyDef("MergedPackage");
            }
            return MergedPackageDep;
        }

        @objid ("c95c25e1-7d01-4e19-91dd-cfe49cc60ed1")
        public static SmDependency ReceivingPackageDep() {
            if (ReceivingPackageDep == null) {
            	ReceivingPackageDep = classof().getDependencyDef("ReceivingPackage");
            }
            return ReceivingPackageDep;
        }

        @objid ("21a75338-2b7f-4a00-8a05-a1cc0474c665")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a1428f82-bffc-4c25-bcbf-7870ae1341dd")
        public static SmDependency getReceivingPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivingPackageDep;
        }

        @objid ("af711a71-38f0-4186-9035-335dd9387f47")
        public static SmDependency getMergedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MergedPackageDep;
        }

        @objid ("0069c1ac-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2bb0d6e6-224f-4481-aacb-d41d1049ebf6")
            public ISmObjectData createData() {
                return new PackageMergeData();
            }

            @objid ("98367684-67e3-43cb-9a4b-89b64ba859fe")
            public SmObjectImpl createImpl() {
                return new PackageMergeImpl();
            }

        }

        @objid ("006a2426-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivingPackageSmDependency extends SmSingleDependency {
            @objid ("ba17bb5c-2576-4996-bd5a-26150f450edd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mReceivingPackage;
            }

            @objid ("ce8b13c9-d540-4c5e-908a-e0b65528c7a0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mReceivingPackage = value;
            }

            @objid ("e17a89d6-31ef-4c03-ba75-a653f55e15fb")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.MergeDep();
            }

        }

        @objid ("006a9870-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MergedPackageSmDependency extends SmSingleDependency {
            @objid ("0463e173-8004-4584-9f42-76fbab817fa6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageMergeData) data).mMergedPackage;
            }

            @objid ("01222893-6219-4c0f-907d-58057302d37c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageMergeData) data).mMergedPackage = value;
            }

            @objid ("0d6637f7-3d76-424a-8e2a-59b13a587f8b")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.ReceivingMergeDep();
            }

        }

    }

}
