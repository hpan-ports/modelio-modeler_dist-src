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
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyEnumerationLitteralData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.EnumeratedPropertyTypeImpl;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
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

@objid ("00718aa4-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=EnumeratedPropertyType.class, factory=EnumeratedPropertyTypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class EnumeratedPropertyTypeData extends PropertyTypeData {
    @objid ("6d80979e-1cce-463e-b651-5c0511eb5b97")
    @SmaMetaAssociation(metaName="Litteral", typeDataClass=PropertyEnumerationLitteralData.class, min=0, max=-1, smAssociationClass=Metadata.LitteralSmDependency.class, component = true)
     List<SmObjectImpl> mLitteral = null;

    @objid ("0998ca3d-a371-468c-963a-8d7df1b37668")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00591c3a-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("da01516c-477b-4e24-a94c-8d991412fd0b")
        private static SmClass smClass = null;

        @objid ("efa7a59f-9429-46df-a3ed-0883023e12cf")
        private static SmDependency LitteralDep = null;

        @objid ("3cd45096-a83d-4693-861d-e8d83da15441")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumeratedPropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23082ed1-a5d5-462f-beaa-c8989121ad2e")
        public static SmDependency LitteralDep() {
            if (LitteralDep == null) {
            	LitteralDep = classof().getDependencyDef("Litteral");
            }
            return LitteralDep;
        }

        @objid ("635474bc-8b75-47ca-8875-135d61bd2a57")
        public static SmDependency getLitteralDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LitteralDep;
        }

        @objid ("6cf30bcf-db59-4292-b8f4-9cc0b642d6ae")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00597d1a-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("47f4cd7f-3488-4a58-862a-35f8fa02d9ab")
            public ISmObjectData createData() {
                return new EnumeratedPropertyTypeData();
            }

            @objid ("8f7ef2c8-aab2-43bf-9a8f-71c854822184")
            public SmObjectImpl createImpl() {
                return new EnumeratedPropertyTypeImpl();
            }

        }

        @objid ("005a5816-ec98-1098-b22e-001ec947cd2a")
        public static class LitteralSmDependency extends SmMultipleDependency {
            @objid ("258a8a19-727c-4faa-bab4-e3d442110a48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumeratedPropertyTypeData)data).mLitteral != null)? ((EnumeratedPropertyTypeData)data).mLitteral:SmMultipleDependency.EMPTY;
            }

            @objid ("23c91e1f-ec18-4f4b-9cbd-a58f312ff133")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumeratedPropertyTypeData) data).mLitteral = new ArrayList<>(initialCapacity);
                return ((EnumeratedPropertyTypeData) data).mLitteral;
            }

            @objid ("4f4ec87f-e373-45e2-9536-a4c87dce9440")
            @Override
            public SmDependency getSymetric() {
                return PropertyEnumerationLitteralData.Metadata.OwnerDep();
            }

        }

    }

}
