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
import org.modelio.metamodel.impl.uml.statik.ElementImportImpl;
import org.modelio.metamodel.uml.statik.ElementImport;
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

@objid ("000879a6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ElementImport.class, factory=ElementImportData.Metadata.ObjectFactory.class)
public class ElementImportData extends ModelElementData {
    @objid ("aefba2e1-d85c-4b0f-9620-1a424687eeea")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("c7cf0c0e-a742-49c0-8d90-e8a426406c92")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("284130b6-d2f0-4131-80e7-7795b0fc5bd6")
    @SmaMetaAssociation(metaName="ImportedElement", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.ImportedElementSmDependency.class, partof = true)
     SmObjectImpl mImportedElement;

    @objid ("3c6517a7-9960-49af-bc4f-4fea98310693")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("cd492346-41d8-410e-b48d-9b5e23055f67")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ff64c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f9d5eebd-bab0-41f1-8aa0-638f438d8aa0")
        private static SmClass smClass = null;

        @objid ("288ac0fc-74fb-48ff-8570-da56c349849b")
        private static SmAttribute VisibilityAtt = null;

        @objid ("a4c8dffb-a580-478f-a3d1-4b6207e11035")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("c4c2864f-7be7-41f3-9a8d-13a9223f29af")
        private static SmDependency ImportedElementDep = null;

        @objid ("3e6198de-eb22-44d2-90dd-42b3f69764d4")
        private static SmDependency ImportingOperationDep = null;

        @objid ("fc9d3c9d-2b5a-4a7e-8a46-04df571094e5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1f63a6c1-307b-426c-a430-10b7c3aa5277")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("cc0b9ca7-0159-495d-a618-c425bdc179a6")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("c20cfe6f-9852-40cb-a823-26ba4e02cb66")
        public static SmDependency ImportedElementDep() {
            if (ImportedElementDep == null) {
            	ImportedElementDep = classof().getDependencyDef("ImportedElement");
            }
            return ImportedElementDep;
        }

        @objid ("c5000cdf-de10-40b3-8879-b810a91df59b")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("0be7a324-0b9a-4c52-9475-106de8502690")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("dc4aa876-4221-4df5-8d37-3fe6893962bf")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("504ab070-4208-44dd-8240-f7a6d7d3aa87")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("a753d98d-6a24-43c5-8963-034a5ca09c23")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8ceaf2a2-4758-4895-b099-5370fa713422")
        public static SmDependency getImportedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedElementDep;
        }

        @objid ("004036b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c1a17696-6ce9-4746-a75a-c36d3d2b2a97")
            public ISmObjectData createData() {
                return new ElementImportData();
            }

            @objid ("15eeb38a-377d-46fd-9f44-b28d31ad9ebe")
            public SmObjectImpl createImpl() {
                return new ElementImportImpl();
            }

        }

        @objid ("004096a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("d0e35239-db14-4b9e-b5fd-6de7bbe33d25")
            public Object getValue(ISmObjectData data) {
                return ((ElementImportData) data).mVisibility;
            }

            @objid ("d1f085c6-3955-431f-b372-74a634a4564b")
            public void setValue(ISmObjectData data, Object value) {
                ((ElementImportData) data).mVisibility = value;
            }

        }

        @objid ("0040f88a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportedElementSmDependency extends SmSingleDependency {
            @objid ("096d9e4c-327c-4e05-95dc-02774eef050d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportedElement;
            }

            @objid ("052b5261-e47b-4c77-891a-834e7feee4e7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportedElement = value;
            }

            @objid ("58deff03-a984-4365-81d2-fbdd312a5987")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ImportingDep();
            }

        }

        @objid ("00416cca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("f978780e-966d-4773-a320-8a186917957d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingNameSpace;
            }

            @objid ("143ac903-fc8c-4a30-8cfe-37214b3cd937")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingNameSpace = value;
            }

            @objid ("1cd9e920-69db-446a-9138-e622cd6dbe24")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedImportDep();
            }

        }

        @objid ("0041e114-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("17f71b49-3e2d-4ce0-89d0-ab2c875a29d8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingOperation;
            }

            @objid ("39ff5cbc-19df-4e2f-bd9f-6b8ff4bec78e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingOperation = value;
            }

            @objid ("87458778-3bd9-427f-931e-97909b463d76")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedImportDep();
            }

        }

    }

}
