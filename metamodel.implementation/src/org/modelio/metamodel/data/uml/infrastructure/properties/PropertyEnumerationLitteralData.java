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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.properties.EnumeratedPropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyEnumerationLitteralImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
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

@objid ("007387fa-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyEnumerationLitteral.class, factory=PropertyEnumerationLitteralData.Metadata.ObjectFactory.class)
public class PropertyEnumerationLitteralData extends ModelElementData {
    @objid ("9517aafc-7ef6-4291-959f-8233959290d5")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=EnumeratedPropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("e89ad6b9-83dc-4eb5-aa98-1372fbda4d9e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038842-ec99-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("9a51a46c-3bdd-44ab-aefc-4d01bc61c803")
        private static SmClass smClass = null;

        @objid ("562280fc-f470-4974-8db0-3a631c9003aa")
        private static SmDependency OwnerDep = null;

        @objid ("3a4fa847-d8a1-403e-b251-c42e37a255fe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyEnumerationLitteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8bd91ef-4ab3-42f0-a34a-66afbb50a48f")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c33ae8af-94ba-4bd8-bfd5-adbf1be24e1d")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("fedffb21-8889-4b65-8c2c-30e723166e9e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0003ec74-ec99-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ba6ff0e8-bba4-4b8c-8542-3311d2f4831c")
            public ISmObjectData createData() {
                return new PropertyEnumerationLitteralData();
            }

            @objid ("4099805f-b471-4d4a-8208-85af0b3db180")
            public SmObjectImpl createImpl() {
                return new PropertyEnumerationLitteralImpl();
            }

        }

        @objid ("0004ca18-ec99-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("284f0a51-9538-421b-8a86-1551a022024d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyEnumerationLitteralData) data).mOwner;
            }

            @objid ("236e9e0c-b17b-449c-9659-d2c1567f3f49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyEnumerationLitteralData) data).mOwner = value;
            }

            @objid ("64388be4-0f9e-48c4-b66a-65bd4032ca5e")
            @Override
            public SmDependency getSymetric() {
                return EnumeratedPropertyTypeData.Metadata.LitteralDep();
            }

        }

    }

}
