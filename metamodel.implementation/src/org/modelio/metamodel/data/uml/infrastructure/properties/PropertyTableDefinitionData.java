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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.TypedPropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableDefinitionImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
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

@objid ("0067b7c2-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyTableDefinition.class, factory=PropertyTableDefinitionData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyTableDefinitionData extends ModelElementData {
    @objid ("d843e9a3-93b8-42b8-8964-9b6468b2809a")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9f29b50a-6f1a-4c41-a782-fc22fec044a2")
    @SmaMetaAssociation(metaName="TypedTable", typeDataClass=TypedPropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.TypedTableSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTypedTable = null;

    @objid ("db1e2374-b2fa-4988-b335-1ae9da2e2fef")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("082315ea-6431-409c-a1a6-128f7951bf5a")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("9ff663d7-3725-460e-825a-ecc6295fc2f4")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("9b145240-5a7d-44c7-b253-4a5e85796315")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078281e-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("6505224a-2a83-4b78-b406-61f2584ed868")
        private static SmClass smClass = null;

        @objid ("72105506-5b68-4bdb-925f-21fc5011c717")
        private static SmDependency OwnerDep = null;

        @objid ("fec1664a-2410-4672-8442-c2bab7e70526")
        private static SmDependency TypedTableDep = null;

        @objid ("1f7dc18b-7be5-4ccc-a400-a313aa6d5f76")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("563d6d06-9283-4e12-9f20-f8cd86681b39")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("0ffbb269-be0b-4c40-846d-b868a85e7ffd")
        private static SmDependency OwnedDep = null;

        @objid ("e97bd433-d722-4cea-ad27-238879f7efad")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f68c2c93-5563-41db-96a0-88a9bd7019fa")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("098577e8-b8ac-4797-9006-b89d6444b64a")
        public static SmDependency TypedTableDep() {
            if (TypedTableDep == null) {
            	TypedTableDep = classof().getDependencyDef("TypedTable");
            }
            return TypedTableDep;
        }

        @objid ("d191e07c-4c15-4cbc-801d-77ed62db0699")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("6cbe7b1f-24b7-4331-9af6-3451a2166435")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("53872447-d8b4-44f4-9124-5af2b22d8c2d")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("bcca5b7d-fe85-4232-822e-f99db6ecbb88")
        public static SmDependency getTypedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedTableDep;
        }

        @objid ("09552fe7-1071-4996-b1b4-5569936c2059")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("033474dd-36c9-42f5-a415-7a67cff50052")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("d0beed2e-ca1b-4785-aaef-dca15dda940f")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("66accf7c-7b1f-4093-827f-44acf1b46169")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("75c4666c-a481-4784-96e7-9b4047d3b83f")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("00788eda-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("314ba533-e8f1-472d-b307-5a3029312993")
            public ISmObjectData createData() {
                return new PropertyTableDefinitionData();
            }

            @objid ("710db532-caca-4839-9485-7672c5cab864")
            public SmObjectImpl createImpl() {
                return new PropertyTableDefinitionImpl();
            }

        }

        @objid ("007bed14-ec96-1098-b22e-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("a9be76b8-2885-40d3-be4a-73880dd493d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mOwned != null)? ((PropertyTableDefinitionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("8f8d5695-7014-4562-a060-5a5210b30d53")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mOwned;
            }

            @objid ("d02ad8c2-4be2-4f1a-98a0-40bebc746556")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("007cd184-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("27a82fa7-7ccd-41c2-995e-3e63f06cd1f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwner;
            }

            @objid ("b9120ce6-2833-46a5-bb9b-3b937185dff5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwner = value;
            }

            @objid ("926741ba-c20f-4aa4-847a-5902798ebb3c")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007e591e-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("3b37ff4e-063c-4930-9473-f9eff2873ab5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerStereotype;
            }

            @objid ("f812fdf6-7c72-463b-b71e-df0bf8952a6f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerStereotype = value;
            }

            @objid ("3263846b-7c83-46b1-b2ea-1a4a232761c0")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007f5cf6-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("932c23ac-d454-493d-8c68-2a9026dbedcb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerReference;
            }

            @objid ("dbd54099-e3bd-403a-b1fb-45a4470dfae5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerReference = value;
            }

            @objid ("6b26a37c-8738-4d0e-8ffb-31d499af3ba2")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTableDep();
            }

        }

        @objid ("00805eb2-ec96-1098-b22e-001ec947cd2a")
        public static class TypedTableSmDependency extends SmMultipleDependency {
            @objid ("aae1b7ce-b5b4-4f49-ad77-468a55932ce8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mTypedTable != null)? ((PropertyTableDefinitionData)data).mTypedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("0c140810-0913-4ee3-88ef-51c5951ae7cc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mTypedTable = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mTypedTable;
            }

            @objid ("99c10cc3-cc6e-42a6-be56-62de8cb6bbd0")
            @Override
            public SmDependency getSymetric() {
                return TypedPropertyTableData.Metadata.TypeDep();
            }

        }

    }

}
