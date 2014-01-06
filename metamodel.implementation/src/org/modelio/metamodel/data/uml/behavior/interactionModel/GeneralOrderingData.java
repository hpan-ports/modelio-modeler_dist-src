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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.OccurrenceSpecificationData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GeneralOrderingImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
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

@objid ("0046463c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=GeneralOrdering.class, factory=GeneralOrderingData.Metadata.ObjectFactory.class)
public class GeneralOrderingData extends ElementData {
    @objid ("f901217d-84fa-43c3-8956-a13d303be9d6")
    @SmaMetaAssociation(metaName="Before", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.BeforeSmDependency.class)
     SmObjectImpl mBefore;

    @objid ("aa9c71f5-79e8-4798-8a27-a9faf1907b93")
    @SmaMetaAssociation(metaName="After", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.AfterSmDependency.class, partof = true)
     SmObjectImpl mAfter;

    @objid ("81f555d3-b6e8-4406-8371-7aee514961c4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0015b59e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("39f3cd9c-0387-46ea-80ff-c69eb8dcf747")
        private static SmClass smClass = null;

        @objid ("e83c443a-f770-415a-b612-f9dccfe58b29")
        private static SmDependency BeforeDep = null;

        @objid ("fd75f8f0-79a8-403d-93f4-6d2cbd96ca78")
        private static SmDependency AfterDep = null;

        @objid ("01851119-74c9-47f2-b4b6-fa7b0825f522")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralOrderingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("182bc111-ca62-41d0-9ee8-814532cb5001")
        public static SmDependency BeforeDep() {
            if (BeforeDep == null) {
            	BeforeDep = classof().getDependencyDef("Before");
            }
            return BeforeDep;
        }

        @objid ("dae7543b-91a7-4275-9dcb-c9a692686d7c")
        public static SmDependency AfterDep() {
            if (AfterDep == null) {
            	AfterDep = classof().getDependencyDef("After");
            }
            return AfterDep;
        }

        @objid ("ff2cfc40-a0da-4fb3-a728-7b750a546203")
        public static SmDependency getBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BeforeDep;
        }

        @objid ("9234040d-e04e-4c7f-b879-b3904123207a")
        public static SmDependency getAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AfterDep;
        }

        @objid ("48f72e5b-b28c-44dd-97fa-1effd7905577")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0015f6d0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1c9bb413-4a6f-444f-a79d-b4239a62b09d")
            public ISmObjectData createData() {
                return new GeneralOrderingData();
            }

            @objid ("8a04b3c8-842c-438a-a24e-6c2e0553e56a")
            public SmObjectImpl createImpl() {
                return new GeneralOrderingImpl();
            }

        }

        @objid ("00165bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AfterSmDependency extends SmSingleDependency {
            @objid ("4d71c2c8-0261-486b-a488-128ac0a6ef95")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mAfter;
            }

            @objid ("ced0b14b-5baf-444a-b055-dfa293752a3b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mAfter = value;
            }

            @objid ("64d62413-72a2-4421-aa66-a03faa9c3c9a")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToBeforeDep();
            }

        }

        @objid ("0016d078-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BeforeSmDependency extends SmSingleDependency {
            @objid ("b021bafb-ec9b-412c-9a2d-a38bc6f3b7f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mBefore;
            }

            @objid ("e168c90f-ca95-439a-88e8-10cc0723e44a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mBefore = value;
            }

            @objid ("79e9bfcd-f9f3-4f8d-b933-e3b6e2e614e6")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToAfterDep();
            }

        }

    }

}
