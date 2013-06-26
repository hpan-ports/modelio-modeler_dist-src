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
    @objid ("7cf81cd1-9619-4a0c-bd24-ea9b936ca56b")
    @SmaMetaAttribute(metaName="Expression", type=String.class, smAttributeClass=Metadata.ExpressionSmAttribute.class)
     Object mExpression = "";

    @objid ("2617cb33-b887-4880-9671-ae8fc3bc25fe")
    @SmaMetaAttribute(metaName="Kind", type=EventType.class, smAttributeClass=Metadata.KindSmAttribute.class)
     Object mKind = EventType.SIGNALEVENT;

    @objid ("73b84e93-59d1-40f5-a567-2ff896bd7a8c")
    @SmaMetaAssociation(metaName="Triggered", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.TriggeredSmDependency.class)
     List<SmObjectImpl> mTriggered = null;

    @objid ("4b7185ea-659c-4deb-afc1-175df817560a")
    @SmaMetaAssociation(metaName="Model", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("7be4da60-5f65-4ad2-b5c9-d5710491b273")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=StateData.class, min=0, max=-1, smAssociationClass=Metadata.OriginSmDependency.class)
     List<SmObjectImpl> mOrigin = null;

    @objid ("3c2ff308-aeaa-47ed-960c-ff5a6c6254b4")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("2aa7f48c-35aa-4f63-8fdf-c209e1e94015")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=BehaviorData.class, min=1, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("b5c28624-b815-441a-a556-e4fdadbfb58d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00357d16-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e5f6c7e0-ffd6-4dcd-8bd2-6c564cb28edf")
        private static SmClass smClass = null;

        @objid ("1dfe97b4-e5cd-4837-ad0b-93c03ce99221")
        private static SmAttribute ExpressionAtt = null;

        @objid ("95cdbdcf-7c33-4e35-9b89-3c9b8ff080f6")
        private static SmAttribute KindAtt = null;

        @objid ("b4440a8a-0d86-4f73-bf62-663a73384199")
        private static SmDependency TriggeredDep = null;

        @objid ("28a0cd21-3602-4221-b33a-dda891dbf338")
        private static SmDependency ModelDep = null;

        @objid ("7d0c1245-3a98-459e-8e0d-1057e5bf64e0")
        private static SmDependency OriginDep = null;

        @objid ("810fca16-a9b7-4f5c-9689-dd7bb61c5a9c")
        private static SmDependency CalledDep = null;

        @objid ("4f680c5d-2600-4207-a65f-db3ccd5c4307")
        private static SmDependency ComposedDep = null;

        @objid ("33bf072e-7c4e-40ae-a5fd-48818db15b36")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7693eefd-383c-4ed3-abb8-9d6f4e084107")
        public static SmAttribute ExpressionAtt() {
            if (ExpressionAtt == null) {
            	ExpressionAtt = classof().getAttributeDef("Expression");
            }
            return ExpressionAtt;
        }

        @objid ("d25960a2-4209-44c3-94ad-4122e76a2f7f")
        public static SmAttribute KindAtt() {
            if (KindAtt == null) {
            	KindAtt = classof().getAttributeDef("Kind");
            }
            return KindAtt;
        }

        @objid ("ca3ddb04-6768-4748-8d71-216df177273a")
        public static SmDependency TriggeredDep() {
            if (TriggeredDep == null) {
            	TriggeredDep = classof().getDependencyDef("Triggered");
            }
            return TriggeredDep;
        }

        @objid ("8b659580-730e-426e-a3f6-6398efb9e4cd")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("57520e68-26aa-4f07-94b7-a340b84a8c6a")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("257f1c3e-ea28-4cc7-ac2e-8a65df2dd774")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("2f275a9d-b348-45a9-b0a2-d57fd8224a3e")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("2dbeaf70-825e-4be7-a995-bcb206d52f9d")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("4ab91745-b36d-4910-853b-052ed9951460")
        public static SmAttribute getExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExpressionAtt;
        }

        @objid ("a66bc5e6-c7c8-4cb3-83f6-3f93b916e0bf")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("ecec1c7e-4fc3-46f0-961b-61aba86456a0")
        public static SmAttribute getKindAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindAtt;
        }

        @objid ("6375bd6e-2f82-4af0-ae98-0f8dfbe981e1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1afbb6a3-0288-486e-909e-4685447ec9d7")
        public static SmDependency getTriggeredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredDep;
        }

        @objid ("acda5c05-0944-4235-89b1-eacd442f8f66")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("87777c94-dbd2-4ef2-86de-048e5fe51176")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("0035bf06-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("edb56de3-ac59-42ef-9f4b-5ea5b8a7ea11")
            public ISmObjectData createData() {
                return new EventData();
            }

            @objid ("adb4e16f-5b86-4bd4-b606-2da276b89e05")
            public SmObjectImpl createImpl() {
                return new EventImpl();
            }

        }

        @objid ("00362338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExpressionSmAttribute extends SmAttribute {
            @objid ("612dd28d-f69f-4ac7-bcd5-f167fedd3302")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mExpression;
            }

            @objid ("287c4c1b-fcb8-4fca-93d5-cdd67662a03b")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mExpression = value;
            }

        }

        @objid ("003684ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class KindSmAttribute extends SmAttribute {
            @objid ("8e8d0395-0ca1-44b3-821a-ef583f385f0d")
            public Object getValue(ISmObjectData data) {
                return ((EventData) data).mKind;
            }

            @objid ("4d7f9e7c-5afb-42e7-9185-70e6ea7cd940")
            public void setValue(ISmObjectData data, Object value) {
                ((EventData) data).mKind = value;
            }

        }

        @objid ("0036e750-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("f5482ed6-9b09-4606-b9ad-6b3d029c4e0d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mCalled;
            }

            @objid ("990b7530-9d4e-40b8-84ba-639ad23deedd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mCalled = value;
            }

            @objid ("eafc87bb-b952-4a85-b46b-cdd43d74916b")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OccurenceDep();
            }

        }

        @objid ("00375ce4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("c924dddd-494e-44d8-a6f7-0fd4afd2e00d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mComposed;
            }

            @objid ("822c5a1f-b9f3-47b1-819e-8324beff4bd4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mComposed = value;
            }

            @objid ("8c587717-10ac-484b-99d2-b37fd013e9a9")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EComponentDep();
            }

        }

        @objid ("0037d23c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("08307b3a-a54f-4b12-984c-9daa3d145770")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EventData) data).mModel;
            }

            @objid ("4e047d38-f29f-41de-838e-f762bb0cdabf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EventData) data).mModel = value;
            }

            @objid ("24a994d9-53a8-42c9-852e-b5663c96a182")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.EOccurenceDep();
            }

        }

        @objid ("003848d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmMultipleDependency {
            @objid ("90c91e8e-e656-422c-8eaf-0b6b22b51fb9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mOrigin != null)? ((EventData)data).mOrigin:SmMultipleDependency.EMPTY;
            }

            @objid ("266585fd-1e60-4c47-b534-7c066127af2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mOrigin = new ArrayList<>(initialCapacity);
                return ((EventData) data).mOrigin;
            }

            @objid ("a623aa4f-06e3-4882-84f5-fc749fdfb2ab")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.DefferedDep();
            }

        }

        @objid ("0038ad74-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TriggeredSmDependency extends SmMultipleDependency {
            @objid ("b351ac4f-a898-49f9-831c-9b90011c9bb2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EventData)data).mTriggered != null)? ((EventData)data).mTriggered:SmMultipleDependency.EMPTY;
            }

            @objid ("74e39c64-f017-4941-a264-eb8515b3bfef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EventData) data).mTriggered = new ArrayList<>(initialCapacity);
                return ((EventData) data).mTriggered;
            }

            @objid ("64f1f5f6-2bc5-4b93-becb-5db6d5e45e73")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.TriggerDep();
            }

        }

    }

}
