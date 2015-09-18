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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.impl.uml.informationFlow.InformationItemImpl;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
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

@objid ("006434d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InformationItem.class, factory=InformationItemData.Metadata.ObjectFactory.class)
public class InformationItemData extends ClassifierData {
    @objid ("4a354b4c-3826-497a-942c-9bbed61e5fb7")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ClassifierData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("2b6b2c6c-f45f-4c5c-b4f3-745b09fc5595")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001732f2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("972bb576-7b64-4744-baf8-114e98270b97")
        private static SmClass smClass = null;

        @objid ("55c6721f-a1a1-4d46-8a60-ef6ed95e80e3")
        private static SmDependency RepresentedDep = null;

        @objid ("96427d40-4bdb-46f4-b837-455015b8d7e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bfa91972-4f30-4ca0-bf89-efdb43872f85")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("aa6e585e-3425-428f-9426-533e164f61d0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e0bcae1f-cf03-4b88-94ca-73765332204a")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("001774b0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4293fc5b-9687-4df0-94e5-465a71d49a01")
            public ISmObjectData createData() {
                return new InformationItemData();
            }

            @objid ("f6a9c757-052e-4ec0-993f-4674b2a8bf56")
            public SmObjectImpl createImpl() {
                return new InformationItemImpl();
            }

        }

        @objid ("0017d59a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("b735f47b-c9b7-4016-aaac-541bab5e6cfa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationItemData)data).mRepresented != null)? ((InformationItemData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("d15b2bc2-f956-4c45-a42e-ae2c259ccc1b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationItemData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((InformationItemData) data).mRepresented;
            }

            @objid ("f14cb997-13b3-4234-ab9e-7ca786e56b6d")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RepresentationDep();
            }

        }

    }

}
