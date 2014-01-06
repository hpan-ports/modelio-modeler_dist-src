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
    @objid ("82ae3c31-6844-487c-acff-2d59b8b024c4")
    @SmaMetaAssociation(metaName="FormalGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FormalGateSmDependency.class, component = true)
     List<SmObjectImpl> mFormalGate = null;

    @objid ("717ca85d-707c-43fb-8f95-892a400312c9")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("4bc93102-a464-4409-a0ed-23a774d8073a")
    @SmaMetaAssociation(metaName="OwnedLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedLineSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedLine = null;

    @objid ("614d0bd2-05e4-443a-9262-5eb9eca2edea")
    @SmaMetaAssociation(metaName="ReferedUse", typeDataClass=InteractionUseData.class, min=0, max=-1, smAssociationClass=Metadata.ReferedUseSmDependency.class)
     List<SmObjectImpl> mReferedUse = null;

    @objid ("7c47ce6a-ae77-47b1-9822-2af8d01a2667")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003107c2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cce9cfaa-c9f3-4b72-bafa-2aecbd577832")
        private static SmClass smClass = null;

        @objid ("0c5c2373-9879-4d9c-90ef-d319f6dcd558")
        private static SmDependency FormalGateDep = null;

        @objid ("65bfc415-56b3-48b5-a988-6ea7eb7b508e")
        private static SmDependency FragmentDep = null;

        @objid ("24a020f3-d7a4-4efb-bac0-95ea4c08f4d7")
        private static SmDependency OwnedLineDep = null;

        @objid ("733bf597-9d10-4b0c-a528-6b4bfd72d73f")
        private static SmDependency ReferedUseDep = null;

        @objid ("164e465e-72ba-45ef-8150-8bf0df464c05")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4cf2565c-5b69-4eac-bcb4-e4ceb9690435")
        public static SmDependency FormalGateDep() {
            if (FormalGateDep == null) {
            	FormalGateDep = classof().getDependencyDef("FormalGate");
            }
            return FormalGateDep;
        }

        @objid ("80d1209c-0973-47a2-9dcb-a04eb47a3a54")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("274603e4-abf6-41b2-b188-4ee1d5fca17f")
        public static SmDependency OwnedLineDep() {
            if (OwnedLineDep == null) {
            	OwnedLineDep = classof().getDependencyDef("OwnedLine");
            }
            return OwnedLineDep;
        }

        @objid ("f15fbdaa-841f-4836-8d42-a8b8c31309bf")
        public static SmDependency ReferedUseDep() {
            if (ReferedUseDep == null) {
            	ReferedUseDep = classof().getDependencyDef("ReferedUse");
            }
            return ReferedUseDep;
        }

        @objid ("40471974-3368-4990-8460-c8c405e53b5a")
        public static SmDependency getReferedUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferedUseDep;
        }

        @objid ("5318996c-3046-4cab-8c91-08b0a1ac5aa0")
        public static SmDependency getOwnedLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedLineDep;
        }

        @objid ("0936eb50-0989-4711-838a-07ba9deaf28e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("759bd706-8513-4d6d-9d35-30dec13c3fd0")
        public static SmDependency getFormalGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalGateDep;
        }

        @objid ("bf15e45e-a1ec-4fdd-87ad-0515911ac398")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("0031499e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9a2ad443-b96d-4e74-9172-0edf12eb088c")
            public ISmObjectData createData() {
                return new InteractionData();
            }

            @objid ("343b8a30-648e-4324-8817-f6ed27f9b81d")
            public SmObjectImpl createImpl() {
                return new InteractionImpl();
            }

        }

        @objid ("0031ad58-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalGateSmDependency extends SmMultipleDependency {
            @objid ("11d91da3-7ef1-4083-8c37-55610db5b8ba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFormalGate != null)? ((InteractionData)data).mFormalGate:SmMultipleDependency.EMPTY;
            }

            @objid ("aae214ee-d290-49b0-869f-c8718ee41f1f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFormalGate = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFormalGate;
            }

            @objid ("236d71c6-adfb-4eca-86f9-83b152ac3c73")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerInteractionDep();
            }

        }

        @objid ("00321234-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("d0026d9a-5666-4eed-a400-0ebb5e4b7086")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFragment != null)? ((InteractionData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("7f453956-4316-49f7-8da1-7cb1ec96c7e6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFragment;
            }

            @objid ("f7127b64-f3a6-4d97-96d3-4e1f816f7d31")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingInteractionDep();
            }

        }

        @objid ("00327544-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedLineSmDependency extends SmMultipleDependency {
            @objid ("ac61dd7e-257e-40fb-bc84-bdd3ce837c0e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mOwnedLine != null)? ((InteractionData)data).mOwnedLine:SmMultipleDependency.EMPTY;
            }

            @objid ("183a7c68-d360-48c0-b9d2-c4414eeeebcb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mOwnedLine = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mOwnedLine;
            }

            @objid ("2ecac1d8-92e9-4cf2-90ef-a6e6a3d612f9")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.OwnerDep();
            }

        }

        @objid ("0032da5c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReferedUseSmDependency extends SmMultipleDependency {
            @objid ("251a23d1-c3f9-4279-8250-96c9abb0e371")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mReferedUse != null)? ((InteractionData)data).mReferedUse:SmMultipleDependency.EMPTY;
            }

            @objid ("b1381955-b5e1-42f5-a4d0-db7d0e5015d4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mReferedUse = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mReferedUse;
            }

            @objid ("8e86d489-295d-4e4b-b9f6-1e7d842a4184")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.RefersToDep();
            }

        }

    }

}
