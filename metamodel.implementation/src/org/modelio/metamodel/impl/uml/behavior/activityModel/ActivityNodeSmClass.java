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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivitySmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ClauseSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
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

@objid ("8d2f590b-0d3a-4c92-8c33-7c5fc66bec82")
public class ActivityNodeSmClass extends ModelElementSmClass {
    @objid ("b645dd11-7bc7-49a8-bfeb-3fefe69788ae")
    private SmDependency ownerDep;

    @objid ("fb4fd0e3-2d94-4929-b672-0e1478780d26")
    private SmDependency ownerPartitionDep;

    @objid ("01068bf9-fae9-4aa3-a6db-6ef544dc28e5")
    private SmDependency incomingDep;

    @objid ("69039dfa-bb22-4355-b382-b6b0f1c23c47")
    private SmDependency ownerClauseDep;

    @objid ("a5d2120a-4937-4f21-a08c-ee33790831b4")
    private SmDependency ownerNodeDep;

    @objid ("1db1358d-9e15-4ecf-b687-2b78acfa0765")
    private SmDependency outgoingDep;

    @objid ("f417847b-a228-42a9-abf7-96fb728a4969")
    public ActivityNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0fb411c8-6961-4438-ae90-0d748a7a7d26")
    @Override
    public String getName() {
        return "ActivityNode";
    }

    @objid ("451fcb59-c04c-410d-bb3d-a7ba4d1d68a9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6d5592db-1754-42a4-9ef0-3374a66d0dfc")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityNode.class;
    }

    @objid ("79432264-1112-4547-9039-8d8b712039ef")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d6bcceb5-f44e-45b2-85da-f7d62e4ab93e")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("fff0668b-ee7a-4cf9-b1c8-4bde32d36e2c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ActivityNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Activity"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.ownerPartitionDep = new OwnerPartitionSmDependency();
        this.ownerPartitionDep.init("OwnerPartition", this, metamodel.getMClass("ActivityPartition"), 0, 1 );
        registerDependency(this.ownerPartitionDep);
        
        this.incomingDep = new IncomingSmDependency();
        this.incomingDep.init("Incoming", this, metamodel.getMClass("ActivityEdge"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.incomingDep);
        
        this.ownerClauseDep = new OwnerClauseSmDependency();
        this.ownerClauseDep.init("OwnerClause", this, metamodel.getMClass("Clause"), 0, 1 );
        registerDependency(this.ownerClauseDep);
        
        this.ownerNodeDep = new OwnerNodeSmDependency();
        this.ownerNodeDep.init("OwnerNode", this, metamodel.getMClass("StructuredActivityNode"), 0, 1 );
        registerDependency(this.ownerNodeDep);
        
        this.outgoingDep = new OutgoingSmDependency();
        this.outgoingDep.init("Outgoing", this, metamodel.getMClass("ActivityEdge"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.outgoingDep);
    }

    @objid ("0c0b0ed2-04d2-42cc-84d0-2e3f02843506")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("dacd821e-9baf-4afa-a2f8-7a7cede3479a")
    public SmDependency getOwnerPartitionDep() {
        if (this.ownerPartitionDep == null) {
        	this.ownerPartitionDep = this.getDependencyDef("OwnerPartition");
        }
        return this.ownerPartitionDep;
    }

    @objid ("1724d405-9461-491e-820d-8da893d8019c")
    public SmDependency getIncomingDep() {
        if (this.incomingDep == null) {
        	this.incomingDep = this.getDependencyDef("Incoming");
        }
        return this.incomingDep;
    }

    @objid ("f95e0e1a-e556-485d-b91e-61c28a98821f")
    public SmDependency getOwnerClauseDep() {
        if (this.ownerClauseDep == null) {
        	this.ownerClauseDep = this.getDependencyDef("OwnerClause");
        }
        return this.ownerClauseDep;
    }

    @objid ("03031235-86cd-4ae6-94f8-3a7d3bda96ab")
    public SmDependency getOwnerNodeDep() {
        if (this.ownerNodeDep == null) {
        	this.ownerNodeDep = this.getDependencyDef("OwnerNode");
        }
        return this.ownerNodeDep;
    }

    @objid ("9727f54e-cc1e-498c-bc49-50576a18a206")
    public SmDependency getOutgoingDep() {
        if (this.outgoingDep == null) {
        	this.outgoingDep = this.getDependencyDef("Outgoing");
        }
        return this.outgoingDep;
    }

    @objid ("39c6259f-f94b-4d6f-9628-5cfcff71bbeb")
    private static class ActivityNodeObjectFactory implements ISmObjectFactory {
        @objid ("1f98c824-8890-4d37-a589-7e9a9052a295")
        private ActivityNodeSmClass smClass;

        @objid ("64928302-99c0-4476-a1d8-4b6e326fe2ea")
        public ActivityNodeObjectFactory(ActivityNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("26ff480c-d866-42fd-9796-fc796cac76ee")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("76e3aa96-15df-46a9-8119-7be8e90daf42")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("10923cee-73cf-40a6-877d-862a378fdff8")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("1760eebf-e552-4458-9596-17a33a6b2881")
        private SmDependency symetricDep;

        @objid ("a579b253-ae7c-4f8d-b6b9-0c4a64f7a5a5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityNodeData) data).mOwner;
        }

        @objid ("c497b3e3-387e-4b21-9621-01ac19b04c71")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityNodeData) data).mOwner = value;
        }

        @objid ("4817ede4-d76c-4a30-a5ec-49d4a455912b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivitySmClass)this.getTarget()).getOwnedNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4c76f29c-8cc3-4b19-aa2a-6a09c6ef75f6")
    public static class OwnerPartitionSmDependency extends SmSingleDependency {
        @objid ("f3276409-1574-49eb-9f6b-fe4e4e02106d")
        private SmDependency symetricDep;

        @objid ("4a63ec60-d070-4daa-a361-c7e576bb170d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityNodeData) data).mOwnerPartition;
        }

        @objid ("be8c8250-ab18-4b58-8536-a95957e2352f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityNodeData) data).mOwnerPartition = value;
        }

        @objid ("cc1e3678-9025-45bf-87e5-f8e28ae5d8d0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getContainedNodeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("44ab5fa7-2144-4241-8905-d4820aba639f")
    public static class IncomingSmDependency extends SmMultipleDependency {
        @objid ("dce992fb-42a5-467f-a77c-4f96345b9d0e")
        private SmDependency symetricDep;

        @objid ("e6fb45b3-8628-40b1-b243-ff3c0586e5a0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityNodeData)data).mIncoming != null)? ((ActivityNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
        }

        @objid ("0ee0113b-1cab-4126-8d7f-d503b71f91b6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityNodeData) data).mIncoming = values;
        }

        @objid ("4afffacc-80f4-4095-a967-0d463f189299")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityEdgeSmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("bcde9bfe-7750-4004-9de5-396dad975702")
    public static class OwnerClauseSmDependency extends SmSingleDependency {
        @objid ("d068d204-4ec1-4a3c-a826-337b9689b883")
        private SmDependency symetricDep;

        @objid ("ad1aeb18-71e1-4cd5-8063-4c2f6cc5fffa")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityNodeData) data).mOwnerClause;
        }

        @objid ("cd12e712-94c6-48de-8a6c-9adff80ccbd8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityNodeData) data).mOwnerClause = value;
        }

        @objid ("6e2bedd2-0c76-45b6-a0d4-28a2de0829b2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClauseSmClass)this.getTarget()).getBodyDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3105de26-5f86-44e2-bd80-c742a2718a41")
    public static class OwnerNodeSmDependency extends SmSingleDependency {
        @objid ("d51447af-9ea8-4b7e-8c79-2bb089829ae2")
        private SmDependency symetricDep;

        @objid ("873f74ae-77d9-441f-9a1f-f44d0104981e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityNodeData) data).mOwnerNode;
        }

        @objid ("1db59576-b403-4bef-baba-33773840e780")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityNodeData) data).mOwnerNode = value;
        }

        @objid ("bf97e4ff-ac69-49e9-95b2-5f91d570b3c8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StructuredActivityNodeSmClass)this.getTarget()).getBodyDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("74c2cc78-f61e-4b5a-957c-619a722ce8f6")
    public static class OutgoingSmDependency extends SmMultipleDependency {
        @objid ("026cb725-6fc4-4102-a491-642786eba259")
        private SmDependency symetricDep;

        @objid ("4278eafa-c40c-4144-94e1-c9d680a46aab")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityNodeData)data).mOutgoing != null)? ((ActivityNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
        }

        @objid ("1f3f040e-7271-4134-8077-054b276edcfd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityNodeData) data).mOutgoing = values;
        }

        @objid ("7b2cc23e-3d78-41fd-a5d5-ede778ae671d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityEdgeSmClass)this.getTarget()).getSourceDep();
            }
            return this.symetricDep;
        }

    }

}
