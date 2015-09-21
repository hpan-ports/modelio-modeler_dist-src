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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityGroupSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.MessageFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
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

@objid ("4a14a4a5-a6b6-4222-990c-bf3308b3811e")
public class ActivityPartitionSmClass extends ActivityGroupSmClass {
    @objid ("1fdedcba-dc8c-4cba-a717-f2550a951170")
    private SmAttribute isDimensionAtt;

    @objid ("7790ffdd-aa52-4b21-be48-3b58bffbfb31")
    private SmAttribute isExternalAtt;

    @objid ("c91f6f65-4b38-486a-ad8e-3b2512b1bc1b")
    private SmDependency representedDep;

    @objid ("3eec8fef-c10b-454d-96ba-377f0e3ab8a9")
    private SmDependency containedNodeDep;

    @objid ("a41cecdd-10d2-41cc-86fc-32ebc257b5c2")
    private SmDependency outgoingDep;

    @objid ("74cd393f-d72e-4070-9b48-56872ced88ca")
    private SmDependency superPartitionDep;

    @objid ("8e0e6f67-fb0b-4bb1-b482-5bfcfa6b6d7f")
    private SmDependency subPartitionDep;

    @objid ("df425dd2-379a-42d1-b5f9-010a16e9a0de")
    private SmDependency incomingDep;

    @objid ("31b44839-4e7e-473e-af4d-e6e0ea30e6ab")
    public ActivityPartitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("91db4129-8512-4c34-bb85-9332d871eaef")
    @Override
    public String getName() {
        return "ActivityPartition";
    }

    @objid ("f2e97e27-4662-4629-a2b1-b9217243272a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1a96ca3b-da6d-4eb1-8d72-e1793aad06f7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ActivityPartition.class;
    }

    @objid ("3263a9b2-f4b9-4c3d-93be-6567aace825d")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c55da4e8-279a-4f12-80b9-7cd76cc54c29")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f2a8f40b-e21b-4eea-9c58-46df6cd8adb8")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityGroup");
        this.registerFactory(new ActivityPartitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isDimensionAtt = new IsDimensionSmAttribute();
        this.isDimensionAtt.init("IsDimension", this, Boolean.class );
        registerAttribute(this.isDimensionAtt);
        
        this.isExternalAtt = new IsExternalSmAttribute();
        this.isExternalAtt.init("IsExternal", this, Boolean.class );
        registerAttribute(this.isExternalAtt);
        
        
        // Initialize and register the SmDependency
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
        
        this.containedNodeDep = new ContainedNodeSmDependency();
        this.containedNodeDep.init("ContainedNode", this, metamodel.getMClass("ActivityNode"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.containedNodeDep);
        
        this.outgoingDep = new OutgoingSmDependency();
        this.outgoingDep.init("Outgoing", this, metamodel.getMClass("MessageFlow"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.outgoingDep);
        
        this.superPartitionDep = new SuperPartitionSmDependency();
        this.superPartitionDep.init("SuperPartition", this, metamodel.getMClass("ActivityPartition"), 0, 1 );
        registerDependency(this.superPartitionDep);
        
        this.subPartitionDep = new SubPartitionSmDependency();
        this.subPartitionDep.init("SubPartition", this, metamodel.getMClass("ActivityPartition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subPartitionDep);
        
        this.incomingDep = new IncomingSmDependency();
        this.incomingDep.init("Incoming", this, metamodel.getMClass("MessageFlow"), 0, -1 );
        registerDependency(this.incomingDep);
    }

    @objid ("27163174-6700-4bbe-8dc1-e3cd528dba47")
    public SmAttribute getIsDimensionAtt() {
        if (this.isDimensionAtt == null) {
        	this.isDimensionAtt = this.getAttributeDef("IsDimension");
        }
        return this.isDimensionAtt;
    }

    @objid ("f6c473af-3b7d-4946-8af5-76732c4dedfe")
    public SmAttribute getIsExternalAtt() {
        if (this.isExternalAtt == null) {
        	this.isExternalAtt = this.getAttributeDef("IsExternal");
        }
        return this.isExternalAtt;
    }

    @objid ("c5c7f803-b007-466c-9a8d-4acda1da1853")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("e8348c68-87f9-4a4e-9294-aff4ebd635bf")
    public SmDependency getContainedNodeDep() {
        if (this.containedNodeDep == null) {
        	this.containedNodeDep = this.getDependencyDef("ContainedNode");
        }
        return this.containedNodeDep;
    }

    @objid ("0787ab31-3fa4-409b-bb78-2cc97eb4d18a")
    public SmDependency getOutgoingDep() {
        if (this.outgoingDep == null) {
        	this.outgoingDep = this.getDependencyDef("Outgoing");
        }
        return this.outgoingDep;
    }

    @objid ("119f3b69-6a08-47b4-8a5e-72dfebe082b5")
    public SmDependency getSuperPartitionDep() {
        if (this.superPartitionDep == null) {
        	this.superPartitionDep = this.getDependencyDef("SuperPartition");
        }
        return this.superPartitionDep;
    }

    @objid ("0339a4e5-fa57-42c1-a669-2416f182d505")
    public SmDependency getSubPartitionDep() {
        if (this.subPartitionDep == null) {
        	this.subPartitionDep = this.getDependencyDef("SubPartition");
        }
        return this.subPartitionDep;
    }

    @objid ("1cacc098-aedb-4ab4-92c3-7e5985a4744c")
    public SmDependency getIncomingDep() {
        if (this.incomingDep == null) {
        	this.incomingDep = this.getDependencyDef("Incoming");
        }
        return this.incomingDep;
    }

    @objid ("2e38ddfa-9345-408d-a607-7dcc5e6fee34")
    private static class ActivityPartitionObjectFactory implements ISmObjectFactory {
        @objid ("74f77916-0c50-4fbc-8ee4-bc4951e955a2")
        private ActivityPartitionSmClass smClass;

        @objid ("fe3c5024-b831-4691-9c2d-57f98283784c")
        public ActivityPartitionObjectFactory(ActivityPartitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("58cc3c82-d8ed-4fb8-b0be-1691b8019336")
        @Override
        public ISmObjectData createData() {
            return new ActivityPartitionData(this.smClass);
        }

        @objid ("8ea77888-dbaf-47f7-ba9f-5c737a29a404")
        @Override
        public SmObjectImpl createImpl() {
            return new ActivityPartitionImpl();
        }

    }

    @objid ("6046c175-6310-49c7-beca-344b04b8e475")
    public static class IsDimensionSmAttribute extends SmAttribute {
        @objid ("efad9663-ea91-43b7-8cc3-49d0991bf104")
        public Object getValue(ISmObjectData data) {
            return ((ActivityPartitionData) data).mIsDimension;
        }

        @objid ("37fc2229-13be-4780-aec0-a59dea8138ab")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityPartitionData) data).mIsDimension = value;
        }

    }

    @objid ("afd0b83b-648e-4786-9095-712f186d5d85")
    public static class IsExternalSmAttribute extends SmAttribute {
        @objid ("d303ddd0-82a3-4d40-8c71-b01200442006")
        public Object getValue(ISmObjectData data) {
            return ((ActivityPartitionData) data).mIsExternal;
        }

        @objid ("6baebf8f-5f00-469e-ad4f-666046cece75")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityPartitionData) data).mIsExternal = value;
        }

    }

    @objid ("4fd2835b-b0a8-43f2-85da-049aedfd6151")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("7800a4ff-3249-4efa-8629-1c9fbf3e1353")
        private SmDependency symetricDep;

        @objid ("d52cd7f5-7834-494d-bbb9-0280ab011ae0")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityPartitionData) data).mRepresented;
        }

        @objid ("df0ec693-b82b-4775-b1cd-4ec38e230022")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityPartitionData) data).mRepresented = value;
        }

        @objid ("79c2ba22-ffbe-4ab3-b4dc-787c5aa49a49")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getRepresentingPartitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8308e9cf-e13f-45ca-808e-84c78d572bd9")
    public static class ContainedNodeSmDependency extends SmMultipleDependency {
        @objid ("71e013da-d7cb-429e-87e8-152c9186a58a")
        private SmDependency symetricDep;

        @objid ("26e64731-0901-4749-abe5-388b580f8299")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityPartitionData)data).mContainedNode != null)? ((ActivityPartitionData)data).mContainedNode:SmMultipleDependency.EMPTY;
        }

        @objid ("46f2df4b-88de-4938-82d9-fd592b8ee443")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityPartitionData) data).mContainedNode = values;
        }

        @objid ("622cfdd2-05cc-4f61-8111-aba64ea8d9a9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getOwnerPartitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f8d0df61-1898-4aa4-8f1b-2326215d4fad")
    public static class OutgoingSmDependency extends SmMultipleDependency {
        @objid ("df0b8df8-b58d-4b37-8fe2-acdff1179da5")
        private SmDependency symetricDep;

        @objid ("d34a9a9f-5db7-4843-b539-147f32f43444")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityPartitionData)data).mOutgoing != null)? ((ActivityPartitionData)data).mOutgoing:SmMultipleDependency.EMPTY;
        }

        @objid ("86e28b70-488d-4694-83be-3b16905d2c65")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityPartitionData) data).mOutgoing = values;
        }

        @objid ("06acd90e-6524-483c-888b-062b5e93d283")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageFlowSmClass)this.getTarget()).getSourcePartitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("37bfb423-16e0-49cf-a4be-61ad234820ea")
    public static class SuperPartitionSmDependency extends SmSingleDependency {
        @objid ("833fefdb-5953-4766-ab08-0191354ba831")
        private SmDependency symetricDep;

        @objid ("554eec28-c121-414d-973a-5cdb4eb3632f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ActivityPartitionData) data).mSuperPartition;
        }

        @objid ("6a157d8d-fa7e-49e6-a8b5-447f8527aa41")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ActivityPartitionData) data).mSuperPartition = value;
        }

        @objid ("2d8f02a0-42c2-4024-87b7-6292b265a8fb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getSubPartitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1554a8ce-a00b-4e6d-89fe-c63fbbd10a1c")
    public static class SubPartitionSmDependency extends SmMultipleDependency {
        @objid ("21d12851-8e8a-4479-b400-43b755886c56")
        private SmDependency symetricDep;

        @objid ("5c86c65f-046d-44d5-9d7e-2bb620c99aea")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityPartitionData)data).mSubPartition != null)? ((ActivityPartitionData)data).mSubPartition:SmMultipleDependency.EMPTY;
        }

        @objid ("b9d0b3cb-cc3f-4de2-a3c8-d1797b709ae1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityPartitionData) data).mSubPartition = values;
        }

        @objid ("3b7593eb-46af-4840-bc09-e6a2d24f7f48")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getSuperPartitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3a1da99f-c0e6-48da-80f9-40a6b984afe6")
    public static class IncomingSmDependency extends SmMultipleDependency {
        @objid ("8fbaa6ab-489f-444a-88e5-6d5ffd143f2d")
        private SmDependency symetricDep;

        @objid ("35f35fe4-d592-4cfc-9a01-0df50db67153")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityPartitionData)data).mIncoming != null)? ((ActivityPartitionData)data).mIncoming:SmMultipleDependency.EMPTY;
        }

        @objid ("ce7c9522-5230-4bd5-88bc-dd2a29969289")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityPartitionData) data).mIncoming = values;
        }

        @objid ("2f6e119c-b76a-4fd0-93fb-1b052e9fc831")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageFlowSmClass)this.getTarget()).getTargetPartitionDep();
            }
            return this.symetricDep;
        }

    }

}
