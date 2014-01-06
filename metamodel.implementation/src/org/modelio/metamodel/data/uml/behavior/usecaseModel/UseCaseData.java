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
    @objid ("8b515d8c-d3a4-4359-80b8-ad74fa37e4de")
    @SmaMetaAssociation(metaName="Used", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UsedSmDependency.class, component = true)
     List<SmObjectImpl> mUsed = null;

    @objid ("14b3328f-bf8a-46c7-b5fa-ed6a1f76a8d5")
    @SmaMetaAssociation(metaName="OwnedExtension", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedExtensionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedExtension = null;

    @objid ("44221dce-5f03-4544-9fbd-5dd39aa2e60b")
    @SmaMetaAssociation(metaName="User", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UserSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mUser = null;

    @objid ("760fe224-fe82-4e3b-9404-4decb2844fdf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f01fa-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b590c6a8-9228-4c5c-b878-d974f4d751e6")
        private static SmClass smClass = null;

        @objid ("20e6803e-7175-44a7-bf4f-45b87dbb67f7")
        private static SmDependency UsedDep = null;

        @objid ("a0877e61-85d5-4afd-8a61-8f2c91cbe007")
        private static SmDependency OwnedExtensionDep = null;

        @objid ("e5042a09-2265-4695-a4fb-1edeb74262ce")
        private static SmDependency UserDep = null;

        @objid ("f5c96270-0f18-4a4b-82e1-31f209dffc17")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("00a770a0-70a3-4308-864a-8e1fa8b34f3a")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("4fa932b9-8bf7-45f7-8c40-4f81f54b2742")
        public static SmDependency OwnedExtensionDep() {
            if (OwnedExtensionDep == null) {
            	OwnedExtensionDep = classof().getDependencyDef("OwnedExtension");
            }
            return OwnedExtensionDep;
        }

        @objid ("a336cdd5-65b7-42e0-85cb-079fd04cf1de")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("e62da169-d7e8-48b6-9b1f-85cb44a4a71a")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("4486a30c-2faa-47b1-8def-3015bec5bdf7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("90498995-93f2-4ce0-a786-f0bc0ebc2f1c")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("03e35679-079a-4a78-b117-65e1d3b3a0eb")
        public static SmDependency getOwnedExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedExtensionDep;
        }

        @objid ("004f42aa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b07d016-0845-43bb-bcf2-0e1e778ed400")
            public ISmObjectData createData() {
                return new UseCaseData();
            }

            @objid ("d0881e46-556b-48d2-8be2-a707e058fadc")
            public SmObjectImpl createImpl() {
                return new UseCaseImpl();
            }

        }

        @objid ("004fa678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedExtensionSmDependency extends SmMultipleDependency {
            @objid ("9b5c9748-b7ea-40e2-9a3c-e6640ba9b14e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mOwnedExtension != null)? ((UseCaseData)data).mOwnedExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("113e3877-e820-4d8e-8b97-6fec7bb4ef0a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mOwnedExtension = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mOwnedExtension;
            }

            @objid ("86b167af-cb88-4b50-b971-1ba56c6657d2")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.OwnerDep();
            }

        }

        @objid ("00500938-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmMultipleDependency {
            @objid ("b921c702-548e-492f-94b1-e0bfef35d558")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUsed != null)? ((UseCaseData)data).mUsed:SmMultipleDependency.EMPTY;
            }

            @objid ("bbbd7c2d-2c70-4aee-b78c-7d30b738b1b3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUsed = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUsed;
            }

            @objid ("876eafa8-4f7d-4417-90fd-7b46d1e3858c")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.OriginDep();
            }

        }

        @objid ("00506c0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmMultipleDependency {
            @objid ("72fb755c-ed36-45e7-890f-efa61c1c23b9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUser != null)? ((UseCaseData)data).mUser:SmMultipleDependency.EMPTY;
            }

            @objid ("b537bf9b-bafc-4f38-96b2-3a1b237cd4bb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUser = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUser;
            }

            @objid ("e2ec8a62-80ea-4e54-b20c-305a5191c10f")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.TargetDep();
            }

        }

    }

}
