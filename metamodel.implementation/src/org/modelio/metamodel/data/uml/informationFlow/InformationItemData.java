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
    @objid ("f4160531-34eb-4be7-a6e6-53eca313b1ce")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ClassifierData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("b5462635-01af-472e-9cc4-541aa77606f3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001732f2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("268b1cf3-218d-44a5-a3be-d057e54dc724")
        private static SmClass smClass = null;

        @objid ("efb07412-542b-4868-ac51-a4da3cbbeef0")
        private static SmDependency RepresentedDep = null;

        @objid ("1d497381-a663-44a4-afaf-b05988e0f958")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9e5be3a2-acf0-4093-8391-7f642e6d48c1")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("999d4d32-9e5c-4dce-aa48-2f7d2befc0dd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e8b39c14-e1f7-4927-a3f5-f2dcec20de27")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("001774b0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3ee9c64a-8668-4b1a-92b1-30e1ee3a00ad")
            public ISmObjectData createData() {
                return new InformationItemData();
            }

            @objid ("a573f050-e8a9-4339-87f5-2a332012a836")
            public SmObjectImpl createImpl() {
                return new InformationItemImpl();
            }

        }

        @objid ("0017d59a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("b84c39dc-78b5-4cd9-af8e-10b0f0a1be3c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationItemData)data).mRepresented != null)? ((InformationItemData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("c926bc1a-d7d1-4fc7-a579-e1715f82b242")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationItemData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((InformationItemData) data).mRepresented;
            }

            @objid ("f0ec2ce9-162a-4abd-98a2-1d221b0efaa2")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.RepresentationDep();
            }

        }

    }

}
