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
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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

@objid ("004518ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExecutionSpecification.class, factory=ExecutionSpecificationData.Metadata.ObjectFactory.class)
public class ExecutionSpecificationData extends InteractionFragmentData {
    @objid ("ada4c5fd-10e3-47df-a46c-15505eda87c5")
    @SmaMetaAssociation(metaName="Finish", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.FinishSmDependency.class, partof = true)
     SmObjectImpl mFinish;

    @objid ("0a659309-261b-4384-bd6d-c3194f664fde")
    @SmaMetaAssociation(metaName="Start", typeDataClass=ExecutionOccurenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("4ea9912d-9418-4226-941d-9ca564e0c25e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0048687c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("32c826ea-76db-4dbb-85ec-9c24a18c247d")
        private static SmClass smClass = null;

        @objid ("36b9c261-2e1c-45ab-b811-819301ea1603")
        private static SmDependency FinishDep = null;

        @objid ("1b54a3bc-efa7-440b-9a91-451b905d97af")
        private static SmDependency StartDep = null;

        @objid ("1b61fb6e-e6f9-44d5-af0a-df05e62761b8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExecutionSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23f8f6b2-2703-46ef-a22e-36f7dcf6cb21")
        public static SmDependency FinishDep() {
            if (FinishDep == null) {
            	FinishDep = classof().getDependencyDef("Finish");
            }
            return FinishDep;
        }

        @objid ("a237e11c-30f4-4916-ae45-f666fdd296b0")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("e55dc51b-68f8-46ab-ade7-8a13c23782ce")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4a85c2a8-5240-4b7a-9047-dc8609daa44b")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("92469894-81ee-47f7-8f9f-2a973c1e6f12")
        public static SmDependency getFinishDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinishDep;
        }

        @objid ("0048ab02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5ee17278-b2e4-44f4-b919-3ab45fda5286")
            public ISmObjectData createData() {
                return new ExecutionSpecificationData();
            }

            @objid ("53c3324b-d89a-4b03-b2c5-e4381fd90d18")
            public SmObjectImpl createImpl() {
                return new ExecutionSpecificationImpl();
            }

        }

        @objid ("00490dae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("9fc8fdec-5889-42d4-835d-9fe639c3cedd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mStart;
            }

            @objid ("48ce44e4-447a-4879-a3aa-98eaeb06c9a8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mStart = value;
            }

            @objid ("4bd5f58c-6439-4671-afbc-a8269da72ac0")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.StartedDep();
            }

        }

        @objid ("004983ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FinishSmDependency extends SmSingleDependency {
            @objid ("1fa90a1b-1c2f-4536-866c-5856e76c7f92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExecutionSpecificationData) data).mFinish;
            }

            @objid ("fced1f94-be5b-4f71-b665-da81a03bcd4b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExecutionSpecificationData) data).mFinish = value;
            }

            @objid ("1782a245-2251-45c2-a5e6-5800276094d0")
            @Override
            public SmDependency getSymetric() {
                return ExecutionOccurenceSpecificationData.Metadata.FinishedDep();
            }

        }

    }

}
