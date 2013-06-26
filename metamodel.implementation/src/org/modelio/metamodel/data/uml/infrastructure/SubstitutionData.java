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
    @objid ("495d0c83-b414-4248-9101-bc56aeb58ad4")
    @SmaMetaAssociation(metaName="Contract", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.ContractSmDependency.class, partof = true)
     SmObjectImpl mContract;

    @objid ("46b8ff5e-d2fb-47fd-ae6e-2d01fbb2326d")
    @SmaMetaAssociation(metaName="SubstitutingClassifier", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SubstitutingClassifierSmDependency.class)
     SmObjectImpl mSubstitutingClassifier;

    @objid ("a2c3673a-50eb-40fd-9f81-72ecac7fa82c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004975f0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("98dba97a-a6df-468c-a30b-ffe5239780bf")
        private static SmClass smClass = null;

        @objid ("bb54cc6f-ec5b-468f-88cd-e1dc0364511d")
        private static SmDependency ContractDep = null;

        @objid ("c6e0e9a4-f9f9-47ee-a3c1-17f3aa9367a3")
        private static SmDependency SubstitutingClassifierDep = null;

        @objid ("85757cb0-f398-420f-a97c-3bdda6a3ccf7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ed6c504-2cc5-4290-a418-cf91d29acfe2")
        public static SmDependency ContractDep() {
            if (ContractDep == null) {
            	ContractDep = classof().getDependencyDef("Contract");
            }
            return ContractDep;
        }

        @objid ("4a54992a-bce8-44a5-a88b-eab92558e778")
        public static SmDependency SubstitutingClassifierDep() {
            if (SubstitutingClassifierDep == null) {
            	SubstitutingClassifierDep = classof().getDependencyDef("SubstitutingClassifier");
            }
            return SubstitutingClassifierDep;
        }

        @objid ("0c31df41-fd97-48a3-be6b-c9c6d6cff9b9")
        public static SmDependency getSubstitutingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingClassifierDep;
        }

        @objid ("2fbec962-03c3-48b5-86b0-6cd8714a93eb")
        public static SmDependency getContractDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContractDep;
        }

        @objid ("500dca67-7110-41cd-ae41-0fb0e77b33b2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0049b5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1440889d-8674-4113-b335-6d12624a34ce")
            public ISmObjectData createData() {
                return new SubstitutionData();
            }

            @objid ("0035df04-27ea-45e8-be64-7c5af867792b")
            public SmObjectImpl createImpl() {
                return new SubstitutionImpl();
            }

        }

        @objid ("004a16f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingClassifierSmDependency extends SmSingleDependency {
            @objid ("2138b442-6fd3-41bd-91b0-2f5c7b05bf99")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mSubstitutingClassifier;
            }

            @objid ("6bc616be-b73f-4b40-a82f-98cb05bfe106")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mSubstitutingClassifier = value;
            }

            @objid ("45da92fa-3c4d-45e3-a6b7-7ec230bf74a0")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstituedDep();
            }

        }

        @objid ("004a8fda-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContractSmDependency extends SmSingleDependency {
            @objid ("266246ec-0de1-423b-89e7-166a77c1662d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mContract;
            }

            @objid ("2c663a8e-593a-4f73-b472-4baad0bbf093")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mContract = value;
            }

            @objid ("9a1862f8-219b-49cd-80ba-45363f4bbf1d")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstitutingSubstitutionDep();
            }

        }

    }

}
