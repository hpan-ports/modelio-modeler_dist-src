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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
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

@objid ("0058d388-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCase.class, factory=UseCaseData.Metadata.ObjectFactory.class, cmsnode=true)
public class UseCaseData extends GeneralClassData {
    @objid ("3dd772e5-470b-4a05-bd75-bc26120356f0")
    @SmaMetaAssociation(metaName="Used", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UsedSmDependency.class, component = true)
     List<SmObjectImpl> mUsed = null;

    @objid ("b09fc71f-dc46-4d50-936a-608d97ef08ed")
    @SmaMetaAssociation(metaName="OwnedExtension", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedExtensionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedExtension = null;

    @objid ("364fb318-fda5-42a4-9dc0-e4aa841851a8")
    @SmaMetaAssociation(metaName="User", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UserSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mUser = null;

    @objid ("1e928e0e-e708-4459-b539-9a4e4d521c87")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f01fa-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("081b9138-49ca-4f01-8934-f67e25859468")
        private static SmClass smClass = null;

        @objid ("51d9e0ac-a1fc-40b9-af09-bbb22535314e")
        private static SmDependency UsedDep = null;

        @objid ("f2931cf1-b652-4678-9fd8-396cca2c3ff6")
        private static SmDependency OwnedExtensionDep = null;

        @objid ("618c2f5b-31e2-4a62-8a4d-0410964c0077")
        private static SmDependency UserDep = null;

        @objid ("6fb3cc63-66cc-4f32-b3a0-8818da71e5e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f01d55ab-9e70-4dd5-98f0-95213ff2c751")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("df7afab0-fdb5-464c-af57-db8e19a0b5b3")
        public static SmDependency OwnedExtensionDep() {
            if (OwnedExtensionDep == null) {
            	OwnedExtensionDep = classof().getDependencyDef("OwnedExtension");
            }
            return OwnedExtensionDep;
        }

        @objid ("ff6cfdf2-752e-442d-94cc-91cb199ceee6")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("b24a988e-0e0f-4c82-96a6-6d62d714f251")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("009a71a9-92b4-4c39-a2b5-eb40fc63595e")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("16f921da-3f85-4fd1-b1d8-fa813cfd25ee")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ff9cdacb-917e-4d82-aaa7-b85653d8318b")
        public static SmDependency getOwnedExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedExtensionDep;
        }

        @objid ("004f42aa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("edcc3c4b-8f85-4bec-bed9-36ef79ae7f4e")
            public ISmObjectData createData() {
                return new UseCaseData();
            }

            @objid ("9c754666-abff-43a4-b35d-dbdd70a508eb")
            public SmObjectImpl createImpl() {
                return new UseCaseImpl();
            }

        }

        @objid ("004fa678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedExtensionSmDependency extends SmMultipleDependency {
            @objid ("31b0745b-431a-4984-a8ea-77cea4e5bdb6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mOwnedExtension != null)? ((UseCaseData)data).mOwnedExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("68f33faa-186f-41de-a96b-6fc0def975b5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mOwnedExtension = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mOwnedExtension;
            }

            @objid ("05e916d7-465a-42a3-be65-2ee9f8a9a55f")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.OwnerDep();
            }

        }

        @objid ("00500938-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmMultipleDependency {
            @objid ("298879be-7c7d-42da-9e60-d6d23af1dffa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUsed != null)? ((UseCaseData)data).mUsed:SmMultipleDependency.EMPTY;
            }

            @objid ("96044197-0350-4c9b-81ce-93e75cf4bd79")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUsed = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUsed;
            }

            @objid ("c78fc293-a67f-40e4-9f7e-c80dd12d912b")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.OriginDep();
            }

        }

        @objid ("00506c0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmMultipleDependency {
            @objid ("01dc476f-3325-48e5-b897-e81d7bb109c0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUser != null)? ((UseCaseData)data).mUser:SmMultipleDependency.EMPTY;
            }

            @objid ("c7f98ebc-9d68-4e3b-9373-7a76c39c0e38")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUser = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUser;
            }

            @objid ("97370eef-678b-4722-9051-11d053ba00b6")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.TargetDep();
            }

        }

    }

}
