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
    @objid ("57892cb8-3694-45af-a41e-832559798a95")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.OriginSmDependency.class)
     SmObjectImpl mOrigin;

    @objid ("98955f9c-e27b-482b-940d-36da0ce61a7b")
    @SmaMetaAssociation(metaName="ExtensionLocation", typeDataClass=ExtensionPointData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionLocationSmDependency.class, partof = true)
     List<SmObjectImpl> mExtensionLocation = null;

    @objid ("ced30df4-c3b4-47cc-ba10-bd3493c2b1f8")
    @SmaMetaAssociation(metaName="Target", typeDataClass=UseCaseData.class, min=1, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("01361adc-2c12-41c3-987e-1428b64ee2be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a55d0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("61b2dfa2-c527-4611-a4b2-45f811eec8d6")
        private static SmClass smClass = null;

        @objid ("f94d3e49-6ca2-468e-b1f6-456690490671")
        private static SmDependency OriginDep = null;

        @objid ("e098da3d-bae7-4258-8718-01034954ea06")
        private static SmDependency ExtensionLocationDep = null;

        @objid ("f609dd2d-0ab3-491d-8fa9-346ad4470445")
        private static SmDependency TargetDep = null;

        @objid ("5c924c91-3822-4b00-81b0-6d37b7fb9d5f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(UseCaseDependencyData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a2de0786-83ba-4325-b088-f2732131837f")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("9841e62d-de18-4cfd-a1a7-44c171495deb")
        public static SmDependency ExtensionLocationDep() {
            if (ExtensionLocationDep == null) {
            	ExtensionLocationDep = classof().getDependencyDef("ExtensionLocation");
            }
            return ExtensionLocationDep;
        }

        @objid ("05843f06-293a-4609-b96e-b2ca99372871")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("ff613330-033f-48bb-aee3-43e58d43b6e7")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("4e0385e6-ae90-42ae-9c8f-6ced9fa51534")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("95f75fda-e6df-45ba-9005-91fe71aa0cdd")
        public static SmDependency getExtensionLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionLocationDep;
        }

        @objid ("c9b56cc6-5627-4adf-b87d-3d46fc78eb80")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("007a97fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3467c566-adc2-4113-9f44-254306a0c0c6")
            public ISmObjectData createData() {
                return new UseCaseDependencyData();
            }

            @objid ("322e0786-c4f6-4b1a-ac2d-b8a3595a90a2")
            public SmObjectImpl createImpl() {
                return new UseCaseDependencyImpl();
            }

        }

        @objid ("007afbca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ExtensionLocationSmDependency extends SmMultipleDependency {
            @objid ("25b5934a-8fbd-4d51-9c3c-7fed1d647a1b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((UseCaseDependencyData)data).mExtensionLocation != null)? ((UseCaseDependencyData)data).mExtensionLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("a684c518-fa2f-4323-b57a-47e6be21b9f3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((UseCaseDependencyData) data).mExtensionLocation = new ArrayList<>(initialCapacity);
                return ((UseCaseDependencyData) data).mExtensionLocation;
            }

            @objid ("36917f94-23b9-4005-baba-012b66a115db")
            @Override
            public SmDependency getSymetric() {
                return ExtensionPointData.Metadata.ExtendedDep();
            }

        }

        @objid ("007b5ff2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("c560da52-f0ae-47a4-b872-29dca50e326c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mOrigin;
            }

            @objid ("6da4dcf1-2cec-428d-a03c-c1ef6e3c57bd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mOrigin = value;
            }

            @objid ("c049635b-f048-4b37-b334-8c53aa7e6afb")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UsedDep();
            }

        }

        @objid ("007bd5ea-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("259bd514-7079-4e93-b95d-0d427727d143")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((UseCaseDependencyData) data).mTarget;
            }

            @objid ("bfe608e0-1fde-4b71-a2fc-fb7175bea872")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((UseCaseDependencyData) data).mTarget = value;
            }

            @objid ("71e68622-615f-4dd3-927f-009a39f818f9")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.UserDep();
            }

        }

    }

}
