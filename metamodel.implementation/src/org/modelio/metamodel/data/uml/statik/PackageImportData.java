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
    @objid ("591eace9-15c5-4833-972d-1599d8326be2")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("1fe908b4-82f4-47e9-9652-9428e12e3ece")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("99d0251b-8e3d-47cb-a9d2-ecf5338799e6")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("ef96bc13-b182-484a-8a07-dd65ea3d40e9")
    @SmaMetaAssociation(metaName="ImportedPackage", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ImportedPackageSmDependency.class, partof = true)
     SmObjectImpl mImportedPackage;

    @objid ("b55181c3-1f02-4e4b-b4af-09f513044b99")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004b4f92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e8d772ed-98c7-4d1a-9b8b-36f350f8451a")
        private static SmClass smClass = null;

        @objid ("d17ea6a9-4e40-4440-a59a-79cb4d84f8c7")
        private static SmAttribute VisibilityAtt = null;

        @objid ("65e972e0-54f4-424e-8316-eed32914d574")
        private static SmDependency ImportingOperationDep = null;

        @objid ("df3df66c-24a0-4feb-8f79-ab1b84324616")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("fd342158-b5da-4f55-b596-fe23a2bd031a")
        private static SmDependency ImportedPackageDep = null;

        @objid ("3879dfda-9a1d-4812-86c3-5eaa771c055c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PackageImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("00add235-50d0-4be1-8d6f-bc5b259fb9d4")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("ffaa57a9-867a-4c7e-a997-fc68af1d59af")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("679ee31a-c3ce-4cad-bdeb-003cd69e0d3d")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("c59a2968-d0e3-4854-a388-1d576c732683")
        public static SmDependency ImportedPackageDep() {
            if (ImportedPackageDep == null) {
            	ImportedPackageDep = classof().getDependencyDef("ImportedPackage");
            }
            return ImportedPackageDep;
        }

        @objid ("f9347975-897c-444e-b21e-5856f073adf9")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("a240fdfc-ae45-4455-ae6e-646a3450f9f0")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("78bcca7d-6a95-48dc-94ec-c516fddd1686")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("a62fbc00-003c-4fde-a25d-164ac3b77c20")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("04a787d9-7bb0-4788-a3fe-9163a3357ac2")
        public static SmDependency getImportedPackageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedPackageDep;
        }

        @objid ("004b90e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fa911ba5-6e91-4845-90bb-c79a2b7e3d51")
            public ISmObjectData createData() {
                return new PackageImportData();
            }

            @objid ("768f005c-85dc-4169-b1de-0fd802918d50")
            public SmObjectImpl createImpl() {
                return new PackageImportImpl();
            }

        }

        @objid ("004bf7da-c4c2-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("599f86cd-7902-4cc4-b737-1c0da51f0372")
            public Object getValue(ISmObjectData data) {
                return ((PackageImportData) data).mVisibility;
            }

            @objid ("68c48fd5-d76e-4112-a23e-1e884dc7c961")
            public void setValue(ISmObjectData data, Object value) {
                ((PackageImportData) data).mVisibility = value;
            }

        }

        @objid ("004c5b80-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("04b6df11-d99d-4ee0-9431-b16e5cc72b78")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingNameSpace;
            }

            @objid ("3d988eb2-2931-4cae-a946-90c925ae0265")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingNameSpace = value;
            }

            @objid ("05ece81d-168b-48af-ad00-6be2769c8121")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004ccfde-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("7440844d-692b-42e2-b84f-47a43ac1dc9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportingOperation;
            }

            @objid ("27896434-70b6-402a-9269-338d1fbd154f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportingOperation = value;
            }

            @objid ("52d60181-0828-40ce-a87c-a2887720c055")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedPackageImportDep();
            }

        }

        @objid ("004d4c16-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ImportedPackageSmDependency extends SmSingleDependency {
            @objid ("927c2d37-a167-412d-94c3-1fe5ea4ee190")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PackageImportData) data).mImportedPackage;
            }

            @objid ("4f9b4f99-1435-4189-8ca0-1199516cd0dc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PackageImportData) data).mImportedPackage = value;
            }

            @objid ("89f8aeb1-c282-43f4-8485-3782a3d91852")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.PackageImportingDep();
            }

        }

    }

}
