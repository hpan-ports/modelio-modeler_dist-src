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
    @objid ("4e807ed5-a418-4d14-932f-ed7fd152963f")
    @SmaMetaAttribute(metaName="Discriminator", type=String.class, smAttributeClass=Metadata.DiscriminatorSmAttribute.class)
     Object mDiscriminator = "";

    @objid ("6857dc74-e01b-458a-99be-ef5c8557dbb9")
    @SmaMetaAssociation(metaName="SuperType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SuperTypeSmDependency.class, partof = true)
     SmObjectImpl mSuperType;

    @objid ("847da08d-9dc7-43e3-820c-e94ab7a87ca0")
    @SmaMetaAssociation(metaName="SubType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SubTypeSmDependency.class)
     SmObjectImpl mSubType;

    @objid ("fe1c2df2-7b9c-4c51-b9a9-33a78b403497")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd9da-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7ada244e-f61e-4abb-bec6-f6b38564bd73")
        private static SmClass smClass = null;

        @objid ("683705d0-cdec-42d2-8a02-0e04d1cd64a8")
        private static SmAttribute DiscriminatorAtt = null;

        @objid ("910bc54e-7131-4bdf-ad06-a8e564a20946")
        private static SmDependency SuperTypeDep = null;

        @objid ("9a7f7431-a25e-4058-b2d8-66ff36799b05")
        private static SmDependency SubTypeDep = null;

        @objid ("4b06c6d9-87e4-4cd5-adda-74fe00ae12f6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("63c8cad9-ba4c-4709-8a5c-2c27595bbe95")
        public static SmAttribute DiscriminatorAtt() {
            if (DiscriminatorAtt == null) {
            	DiscriminatorAtt = classof().getAttributeDef("Discriminator");
            }
            return DiscriminatorAtt;
        }

        @objid ("87855f92-1f0b-4a17-aece-25464e93ad91")
        public static SmDependency SuperTypeDep() {
            if (SuperTypeDep == null) {
            	SuperTypeDep = classof().getDependencyDef("SuperType");
            }
            return SuperTypeDep;
        }

        @objid ("8d5f7750-88c0-48f7-b6f7-dec9f937a9bd")
        public static SmDependency SubTypeDep() {
            if (SubTypeDep == null) {
            	SubTypeDep = classof().getDependencyDef("SubType");
            }
            return SubTypeDep;
        }

        @objid ("2cc7534c-ca23-4e14-b2b2-2a100d5758cc")
        public static SmDependency getSubTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubTypeDep;
        }

        @objid ("18230984-8ec0-488a-9cf9-de864c18eee7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1be9fcbe-00f5-4d44-a2e9-3726245c753f")
        public static SmAttribute getDiscriminatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiscriminatorAtt;
        }

        @objid ("e411cb69-4c7e-4e90-9bfe-c60e51743a4d")
        public static SmDependency getSuperTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperTypeDep;
        }

        @objid ("003d264c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("061c70e2-0253-497f-8071-ca00c1eb6459")
            public ISmObjectData createData() {
                return new GeneralizationData();
            }

            @objid ("67331721-3d67-48ac-8941-a4e6d7c1b243")
            public SmObjectImpl createImpl() {
                return new GeneralizationImpl();
            }

        }

        @objid ("003d9316-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiscriminatorSmAttribute extends SmAttribute {
            @objid ("ee8b6338-a814-4492-b0f9-d158963df163")
            public Object getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mDiscriminator;
            }

            @objid ("5152a8ae-a968-4be2-b8e9-42c136535fe8")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralizationData) data).mDiscriminator = value;
            }

        }

        @objid ("003e00c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubTypeSmDependency extends SmSingleDependency {
            @objid ("39be174e-a972-45c4-820f-b4cd39c01aff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSubType;
            }

            @objid ("8035f873-52aa-4b6f-9441-74b448285c08")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSubType = value;
            }

            @objid ("27959521-4be8-4cfb-b025-e93631cf4889")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ParentDep();
            }

        }

        @objid ("003e81c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperTypeSmDependency extends SmSingleDependency {
            @objid ("8d7ccb64-9be7-4644-9cfa-fbc9d9a8fbed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSuperType;
            }

            @objid ("928fe2be-320a-43ea-946a-d23bb6b1220a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSuperType = value;
            }

            @objid ("9580a47e-2588-4163-a31c-f6f1e595b5da")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SpecializationDep();
            }

        }

    }

}
