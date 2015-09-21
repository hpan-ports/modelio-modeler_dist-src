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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivitySmClass;
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

@objid ("de8fea2f-6f2e-4aed-8b9d-e955335a3d26")
public class BpmnTaskSmClass extends BpmnActivitySmClass {
    @objid ("0b17435f-06ed-49d3-a83f-03443a321563")
    private SmAttribute isGlobalAtt;

    @objid ("d9f16965-e704-425e-9b05-0e939b59c03c")
    private SmDependency callerDep;

    @objid ("b4f6e599-581a-4345-a288-b7f08e4fad69")
    public BpmnTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("462d3d49-0509-4745-942e-ba013af90a1d")
    @Override
    public String getName() {
        return "BpmnTask";
    }

    @objid ("2f629072-edfd-41cb-b5f7-2eb812e36327")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("74bdaae7-9f5a-4c99-be91-48d547ab0928")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnTask.class;
    }

    @objid ("5656475d-72ed-40d5-8f0b-a9b3f09a8598")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("0d9c42ff-9a2e-4343-b3a8-00d72b46a255")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("1c80b1fd-a2bc-4257-bd44-b641bce9300c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnActivity");
        this.registerFactory(new BpmnTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isGlobalAtt = new IsGlobalSmAttribute();
        this.isGlobalAtt.init("IsGlobal", this, Boolean.class );
        registerAttribute(this.isGlobalAtt);
        
        
        // Initialize and register the SmDependency
        this.callerDep = new CallerSmDependency();
        this.callerDep.init("Caller", this, metamodel.getMClass("BpmnCallActivity"), 0, -1 );
        registerDependency(this.callerDep);
    }

    @objid ("bfa79bed-a6bd-428b-8658-4df83fd4cd79")
    public SmAttribute getIsGlobalAtt() {
        if (this.isGlobalAtt == null) {
        	this.isGlobalAtt = this.getAttributeDef("IsGlobal");
        }
        return this.isGlobalAtt;
    }

    @objid ("45099383-4241-4cf3-a82f-baae5b8e2474")
    public SmDependency getCallerDep() {
        if (this.callerDep == null) {
        	this.callerDep = this.getDependencyDef("Caller");
        }
        return this.callerDep;
    }

    @objid ("3f999617-e63d-4740-b151-bab8b9eb7110")
    private static class BpmnTaskObjectFactory implements ISmObjectFactory {
        @objid ("dae8869d-335d-491e-a1a7-104a1d62fd99")
        private BpmnTaskSmClass smClass;

        @objid ("e2d0b0c9-f352-4e15-ad07-57998e677863")
        public BpmnTaskObjectFactory(BpmnTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c43b4b9b-4751-452c-9cea-6f354b78a928")
        @Override
        public ISmObjectData createData() {
            return new BpmnTaskData(this.smClass);
        }

        @objid ("7004b02d-3eb3-491b-9c7f-73012ce8cb55")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnTaskImpl();
        }

    }

    @objid ("494f6ae7-14bc-48f0-90f6-193d7ff11f9c")
    public static class IsGlobalSmAttribute extends SmAttribute {
        @objid ("44519247-e257-4c4a-a095-d34a22e5d63b")
        public Object getValue(ISmObjectData data) {
            return ((BpmnTaskData) data).mIsGlobal;
        }

        @objid ("1eba45dd-8863-48a1-bfdd-63c2415a768f")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnTaskData) data).mIsGlobal = value;
        }

    }

    @objid ("6507a3be-d24a-46c4-a21e-c3b13cf0ea44")
    public static class CallerSmDependency extends SmMultipleDependency {
        @objid ("70f27861-68c6-44fc-a913-68c81fb77a7a")
        private SmDependency symetricDep;

        @objid ("c966b59b-6af8-466d-b3c9-81add1e02446")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnTaskData)data).mCaller != null)? ((BpmnTaskData)data).mCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("97171fd2-fbad-4731-94e6-303d8cd0f37c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnTaskData) data).mCaller = values;
        }

        @objid ("0cb83102-7ab2-4446-b44a-83100a10cb8b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCallActivitySmClass)this.getTarget()).getCalledGlobalTaskDep();
            }
            return this.symetricDep;
        }

    }

}
