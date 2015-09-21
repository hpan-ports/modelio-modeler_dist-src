/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnImplicitThrowEventSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1ff7f11f-681a-4bbf-915b-70cf03d97e97")
public class BpmnComplexBehaviorDefinitionSmClass extends BpmnBaseElementSmClass {
    @objid ("df6aebb1-48d4-4f44-9ca8-f3a2dced45e7")
    private SmAttribute conditionAtt;

    @objid ("232a9e2f-01bb-421a-b124-3213a76d2c78")
    private SmDependency ownerDep;

    @objid ("689d2d91-f3ea-4d64-b346-dba495f0c209")
    private SmDependency eventDep;

    @objid ("dbcb4895-7948-4288-861d-7f6525a4b623")
    public BpmnComplexBehaviorDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ad5c7591-3f9e-463d-bf42-37b133724703")
    @Override
    public String getName() {
        return "BpmnComplexBehaviorDefinition";
    }

    @objid ("c050cf4b-b75b-4c72-896b-5b00c0294a26")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("eed1918b-0d87-47ed-baab-9604bc3a9ffa")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnComplexBehaviorDefinition.class;
    }

    @objid ("23baaae1-c271-4255-9347-a05d3c9f45bf")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8ed08929-5c11-43ce-9621-6699a5f748c2")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5ddedb6e-abc6-4863-bc6c-ff63d71251cb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnComplexBehaviorDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.conditionAtt = new ConditionSmAttribute();
        this.conditionAtt.init("Condition", this, String.class );
        registerAttribute(this.conditionAtt);
        
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("BpmnMultiInstanceLoopCharacteristics"), 1, 1 );
        registerDependency(this.ownerDep);
        
        this.eventDep = new EventSmDependency();
        this.eventDep.init("Event", this, metamodel.getMClass("BpmnImplicitThrowEvent"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.eventDep);
    }

    @objid ("dba3c83d-faa7-4914-aefd-05b5db850d94")
    public SmAttribute getConditionAtt() {
        if (this.conditionAtt == null) {
        	this.conditionAtt = this.getAttributeDef("Condition");
        }
        return this.conditionAtt;
    }

    @objid ("c4af76bc-a847-4edf-bcf4-2241e72a6b4b")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("b2672ed8-9edc-4d85-99bc-d02762f49db4")
    public SmDependency getEventDep() {
        if (this.eventDep == null) {
        	this.eventDep = this.getDependencyDef("Event");
        }
        return this.eventDep;
    }

    @objid ("8092b77c-0641-425c-8091-3a1081d86642")
    private static class BpmnComplexBehaviorDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("c37e8c1e-c5ba-4dad-8894-a50679281043")
        private BpmnComplexBehaviorDefinitionSmClass smClass;

        @objid ("08254246-366b-4c1c-917e-bf4b1558713e")
        public BpmnComplexBehaviorDefinitionObjectFactory(BpmnComplexBehaviorDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("31479c27-a06c-43a5-a207-4cde931dc392")
        @Override
        public ISmObjectData createData() {
            return new BpmnComplexBehaviorDefinitionData(this.smClass);
        }

        @objid ("60478cae-df5c-41a0-8df7-e4efd8581c7d")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnComplexBehaviorDefinitionImpl();
        }

    }

    @objid ("729f1cf0-1cf3-4e74-9f80-7892cbf22f36")
    public static class ConditionSmAttribute extends SmAttribute {
        @objid ("9dd932ce-38b6-474b-9633-f8fd7afccd49")
        public Object getValue(ISmObjectData data) {
            return ((BpmnComplexBehaviorDefinitionData) data).mCondition;
        }

        @objid ("c2ce819a-1000-4d1f-b2b2-de6216db3660")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnComplexBehaviorDefinitionData) data).mCondition = value;
        }

    }

    @objid ("2fc82f05-fb7d-4c18-a354-9bd7455b1f3e")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("afa55273-7e89-4524-84ad-e77f41585265")
        private SmDependency symetricDep;

        @objid ("4e1e7b3a-6ae9-406f-9025-7bf84bcf9391")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnComplexBehaviorDefinitionData) data).mOwner;
        }

        @objid ("e67414be-5c11-432c-a2a2-58f836791571")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnComplexBehaviorDefinitionData) data).mOwner = value;
        }

        @objid ("753b267f-d398-4464-900c-64e68106add6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnMultiInstanceLoopCharacteristicsSmClass)this.getTarget()).getComplexBehaviorDefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6de36fa8-48bd-47e8-8922-2693d6d6c844")
    public static class EventSmDependency extends SmSingleDependency {
        @objid ("521e5e95-5ddb-48d0-8297-4ee0779316ed")
        private SmDependency symetricDep;

        @objid ("d46eaf3b-6584-45c7-9e61-53e90c5fbadd")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnComplexBehaviorDefinitionData) data).mEvent;
        }

        @objid ("44389ea1-8035-4d64-9b85-a8f6fe77e8b9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnComplexBehaviorDefinitionData) data).mEvent = value;
        }

        @objid ("b8bebd4c-4bfb-411b-9714-801151d66f1e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnImplicitThrowEventSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
