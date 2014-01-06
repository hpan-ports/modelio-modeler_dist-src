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
    @objid ("d0eb2b90-2632-43f3-a8cd-b6e509eda92a")
    @SmaMetaAssociation(metaName="Type", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("001008e5-fc0d-4157-926e-16c354088fe5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0051a4fa-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("4fa336b3-3f62-4c28-921c-42cc18fa4c93")
        private static SmClass smClass = null;

        @objid ("b1d50849-f064-4921-8e50-2ca8ca61ec97")
        private static SmDependency TypeDep = null;

        @objid ("650d4d28-7be6-4fce-a0b3-e81e4ef42de3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TypedPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08d54e79-5ce6-422f-8b78-4770e9e6eb5e")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d970b48e-e450-4d00-ad32-dc433a655b40")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("a59b38bd-00a2-4882-b944-a95a329ccde6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0052059e-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8ceaecbc-295b-4944-98c8-52990b869ed0")
            public ISmObjectData createData() {
                return new TypedPropertyTableData();
            }

            @objid ("a311e179-34a2-4e3b-96b6-509236977e6f")
            public SmObjectImpl createImpl() {
                return new TypedPropertyTableImpl();
            }

        }

        @objid ("0052e0ae-ec98-1098-b22e-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("31e5edb3-a326-458d-9626-72743c12719b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TypedPropertyTableData) data).mType;
            }

            @objid ("61c7778b-6dd3-4a45-bda6-9f3f9dc63301")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TypedPropertyTableData) data).mType = value;
            }

            @objid ("1a53d7ff-5608-4c61-a0aa-35d10cd6f8f4")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.TypedTableDep();
            }

        }

    }

}
