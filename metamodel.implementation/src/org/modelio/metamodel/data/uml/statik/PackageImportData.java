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
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.statik.PackageImportImpl;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("00169568-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PackageImport.class, factory=PackageImportData.Metadata.ObjectFactory.class)
public class PackageImportData extends ModelElementData {
    @objid ("9ac17d6f-c7d6-4da3-978d-cd4c40e9c4fd")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("8a9b5aba-3833-42d9-816a-5b388b908f9b")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("1f7fa439-0ed6-4737-94ed-4f2d17847e9c")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("59b5dee4-1851-4152-b899-c1e344de5962")
    @SmaMetaAssociation(metaName="ImportedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ImportedPackageSmDependency.class, partof = true)
     SmObjectImpl mImportedPackage;

    @objid ("ac54f4f3-e664-4e7c-a09a-8fab4d4826d4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004b4f92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("17e6c16d-671b-441d-902f-3284036e4efe")
        private static SmClass smClass = null;

        @objid ("ed775c8f-4a66-4b80-8139-c1728aaf8571")
        private static SmAttribute VisibilityAtt = null;

        @objid ("50125d45-7cb4-4986-8b2b-e55468c275b1")
        private static SmDependency ImportingOperationDep = null;

        @objid ("0136bab7-0a61-47dd-87b0-5eb2e91550f0")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("93cdaf74-20f7-4041-85e8-38945ba7fc10")
        private static SmDependency ImportedPackageDep = null;

        @objid ("f18f40c6-ba7e-4e5d-a83e-5718da3360ca")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ec25ebcc-cabb-4f62-a5b7-daa229ab3604")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("70990102-2f09-4d25-b5c8-5a99a94b4b1e")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("7c6e5c39-be9e-49d5-8155-aa0bd1f9e0a5")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("d2e653c4-a0ff-4333-bd26-e7a7958fdf6f")
        public static SmDependency ImportedPackageDep() {
            if (ImportedPackageDep == null) {
            	ImportedPackageDep = classof().getDependencyDef("ImportedPackage");
            }
            return ImportedPackageDep;
        }

        @objid ("15fbe770-4118-436c-b4b2-42d1fdccbed8")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("3f945243-2d00-471f-93a3-a7dac7c3209e")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("7e6a8a71-cf07-45da-83a0-59bd0b27391d")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("ee7fe9e8-07da-4c13-920b-5f7b5e9cbd8b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ace1a758-dac7-494a-b7f6-c04fa3b948c7")
        public static SmDependency getImportedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedPackageDep;
        }

        @objid ("004b90e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fbadcd62-c3d9-4be8-b772-c084c09a4a6f")
            public ISmObjectData createData() {
                return new PackageImportData();
            }

            @objid ("edf218d3-c3f6-4aa7-83da-9e57bcc781f9")
            public SmObjectImpl createImpl() {
                return new PackageImportImpl();
            }

        }

        @objid ("004bf7da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("f6544452-abf1-4c6e-8182-dce725c6b8f4")
            public Object getValue(ISmObjectData data) {
                return ((PackageImportData) data).mVisibility;
            }

            @objid ("3cff9023-3c7a-40b8-a403-e74cc2e6842a")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageImportData) data).mVisibility = value;
            }

        }

        @objid ("004c5b80-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("0d07c233-2dcb-4c5a-91b8-f1ad6010ef10")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingNameSpace;
            }

            @objid ("6f0e6406-4f2a-46eb-9fbc-aa44e0bcc8ec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingNameSpace = value;
            }

            @objid ("2a15ce41-fd40-4296-a015-9fe3e6e1e2aa")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004ccfde-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("bf56a1e0-409a-4528-aa6a-040862d4f6ec")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingOperation;
            }

            @objid ("c4d7461b-8088-4e68-ae0c-1d5984c79dc5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingOperation = value;
            }

            @objid ("efb4a9c5-4ed6-486b-bfd9-965359b0b6b6")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004d4c16-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportedPackageSmDependency extends SmSingleDependency {
            @objid ("1be655a5-f03a-471c-8a29-1d0cf855a370")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportedPackage;
            }

            @objid ("33c5ddef-e63a-4a02-a4b6-4a42e2ce408d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportedPackage = value;
            }

            @objid ("e3cb5c6e-28c6-472a-8927-ca3bdb260bc4")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.PackageImportingDep();
            }

        }

    }

}
