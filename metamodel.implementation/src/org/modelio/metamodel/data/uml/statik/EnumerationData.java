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
    @objid ("c96150ed-9cda-48ce-97aa-d0cd8ab9cc77")
    @SmaMetaAssociation(metaName="Value", typeDataClass=EnumerationLiteralData.class, min=0, max=-1, smAssociationClass=Metadata.ValueSmDependency.class, component = true)
     List<SmObjectImpl> mValue = null;

    @objid ("6ee0dae0-ccef-11e1-a996-001ec947ccaf")
    public EnumerationData() {
        this.mIsElementary = Boolean.TRUE;
    }

    @objid ("6cff75d5-f149-479f-95b2-674d8fd23d0a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00933492-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ecdba9c6-df6a-445d-88ce-95678b73607a")
        private static SmClass smClass = null;

        @objid ("ecf31fe5-3831-4992-a01a-9f787a6370c0")
        private static SmDependency ValueDep = null;

        @objid ("29966279-6b81-47cd-a737-8f1f9376476f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EnumerationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("209a45ad-7dbf-4b9d-ab2f-2da13805bc76")
        public static SmDependency ValueDep() {
            if (ValueDep == null) {
            	ValueDep = classof().getDependencyDef("Value");
            }
            return ValueDep;
        }

        @objid ("22782ac0-cff8-45fc-ae2d-76c4609c25ac")
        public static SmDependency getValueDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueDep;
        }

        @objid ("d972b5c4-bc81-45e3-8e96-f1d5c62b766c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00937592-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("da6d2779-881f-464a-b79f-b073de70cdb1")
            public ISmObjectData createData() {
                return new EnumerationData();
            }

            @objid ("6678db42-8c04-48e7-a121-2a12c41a4527")
            public SmObjectImpl createImpl() {
                return new EnumerationImpl();
            }

        }

        @objid ("0093d9d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmDependency extends SmMultipleDependency {
            @objid ("1e102b19-eea6-4140-9230-103da93920da")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EnumerationData)data).mValue != null)? ((EnumerationData)data).mValue:SmMultipleDependency.EMPTY;
            }

            @objid ("bee86a11-83f9-4cbc-9dee-b7c518c41fcd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EnumerationData) data).mValue = new ArrayList<>(initialCapacity);
                return ((EnumerationData) data).mValue;
            }

            @objid ("7ed66eb1-e7ba-42c3-b0cd-e2312d3b3985")
            @Override
            public SmDependency getSymetric() {
                return EnumerationLiteralData.Metadata.ValuatedDep();
            }

        }

    }

}
