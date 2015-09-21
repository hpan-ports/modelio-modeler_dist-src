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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("bc768fdd-89d5-45c3-badd-085d29c274f9")
public class AcceptSignalActionSmClass extends ActivityActionSmClass {
    @objid ("08aa1260-ab9f-4e78-845a-a270786200ff")
    private SmDependency acceptedDep;

    @objid ("358eb91e-f11f-4222-8361-fe73594c0060")
    public AcceptSignalActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("116e3ce9-a723-44f6-b839-ca353f7160a8")
    @Override
    public String getName() {
        return "AcceptSignalAction";
    }

    @objid ("825759d1-0455-4255-a399-a0add83607f4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c1111d56-3a0d-4c2a-8a93-6f28b0807531")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AcceptSignalAction.class;
    }

    @objid ("9d83d5b4-d603-4920-b2c9-8161b90ed4be")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("87050db3-d14e-4697-bdaf-6b710871611e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8c72cbc4-2b1e-461e-b138-c47b22cc7353")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new AcceptSignalActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.acceptedDep = new AcceptedSmDependency();
        this.acceptedDep.init("Accepted", this, metamodel.getMClass("Signal"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.acceptedDep);
    }

    @objid ("c421cf3b-1d4d-4a00-ba53-fb5e093f348d")
    public SmDependency getAcceptedDep() {
        if (this.acceptedDep == null) {
        	this.acceptedDep = this.getDependencyDef("Accepted");
        }
        return this.acceptedDep;
    }

    @objid ("44709471-ea05-449b-a51b-506456fd5904")
    private static class AcceptSignalActionObjectFactory implements ISmObjectFactory {
        @objid ("4eeef43c-0d43-4721-8ab0-9562313a8fd7")
        private AcceptSignalActionSmClass smClass;

        @objid ("588af72d-b6e1-4d41-8859-f88afef9856c")
        public AcceptSignalActionObjectFactory(AcceptSignalActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("06b45125-8232-42bd-96c1-b346fa56a0eb")
        @Override
        public ISmObjectData createData() {
            return new AcceptSignalActionData(this.smClass);
        }

        @objid ("563f88c1-ebca-4617-843e-d5f30a8b7021")
        @Override
        public SmObjectImpl createImpl() {
            return new AcceptSignalActionImpl();
        }

    }

    @objid ("4f6ea089-ab8a-463c-aeed-94096273f871")
    public static class AcceptedSmDependency extends SmMultipleDependency {
        @objid ("0c05eb15-341a-4c1b-bc2b-87874562db4a")
        private SmDependency symetricDep;

        @objid ("072b5221-f048-4269-8cff-d08a34490026")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AcceptSignalActionData)data).mAccepted != null)? ((AcceptSignalActionData)data).mAccepted:SmMultipleDependency.EMPTY;
        }

        @objid ("0cb08b19-d621-47eb-83e0-fe1e11f26ae0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AcceptSignalActionData) data).mAccepted = values;
        }

        @objid ("f9d86d9a-74d5-4cd1-afba-8a6d28d19bfa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getReceiverDep();
            }
            return this.symetricDep;
        }

    }

}
