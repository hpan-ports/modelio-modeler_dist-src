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
    @objid ("9c07c2c4-2cdf-471f-966d-6fb3eda585e9")
    @SmaMetaAssociation(metaName="Used", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UsedSmDependency.class, component = true)
     List<SmObjectImpl> mUsed = null;

    @objid ("123a037c-b951-4b36-8e84-d1349ad2d952")
    @SmaMetaAssociation(metaName="OwnedExtension", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedExtensionSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedExtension = null;

    @objid ("769821dd-e611-45f4-b29d-d09965ac3480")
    @SmaMetaAssociation(metaName="User", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.UserSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mUser = null;

    @objid ("50da7c48-d784-41b4-b6e2-1d5bcebee176")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f01fa-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5b4c0d1a-b475-466e-9596-8f444f288335")
        private static SmClass smClass = null;

        @objid ("35d850ab-1e03-49f3-8379-fc98772a5801")
        private static SmDependency UsedDep = null;

        @objid ("48b6c707-ef01-4036-8ba3-4e0988353ae7")
        private static SmDependency OwnedExtensionDep = null;

        @objid ("d7c457df-e4cd-4c08-8c7a-abbffac22e7e")
        private static SmDependency UserDep = null;

        @objid ("d88bfa88-1478-4af4-844e-98d1fe06b732")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d0c9314d-4265-4ef2-b34d-c7dc26de637e")
        public static SmDependency UsedDep() {
            if (UsedDep == null) {
            	UsedDep = classof().getDependencyDef("Used");
            }
            return UsedDep;
        }

        @objid ("80c21cc7-fdca-4f6d-8bcb-81fefb793384")
        public static SmDependency OwnedExtensionDep() {
            if (OwnedExtensionDep == null) {
            	OwnedExtensionDep = classof().getDependencyDef("OwnedExtension");
            }
            return OwnedExtensionDep;
        }

        @objid ("182dbde4-2340-4478-8516-876507b8073d")
        public static SmDependency UserDep() {
            if (UserDep == null) {
            	UserDep = classof().getDependencyDef("User");
            }
            return UserDep;
        }

        @objid ("a6ab06ea-ddaf-4d13-be38-fef5ffb7d4b1")
        public static SmDependency getUsedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedDep;
        }

        @objid ("45bd6315-9efb-494e-84e7-93f84d02dbd7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("de940e31-5b27-4691-908a-44c07118012b")
        public static SmDependency getOwnedExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedExtensionDep;
        }

        @objid ("47103d0a-a983-4667-a30b-cd13ae6ae84c")
        public static SmDependency getUserDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserDep;
        }

        @objid ("004f42aa-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c067ee4a-d42c-41e0-b841-64828a34d829")
            public ISmObjectData createData() {
                return new UseCaseData();
            }

            @objid ("137a8e28-81d6-415b-920e-910c424d9c81")
            public SmObjectImpl createImpl() {
                return new UseCaseImpl();
            }

        }

        @objid ("004fa678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedExtensionSmDependency extends SmMultipleDependency {
            @objid ("0ffb1126-b390-4f44-8e55-022cc8f224be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mOwnedExtension != null)? ((UseCaseData)data).mOwnedExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("c25bc418-2d3a-475e-94d7-20862e8b78b7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mOwnedExtension = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mOwnedExtension;
            }

            @objid ("cd9625ab-e742-4cd9-9b99-7582bad75c7f")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.OwnerDep();
            }

        }

        @objid ("00500938-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UsedSmDependency extends SmMultipleDependency {
            @objid ("9d2d9821-e822-456c-92d3-9e270cba99b8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUsed != null)? ((UseCaseData)data).mUsed:SmMultipleDependency.EMPTY;
            }

            @objid ("18c182b1-35b7-4f6d-bb19-fd5314b3e5ea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUsed = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUsed;
            }

            @objid ("c26ebba1-163b-4bac-9561-543d7e65dd67")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.OriginDep();
            }

        }

        @objid ("00506c0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class UserSmDependency extends SmMultipleDependency {
            @objid ("6bc1cd75-dd23-4444-85d1-de72fb988cc3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseData)data).mUser != null)? ((UseCaseData)data).mUser:SmMultipleDependency.EMPTY;
            }

            @objid ("84834fca-e5c0-4141-9f53-22bfc4790638")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseData) data).mUser = new ArrayList<>(initialCapacity);
                return ((UseCaseData) data).mUser;
            }

            @objid ("be9e3e13-f55b-4859-bf36-6a5eb32dde0f")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.TargetDep();
            }

        }

    }

}
