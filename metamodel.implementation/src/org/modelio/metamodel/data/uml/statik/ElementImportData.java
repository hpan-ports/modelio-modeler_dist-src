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
    @objid ("dbf14d62-c02e-46d8-8596-81c0d2ff8f6e")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("9dfc172e-1419-4ed0-aa5f-63d05ce773bd")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("d3b773e5-a3a3-43f5-9e2c-f5e30387dea1")
    @SmaMetaAssociation(metaName="ImportedElement", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.ImportedElementSmDependency.class, partof = true)
     SmObjectImpl mImportedElement;

    @objid ("b6f7e29f-2a8a-4a3a-9ef5-d952ae8c9102")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("36c7dcae-110f-4799-8ede-072838d5e61b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ff64c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5fcfa14d-6b8c-4cf7-ba0d-be2562ed6934")
        private static SmClass smClass = null;

        @objid ("e3e91ee7-4aa9-49e9-af39-2d9df6295b87")
        private static SmAttribute VisibilityAtt = null;

        @objid ("c4a7eb37-b46e-4fa4-8b19-12d04494d79d")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("c026e779-b362-4d72-beb4-8653a792c722")
        private static SmDependency ImportedElementDep = null;

        @objid ("045dfcc4-e096-4f6f-bb62-5e066d8ddfa7")
        private static SmDependency ImportingOperationDep = null;

        @objid ("9652842f-6da9-45c3-b338-c055d034f2f4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b92b9420-4552-44da-8f40-6508c945b82d")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("32f43b8f-c39f-4caa-b64e-bc3ddba630ab")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("cff34850-8203-44f7-a844-ab9abe0a0082")
        public static SmDependency ImportedElementDep() {
            if (ImportedElementDep == null) {
            	ImportedElementDep = classof().getDependencyDef("ImportedElement");
            }
            return ImportedElementDep;
        }

        @objid ("5bc28262-4a39-433e-9cc1-1a7a36e98cdb")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("b863bada-a210-4136-bb27-4b75db418d22")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("b3d2bc65-1251-4606-b5a1-146e6a4287e3")
        public static SmDependency getImportedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedElementDep;
        }

        @objid ("cd21c72b-18d9-426f-a6a1-095e388a4e95")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("9f799ed5-7a9e-4e45-9035-232181a07cb8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("679162c8-f318-4328-b9d2-80d2f5614f3b")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("004036b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("781948c5-e7e9-49ee-bf30-7cdd50a34425")
            public ISmObjectData createData() {
                return new ElementImportData();
            }

            @objid ("f047ffd2-7d7b-4a45-826f-c9419b8d8e1a")
            public SmObjectImpl createImpl() {
                return new ElementImportImpl();
            }

        }

        @objid ("004096a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("17b894f1-44c6-4b05-81ab-c58fe37cf44e")
            public Object getValue(ISmObjectData data) {
                return ((ElementImportData) data).mVisibility;
            }

            @objid ("38a91a7c-99b5-426a-840a-aa74d7458e13")
            public void setValue(ISmObjectData data, Object value) {
                ((ElementImportData) data).mVisibility = value;
            }

        }

        @objid ("0040f88a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportedElementSmDependency extends SmSingleDependency {
            @objid ("f8af7aba-3972-468e-a2f2-6facd8f9ad30")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportedElement;
            }

            @objid ("bd5c8033-d90d-44dd-be2e-a432615033d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportedElement = value;
            }

            @objid ("460849a7-1012-420c-9321-8b9371eb0fc1")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ImportingDep();
            }

        }

        @objid ("00416cca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("82b28fb1-cf73-4fd1-904b-d0506e429ad5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingNameSpace;
            }

            @objid ("8c8aa7f9-f40a-4762-a214-670eda1516c7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingNameSpace = value;
            }

            @objid ("f10e9e7d-133c-493b-bc40-78d4aeb1a60a")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedImportDep();
            }

        }

        @objid ("0041e114-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("b23ebafa-9e10-4cf1-985f-e328d1b5c711")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingOperation;
            }

            @objid ("1897276c-942f-496a-9e45-1ce7bb0a1424")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingOperation = value;
            }

            @objid ("b7041ca4-6c93-4ce1-afec-1c0c9ccd71ff")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedImportDep();
            }

        }

    }

}
