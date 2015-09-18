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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationEndImpl;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
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

@objid ("00211b5a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryAssociationEnd.class, factory=NaryAssociationEndData.Metadata.ObjectFactory.class)
public class NaryAssociationEndData extends StructuralFeatureData {
    @objid ("9eaf8405-61fe-4d97-8e5c-42b0ab373c2a")
    @SmaMetaAssociation(metaName="NaryAssociation", typeDataClass=NaryAssociationData.class, min=1, max=1, smAssociationClass=Metadata.NaryAssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryAssociation;

    @objid ("6605aeac-cc5c-4b14-a6d6-8a13ad56f2dd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9716ef7d-ea9c-42c4-9e2e-dc0c11dd1228")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d229e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5bdb1edc-7994-40c8-ab67-952d277a7063")
        private static SmClass smClass = null;

        @objid ("21397d1d-585d-470d-81ea-55a29341f5e1")
        private static SmDependency NaryAssociationDep = null;

        @objid ("956a1414-617e-47d5-a11e-cbbdd8946d69")
        private static SmDependency OwnerDep = null;

        @objid ("e82906d4-135d-4b93-82ed-0dfaee54f74a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fd3a766d-7eb5-44ae-85c1-300c3b6f4bd3")
        public static SmDependency NaryAssociationDep() {
            if (NaryAssociationDep == null) {
            	NaryAssociationDep = classof().getDependencyDef("NaryAssociation");
            }
            return NaryAssociationDep;
        }

        @objid ("6b4ef60d-02d7-4ca2-9db4-0127f51f70ee")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("acaf0d66-0e6e-4abf-9bbe-849da6197b67")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("2929a32e-af46-4010-80d9-f469b5edc6f5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("20966105-8b9b-47dc-833c-743f84e9e1fc")
        public static SmDependency getNaryAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationDep;
        }

        @objid ("000d78ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("468b791a-62cb-4271-8b66-c8239e25af65")
            public ISmObjectData createData() {
                return new NaryAssociationEndData();
            }

            @objid ("beccf5fe-4688-4ff7-b3c7-f2efc1cc0efd")
            public SmObjectImpl createImpl() {
                return new NaryAssociationEndImpl();
            }

        }

        @objid ("000df32c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("51553aa3-8ad9-41e7-a3f1-fd992716eb6a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mOwner;
            }

            @objid ("8b915ee5-5e04-4465-b699-d715c11de41f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mOwner = value;
            }

            @objid ("cbffc07d-63f5-48cf-ad91-d294e8036cea")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("000e7004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationSmDependency extends SmSingleDependency {
            @objid ("20b642c7-4e78-481b-9edd-d603ebea9a40")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mNaryAssociation;
            }

            @objid ("09bb9038-8a87-4150-80b8-4dbcb5f2a4b2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mNaryAssociation = value;
            }

            @objid ("8a09fd53-1be8-488c-b8d5-c3582f284452")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.NaryEndDep();
            }

        }

    }

}
