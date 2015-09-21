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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("6af4dd1b-0c08-431b-83a8-2f3b5e01d271")
public class MessageFlowSmClass extends ActivityEdgeSmClass {
    @objid ("5de29e21-3ac6-4f0f-b218-e993c3da74b5")
    private SmDependency targetPartitionDep;

    @objid ("07d5ff5b-bd10-4124-8806-fc31c93840ac")
    private SmDependency sourcePartitionDep;

    @objid ("ac396afb-03a4-4813-98de-b821e4b8263d")
    public MessageFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9fd5f2a1-021e-47d2-badf-fca099987287")
    @Override
    public String getName() {
        return "MessageFlow";
    }

    @objid ("abd53798-94ac-4f52-9662-5cac9d8a6c54")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a9f72de4-226a-44a4-83e5-6f58adbf7c93")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return MessageFlow.class;
    }

    @objid ("137f8ac1-e74c-40e4-a3f9-22048dc375e4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8c24f556-3524-44fe-ad52-4d7f3232f14c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("d4c7736f-8628-40c9-b1bc-c9fe19f64d7c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityEdge");
        this.registerFactory(new MessageFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.targetPartitionDep = new TargetPartitionSmDependency();
        this.targetPartitionDep.init("TargetPartition", this, metamodel.getMClass("ActivityPartition"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetPartitionDep);
        
        this.sourcePartitionDep = new SourcePartitionSmDependency();
        this.sourcePartitionDep.init("SourcePartition", this, metamodel.getMClass("ActivityPartition"), 0, 1 );
        registerDependency(this.sourcePartitionDep);
    }

    @objid ("005675c4-0363-4010-a84e-a6bacbb1d01b")
    public SmDependency getTargetPartitionDep() {
        if (this.targetPartitionDep == null) {
        	this.targetPartitionDep = this.getDependencyDef("TargetPartition");
        }
        return this.targetPartitionDep;
    }

    @objid ("fc7cbe90-e705-4f4f-85bc-0d9f63f43178")
    public SmDependency getSourcePartitionDep() {
        if (this.sourcePartitionDep == null) {
        	this.sourcePartitionDep = this.getDependencyDef("SourcePartition");
        }
        return this.sourcePartitionDep;
    }

    @objid ("3ac5b9b5-ed0e-46ca-b23b-f993126e2bdc")
    private static class MessageFlowObjectFactory implements ISmObjectFactory {
        @objid ("8ab78295-fb3e-494e-946d-7b70597173fb")
        private MessageFlowSmClass smClass;

        @objid ("a8ae97d5-4a22-468f-92a3-27072b8175ab")
        public MessageFlowObjectFactory(MessageFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("aa110163-33bc-4113-a320-ca4933f0608c")
        @Override
        public ISmObjectData createData() {
            return new MessageFlowData(this.smClass);
        }

        @objid ("512d541e-1578-4d0d-814e-cf89785dd88e")
        @Override
        public SmObjectImpl createImpl() {
            return new MessageFlowImpl();
        }

    }

    @objid ("f81b8953-5240-4939-8f79-fde8e3bda192")
    public static class TargetPartitionSmDependency extends SmSingleDependency {
        @objid ("5cf1812a-b4ef-47e5-8b55-661b2891e4aa")
        private SmDependency symetricDep;

        @objid ("143f00a0-a2e1-478f-a3cc-c1c92da1e124")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageFlowData) data).mTargetPartition;
        }

        @objid ("33be61e4-1b2b-4970-acc6-4a2bd20bd022")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageFlowData) data).mTargetPartition = value;
        }

        @objid ("9c6ae8db-45da-4dce-99a7-473e9b326cfd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getIncomingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cc1715ca-c28a-4cb2-8779-5b53392fa61a")
    public static class SourcePartitionSmDependency extends SmSingleDependency {
        @objid ("d3ae2c5e-4277-4f7e-a2fd-ade3657589c1")
        private SmDependency symetricDep;

        @objid ("a64d82c8-8292-4327-aee1-426d5a79f935")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((MessageFlowData) data).mSourcePartition;
        }

        @objid ("e76312e0-a398-445a-b6b0-4d6d40f53823")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((MessageFlowData) data).mSourcePartition = value;
        }

        @objid ("665cfef5-221c-4570-9ee6-b7ed81c820e9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getOutgoingDep();
            }
            return this.symetricDep;
        }

    }

}
