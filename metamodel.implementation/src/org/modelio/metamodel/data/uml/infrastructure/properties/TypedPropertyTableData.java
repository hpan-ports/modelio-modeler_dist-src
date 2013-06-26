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
    @objid ("78ad20e6-975a-420d-b6de-9c1d864edff8")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("e8ca3219-56e9-4a56-9cc8-29423bf9f346")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051a4fa-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("6120ec69-6fb0-493e-9cc1-8a9857414bef")
        private static SmClass smClass = null;

        @objid ("a351fc2e-fb94-42a2-9900-fcccdbb3dc09")
        private static SmDependency TypeDep = null;

        @objid ("4764ff45-23aa-4c24-8355-aefb494e7090")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TypedPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ae05969-9ada-4fd8-938f-b93adcbb2f80")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("c539e949-f050-455d-a0da-df387470efd2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("27f4a23e-7f70-4f79-970e-4c9f3cc57745")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("0052059e-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a7b288cd-5fc8-448a-aa5d-51a796f73687")
            public ISmObjectData createData() {
                return new TypedPropertyTableData();
            }

            @objid ("c33da2a9-950b-4b42-8da0-81065b42b9e5")
            public SmObjectImpl createImpl() {
                return new TypedPropertyTableImpl();
            }

        }

        @objid ("0052e0ae-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("d71df859-6dc4-4f34-866a-d8dabcd75d65")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TypedPropertyTableData) data).mType;
            }

            @objid ("85c9b6e1-bf28-484f-990c-2c6db2bf5fd2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TypedPropertyTableData) data).mType = value;
            }

            @objid ("012585a6-9aae-43b6-8a8f-b63535bae639")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.TypedTableDep();
            }

        }

    }

}
