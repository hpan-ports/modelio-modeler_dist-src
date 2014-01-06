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
    @objid ("4d995ab9-4048-455f-bd03-a332dbe40ead")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=EnumeratedPropertyTypeData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("50aa2e70-efbd-40ce-8f6b-0bc26426b4f2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00038842-ec99-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("25df5d7f-9baa-4995-9823-f58784e12822")
        private static SmClass smClass = null;

        @objid ("82acb162-3485-4f40-a203-58fb4cd1c671")
        private static SmDependency OwnerDep = null;

        @objid ("3ffc53a3-a3cb-4810-96a4-dfc2bc53e7e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyEnumerationLitteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f25970a-459b-4e10-909d-a09f38aefb8e")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("fee976fc-ba25-4b3c-9d19-470e3e13fd8a")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("97e3ffe9-c096-47bd-8003-81e1aec4e561")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0003ec74-ec99-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("38d30b3b-b7b2-4b73-b6c3-ee33912b083e")
            public ISmObjectData createData() {
                return new PropertyEnumerationLitteralData();
            }

            @objid ("f98a8c9d-816d-4124-9b61-3780a1a6c380")
            public SmObjectImpl createImpl() {
                return new PropertyEnumerationLitteralImpl();
            }

        }

        @objid ("0004ca18-ec99-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("5282352a-2f0e-42a5-9051-70074a6b00bc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyEnumerationLitteralData) data).mOwner;
            }

            @objid ("57e4639d-13ee-4d01-a0c2-4050ca56d2dd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyEnumerationLitteralData) data).mOwner = value;
            }

            @objid ("d4b4ed68-8f0c-4e96-839b-bb5888312cf8")
            @Override
            public SmDependency getSymetric() {
                return EnumeratedPropertyTypeData.Metadata.LitteralDep();
            }

        }

    }

}
