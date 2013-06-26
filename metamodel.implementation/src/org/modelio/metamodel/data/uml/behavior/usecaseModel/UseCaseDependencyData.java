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
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseDependencyImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
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

@objid ("00595600-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=UseCaseDependency.class, factory=UseCaseDependencyData.Metadata.ObjectFactory.class)
public class UseCaseDependencyData extends ModelElementData {
    @objid ("bab25f0b-e232-4212-a06b-ba32c77d3e8f")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("62ab9cda-f5f4-4944-95d3-71691f51e853")
    @SmaMetaAssociation(metaName="ExtensionLocation", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionLocationSmDependency.class, partof = true)
     List<SmObjectImpl> mExtensionLocation = null;

    @objid ("90e7eac9-f2e4-4ac7-afa1-d2b076d4a0a7")
    @SmaMetaAssociation(metaName="Target", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("81af1ee1-4c7d-4e1a-847b-3498073ea1af")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a55d0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a0708071-df42-4458-ae55-3a37ef9e8e25")
        private static SmClass smClass = null;

        @objid ("bf92793e-73eb-4b74-b7a0-91b9cecc5488")
        private static SmDependency OriginDep = null;

        @objid ("27eb6988-9afb-4318-bc8b-e809627ecda6")
        private static SmDependency ExtensionLocationDep = null;

        @objid ("750f77f8-dc32-4301-b282-181ec65bb156")
        private static SmDependency TargetDep = null;

        @objid ("e80f9665-bc42-4022-8835-c363698e6e44")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fbb861cf-e056-4d54-85c1-1c35a7acc135")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("2fb7682e-3c30-4d4b-b468-975680728877")
        public static SmDependency ExtensionLocationDep() {
            if (ExtensionLocationDep == null) {
            	ExtensionLocationDep = classof().getDependencyDef("ExtensionLocation");
            }
            return ExtensionLocationDep;
        }

        @objid ("6d45ed7d-b236-44ab-a7f7-2c3ad410854f")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("9fe88ebd-8789-4451-a4eb-676ccd6d59b9")
        public static SmDependency getExtensionLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionLocationDep;
        }

        @objid ("f25a763c-b936-4650-b84d-c84997f01bbc")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("c44abc36-291c-481b-a900-60c3225ec115")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("37db5165-0223-4374-95a9-85857f137a3d")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("007a97fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2bffd90d-f470-440a-a97c-1137bb80ee59")
            public ISmObjectData createData() {
                return new UseCaseDependencyData();
            }

            @objid ("1697aeb0-faa1-4247-a068-c0bfc621c3a1")
            public SmObjectImpl createImpl() {
                return new UseCaseDependencyImpl();
            }

        }

        @objid ("007afbca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ExtensionLocationSmDependency extends SmMultipleDependency {
            @objid ("c6c342ad-83ff-4e08-99ee-d218d9574124")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseDependencyData)data).mExtensionLocation != null)? ((UseCaseDependencyData)data).mExtensionLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("c7966557-7851-43e0-b634-24b42c894f12")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseDependencyData) data).mExtensionLocation = new ArrayList<>(initialCapacity);
                return ((UseCaseDependencyData) data).mExtensionLocation;
            }

            @objid ("f60c61a8-5fcc-4212-bf9d-4fe033be304e")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.ExtendedDep();
            }

        }

        @objid ("007b5ff2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("41b9d8ec-6a10-4100-9c09-6717361f5814")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mOrigin;
            }

            @objid ("aa2a8309-59c0-48bb-b466-200481608183")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mOrigin = value;
            }

            @objid ("461d1fe8-d06d-4fec-a570-1456a8da5a1f")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UsedDep();
            }

        }

        @objid ("007bd5ea-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("59cbc326-7a67-4dcb-a3d2-53eb0638f102")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mTarget;
            }

            @objid ("79f47e51-4536-45b4-b093-892ad751e178")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mTarget = value;
            }

            @objid ("7e233b2a-0a52-4f50-9783-f737e653fe6b")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UserDep();
            }

        }

    }

}
