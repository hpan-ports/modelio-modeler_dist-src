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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0cf56662-cbd9-4437-9a92-9d3cc49f704a")
public class ActivitySmClass extends BehaviorSmClass {
    @objid ("d845ad7a-ca8a-41a7-abd7-5be2d99425f3")
    private SmAttribute isSingleExecutionAtt;

    @objid ("005be77c-9387-4ae8-a708-eaf9f7ebcf1c")
    private SmAttribute isReadOnlyAtt;

    @objid ("7a075e6f-0b7a-44af-b60b-898faae7b9b2")
    private SmDependency ownedGroupDep;

    @objid ("1931b8d0-35d5-45cb-abc1-52b9e52c02c1")
    private SmDependency ownedNodeDep;

    @objid ("05d3ff99-555e-49e7-9c8e-424b563686bf")
    public ActivitySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("64a298ed-1c59-41e7-9b7f-0a2f69e188ba")
    @Override
    public String getName() {
        return "Activity";
    }

    @objid ("6d086ba2-92e9-452f-8996-e646290b6649")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("da4aed38-821d-4dd0-aaef-4f3d6ee3d501")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Activity.class;
    }

    @objid ("fc199f10-869c-4289-afd9-08a831f03600")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("067ebdf7-f205-4d74-9c15-01720e6194da")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a0d0a513-bbfd-423f-9aec-fa440ba8b74d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new ActivityObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isSingleExecutionAtt = new IsSingleExecutionSmAttribute();
        this.isSingleExecutionAtt.init("IsSingleExecution", this, Boolean.class );
        registerAttribute(this.isSingleExecutionAtt);
        
        this.isReadOnlyAtt = new IsReadOnlySmAttribute();
        this.isReadOnlyAtt.init("IsReadOnly", this, Boolean.class );
        registerAttribute(this.isReadOnlyAtt);
        
        
        // Initialize and register the SmDependency
        this.ownedGroupDep = new OwnedGroupSmDependency();
        this.ownedGroupDep.init("OwnedGroup", this, metamodel.getMClass("ActivityGroup"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedGroupDep);
        
        this.ownedNodeDep = new OwnedNodeSmDependency();
        this.ownedNodeDep.init("OwnedNode", this, metamodel.getMClass("ActivityNode"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedNodeDep);
    }

    @objid ("f5daf986-f2c8-4a3e-a8ef-23080841bd7a")
    public SmAttribute getIsSingleExecutionAtt() {
        if (this.isSingleExecutionAtt == null) {
        	this.isSingleExecutionAtt = this.getAttributeDef("IsSingleExecution");
        }
        return this.isSingleExecutionAtt;
    }

    @objid ("d5b47986-40b6-48d0-82d6-4a47d706e152")
    public SmAttribute getIsReadOnlyAtt() {
        if (this.isReadOnlyAtt == null) {
        	this.isReadOnlyAtt = this.getAttributeDef("IsReadOnly");
        }
        return this.isReadOnlyAtt;
    }

    @objid ("e880ebc9-324d-43a0-b867-6632e58458d2")
    public SmDependency getOwnedGroupDep() {
        if (this.ownedGroupDep == null) {
        	this.ownedGroupDep = this.getDependencyDef("OwnedGroup");
        }
        return this.ownedGroupDep;
    }

    @objid ("e15952a1-3a9a-4097-8ed3-3f9a7ca90440")
    public SmDependency getOwnedNodeDep() {
        if (this.ownedNodeDep == null) {
        	this.ownedNodeDep = this.getDependencyDef("OwnedNode");
        }
        return this.ownedNodeDep;
    }

    @objid ("f4af8153-83e7-472a-a775-1813ce335e8e")
    private static class ActivityObjectFactory implements ISmObjectFactory {
        @objid ("385990f0-8d4a-4ed9-8aaf-5e2bbc632179")
        private ActivitySmClass smClass;

        @objid ("411b47f6-48d3-489e-9c0b-60d01cb14513")
        public ActivityObjectFactory(ActivitySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f0b0147e-99c3-413d-b829-1d0fe188ba4c")
        @Override
        public ISmObjectData createData() {
            return new ActivityData(this.smClass);
        }

        @objid ("decfd2a4-7bdb-42f0-9e97-4e8ac0636495")
        @Override
        public SmObjectImpl createImpl() {
            return new ActivityImpl();
        }

    }

    @objid ("6bb01dba-8ae6-46f9-9739-bc3d4f5d638f")
    public static class IsSingleExecutionSmAttribute extends SmAttribute {
        @objid ("79fcc687-fca9-45c5-9694-002f29d72a63")
        public Object getValue(ISmObjectData data) {
            return ((ActivityData) data).mIsSingleExecution;
        }

        @objid ("ed297494-fe1c-4fd9-99c8-3b8f1757168b")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityData) data).mIsSingleExecution = value;
        }

    }

    @objid ("1492cd86-e5de-4421-84da-d5dfecf0f0da")
    public static class IsReadOnlySmAttribute extends SmAttribute {
        @objid ("55502842-4818-4fb5-b700-2189416baab8")
        public Object getValue(ISmObjectData data) {
            return ((ActivityData) data).mIsReadOnly;
        }

        @objid ("28c54016-d9a9-42dd-8fb1-8268fd10a559")
        public void setValue(ISmObjectData data, Object value) {
            ((ActivityData) data).mIsReadOnly = value;
        }

    }

    @objid ("8b8bd793-b7cb-4941-93e5-c078dab4f2c9")
    public static class OwnedGroupSmDependency extends SmMultipleDependency {
        @objid ("b296ace2-25d2-499a-8a55-b7d20d06829f")
        private SmDependency symetricDep;

        @objid ("a96e6b9b-34e7-45d8-9906-1d402a650946")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityData)data).mOwnedGroup != null)? ((ActivityData)data).mOwnedGroup:SmMultipleDependency.EMPTY;
        }

        @objid ("f2126726-a74f-4579-8ffe-9e0924ccaa04")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityData) data).mOwnedGroup = values;
        }

        @objid ("f859abeb-a894-4f14-b1c7-ddf9335baa5c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityGroupSmClass)this.getTarget()).getInActivityDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b5bd84b2-b1aa-44d0-89ef-8fbb6e50ecc4")
    public static class OwnedNodeSmDependency extends SmMultipleDependency {
        @objid ("9dbe923d-c130-4b9d-8519-ca3a70aa59f1")
        private SmDependency symetricDep;

        @objid ("d9503b3d-d13c-43b2-89eb-b9bcb6429460")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ActivityData)data).mOwnedNode != null)? ((ActivityData)data).mOwnedNode:SmMultipleDependency.EMPTY;
        }

        @objid ("dd9f3fcc-8aa0-4b99-9eab-edd2f5b17ca4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ActivityData) data).mOwnedNode = values;
        }

        @objid ("65ede45d-2509-4575-bcfa-6cd99b381c61")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
