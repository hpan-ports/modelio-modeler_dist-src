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
    @objid ("c2fa5af4-8cce-43ce-9f77-0b18cb36ae5f")
    @SmaMetaAssociation(metaName="Contract", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.ContractSmDependency.class, partof = true)
     SmObjectImpl mContract;

    @objid ("53a27401-a5ae-4699-b0bd-89113eb059f7")
    @SmaMetaAssociation(metaName="SubstitutingClassifier", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SubstitutingClassifierSmDependency.class)
     SmObjectImpl mSubstitutingClassifier;

    @objid ("7a9bf1b1-dd13-4a64-82f8-1e213ddd3abe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004975f0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("32b8d3bf-407a-44f9-8bd1-cee541cecf39")
        private static SmClass smClass = null;

        @objid ("c6b2f0e3-ee96-4afd-9852-0f4031738078")
        private static SmDependency ContractDep = null;

        @objid ("fa064059-acbe-4c0a-ab24-d0789e18f09d")
        private static SmDependency SubstitutingClassifierDep = null;

        @objid ("fae161bc-0f25-4b6d-9da0-8c7c9c9f115f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SubstitutionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f6f7aafe-875c-4ee4-943b-c04e1b3c72ec")
        public static SmDependency ContractDep() {
            if (ContractDep == null) {
            	ContractDep = classof().getDependencyDef("Contract");
            }
            return ContractDep;
        }

        @objid ("02127c25-7550-4a24-914a-b43d5c12c6fd")
        public static SmDependency SubstitutingClassifierDep() {
            if (SubstitutingClassifierDep == null) {
            	SubstitutingClassifierDep = classof().getDependencyDef("SubstitutingClassifier");
            }
            return SubstitutingClassifierDep;
        }

        @objid ("cde79371-44be-46de-bd53-7983ffb82eb7")
        public static SmDependency getSubstitutingClassifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubstitutingClassifierDep;
        }

        @objid ("0910b08c-6708-4600-921d-7552df7b6c60")
        public static SmDependency getContractDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContractDep;
        }

        @objid ("b60d2555-ade4-49e7-9523-784be4e6074a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0049b5c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("739ffd0f-1396-4a1e-bf6d-21bef98c7dfe")
            public ISmObjectData createData() {
                return new SubstitutionData();
            }

            @objid ("8dd8eadf-5007-4f29-9279-fedc45637901")
            public SmObjectImpl createImpl() {
                return new SubstitutionImpl();
            }

        }

        @objid ("004a16f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubstitutingClassifierSmDependency extends SmSingleDependency {
            @objid ("947e2114-61e6-478e-828f-ce51058b7466")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mSubstitutingClassifier;
            }

            @objid ("61649610-e5ef-4211-aa84-75c52e1cf555")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mSubstitutingClassifier = value;
            }

            @objid ("ab49cd56-61d7-41c2-8ca7-1d102a734c9b")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstituedDep();
            }

        }

        @objid ("004a8fda-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContractSmDependency extends SmSingleDependency {
            @objid ("98c6a99d-1544-4219-ae04-b4bedcb67f22")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SubstitutionData) data).mContract;
            }

            @objid ("62114bfc-7761-499e-9e12-86c1d6564108")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SubstitutionData) data).mContract = value;
            }

            @objid ("8045435f-eb08-4359-a63e-5864649b9327")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.SubstitutingSubstitutionDep();
            }

        }

    }

}
