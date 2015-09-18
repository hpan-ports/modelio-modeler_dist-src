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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
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

@objid ("0042dd58-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Event.class, factory=EventData.Metadata.ObjectFactory.class)
public class EventData extends ModelElementData {
    @objid ("caba5c56-0304-4567-8074-180c3b9880ba")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("bbc7d093-a7ac-40e8-a065-d6bb1d764bf4")
    @SmaMetaAttribute(metaName="Kind", type=EventType.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = EventType.SIGNALEVENT;

    @objid ("97ba4e6b-a85a-4a00-a1ce-83e217370f70")
    @SmaMetaAssociation(metaName="Triggered", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.TriggeredSmDependency.class)
     List<SmObjectImpl> mTriggered = null;

    @objid ("afed4507-8a7d-4ad8-82db-b542977e228b")
    @SmaMetaAssociation(metaName="Model", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("f4f254f9-3fde-4f45-b320-2ef6c0ee96e7")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.OriginSmDependency.class)
     List<SmObjectImpl> mOrigin = null;

    @objid ("836d4dec-7d54-4bb9-baa8-2e280388c9b2")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("a55e2432-545f-43fd-b107-16d8ef044779")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("91751bb8-9063-451f-8ed9-eb77d1c85702")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00357d16-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c4ad814c-1b27-4277-bcee-821bd0bf71fe")
        private static SmClass smClass = null;

        @objid ("c5591676-4a2d-4072-83b5-16b03bcc095b")
        private static SmAttribute ExpressionAtt = null;

        @objid ("13a821d9-33b2-47dd-8889-53683c457b82")
        private static SmAttribute KindAtt = null;

        @objid ("6bf585b0-9566-4180-b775-6b77520bf95a")
        private static SmDependency TriggeredDep = null;

        @objid ("52b6e5ac-2717-4d2f-ada0-3e05cea75bc0")
        private static SmDependency ModelDep = null;

        @objid ("324dc19b-f8fe-42cf-ae96-55913e3e4ac5")
        private static SmDependency OriginDep = null;

        @objid ("a0bedba9-77c8-435d-9888-ef30a32fe8b7")
        private static SmDependency CalledDep = null;

        @objid ("0b868781-f559-46cf-8786-4f174b42763b")
        private static SmDependency ComposedDep = null;

        @objid ("3c47a20b-5efe-46f6-af7a-89e7f2d77211")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b2880fe-2438-4fec-89f5-971a27c7d9a2")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("a3ff43d6-82e1-4cc1-98a0-b2d950960540")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("df255458-f741-47a7-88c3-4e81deb36bc2")
        public static SmDependency TriggeredDep() {
            if (TriggeredDep == null) {
            	TriggeredDep = classof().getDependencyDef("Triggered");
            }
            return TriggeredDep;
        }

        @objid ("fe129a55-e76d-4ddf-94f1-a7e46772de99")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("d3ea098e-562e-48ba-a48d-26878345acb9")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("8bc50830-b297-48a7-be81-6bcb3242b818")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("5160734e-bb02-4b95-8d7c-9143e4ac9ae6")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("f256884e-54aa-454b-ad05-4f4e49b6fc9e")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("da9697cb-619d-40c3-b7b3-2ee6c82282ac")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("593b42bf-e604-4b46-80a5-0de530f3b92b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b48e7574-100d-41f3-8f0e-7422debaa56e")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("b96a63ad-c9d8-4264-8d3c-dab409a3e290")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("9969a48e-8f5a-4563-ba16-b12fbfd518d4")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("458294fa-296b-47c5-9a66-06d0d4dcc975")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("b2471e1a-3406-4718-84cc-9c0d5241706f")
        public static SmDependency getTriggeredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredDep;
        }

        @objid ("0035bf06-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fc6f3746-fe28-4087-91cb-454d439d4fb1")
            public ISmObjectData createData() {
                return new EventData();
            }

            @objid ("90a899b5-d32a-4406-9d6e-496cf1c296d4")
            public SmObjectImpl createImpl() {
                return new EventImpl();
            }

        }

        @objid ("00362338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("010eb45f-42bb-44ff-a0bf-c55735cf7004")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mExpression;
            }

            @objid ("5fef050c-5d59-434d-b3b9-20640e6220b5")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mExpression = value;
            }

        }

        @objid ("003684ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("262c3588-5d32-4a22-9432-a047c5d9563f")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mKind;
            }

            @objid ("26c16ba7-8ca0-4ca1-943c-2e1bf270fb4c")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mKind = value;
            }

        }

        @objid ("0036e750-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("6c70b722-114a-4c4a-9ee8-b1fc4b8f1d92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mCalled;
            }

            @objid ("13c27df8-7e0b-4033-b23e-872565548cbb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mCalled = value;
            }

            @objid ("46a4c360-a9b1-4054-9795-57529b1e2ce5")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00375ce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("d93ea8ac-0744-4690-9cb6-d4d519b8ab41")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mComposed;
            }

            @objid ("f8af4e78-6406-40c0-9179-8ce1c803149c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mComposed = value;
            }

            @objid ("b64f4400-9872-4538-82c1-3ede70508e28")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EComponentDep();
            }

        }

        @objid ("0037d23c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("c5c37b73-71d5-40b4-9ab4-7ecba24fab1d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mModel;
            }

            @objid ("15166a74-d7d2-4fac-a94d-1df4469f99d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mModel = value;
            }

            @objid ("46e8d93d-9129-43b7-a5ef-208c04be3836")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.EOccurenceDep();
            }

        }

        @objid ("003848d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmMultipleDependency {
            @objid ("1e5778ab-b269-4446-95b9-acae4c950943")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mOrigin != null)? ((EventData)data).mOrigin:SmMultipleDependency.EMPTY;
            }

            @objid ("071437b6-0b08-46f7-957b-91664e6ba57b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mOrigin = new ArrayList<>(initialCapacity);
                return ((EventData) data).mOrigin;
            }

            @objid ("c0ff980d-f8ab-4039-813b-f37ad677a252")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.DefferedDep();
            }

        }

        @objid ("0038ad74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TriggeredSmDependency extends SmMultipleDependency {
            @objid ("20e06247-1778-42bb-a67e-1db3dcf0428c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mTriggered != null)? ((EventData)data).mTriggered:SmMultipleDependency.EMPTY;
            }

            @objid ("ad4522d3-d3b5-4d22-93a8-1c4a5fbda719")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mTriggered = new ArrayList<>(initialCapacity);
                return ((EventData) data).mTriggered;
            }

            @objid ("6a28476e-5192-4181-8a7f-115cc2e5b449")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TriggerDep();
            }

        }

    }

}
