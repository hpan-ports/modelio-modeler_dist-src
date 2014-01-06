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
    @objid ("47d36bc1-5094-44a1-b262-16ff2336357a")
    @SmaMetaAttribute(metaName="IsReentrant", type=Boolean.class, smAttributeClass=Metadata.IsReentrantSmAttribute.class)
     Object mIsReentrant = false;

    @objid ("2c591966-4284-40f7-9a42-0696c4953d09")
    @SmaMetaAssociation(metaName="BpmnCaller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnCallerSmDependency.class)
     List<SmObjectImpl> mBpmnCaller = null;

    @objid ("f7021482-302b-4506-a4b7-2a04479e811c")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f55562fc-965e-43ce-9412-417ea63a9f7a")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("944199f9-4e92-464e-85c5-dd6839030353")
    @SmaMetaAssociation(metaName="OwnerOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OwnerOperationSmDependency.class)
     SmObjectImpl mOwnerOperation;

    @objid ("cb546995-351c-4ed7-b6ab-5cccb8607a67")
    @SmaMetaAssociation(metaName="OwnedCollaboration", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaboration = null;

    @objid ("786521e6-ef2b-419d-a4a7-e0c98c71333b")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=CallBehaviorActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("34aab3a1-6407-4cbd-8942-1fc8140731f3")
    @SmaMetaAssociation(metaName="EComponent", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EComponentSmDependency.class, component = true)
     List<SmObjectImpl> mEComponent = null;

    @objid ("4d187f5f-37fd-4718-919c-1bd41db6f981")
    @SmaMetaAssociation(metaName="EffectOf", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.EffectOfSmDependency.class)
     List<SmObjectImpl> mEffectOf = null;

    @objid ("9eac9ea2-afa4-4331-8a69-cc38de019c06")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002486a0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5ae786fa-168a-4896-b999-866cae67cfb5")
        private static SmClass smClass = null;

        @objid ("14523786-de07-4575-ada2-3532d36bb7a1")
        private static SmAttribute IsReentrantAtt = null;

        @objid ("0a0b7528-c86e-417e-9451-d62bda63e235")
        private static SmDependency BpmnCallerDep = null;

        @objid ("a9ec5656-9385-4a53-8dcb-abe51b4c13db")
        private static SmDependency OwnerDep = null;

        @objid ("2a1135d5-40ed-4014-b80a-7f9299bed176")
        private static SmDependency ParameterDep = null;

        @objid ("18caac4a-70aa-4eaa-94b1-4734197f73fe")
        private static SmDependency OwnerOperationDep = null;

        @objid ("230024f6-1fdc-4432-b956-70d9f8f40985")
        private static SmDependency OwnedCollaborationDep = null;

        @objid ("2618826f-26e1-46f6-8037-7249119a925a")
        private static SmDependency CallerDep = null;

        @objid ("397be05d-782c-45e5-a396-9a73f435f202")
        private static SmDependency EComponentDep = null;

        @objid ("ffc53157-3766-4be9-8953-334d196b777e")
        private static SmDependency EffectOfDep = null;

        @objid ("9a68f750-d34d-4cd6-98a1-c64b1c6713f3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b3db5767-e2c8-4f72-a4e7-ec8ec63ce35c")
        public static SmAttribute IsReentrantAtt() {
            if (IsReentrantAtt == null) {
            	IsReentrantAtt = classof().getAttributeDef("IsReentrant");
            }
            return IsReentrantAtt;
        }

        @objid ("81e5e1e0-cb61-4305-8af5-3d0c9e80778c")
        public static SmDependency BpmnCallerDep() {
            if (BpmnCallerDep == null) {
            	BpmnCallerDep = classof().getDependencyDef("BpmnCaller");
            }
            return BpmnCallerDep;
        }

        @objid ("2be70bcb-fd49-44e2-88da-c3171671806c")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("7faf619c-d678-4b4c-a44f-4232db4ead24")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("367d7e8d-032f-466d-98a8-7c64b40f1bf7")
        public static SmDependency OwnerOperationDep() {
            if (OwnerOperationDep == null) {
            	OwnerOperationDep = classof().getDependencyDef("OwnerOperation");
            }
            return OwnerOperationDep;
        }

        @objid ("31a54330-5820-4844-aeab-9dc72c1039ca")
        public static SmDependency OwnedCollaborationDep() {
            if (OwnedCollaborationDep == null) {
            	OwnedCollaborationDep = classof().getDependencyDef("OwnedCollaboration");
            }
            return OwnedCollaborationDep;
        }

        @objid ("f69f5f90-7297-46a3-b493-164bbfe80ed7")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("097635e2-5574-4d97-bbf5-bb763127584f")
        public static SmDependency EComponentDep() {
            if (EComponentDep == null) {
            	EComponentDep = classof().getDependencyDef("EComponent");
            }
            return EComponentDep;
        }

        @objid ("50a2b9e1-a823-4259-ada4-a187277a39db")
        public static SmDependency EffectOfDep() {
            if (EffectOfDep == null) {
            	EffectOfDep = classof().getDependencyDef("EffectOf");
            }
            return EffectOfDep;
        }

        @objid ("641cff63-adff-4a8d-a4e3-334a68dab834")
        public static SmDependency getEComponentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EComponentDep;
        }

        @objid ("9ba10f90-c3f5-4418-bb7e-c7261abfb48a")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("7904dce4-e0b4-48a0-938f-12fa9b25a865")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0a5c358d-1d1a-4e2a-bc56-b536bc24d6ec")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("26209fe1-0884-4df9-a0f5-5e050ae826e4")
        public static SmDependency getBpmnCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnCallerDep;
        }

        @objid ("51d7a57a-c5e5-4329-bd67-9a86c8a62056")
        public static SmDependency getEffectOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectOfDep;
        }

        @objid ("312a9c9f-d0a3-4299-a3a5-0674c9c53a96")
        public static SmDependency getOwnedCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationDep;
        }

        @objid ("70b44df1-72f1-4a9d-861e-6ead89a1b71a")
        public static SmDependency getOwnerOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerOperationDep;
        }

        @objid ("37074fcb-e4f3-465c-afdc-38c49e06bbfc")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e3db05cc-4675-4b1b-a216-400fe600ce11")
        public static SmAttribute getIsReentrantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReentrantAtt;
        }

        @objid ("0024ce44-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("05d9ebb1-d7bf-4b0a-9e43-c85e1abe7cad")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a15d0c2f-5a9b-4a30-8d29-e92e2887850b")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00253122-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsReentrantSmAttribute extends SmAttribute {
            @objid ("2e873cd1-6871-480d-aa41-61d11eaeac98")
            public Object getValue(ISmObjectData data) {
                return ((BehaviorData) data).mIsReentrant;
            }

            @objid ("b6ffd098-84bf-45d4-b1a1-85337682bc20")
            public void setValue(ISmObjectData data, Object value) {
                ((BehaviorData) data).mIsReentrant = value;
            }

        }

        @objid ("00259680-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("874e31dd-749b-4f6b-ba8e-6150c3603efc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwner;
            }

            @objid ("8668e3fe-048c-4b4c-9ee1-d40e1e02c0cb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwner = value;
            }

            @objid ("de788b7e-7d76-4de7-8f6a-5bc2bd575980")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00260ffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerOperationSmDependency extends SmSingleDependency {
            @objid ("a5f4939c-cfb5-4d80-8506-39496c163460")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwnerOperation;
            }

            @objid ("9d5f3d85-0e61-446a-9fff-59691d7535d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwnerOperation = value;
            }

            @objid ("e50f9c96-97af-4d4d-9a89-97c5d7237599")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00268838-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("6253de51-0594-406b-97f0-bda6c9ca5fca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mCaller != null)? ((BehaviorData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("31e3fefb-dc3a-4b98-826a-c439a943b8e8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mCaller;
            }

            @objid ("ae8b2f6f-cf42-47a9-811e-af4395d4076e")
            @Override
            public SmDependency getSymetric() {
                return CallBehaviorActionData.Metadata.CalledDep();
            }

        }

        @objid ("0026ecec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectOfSmDependency extends SmMultipleDependency {
            @objid ("fee2db65-662c-417d-a20e-45adba298507")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEffectOf != null)? ((BehaviorData)data).mEffectOf:SmMultipleDependency.EMPTY;
            }

            @objid ("81c8befa-b62c-45ad-a629-444d39e2410f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEffectOf = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEffectOf;
            }

            @objid ("8b53cd98-b9f7-4594-a0c3-0474c4e46260")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.BehaviorEffectDep();
            }

        }

        @objid ("00275934-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("aea55972-f0f1-431d-bcfa-b26b2d6e0d2e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mParameter != null)? ((BehaviorData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("0be9a400-b753-4033-9d42-d8bfa49dffc1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mParameter;
            }

            @objid ("46bc5ce8-5e62-4b07-92b7-acd8edc7530c")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0027c086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EComponentSmDependency extends SmMultipleDependency {
            @objid ("f0c30795-99d8-474a-8ed2-f5eb22d862a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEComponent != null)? ((BehaviorData)data).mEComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("abe34241-796e-4cf6-a003-bc737f056638")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEComponent = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEComponent;
            }

            @objid ("1f5e0e74-68fb-459e-9d91-e90849fc664d")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ComposedDep();
            }

        }

        @objid ("002827d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationSmDependency extends SmMultipleDependency {
            @objid ("c38fa308-3900-4ef9-a834-625bb28049be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mOwnedCollaboration != null)? ((BehaviorData)data).mOwnedCollaboration:SmMultipleDependency.EMPTY;
            }

            @objid ("8d31c6cd-4859-4a92-bb2d-ed0f7bb378af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mOwnedCollaboration = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mOwnedCollaboration;
            }

            @objid ("1076bbcc-390a-47a1-a450-fd9f17979703")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.BRepresentedDep();
            }

        }

        @objid ("0028952e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnCallerSmDependency extends SmMultipleDependency {
            @objid ("c2d5b9cc-6f76-4742-bf7b-5fc7da78a29b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mBpmnCaller != null)? ((BehaviorData)data).mBpmnCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("f3ccdc0e-2d6b-4aec-9c77-c258feb2aff1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mBpmnCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mBpmnCaller;
            }

            @objid ("167beded-5394-410c-a10f-27f7a36daa08")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledBehaviorDep();
            }

        }

    }

}
