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
    @objid ("d15c2a88-ae4c-460c-8ed3-24a6f7def407")
    @SmaMetaAssociation(metaName="ToAfter", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToAfterSmDependency.class, component = true)
     List<SmObjectImpl> mToAfter = null;

    @objid ("9b3efffa-92fe-48d6-9179-bbc957893b6b")
    @SmaMetaAssociation(metaName="ToBefore", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToBeforeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mToBefore = null;

    @objid ("3c9a18ec-a0a7-48da-a88c-4226bdefd5e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004edf68-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("75419aa4-e21b-4b29-a953-939a8e2534dd")
        private static SmClass smClass = null;

        @objid ("f4def769-e2e1-4403-aece-a0fd878a68e9")
        private static SmDependency ToAfterDep = null;

        @objid ("5dba2837-8797-48e5-8ff4-1203ce3c6a2a")
        private static SmDependency ToBeforeDep = null;

        @objid ("7c98bc4c-9a87-4981-b38e-eb870c34c01a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OccurrenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("639fd356-d29f-4a20-91d3-f1db2203d974")
        public static SmDependency ToAfterDep() {
            if (ToAfterDep == null) {
            	ToAfterDep = classof().getDependencyDef("ToAfter");
            }
            return ToAfterDep;
        }

        @objid ("82494f4c-b4ba-4a46-a871-ac41ee0ae323")
        public static SmDependency ToBeforeDep() {
            if (ToBeforeDep == null) {
            	ToBeforeDep = classof().getDependencyDef("ToBefore");
            }
            return ToBeforeDep;
        }

        @objid ("92867937-e44f-4bd9-84e2-2c5fa8a426ca")
        public static SmDependency getToAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToAfterDep;
        }

        @objid ("92d2fb06-03a1-477a-88a8-0f163841f6c1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f237980b-1101-4dd4-83dd-4034f4173462")
        public static SmDependency getToBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToBeforeDep;
        }

        @objid ("004f202c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("765ab5c3-f1dd-4967-9df0-113b0817240b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3d46661d-cacb-49ef-aaa5-22c10c3f6b02")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004f82a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToBeforeSmDependency extends SmMultipleDependency {
            @objid ("dc5a0fe2-6454-4577-821e-21a4d768082c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToBefore != null)? ((OccurrenceSpecificationData)data).mToBefore:SmMultipleDependency.EMPTY;
            }

            @objid ("cf53686d-914a-451d-b683-2a6e0eab106f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToBefore = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToBefore;
            }

            @objid ("b459c69a-a445-4a43-bea1-796d21d7a7dc")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.AfterDep();
            }

        }

        @objid ("004fe462-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToAfterSmDependency extends SmMultipleDependency {
            @objid ("875b4e30-7424-4df6-99f6-10f85728931d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToAfter != null)? ((OccurrenceSpecificationData)data).mToAfter:SmMultipleDependency.EMPTY;
            }

            @objid ("4c9b8938-eac7-4cbf-ab62-378cf373aa5c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToAfter = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToAfter;
            }

            @objid ("6b2105a0-1a54-440e-9f78-f2a40dec5672")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.BeforeDep();
            }

        }

    }

}
