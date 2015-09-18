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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.EnumerationData;
import org.modelio.metamodel.impl.uml.statik.EnumerationLiteralImpl;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
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

@objid ("000abb26-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=EnumerationLiteral.class, factory=EnumerationLiteralData.Metadata.ObjectFactory.class)
public class EnumerationLiteralData extends ModelElementData {
    @objid ("4c81d211-6375-409f-b659-26e4a95949dc")
    @SmaMetaAssociation(metaName="Valuated", typeDataClass=EnumerationData.class, min=1, max=1, smAssociationClass=Metadata.ValuatedSmDependency.class)
     SmObjectImpl mValuated;

    @objid ("1b4145d6-23aa-4095-bd55-7789b1e91142")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0070ace2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("46cba804-849d-4935-add8-7c1e8d949425")
        private static SmClass smClass = null;

        @objid ("9424ff19-8b80-4152-b5ec-179f7797545f")
        private static SmDependency ValuatedDep = null;

        @objid ("bfd2e01d-0d28-409b-b94a-17f6d14688a7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationLiteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1dc02c23-1090-45db-a5a4-5f652fca2bec")
        public static SmDependency ValuatedDep() {
            if (ValuatedDep == null) {
            	ValuatedDep = classof().getDependencyDef("Valuated");
            }
            return ValuatedDep;
        }

        @objid ("4b61ad35-0d52-4835-aade-a532c1942274")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bf9e6895-983c-4f92-b63a-1ed763bf9dbb")
        public static SmDependency getValuatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuatedDep;
        }

        @objid ("0070ee14-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b5bb5d57-d896-4f30-b4aa-8cf42fe16216")
            public ISmObjectData createData() {
                return new EnumerationLiteralData();
            }

            @objid ("043300f2-ba21-4f81-890a-4f723f52c72a")
            public SmObjectImpl createImpl() {
                return new EnumerationLiteralImpl();
            }

        }

        @objid ("00715066-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValuatedSmDependency extends SmSingleDependency {
            @objid ("ede36bfe-e306-4873-84f4-422a1e4698c3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EnumerationLiteralData) data).mValuated;
            }

            @objid ("b7f9e1c1-062a-4a81-8cdc-08f698811975")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EnumerationLiteralData) data).mValuated = value;
            }

            @objid ("6c8c9133-85ec-4dcd-97ea-69f49eb2f713")
            @Override
            public SmDependency getSymetric() {
                return EnumerationData.Metadata.ValueDep();
            }

        }

    }

}
