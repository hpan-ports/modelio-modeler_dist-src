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
    @objid ("e3d8bea2-9d8a-4f98-90b9-b602d8084484")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("8e050b32-9287-4101-b6e4-c1d8c4c05ccc")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnMultiInstanceLoopCharacteristicsData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("3f9b582b-f29f-472e-9c51-af909f12357a")
    @SmaMetaAssociation(metaName="Event", typeDataClass=BpmnImplicitThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.EventSmDependency.class, component = true)
     SmObjectImpl mEvent;

    @objid ("9af0642b-a836-4033-8103-22a4320d44c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00579914-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("841ca174-b983-40f2-86b9-8e6cd0a09d56")
        private static SmClass smClass = null;

        @objid ("01792bfc-7678-484b-8b01-97bebb263d1d")
        private static SmAttribute ConditionAtt = null;

        @objid ("2891ab62-de8a-4ca1-bba2-20e973c26925")
        private static SmDependency OwnerDep = null;

        @objid ("80501c26-ddd8-49dd-b5b9-938d52d80ac2")
        private static SmDependency EventDep = null;

        @objid ("453891f2-af13-4fef-bc25-5e395982941e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnComplexBehaviorDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c35eedb3-d1db-4916-9555-730ff903ca65")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("d6b9ab18-713a-4b83-8c38-f517002922e8")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("3eff0d62-f5d1-4f95-8397-5bd5de18ed16")
        public static SmDependency EventDep() {
            if (EventDep == null) {
            	EventDep = classof().getDependencyDef("Event");
            }
            return EventDep;
        }

        @objid ("1558e642-ce43-4303-bbad-3cf367a2608c")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("db39a73b-c182-4df6-a2c2-050bd003e6a4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d6646dd1-392f-474c-ba9c-03384c362be3")
        public static SmDependency getEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDep;
        }

        @objid ("0dc23a98-1910-4ab3-9d20-b4b31e74673d")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("0057e4be-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bce59e41-0a1a-4f48-ab47-bfe9ab69d7ac")
            public ISmObjectData createData() {
                return new BpmnComplexBehaviorDefinitionData();
            }

            @objid ("8090d2ec-457b-4135-a8ba-5189a3f147b1")
            public SmObjectImpl createImpl() {
                return new BpmnComplexBehaviorDefinitionImpl();
            }

        }

        @objid ("005846f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("1d4d50a9-c3a9-4dc3-9a57-360496d25c30")
            public Object getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mCondition;
            }

            @objid ("8e80d680-d655-4a6d-ac18-9f7a8e42a5d4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnComplexBehaviorDefinitionData) data).mCondition = value;
            }

        }

        @objid ("0058a908-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EventSmDependency extends SmSingleDependency {
            @objid ("ac3197eb-459c-4cfa-bc23-8b0f05757f97")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mEvent;
            }

            @objid ("4c9822b9-82c6-4b5b-baad-dba3793a2d63")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mEvent = value;
            }

            @objid ("879753a5-07a1-4471-a280-429571f29da1")
            @Override
            public SmDependency getSymetric() {
                return BpmnImplicitThrowEventData.Metadata.OwnerDep();
            }

        }

        @objid ("005929dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("ea83972a-d970-4934-bd4a-2fd73ac6a8b1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnComplexBehaviorDefinitionData) data).mOwner;
            }

            @objid ("73462d2d-37bf-433e-a94c-d078d81e3513")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnComplexBehaviorDefinitionData) data).mOwner = value;
            }

            @objid ("7a5dfc1a-394a-4e1e-867a-236d891dffd9")
            @Override
            public SmDependency getSymetric() {
                return BpmnMultiInstanceLoopCharacteristicsData.Metadata.ComplexBehaviorDefinitionDep();
            }

        }

    }

}
