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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionSpecificationSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
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

@objid ("06fe4006-f9b7-4e49-920f-8f0fd75a1fdd")
public class ExecutionOccurenceSpecificationSmClass extends MessageEndSmClass {
    @objid ("7d97235a-7c55-4eda-85b1-01df797445c8")
    private SmDependency finishedDep;

    @objid ("4b411d12-a4bb-4f2e-99d0-f16695c4d4a0")
    private SmDependency startedDep;

    @objid ("da7dbe17-f34c-4bb9-8670-a0b2fa6882f4")
    public ExecutionOccurenceSpecificationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a07da6fd-4391-4346-b5a2-432a12fd3048")
    @Override
    public String getName() {
        return "ExecutionOccurenceSpecification";
    }

    @objid ("3f0271d9-282e-4d2a-802f-b28b4367ac31")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e378e47d-d61a-4eed-82af-82759ddfff1f")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExecutionOccurenceSpecification.class;
    }

    @objid ("87293971-bbf2-49b0-b64b-5af79c320919")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b9c512ca-a6d1-4833-acc9-0d7374be11e3")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("21e83bf6-ca3b-44bb-ab43-34043d32e24b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("MessageEnd");
        this.registerFactory(new ExecutionOccurenceSpecificationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.finishedDep = new FinishedSmDependency();
        this.finishedDep.init("Finished", this, metamodel.getMClass("ExecutionSpecification"), 0, 1 , SmDirective.SMCDTODELETE);
        registerDependency(this.finishedDep);
        
        this.startedDep = new StartedSmDependency();
        this.startedDep.init("Started", this, metamodel.getMClass("ExecutionSpecification"), 0, 1 , SmDirective.SMCDPARTOF, SmDirective.SMCDTODELETE);
        registerDependency(this.startedDep);
    }

    @objid ("6b153531-47e5-4649-81ba-630ffd0317cb")
    public SmDependency getFinishedDep() {
        if (this.finishedDep == null) {
        	this.finishedDep = this.getDependencyDef("Finished");
        }
        return this.finishedDep;
    }

    @objid ("e98086f1-b128-4c59-a7da-05aeb21cf2ba")
    public SmDependency getStartedDep() {
        if (this.startedDep == null) {
        	this.startedDep = this.getDependencyDef("Started");
        }
        return this.startedDep;
    }

    @objid ("dac866b4-ed61-4ba4-9aa4-d91b0b93a4ee")
    private static class ExecutionOccurenceSpecificationObjectFactory implements ISmObjectFactory {
        @objid ("7df1259e-6699-4152-befc-3a34537811f6")
        private ExecutionOccurenceSpecificationSmClass smClass;

        @objid ("0467b520-1748-43df-a3d8-86aeb342b7c0")
        public ExecutionOccurenceSpecificationObjectFactory(ExecutionOccurenceSpecificationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a3b7e38b-9060-404c-8fcc-d8c46fe6bc2a")
        @Override
        public ISmObjectData createData() {
            return new ExecutionOccurenceSpecificationData(this.smClass);
        }

        @objid ("46af2391-fb7f-492b-bd21-321f62635739")
        @Override
        public SmObjectImpl createImpl() {
            return new ExecutionOccurenceSpecificationImpl();
        }

    }

    @objid ("456ce320-84e2-4072-b801-22cdd8d85b39")
    public static class FinishedSmDependency extends SmSingleDependency {
        @objid ("14e5492b-f96d-4fd7-9b4f-ee2970407ee4")
        private SmDependency symetricDep;

        @objid ("9b7e72ed-3856-4583-a5a1-125691a1f5df")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExecutionOccurenceSpecificationData) data).mFinished;
        }

        @objid ("edbf8731-bd81-4c1f-87a6-21ae9d7c071a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExecutionOccurenceSpecificationData) data).mFinished = value;
        }

        @objid ("2a6a8789-1b78-4185-9e90-312135c82ece")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExecutionSpecificationSmClass)this.getTarget()).getFinishDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ae0e162e-825e-4116-9e9f-19220655649b")
    public static class StartedSmDependency extends SmSingleDependency {
        @objid ("93d21392-b024-4b37-8e3c-ec1889b4dcac")
        private SmDependency symetricDep;

        @objid ("6dc30330-6498-4f5f-b65b-719699977a71")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExecutionOccurenceSpecificationData) data).mStarted;
        }

        @objid ("bf614a5a-2077-4dea-b247-4e02a6b497a9")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExecutionOccurenceSpecificationData) data).mStarted = value;
        }

        @objid ("c53557e6-383f-4927-b6c3-485c66f8462f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExecutionSpecificationSmClass)this.getTarget()).getStartDep();
            }
            return this.symetricDep;
        }

    }

}
