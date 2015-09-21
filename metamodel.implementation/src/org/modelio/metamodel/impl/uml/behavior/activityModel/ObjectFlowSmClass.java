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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("06e1a3c5-78c9-42ca-8c42-4aa06fd6eeb3")
public class ObjectFlowSmClass extends ActivityEdgeSmClass {
    @objid ("b5c934c3-5226-4a08-bbdd-4fc71fa07a24")
    private SmAttribute transformationBehaviorAtt;

    @objid ("337db4bc-1c79-49ef-8d27-0a8017bab6b3")
    private SmAttribute selectionBehaviorAtt;

    @objid ("bfeb1acd-12cd-4adb-b064-2376297df513")
    private SmAttribute isMultiCastAtt;

    @objid ("e23218c3-4a39-4299-97ab-3a36d2daba5f")
    private SmAttribute isMultiReceiveAtt;

    @objid ("cf8d0615-bada-4848-b084-c2cf8fa02925")
    private SmAttribute effectAtt;

    @objid ("8c26b180-683c-46b3-bebc-69ae5dfa7302")
    public ObjectFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a1e850e9-cace-4b71-af48-635dd7a0260c")
    @Override
    public String getName() {
        return "ObjectFlow";
    }

    @objid ("a369ddc7-d168-4023-a889-988e226777e4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("22d632a3-3908-4297-8a4b-fae6cefbe55b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ObjectFlow.class;
    }

    @objid ("397f6c50-bdab-4b67-a3b3-0e7f9a137d69")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4d884ca3-2447-434f-9356-6dd4d6c636c4")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9e2db714-55ec-4a8a-9541-53ecfee44a5e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityEdge");
        this.registerFactory(new ObjectFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.transformationBehaviorAtt = new TransformationBehaviorSmAttribute();
        this.transformationBehaviorAtt.init("TransformationBehavior", this, String.class );
        registerAttribute(this.transformationBehaviorAtt);
        
        this.selectionBehaviorAtt = new SelectionBehaviorSmAttribute();
        this.selectionBehaviorAtt.init("SelectionBehavior", this, String.class );
        registerAttribute(this.selectionBehaviorAtt);
        
        this.isMultiCastAtt = new IsMultiCastSmAttribute();
        this.isMultiCastAtt.init("IsMultiCast", this, Boolean.class );
        registerAttribute(this.isMultiCastAtt);
        
        this.isMultiReceiveAtt = new IsMultiReceiveSmAttribute();
        this.isMultiReceiveAtt.init("IsMultiReceive", this, Boolean.class );
        registerAttribute(this.isMultiReceiveAtt);
        
        this.effectAtt = new EffectSmAttribute();
        this.effectAtt.init("Effect", this, ObjectFlowEffectKind.class );
        registerAttribute(this.effectAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("4d51eac2-182d-4120-81c2-4d60ebccb627")
    public SmAttribute getTransformationBehaviorAtt() {
        if (this.transformationBehaviorAtt == null) {
        	this.transformationBehaviorAtt = this.getAttributeDef("TransformationBehavior");
        }
        return this.transformationBehaviorAtt;
    }

    @objid ("ffdf36e9-801a-45e7-953a-e4608e1a195e")
    public SmAttribute getSelectionBehaviorAtt() {
        if (this.selectionBehaviorAtt == null) {
        	this.selectionBehaviorAtt = this.getAttributeDef("SelectionBehavior");
        }
        return this.selectionBehaviorAtt;
    }

    @objid ("6964de36-18f6-4b50-8ed7-91ae80ab1f51")
    public SmAttribute getIsMultiCastAtt() {
        if (this.isMultiCastAtt == null) {
        	this.isMultiCastAtt = this.getAttributeDef("IsMultiCast");
        }
        return this.isMultiCastAtt;
    }

    @objid ("c15fd998-9cce-45dd-8b4f-144ce0dd928a")
    public SmAttribute getIsMultiReceiveAtt() {
        if (this.isMultiReceiveAtt == null) {
        	this.isMultiReceiveAtt = this.getAttributeDef("IsMultiReceive");
        }
        return this.isMultiReceiveAtt;
    }

    @objid ("ff61e1dc-fa18-4dbb-b9bf-2a296a5ca56d")
    public SmAttribute getEffectAtt() {
        if (this.effectAtt == null) {
        	this.effectAtt = this.getAttributeDef("Effect");
        }
        return this.effectAtt;
    }

    @objid ("aaeb6d4e-15b7-4c4a-820a-9d9ffcfbd8da")
    private static class ObjectFlowObjectFactory implements ISmObjectFactory {
        @objid ("a969043a-463d-405f-b343-5dab7ead0e05")
        private ObjectFlowSmClass smClass;

        @objid ("47d67df5-0862-4a8c-86d2-065aede365a4")
        public ObjectFlowObjectFactory(ObjectFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("26b21dd9-51d8-4573-a825-2d7d67807c4b")
        @Override
        public ISmObjectData createData() {
            return new ObjectFlowData(this.smClass);
        }

        @objid ("7b185595-0318-4bf6-a070-52f5eb2d0335")
        @Override
        public SmObjectImpl createImpl() {
            return new ObjectFlowImpl();
        }

    }

    @objid ("3c49f57a-610e-4d67-8d90-510fb29a8a87")
    public static class TransformationBehaviorSmAttribute extends SmAttribute {
        @objid ("fde91757-130a-4ec9-9365-5919764f116e")
        public Object getValue(ISmObjectData data) {
            return ((ObjectFlowData) data).mTransformationBehavior;
        }

        @objid ("b4fc1c3f-8d25-49d3-a5ec-e45ff87df611")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectFlowData) data).mTransformationBehavior = value;
        }

    }

    @objid ("46ba9a0e-b113-44ae-ba24-dfd32748e21e")
    public static class SelectionBehaviorSmAttribute extends SmAttribute {
        @objid ("fa8898a6-b262-45d8-8f64-55c60a9999da")
        public Object getValue(ISmObjectData data) {
            return ((ObjectFlowData) data).mSelectionBehavior;
        }

        @objid ("aa55f3bc-ff24-4821-825e-218c13abdd8f")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectFlowData) data).mSelectionBehavior = value;
        }

    }

    @objid ("5cd5ab5e-6877-48af-99dd-9d60c4a39e77")
    public static class IsMultiCastSmAttribute extends SmAttribute {
        @objid ("f1b710b7-df14-4a8b-95a1-023eb44ca568")
        public Object getValue(ISmObjectData data) {
            return ((ObjectFlowData) data).mIsMultiCast;
        }

        @objid ("c30df63a-1337-42c6-96d5-de99f26a31f3")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectFlowData) data).mIsMultiCast = value;
        }

    }

    @objid ("cddeec42-a616-473d-acbf-ece2fe101593")
    public static class IsMultiReceiveSmAttribute extends SmAttribute {
        @objid ("12f262f4-cdf2-42ea-9fe1-b6232a099c98")
        public Object getValue(ISmObjectData data) {
            return ((ObjectFlowData) data).mIsMultiReceive;
        }

        @objid ("c6529dab-295b-4fb2-859d-662bdc84b03e")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectFlowData) data).mIsMultiReceive = value;
        }

    }

    @objid ("b689bdaf-7f0d-4a02-84a7-cf7d7e8867fb")
    public static class EffectSmAttribute extends SmAttribute {
        @objid ("c9388a33-0574-4652-b8fe-ce68c916d6bd")
        public Object getValue(ISmObjectData data) {
            return ((ObjectFlowData) data).mEffect;
        }

        @objid ("863992ca-5063-40c6-a68f-9956bf4b207d")
        public void setValue(ISmObjectData data, Object value) {
            ((ObjectFlowData) data).mEffect = value;
        }

    }

}
