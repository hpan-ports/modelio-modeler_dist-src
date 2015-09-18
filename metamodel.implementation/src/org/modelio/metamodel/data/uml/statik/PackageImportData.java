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
    @objid ("08e0fd13-160a-4a77-a25b-c7ca33b61f51")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("71c29434-6bde-412f-9637-53a4dc77663b")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("7991bfae-7f82-4e7e-9a42-c50ac66e6aa7")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("f02885a8-f7d0-4fed-a376-0f64cd367173")
    @SmaMetaAssociation(metaName="ImportedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ImportedPackageSmDependency.class, partof = true)
     SmObjectImpl mImportedPackage;

    @objid ("e984760b-a66b-43bb-be61-764541ecf99e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004b4f92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c1804f7d-18b5-46c0-a1fe-663931447d83")
        private static SmClass smClass = null;

        @objid ("84f47a99-7cfa-4a61-a55a-f6a6eb3f027a")
        private static SmAttribute VisibilityAtt = null;

        @objid ("832901e2-f051-4c00-9673-b9e0ae67b372")
        private static SmDependency ImportingOperationDep = null;

        @objid ("6ad0a0dd-dbee-4f86-98ee-55f7b2bac463")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("9c61c49d-fbd9-4678-8e92-9fd5237a1046")
        private static SmDependency ImportedPackageDep = null;

        @objid ("577b7d2b-a2b5-4c10-b393-d7d5775a6321")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0b4e55f7-37a9-4644-bbe4-f2f19b3caeea")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("eb207d14-7512-42c8-a9e9-963bdca35f06")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("3d363ec5-cca2-45fb-adc4-3730018ca938")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("c98dbdac-1856-4b33-8a26-295250aa9028")
        public static SmDependency ImportedPackageDep() {
            if (ImportedPackageDep == null) {
            	ImportedPackageDep = classof().getDependencyDef("ImportedPackage");
            }
            return ImportedPackageDep;
        }

        @objid ("6f59ea27-f654-435f-9664-46d1f4fd8ab4")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("08ff5e3f-cf4a-4540-8f6d-2968bcc879cf")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("941554ec-3bd7-4c1c-8b30-55c45bf5236a")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("79ade3c4-6057-4090-9125-8fe74b9b66b6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f92f3edf-18c2-4956-819b-bbfe93748cd8")
        public static SmDependency getImportedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedPackageDep;
        }

        @objid ("004b90e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8bee9270-c84b-4e9f-92d9-848e69f405a4")
            public ISmObjectData createData() {
                return new PackageImportData();
            }

            @objid ("e5f30786-b9cc-4f95-ba06-c4f38f1bef66")
            public SmObjectImpl createImpl() {
                return new PackageImportImpl();
            }

        }

        @objid ("004bf7da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("5456bf22-c0b7-4e7b-9696-5b125ba80d13")
            public Object getValue(ISmObjectData data) {
                return ((PackageImportData) data).mVisibility;
            }

            @objid ("9375c12b-9262-4903-bb3a-553a6f1b737b")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageImportData) data).mVisibility = value;
            }

        }

        @objid ("004c5b80-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("a970fb3f-1cbf-4dee-8a94-900980c6cd6c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingNameSpace;
            }

            @objid ("6bcea689-b054-4b4b-b86b-93128a10e7db")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingNameSpace = value;
            }

            @objid ("94a20d21-1dba-471f-86dd-789e6598533a")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004ccfde-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("56274ad6-e516-4ff1-b0b5-4bbb56274800")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingOperation;
            }

            @objid ("20baceb1-4635-46aa-b1bd-903af935b95e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingOperation = value;
            }

            @objid ("7f196481-a3bf-4352-ab56-e93c85147663")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004d4c16-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportedPackageSmDependency extends SmSingleDependency {
            @objid ("8a39082b-81b1-42d5-9a59-1cac9fa6c19d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportedPackage;
            }

            @objid ("58eb55de-e8bc-49dd-94f7-915db971225c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportedPackage = value;
            }

            @objid ("f5ae5626-ffd2-492f-b5c2-9dc406b99bd1")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.PackageImportingDep();
            }

        }

    }

}
