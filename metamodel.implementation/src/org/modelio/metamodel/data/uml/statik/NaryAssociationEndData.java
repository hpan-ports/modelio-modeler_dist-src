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
    @objid ("8f85cfc9-0168-46d9-a143-b085227d1c83")
    @SmaMetaAssociation(metaName="NaryAssociation", typeDataClass=NaryAssociationData.class, min=1, max=1, smAssociationClass=Metadata.NaryAssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mNaryAssociation;

    @objid ("e4129fca-cba4-4fe0-b1d8-dbcb760ee599")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("557dbb68-99ec-4ee3-b133-3e9e0a4e71ff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000d229e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5094b429-e2cb-461e-bc0b-9abf433a96e9")
        private static SmClass smClass = null;

        @objid ("7792600c-491f-47ba-99fd-13a25f25ffe7")
        private static SmDependency NaryAssociationDep = null;

        @objid ("3dbe5deb-1e1c-485d-a3ed-ec336a0966f7")
        private static SmDependency OwnerDep = null;

        @objid ("1679a01c-2dbd-4a11-88f9-e9165e198e5b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2212c33a-8acf-429c-993e-94d55442d42a")
        public static SmDependency NaryAssociationDep() {
            if (NaryAssociationDep == null) {
            	NaryAssociationDep = classof().getDependencyDef("NaryAssociation");
            }
            return NaryAssociationDep;
        }

        @objid ("50c1b0a1-9872-45d9-837e-6e2bfc6df509")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("a2df090a-ee4d-4fc3-af68-73bedeb483f3")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e434975c-b2a2-49df-b0b5-bc44da33c5c4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5b5deecf-b491-4056-acf6-936dae73a871")
        public static SmDependency getNaryAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationDep;
        }

        @objid ("000d78ca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("48ff9fd1-6d4a-4992-bd8e-860fd0f20266")
            public ISmObjectData createData() {
                return new NaryAssociationEndData();
            }

            @objid ("02825bcc-7d41-4539-8399-0d22054c0ec0")
            public SmObjectImpl createImpl() {
                return new NaryAssociationEndImpl();
            }

        }

        @objid ("000df32c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("9b014ca0-db14-4c76-a4a9-e4ba2a7de0dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mOwner;
            }

            @objid ("6f7221a5-ac08-4a7a-a90b-484bffc35f2d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mOwner = value;
            }

            @objid ("bcfa47dd-dd57-4ec3-bd4c-d03146e75eee")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedNaryEndDep();
            }

        }

        @objid ("000e7004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationSmDependency extends SmSingleDependency {
            @objid ("8d011c8e-cb25-4ba3-86e6-8b0cbca5ae83")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationEndData) data).mNaryAssociation;
            }

            @objid ("257fdc2e-67d9-413a-8116-9a9729a76c11")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationEndData) data).mNaryAssociation = value;
            }

            @objid ("c545ba83-7c70-4e05-a30b-01299d240306")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.NaryEndDep();
            }

        }

    }

}
