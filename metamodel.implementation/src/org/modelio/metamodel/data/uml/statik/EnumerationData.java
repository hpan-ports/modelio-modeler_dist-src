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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.EnumerationLiteralData;
import org.modelio.metamodel.impl.uml.statik.EnumerationImpl;
import org.modelio.metamodel.uml.statik.Enumeration;
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

@objid ("0009fc7c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Enumeration.class, factory=EnumerationData.Metadata.ObjectFactory.class)
public class EnumerationData extends GeneralClassData {
    @objid ("4716b753-f6fe-4f10-83d5-f3dfbb28c31f")
    @SmaMetaAssociation(metaName="Value", typeDataClass=EnumerationLiteralData.class, min=0, max=-1, smAssociationClass=Metadata.ValueSmDependency.class, component = true)
     List<SmObjectImpl> mValue = null;

    @objid ("6ee0dae0-ccef-11e1-a996-001ec947ccaf")
    public EnumerationData() {
        this.mIsElementary = Boolean.TRUE;
    }

    @objid ("5953063a-8465-4a76-82be-8b3cc6f54d20")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00933492-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d816919b-0b0f-42c6-a591-942418793e29")
        private static SmClass smClass = null;

        @objid ("a02f10c8-2ffb-4bab-8e57-5a9812149e63")
        private static SmDependency ValueDep = null;

        @objid ("12852ead-07bd-4739-a869-3a74b7972db2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bebdc7ba-2ffd-43d9-a59c-ab8334d333c7")
        public static SmDependency ValueDep() {
            if (ValueDep == null) {
            	ValueDep = classof().getDependencyDef("Value");
            }
            return ValueDep;
        }

        @objid ("22c946fc-11a6-403f-b9ae-162974a4aea8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a23c4557-1abb-417f-bb91-d1a72ca263b5")
        public static SmDependency getValueDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueDep;
        }

        @objid ("00937592-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d858b031-5d76-43dd-a43b-a5406dc6f041")
            public ISmObjectData createData() {
                return new EnumerationData();
            }

            @objid ("9d0fb49a-a046-4142-a619-95b32c49fe07")
            public SmObjectImpl createImpl() {
                return new EnumerationImpl();
            }

        }

        @objid ("0093d9d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmDependency extends SmMultipleDependency {
            @objid ("a4c55613-926a-4c71-b037-c38abc67a1af")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumerationData)data).mValue != null)? ((EnumerationData)data).mValue:SmMultipleDependency.EMPTY;
            }

            @objid ("4de4c134-63d0-4be5-9541-a89c722ebb8a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumerationData) data).mValue = new ArrayList<>(initialCapacity);
                return ((EnumerationData) data).mValue;
            }

            @objid ("c692a2b9-ec91-4ef0-b77f-e16309ec6ddc")
            @Override
            public SmDependency getSymetric() {
                return EnumerationLiteralData.Metadata.ValuatedDep();
            }

        }

    }

}
