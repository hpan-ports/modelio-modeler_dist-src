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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileImpl;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("008ce3b2-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Profile.class, factory=ProfileData.Metadata.ObjectFactory.class, cmsnode=true)
public class ProfileData extends PackageData {
    @objid ("03ca4fe9-4005-47d7-b558-9163f6bc0b3d")
    @SmaMetaAttribute(metaName="JCode", type=String.class, smAttributeClass=Metadata.JCodeSmAttribute.class)
     Object mJCode = "";

    @objid ("dea960d9-27a6-4404-8beb-4e1de844805f")
    @SmaMetaAssociation(metaName="DefinedStereotype", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedStereotypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedStereotype = null;

    @objid ("903fc8f9-04e8-4f02-abce-2534ad462d98")
    @SmaMetaAssociation(metaName="OwnerModule", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerModuleSmDependency.class)
     SmObjectImpl mOwnerModule;

    @objid ("c89cafce-8fd9-41b1-a92f-ffc93999cae8")
    @SmaMetaAssociation(metaName="OwnedReference", typeDataClass=MetaclassReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedReferenceSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedReference = null;

    @objid ("3fb82a3e-2cb3-4c02-a8a5-2f9eeb78a071")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073c670-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c20f9db3-107c-4493-ad40-d9305f5318b4")
        private static SmClass smClass = null;

        @objid ("62edbc3e-03e4-4e01-bf26-41cd2447d901")
        private static SmAttribute JCodeAtt = null;

        @objid ("25dd5789-1e21-4b8c-8340-21d969c828ec")
        private static SmDependency DefinedStereotypeDep = null;

        @objid ("ec48fca5-93de-4500-8753-ca6df1f74953")
        private static SmDependency OwnerModuleDep = null;

        @objid ("16aebe93-eee4-4fb2-8651-a208044f1774")
        private static SmDependency OwnedReferenceDep = null;

        @objid ("2b0a6354-b8b0-4918-b4cd-79557b3a031e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProfileData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cbf75073-18f6-4c86-9138-b316c403a85f")
        public static SmAttribute JCodeAtt() {
            if (JCodeAtt == null) {
            	JCodeAtt = classof().getAttributeDef("JCode");
            }
            return JCodeAtt;
        }

        @objid ("19175c7e-a71e-4e76-b097-4aeb4489db07")
        public static SmDependency DefinedStereotypeDep() {
            if (DefinedStereotypeDep == null) {
            	DefinedStereotypeDep = classof().getDependencyDef("DefinedStereotype");
            }
            return DefinedStereotypeDep;
        }

        @objid ("2075b397-1029-433d-84f8-4d20c9c219d7")
        public static SmDependency OwnerModuleDep() {
            if (OwnerModuleDep == null) {
            	OwnerModuleDep = classof().getDependencyDef("OwnerModule");
            }
            return OwnerModuleDep;
        }

        @objid ("960e45e8-c369-4494-b1d3-e68584373094")
        public static SmDependency OwnedReferenceDep() {
            if (OwnedReferenceDep == null) {
            	OwnedReferenceDep = classof().getDependencyDef("OwnedReference");
            }
            return OwnedReferenceDep;
        }

        @objid ("c3a0a007-eba1-4dc0-a9bb-63cd066d87d1")
        public static SmDependency getOwnedReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedReferenceDep;
        }

        @objid ("435df1bd-b106-4edf-a185-ec040ee76e15")
        public static SmDependency getDefinedStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedStereotypeDep;
        }

        @objid ("14b67a15-5c31-4324-a51b-41d497818ecb")
        public static SmAttribute getJCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JCodeAtt;
        }

        @objid ("aa8f4850-4a5b-4ce9-9a85-5d3d476736d6")
        public static SmDependency getOwnerModuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerModuleDep;
        }

        @objid ("62ca0ebd-6806-4ea5-98d9-5eb6aac0a699")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007407ac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b918d696-08a1-4c1a-ae62-f9c276e99595")
            public ISmObjectData createData() {
                return new ProfileData();
            }

            @objid ("e0dbf2b2-ead5-4dec-9c56-5a9e292aa70c")
            public SmObjectImpl createImpl() {
                return new ProfileImpl();
            }

        }

        @objid ("00746896-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JCodeSmAttribute extends SmAttribute {
            @objid ("d5e37bab-c158-4e59-af75-83ac61222fb6")
            public Object getValue(ISmObjectData data) {
                return ((ProfileData) data).mJCode;
            }

            @objid ("61f31003-641f-4092-ba99-5ea2b3e3cf8a")
            public void setValue(ISmObjectData data, Object value) {
                ((ProfileData) data).mJCode = value;
            }

        }

        @objid ("0074cb38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerModuleSmDependency extends SmSingleDependency {
            @objid ("c3a4c235-b87c-4d65-a70f-f66a5d0cd79c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProfileData) data).mOwnerModule;
            }

            @objid ("57eefc44-e279-436c-82a0-e0ee4e8b005c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProfileData) data).mOwnerModule = value;
            }

            @objid ("e87f2ed5-def2-4d59-bdac-29388812f5ed")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.OwnedProfileDep();
            }

        }

        @objid ("00753f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedStereotypeSmDependency extends SmMultipleDependency {
            @objid ("8e55a495-02ba-4d00-b3ea-05056344eabe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mDefinedStereotype != null)? ((ProfileData)data).mDefinedStereotype:SmMultipleDependency.EMPTY;
            }

            @objid ("01d5c2a8-a557-4041-adf7-e92d8d4c4919")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mDefinedStereotype = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mDefinedStereotype;
            }

            @objid ("a48b1fbc-d1d9-4976-9fa8-b5a0fa1864a9")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.OwnerDep();
            }

        }

        @objid ("0075a2e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnedReferenceSmDependency extends SmMultipleDependency {
            @objid ("b8cb40d3-6c28-4ac0-9540-2b97a40b53c3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mOwnedReference != null)? ((ProfileData)data).mOwnedReference:SmMultipleDependency.EMPTY;
            }

            @objid ("9a4cd992-3926-4082-bce6-1ef0b1101cfd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mOwnedReference = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mOwnedReference;
            }

            @objid ("afa888a0-7feb-4e11-a364-8d4c3b9bf35e")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.OwnerProfileDep();
            }

        }

    }

}
