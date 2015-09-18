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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.GeneralizationImpl;
import org.modelio.metamodel.uml.statik.Generalization;
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

@objid ("000cfae4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Generalization.class, factory=GeneralizationData.Metadata.ObjectFactory.class)
public class GeneralizationData extends ModelElementData {
    @objid ("484ac3b6-69cd-4f07-9ff1-4749f2f4a5f3")
    @SmaMetaAttribute(metaName="Discriminator", type=String.class, smAttributeClass=Metadata.DiscriminatorSmAttribute.class)
     Object mDiscriminator = "";

    @objid ("06fe678c-c29a-4987-88fa-c3e0f28c61ed")
    @SmaMetaAssociation(metaName="SuperType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SuperTypeSmDependency.class, partof = true)
     SmObjectImpl mSuperType;

    @objid ("913b4b03-d9a1-43b5-a41d-5f7a47e5c735")
    @SmaMetaAssociation(metaName="SubType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SubTypeSmDependency.class)
     SmObjectImpl mSubType;

    @objid ("7212c38a-4807-42b2-a53a-1ae2683cc37a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd9da-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b56c4ffe-7f0e-42fa-b4ca-8ab59f974fbf")
        private static SmClass smClass = null;

        @objid ("0358978c-908e-4b29-a6a0-509c1320cfba")
        private static SmAttribute DiscriminatorAtt = null;

        @objid ("1d48589d-cc8a-4748-afe1-3b784b2b8c34")
        private static SmDependency SuperTypeDep = null;

        @objid ("e9cff68b-531a-47cd-a8b0-b123f0b0c573")
        private static SmDependency SubTypeDep = null;

        @objid ("ac376612-1400-4e84-8930-4e0d8bf0634e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c382e3cf-24f4-4b10-9ca2-b455cd0f54da")
        public static SmAttribute DiscriminatorAtt() {
            if (DiscriminatorAtt == null) {
            	DiscriminatorAtt = classof().getAttributeDef("Discriminator");
            }
            return DiscriminatorAtt;
        }

        @objid ("4527895d-365b-42e1-b793-2decff25d947")
        public static SmDependency SuperTypeDep() {
            if (SuperTypeDep == null) {
            	SuperTypeDep = classof().getDependencyDef("SuperType");
            }
            return SuperTypeDep;
        }

        @objid ("78ab87fd-d8ce-4c14-9886-a02328cf2ece")
        public static SmDependency SubTypeDep() {
            if (SubTypeDep == null) {
            	SubTypeDep = classof().getDependencyDef("SubType");
            }
            return SubTypeDep;
        }

        @objid ("bb24be1d-bd4a-42d2-98e4-0aa3d7493701")
        public static SmDependency getSuperTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperTypeDep;
        }

        @objid ("af92a860-8422-4989-9039-d38f8be8f1f7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("58cb8219-2bd6-4c8b-8031-07b8e081dec3")
        public static SmDependency getSubTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubTypeDep;
        }

        @objid ("1582d2c6-634b-4a0a-b0cc-d521e2e57cde")
        public static SmAttribute getDiscriminatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiscriminatorAtt;
        }

        @objid ("003d264c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("12eff715-893a-438e-86a1-2da33b5c2260")
            public ISmObjectData createData() {
                return new GeneralizationData();
            }

            @objid ("479f5569-5029-4ba3-a551-00de6d9d9586")
            public SmObjectImpl createImpl() {
                return new GeneralizationImpl();
            }

        }

        @objid ("003d9316-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiscriminatorSmAttribute extends SmAttribute {
            @objid ("e599efc2-1cbe-4f23-9adb-df7d143f0f1d")
            public Object getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mDiscriminator;
            }

            @objid ("06d6f362-8db1-400b-9564-4a038ba393e7")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralizationData) data).mDiscriminator = value;
            }

        }

        @objid ("003e00c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubTypeSmDependency extends SmSingleDependency {
            @objid ("a3fcf6c2-5c0b-41d3-ad76-2cad58421257")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSubType;
            }

            @objid ("60fa9443-89fd-4a2b-8ff0-59925a2bf1e2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSubType = value;
            }

            @objid ("00a82893-5e82-4646-a6c0-af62ecabf471")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ParentDep();
            }

        }

        @objid ("003e81c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperTypeSmDependency extends SmSingleDependency {
            @objid ("ba66b8c1-6ca8-4583-b3d4-bc3ddcdaf48c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSuperType;
            }

            @objid ("3dd2a33d-f09d-44c0-b22d-5ae7a7d5b72e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSuperType = value;
            }

            @objid ("a5226d3a-44c3-4a9c-a212-98abf104ca16")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SpecializationDep();
            }

        }

    }

}
