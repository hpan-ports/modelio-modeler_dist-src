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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
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

@objid ("40b17b88-05ab-4e0c-8b1f-d64f7c864a82")
public class BpmnLoopCharacteristicsSmClass extends BpmnBaseElementSmClass {
    @objid ("a2339e63-8713-4c36-81ab-03223f1fcd47")
    private SmDependency ownerActivityDep;

    @objid ("5bd9bb75-d1a6-4063-9fc5-69e038695dc8")
    public BpmnLoopCharacteristicsSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6ec8a41f-3c9f-4b04-86c5-a4873a96a1ae")
    @Override
    public String getName() {
        return "BpmnLoopCharacteristics";
    }

    @objid ("af7d5c8f-d6f1-4949-a740-0ef97594546e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("38839af7-673b-44a9-b268-f6ddfa2edffa")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnLoopCharacteristics.class;
    }

    @objid ("6cb6b381-3a07-42bb-bd8c-afc7886fd4e7")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("35d74f56-4d23-4d76-8290-0fca4c80fb31")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("42939c50-6c67-405c-a827-40ed7bf13010")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnLoopCharacteristicsObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownerActivityDep = new OwnerActivitySmDependency();
        this.ownerActivityDep.init("OwnerActivity", this, metamodel.getMClass("BpmnActivity"), 1, 1 );
        registerDependency(this.ownerActivityDep);
    }

    @objid ("4484afaa-ba32-4030-a4e3-ab802a440f9e")
    public SmDependency getOwnerActivityDep() {
        if (this.ownerActivityDep == null) {
        	this.ownerActivityDep = this.getDependencyDef("OwnerActivity");
        }
        return this.ownerActivityDep;
    }

    @objid ("7b60816b-ee2d-4d7a-8a23-d7e0bc675370")
    private static class BpmnLoopCharacteristicsObjectFactory implements ISmObjectFactory {
        @objid ("54dd64cc-c9fd-462d-a3a8-4767f4df9639")
        private BpmnLoopCharacteristicsSmClass smClass;

        @objid ("8f4a3872-f30c-49fc-9988-a4c1f940accf")
        public BpmnLoopCharacteristicsObjectFactory(BpmnLoopCharacteristicsSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8091ed9c-0f11-4607-9c9e-c8a88385e0a9")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("2245b308-9bef-4427-b55b-624248405218")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("8109ee63-9ff0-47a6-ab4a-2f5eb99d1e00")
    public static class OwnerActivitySmDependency extends SmSingleDependency {
        @objid ("4942337e-c352-499d-a1fe-854abcf834e3")
        private SmDependency symetricDep;

        @objid ("3c1796ac-e096-4b59-a905-6c1b93c98e66")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnLoopCharacteristicsData) data).mOwnerActivity;
        }

        @objid ("8af68b92-c393-4902-aa76-f899895630f4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnLoopCharacteristicsData) data).mOwnerActivity = value;
        }

        @objid ("e335fe20-92c8-4888-8537-aedc1bac4367")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getLoopCharacteristicsDep();
            }
            return this.symetricDep;
        }

    }

}
