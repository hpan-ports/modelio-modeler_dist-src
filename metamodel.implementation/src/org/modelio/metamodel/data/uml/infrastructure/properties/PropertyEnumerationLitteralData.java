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
    @objid ("eaac8649-ad67-4123-b5b7-38dca8d20210")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=EnumeratedPropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7338169c-5e44-47d1-9f96-40d2400b141a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038842-ec99-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("e16817fb-9fe2-4f3b-8aa1-267c7ba5609a")
        private static SmClass smClass = null;

        @objid ("0e0a1117-20b5-469e-a002-113ad1eaebd4")
        private static SmDependency OwnerDep = null;

        @objid ("badafe6c-cde3-4ef9-8af6-8b382e2c9b87")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyEnumerationLitteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ddfdbb76-c0dc-45c4-8d58-9ccbd22740ce")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("0edc6acf-290e-4220-b592-da6e2ec077cd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d4bcfbcb-5f6e-409b-807e-78052ed9ee69")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0003ec74-ec99-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6c7f6bf1-9e3c-499f-9290-04fcb51bd6d9")
            public ISmObjectData createData() {
                return new PropertyEnumerationLitteralData();
            }

            @objid ("0a9f3ce7-b885-49f9-912c-45cb54bf6cb8")
            public SmObjectImpl createImpl() {
                return new PropertyEnumerationLitteralImpl();
            }

        }

        @objid ("0004ca18-ec99-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c8f83792-b07c-4a2c-9a0e-582c8207cae4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyEnumerationLitteralData) data).mOwner;
            }

            @objid ("2287b7bc-70b3-4d53-9812-db45cb52534f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyEnumerationLitteralData) data).mOwner = value;
            }

            @objid ("93f9de57-cb74-480e-81c4-56947dfdc19e")
            @Override
            public SmDependency getSymetric() {
                return EnumeratedPropertyTypeData.Metadata.LitteralDep();
            }

        }

    }

}
