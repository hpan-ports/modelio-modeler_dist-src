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
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
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

@objid ("afb90f81-def5-4f04-bd0f-5ff0db63e929")
public class OutputPinSmClass extends PinSmClass {
    @objid ("af7ba310-b219-431e-86ca-e2be61893de9")
    private SmDependency outputingDep;

    @objid ("7ee11ee8-4ad9-4a6f-972b-d8b6f6abd420")
    public OutputPinSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("2f01abe2-3c34-4b83-bf09-978eb61954cd")
    @Override
    public String getName() {
        return "OutputPin";
    }

    @objid ("83b071c8-c3c8-40da-a4d8-ddec7c0140bb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("de86c361-0d70-456a-99ff-612214b79ab6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return OutputPin.class;
    }

    @objid ("85417264-80a6-4b39-97ab-35c1a499c0bd")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4b8974a4-7da3-4595-89a5-e73df0eb1102")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("97b51c0e-4942-4653-bb42-07d0d1b3b44f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Pin");
        this.registerFactory(new OutputPinObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.outputingDep = new OutputingSmDependency();
        this.outputingDep.init("Outputing", this, metamodel.getMClass("ActivityAction"), 0, 1 );
        registerDependency(this.outputingDep);
    }

    @objid ("8ceb81e9-6910-46dd-ac1d-c7cbc8222c89")
    public SmDependency getOutputingDep() {
        if (this.outputingDep == null) {
        	this.outputingDep = this.getDependencyDef("Outputing");
        }
        return this.outputingDep;
    }

    @objid ("70b4c8d2-dc82-4f99-87a9-34e2eb0958af")
    private static class OutputPinObjectFactory implements ISmObjectFactory {
        @objid ("989dd273-979e-4493-a925-db6ad961172a")
        private OutputPinSmClass smClass;

        @objid ("e3893331-bb30-485d-917b-f1727b247d04")
        public OutputPinObjectFactory(OutputPinSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c597d352-f41c-46cd-a61c-d5e149f27fd9")
        @Override
        public ISmObjectData createData() {
            return new OutputPinData(this.smClass);
        }

        @objid ("ae1e9e06-bcc3-4373-b56f-93543c1d520b")
        @Override
        public SmObjectImpl createImpl() {
            return new OutputPinImpl();
        }

    }

    @objid ("e5b8145f-d585-4416-9b7a-d926c6a26b82")
    public static class OutputingSmDependency extends SmSingleDependency {
        @objid ("016ddef2-e368-4b46-8bc3-536f4126c8aa")
        private SmDependency symetricDep;

        @objid ("e23d2131-fbcd-42f7-b55e-84b473bfe47c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((OutputPinData) data).mOutputing;
        }

        @objid ("ea24de57-b0ca-443a-abad-6bc32d530f90")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((OutputPinData) data).mOutputing = value;
        }

        @objid ("9726b4ce-3fd1-4094-8fa5-c0c457a324ba")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityActionSmClass)this.getTarget()).getOutputDep();
            }
            return this.symetricDep;
        }

    }

}
