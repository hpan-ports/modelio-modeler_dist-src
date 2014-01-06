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
    @objid ("b86c3703-fb4e-4428-9366-d6b300e4f389")
    @SmaMetaAttribute(metaName="Discriminator", type=String.class, smAttributeClass=Metadata.DiscriminatorSmAttribute.class)
     Object mDiscriminator = "";

    @objid ("7351eda5-2393-4771-bc7a-06d96ee6cd8e")
    @SmaMetaAssociation(metaName="SuperType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SuperTypeSmDependency.class, partof = true)
     SmObjectImpl mSuperType;

    @objid ("08f60638-e6f0-4c8d-9929-98e446e746b5")
    @SmaMetaAssociation(metaName="SubType", typeDataClass=NameSpaceData.class, min=1, max=1, smAssociationClass=Metadata.SubTypeSmDependency.class)
     SmObjectImpl mSubType;

    @objid ("ba313d2e-0906-47ac-b3dd-995df93a91df")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd9da-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7070b8e5-197c-4a26-9449-d367cff6af5e")
        private static SmClass smClass = null;

        @objid ("e6b4aacd-c652-47bb-a3ec-b2547e119c83")
        private static SmAttribute DiscriminatorAtt = null;

        @objid ("17bd902d-3492-440a-a7a3-acb940695e3b")
        private static SmDependency SuperTypeDep = null;

        @objid ("fbc378ed-288a-403e-955b-00633408aa5a")
        private static SmDependency SubTypeDep = null;

        @objid ("11ec5d46-283f-4be6-ab02-b901cadc0579")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4ce97f5f-770f-4550-a26b-a4777a584985")
        public static SmAttribute DiscriminatorAtt() {
            if (DiscriminatorAtt == null) {
            	DiscriminatorAtt = classof().getAttributeDef("Discriminator");
            }
            return DiscriminatorAtt;
        }

        @objid ("e5d52d71-a96f-4080-ac7f-744b9ffa14f2")
        public static SmDependency SuperTypeDep() {
            if (SuperTypeDep == null) {
            	SuperTypeDep = classof().getDependencyDef("SuperType");
            }
            return SuperTypeDep;
        }

        @objid ("198f74b6-4db5-41ee-b263-9cfd7aaac3ce")
        public static SmDependency SubTypeDep() {
            if (SubTypeDep == null) {
            	SubTypeDep = classof().getDependencyDef("SubType");
            }
            return SubTypeDep;
        }

        @objid ("17047c88-1214-408c-aeb5-ba0c98e9e288")
        public static SmDependency getSuperTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SuperTypeDep;
        }

        @objid ("dcc4c749-dceb-4def-9097-37effbfb99ec")
        public static SmAttribute getDiscriminatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiscriminatorAtt;
        }

        @objid ("4be55a5c-de6e-4a9c-80c3-6f7811dc8afe")
        public static SmDependency getSubTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubTypeDep;
        }

        @objid ("b3123a82-7bbf-4821-9d7c-02f9e8d09ba0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003d264c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("454995e7-f498-4ac3-a18b-0b5e24660e9e")
            public ISmObjectData createData() {
                return new GeneralizationData();
            }

            @objid ("2a3fa573-f3e4-4cec-9d5a-20238a827897")
            public SmObjectImpl createImpl() {
                return new GeneralizationImpl();
            }

        }

        @objid ("003d9316-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiscriminatorSmAttribute extends SmAttribute {
            @objid ("774f3c15-66ad-4de7-933e-960e2e6b9f7d")
            public Object getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mDiscriminator;
            }

            @objid ("154bcb1d-b42f-4ac3-b350-8d7e8683a986")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralizationData) data).mDiscriminator = value;
            }

        }

        @objid ("003e00c6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubTypeSmDependency extends SmSingleDependency {
            @objid ("79c4ad7d-4341-4c3b-bdad-3d410d23002e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSubType;
            }

            @objid ("20d8e98d-426c-4bb1-ac50-0f301a306034")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSubType = value;
            }

            @objid ("9877433c-8b07-492e-b32a-18952903c5c5")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.ParentDep();
            }

        }

        @objid ("003e81c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SuperTypeSmDependency extends SmSingleDependency {
            @objid ("fc733381-7d8a-44e5-86ec-8d6cb4648b10")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralizationData) data).mSuperType;
            }

            @objid ("7b982a2a-cb4e-46ed-b922-8bd833ac1570")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralizationData) data).mSuperType = value;
            }

            @objid ("a511f969-674e-4450-a377-5426fb88d23b")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.SpecializationDep();
            }

        }

    }

}
