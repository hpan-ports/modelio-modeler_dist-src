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
    @objid ("e4d8b180-7404-4259-ab78-fb46814e0e47")
    @SmaMetaAssociation(metaName="Litteral", typeDataClass=PropertyEnumerationLitteralData.class, min=0, max=-1, smAssociationClass=Metadata.LitteralSmDependency.class, component = true)
     List<SmObjectImpl> mLitteral = null;

    @objid ("e868253a-7da3-4322-97d0-d4ed6056aacf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00591c3a-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("6f8c3a35-317e-474f-a85e-b43fd70816c0")
        private static SmClass smClass = null;

        @objid ("7e0f5de7-e533-4f99-a602-94529507d7b3")
        private static SmDependency LitteralDep = null;

        @objid ("79f2391b-e43b-43a0-8d20-232d27636e80")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumeratedPropertyTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b66fed64-9640-49fa-9f68-79030fdfcb3d")
        public static SmDependency LitteralDep() {
            if (LitteralDep == null) {
            	LitteralDep = classof().getDependencyDef("Litteral");
            }
            return LitteralDep;
        }

        @objid ("9a20f87a-7c88-40b0-8784-296b64067103")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("93a0ac9e-cfef-4359-b95d-4646f92d3e9d")
        public static SmDependency getLitteralDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LitteralDep;
        }

        @objid ("00597d1a-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("257de96c-669f-4304-a58d-dcd5ad96f5e9")
            public ISmObjectData createData() {
                return new EnumeratedPropertyTypeData();
            }

            @objid ("ad9bf552-dece-45e5-818c-3b042668d3a2")
            public SmObjectImpl createImpl() {
                return new EnumeratedPropertyTypeImpl();
            }

        }

        @objid ("005a5816-ec98-1098-b22e-001ec947cd2a")
        public static class LitteralSmDependency extends SmMultipleDependency {
            @objid ("ef59028d-e881-439e-bcd2-9e548b303acb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumeratedPropertyTypeData)data).mLitteral != null)? ((EnumeratedPropertyTypeData)data).mLitteral:SmMultipleDependency.EMPTY;
            }

            @objid ("acb77b6c-38e6-47d5-b386-58c947135e2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumeratedPropertyTypeData) data).mLitteral = new ArrayList<>(initialCapacity);
                return ((EnumeratedPropertyTypeData) data).mLitteral;
            }

            @objid ("bde4dc9c-a8a5-489b-9e90-1bf96dfb464e")
            @Override
            public SmDependency getSymetric() {
                return PropertyEnumerationLitteralData.Metadata.OwnerDep();
            }

        }

    }

}
