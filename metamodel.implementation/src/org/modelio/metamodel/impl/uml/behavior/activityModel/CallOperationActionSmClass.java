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
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
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

@objid ("173bd08a-e974-4c88-8f4b-06b784f080b2")
public class CallOperationActionSmClass extends CallActionSmClass {
    @objid ("1d02cf46-68c2-4e3d-9c60-e8b123633808")
    private SmDependency calledDep;

    @objid ("a31e5a82-1e51-4e6b-ac01-9c537b403063")
    public CallOperationActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("2b679570-4479-4abe-be7c-bc2973960fd5")
    @Override
    public String getName() {
        return "CallOperationAction";
    }

    @objid ("27596d38-d0b8-4f0b-b6d7-ec30281fe5f2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("89c84ecc-2299-445c-a673-91fc5b050f71")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CallOperationAction.class;
    }

    @objid ("433028a4-2820-4368-aefc-71ab877f3fc5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ba5ec59e-ba1a-4a60-8dac-0825c605abf3")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("cbbb393b-125f-4531-bbad-926a43ebe32e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("CallAction");
        this.registerFactory(new CallOperationActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.calledDep = new CalledSmDependency();
        this.calledDep.init("Called", this, metamodel.getMClass("Operation"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledDep);
    }

    @objid ("9865d91b-caf5-4df1-976b-6e8c4f3faa64")
    public SmDependency getCalledDep() {
        if (this.calledDep == null) {
        	this.calledDep = this.getDependencyDef("Called");
        }
        return this.calledDep;
    }

    @objid ("2c397ecb-e60e-42ab-b067-b32a983cfadf")
    private static class CallOperationActionObjectFactory implements ISmObjectFactory {
        @objid ("f274dfea-d011-4614-b25e-3b5ea8c1f8d0")
        private CallOperationActionSmClass smClass;

        @objid ("097eac23-2e3c-4570-a288-d9e91ce30eeb")
        public CallOperationActionObjectFactory(CallOperationActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4580f081-832e-46dd-8930-7d6720565688")
        @Override
        public ISmObjectData createData() {
            return new CallOperationActionData(this.smClass);
        }

        @objid ("09e3f9a3-e81d-4fc7-b642-cc4f26da840c")
        @Override
        public SmObjectImpl createImpl() {
            return new CallOperationActionImpl();
        }

    }

    @objid ("d8390e3f-1b73-41da-9616-3aa1437c6448")
    public static class CalledSmDependency extends SmSingleDependency {
        @objid ("c0eff771-e1b4-4e01-967b-464f241461af")
        private SmDependency symetricDep;

        @objid ("d0a7cd11-b584-44cf-b8cc-9cf8fe72cfcc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((CallOperationActionData) data).mCalled;
        }

        @objid ("49856d9b-64cd-42d9-920f-1cad781666f3")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((CallOperationActionData) data).mCalled = value;
        }

        @objid ("187222c0-5f7a-4f18-8c96-dcfa1c1110a0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getCallingActionDep();
            }
            return this.symetricDep;
        }

    }

}
