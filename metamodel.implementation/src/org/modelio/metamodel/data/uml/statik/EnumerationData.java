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
    @objid ("164a6190-654e-4753-933c-630fc52ef29e")
    @SmaMetaAssociation(metaName="Value", typeDataClass=EnumerationLiteralData.class, min=0, max=-1, smAssociationClass=Metadata.ValueSmDependency.class, component = true)
     List<SmObjectImpl> mValue = null;

    @objid ("6ee0dae0-ccef-11e1-a996-001ec947ccaf")
    public EnumerationData() {
        this.mIsElementary = Boolean.TRUE;
    }

    @objid ("599d8171-690d-4247-899f-23a2b75c2f0f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00933492-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6206aa16-90f6-416f-900a-e44bc4e3ec41")
        private static SmClass smClass = null;

        @objid ("3ef0bcb8-0928-46b6-96e8-21d56ec5c848")
        private static SmDependency ValueDep = null;

        @objid ("2daaa8ed-14f5-4d63-a4f9-1cd4d9cb4f56")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4b3dea78-1064-475f-b510-d38e1cfba40a")
        public static SmDependency ValueDep() {
            if (ValueDep == null) {
            	ValueDep = classof().getDependencyDef("Value");
            }
            return ValueDep;
        }

        @objid ("ce4adbae-9f6f-4987-ac87-425433c1879f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0a2d22f8-99fc-4819-b0cd-1256f2b87bb5")
        public static SmDependency getValueDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueDep;
        }

        @objid ("00937592-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("91760eb4-1787-41c5-b7bc-1be90a30a2fc")
            public ISmObjectData createData() {
                return new EnumerationData();
            }

            @objid ("a1f48db3-24eb-4034-9605-7a7b4b49b197")
            public SmObjectImpl createImpl() {
                return new EnumerationImpl();
            }

        }

        @objid ("0093d9d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmDependency extends SmMultipleDependency {
            @objid ("05765ee9-551f-4aaa-bd30-8a0870c4d0e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumerationData)data).mValue != null)? ((EnumerationData)data).mValue:SmMultipleDependency.EMPTY;
            }

            @objid ("6f5e9790-4d3f-4225-82b6-74e2314143d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumerationData) data).mValue = new ArrayList<>(initialCapacity);
                return ((EnumerationData) data).mValue;
            }

            @objid ("da295c2d-9ab3-4b94-bb1e-203efa440696")
            @Override
            public SmDependency getSymetric() {
                return EnumerationLiteralData.Metadata.ValuatedDep();
            }

        }

    }

}
