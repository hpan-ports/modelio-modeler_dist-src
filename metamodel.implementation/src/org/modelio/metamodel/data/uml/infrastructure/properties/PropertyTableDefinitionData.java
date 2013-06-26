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
    @objid ("888ae7fc-2b68-4d9f-8c5c-918c3bbaf7e2")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=PropertyContainerData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f31033d3-98d3-4778-8030-cd72055ec2ff")
    @SmaMetaAssociation(metaName="TypedTable", typeDataClass=TypedPropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.TypedTableSmDependency.class, istodelete = true)
     List<SmObjectImpl> mTypedTable = null;

    @objid ("01b894f5-521c-41b6-bb3f-427e4e3c0b75")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("8191a1c2-4526-4ef3-8e95-9d841058156c")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("0314e92d-389a-41aa-82a6-400a1876ea4b")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=PropertyDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("a9b3e2f1-7b4b-41e2-9366-36ad2aa2c29b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078281e-ec96-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("1c348635-43e4-445a-bf59-e86852ce4999")
        private static SmClass smClass = null;

        @objid ("55148c9d-1f62-4e1c-a46f-848a8ad3b310")
        private static SmDependency OwnerDep = null;

        @objid ("6be4f6df-9bec-4daa-8558-8c766b73439e")
        private static SmDependency TypedTableDep = null;

        @objid ("1032a770-87a9-4b77-b184-a4614b4de123")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("7dc28fa4-c4dc-424a-9432-be73592bd57f")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("e7a54b37-5091-470a-8f29-31c767e05885")
        private static SmDependency OwnedDep = null;

        @objid ("6e055eeb-d2b9-4717-8210-931d978d43dd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cb3f0b11-19f2-44ad-bc14-49c189efcab9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e76bcd39-3b21-4136-a286-061d0c52f3b4")
        public static SmDependency TypedTableDep() {
            if (TypedTableDep == null) {
            	TypedTableDep = classof().getDependencyDef("TypedTable");
            }
            return TypedTableDep;
        }

        @objid ("c4d9a37c-eb06-4fcb-837b-fb8b722ef011")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("7568e42f-3b20-498a-9744-54430ab810ae")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("ade4e236-9d87-4a12-a323-456b0fa06be1")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("07c0e32c-60e4-401a-9928-8c1d390ebf26")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("74228f38-d2f7-4961-badf-c443c579e462")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c874132d-a682-48d7-a581-e5a83eb4538c")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("27b5bcfb-d8b7-475c-98b6-7b9c4ebb7f32")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("8031ac7a-59a5-4e18-ab83-e2ba1588c0e3")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("a5954345-2786-4783-98db-aefd51ab2ecb")
        public static SmDependency getTypedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedTableDep;
        }

        @objid ("00788eda-ec96-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("60497643-818b-48b8-bf7b-791a4ea3d5fc")
            public ISmObjectData createData() {
                return new PropertyTableDefinitionData();
            }

            @objid ("bb2a4332-a4db-4018-b051-a987b9117038")
            public SmObjectImpl createImpl() {
                return new PropertyTableDefinitionImpl();
            }

        }

        @objid ("007bed14-ec96-1098-b22e-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("0602dde4-36f6-477e-b72c-074267eb55d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mOwned != null)? ((PropertyTableDefinitionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("1044ec25-0dca-4732-99a0-f0229c718998")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mOwned;
            }

            @objid ("38ecad15-f68d-4120-89db-35467d115858")
            @Override
            public SmDependency getSymetric() {
                return PropertyDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("007cd184-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("4652e6d1-6c5c-4baf-bc06-a4a7535e74a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwner;
            }

            @objid ("3955b1cc-9c45-4ce0-8b3f-e6933b9ff7c7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwner = value;
            }

            @objid ("8fc510c2-39b9-4416-b754-6ef3b53e2235")
            @Override
            public SmDependency getSymetric() {
                return PropertyContainerData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007e591e-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("66543f5b-157d-4234-bc87-614be922cfcb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerStereotype;
            }

            @objid ("ce8e05f3-ca7d-4a7e-bc17-992b1857397e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerStereotype = value;
            }

            @objid ("29c207bb-bb89-41f4-ba84-d3453e9b7a26")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTableDep();
            }

        }

        @objid ("007f5cf6-ec96-1098-b22e-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("b451babb-4e98-4063-ba5a-49e501ec6824")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableDefinitionData) data).mOwnerReference;
            }

            @objid ("743f2ab6-6783-427d-9306-f5773969d003")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableDefinitionData) data).mOwnerReference = value;
            }

            @objid ("312f297a-a77e-4960-a2f2-681a06af578d")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTableDep();
            }

        }

        @objid ("00805eb2-ec96-1098-b22e-001ec947cd2a")
        public static class TypedTableSmDependency extends SmMultipleDependency {
            @objid ("51269c4a-140b-4c8d-91d4-809a8d7812a3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyTableDefinitionData)data).mTypedTable != null)? ((PropertyTableDefinitionData)data).mTypedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("047114fb-29b0-4412-a94b-75354ad91320")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyTableDefinitionData) data).mTypedTable = new ArrayList<>(initialCapacity);
                return ((PropertyTableDefinitionData) data).mTypedTable;
            }

            @objid ("abb743c7-d1d4-4886-bcf3-406770414f56")
            @Override
            public SmDependency getSymetric() {
                return TypedPropertyTableData.Metadata.TypeDep();
            }

        }

    }

}
