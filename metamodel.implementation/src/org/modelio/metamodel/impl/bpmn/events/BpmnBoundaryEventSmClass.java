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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventSmClass;
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

@objid ("433e47df-dc16-440a-be26-aecc715e5788")
public class BpmnBoundaryEventSmClass extends BpmnCatchEventSmClass {
    @objid ("2bc8c6da-885c-416d-8845-3d6684e95ea1")
    private SmAttribute cancelActivityAtt;

    @objid ("b374dec1-04fe-48e1-857f-39fd9b8b833d")
    private SmDependency attachedToRefDep;

    @objid ("abccb103-da10-418d-948e-0f80f04fdfcf")
    public BpmnBoundaryEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d55f7b76-88da-4ac1-9dc4-58dd7d084bfb")
    @Override
    public String getName() {
        return "BpmnBoundaryEvent";
    }

    @objid ("375bd328-496f-4afa-ba44-72589b016a9f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("761909ef-383b-4deb-a67b-f7d912212dff")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnBoundaryEvent.class;
    }

    @objid ("14efa33e-b5b9-427a-994f-67af81a7a5d8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("483f019d-8951-43bb-b739-ad1dac8a7ee2")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("4570f544-f495-426d-8885-f1dc243e96c6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnCatchEvent");
        this.registerFactory(new BpmnBoundaryEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.cancelActivityAtt = new CancelActivitySmAttribute();
        this.cancelActivityAtt.init("CancelActivity", this, Boolean.class );
        registerAttribute(this.cancelActivityAtt);
        
        
        // Initialize and register the SmDependency
        this.attachedToRefDep = new AttachedToRefSmDependency();
        this.attachedToRefDep.init("AttachedToRef", this, metamodel.getMClass("BpmnActivity"), 1, 1 );
        registerDependency(this.attachedToRefDep);
    }

    @objid ("7c4a57ca-cbaf-4524-a41b-8ad4ec284bc5")
    public SmAttribute getCancelActivityAtt() {
        if (this.cancelActivityAtt == null) {
        	this.cancelActivityAtt = this.getAttributeDef("CancelActivity");
        }
        return this.cancelActivityAtt;
    }

    @objid ("25554d02-bc76-42e5-84ea-79398f589dcc")
    public SmDependency getAttachedToRefDep() {
        if (this.attachedToRefDep == null) {
        	this.attachedToRefDep = this.getDependencyDef("AttachedToRef");
        }
        return this.attachedToRefDep;
    }

    @objid ("3393ef20-5607-485f-934c-d0925c328a59")
    private static class BpmnBoundaryEventObjectFactory implements ISmObjectFactory {
        @objid ("f6c5c2a0-10b0-4116-9cf6-8044390bd0c4")
        private BpmnBoundaryEventSmClass smClass;

        @objid ("f0503c33-c015-485e-a895-1dedcb5ddbca")
        public BpmnBoundaryEventObjectFactory(BpmnBoundaryEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8b6ce221-7eea-48cc-96ed-17916d9eec8f")
        @Override
        public ISmObjectData createData() {
            return new BpmnBoundaryEventData(this.smClass);
        }

        @objid ("f0d2d76c-dd41-40d0-9d3e-8f5c6bd51633")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnBoundaryEventImpl();
        }

    }

    @objid ("b037c55a-1cdb-48a7-ad3c-0dd2b7450b35")
    public static class CancelActivitySmAttribute extends SmAttribute {
        @objid ("e6fb8a26-c1af-4c8c-bde3-1ebc5bc4a602")
        public Object getValue(ISmObjectData data) {
            return ((BpmnBoundaryEventData) data).mCancelActivity;
        }

        @objid ("20f33ca4-b1ac-4354-91ee-705983f37030")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnBoundaryEventData) data).mCancelActivity = value;
        }

    }

    @objid ("0d9911ec-a7a2-4752-8796-0e3ebc717534")
    public static class AttachedToRefSmDependency extends SmSingleDependency {
        @objid ("75d69d02-7725-4708-b123-48b72fc6ebb9")
        private SmDependency symetricDep;

        @objid ("4cbe09a0-31b5-4709-964f-791205e940f0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnBoundaryEventData) data).mAttachedToRef;
        }

        @objid ("40b3ea9b-ebd8-4d23-bd58-210ceab1e66b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnBoundaryEventData) data).mAttachedToRef = value;
        }

        @objid ("acab221c-0ee9-4c27-bdca-0a15e25541a7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getBoundaryEventRefDep();
            }
            return this.symetricDep;
        }

    }

}
