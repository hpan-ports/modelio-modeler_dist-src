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
    @objid ("476e7495-e30f-4587-81f3-fe3856bf0cb1")
    @SmaMetaAssociation(metaName="Valuated", typeDataClass=EnumerationData.class, min=1, max=1, smAssociationClass=Metadata.ValuatedSmDependency.class)
     SmObjectImpl mValuated;

    @objid ("89748f21-9494-4dbf-b403-7d506e5b52c2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0070ace2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("394b3fe2-8a6a-4282-b791-ab5a61d896b9")
        private static SmClass smClass = null;

        @objid ("96cf92a7-54e6-4b53-b8c8-d15a0e57b90e")
        private static SmDependency ValuatedDep = null;

        @objid ("fcfc7c83-716e-415c-8ec4-2abcdde00ff0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationLiteralData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1a61c418-af1a-4fee-be5e-d08216cb2aba")
        public static SmDependency ValuatedDep() {
            if (ValuatedDep == null) {
            	ValuatedDep = classof().getDependencyDef("Valuated");
            }
            return ValuatedDep;
        }

        @objid ("8d0deebb-c0db-4c3e-ab72-66c0c6ed694d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("880f5d6a-be9f-432f-bc5a-0582d1227992")
        public static SmDependency getValuatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValuatedDep;
        }

        @objid ("0070ee14-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aaaed299-b28a-4c04-b601-8b4680c09bf8")
            public ISmObjectData createData() {
                return new EnumerationLiteralData();
            }

            @objid ("7dc96c2b-427a-4107-854a-afdd1da16b7f")
            public SmObjectImpl createImpl() {
                return new EnumerationLiteralImpl();
            }

        }

        @objid ("00715066-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValuatedSmDependency extends SmSingleDependency {
            @objid ("10ff711c-971b-403f-83e3-a79d596a35e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EnumerationLiteralData) data).mValuated;
            }

            @objid ("34f86e55-79d9-455f-bbc6-00d496eecbd9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EnumerationLiteralData) data).mValuated = value;
            }

            @objid ("846b6e44-4338-4522-9c68-e920f32655e2")
            @Override
            public SmDependency getSymetric() {
                return EnumerationData.Metadata.ValueDep();
            }

        }

    }

}
