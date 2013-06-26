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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnImplicitThrowEventData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnComplexBehaviorDefinitionImpl;
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

@objid ("007fcaf6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnComplexBehaviorDefinition.class, factory=BpmnComplexBehaviorDefinitionData.Metadata.ObjectFactory.class)
public class BpmnComplexBehaviorDefinitionData extends BpmnBaseElementData {
    @objid ("a8534d6d-dfc2-487b-9f77-db96772a8a71")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("ec69c7a3-5594-4bc9-ab9a-0e3b0b1cda66")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("5a2e8cd7-e46b-459c-89cb-af48cdbc9766")
    @SmaMetaAssociation(metaName="Event", typeDataClass=BpmnImplicitThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.EventSmDependency.class, component = true)
     SmObjectImpl mEvent;

    @objid ("c82a0b45-4c86-4a6d-8ee9-f324ece7c000")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579914-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f7278781-5cbb-442c-9230-19528724d9d0")
        private static SmClass smClass = null;

        @objid ("509a185b-53da-402a-a544-6017820358a1")
        private static SmAttribute ConditionAtt = null;

        @objid ("e69de37a-d007-41c6-a27f-02fafbfe8f21")
        private static SmDependency OwnerDep = null;

        @objid ("583c0cb8-f44c-4aca-abb1-14a04dac1969")
        private static SmDependency EventDep = null;

        @objid ("e0663007-4457-4e82-ad63-2d97d3ed2d06")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexBehaviorDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("44c046b5-6a64-46ef-886e-f542708e84b0")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("fe52691a-bead-4522-a1f6-a76402c5f6ce")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("5ddf4a0c-7573-4eb9-9325-c85ac20773ef")
        public static SmDependency EventDep() {
            if (EventDep == null) {
            	EventDep = classof().getDependencyDef("Event");
            }
            return EventDep;
        }

        @objid ("a59a3591-f004-4d1d-8555-b5d6862d30c0")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("4961f50d-f654-43ba-b6aa-fd22bf07c156")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("1d982255-e8f8-47ab-9230-2648f36a702b")
        public static SmDependency getEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDep;
        }

        @objid ("81c2e457-97e9-41de-9a28-047029cb0ce1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0057e4be-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ca12ebff-6a0e-4500-9b8b-e93ab54c4888")
            public ISmObjectData createData() {
                return new BpmnComplexBehaviorDefinitionData();
            }

            @objid ("b90ae24f-cac5-46a9-aba2-14ae9a28890a")
            public SmObjectImpl createImpl() {
                return new BpmnComplexBehaviorDefinitionImpl();
            }

        }

        @objid ("005846f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("f1f49bf9-3707-485e-9cd4-465c1f869d6e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mCondition;
            }

            @objid ("08487c9e-bf0d-4a1c-9459-62b30ab16d9c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexBehaviorDefinitionData) data).mCondition = value;
            }

        }

        @objid ("0058a908-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventSmDependency extends SmSingleDependency {
            @objid ("1b00ed06-900b-4f60-b986-b7d313257e09")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mEvent;
            }

            @objid ("f65b8a8b-abec-4274-8f46-913620b86ac6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mEvent = value;
            }

            @objid ("5bc31e53-f478-4d8a-9f45-1b36d92dba6b")
            @Override
            public SmDependency getSymetric() {
                return BpmnImplicitThrowEventData.Metadata.OwnerDep();
            }

        }

        @objid ("005929dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a77c12ad-97d1-4909-8507-b284cd007ba1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mOwner;
            }

            @objid ("4ac8a9b4-6038-4009-91b8-fe70b3221bf7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mOwner = value;
            }

            @objid ("0117ba15-3d45-4d16-a8bd-18cf510b84d7")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep();
            }

        }

    }

}
