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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f5cae989-99d6-4bea-a855-1f1a95220a78")
public class StateVertexSmClass extends ModelElementSmClass {
    @objid ("f9e526cc-6b0e-4b55-89bd-d79dbff017b9")
    private SmDependency outGoingDep;

    @objid ("6eeb630f-1377-4d5a-8ee5-25d6d91f35fa")
    private SmDependency incomingDep;

    @objid ("4f49c52f-b92a-49e2-9cc3-2ca1734f9b21")
    private SmDependency parentDep;

    @objid ("0c48b803-14dd-4a07-8f50-3f54293d3f8c")
    public StateVertexSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("2ffeee03-67d2-4a92-bac2-8884f850101e")
    @Override
    public String getName() {
        return "StateVertex";
    }

    @objid ("66c978e6-0e67-4750-8f96-1b0b0b63f380")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("293bd5e9-8f80-4d0c-9310-d5396ea5f7ed")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StateVertex.class;
    }

    @objid ("80f73e14-928d-4821-9cc6-987000a19849")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("82f8e9bc-0b25-431e-a1d7-d6463ede7bc1")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("ce2db108-bc31-4a3e-8c7f-f1f2bb8c4ddb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new StateVertexObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.outGoingDep = new OutGoingSmDependency();
        this.outGoingDep.init("OutGoing", this, metamodel.getMClass("Transition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.outGoingDep);
        
        this.incomingDep = new IncomingSmDependency();
        this.incomingDep.init("Incoming", this, metamodel.getMClass("Transition"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.incomingDep);
        
        this.parentDep = new ParentSmDependency();
        this.parentDep.init("Parent", this, metamodel.getMClass("Region"), 0, 1 );
        registerDependency(this.parentDep);
    }

    @objid ("a04e0fc6-6588-4258-acfb-45ffbe73ff0d")
    public SmDependency getOutGoingDep() {
        if (this.outGoingDep == null) {
        	this.outGoingDep = this.getDependencyDef("OutGoing");
        }
        return this.outGoingDep;
    }

    @objid ("ce5212a6-c550-4722-8adf-19c4682e0a0f")
    public SmDependency getIncomingDep() {
        if (this.incomingDep == null) {
        	this.incomingDep = this.getDependencyDef("Incoming");
        }
        return this.incomingDep;
    }

    @objid ("9aed69af-f7d3-4487-a043-d71f88c415fa")
    public SmDependency getParentDep() {
        if (this.parentDep == null) {
        	this.parentDep = this.getDependencyDef("Parent");
        }
        return this.parentDep;
    }

    @objid ("a9634a26-b651-416d-a889-8dd7690269ac")
    private static class StateVertexObjectFactory implements ISmObjectFactory {
        @objid ("54e3ecc5-55f2-4d79-b72f-eecf956523e7")
        private StateVertexSmClass smClass;

        @objid ("b8ef4691-607c-4c8f-af9d-ef8cfdec216a")
        public StateVertexObjectFactory(StateVertexSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e7f0ab97-ced6-4ddd-bb79-5999d0ca7796")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("c1b0fb11-997c-42e5-ace1-27628607ccff")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("7fb99939-d96c-432a-9aaf-9591f94474f9")
    public static class OutGoingSmDependency extends SmMultipleDependency {
        @objid ("6ba247da-2a30-4e4b-b6dc-3ed56e9c99c2")
        private SmDependency symetricDep;

        @objid ("34458912-3a9c-466e-8e04-6f1c31f918b4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateVertexData)data).mOutGoing != null)? ((StateVertexData)data).mOutGoing:SmMultipleDependency.EMPTY;
        }

        @objid ("c6f98488-e7e3-4a34-92c8-5be4dfb3e4e4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateVertexData) data).mOutGoing = values;
        }

        @objid ("24c09b32-3e99-4858-bf3d-02fbe1337a86")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6bd2a1b8-4093-42b9-98c5-60bb005814cb")
    public static class IncomingSmDependency extends SmMultipleDependency {
        @objid ("c58c9895-bae1-4a6f-88ed-8231e412106a")
        private SmDependency symetricDep;

        @objid ("578d858b-b173-4f64-94f3-0cc0abd922ac")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateVertexData)data).mIncoming != null)? ((StateVertexData)data).mIncoming:SmMultipleDependency.EMPTY;
        }

        @objid ("2c694cfa-d1d9-4bfe-aa19-c6507a5b6efa")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateVertexData) data).mIncoming = values;
        }

        @objid ("fa181105-a086-4dc3-af43-969e6561bd58")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("336879dd-dd9c-4e00-adb7-47c37f39719c")
    public static class ParentSmDependency extends SmSingleDependency {
        @objid ("6000e7d6-f696-44e3-8560-9a7559de7e1f")
        private SmDependency symetricDep;

        @objid ("3315b60f-92c8-4a4b-b163-8a51c0168df2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StateVertexData) data).mParent;
        }

        @objid ("7da08ca4-d8be-43bf-bc07-89b1e7391d77")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StateVertexData) data).mParent = value;
        }

        @objid ("1687f223-359b-45eb-aa2f-7da5268c171e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RegionSmClass)this.getTarget()).getSubDep();
            }
            return this.symetricDep;
        }

    }

}
