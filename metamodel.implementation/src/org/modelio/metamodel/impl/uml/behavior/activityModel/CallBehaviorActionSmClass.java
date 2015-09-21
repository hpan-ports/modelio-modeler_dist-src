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
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
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

@objid ("352b8b30-069d-4357-94ed-0f8b4e7fd2a7")
public class CallBehaviorActionSmClass extends CallActionSmClass {
    @objid ("7ca5f8b8-03e9-4460-954b-6717dfedbc96")
    private SmDependency calledDep;

    @objid ("0bad2a87-c32c-410e-834b-0e90a8a8e927")
    public CallBehaviorActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4f15f8f6-44a7-4046-9c90-55af3348d342")
    @Override
    public String getName() {
        return "CallBehaviorAction";
    }

    @objid ("92155709-a18e-4719-881c-723b4d518fd7")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("34da2ae2-6e77-4b2d-8c52-b6a87eab531a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CallBehaviorAction.class;
    }

    @objid ("df6d4440-d669-44bf-92e6-42ec678c3628")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a2ef611f-8553-48e0-9a09-ec8a45114bb5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("71f3f74a-b994-475f-9816-92deedd549d3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("CallAction");
        this.registerFactory(new CallBehaviorActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.calledDep = new CalledSmDependency();
        this.calledDep.init("Called", this, metamodel.getMClass("Behavior"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledDep);
    }

    @objid ("a8d52ad1-50be-4533-9fff-d2284cfb8592")
    public SmDependency getCalledDep() {
        if (this.calledDep == null) {
        	this.calledDep = this.getDependencyDef("Called");
        }
        return this.calledDep;
    }

    @objid ("8f620617-27bf-4d16-8cd2-2b9318e3a118")
    private static class CallBehaviorActionObjectFactory implements ISmObjectFactory {
        @objid ("dd0aee62-93f3-448c-80c6-ff37309cf519")
        private CallBehaviorActionSmClass smClass;

        @objid ("96b8aa3b-3f95-4cc3-9ee2-e8e2fde8e20d")
        public CallBehaviorActionObjectFactory(CallBehaviorActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9ba0fb87-fcd3-4c2c-8cda-601f840d5821")
        @Override
        public ISmObjectData createData() {
            return new CallBehaviorActionData(this.smClass);
        }

        @objid ("76657a3e-c5e4-42fb-be4f-33be62c7eeaf")
        @Override
        public SmObjectImpl createImpl() {
            return new CallBehaviorActionImpl();
        }

    }

    @objid ("a1d5b9fa-474b-4738-b8e6-244ea99a67c6")
    public static class CalledSmDependency extends SmSingleDependency {
        @objid ("b4eee25e-646a-416e-843d-9e4d8af42cd4")
        private SmDependency symetricDep;

        @objid ("3f4c6898-94a3-49b3-8f31-837e530b73b7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CallBehaviorActionData) data).mCalled;
        }

        @objid ("1ee23484-3d31-4bd5-b533-f035a3c5cad4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CallBehaviorActionData) data).mCalled = value;
        }

        @objid ("97f3c0af-4720-4ac0-867b-616a8f1460ea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getCallerDep();
            }
            return this.symetricDep;
        }

    }

}
