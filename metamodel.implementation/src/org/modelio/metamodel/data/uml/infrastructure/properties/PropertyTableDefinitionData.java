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
    @objid ("432a51bf-ecbc-46dd-aca7-b6b794896c8a")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("05778039-7ad7-418c-9373-b893fb54faf2")
    @SmaMetaAssociation(metaName="TypedTable", typeDataClass=TypedPropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.TypedTableSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTypedTable = null;

    @objid ("8b144ad4-1be8-4c81-9739-afea0e211f2e")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("19e2a29e-1e3e-445d-abf7-e93e4e0481f8")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("7458416e-5757-477c-848d-6bc90bc75567")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("efbf5dbc-028d-4877-8064-25902799afdb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078281e-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("eb6517d4-0b31-43a0-8619-a5c7b0f9a6a5")
        private static SmClass smClass = null;

        @objid ("09288746-ac56-46fe-8a40-c47fa9c837f4")
        private static SmDependency OwnerDep = null;

        @objid ("155a55ad-127f-4449-b545-39266dbba77d")
        private static SmDependency TypedTableDep = null;

        @objid ("e0c0079e-9396-484e-99ef-1dac32676e07")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("f7b57260-68b2-471b-932a-72c4d0898789")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("25c8e374-7fc6-445b-a084-978f67c17bb1")
        private static SmDependency OwnedDep = null;

        @objid ("77cf3e4a-9f9f-487f-8532-2ac9aac9fc19")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5eace784-5810-4b68-aec5-01ab88150a67")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("71534f7c-64d4-42c6-86f9-d7676719ca08")
        public static SmDependency TypedTableDep() {
            if (TypedTableDep == null) {
            	TypedTableDep = classof().getDependencyDef("TypedTable");
            }
            return TypedTableDep;
        }

        @objid ("3b4481d7-d9a2-490d-a020-3382cdd39c4d")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("dbc6de15-e84e-49bc-9705-6629018d6f86")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("fa807edb-dd5f-4b5e-8223-08715c561362")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("a2ca2e9c-383b-4db9-967d-98482c542d11")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("07a442b7-683f-489c-bb15-9e1a022d6863")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("c60cdc92-28cf-465e-b1c1-02045dd2b2df")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("39ab686e-eb20-47ec-9d59-d8efebbca87d")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("aebe78e7-fc31-43f8-b7cf-0b9a283098c9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("927ac64d-5d73-4b7f-bc13-8c500e67d478")
        public static SmDependency getTypedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedTableDep;
        }

        @objid ("00788eda-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b6917367-898f-4cfd-9b3b-54723f8e751e")
            public ISmObjectData createData() {
                return new PropertyTableDefinitionData();
            }

            @objid ("0bc0340f-3d42-4b15-a046-706c2c406cc8")
            public SmObjectImpl createImpl() {
                return new PropertyTableDefinitionImpl();
            }

        }

        @objid ("007bed14-ec96-1098-b22e-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("4634a136-9d51-4786-bf66-1c546793248b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mOwned != null)? ((PropertyTableDefinitionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("5c9c55f4-2786-4a16-b3f4-34f7bec5771d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mOwned;
            }

            @objid ("6289f014-39d3-4df3-a53a-2f1ac68189c4")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("007cd184-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("d7186925-67ea-4d6d-af76-796a281b1634")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwner;
            }

            @objid ("6b27681b-abcd-4599-a5aa-1cd69aa19d4e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwner = value;
            }

            @objid ("0c88ca83-a564-4725-b7e4-d45b738f81de")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007e591e-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("8aad095b-fd42-474e-b965-6a9539d623a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerStereotype;
            }

            @objid ("21a02b67-fda0-4315-b628-0a2e5e862ad0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerStereotype = value;
            }

            @objid ("d7704a9a-81ad-4143-99b0-96693662fbb6")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007f5cf6-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("1cedbed6-5d2e-4a5e-ad6e-5b3bc1c2e3aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerReference;
            }

            @objid ("be19c192-e747-456b-9488-1bcd9738c015")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerReference = value;
            }

            @objid ("3f1c3840-40ad-465c-9560-33713b6603d6")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTableDep();
            }

        }

        @objid ("00805eb2-ec96-1098-b22e-001ec947cd2a")
        public static class TypedTableSmDependency extends SmMultipleDependency {
            @objid ("ed8be173-fb93-4607-a4d5-123b0cbfb310")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mTypedTable != null)? ((PropertyTableDefinitionData)data).mTypedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("5df9772c-be69-4e8b-91e5-0e5fcfa524e3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mTypedTable = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mTypedTable;
            }

            @objid ("f87d3a80-560c-4ffc-9536-1da743d2623f")
            @Override
            public SmDependency getSymetric() {
                return TypedPropertyTableData.Metadata.TypeDep();
            }

        }

    }

}
