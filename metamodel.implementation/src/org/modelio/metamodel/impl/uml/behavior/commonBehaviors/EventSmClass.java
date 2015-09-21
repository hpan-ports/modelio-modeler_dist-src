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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("05712d4f-4cfb-40cc-af04-edb94f0e9624")
public class EventSmClass extends ModelElementSmClass {
    @objid ("c2a1641a-a7fe-4880-89ee-4ec5fef10266")
    private SmAttribute expressionAtt;

    @objid ("2536d3ff-8ccd-49ed-89f0-80070b1a48c1")
    private SmAttribute kindAtt;

    @objid ("1f9ef58c-5612-4a2a-b83f-272a2647a108")
    private SmDependency triggeredDep;

    @objid ("832faeda-e069-4877-90e6-991f8210e849")
    private SmDependency modelDep;

    @objid ("11137216-31a4-40e6-bac0-510fe1512401")
    private SmDependency originDep;

    @objid ("057e0f84-04d6-484f-972a-f62be143b0b7")
    private SmDependency calledDep;

    @objid ("4c990e95-3f31-439c-90e2-ef3eeab3c5c6")
    private SmDependency composedDep;

    @objid ("216294ba-cee1-4770-91bd-89b5799a9996")
    public EventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0a2e3c09-708f-4d84-88fa-311ac6d9508a")
    @Override
    public String getName() {
        return "Event";
    }

    @objid ("a4e9f6dd-9031-4ffd-b434-cfad750827fc")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8d517c88-ac8b-4b74-b73c-41a37871c5da")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Event.class;
    }

    @objid ("c1aab1f1-4b3d-4888-a223-a6c50e63c44b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("6daabb49-ae19-4f5a-a17e-ef3dbb61fcc8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7c532d81-6dcb-440f-855e-6a2ed465e324")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new EventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.expressionAtt = new ExpressionSmAttribute();
        this.expressionAtt.init("Expression", this, String.class );
        registerAttribute(this.expressionAtt);
        
        this.kindAtt = new KindSmAttribute();
        this.kindAtt.init("Kind", this, EventType.class );
        registerAttribute(this.kindAtt);
        
        
        // Initialize and register the SmDependency
        this.triggeredDep = new TriggeredSmDependency();
        this.triggeredDep.init("Triggered", this, metamodel.getMClass("Transition"), 0, -1 );
        registerDependency(this.triggeredDep);
        
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.modelDep);
        
        this.originDep = new OriginSmDependency();
        this.originDep.init("Origin", this, metamodel.getMClass("State"), 0, -1 );
        registerDependency(this.originDep);
        
        this.calledDep = new CalledSmDependency();
        this.calledDep.init("Called", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledDep);
        
        this.composedDep = new ComposedSmDependency();
        this.composedDep.init("Composed", this, metamodel.getMClass("Behavior"), 1, 1 );
        registerDependency(this.composedDep);
    }

    @objid ("75e4d43c-9b5d-436a-a968-9ca978c94ff7")
    public SmAttribute getExpressionAtt() {
        if (this.expressionAtt == null) {
        	this.expressionAtt = this.getAttributeDef("Expression");
        }
        return this.expressionAtt;
    }

    @objid ("a6313d60-e064-434f-8787-24711e68b3eb")
    public SmAttribute getKindAtt() {
        if (this.kindAtt == null) {
        	this.kindAtt = this.getAttributeDef("Kind");
        }
        return this.kindAtt;
    }

    @objid ("550f0d3f-a759-47d2-a1e4-f97e3274cbd3")
    public SmDependency getTriggeredDep() {
        if (this.triggeredDep == null) {
        	this.triggeredDep = this.getDependencyDef("Triggered");
        }
        return this.triggeredDep;
    }

    @objid ("7a9fdf61-d301-4f33-9a0d-8e80b496275f")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("21a0de78-348f-4dd9-907e-4df2451c0c5f")
    public SmDependency getOriginDep() {
        if (this.originDep == null) {
        	this.originDep = this.getDependencyDef("Origin");
        }
        return this.originDep;
    }

    @objid ("e60f8213-a012-4b4c-8f67-f4d275eff30b")
    public SmDependency getCalledDep() {
        if (this.calledDep == null) {
        	this.calledDep = this.getDependencyDef("Called");
        }
        return this.calledDep;
    }

    @objid ("ce0fa52b-972c-494e-8769-b88e57bf6638")
    public SmDependency getComposedDep() {
        if (this.composedDep == null) {
        	this.composedDep = this.getDependencyDef("Composed");
        }
        return this.composedDep;
    }

    @objid ("6e1fb4be-6072-45ae-b74f-de398c56edf4")
    private static class EventObjectFactory implements ISmObjectFactory {
        @objid ("51dbf8f6-963c-43d0-8e12-9d6671949b8a")
        private EventSmClass smClass;

        @objid ("3f201498-32a9-4548-baa6-36e736298d04")
        public EventObjectFactory(EventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("2190b54f-6acd-4ab3-8b57-7e98d155da79")
        @Override
        public ISmObjectData createData() {
            return new EventData(this.smClass);
        }

        @objid ("55b55134-a759-43fa-ac9b-a2c65864125a")
        @Override
        public SmObjectImpl createImpl() {
            return new EventImpl();
        }

    }

    @objid ("08b1c2dc-82e9-47a5-98f6-0f3995e16329")
    public static class ExpressionSmAttribute extends SmAttribute {
        @objid ("4b247160-f546-4db7-9ceb-54145d6e792f")
        public Object getValue(ISmObjectData data) {
            return ((EventData) data).mExpression;
        }

        @objid ("9188e555-b030-4f9b-9ee4-c9572a4ca61f")
        public void setValue(ISmObjectData data, Object value) {
            ((EventData) data).mExpression = value;
        }

    }

    @objid ("ae3c1b2c-d507-4709-ac56-8ab46f0b0239")
    public static class KindSmAttribute extends SmAttribute {
        @objid ("b6851cbc-3db3-44be-9461-4b62cf2c8b7c")
        public Object getValue(ISmObjectData data) {
            return ((EventData) data).mKind;
        }

        @objid ("63f722d1-8018-411d-b3bd-a087431a89c6")
        public void setValue(ISmObjectData data, Object value) {
            ((EventData) data).mKind = value;
        }

    }

    @objid ("9e08462b-4bb5-4ade-990a-eefb973699a2")
    public static class TriggeredSmDependency extends SmMultipleDependency {
        @objid ("4047777a-8c49-451f-907f-736f7e78cfef")
        private SmDependency symetricDep;

        @objid ("11529588-31d7-4464-ad19-4d62658a4385")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EventData)data).mTriggered != null)? ((EventData)data).mTriggered:SmMultipleDependency.EMPTY;
        }

        @objid ("0c6176b1-d813-4fee-8142-09e93b88c8c2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EventData) data).mTriggered = values;
        }

        @objid ("755c99e1-9844-400f-9659-11cc6b7cf36f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getTriggerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7b6b3ea0-7155-4baa-aff7-3049d673a45f")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("38743a70-305b-4c73-ad24-26666e10d745")
        private SmDependency symetricDep;

        @objid ("b2ec6885-8257-41aa-82ad-426949febe91")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EventData) data).mModel;
        }

        @objid ("6e5a3319-fd14-4d49-adec-b4da5b9f1fda")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EventData) data).mModel = value;
        }

        @objid ("3f456c84-1386-4db6-8938-4185deafb45d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getEOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1d74d917-b35d-43eb-a561-66eeb57d3c6a")
    public static class OriginSmDependency extends SmMultipleDependency {
        @objid ("3009c5cd-c55f-40d7-aef5-512b19916e27")
        private SmDependency symetricDep;

        @objid ("3b1d8a27-02a4-46f3-96e3-e75190bb2a8b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((EventData)data).mOrigin != null)? ((EventData)data).mOrigin:SmMultipleDependency.EMPTY;
        }

        @objid ("98ed6a6c-a7b4-4dfe-bde7-9dabcb5adbce")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((EventData) data).mOrigin = values;
        }

        @objid ("46efb343-c02b-427f-8da6-33ca071fd02d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getDefferedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d1577a42-b961-45d1-b223-21a8f0ac29db")
    public static class CalledSmDependency extends SmSingleDependency {
        @objid ("2f2bd304-9408-493e-8d1a-1dc8c9a7be9d")
        private SmDependency symetricDep;

        @objid ("e0b08441-da2f-495f-b36c-9a75f12fd9d4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EventData) data).mCalled;
        }

        @objid ("890cc4a3-dc63-4fe7-b83a-d60de67f3003")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EventData) data).mCalled = value;
        }

        @objid ("93fb8807-6cc4-409f-8cd5-9d23499e4505")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getOccurenceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9e9331cf-2626-4743-8e9b-a86b4c1a968a")
    public static class ComposedSmDependency extends SmSingleDependency {
        @objid ("088b07b4-b667-4f31-9917-a8424a0d4d85")
        private SmDependency symetricDep;

        @objid ("2581b0d1-b750-40dc-adf4-d406917f66d4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((EventData) data).mComposed;
        }

        @objid ("1f263e5a-929e-4068-a98c-ae7425625477")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((EventData) data).mComposed = value;
        }

        @objid ("1dc9e113-abac-4640-bc38-276b40161da9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getEComponentDep();
            }
            return this.symetricDep;
        }

    }

}
