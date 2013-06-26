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
    @objid ("a8745fdf-e590-4766-bf7d-ca0ee25ceb7b")
    @SmaMetaAssociation(metaName="Valuated", typeDataClass=EnumerationData.class, min=1, max=1, smAssociationClass=Metadata.ValuatedSmDependency.class)
     SmObjectImpl mValuated;

    @objid ("1bdbf20c-8f51-401f-84de-89d3f11c1a34")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0070ace2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9c449b72-c1cb-40c2-b122-ca0035f2903a")
        private static SmClass smClass = null;

        @objid ("9b5ad217-172e-4ab9-bb5e-eaa16f26cbed")
        private static SmDependency ValuatedDep = null;

        @objid ("3c2796e2-b6f4-4a29-972d-445ee7c11ea7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationLiteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7fb3788f-a548-4495-a73c-e4c4ccfc0642")
        public static SmDependency ValuatedDep() {
            if (ValuatedDep == null) {
            	ValuatedDep = classof().getDependencyDef("Valuated");
            }
            return ValuatedDep;
        }

        @objid ("4208cf16-fc88-4134-8ec4-6f6a6df8f5c6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bda356b8-7baa-4a36-a065-d0b2e88ae245")
        public static SmDependency getValuatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuatedDep;
        }

        @objid ("0070ee14-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b122a6a-b416-453a-9fa2-dc82776eef9e")
            public ISmObjectData createData() {
                return new EnumerationLiteralData();
            }

            @objid ("00fa7ce6-3b92-403e-a076-2923999f00c4")
            public SmObjectImpl createImpl() {
                return new EnumerationLiteralImpl();
            }

        }

        @objid ("00715066-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValuatedSmDependency extends SmSingleDependency {
            @objid ("3e029325-ae12-4394-aafb-fef8aa892e29")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EnumerationLiteralData) data).mValuated;
            }

            @objid ("54a6caf3-6188-4df6-bb6b-79dd9f5d6c99")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EnumerationLiteralData) data).mValuated = value;
            }

            @objid ("ec37695e-6df0-4d39-a76d-2cc2d7aa1c29")
            @Override
            public SmDependency getSymetric() {
                return EnumerationData.Metadata.ValueDep();
            }

        }

    }

}
