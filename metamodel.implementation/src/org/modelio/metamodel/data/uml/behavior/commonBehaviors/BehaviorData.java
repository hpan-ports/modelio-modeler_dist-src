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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.uml.behavior.activityModel.CallBehaviorActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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

@objid ("0040ed22-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Behavior.class, factory=BehaviorData.Metadata.ObjectFactory.class)
public abstract class BehaviorData extends ModelElementData {
    @objid ("03f95a7a-278c-41cd-aa9f-4aa2aeee25fd")
    @SmaMetaAttribute(metaName="IsReentrant", type=Boolean.class, smAttributeClass=Metadata.IsReentrantSmAttribute.class)
     Object mIsReentrant = false;

    @objid ("5c778be5-cd81-4682-838a-9ce89554a3fe")
    @SmaMetaAssociation(metaName="BpmnCaller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnCallerSmDependency.class)
     List<SmObjectImpl> mBpmnCaller = null;

    @objid ("6b610644-563e-48e1-9dd2-d7c938c8cc9f")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7c047c06-20fe-47b9-a101-ecd9f93ed027")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("4473ffcd-73a6-4a0d-86f6-5a88fd80b69c")
    @SmaMetaAssociation(metaName="OwnerOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OwnerOperationSmDependency.class)
     SmObjectImpl mOwnerOperation;

    @objid ("164f8c74-4c2b-41ba-86f6-a19d78753cf2")
    @SmaMetaAssociation(metaName="OwnedCollaboration", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaboration = null;

    @objid ("32296e23-4797-4ea4-9699-93aca560b79f")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=CallBehaviorActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("2ec469b7-556a-4078-96f7-0c736f42c71b")
    @SmaMetaAssociation(metaName="EComponent", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EComponentSmDependency.class, component = true)
     List<SmObjectImpl> mEComponent = null;

    @objid ("0aaadea1-5494-4f06-99e1-2cf62b8840c1")
    @SmaMetaAssociation(metaName="EffectOf", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.EffectOfSmDependency.class)
     List<SmObjectImpl> mEffectOf = null;

    @objid ("57ef0af2-7c75-4e3b-9349-e7ef310fa37b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002486a0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a8f59e16-c609-4499-8410-c39d08d56a59")
        private static SmClass smClass = null;

        @objid ("58c2ced8-bf11-4181-8893-65ba8115e9fd")
        private static SmAttribute IsReentrantAtt = null;

        @objid ("4e88906e-6649-4570-bb34-150bdb86267e")
        private static SmDependency BpmnCallerDep = null;

        @objid ("9fd5df85-d222-4a56-9790-71162829f184")
        private static SmDependency OwnerDep = null;

        @objid ("013f61ba-ee59-4fe9-8058-cdff3f98e560")
        private static SmDependency ParameterDep = null;

        @objid ("361ea140-11b9-45ba-9f1c-5730d1d28174")
        private static SmDependency OwnerOperationDep = null;

        @objid ("b3199628-b773-44ce-af79-2392242184f8")
        private static SmDependency OwnedCollaborationDep = null;

        @objid ("d0ddb099-00e7-4073-9fb3-1cdcea80a1ca")
        private static SmDependency CallerDep = null;

        @objid ("5c0fb0fa-de61-4bdc-bc4f-5625d1bb0ee4")
        private static SmDependency EComponentDep = null;

        @objid ("9c95b01b-cf2f-43a8-9235-2ca30fff7eba")
        private static SmDependency EffectOfDep = null;

        @objid ("1cfd50e0-3344-4a15-810b-6100a8db4514")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0b9453c4-c158-4b04-a009-0dc51db8a28f")
        public static SmAttribute IsReentrantAtt() {
            if (IsReentrantAtt == null) {
            	IsReentrantAtt = classof().getAttributeDef("IsReentrant");
            }
            return IsReentrantAtt;
        }

        @objid ("1383083c-107c-4132-b7dc-e88380af3bfb")
        public static SmDependency BpmnCallerDep() {
            if (BpmnCallerDep == null) {
            	BpmnCallerDep = classof().getDependencyDef("BpmnCaller");
            }
            return BpmnCallerDep;
        }

        @objid ("e635648d-0e3a-46eb-aae3-86134524261f")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("cae0a73a-4466-4659-a146-8dc4303a706a")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("2cb4db5a-0f65-4e79-8d17-4985e9ae9f58")
        public static SmDependency OwnerOperationDep() {
            if (OwnerOperationDep == null) {
            	OwnerOperationDep = classof().getDependencyDef("OwnerOperation");
            }
            return OwnerOperationDep;
        }

        @objid ("79c60683-c111-46db-ad9c-97ff34e84780")
        public static SmDependency OwnedCollaborationDep() {
            if (OwnedCollaborationDep == null) {
            	OwnedCollaborationDep = classof().getDependencyDef("OwnedCollaboration");
            }
            return OwnedCollaborationDep;
        }

        @objid ("59423777-6965-49cb-8ec0-afd953a0e202")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("de725add-740a-4908-9ac9-08d4d6bdfd7b")
        public static SmDependency EComponentDep() {
            if (EComponentDep == null) {
            	EComponentDep = classof().getDependencyDef("EComponent");
            }
            return EComponentDep;
        }

        @objid ("8fa41b2c-214a-43ef-b0a2-8185ea7b4ea8")
        public static SmDependency EffectOfDep() {
            if (EffectOfDep == null) {
            	EffectOfDep = classof().getDependencyDef("EffectOf");
            }
            return EffectOfDep;
        }

        @objid ("ec9b7d58-7daf-47a1-b604-1f859b13ec05")
        public static SmDependency getEComponentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EComponentDep;
        }

        @objid ("c130b479-6ade-48f6-be35-f578676fa190")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("46c66ff3-4f7e-4365-96a9-d77b1e919b79")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("3f6d8784-ebe0-4258-96ec-8cecdbf78489")
        public static SmDependency getBpmnCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnCallerDep;
        }

        @objid ("1b607174-5e75-45d2-b264-2bd61217c1c4")
        public static SmDependency getEffectOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectOfDep;
        }

        @objid ("3d78f824-8245-47c4-91af-38920eab0c09")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b749dd5f-aab4-40fd-acfe-19fe048130d5")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("67314bd1-823c-40ad-b551-65931edce156")
        public static SmDependency getOwnedCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationDep;
        }

        @objid ("ba0e5029-daf4-4b95-a6ec-63329daec705")
        public static SmDependency getOwnerOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerOperationDep;
        }

        @objid ("5933d011-9cf8-4fe0-a5c9-e53656b735d1")
        public static SmAttribute getIsReentrantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReentrantAtt;
        }

        @objid ("0024ce44-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f6ebe968-c5e1-4086-b850-42a6b099d693")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("dfb6582a-2d6c-4e98-b8d5-b16928ec138f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00253122-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsReentrantSmAttribute extends SmAttribute {
            @objid ("c17fc46c-def6-4511-a94c-3107b8a0fae2")
            public Object getValue(ISmObjectData data) {
                return ((BehaviorData) data).mIsReentrant;
            }

            @objid ("47fd73af-0e09-4724-9a42-88e671c199e6")
            public void setValue(ISmObjectData data, Object value) {
                ((BehaviorData) data).mIsReentrant = value;
            }

        }

        @objid ("00259680-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("5560635e-7822-46e1-a06c-d5b6c91d5f3c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwner;
            }

            @objid ("18936f45-532b-4dd0-8b75-ea27c6d02491")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwner = value;
            }

            @objid ("6e03f71e-7614-4844-a854-da37ffa0da5e")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00260ffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerOperationSmDependency extends SmSingleDependency {
            @objid ("b16be430-82a3-42a6-903c-1ece0af45878")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwnerOperation;
            }

            @objid ("9263a3bf-3075-4f7a-9b74-da96ebeb733c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwnerOperation = value;
            }

            @objid ("61c5c902-3c3d-482a-9ef5-51eed96e8147")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00268838-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("70309f0b-fa3e-4274-bf16-4eca2dddc408")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mCaller != null)? ((BehaviorData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("978c35aa-5ab1-4c63-8356-40b61ee55b45")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mCaller;
            }

            @objid ("00d4a491-5b75-481b-b65d-be875283be46")
            @Override
            public SmDependency getSymetric() {
                return CallBehaviorActionData.Metadata.CalledDep();
            }

        }

        @objid ("0026ecec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectOfSmDependency extends SmMultipleDependency {
            @objid ("03cf607d-3649-40df-a13a-5025980ea73c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEffectOf != null)? ((BehaviorData)data).mEffectOf:SmMultipleDependency.EMPTY;
            }

            @objid ("5e97d974-b772-43cb-88ed-149b64f06c48")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEffectOf = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEffectOf;
            }

            @objid ("6a9cbcc1-35e4-4858-a2b6-9ae842c6a13c")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.BehaviorEffectDep();
            }

        }

        @objid ("00275934-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("5d3ba701-66f3-4139-bab5-b6f984fe52c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mParameter != null)? ((BehaviorData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("ad52c5ae-4171-40a9-b5cd-a6a4e086ba79")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mParameter;
            }

            @objid ("f8ad2607-2a79-4016-8374-3888b54b9995")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0027c086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EComponentSmDependency extends SmMultipleDependency {
            @objid ("c4189099-a7c8-482e-909e-1b76b3a302c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEComponent != null)? ((BehaviorData)data).mEComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("89e066e1-89d1-481c-9567-91507bcad2ed")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEComponent = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEComponent;
            }

            @objid ("0afc46e9-fcc3-4164-bb3e-c097d2033f32")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ComposedDep();
            }

        }

        @objid ("002827d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationSmDependency extends SmMultipleDependency {
            @objid ("e5ecc60a-1448-4183-9b06-185afd1ed032")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mOwnedCollaboration != null)? ((BehaviorData)data).mOwnedCollaboration:SmMultipleDependency.EMPTY;
            }

            @objid ("4eac6849-1e3d-495f-a948-878eb1ac0ff7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mOwnedCollaboration = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mOwnedCollaboration;
            }

            @objid ("79f04e78-f87e-4c07-bb19-51c2596fefd0")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.BRepresentedDep();
            }

        }

        @objid ("0028952e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnCallerSmDependency extends SmMultipleDependency {
            @objid ("4a2af71c-7000-4669-8b25-398d6426f680")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mBpmnCaller != null)? ((BehaviorData)data).mBpmnCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("70a5e22e-0710-43f1-95f7-89c8154c7d70")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mBpmnCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mBpmnCaller;
            }

            @objid ("4a56682d-2851-499d-bf7b-090e7e7f58e9")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledBehaviorDep();
            }

        }

    }

}
