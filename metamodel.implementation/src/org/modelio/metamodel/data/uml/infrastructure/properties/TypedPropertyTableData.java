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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
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

@objid ("006b9a7c-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=TypedPropertyTable.class, factory=TypedPropertyTableData.Metadata.ObjectFactory.class)
public class TypedPropertyTableData extends PropertyTableData {
    @objid ("2635672b-9a3d-439d-a40c-e6c3c7e5e2fe")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("df40c6a1-ba47-4698-8ce7-65af9c6179d0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051a4fa-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("f35675be-43a8-439d-a979-b6142af3f726")
        private static SmClass smClass = null;

        @objid ("66170f89-1c2f-4663-9d96-fabfbe0d38cf")
        private static SmDependency TypeDep = null;

        @objid ("d7efa8b2-666f-4517-bf7e-5d94ef032275")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TypedPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4a3987e5-1fea-4dea-a799-c64cac2ff0b1")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("31dbf0e9-7379-47a7-9931-d1e9c9415c80")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("30cc2ce2-8aad-440d-8d81-9a8ae8f535e9")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("0052059e-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("587845b4-028b-4188-a2ef-1b0146925b4b")
            public ISmObjectData createData() {
                return new TypedPropertyTableData();
            }

            @objid ("42822de1-181d-441b-a0e9-ba9272babd42")
            public SmObjectImpl createImpl() {
                return new TypedPropertyTableImpl();
            }

        }

        @objid ("0052e0ae-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("8a8e22ae-7e6d-499d-8944-a7d0685ce1bd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TypedPropertyTableData) data).mType;
            }

            @objid ("d8937232-fec5-4cf5-abac-0135775cf5ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TypedPropertyTableData) data).mType = value;
            }

            @objid ("75cb9697-9d11-4cac-bc9c-bd36b5f794c2")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.TypedTableDep();
            }

        }

    }

}
