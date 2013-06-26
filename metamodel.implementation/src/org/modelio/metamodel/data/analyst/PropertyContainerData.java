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
    @objid ("40e2b774-7261-4618-bb97-be7b3977eefb")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTable = null;

    @objid ("fe82cd63-a60d-42f6-90e9-59a5673719eb")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=1, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("5fddbbbd-a032-44f2-af94-fbc7464cd27c")
    @SmaMetaAssociation(metaName="DefinedType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedType = null;

    @objid ("f0726401-0322-4e4c-9841-d0dbc27f74ae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0022b5be-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("62d7e973-53b2-4c64-8cf5-cbba05106e2c")
        private static SmClass smClass = null;

        @objid ("d02d9753-07e0-49ee-8f8e-c6edc99b52ba")
        private static SmDependency DefinedTableDep = null;

        @objid ("a33bbdae-dac3-4384-afa5-84f8fe768fff")
        private static SmDependency OwnerProjectDep = null;

        @objid ("5c3c4e0d-4284-4910-ab76-1697909281ba")
        private static SmDependency DefinedTypeDep = null;

        @objid ("e7fbd988-176b-4ab6-ba34-e1f6f8288aff")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("21b029d7-d676-44ec-9b03-60c6bd505a9d")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("3838ccdd-e4e5-4ba9-be64-caa48358b4cd")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("a9c0b4bd-4715-4739-9541-9db13818527f")
        public static SmDependency DefinedTypeDep() {
            if (DefinedTypeDep == null) {
            	DefinedTypeDep = classof().getDependencyDef("DefinedType");
            }
            return DefinedTypeDep;
        }

        @objid ("c758d543-3a37-4442-a9db-304e670e56fc")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("cb5069ad-9207-45ea-8e29-0b6d9ebfb105")
        public static SmDependency getDefinedTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTypeDep;
        }

        @objid ("ee76a978-69d8-4dad-9353-4bd31a19990e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3677d72e-dedc-4e00-b59b-40764e34d71e")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("0022f772-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("26c614eb-8889-4985-95ae-e7afe66e78cc")
            public ISmObjectData createData() {
                return new PropertyContainerData();
            }

            @objid ("5ecc5575-a883-434f-b363-419b4e36b04a")
            public SmObjectImpl createImpl() {
                return new PropertyContainerImpl();
            }

        }

        @objid ("0024357e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefinedTypeSmDependency extends SmMultipleDependency {
            @objid ("42032ddf-82c4-4c2a-8a1e-696bb806eb16")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedType != null)? ((PropertyContainerData)data).mDefinedType:SmMultipleDependency.EMPTY;
            }

            @objid ("b99b3213-f7f2-46ad-8582-9b072f1daed9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedType = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedType;
            }

            @objid ("56ad1ae9-937f-4f06-8ecf-afb4efddbd2d")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.AnalystOwnerDep();
            }

        }

        @objid ("0056f23e-ec97-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmMultipleDependency {
            @objid ("4b01ecb7-dd31-493e-a9b4-e9e0d40d2e19")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedTable != null)? ((PropertyContainerData)data).mDefinedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("2c152186-14a3-4850-8dfd-c429f1273444")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedTable = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedTable;
            }

            @objid ("9ae7ebb3-7c5b-4aca-a0e0-551d31a65465")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("29a02661-f07f-4f9f-b5ba-270e0e1a234d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("b58b4115-40ef-4bb2-b725-2378a2a934aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyContainerData) data).mOwnerProject;
            }

            @objid ("37b735db-71e5-416f-a90f-03c80744b001")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyContainerData) data).mOwnerProject = value;
            }

            @objid ("b3581cfe-f689-4f2d-abf8-dfb260b83238")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.PropertyRootDep();
            }

        }

    }

}
