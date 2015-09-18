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
    @objid ("e6b38959-8967-4a62-b26a-0a09e7078baf")
    @SmaMetaAssociation(metaName="OwnerUse", typeDataClass=InteractionUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerUseSmDependency.class)
     SmObjectImpl mOwnerUse;

    @objid ("f44750b4-0a1a-4f9a-9d70-12b1ee6eef88")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class)
     List<SmObjectImpl> mActual = null;

    @objid ("4a592cde-e8c4-49f2-a460-4c4287fffd94")
    @SmaMetaAssociation(metaName="OwnerInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerInteractionSmDependency.class)
     SmObjectImpl mOwnerInteraction;

    @objid ("cb93b041-4fc4-4a81-a942-7bc8682b551b")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("a32c74e6-c152-4af8-b7fa-5a6c7f2e6d2c")
    @SmaMetaAssociation(metaName="Formal", typeDataClass=GateData.class, min=0, max=1, smAssociationClass=Metadata.FormalSmDependency.class, partof = true)
     SmObjectImpl mFormal;

    @objid ("b1b96be3-8225-4ab0-9bb8-223be0d8df67")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0084f6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ab298736-7a0a-4d00-8f03-79c727c2d176")
        private static SmClass smClass = null;

        @objid ("1b26d94e-d6cc-416c-a7b2-0c5719b96bbb")
        private static SmDependency OwnerUseDep = null;

        @objid ("5f2a81c8-9777-444e-8fdf-01e489d800cb")
        private static SmDependency ActualDep = null;

        @objid ("6597d570-7272-4183-9b01-21f8889e4e51")
        private static SmDependency OwnerInteractionDep = null;

        @objid ("13dddbc8-955c-4a1d-b46b-913f0b6c9c2d")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("c039d313-3b32-4062-925a-a5d6bbe6675e")
        private static SmDependency FormalDep = null;

        @objid ("d8bb1552-6fa9-4298-8f07-fa1423e86b64")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b043065a-f1ef-4e8f-a1e1-6bd1ef5f976b")
        public static SmDependency OwnerUseDep() {
            if (OwnerUseDep == null) {
            	OwnerUseDep = classof().getDependencyDef("OwnerUse");
            }
            return OwnerUseDep;
        }

        @objid ("c3934c81-e19c-43c0-a2ba-336ff7945dc6")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("78cb9066-f9bf-4c30-aeaf-a6a12cb40634")
        public static SmDependency OwnerInteractionDep() {
            if (OwnerInteractionDep == null) {
            	OwnerInteractionDep = classof().getDependencyDef("OwnerInteraction");
            }
            return OwnerInteractionDep;
        }

        @objid ("6dc9cb0c-bdda-417f-ab80-cde2e54a3bbc")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("2ea6b60f-f344-453b-980b-2380a2831047")
        public static SmDependency FormalDep() {
            if (FormalDep == null) {
            	FormalDep = classof().getDependencyDef("Formal");
            }
            return FormalDep;
        }

        @objid ("e9290024-5802-4b2e-9a5b-6583ad84bc60")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c8779e70-f171-4d26-ac40-34801c5df461")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("35adf6b8-8dff-49f0-b3e8-1c10302193d8")
        public static SmDependency getOwnerInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerInteractionDep;
        }

        @objid ("7ae80b0b-9a91-498f-9658-6ab0aad1e6ca")
        public static SmDependency getFormalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalDep;
        }

        @objid ("f40e4d3b-0c7f-4470-9722-e02d1d62bedb")
        public static SmDependency getOwnerUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerUseDep;
        }

        @objid ("92bd1607-0e72-4adc-820a-99c3b2d8fc05")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("008537fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6b0e6b8d-97b5-47b1-b654-c7c547f1c4aa")
            public ISmObjectData createData() {
                return new GateData();
            }

            @objid ("a22d8f07-1549-440a-8e9a-ebf54328ee25")
            public SmObjectImpl createImpl() {
                return new GateImpl();
            }

        }

        @objid ("00859b0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("5d6abdcf-fc7a-48dd-9195-3bf55862a413")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerFragment;
            }

            @objid ("da8c3c2d-fa09-4b8a-b326-42b1d5ef4694")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerFragment = value;
            }

            @objid ("b2fb693d-8d09-4025-bdc1-81f342ae8609")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.FragmentGateDep();
            }

        }

        @objid ("00860f7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class FormalSmDependency extends SmSingleDependency {
            @objid ("b452d17a-7149-4e31-9b0e-1e5d20967297")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mFormal;
            }

            @objid ("aae51871-10a4-4240-b85c-c67ec85a07d4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mFormal = value;
            }

            @objid ("ec364c9d-6f0d-47d7-a96d-e334332205e4")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.ActualDep();
            }

        }

        @objid ("00868620-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("9cd2d3e4-e33b-4928-bafe-52ced568a07b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GateData)data).mActual != null)? ((GateData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("6781a0a1-d6c5-49ed-993b-07cd2fbee7ac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GateData) data).mActual = new ArrayList<>(initialCapacity);
                return ((GateData) data).mActual;
            }

            @objid ("08a873c9-0ddb-4751-a6ab-25206b6c1db5")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.FormalDep();
            }

        }

        @objid ("0086e99e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerInteractionSmDependency extends SmSingleDependency {
            @objid ("3735a6c0-9c32-4021-8be2-096ce887ae70")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerInteraction;
            }

            @objid ("e9580524-af4a-498b-9af9-35e875059d12")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerInteraction = value;
            }

            @objid ("c0edf70d-a8b8-4477-a3da-29db8a848ee6")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FormalGateDep();
            }

        }

        @objid ("00875f8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerUseSmDependency extends SmSingleDependency {
            @objid ("c3f75283-c7ea-41d1-8091-37ec59f8eb16")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerUse;
            }

            @objid ("02274f1c-5670-4f0f-a537-5a051a52a156")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerUse = value;
            }

            @objid ("8e16c072-dd19-42a8-9456-3e156f5d01b1")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.ActualGateDep();
            }

        }

    }

}
