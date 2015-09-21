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
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f678f6ce-8a18-4ddc-b925-3df960bae1f4")
public class BpmnAdHocSubProcessSmClass extends BpmnSubProcessSmClass {
    @objid ("65508dca-e29a-4405-aa66-cf44efba716f")
    private SmAttribute orderingAtt;

    @objid ("29c7c055-d4bc-41f2-8acc-2e747fbab72c")
    private SmAttribute cancelRemainingInstancesAtt;

    @objid ("f40c6879-52a5-4a14-a51d-d94091b34ea8")
    private SmAttribute completionConditionAtt;

    @objid ("ad44b0c5-9845-4ada-8d74-cc2753ec60fe")
    public BpmnAdHocSubProcessSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0e1d1cf7-ead5-49fb-b348-c393bdbb8578")
    @Override
    public String getName() {
        return "BpmnAdHocSubProcess";
    }

    @objid ("06162a56-f085-4140-b105-aa10e5715fdf")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c20e2233-77a3-4110-8309-3832adc5f586")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnAdHocSubProcess.class;
    }

    @objid ("678bac73-55a3-4e5e-8fe2-07ace8c8362a")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f197ead0-e17d-449a-8f07-f46f98b4c639")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("c9d6efdc-6eca-4ac9-a6d7-1a1b14a9c931")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnSubProcess");
        this.registerFactory(new BpmnAdHocSubProcessObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.orderingAtt = new OrderingSmAttribute();
        this.orderingAtt.init("Ordering", this, AdHocOrdering.class );
        registerAttribute(this.orderingAtt);
        
        this.cancelRemainingInstancesAtt = new CancelRemainingInstancesSmAttribute();
        this.cancelRemainingInstancesAtt.init("CancelRemainingInstances", this, Boolean.class );
        registerAttribute(this.cancelRemainingInstancesAtt);
        
        this.completionConditionAtt = new CompletionConditionSmAttribute();
        this.completionConditionAtt.init("CompletionCondition", this, String.class );
        registerAttribute(this.completionConditionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("a82a9065-32aa-4993-8cf3-22a7e81ebfe8")
    public SmAttribute getOrderingAtt() {
        if (this.orderingAtt == null) {
        	this.orderingAtt = this.getAttributeDef("Ordering");
        }
        return this.orderingAtt;
    }

    @objid ("2b96055b-5284-43e5-b360-0c00f5679297")
    public SmAttribute getCancelRemainingInstancesAtt() {
        if (this.cancelRemainingInstancesAtt == null) {
        	this.cancelRemainingInstancesAtt = this.getAttributeDef("CancelRemainingInstances");
        }
        return this.cancelRemainingInstancesAtt;
    }

    @objid ("00d6296b-2659-489c-a553-5053268bf09d")
    public SmAttribute getCompletionConditionAtt() {
        if (this.completionConditionAtt == null) {
        	this.completionConditionAtt = this.getAttributeDef("CompletionCondition");
        }
        return this.completionConditionAtt;
    }

    @objid ("615b7448-c6be-49d0-b454-e62a77bbd85e")
    private static class BpmnAdHocSubProcessObjectFactory implements ISmObjectFactory {
        @objid ("004ff4c8-d346-4a54-8c49-702d7db5660a")
        private BpmnAdHocSubProcessSmClass smClass;

        @objid ("f7ffe671-ea02-4c0d-a745-6b65a7a59813")
        public BpmnAdHocSubProcessObjectFactory(BpmnAdHocSubProcessSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8f87d0e7-c6a6-4779-86e1-90188eaabf0f")
        @Override
        public ISmObjectData createData() {
            return new BpmnAdHocSubProcessData(this.smClass);
        }

        @objid ("b83a2b7a-b777-4d30-ab83-7111f012c18a")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnAdHocSubProcessImpl();
        }

    }

    @objid ("ee5ed6f3-5d11-440a-8a8f-5b6e625b5704")
    public static class OrderingSmAttribute extends SmAttribute {
        @objid ("b1cf5524-8ed8-4e9e-bf09-2c65f29a1f54")
        public Object getValue(ISmObjectData data) {
            return ((BpmnAdHocSubProcessData) data).mOrdering;
        }

        @objid ("26a1676a-42bd-485a-96ac-1fb74e67a687")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnAdHocSubProcessData) data).mOrdering = value;
        }

    }

    @objid ("d4998dd4-2036-4cc4-9f03-1b24ede6d08a")
    public static class CancelRemainingInstancesSmAttribute extends SmAttribute {
        @objid ("2e69bf38-3f08-4efe-8879-d89e79b92af5")
        public Object getValue(ISmObjectData data) {
            return ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances;
        }

        @objid ("535009db-e7fe-46c6-b732-936a0d11c1f3")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnAdHocSubProcessData) data).mCancelRemainingInstances = value;
        }

    }

    @objid ("76bc3bcc-ed47-4836-ba66-cd84e0c8dd9e")
    public static class CompletionConditionSmAttribute extends SmAttribute {
        @objid ("9009895d-24a0-4d0f-9631-214be9cdf3c2")
        public Object getValue(ISmObjectData data) {
            return ((BpmnAdHocSubProcessData) data).mCompletionCondition;
        }

        @objid ("1e641536-82d7-41a3-af93-4eb71afcc84f")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnAdHocSubProcessData) data).mCompletionCondition = value;
        }

    }

}
