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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
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

@objid ("004ab5e6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OccurrenceSpecification.class, factory=OccurrenceSpecificationData.Metadata.ObjectFactory.class)
public abstract class OccurrenceSpecificationData extends InteractionFragmentData {
    @objid ("681874e1-36cf-49d9-b6dd-076c6a6000c8")
    @SmaMetaAssociation(metaName="ToAfter", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToAfterSmDependency.class, component = true)
     List<SmObjectImpl> mToAfter = null;

    @objid ("46e39530-92b8-451a-aa7b-c82d78f4ee92")
    @SmaMetaAssociation(metaName="ToBefore", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToBeforeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mToBefore = null;

    @objid ("7e75c26e-0f8c-4bd5-b6a9-3da32784ea64")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004edf68-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("714e8d97-f8e9-47ea-a7b8-c4563989b21b")
        private static SmClass smClass = null;

        @objid ("6bba1ee8-f3fa-45ee-8c93-d32f815f32d2")
        private static SmDependency ToAfterDep = null;

        @objid ("59f62d47-cd65-4839-9fb6-9bdeb50cc78a")
        private static SmDependency ToBeforeDep = null;

        @objid ("23960a91-2027-4ad5-b60f-5d11f5d73a1a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OccurrenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7b5b1fa7-db88-4bbe-82f2-9e19db9f0c70")
        public static SmDependency ToAfterDep() {
            if (ToAfterDep == null) {
            	ToAfterDep = classof().getDependencyDef("ToAfter");
            }
            return ToAfterDep;
        }

        @objid ("71c22c5b-9ec4-47cd-abb7-ece1413274e9")
        public static SmDependency ToBeforeDep() {
            if (ToBeforeDep == null) {
            	ToBeforeDep = classof().getDependencyDef("ToBefore");
            }
            return ToBeforeDep;
        }

        @objid ("a0ef49e2-a482-49f9-b502-326415ad5d4a")
        public static SmDependency getToAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToAfterDep;
        }

        @objid ("501f8f6f-b906-44dd-9297-6f46272b4139")
        public static SmDependency getToBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToBeforeDep;
        }

        @objid ("da2edbe7-4641-4360-8092-671a9a599590")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004f202c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5bf5b307-a588-4c87-b027-85fd09efdcfb")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("82b52f78-63db-4614-a49b-9e2bbd77e251")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004f82a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToBeforeSmDependency extends SmMultipleDependency {
            @objid ("a8e5d7dd-98cc-4be7-bdda-91a75b4d0458")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToBefore != null)? ((OccurrenceSpecificationData)data).mToBefore:SmMultipleDependency.EMPTY;
            }

            @objid ("2ee665ea-531d-4eb6-a563-5b575425787b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToBefore = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToBefore;
            }

            @objid ("4c4dbc41-aed2-4ea7-8f23-9f926e67f499")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.AfterDep();
            }

        }

        @objid ("004fe462-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToAfterSmDependency extends SmMultipleDependency {
            @objid ("2681eedd-87e4-4719-8aff-ed7118297844")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToAfter != null)? ((OccurrenceSpecificationData)data).mToAfter:SmMultipleDependency.EMPTY;
            }

            @objid ("8066d117-1113-4345-aae9-f066c955945d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToAfter = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToAfter;
            }

            @objid ("4cc1390a-d643-492b-a470-69e0976575c3")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.BeforeDep();
            }

        }

    }

}
