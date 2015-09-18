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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.analyst.PropertyContainerImpl;
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

@objid ("00633774-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyContainer.class, factory=PropertyContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class PropertyContainerData extends ModelElementData {
    @objid ("6cabec2b-7d4d-4502-aac6-3e9d3cfeffe6")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTable = null;

    @objid ("c0f9dfd7-42ca-437a-907a-0d8b4ebafb59")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=1, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("02b183a9-a524-4853-9fcd-192af2dae8a1")
    @SmaMetaAssociation(metaName="DefinedType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedType = null;

    @objid ("7477b7ad-e9a4-4b4a-a78e-996503b76a3f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0022b5be-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("29392a84-9d72-4ac9-ad11-6586f7935b05")
        private static SmClass smClass = null;

        @objid ("c34fd688-75ae-45f1-b615-16228375f2d5")
        private static SmDependency DefinedTableDep = null;

        @objid ("e8496b50-7f67-48d4-82e9-ef6faed3dbfe")
        private static SmDependency OwnerProjectDep = null;

        @objid ("f2c9d82c-491c-4892-80be-c8fb0b34229d")
        private static SmDependency DefinedTypeDep = null;

        @objid ("0c28c3da-6596-4811-ba97-ac1e047b5071")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d2d85dfe-ad57-4c5f-82f4-bc64bf8d3a0b")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("254ab95b-f899-4a3f-823f-d7d88b9da20a")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("24cb67fa-a165-4c3c-b6ba-37e55168c6e8")
        public static SmDependency DefinedTypeDep() {
            if (DefinedTypeDep == null) {
            	DefinedTypeDep = classof().getDependencyDef("DefinedType");
            }
            return DefinedTypeDep;
        }

        @objid ("2710c181-6027-42fb-9d9e-714fb40eeb92")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("cc374507-566f-4988-adb9-0795e2ef3d42")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("86d20ab3-9d5e-40a6-be5a-85b92aaaf15f")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("11d9ecd1-411f-4828-966d-5c57e419deb8")
        public static SmDependency getDefinedTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTypeDep;
        }

        @objid ("0022f772-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b671feb-3827-4f69-995b-ef6f437b3d65")
            public ISmObjectData createData() {
                return new PropertyContainerData();
            }

            @objid ("28ca7bb4-93c4-4ba1-af9c-50e033207ee0")
            public SmObjectImpl createImpl() {
                return new PropertyContainerImpl();
            }

        }

        @objid ("0024357e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefinedTypeSmDependency extends SmMultipleDependency {
            @objid ("8aff4fc0-e432-4bf9-b096-86557792cf38")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedType != null)? ((PropertyContainerData)data).mDefinedType:SmMultipleDependency.EMPTY;
            }

            @objid ("0bc6c125-30fa-4518-91b4-6f75094da7fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedType = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedType;
            }

            @objid ("0f8e7824-be8a-4565-b9c6-967ecc832173")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.AnalystOwnerDep();
            }

        }

        @objid ("0056f23e-ec97-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmMultipleDependency {
            @objid ("8fcbb05e-48a0-4c54-b31e-c72d2b8c6ad4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedTable != null)? ((PropertyContainerData)data).mDefinedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("592f0202-db7c-4bc8-8261-19656be0a01a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedTable = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedTable;
            }

            @objid ("02619140-5113-4138-82ef-2725243657ea")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("29a02661-f07f-4f9f-b5ba-270e0e1a234d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("de9a652d-0197-436b-b634-42e3fdc5fabf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyContainerData) data).mOwnerProject;
            }

            @objid ("8d6aa16b-d090-4424-95a8-5ed2f8390097")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyContainerData) data).mOwnerProject = value;
            }

            @objid ("ec75d479-e4c8-407f-8501-7241bdbbfcf7")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.PropertyRootDep();
            }

        }

    }

}
