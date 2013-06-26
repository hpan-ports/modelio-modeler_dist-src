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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
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

@objid ("00459ffc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Gate.class, factory=GateData.Metadata.ObjectFactory.class)
public class GateData extends MessageEndData {
    @objid ("60715673-1e9f-4f2e-92df-643c012ca720")
    @SmaMetaAssociation(metaName="OwnerUse", typeDataClass=InteractionUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerUseSmDependency.class)
     SmObjectImpl mOwnerUse;

    @objid ("0d67bf48-e715-4176-96fa-ba7bff14ec54")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class)
     List<SmObjectImpl> mActual = null;

    @objid ("711717e9-4f74-4409-b453-b2144999ac2a")
    @SmaMetaAssociation(metaName="OwnerInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerInteractionSmDependency.class)
     SmObjectImpl mOwnerInteraction;

    @objid ("70ee116f-5f7e-4b91-a038-4cf549d54f67")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("f5fe7e89-4824-4d67-ac39-e7293d7c17b1")
    @SmaMetaAssociation(metaName="Formal", typeDataClass=GateData.class, min=0, max=1, smAssociationClass=Metadata.FormalSmDependency.class, partof = true)
     SmObjectImpl mFormal;

    @objid ("204ab40e-7226-4aff-9d71-a2133d5550cb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0084f6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8f67b33a-fa77-4189-9dfc-f93b17fd46dc")
        private static SmClass smClass = null;

        @objid ("d411ec35-d7ed-4b1b-a7c0-7ba719b89eef")
        private static SmDependency OwnerUseDep = null;

        @objid ("b98279d4-f66c-40b2-9783-efdde9de54d1")
        private static SmDependency ActualDep = null;

        @objid ("dae8b29a-8569-486a-8b1d-70bee44c6c6d")
        private static SmDependency OwnerInteractionDep = null;

        @objid ("6e54ef41-5ea5-4804-bcb5-bd9a31aa3744")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("695e6e58-f775-4bbf-ba12-4f1f8841b88f")
        private static SmDependency FormalDep = null;

        @objid ("516fff85-8748-49b2-87c3-1ef4c85dc212")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e1bc27cc-587c-4920-960b-c0c668516ca9")
        public static SmDependency OwnerUseDep() {
            if (OwnerUseDep == null) {
            	OwnerUseDep = classof().getDependencyDef("OwnerUse");
            }
            return OwnerUseDep;
        }

        @objid ("6430cc70-ba15-4bba-ba78-e6ececea8840")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("89d77971-f2dd-41fe-938b-8189561f0393")
        public static SmDependency OwnerInteractionDep() {
            if (OwnerInteractionDep == null) {
            	OwnerInteractionDep = classof().getDependencyDef("OwnerInteraction");
            }
            return OwnerInteractionDep;
        }

        @objid ("3dc33de6-4d05-47bd-a7f8-ac474963a74f")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("607f4cc8-6775-44c0-95e7-4999b0416755")
        public static SmDependency FormalDep() {
            if (FormalDep == null) {
            	FormalDep = classof().getDependencyDef("Formal");
            }
            return FormalDep;
        }

        @objid ("27cd5494-f933-4b5e-8200-8ca384fc44a3")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("95ccb676-0ade-4ee3-a5ff-16090af9301a")
        public static SmDependency getOwnerUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerUseDep;
        }

        @objid ("fd1958b2-9eab-4185-8cc0-17e86bc1cf39")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("71f2da69-a033-465b-b89f-fd48f72522a4")
        public static SmDependency getFormalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalDep;
        }

        @objid ("3dbc3dcd-0f25-4385-a262-22d93aa97eae")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("41ee26d5-8eba-47b0-9ec8-d70450dfa8f6")
        public static SmDependency getOwnerInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerInteractionDep;
        }

        @objid ("008537fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("44b5dd61-f790-4949-adbb-ac77b5d30223")
            public ISmObjectData createData() {
                return new GateData();
            }

            @objid ("297aab36-f545-4d20-958e-a77f74cb9774")
            public SmObjectImpl createImpl() {
                return new GateImpl();
            }

        }

        @objid ("00859b0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("a1b2bedc-af4b-4d49-86cd-55160051d478")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerFragment;
            }

            @objid ("e81c55e6-3fd1-45b4-85bb-5ca92d0bbbcf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerFragment = value;
            }

            @objid ("b37480ab-f98c-481b-ba19-9dd2a76d548f")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.FragmentGateDep();
            }

        }

        @objid ("00860f7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class FormalSmDependency extends SmSingleDependency {
            @objid ("d84e226e-2266-4e33-be9d-5f3d7961f959")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mFormal;
            }

            @objid ("a1f90b16-172f-4ada-a004-b93a05b3e237")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mFormal = value;
            }

            @objid ("56b9fb45-cae4-4148-8e8b-be8b5741839f")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.ActualDep();
            }

        }

        @objid ("00868620-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("e40ebb5a-adf6-40fb-b9b0-751d8da94a76")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GateData)data).mActual != null)? ((GateData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("ace86056-9302-4362-903a-b0d548a4f2bb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GateData) data).mActual = new ArrayList<>(initialCapacity);
                return ((GateData) data).mActual;
            }

            @objid ("f53a7e4d-c444-45e3-851a-e9863566dcc3")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.FormalDep();
            }

        }

        @objid ("0086e99e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerInteractionSmDependency extends SmSingleDependency {
            @objid ("85efcdfe-4190-4594-b2b6-10570b514074")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerInteraction;
            }

            @objid ("9a8c36ce-108a-475d-9a00-13f3f4477492")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerInteraction = value;
            }

            @objid ("58555fbc-50b8-412c-9372-3d2a4fec541f")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FormalGateDep();
            }

        }

        @objid ("00875f8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerUseSmDependency extends SmSingleDependency {
            @objid ("fb7a6170-e12f-421d-aa71-b0efc0a981cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerUse;
            }

            @objid ("1834f4aa-9088-42e1-869f-98b1a0d16e92")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerUse = value;
            }

            @objid ("77538b9d-f739-4243-a995-51d1f56fc12d")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.ActualGateDep();
            }

        }

    }

}
