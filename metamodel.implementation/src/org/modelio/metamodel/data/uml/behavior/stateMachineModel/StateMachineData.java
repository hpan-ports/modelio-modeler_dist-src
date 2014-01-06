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
    @objid ("466df0d3-1017-40fc-8138-c447e7d108cb")
    @SmaMetaAttribute(metaName="Kind", type=KindOfStateMachine.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = KindOfStateMachine.DYNAMIC;

    @objid ("72bb74e0-9ffd-4231-afeb-c68dc5914eee")
    @SmaMetaAssociation(metaName="Top", typeDataClass=RegionData.class, min=1, max=1, smAssociationClass=Metadata.TopSmDependency.class, component = true)
     SmObjectImpl mTop;

    @objid ("a66aed7e-0359-4f2a-a6b9-cbea102b8a7d")
    @SmaMetaAssociation(metaName="SubmachineState", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.SubmachineStateSmDependency.class)
     List<SmObjectImpl> mSubmachineState = null;

    @objid ("363407aa-c7e4-44d3-9cc6-5668083ed70d")
    @SmaMetaAssociation(metaName="EntryPoint", typeDataClass=EntryPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointSmDependency.class, component = true)
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("be90d522-e91e-479c-829b-f6fe4851c11b")
    @SmaMetaAssociation(metaName="ExitPoint", typeDataClass=ExitPointPseudoStateData.class, min=0, max=-1, smAssociationClass=Metadata.ExitPointSmDependency.class, component = true)
     List<SmObjectImpl> mExitPoint = null;

    @objid ("e1262e63-26b8-4bea-b3f4-ca2bc8ff82c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0050353e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("69802c48-434e-467d-b987-53825180ae14")
        private static SmClass smClass = null;

        @objid ("772681ff-0642-43ed-a112-8dbefe56b3e1")
        private static SmAttribute KindAtt = null;

        @objid ("620bbc9c-a2d3-4ae4-a14a-5391e745e386")
        private static SmDependency TopDep = null;

        @objid ("ff0002bd-84cb-47af-8ade-6ed2ddc9f818")
        private static SmDependency SubmachineStateDep = null;

        @objid ("80772a96-97a8-4b2f-ba77-00c4bc5f9042")
        private static SmDependency EntryPointDep = null;

        @objid ("b17d2167-bcc8-4b4e-9ec6-23ec66c2aaf2")
        private static SmDependency ExitPointDep = null;

        @objid ("811211b2-bee3-41ea-8e30-2a89182de873")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StateMachineData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d00de56f-360a-4472-b5c7-6a8820c3dc68")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("23ff8759-7caf-4fc2-98aa-12f2dce73e5b")
        public static SmDependency TopDep() {
            if (TopDep == null) {
            	TopDep = classof().getDependencyDef("Top");
            }
            return TopDep;
        }

        @objid ("0076505a-2d0f-403a-9ad4-f9ccf0d2cf92")
        public static SmDependency SubmachineStateDep() {
            if (SubmachineStateDep == null) {
            	SubmachineStateDep = classof().getDependencyDef("SubmachineState");
            }
            return SubmachineStateDep;
        }

        @objid ("a0cb6d36-b1f3-4bef-8b6a-9c4c895793ec")
        public static SmDependency EntryPointDep() {
            if (EntryPointDep == null) {
            	EntryPointDep = classof().getDependencyDef("EntryPoint");
            }
            return EntryPointDep;
        }

        @objid ("2760f11f-d584-4d8f-8856-13fa74a787b5")
        public static SmDependency ExitPointDep() {
            if (ExitPointDep == null) {
            	ExitPointDep = classof().getDependencyDef("ExitPoint");
            }
            return ExitPointDep;
        }

        @objid ("255da733-2919-49cc-a53d-0e631eef6bb6")
        public static SmDependency getExitPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitPointDep;
        }

        @objid ("3c46aeb9-6efe-4365-b5d6-2c21a52375f2")
        public static SmDependency getSubmachineStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubmachineStateDep;
        }

        @objid ("828e3f1e-a412-48be-ad09-50a9f34a07c7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("36751670-bfa6-4d9a-84cc-7ca3525da844")
        public static SmDependency getEntryPointDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointDep;
        }

        @objid ("199e7683-2e05-4af7-8087-1bef948b6123")
        public static SmDependency getTopDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TopDep;
        }

        @objid ("736a7702-be5c-465f-b9ac-e670a3e5f88c")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("005075ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e8b28458-5cad-4b7e-9e7c-48bc0628e92d")
            public ISmObjectData createData() {
                return new StateMachineData();
            }

            @objid ("0a5aadcd-7efa-4e2c-87a9-e30c82bf513f")
            public SmObjectImpl createImpl() {
                return new StateMachineImpl();
            }

        }

        @objid ("0050e0d8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("40329b3a-c8c1-4615-bb07-df5b7f2d370e")
            public Object getValue(ISmObjectData data) {
                return ((StateMachineData) data).mKind;
            }

            @objid ("d35c81e7-ac4b-4577-aefb-30224e0ce793")
            public void setValue(ISmObjectData data, Object value) {
                ((StateMachineData) data).mKind = value;
            }

        }

        @objid ("00514596-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TopSmDependency extends SmSingleDependency {
            @objid ("197faf76-17af-423d-b63e-20cf238fe2d8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StateMachineData) data).mTop;
            }

            @objid ("f5b3be19-d087-4856-b623-2e607297fb70")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StateMachineData) data).mTop = value;
            }

            @objid ("e6c06a56-28af-4124-b713-c02e62f7acc4")
            @Override
            public SmDependency getSymetric() {
                return RegionData.Metadata.RepresentedDep();
            }

        }

        @objid ("0051bc92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubmachineStateSmDependency extends SmMultipleDependency {
            @objid ("9ae5242e-aee5-4a2c-b8d9-8d2e7674dc2e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mSubmachineState != null)? ((StateMachineData)data).mSubmachineState:SmMultipleDependency.EMPTY;
            }

            @objid ("7bc14329-75e1-488a-a237-3d3daf766cc1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mSubmachineState = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mSubmachineState;
            }

            @objid ("2efc1a89-8155-43c6-a865-e4d6ccb59b9a")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.SubMachineDep();
            }

        }

        @objid ("005221e6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointSmDependency extends SmMultipleDependency {
            @objid ("e7e5edba-f5ae-45ba-ad4a-24e7f4394b6b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mEntryPoint != null)? ((StateMachineData)data).mEntryPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("12af8142-0f33-41ee-88e7-73957dbd4652")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mEntryPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mEntryPoint;
            }

            @objid ("c7b1b05c-68ae-4f05-aef3-f8b2b5979990")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.EntryOfMachineDep();
            }

        }

        @objid ("005285fa-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitPointSmDependency extends SmMultipleDependency {
            @objid ("fab2c478-5087-43d0-9592-31a2f7dcfd60")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StateMachineData)data).mExitPoint != null)? ((StateMachineData)data).mExitPoint:SmMultipleDependency.EMPTY;
            }

            @objid ("2f77bfa2-138e-4598-8b9a-15370db11d32")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StateMachineData) data).mExitPoint = new ArrayList<>(initialCapacity);
                return ((StateMachineData) data).mExitPoint;
            }

            @objid ("12b8e6e1-5e75-4584-b534-ee270f81885d")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ExitOfMachineDep();
            }

        }

    }

}
