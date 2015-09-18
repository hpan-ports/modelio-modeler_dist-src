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
    @objid ("8126304a-8c2e-40c3-bff8-ec7c14686e5e")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("5bd75e59-d812-45ea-85de-5c22e80e9f3f")
    @SmaMetaAssociation(metaName="ImportingNameSpace", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImportingNameSpaceSmDependency.class)
     SmObjectImpl mImportingNameSpace;

    @objid ("5f3fa2d2-ec21-4954-b87a-35c72772d4be")
    @SmaMetaAssociation(metaName="ImportedElement", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.ImportedElementSmDependency.class, partof = true)
     SmObjectImpl mImportedElement;

    @objid ("bcfe173b-2f9b-4077-9632-24a27f15f343")
    @SmaMetaAssociation(metaName="ImportingOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImportingOperationSmDependency.class)
     SmObjectImpl mImportingOperation;

    @objid ("4e47a6bd-306c-4075-bc53-dfc567f2ff6e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ff64c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f65ff4a7-1eba-4a01-a0cd-265a2643d7ea")
        private static SmClass smClass = null;

        @objid ("cefd6112-4585-4fc8-abeb-822edd04f7ee")
        private static SmAttribute VisibilityAtt = null;

        @objid ("aa3918a8-fc8e-407f-9f7c-a9554e3bec57")
        private static SmDependency ImportingNameSpaceDep = null;

        @objid ("75732f6d-c0e4-4d35-bf0a-bcc1ee5d7906")
        private static SmDependency ImportedElementDep = null;

        @objid ("dcdf04c5-7762-4be7-8a0d-02dd4c19f0fe")
        private static SmDependency ImportingOperationDep = null;

        @objid ("90a6ec66-6e0d-438a-a58b-31119806c713")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementImportData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5a9b729b-05c9-4069-9019-c2935f9f1bc9")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("4e47a44b-afeb-401a-8972-b68cf42e960c")
        public static SmDependency ImportingNameSpaceDep() {
            if (ImportingNameSpaceDep == null) {
            	ImportingNameSpaceDep = classof().getDependencyDef("ImportingNameSpace");
            }
            return ImportingNameSpaceDep;
        }

        @objid ("c053bece-5f1f-4bbd-b60d-e37783678215")
        public static SmDependency ImportedElementDep() {
            if (ImportedElementDep == null) {
            	ImportedElementDep = classof().getDependencyDef("ImportedElement");
            }
            return ImportedElementDep;
        }

        @objid ("5336d820-d0eb-450e-b553-4a30fc39c366")
        public static SmDependency ImportingOperationDep() {
            if (ImportingOperationDep == null) {
            	ImportingOperationDep = classof().getDependencyDef("ImportingOperation");
            }
            return ImportingOperationDep;
        }

        @objid ("9578ab50-944c-4ccc-8583-b50b48bb49fd")
        public static SmDependency getImportingNameSpaceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingNameSpaceDep;
        }

        @objid ("b31e5f96-2ecf-4c37-b711-aba325a063ec")
        public static SmDependency getImportingOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingOperationDep;
        }

        @objid ("a195ef51-5cf3-40d7-b779-5abd8c0cb696")
        public static SmDependency getImportedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportedElementDep;
        }

        @objid ("7937d54f-6e0a-46d6-a332-86237a60381a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("eb09d3e0-3937-4173-b233-cbda308f01b6")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("004036b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5e736a7b-0028-4f4e-8bf6-6ecbea171b54")
            public ISmObjectData createData() {
                return new ElementImportData();
            }

            @objid ("2dc7e515-f381-4b46-906f-4bf34a1190bc")
            public SmObjectImpl createImpl() {
                return new ElementImportImpl();
            }

        }

        @objid ("004096a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("f208f6cd-600d-4dc1-aa15-64f1e3740074")
            public Object getValue(ISmObjectData data) {
                return ((ElementImportData) data).mVisibility;
            }

            @objid ("9ced3e3b-3704-4891-9880-0c3a5c5c921a")
            public void setValue(ISmObjectData data, Object value) {
                ((ElementImportData) data).mVisibility = value;
            }

        }

        @objid ("0040f88a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportedElementSmDependency extends SmSingleDependency {
            @objid ("2df45d22-2477-4280-9d18-1e7a8a5c2be4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportedElement;
            }

            @objid ("3cd5941a-415d-4f93-ac0e-59e1275b6fd7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportedElement = value;
            }

            @objid ("796eb054-9dec-4b05-8f9b-f022b2dcc515")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ImportingDep();
            }

        }

        @objid ("00416cca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingNameSpaceSmDependency extends SmSingleDependency {
            @objid ("01dee7be-282b-42c6-a9a6-83285dd3a6e7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingNameSpace;
            }

            @objid ("0b104e3d-209e-499f-8521-aa099c00bd25")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingNameSpace = value;
            }

            @objid ("d2228936-4999-449e-a409-54745f747276")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedImportDep();
            }

        }

        @objid ("0041e114-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingOperationSmDependency extends SmSingleDependency {
            @objid ("2d7315f7-5c2b-412e-8caa-a3f0b40d8024")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ElementImportData) data).mImportingOperation;
            }

            @objid ("b4818849-19d2-4cfd-85c9-6be61ad30915")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ElementImportData) data).mImportingOperation = value;
            }

            @objid ("29e54e11-3915-46d2-bd6a-c4183e64938a")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedImportDep();
            }

        }

    }

}
