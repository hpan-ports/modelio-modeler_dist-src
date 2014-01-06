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
    @objid ("4233a186-79ea-46ea-b358-c10f619f1673")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTable = null;

    @objid ("a63c3895-74e5-47f0-a388-ac42e60fe118")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=1, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("151b3e3b-56a3-4a19-9f62-7a771f74b14d")
    @SmaMetaAssociation(metaName="DefinedType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedType = null;

    @objid ("f4b42b1a-2b2a-4c7c-b3af-fc61c5dd4615")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0022b5be-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1090c4f0-7f6a-4fa8-8350-aa53246fc317")
        private static SmClass smClass = null;

        @objid ("a663834e-2b0f-4ce3-b8d9-df114eb876fb")
        private static SmDependency DefinedTableDep = null;

        @objid ("3d78a6eb-96b8-4194-b33e-d1353894d88e")
        private static SmDependency OwnerProjectDep = null;

        @objid ("ddfe3526-6872-4b8f-980e-d57400cb110f")
        private static SmDependency DefinedTypeDep = null;

        @objid ("bfb4b90a-b8c5-4707-adb6-4e5f5bf4075a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f011f076-717b-43a2-ab9f-583a24ace02d")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("d8e450e6-6dbd-4aaf-ac7b-b595ceebfff5")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("51e56540-0b28-4716-be14-c0265f81c7d0")
        public static SmDependency DefinedTypeDep() {
            if (DefinedTypeDep == null) {
            	DefinedTypeDep = classof().getDependencyDef("DefinedType");
            }
            return DefinedTypeDep;
        }

        @objid ("6752003d-c3c3-445b-ac9b-3e58df9911f1")
        public static SmDependency getDefinedTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTypeDep;
        }

        @objid ("8147f119-223a-4e72-b6b6-a4872a245517")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("5eb9bed5-094b-46d8-91fc-8b6ad64e773b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4f1bd409-a07f-4ec6-9db9-16779e9e326e")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("0022f772-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("81db062a-54ad-4974-bc38-d6f4e6bed0c5")
            public ISmObjectData createData() {
                return new PropertyContainerData();
            }

            @objid ("295e3ea2-c2c7-4375-afa0-8823fd9fb072")
            public SmObjectImpl createImpl() {
                return new PropertyContainerImpl();
            }

        }

        @objid ("0024357e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefinedTypeSmDependency extends SmMultipleDependency {
            @objid ("2d4755fd-bb08-4dac-a990-7e374a70a75a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedType != null)? ((PropertyContainerData)data).mDefinedType:SmMultipleDependency.EMPTY;
            }

            @objid ("2c063bcf-4f23-41d8-b3b1-779dd7e1e886")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedType = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedType;
            }

            @objid ("5361633f-fd1b-4a00-a9db-bbf5b9d62742")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.AnalystOwnerDep();
            }

        }

        @objid ("0056f23e-ec97-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmMultipleDependency {
            @objid ("e2b0f7b7-3483-43ca-b241-f571af47dd21")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((PropertyContainerData)data).mDefinedTable != null)? ((PropertyContainerData)data).mDefinedTable:SmMultipleDependency.EMPTY;
            }

            @objid ("2037d231-50b7-4d63-94f8-597aa0f99df1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((PropertyContainerData) data).mDefinedTable = new ArrayList<>(initialCapacity);
                return ((PropertyContainerData) data).mDefinedTable;
            }

            @objid ("bb4fde1a-c2af-48d3-a8be-8f81347457df")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerDep();
            }

        }

        @objid ("29a02661-f07f-4f9f-b5ba-270e0e1a234d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("a72b8eee-aec5-4fc6-b8bd-d2b6563f72f8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyContainerData) data).mOwnerProject;
            }

            @objid ("7966da49-9963-4cdc-8b02-93919d0b99c1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyContainerData) data).mOwnerProject = value;
            }

            @objid ("f04ae994-ea51-44cb-9142-a095daf3f0be")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.PropertyRootDep();
            }

        }

    }

}
