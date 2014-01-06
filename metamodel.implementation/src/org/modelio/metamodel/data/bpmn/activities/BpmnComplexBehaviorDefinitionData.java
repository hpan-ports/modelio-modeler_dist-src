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
    @objid ("72413222-cce1-4ae8-baad-d7c23ac8435f")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("0b2e5368-e20c-4f23-a4f8-cf821edfeaf0")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("dc8d164f-0194-4609-9ae2-d5681342e6c2")
    @SmaMetaAssociation(metaName="Event", typeDataClass=BpmnImplicitThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.EventSmDependency.class, component = true)
     SmObjectImpl mEvent;

    @objid ("a5ac99b6-922b-4ef4-a520-69ce7f8f88bf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579914-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8d525527-658d-4bfa-9356-3e1b9d157e24")
        private static SmClass smClass = null;

        @objid ("1ff142fb-5f7e-464b-948f-03cbd1f85c19")
        private static SmAttribute ConditionAtt = null;

        @objid ("a0bfc75c-d55d-4769-a9ed-33e4044484cf")
        private static SmDependency OwnerDep = null;

        @objid ("81952fdc-f254-4fd4-a901-d004d91c0dab")
        private static SmDependency EventDep = null;

        @objid ("d4ecdbb0-db5e-4c05-b3bf-383b4ba4300a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexBehaviorDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("29de6b57-3929-466d-a102-12524a52f6d2")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("20195e6b-58cf-4104-b382-fcb969086d26")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("7a8ec848-9ae0-4dfe-add1-c833609e08f7")
        public static SmDependency EventDep() {
            if (EventDep == null) {
            	EventDep = classof().getDependencyDef("Event");
            }
            return EventDep;
        }

        @objid ("d8bba8a2-e253-4b69-b39e-e99e90894734")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f3be7a2f-dcfd-466c-8c37-071b175ea997")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("41ee6c66-98cd-4344-8c8c-82b4c50bf41c")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("84f5e6a6-4dc9-42b9-8721-4188ec7727e0")
        public static SmDependency getEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDep;
        }

        @objid ("0057e4be-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("654326b1-c94e-4d4e-8c97-ed4cf5f25f52")
            public ISmObjectData createData() {
                return new BpmnComplexBehaviorDefinitionData();
            }

            @objid ("8bec14c2-cbef-485b-8ec6-119878a0b358")
            public SmObjectImpl createImpl() {
                return new BpmnComplexBehaviorDefinitionImpl();
            }

        }

        @objid ("005846f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("5017ffe6-f36e-4842-854e-238cf01efb2e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mCondition;
            }

            @objid ("79193ece-674f-48ad-9d74-0768d633da8c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexBehaviorDefinitionData) data).mCondition = value;
            }

        }

        @objid ("0058a908-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventSmDependency extends SmSingleDependency {
            @objid ("efc3cd3a-7b6b-4099-bf47-f6fc09884139")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mEvent;
            }

            @objid ("8669659f-b290-4ac3-911e-87cb8fdc1aa3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mEvent = value;
            }

            @objid ("3cdfcca2-10c2-48b1-a2fe-7a0225510df1")
            @Override
            public SmDependency getSymetric() {
                return BpmnImplicitThrowEventData.Metadata.OwnerDep();
            }

        }

        @objid ("005929dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("0c0a4abe-3c27-41b7-a49f-3765fa19448f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mOwner;
            }

            @objid ("ce6c3923-481b-4c69-82b6-39dc595a6517")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mOwner = value;
            }

            @objid ("6f6a3c6b-2526-4f2d-8042-02b25604fa36")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep();
            }

        }

    }

}
