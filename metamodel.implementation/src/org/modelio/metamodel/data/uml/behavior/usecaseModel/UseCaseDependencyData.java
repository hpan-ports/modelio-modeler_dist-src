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
    @objid ("93a98afb-5a24-4d12-affe-1e5b2832c08e")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("41637eea-bd82-4fd1-81bd-b1279d438c26")
    @SmaMetaAssociation(metaName="ExtensionLocation", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionLocationSmDependency.class, partof = true)
     List<SmObjectImpl> mExtensionLocation = null;

    @objid ("ec4f4fb9-ab9d-4f45-b538-348056203388")
    @SmaMetaAssociation(metaName="Target", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("e6ea4212-e5bf-43b2-80cc-8dccafb38f4b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a55d0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4f0f5edb-2ad5-46b4-babd-ac9228d3b2e1")
        private static SmClass smClass = null;

        @objid ("eee76a57-9772-46c0-9434-23b7d835f53f")
        private static SmDependency OriginDep = null;

        @objid ("a8867204-72dd-4b67-8afd-7d1e00d8f4b7")
        private static SmDependency ExtensionLocationDep = null;

        @objid ("01e56d05-6660-4f6b-b5c6-573d29ceaaf4")
        private static SmDependency TargetDep = null;

        @objid ("5d43311f-81d3-408b-a10d-45be6466e439")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("62ccc79b-2087-4f1a-ba91-f17df2114965")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("a9e5b3e2-9fbc-4823-a24f-54654b54db83")
        public static SmDependency ExtensionLocationDep() {
            if (ExtensionLocationDep == null) {
            	ExtensionLocationDep = classof().getDependencyDef("ExtensionLocation");
            }
            return ExtensionLocationDep;
        }

        @objid ("0e81e49b-fefb-4833-aadc-cbb48ebc5b5f")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("4f30e50d-4841-470f-9c6e-b76551058b01")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("761db747-b006-458d-bbc7-e1d5c8e411ca")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("0df2a9d5-5bd1-4a00-bdc4-231e15b1ab95")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("248d2785-ed0a-46fd-ad74-96eda952c448")
        public static SmDependency getExtensionLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionLocationDep;
        }

        @objid ("007a97fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5f1900ec-8a88-41e5-963b-b2afce06a522")
            public ISmObjectData createData() {
                return new UseCaseDependencyData();
            }

            @objid ("6bbae600-c996-4a32-8bd9-ef3b3ce32507")
            public SmObjectImpl createImpl() {
                return new UseCaseDependencyImpl();
            }

        }

        @objid ("007afbca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ExtensionLocationSmDependency extends SmMultipleDependency {
            @objid ("43781e91-9b6e-4c76-9fc9-61f9ae3cb3e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseDependencyData)data).mExtensionLocation != null)? ((UseCaseDependencyData)data).mExtensionLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("83e7d219-c61c-4d3f-991a-b26d5ade7040")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseDependencyData) data).mExtensionLocation = new ArrayList<>(initialCapacity);
                return ((UseCaseDependencyData) data).mExtensionLocation;
            }

            @objid ("393b05f1-a117-4599-8870-dde98c6c762b")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.ExtendedDep();
            }

        }

        @objid ("007b5ff2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("2d6e4807-bc6d-42a3-be1e-85113f708f59")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mOrigin;
            }

            @objid ("cee8c89e-1e76-4b10-a150-d2ae5d657d4f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mOrigin = value;
            }

            @objid ("8de09062-1852-438d-96fc-9e93e424f7fb")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UsedDep();
            }

        }

        @objid ("007bd5ea-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("64d17fc0-15a6-41c8-b017-0b5c05041589")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mTarget;
            }

            @objid ("98fb7794-8538-4823-ac7f-87b4d23fefc1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mTarget = value;
            }

            @objid ("7a5671c7-2770-4c63-a1c6-b3c68eb178cb")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UserDep();
            }

        }

    }

}
