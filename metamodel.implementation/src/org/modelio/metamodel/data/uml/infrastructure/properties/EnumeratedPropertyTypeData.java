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
    @objid ("71262dae-5bab-45ae-b7db-762b512e14f6")
    @SmaMetaAssociation(metaName="Litteral", typeDataClass=PropertyEnumerationLitteralData.class, min=0, max=-1, smAssociationClass=Metadata.LitteralSmDependency.class, component = true)
     List<SmObjectImpl> mLitteral = null;

    @objid ("f2759e6a-9daf-47dc-bcf0-b9546d53e191")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00591c3a-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("bc6edf82-673c-4511-abaa-776c7cbc50c6")
        private static SmClass smClass = null;

        @objid ("b6a7f46f-aca5-4f67-8353-83e0e0078737")
        private static SmDependency LitteralDep = null;

        @objid ("9c95575a-bb72-4943-b97f-bf8a0f9e69fc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumeratedPropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6944b9a6-1d0d-455d-bdd5-2d14b4b047a3")
        public static SmDependency LitteralDep() {
            if (LitteralDep == null) {
            	LitteralDep = classof().getDependencyDef("Litteral");
            }
            return LitteralDep;
        }

        @objid ("c33055b8-c1ad-49f9-b9c3-d24e9ff54403")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f30d15e8-35f7-443a-b4be-009025ee992f")
        public static SmDependency getLitteralDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LitteralDep;
        }

        @objid ("00597d1a-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b1c87fe4-cbed-4307-a98f-64809895b844")
            public ISmObjectData createData() {
                return new EnumeratedPropertyTypeData();
            }

            @objid ("020e9b5a-1dcb-4f58-9032-9fdb4e9d95cf")
            public SmObjectImpl createImpl() {
                return new EnumeratedPropertyTypeImpl();
            }

        }

        @objid ("005a5816-ec98-1098-b22e-001ec947cd2a")
        public static class LitteralSmDependency extends SmMultipleDependency {
            @objid ("b882dbe3-571c-41cb-b3e2-9b89b4b19807")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumeratedPropertyTypeData)data).mLitteral != null)? ((EnumeratedPropertyTypeData)data).mLitteral:SmMultipleDependency.EMPTY;
            }

            @objid ("50ab860a-e8d6-465c-82bc-701155b94d56")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumeratedPropertyTypeData) data).mLitteral = new ArrayList<>(initialCapacity);
                return ((EnumeratedPropertyTypeData) data).mLitteral;
            }

            @objid ("a5560f09-ab0a-4f42-9a04-3de0c6e39cd8")
            @Override
            public SmDependency getSymetric() {
                return PropertyEnumerationLitteralData.Metadata.OwnerDep();
            }

        }

    }

}
