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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionOccurenceSpecificationSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
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

@objid ("c7dca441-9d72-4635-ad32-c686fc16d434")
public class ExecutionSpecificationSmClass extends InteractionFragmentSmClass {
    @objid ("b1c08f13-d977-43f0-8adb-b107a4670495")
    private SmDependency finishDep;

    @objid ("3d28b9ba-1cdc-494e-bfc1-f9181a199b40")
    private SmDependency startDep;

    @objid ("1d3b7223-6b54-4eea-a485-d809a7093b71")
    public ExecutionSpecificationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("86976225-adcd-4407-91dd-da53860a9afa")
    @Override
    public String getName() {
        return "ExecutionSpecification";
    }

    @objid ("1b333e06-25cd-41cb-b26a-b8c71968cd27")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d7be6aa2-1d92-4c5b-be7a-8f9d569a0ed6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExecutionSpecification.class;
    }

    @objid ("51946cc8-d2d9-4d52-9902-3bb67afc4d0f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("18ab992c-580a-4071-b7e8-2b525a525c72")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("155f7967-c0ed-4494-8674-eb43ffc47e91")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionFragment");
        this.registerFactory(new ExecutionSpecificationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.finishDep = new FinishSmDependency();
        this.finishDep.init("Finish", this, metamodel.getMClass("ExecutionOccurenceSpecification"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.finishDep);
        
        this.startDep = new StartSmDependency();
        this.startDep.init("Start", this, metamodel.getMClass("ExecutionOccurenceSpecification"), 1, 1 );
        registerDependency(this.startDep);
    }

    @objid ("9d0ed80b-057c-4cce-af88-ef2bbf7d7937")
    public SmDependency getFinishDep() {
        if (this.finishDep == null) {
        	this.finishDep = this.getDependencyDef("Finish");
        }
        return this.finishDep;
    }

    @objid ("b7beefce-a021-46e6-83d3-bce3210ca82a")
    public SmDependency getStartDep() {
        if (this.startDep == null) {
        	this.startDep = this.getDependencyDef("Start");
        }
        return this.startDep;
    }

    @objid ("cf92717a-af4b-4ccd-b304-095f47924eb5")
    private static class ExecutionSpecificationObjectFactory implements ISmObjectFactory {
        @objid ("3c9ccce0-e672-4d39-8455-18b0ebf753c3")
        private ExecutionSpecificationSmClass smClass;

        @objid ("1c7cacb7-99a9-4375-bbe2-fb1d2a97db31")
        public ExecutionSpecificationObjectFactory(ExecutionSpecificationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("65e82e40-faf9-4a31-870c-dbcbc8c54181")
        @Override
        public ISmObjectData createData() {
            return new ExecutionSpecificationData(this.smClass);
        }

        @objid ("b7bcda6c-88e0-4c4f-85a8-f558cb1cc7d8")
        @Override
        public SmObjectImpl createImpl() {
            return new ExecutionSpecificationImpl();
        }

    }

    @objid ("83c7643f-eb22-4c38-b948-1233389edda0")
    public static class FinishSmDependency extends SmSingleDependency {
        @objid ("9efcbf7b-b07f-4b0b-b5f5-bdc3de8c504c")
        private SmDependency symetricDep;

        @objid ("849324f6-926b-4542-b085-3fbe52b875dc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExecutionSpecificationData) data).mFinish;
        }

        @objid ("b1f4f68c-a73d-4c06-93bb-ae9b10d16b84")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExecutionSpecificationData) data).mFinish = value;
        }

        @objid ("155e5aac-551e-4af1-ad1f-95cccdb7adbd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExecutionOccurenceSpecificationSmClass)this.getTarget()).getFinishedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6fa32389-8455-4e84-be3c-9f32a46e3108")
    public static class StartSmDependency extends SmSingleDependency {
        @objid ("a70be981-71cf-42e9-b1a4-6e7b4a840966")
        private SmDependency symetricDep;

        @objid ("82d3612c-5779-410b-a0a2-2109baf8bfab")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExecutionSpecificationData) data).mStart;
        }

        @objid ("9b2f081c-c519-4c7a-919a-2dce0864e7f4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExecutionSpecificationData) data).mStart = value;
        }

        @objid ("11b73d0b-8d90-45bf-9d76-ce4e31db339d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExecutionOccurenceSpecificationSmClass)this.getTarget()).getStartedDep();
            }
            return this.symetricDep;
        }

    }

}
