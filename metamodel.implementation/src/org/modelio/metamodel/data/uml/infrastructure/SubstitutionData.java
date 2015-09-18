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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.impl.uml.infrastructure.SubstitutionImpl;
import org.modelio.metamodel.uml.infrastructure.Substitution;
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

@objid ("008e4b26-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Substitution.class, factory=SubstitutionData.Metadata.ObjectFactory.class)
public class SubstitutionData extends ModelElementData {
    @objid ("9f7f7e02-3816-4c7c-af4d-ef950940bd75")
    @SmaMetaAssociation(metaName="Contract", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.ContractSmDependency.class, partof = true)
     SmObjectImpl mContract;

    @objid ("667748de-31e3-4ec5-b2fb-e766f00ce418")
    @SmaMetaAssociation(metaName="SubstitutingClassifier", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SubstitutingClassifierSmDependency.class)
     SmObjectImpl mSubstitutingClassifier;

    @objid ("20c2e2bc-9421-4d8c-9554-11687e95a7a7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004975f0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("647a79cc-7d2c-4d7e-ac4e-724616dc7f00")
        private static SmClass smClass = null;

        @objid ("ac703d5e-f386-4c76-b847-720396cafd73")
        private static SmDependency ContractDep = null;

        @objid ("590d0c0f-1a9e-4d3b-819a-34fcf65aecc0")
        private static SmDependency SubstitutingClassifierDep = null;

        @objid ("5af182d8-9d91-4430-aa35-759450519877")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e123cd90-7e32-4da5-815a-b51f1f16dfc3")
        public static SmDependency ContractDep() {
            if (ContractDep == null) {
            	ContractDep = classof().getDependencyDef("Contract");
            }
            return ContractDep;
        }

        @objid ("17811e82-685f-4174-a42a-2a95941b9727")
        public static SmDependency SubstitutingClassifierDep() {
            if (SubstitutingClassifierDep == null) {
            	SubstitutingClassifierDep = classof().getDependencyDef("SubstitutingClassifier");
            }
            return SubstitutingClassifierDep;
        }

        @objid ("3b5ff5aa-23b2-48ca-8735-6c71d8783650")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("79f67073-2903-4446-8615-5a06f79a0bb9")
        public static SmDependency getSubstitutingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingClassifierDep;
        }

        @objid ("f0c578b0-a9dd-4b93-86a7-84bc4e264007")
        public static SmDependency getContractDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContractDep;
        }

        @objid ("0049b5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d21d81d5-766e-4549-aa93-ac08fbf05dd6")
            public ISmObjectData createData() {
                return new SubstitutionData();
            }

            @objid ("70a64a0d-a4c8-46f7-9945-828dfaa7a375")
            public SmObjectImpl createImpl() {
                return new SubstitutionImpl();
            }

        }

        @objid ("004a16f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingClassifierSmDependency extends SmSingleDependency {
            @objid ("80c77866-14c7-426a-9d3a-6aecf6e234ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mSubstitutingClassifier;
            }

            @objid ("ff7f5ebd-c13f-4da0-a24e-aaa9738103e9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mSubstitutingClassifier = value;
            }

            @objid ("9ab828db-2809-49c3-b6f5-fc9a175146c4")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstituedDep();
            }

        }

        @objid ("004a8fda-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContractSmDependency extends SmSingleDependency {
            @objid ("cd7ab67b-aa1a-49ac-a4d7-22e080d691dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mContract;
            }

            @objid ("e543bea5-f512-4e1c-bfba-f4ea54042f20")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mContract = value;
            }

            @objid ("81c316d8-0052-4573-b876-13659d3d8e6d")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstitutingSubstitutionDep();
            }

        }

    }

}
