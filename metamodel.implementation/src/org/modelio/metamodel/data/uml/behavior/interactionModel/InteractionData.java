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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
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

@objid ("0046e4ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Interaction.class, factory=InteractionData.Metadata.ObjectFactory.class, cmsnode=true)
public class InteractionData extends BehaviorData {
    @objid ("9fa2f40c-96f3-42ea-ae75-8d92ac5d801d")
    @SmaMetaAssociation(metaName="FormalGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FormalGateSmDependency.class, component = true)
     List<SmObjectImpl> mFormalGate = null;

    @objid ("65a0f369-7664-4316-8b85-afa18a79461c")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("5c134c90-31f3-4bb2-a398-68b0e49e8a67")
    @SmaMetaAssociation(metaName="OwnedLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedLineSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedLine = null;

    @objid ("9ffdfa64-00c6-4f3d-84e8-bf59da4e30f7")
    @SmaMetaAssociation(metaName="ReferedUse", typeDataClass=InteractionUseData.class, min=0, max=-1, smAssociationClass=Metadata.ReferedUseSmDependency.class)
     List<SmObjectImpl> mReferedUse = null;

    @objid ("64ad1923-c29d-4531-b693-9af8c7f126ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003107c2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("655cf99c-8c57-4664-b53a-f88c6f0870b0")
        private static SmClass smClass = null;

        @objid ("d301818c-73b5-4981-bfc4-a473c47e6e43")
        private static SmDependency FormalGateDep = null;

        @objid ("372d6c85-325f-4510-a7be-2882ef4dd751")
        private static SmDependency FragmentDep = null;

        @objid ("89e3b1e4-4f1a-4a2a-be24-fc6dcb1fe8a5")
        private static SmDependency OwnedLineDep = null;

        @objid ("2b1077df-eebd-45e0-b120-b04a137bea3e")
        private static SmDependency ReferedUseDep = null;

        @objid ("e525c7ef-ab44-4741-99e7-6cffd8edc8dd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c99a1729-a721-4f47-a9f4-c8dc11db08aa")
        public static SmDependency FormalGateDep() {
            if (FormalGateDep == null) {
            	FormalGateDep = classof().getDependencyDef("FormalGate");
            }
            return FormalGateDep;
        }

        @objid ("fea4b1f2-3205-496e-853b-78c856469e04")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("9370dc1b-b432-43fd-b979-e1bd40df831e")
        public static SmDependency OwnedLineDep() {
            if (OwnedLineDep == null) {
            	OwnedLineDep = classof().getDependencyDef("OwnedLine");
            }
            return OwnedLineDep;
        }

        @objid ("f85e491f-c9e8-4e80-849a-9f554ffe5b78")
        public static SmDependency ReferedUseDep() {
            if (ReferedUseDep == null) {
            	ReferedUseDep = classof().getDependencyDef("ReferedUse");
            }
            return ReferedUseDep;
        }

        @objid ("3838d7be-9081-4ab9-a542-b956554ab496")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e690a9cb-018b-486a-94c9-d11320223c2e")
        public static SmDependency getFormalGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalGateDep;
        }

        @objid ("2bbc5fb1-ce01-49c4-99db-330c1a6de73b")
        public static SmDependency getReferedUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferedUseDep;
        }

        @objid ("b2f73287-77e7-4225-b75f-b735dc78a575")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("eea39cad-7143-4d2b-9f6c-a3cca4b8d1f8")
        public static SmDependency getOwnedLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedLineDep;
        }

        @objid ("0031499e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ac142dc8-a79f-483f-91e5-03140e729919")
            public ISmObjectData createData() {
                return new InteractionData();
            }

            @objid ("ca301bda-0949-4347-b0e8-690b3aad2700")
            public SmObjectImpl createImpl() {
                return new InteractionImpl();
            }

        }

        @objid ("0031ad58-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalGateSmDependency extends SmMultipleDependency {
            @objid ("1b63c126-2f70-4f70-8207-d50fafcf2110")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFormalGate != null)? ((InteractionData)data).mFormalGate:SmMultipleDependency.EMPTY;
            }

            @objid ("027f70af-849b-4c16-a57d-e2edb1ba0c02")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFormalGate = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFormalGate;
            }

            @objid ("5cde1c8c-8188-410d-9f11-0adee4978e1b")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerInteractionDep();
            }

        }

        @objid ("00321234-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("29eac8d4-5126-48c7-a596-b4943ddfa2e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFragment != null)? ((InteractionData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("e5a9397e-869f-4ef5-83b8-e8818b718c9a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFragment;
            }

            @objid ("75f108c2-8301-4093-9099-913bade0847d")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingInteractionDep();
            }

        }

        @objid ("00327544-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedLineSmDependency extends SmMultipleDependency {
            @objid ("bbfcc2dd-1cca-498a-805e-1991192c07f2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mOwnedLine != null)? ((InteractionData)data).mOwnedLine:SmMultipleDependency.EMPTY;
            }

            @objid ("21be7a7f-e443-48e3-bb3c-40266c4fdcf7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mOwnedLine = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mOwnedLine;
            }

            @objid ("38782e52-4504-49ce-9a0a-ccb558509b29")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.OwnerDep();
            }

        }

        @objid ("0032da5c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReferedUseSmDependency extends SmMultipleDependency {
            @objid ("ada5a816-1c2c-478d-983a-24e7928f70f2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mReferedUse != null)? ((InteractionData)data).mReferedUse:SmMultipleDependency.EMPTY;
            }

            @objid ("c3bafbdb-1659-4e01-97ca-d1f1dcd6ffc3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mReferedUse = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mReferedUse;
            }

            @objid ("f3da0852-05b2-4078-91d3-a6a1d4f7e59c")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.RefersToDep();
            }

        }

    }

}
