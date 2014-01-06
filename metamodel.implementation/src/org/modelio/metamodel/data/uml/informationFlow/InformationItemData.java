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
    @objid ("cb717018-7cf5-470d-8345-9acb0c15390c")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ClassifierData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("089b0b0b-66ef-4979-89bb-e05d27734c44")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001732f2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c7bfc02c-3153-4235-903a-47af5629ff87")
        private static SmClass smClass = null;

        @objid ("627bf716-bb85-4508-b1ac-4bf3820de711")
        private static SmDependency RepresentedDep = null;

        @objid ("e08e1aa5-b92b-48cf-884f-105d6cd2259e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("78f0b1ca-d870-4c3e-8506-fb6a2eb8171d")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("3aa2a1dd-ea0a-485e-8cfb-51d7ac2c83b2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6d64a398-f315-4e47-aa72-e9073ef33116")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("001774b0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1ecb29be-9f18-4478-bcb6-c8a3c087149d")
            public ISmObjectData createData() {
                return new InformationItemData();
            }

            @objid ("1246c3cd-1053-4cfb-9b46-e4278327d537")
            public SmObjectImpl createImpl() {
                return new InformationItemImpl();
            }

        }

        @objid ("0017d59a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("e8ac76dc-e918-4b0e-b80e-378e1b25702e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationItemData)data).mRepresented != null)? ((InformationItemData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("a94a6cdc-4bbb-48e8-9a88-7c7af6698400")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationItemData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((InformationItemData) data).mRepresented;
            }

            @objid ("27a892c7-92b2-43dc-9c5c-34571eac6440")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RepresentationDep();
            }

        }

    }

}
