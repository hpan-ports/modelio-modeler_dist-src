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
    @objid ("bbfde183-7994-47a8-8a67-3faf84a6781a")
    @SmaMetaAttribute(metaName="JCode", type=String.class, smAttributeClass=Metadata.JCodeSmAttribute.class)
     Object mJCode = "";

    @objid ("f3f6d80e-3100-4812-ab45-9ab54cf61be8")
    @SmaMetaAssociation(metaName="DefinedStereotype", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedStereotypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedStereotype = null;

    @objid ("847ed458-2739-43f5-b378-27ca598b2924")
    @SmaMetaAssociation(metaName="OwnerModule", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerModuleSmDependency.class)
     SmObjectImpl mOwnerModule;

    @objid ("fd4cf8b7-7855-42d6-99e2-4c130b3b7d93")
    @SmaMetaAssociation(metaName="OwnedReference", typeDataClass=MetaclassReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedReferenceSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedReference = null;

    @objid ("5a597452-2123-4955-9727-fcd19a7b0973")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073c670-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("627ce911-68e7-4044-8139-c44b5b299306")
        private static SmClass smClass = null;

        @objid ("17292ee0-71e1-4051-973d-63a4533f8936")
        private static SmAttribute JCodeAtt = null;

        @objid ("2528c9d4-b4d5-4582-8eb6-944764702d64")
        private static SmDependency DefinedStereotypeDep = null;

        @objid ("c19157a1-bca8-43b3-bbb1-f4daa238c06a")
        private static SmDependency OwnerModuleDep = null;

        @objid ("b74aa902-03c2-4f8a-a3ac-25266b3e8948")
        private static SmDependency OwnedReferenceDep = null;

        @objid ("658927b2-38c3-47fc-beb5-5b958fb09545")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProfileData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("306ea37b-d0fe-417f-8972-ca7e587e6a26")
        public static SmAttribute JCodeAtt() {
            if (JCodeAtt == null) {
            	JCodeAtt = classof().getAttributeDef("JCode");
            }
            return JCodeAtt;
        }

        @objid ("8c67b2db-1590-47d0-b873-c5f0e5bde9f6")
        public static SmDependency DefinedStereotypeDep() {
            if (DefinedStereotypeDep == null) {
            	DefinedStereotypeDep = classof().getDependencyDef("DefinedStereotype");
            }
            return DefinedStereotypeDep;
        }

        @objid ("462b9c83-5672-4baf-9be7-3f958c94a744")
        public static SmDependency OwnerModuleDep() {
            if (OwnerModuleDep == null) {
            	OwnerModuleDep = classof().getDependencyDef("OwnerModule");
            }
            return OwnerModuleDep;
        }

        @objid ("ea81b439-f666-4595-8af6-ae82c65b74d3")
        public static SmDependency OwnedReferenceDep() {
            if (OwnedReferenceDep == null) {
            	OwnedReferenceDep = classof().getDependencyDef("OwnedReference");
            }
            return OwnedReferenceDep;
        }

        @objid ("78ddb8ab-32b2-4d72-b161-a692fca63931")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7f5a4d01-4b36-4c2b-b9c5-71b27b72747f")
        public static SmAttribute getJCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JCodeAtt;
        }

        @objid ("8a3de73e-66c4-4be5-9c51-9f10f3c14a72")
        public static SmDependency getDefinedStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedStereotypeDep;
        }

        @objid ("a80a3b01-323d-4227-be0f-e94fee587e76")
        public static SmDependency getOwnedReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedReferenceDep;
        }

        @objid ("14235d82-a0eb-40f2-b58a-c97b54d5629a")
        public static SmDependency getOwnerModuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerModuleDep;
        }

        @objid ("007407ac-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1598833-e925-4732-80b5-4ec9c99a551d")
            public ISmObjectData createData() {
                return new ProfileData();
            }

            @objid ("195ff654-228b-4458-919f-1a6363c72755")
            public SmObjectImpl createImpl() {
                return new ProfileImpl();
            }

        }

        @objid ("00746896-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JCodeSmAttribute extends SmAttribute {
            @objid ("89401fba-465f-41cc-9f56-55606be6b465")
            public Object getValue(ISmObjectData data) {
                return ((ProfileData) data).mJCode;
            }

            @objid ("1cfc2233-7526-4b69-a121-ff3ff6f783ac")
            public void setValue(ISmObjectData data, Object value) {
                ((ProfileData) data).mJCode = value;
            }

        }

        @objid ("0074cb38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerModuleSmDependency extends SmSingleDependency {
            @objid ("5b5b7b11-ddef-46c5-9308-0c6aec8c75b1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProfileData) data).mOwnerModule;
            }

            @objid ("c4093573-19e4-4142-a294-a624238062d5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProfileData) data).mOwnerModule = value;
            }

            @objid ("0704efa9-d40b-4796-b60f-42d54ad0f6e1")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.OwnedProfileDep();
            }

        }

        @objid ("00753f96-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedStereotypeSmDependency extends SmMultipleDependency {
            @objid ("aafd6dab-8103-4f40-a0d1-96ff7da3d5a0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mDefinedStereotype != null)? ((ProfileData)data).mDefinedStereotype:SmMultipleDependency.EMPTY;
            }

            @objid ("d055e0d3-5834-45b0-879b-26b75cf66fc4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mDefinedStereotype = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mDefinedStereotype;
            }

            @objid ("8a9a5027-31a5-4f82-9761-5026cae66850")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.OwnerDep();
            }

        }

        @objid ("0075a2e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnedReferenceSmDependency extends SmMultipleDependency {
            @objid ("e803955f-74e1-43b0-91a1-573269bb24ee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProfileData)data).mOwnedReference != null)? ((ProfileData)data).mOwnedReference:SmMultipleDependency.EMPTY;
            }

            @objid ("de5f34f9-b32e-4631-a270-44d9583f2d2c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProfileData) data).mOwnedReference = new ArrayList<>(initialCapacity);
                return ((ProfileData) data).mOwnedReference;
            }

            @objid ("20de3401-b053-4b21-bc53-cdcafe02756a")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.OwnerProfileDep();
            }

        }

    }

}
