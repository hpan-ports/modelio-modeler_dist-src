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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
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

@objid ("00546122-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StateMachine.class, factory=StateMachineData.Metadata.ObjectFactory.class, cmsnode=true)
public class StateMachineData extends BehaviorData {
    @objid ("63a1cad1-3dad-4520-b917-5d9259dc143f")
    @SmaMetaAttribute(metaName="Kind", type=KindOfStateMachine.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = KindOfStateMachine.DYNAMIC;

    @objid ("f201b4dd-8bd3-45d0-989d-58c91b668e6f")
    @SmaMetaAssociation(metaName="Top", typeDataClass=RegionData.class, min=1, max=1, smAssociationClass=Metadata.TopSmDependency.class, component = true)
     SmObjectImpl mTop;

    @objid ("0fa6bd97-55e6-46f9-8627-892afd92537e")
    @SmaMetaAssociation(metaName="SubmachineState", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.SubmachineStateSmDependency.class)
     List<SmObjectImpl> mSubmachineState = null;

    @objid ("4412ee5f-fd5b-4611-9490-085b41b85cf4")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("45a21175-823a-44cd-93a7-d8d8c9645f80")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("2207b76f-b0cd-4bbf-b370-64c72f898512")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050353e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5049c697-9477-47e8-969f-0b1a2e404de7")
        private static SmClass smClass = null;

        @objid ("4b84fba2-1c3f-42f3-8760-eefab22ea7b8")
        private static SmAttribute KindAtt = null;

        @objid ("4c87fcd6-4610-46a1-9a91-df31b00220b5")
        private static SmDependency TopDep = null;

        @objid ("f61cd900-35a4-475f-9df4-e0d8f554d421")
        private static SmDependency SubmachineStateDep = null;

        @objid ("29ad562e-def8-47da-b56d-d47bd26d5247")
        private static SmDependency EntryPointDep = null;

        @objid ("c47b4c98-d843-4ba0-8430-6f59f9e3dd9e")
        private static SmDependency ExitPointDep = null;

        @objid ("417bf1ae-2c17-4e86-8f25-ee1b21105a74")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("059b15d5-1462-4065-992e-ed0e320f6f90")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("b5c62173-ce98-43d8-9268-618501451106")
        public static SmDependency TopDep() {
            if (TopDep == null) {
            	TopDep = classof().getDependencyDef("Top");
            }
            return TopDep;
        }

        @objid ("9e7d9cfc-eb78-4a0d-b047-b0a733f07532")
        public static SmDependency SubmachineStateDep() {
            if (SubmachineStateDep == null) {
            	SubmachineStateDep = classof().getDependencyDef("SubmachineState");
            }
            return SubmachineStateDep;
        }

        @objid ("689494ef-6048-43e4-b1cd-71a9de26c98d")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("f59c960b-9d6f-44ad-a7f7-251c2920d5e7")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("3213f1e8-786a-4acb-b3c8-62b31df80077")
        public static SmDependency getTopDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TopDep;
        }

        @objid ("b04d6f09-eb70-42d6-b905-268a3dca3833")
        public static SmDependency getSubmachineStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubmachineStateDep;
        }

        @objid ("5c528d63-50a7-4973-8878-20fa335d7b48")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("d571c1ae-5ac8-47a9-a974-ab35ae453b99")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("12b55ca9-66de-4d0e-8bec-5e70c6a39d13")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("be3ec2aa-d04d-46c3-a041-f36c5f2fd08f")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("005075ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a44444e4-85d1-4102-9e73-f840113ae40b")
            public ISmObjectData createData() {
                return new StateMachineData();
            }

            @objid ("64672cd5-a39b-49b2-bf29-1fec01ac6f02")
            public SmObjectImpl createImpl() {
                return new StateMachineImpl();
            }

        }

        @objid ("0050e0d8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("a9d11773-d9f7-408f-b7a4-c7919e37882a")
            public Object getValue(ISmObjectData data) {
                return ((StateMachineData) data).mKind;
            }

            @objid ("9c2de5ce-49c4-4777-b71e-6627062d3f62")
            public void setValue(ISmObjectData data, Object value) {
                ((StateMachineData) data).mKind = value;
            }

        }

        @objid ("00514596-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TopSmDependency extends SmSingleDependency {
            @objid ("d3af8f78-2c2c-4e8b-bda5-3ce569d288f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateMachineData) data).mTop;
            }

            @objid ("ceaaef5d-398d-4972-8a70-27e7352a55f8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateMachineData) data).mTop = value;
            }

            @objid ("10716b5e-efa3-4112-ba0d-98dd6bb47d79")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.RepresentedDep();
            }

        }

        @objid ("0051bc92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubmachineStateSmDependency extends SmMultipleDependency {
            @objid ("57d26cd7-a51c-40be-945e-9742b5e8cf9e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mSubmachineState != null)? ((StateMachineData)data).mSubmachineState:SmMultipleDependency.EMPTY;
            }

            @objid ("ec3926be-c353-44a1-a331-e6392cc679c7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mSubmachineState = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mSubmachineState;
            }

            @objid ("d97c9a49-d12c-47c8-aa9c-836a266aebd9")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.SubMachineDep();
            }

        }

        @objid ("005221e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("0af78c3d-d0d9-43d0-9aaa-6e71ae220b0d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mEntryPoint != null)? ((StateMachineData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("49d5a8b2-c2dc-4c95-b4aa-ab778695e2f3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mEntryPoint;
            }

            @objid ("23104839-1263-465b-bdc6-493314775dc4")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfMachineDep();
            }

        }

        @objid ("005285fa-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("598027f6-6c4c-4e9a-a76c-03868acbc3e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mExitPoint != null)? ((StateMachineData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("b376a517-8378-4813-b373-315d0a8eacfa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mExitPoint;
            }

            @objid ("3569c5dc-6260-4e1e-bcf6-ce3700c66bcf")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfMachineDep();
            }

        }

    }

}
