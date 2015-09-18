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
    @objid ("b24eb00a-dd7f-4dcd-ac06-573910f851c6")
    @SmaMetaAssociation(metaName="FormalGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FormalGateSmDependency.class, component = true)
     List<SmObjectImpl> mFormalGate = null;

    @objid ("bf1191cd-0b8e-493b-b4c5-0b768e1fe91c")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("ec05c9a6-ea7b-4d57-a58b-4c797b73481f")
    @SmaMetaAssociation(metaName="OwnedLine", typeDataClass=LifelineData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedLineSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedLine = null;

    @objid ("de1adc82-b967-43a9-ac16-449d8df724a4")
    @SmaMetaAssociation(metaName="ReferedUse", typeDataClass=InteractionUseData.class, min=0, max=-1, smAssociationClass=Metadata.ReferedUseSmDependency.class)
     List<SmObjectImpl> mReferedUse = null;

    @objid ("db743dd6-46b1-44c2-8831-95bf02917306")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003107c2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("35444719-4dcd-4ee0-a10a-e0b2d4130a26")
        private static SmClass smClass = null;

        @objid ("3f48d879-db57-457d-9868-618f1ae93a45")
        private static SmDependency FormalGateDep = null;

        @objid ("72c7103e-5cd4-4b86-8f58-b32cf01299fe")
        private static SmDependency FragmentDep = null;

        @objid ("4465e645-a142-4bfd-822d-95e2cf8a094d")
        private static SmDependency OwnedLineDep = null;

        @objid ("5d3216c6-edd3-42ae-b086-304bfb72a5dd")
        private static SmDependency ReferedUseDep = null;

        @objid ("5e5480b3-0456-4e07-8da5-8e5da65067ac")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3c75950c-91b7-4ac9-8bf5-50247521f79a")
        public static SmDependency FormalGateDep() {
            if (FormalGateDep == null) {
            	FormalGateDep = classof().getDependencyDef("FormalGate");
            }
            return FormalGateDep;
        }

        @objid ("84673f8b-cfba-44d2-a6f9-9774878dd8de")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("2b3b1a22-0381-4f79-991c-7b8714726b1b")
        public static SmDependency OwnedLineDep() {
            if (OwnedLineDep == null) {
            	OwnedLineDep = classof().getDependencyDef("OwnedLine");
            }
            return OwnedLineDep;
        }

        @objid ("57327c18-49df-49f3-bf1b-ef8af98c99ac")
        public static SmDependency ReferedUseDep() {
            if (ReferedUseDep == null) {
            	ReferedUseDep = classof().getDependencyDef("ReferedUse");
            }
            return ReferedUseDep;
        }

        @objid ("dc7dc8f8-2362-409f-8025-e91e2bed2f79")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b5694a14-b8d9-49bc-a634-5fdc3c76d6bf")
        public static SmDependency getFormalGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalGateDep;
        }

        @objid ("9e750292-fa89-4c6a-94c1-259267e35f50")
        public static SmDependency getOwnedLineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedLineDep;
        }

        @objid ("986f67a6-9a0e-40cb-a0e4-ab505db22834")
        public static SmDependency getReferedUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferedUseDep;
        }

        @objid ("ccdd2410-33f0-4cc0-bd2d-f6431dfbdcc0")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("0031499e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e58f9192-e561-4626-8a61-b0780b3058c4")
            public ISmObjectData createData() {
                return new InteractionData();
            }

            @objid ("009b7cac-33e8-4d37-b8fe-92536568e277")
            public SmObjectImpl createImpl() {
                return new InteractionImpl();
            }

        }

        @objid ("0031ad58-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FormalGateSmDependency extends SmMultipleDependency {
            @objid ("41e96474-d11b-421c-a773-91a813eefa3f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFormalGate != null)? ((InteractionData)data).mFormalGate:SmMultipleDependency.EMPTY;
            }

            @objid ("81bf260e-e7dd-463e-9f65-174ecacac99e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFormalGate = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFormalGate;
            }

            @objid ("c9e41024-32f5-40c2-8e5a-698ac0eb885d")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerInteractionDep();
            }

        }

        @objid ("00321234-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("6c6d7322-30c5-45ec-9533-bf53977b4156")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mFragment != null)? ((InteractionData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("19d2ec40-19b1-4c12-abc0-ea5cf74ff694")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mFragment;
            }

            @objid ("d9b85970-2e38-42f5-9319-77c3d05f6835")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingInteractionDep();
            }

        }

        @objid ("00327544-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedLineSmDependency extends SmMultipleDependency {
            @objid ("3d876bc5-6e70-4be6-a463-04ba0e713e73")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mOwnedLine != null)? ((InteractionData)data).mOwnedLine:SmMultipleDependency.EMPTY;
            }

            @objid ("6a0bb20b-35cf-4434-ba1c-43441ce24fde")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mOwnedLine = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mOwnedLine;
            }

            @objid ("f9ccf7b5-79cb-4f6f-aec8-6fa6c68ef8fb")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.OwnerDep();
            }

        }

        @objid ("0032da5c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReferedUseSmDependency extends SmMultipleDependency {
            @objid ("5965fb30-fbfa-4dd6-8516-375f73940c04")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionData)data).mReferedUse != null)? ((InteractionData)data).mReferedUse:SmMultipleDependency.EMPTY;
            }

            @objid ("fa897a8d-57b4-4fdd-89c1-7ca580b37f9e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionData) data).mReferedUse = new ArrayList<>(initialCapacity);
                return ((InteractionData) data).mReferedUse;
            }

            @objid ("092a6d5b-07f7-46a8-a6bd-96debef2b245")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.RefersToDep();
            }

        }

    }

}
