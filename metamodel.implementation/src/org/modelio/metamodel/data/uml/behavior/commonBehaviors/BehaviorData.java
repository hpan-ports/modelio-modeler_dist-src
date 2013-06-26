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
    @objid ("26d452c2-a081-4a1e-a245-0db2adcb6f95")
    @SmaMetaAttribute(metaName="IsReentrant", type=Boolean.class, smAttributeClass=Metadata.IsReentrantSmAttribute.class)
     Object mIsReentrant = false;

    @objid ("3fb9779d-0708-4350-b366-7ad41931ece6")
    @SmaMetaAssociation(metaName="BpmnCaller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnCallerSmDependency.class)
     List<SmObjectImpl> mBpmnCaller = null;

    @objid ("7893c873-4d9c-4e3d-be01-613aaf956463")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("97c814ad-0f91-45d0-b7a1-d1d2c26379fb")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("db3cf0d7-403e-4c1e-9765-365ba44aeb60")
    @SmaMetaAssociation(metaName="OwnerOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OwnerOperationSmDependency.class)
     SmObjectImpl mOwnerOperation;

    @objid ("497b4531-e9a1-4135-896a-772dc67bfcec")
    @SmaMetaAssociation(metaName="OwnedCollaboration", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaboration = null;

    @objid ("2eba3c36-1e83-4705-a003-83379b4ce673")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=CallBehaviorActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("9837c51d-fbe5-4967-bfb4-9f638c85fbcb")
    @SmaMetaAssociation(metaName="EComponent", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EComponentSmDependency.class, component = true)
     List<SmObjectImpl> mEComponent = null;

    @objid ("6167a511-c8c6-4a46-8739-1e3b0094a4e1")
    @SmaMetaAssociation(metaName="EffectOf", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.EffectOfSmDependency.class)
     List<SmObjectImpl> mEffectOf = null;

    @objid ("ec66fbb4-0d41-4dab-92a7-d73703fcd823")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002486a0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ae4f3708-0015-4b11-b87b-c080b468b4d9")
        private static SmClass smClass = null;

        @objid ("2d2a5e21-1570-4615-84d6-2882689dd760")
        private static SmAttribute IsReentrantAtt = null;

        @objid ("11306050-4489-42f2-86de-3d43ef4465ea")
        private static SmDependency BpmnCallerDep = null;

        @objid ("54158800-24d5-4caf-93a5-b2b3b5174090")
        private static SmDependency OwnerDep = null;

        @objid ("0d59098d-ab55-4337-a1ff-a8b939d8dabe")
        private static SmDependency ParameterDep = null;

        @objid ("15b54d77-e481-464b-afd1-e321920c4454")
        private static SmDependency OwnerOperationDep = null;

        @objid ("3ca7073a-7582-4b26-88a9-6ec72e9cc423")
        private static SmDependency OwnedCollaborationDep = null;

        @objid ("1cded606-9ddc-403f-955d-dc967682b4a5")
        private static SmDependency CallerDep = null;

        @objid ("25491f76-902c-4684-a53c-4b227b69b1e0")
        private static SmDependency EComponentDep = null;

        @objid ("39569fa1-7a8d-46a0-b207-dfdfd11ad1f1")
        private static SmDependency EffectOfDep = null;

        @objid ("62477e14-de25-46f7-93ff-a2d019b1d61a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("881b4a9e-814c-47b2-b109-26b74fc3871b")
        public static SmAttribute IsReentrantAtt() {
            if (IsReentrantAtt == null) {
            	IsReentrantAtt = classof().getAttributeDef("IsReentrant");
            }
            return IsReentrantAtt;
        }

        @objid ("a0c6c05b-1d97-45fa-86e9-44428437c833")
        public static SmDependency BpmnCallerDep() {
            if (BpmnCallerDep == null) {
            	BpmnCallerDep = classof().getDependencyDef("BpmnCaller");
            }
            return BpmnCallerDep;
        }

        @objid ("1bde3a14-c1bf-41e1-a200-adae517947c8")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("ff16f14b-3057-43c6-a3b3-4ee325525da6")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("24547c5d-5ac8-44c2-84a7-eb309700fa8c")
        public static SmDependency OwnerOperationDep() {
            if (OwnerOperationDep == null) {
            	OwnerOperationDep = classof().getDependencyDef("OwnerOperation");
            }
            return OwnerOperationDep;
        }

        @objid ("85af57ab-5b77-4959-90f0-12513c8b301e")
        public static SmDependency OwnedCollaborationDep() {
            if (OwnedCollaborationDep == null) {
            	OwnedCollaborationDep = classof().getDependencyDef("OwnedCollaboration");
            }
            return OwnedCollaborationDep;
        }

        @objid ("4421f88b-1211-4ff8-b027-ecdf17746c53")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("6f2926d6-469d-4c87-ac66-93e37de525b2")
        public static SmDependency EComponentDep() {
            if (EComponentDep == null) {
            	EComponentDep = classof().getDependencyDef("EComponent");
            }
            return EComponentDep;
        }

        @objid ("6294f1c7-7000-4a03-83bb-d7db66964131")
        public static SmDependency EffectOfDep() {
            if (EffectOfDep == null) {
            	EffectOfDep = classof().getDependencyDef("EffectOf");
            }
            return EffectOfDep;
        }

        @objid ("4ac4a51f-cab5-4cf1-9aac-e786c84953c9")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("0de18a80-c0ac-424b-b08d-3729fa8be921")
        public static SmDependency getEComponentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EComponentDep;
        }

        @objid ("1cd16726-4c3d-4b5d-b5ee-a34c921a38cf")
        public static SmDependency getEffectOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectOfDep;
        }

        @objid ("9e7cafd3-c392-4495-86e3-d753d786219a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("52d694ed-8594-4611-85ba-1de875daca6f")
        public static SmDependency getOwnedCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationDep;
        }

        @objid ("5023f925-4b5c-4753-91b9-a07879cf1e99")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("b60b8bc4-2a4f-4b46-90d6-b6cdefda72c6")
        public static SmDependency getOwnerOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerOperationDep;
        }

        @objid ("10f0a832-b847-4aa8-ab1c-e46724d10308")
        public static SmAttribute getIsReentrantAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsReentrantAtt;
        }

        @objid ("6cc074a0-932d-4aa9-bc61-b752139f6df0")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("d170fedc-ae19-4bec-876a-49407b0b29b1")
        public static SmDependency getBpmnCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnCallerDep;
        }

        @objid ("0024ce44-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90515065-2d06-47e0-86b0-2dbd909f3dd5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("3969d28b-da3b-4e02-a96e-5f1e27d16ef1")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00253122-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsReentrantSmAttribute extends SmAttribute {
            @objid ("77836255-01fe-4f8c-9ad7-6bf9123eb341")
            public Object getValue(ISmObjectData data) {
                return ((BehaviorData) data).mIsReentrant;
            }

            @objid ("aef9c37d-2bba-4685-99ac-231a438c5d43")
            public void setValue(ISmObjectData data, Object value) {
                ((BehaviorData) data).mIsReentrant = value;
            }

        }

        @objid ("00259680-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("aa9e6d6b-b225-4376-aff8-ec28f3590226")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwner;
            }

            @objid ("17e70107-b00b-4bf4-8527-cb31936a05d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwner = value;
            }

            @objid ("65a831c1-8aa7-4e87-bccc-c12f216ed4b7")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00260ffc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerOperationSmDependency extends SmSingleDependency {
            @objid ("bc9af305-0d39-4b2a-817c-3122a0c1118f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BehaviorData) data).mOwnerOperation;
            }

            @objid ("0fb0796d-cb8a-4258-9dee-6a3a6c2999a4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BehaviorData) data).mOwnerOperation = value;
            }

            @objid ("c7190e5b-358a-49b2-8e8f-7e34d03900ce")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedBehaviorDep();
            }

        }

        @objid ("00268838-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("9f155893-9d00-434e-aad7-f55176e9bf3e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mCaller != null)? ((BehaviorData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("8ccb2ccd-0090-4611-b2af-89bd1e8a0889")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mCaller;
            }

            @objid ("6b8d8923-2a24-423e-9152-305893671c9e")
            @Override
            public SmDependency getSymetric() {
                return CallBehaviorActionData.Metadata.CalledDep();
            }

        }

        @objid ("0026ecec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectOfSmDependency extends SmMultipleDependency {
            @objid ("b756b0f0-094d-4e8e-be94-bae5d44c081f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEffectOf != null)? ((BehaviorData)data).mEffectOf:SmMultipleDependency.EMPTY;
            }

            @objid ("8e59a21f-cf68-424b-9cf1-1a963137c404")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEffectOf = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEffectOf;
            }

            @objid ("c128bbeb-6558-4dd8-b162-77becf77bd0f")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.BehaviorEffectDep();
            }

        }

        @objid ("00275934-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("d299669d-388d-4fb2-a737-ae49ebffbcac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mParameter != null)? ((BehaviorData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("794105c2-b698-4fee-8cd9-210ffd868cce")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mParameter;
            }

            @objid ("06539f98-4d1e-42ec-8b24-d227c0841d2e")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0027c086-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EComponentSmDependency extends SmMultipleDependency {
            @objid ("65d9a3c6-fab3-45fd-bdbe-77dc4d0e4e6f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mEComponent != null)? ((BehaviorData)data).mEComponent:SmMultipleDependency.EMPTY;
            }

            @objid ("95a098ff-310b-405e-b78b-dfa32164a7e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mEComponent = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mEComponent;
            }

            @objid ("063c119d-dd5f-48e9-9522-d1010a982839")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ComposedDep();
            }

        }

        @objid ("002827d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationSmDependency extends SmMultipleDependency {
            @objid ("e69183c9-8bdd-49b7-a738-60ed6778c098")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mOwnedCollaboration != null)? ((BehaviorData)data).mOwnedCollaboration:SmMultipleDependency.EMPTY;
            }

            @objid ("418e3f23-bf9d-434a-9ead-09919d4eeb55")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mOwnedCollaboration = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mOwnedCollaboration;
            }

            @objid ("81fbda0a-944a-424b-a542-5ce349aaecc6")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.BRepresentedDep();
            }

        }

        @objid ("0028952e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnCallerSmDependency extends SmMultipleDependency {
            @objid ("74562d02-50fb-4544-9610-ce23627f91d6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BehaviorData)data).mBpmnCaller != null)? ((BehaviorData)data).mBpmnCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("74d7c842-4211-492a-8c1e-e0c42261dd40")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BehaviorData) data).mBpmnCaller = new ArrayList<>(initialCapacity);
                return ((BehaviorData) data).mBpmnCaller;
            }

            @objid ("c72b564c-87aa-4c52-95bb-35d4fb776e99")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledBehaviorDep();
            }

        }

    }

}
