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
    @objid ("ad001b68-1075-4d6e-b973-a4c188229f12")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("2367f551-5a07-4fa5-95e9-a5ea7727cb4f")
    @SmaMetaAttribute(metaName="Kind", type=EventType.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = EventType.SIGNALEVENT;

    @objid ("577ac666-58fe-4ed4-996b-339e17d73ef8")
    @SmaMetaAssociation(metaName="Triggered", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.TriggeredSmDependency.class)
     List<SmObjectImpl> mTriggered = null;

    @objid ("26048226-d959-454f-9a1a-2faaf3df0551")
    @SmaMetaAssociation(metaName="Model", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("3dde5c20-d1bf-4643-9fcc-0ccd0d8190c5")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.OriginSmDependency.class)
     List<SmObjectImpl> mOrigin = null;

    @objid ("348125b4-07ff-4f90-ace3-36c65c214b73")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("94eda2f4-7780-4605-b1dc-71614d846697")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("d2ad8136-ae58-4717-8628-38f64066fe2c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00357d16-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f6a83425-e015-4bfd-aeb1-82dc136dfdaa")
        private static SmClass smClass = null;

        @objid ("6613a545-3860-448a-a525-8f2e5e0db497")
        private static SmAttribute ExpressionAtt = null;

        @objid ("2c7afb0b-e4e0-45c8-a05b-9d53959f1049")
        private static SmAttribute KindAtt = null;

        @objid ("e5b8be42-621a-4d1b-9f2a-d5f0760fa15a")
        private static SmDependency TriggeredDep = null;

        @objid ("66c8b351-1531-4856-9085-30cd8c52dfe6")
        private static SmDependency ModelDep = null;

        @objid ("bec11a8a-d415-4607-816c-c9ca7411b933")
        private static SmDependency OriginDep = null;

        @objid ("fdb36aa8-a5e1-4095-ae34-9c76f53c4871")
        private static SmDependency CalledDep = null;

        @objid ("fb177f56-4dce-46c5-8db5-64f4ac952f4e")
        private static SmDependency ComposedDep = null;

        @objid ("6d80176f-25b1-4cde-b073-56d8acef56fa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a08c3369-7aed-4463-a143-d867b9899f8f")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("3a3d3241-eb29-40de-add8-ce28cea866dd")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("ace09a45-d456-4733-b4a4-46c2daee99d5")
        public static SmDependency TriggeredDep() {
            if (TriggeredDep == null) {
            	TriggeredDep = classof().getDependencyDef("Triggered");
            }
            return TriggeredDep;
        }

        @objid ("341036bb-5d36-4697-9f64-75519528a4a4")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("d930ce3e-cdeb-4414-a19e-b24cf26e93a5")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("e5547f83-2508-43ed-8ca3-1043cd455bfb")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("780ac364-78d6-4942-873f-b2241b6101eb")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("f21e2ea6-fb6c-4294-9e38-6a1767120ccc")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("2bb90f09-b38b-4d6e-96dd-0099c313ea85")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("dc8568aa-03b9-4858-8296-1bdf773d4cb6")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("5903d8f4-3a1e-4634-92d4-9af1e0648de1")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("d2e21f85-0a55-49b6-9be4-04011b71f6a3")
        public static SmDependency getTriggeredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredDep;
        }

        @objid ("c60579e8-a26c-4ccd-b0b4-f788394b4491")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("64b009ae-62bc-4f5f-b7de-1697f8f9d2db")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("decd5bf2-4b54-4765-83da-1d077b263b8f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0035bf06-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e9b3ad1f-9557-465f-abf1-0155acd17c9b")
            public ISmObjectData createData() {
                return new EventData();
            }

            @objid ("626c8a52-3308-431a-937c-cf79e5bf21bd")
            public SmObjectImpl createImpl() {
                return new EventImpl();
            }

        }

        @objid ("00362338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("53c12428-753c-4148-9f83-94afb8aa1b4e")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mExpression;
            }

            @objid ("83a58cc6-8e48-4f4c-ad3f-ba5d6d6b6e5d")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mExpression = value;
            }

        }

        @objid ("003684ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("f0ff20f9-2737-4a8b-9de7-5f65415522e7")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mKind;
            }

            @objid ("26116171-8d8d-43dd-94ee-2c326a70f4bc")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mKind = value;
            }

        }

        @objid ("0036e750-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("653aa78a-9515-4353-adf2-005049626af7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mCalled;
            }

            @objid ("192c5cac-c400-4e86-98c5-b8ac04ddd76f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mCalled = value;
            }

            @objid ("f9574cfa-c279-4f20-acb8-e21c26bf1e72")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00375ce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("7ec7db00-e73f-4573-ba95-61ecb17e1c61")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mComposed;
            }

            @objid ("6522527f-571f-4834-a989-1a245cf4d99a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mComposed = value;
            }

            @objid ("0de7e103-1e68-4834-a1f0-79b42d480cc0")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EComponentDep();
            }

        }

        @objid ("0037d23c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("84cacbc3-1dda-4a49-9a62-e2134a4f539f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mModel;
            }

            @objid ("fa3e435f-6e3e-4113-a026-b47ef6f621d3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mModel = value;
            }

            @objid ("c0a8a260-9c43-4459-80fa-41fa0cca5648")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.EOccurenceDep();
            }

        }

        @objid ("003848d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmMultipleDependency {
            @objid ("4bd15cf0-16b1-49e1-815d-915c3dde6328")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mOrigin != null)? ((EventData)data).mOrigin:SmMultipleDependency.EMPTY;
            }

            @objid ("f8fdf0dd-ac55-48d4-a55f-16151bbf187e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mOrigin = new ArrayList<>(initialCapacity);
                return ((EventData) data).mOrigin;
            }

            @objid ("cbb588ac-2fbf-4fbd-903c-deaeb4dbfc55")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.DefferedDep();
            }

        }

        @objid ("0038ad74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TriggeredSmDependency extends SmMultipleDependency {
            @objid ("ef300dd4-fac9-4b10-acc1-196df8ff0ca0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mTriggered != null)? ((EventData)data).mTriggered:SmMultipleDependency.EMPTY;
            }

            @objid ("d83d8550-e2fc-4ecc-9b35-bb7dc20bfe27")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mTriggered = new ArrayList<>(initialCapacity);
                return ((EventData) data).mTriggered;
            }

            @objid ("37b2f264-76df-4e31-8678-9404a30ae6ea")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TriggerDep();
            }

        }

    }

}
