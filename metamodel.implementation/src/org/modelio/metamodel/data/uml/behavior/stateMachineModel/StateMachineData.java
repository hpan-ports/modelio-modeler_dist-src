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
    @objid ("4155ca80-b51e-48b8-8249-e00bbc982a16")
    @SmaMetaAttribute(metaName="Kind", type=KindOfStateMachine.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = KindOfStateMachine.DYNAMIC;

    @objid ("2eceec19-2b8f-4662-8226-721afec43d6e")
    @SmaMetaAssociation(metaName="Top", typeDataClass=RegionData.class, min=1, max=1, smAssociationClass=Metadata.TopSmDependency.class, component = true)
     SmObjectImpl mTop;

    @objid ("c7a46a0e-b84c-4305-926a-fc2afd85077d")
    @SmaMetaAssociation(metaName="SubmachineState", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.SubmachineStateSmDependency.class)
     List<SmObjectImpl> mSubmachineState = null;

    @objid ("b28aa011-9b64-4e94-a19e-32928c6d446b")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("34249ae3-8c33-42ce-bb91-cac5f986b42a")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("f5f1ab6d-d0f5-4642-8280-1d7daefb7019")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050353e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1861e2a9-5915-41a6-a938-1bf8f3fee754")
        private static SmClass smClass = null;

        @objid ("adb4063d-f7e8-4390-a7cd-b42ac2c8f784")
        private static SmAttribute KindAtt = null;

        @objid ("aa5a3bac-0c80-44e5-aec9-480e601294ea")
        private static SmDependency TopDep = null;

        @objid ("4850ce94-b0de-4808-b370-059bed9efdc5")
        private static SmDependency SubmachineStateDep = null;

        @objid ("a464e5c5-05a9-40cc-bc2b-414f77cd639a")
        private static SmDependency EntryPointDep = null;

        @objid ("dd09d58b-ee30-4277-887c-23864093bfec")
        private static SmDependency ExitPointDep = null;

        @objid ("31e11464-66fc-41c3-8e3a-6509d6d998ed")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7c364b81-c1e7-48de-9be6-4863bfcc3ba7")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("7f25da2b-5c2e-4092-80f7-d16edef1e3bf")
        public static SmDependency TopDep() {
            if (TopDep == null) {
            	TopDep = classof().getDependencyDef("Top");
            }
            return TopDep;
        }

        @objid ("72ab1d5f-5457-437d-b28a-091b8bf457fe")
        public static SmDependency SubmachineStateDep() {
            if (SubmachineStateDep == null) {
            	SubmachineStateDep = classof().getDependencyDef("SubmachineState");
            }
            return SubmachineStateDep;
        }

        @objid ("3520cfa0-88af-4969-80b8-c3247969a1eb")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("2de1dca1-fcdd-49fa-8246-780c108559d0")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("2279f9a2-fb17-4065-8f6a-1e2c9c0ddf53")
        public static SmDependency getTopDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TopDep;
        }

        @objid ("71cb31cc-33ca-4007-a233-4aa30f2ab41f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("997dc64c-1a35-43a7-8280-c7474854aded")
        public static SmDependency getSubmachineStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubmachineStateDep;
        }

        @objid ("9499a86d-f59b-421b-8fc5-f566b9766513")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("b0736ea4-08bc-4c9e-80db-9d41685b8161")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("66981bcc-8312-4ed1-affd-e6eddd36758d")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("005075ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3ca26ee3-0976-4ac4-bb7a-7642c46016d2")
            public ISmObjectData createData() {
                return new StateMachineData();
            }

            @objid ("fd5f9591-925c-4708-af80-ffae3ddfcba8")
            public SmObjectImpl createImpl() {
                return new StateMachineImpl();
            }

        }

        @objid ("0050e0d8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("92e994b2-bcb9-4072-a1de-398dbb1c6f9b")
            public Object getValue(ISmObjectData data) {
                return ((StateMachineData) data).mKind;
            }

            @objid ("49b5058b-25c0-4159-ab43-44829a3299b2")
            public void setValue(ISmObjectData data, Object value) {
                ((StateMachineData) data).mKind = value;
            }

        }

        @objid ("00514596-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TopSmDependency extends SmSingleDependency {
            @objid ("efe60328-b5a3-47ca-bfbf-01725a1e6087")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateMachineData) data).mTop;
            }

            @objid ("eae9d3d3-c0b2-4e74-b268-8100532edc01")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateMachineData) data).mTop = value;
            }

            @objid ("c41301fe-9288-4ca7-ace5-169db8e56ae3")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.RepresentedDep();
            }

        }

        @objid ("0051bc92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubmachineStateSmDependency extends SmMultipleDependency {
            @objid ("ba23ee46-475e-4c58-8d8b-527aba842eeb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mSubmachineState != null)? ((StateMachineData)data).mSubmachineState:SmMultipleDependency.EMPTY;
            }

            @objid ("a1481ddf-d9cf-4a1d-b649-722da7430abe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mSubmachineState = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mSubmachineState;
            }

            @objid ("6ae04844-80d4-4d0c-9c96-dc53aa91ab96")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.SubMachineDep();
            }

        }

        @objid ("005221e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("b650e051-0dd3-4384-b871-197c20bb8b1f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mEntryPoint != null)? ((StateMachineData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("b3859702-6b9a-42d9-9810-1ca8809f35af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mEntryPoint;
            }

            @objid ("3fa99a16-787a-49f2-b746-f1be1129a018")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfMachineDep();
            }

        }

        @objid ("005285fa-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("bac59acd-1c68-4d00-8f47-bae7dc60961c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mExitPoint != null)? ((StateMachineData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("120483a4-3087-4344-8d08-7b372143b0e6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mExitPoint;
            }

            @objid ("89a1d7f7-c0ec-48b1-b841-6c3220eee1dc")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfMachineDep();
            }

        }

    }

}
