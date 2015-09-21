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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
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

@objid ("d745d283-1cfe-4a72-b6e7-c1e455ade573")
public class AcceptCallEventActionSmClass extends ActivityActionSmClass {
    @objid ("7def94b7-3cab-4b3d-b8cb-5ed92d22db7c")
    private SmDependency calledDep;

    @objid ("80d1922d-c462-493e-a050-cb98c4157d52")
    public AcceptCallEventActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("013025eb-1596-4d8d-a93e-c8856a2f8412")
    @Override
    public String getName() {
        return "AcceptCallEventAction";
    }

    @objid ("23d7b625-6c92-4bcb-970b-b1ced7c7eca3")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("875f43d2-203e-4753-8127-bee15490ce33")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AcceptCallEventAction.class;
    }

    @objid ("5b2fdee3-093c-4035-b727-be9e3340d1f3")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("3ad76212-fd73-4762-9354-69e10cb34a3a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("cedb889c-52a5-4cb0-85c4-f8948606733d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new AcceptCallEventActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.calledDep = new CalledSmDependency();
        this.calledDep.init("Called", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.calledDep);
    }

    @objid ("10909911-7778-40e0-b7c3-4bf2a386ab48")
    public SmDependency getCalledDep() {
        if (this.calledDep == null) {
        	this.calledDep = this.getDependencyDef("Called");
        }
        return this.calledDep;
    }

    @objid ("47626634-757f-415b-9c32-3d36e12cb025")
    private static class AcceptCallEventActionObjectFactory implements ISmObjectFactory {
        @objid ("41f4065c-1905-474b-b5dc-9b2207a346ad")
        private AcceptCallEventActionSmClass smClass;

        @objid ("ecf9b00b-bcf3-4bb0-b86f-6115fbd10f87")
        public AcceptCallEventActionObjectFactory(AcceptCallEventActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("93ecad79-787f-4950-9551-a2b0112eae14")
        @Override
        public ISmObjectData createData() {
            return new AcceptCallEventActionData(this.smClass);
        }

        @objid ("b1edffa5-5b5c-4299-b9e7-92ed3a004187")
        @Override
        public SmObjectImpl createImpl() {
            return new AcceptCallEventActionImpl();
        }

    }

    @objid ("3356f097-f12f-47bc-9dfa-6f4df723026f")
    public static class CalledSmDependency extends SmSingleDependency {
        @objid ("12fc800d-57ab-427e-a068-72d2908555ad")
        private SmDependency symetricDep;

        @objid ("cface328-46e6-4241-b233-a626e99ed001")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AcceptCallEventActionData) data).mCalled;
        }

        @objid ("975982ff-7cd6-4e05-a205-f641cbd5692d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AcceptCallEventActionData) data).mCalled = value;
        }

        @objid ("f50636bc-04cd-47d0-b323-0adb780bfc63")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getEntryPointActionDep();
            }
            return this.symetricDep;
        }

    }

}
