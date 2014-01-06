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
    @objid ("31e405ee-ea5f-42a3-aef0-c697deacd271")
    @SmaMetaAssociation(metaName="NaryAssociation", typeDataClass=NaryAssociationData.class, min=1, max=1, smAssociationClass=Metadata.NaryAssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryAssociation;

    @objid ("f6d4e665-c991-4f46-80bd-b9d90a8a0bf0")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("642c3ee6-cf45-46d2-a8d8-3d10cd387d91")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d229e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c94f2afd-ab5b-4322-85db-e36c7a1609c2")
        private static SmClass smClass = null;

        @objid ("101c0ad0-20b3-4bff-9c56-c95e7aa28220")
        private static SmDependency NaryAssociationDep = null;

        @objid ("33ab9e00-1d64-4364-87ab-6612b4463b49")
        private static SmDependency OwnerDep = null;

        @objid ("be7e8333-8494-49fb-b96c-67efb6bbefd2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8224212b-3c28-450b-80ec-544044f4312f")
        public static SmDependency NaryAssociationDep() {
            if (NaryAssociationDep == null) {
            	NaryAssociationDep = classof().getDependencyDef("NaryAssociation");
            }
            return NaryAssociationDep;
        }

        @objid ("5b43f1ed-2d62-4b8a-849e-6839e6e89983")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("89d71169-fc5f-472e-9f87-d70c07a3f361")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("3b4b0fd5-d46a-4362-956c-08bda4705e2b")
        public static SmDependency getNaryAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationDep;
        }

        @objid ("c12ae192-a1fa-4ece-9f3d-b297d751dc54")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000d78ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("974648c8-61bb-4d62-8c48-4dd72c46873b")
            public ISmObjectData createData() {
                return new NaryAssociationEndData();
            }

            @objid ("edd7f534-16ea-4964-be6b-e2343a5b560c")
            public SmObjectImpl createImpl() {
                return new NaryAssociationEndImpl();
            }

        }

        @objid ("000df32c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e305e6d9-27eb-4b0f-87f5-d370c237136f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mOwner;
            }

            @objid ("55980742-7ca8-430b-852c-b3bb2b22cab3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mOwner = value;
            }

            @objid ("7a4bf824-87d2-499c-861b-f99dc0c0f7ca")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("000e7004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationSmDependency extends SmSingleDependency {
            @objid ("6cbd35dd-cfcd-4f55-8c4e-a594a6738288")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mNaryAssociation;
            }

            @objid ("852fd396-5e8f-4ed0-b0b8-738840f9f527")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mNaryAssociation = value;
            }

            @objid ("0a74d131-cfb0-4140-8406-f2038fb073e8")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.NaryEndDep();
            }

        }

    }

}
