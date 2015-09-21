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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
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

@objid ("a68b21b3-a195-4b30-a47c-2032fc3d33f5")
public class SendSignalActionSmClass extends ActivityActionSmClass {
    @objid ("1be50f44-ce26-4125-bd0c-e35775ba4255")
    private SmDependency sentDep;

    @objid ("198ccfcc-5ae7-4660-8336-9d12e53819c5")
    public SendSignalActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b9856325-28ff-43f0-95f8-3a5c0f81148d")
    @Override
    public String getName() {
        return "SendSignalAction";
    }

    @objid ("501b10fd-e5ef-419d-8917-001a16e3da52")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e593842c-5ba4-44f8-80e9-49e693c03562")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return SendSignalAction.class;
    }

    @objid ("7f87fa0e-718f-44f3-965b-09cd8e1af81f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("52108ea6-4d65-4ecc-868f-53b82575fa26")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("683a7b69-9904-4663-910b-24aeb9304750")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new SendSignalActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.sentDep = new SentSmDependency();
        this.sentDep.init("Sent", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sentDep);
    }

    @objid ("cbb3f335-2fa8-47cf-a015-15abc244bde8")
    public SmDependency getSentDep() {
        if (this.sentDep == null) {
        	this.sentDep = this.getDependencyDef("Sent");
        }
        return this.sentDep;
    }

    @objid ("4976361b-a036-44c3-992a-9247d5bdc040")
    private static class SendSignalActionObjectFactory implements ISmObjectFactory {
        @objid ("fd64c2f3-7318-4766-9649-973995bf4b7f")
        private SendSignalActionSmClass smClass;

        @objid ("90b671e9-d307-42a7-bfbb-c90cc3efdfb9")
        public SendSignalActionObjectFactory(SendSignalActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4fd399e4-943e-40ec-a9ab-8efb85bf087d")
        @Override
        public ISmObjectData createData() {
            return new SendSignalActionData(this.smClass);
        }

        @objid ("a04f3336-202d-49c0-b5c6-92a09a8afdc2")
        @Override
        public SmObjectImpl createImpl() {
            return new SendSignalActionImpl();
        }

    }

    @objid ("3647d518-b816-438e-94ea-32b40501dc28")
    public static class SentSmDependency extends SmSingleDependency {
        @objid ("993aa5d2-4fe5-45e5-b101-4558c258e175")
        private SmDependency symetricDep;

        @objid ("ed219e03-4d6a-4958-bda8-ac5653adb518")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SendSignalActionData) data).mSent;
        }

        @objid ("3b5f47c6-06a7-4a13-a1a2-58a60dea7d9d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SendSignalActionData) data).mSent = value;
        }

        @objid ("5d38b4a1-5cd3-46a8-ad6b-53f17fe46172")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getSenderDep();
            }
            return this.symetricDep;
        }

    }

}
