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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewaySmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("e3c20f17-aba5-4406-9d83-4e9524117765")
public class BpmnEventBasedGatewaySmClass extends BpmnGatewaySmClass {
    @objid ("93fdb19b-8835-41fc-b7f7-3d0f6dda5545")
    private SmAttribute instanciateAtt;

    @objid ("97c4de02-5427-4fbb-80b5-b1b011cceece")
    private SmAttribute eventGatewayTypeAtt;

    @objid ("02e38b1f-8bb9-4d02-ad1f-7cb1628181be")
    public BpmnEventBasedGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("085e58cf-251e-4613-abd4-92f38e469003")
    @Override
    public String getName() {
        return "BpmnEventBasedGateway";
    }

    @objid ("e05bfc51-26c5-4b9c-985e-1104269faea5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c204f4f1-0b70-45bd-bc6a-9a05234cc0fc")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEventBasedGateway.class;
    }

    @objid ("a7e152be-f416-42f8-be68-895f637e47c5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("b8e7c186-1a3e-4005-883c-312db3b261f1")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ce79cfbb-8a79-4b90-acba-2be6b5743c9f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnGateway");
        this.registerFactory(new BpmnEventBasedGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.instanciateAtt = new InstanciateSmAttribute();
        this.instanciateAtt.init("Instanciate", this, Boolean.class );
        registerAttribute(this.instanciateAtt);
        
        this.eventGatewayTypeAtt = new EventGatewayTypeSmAttribute();
        this.eventGatewayTypeAtt.init("EventGatewayType", this, BpmnEventBasedGatewayType.class );
        registerAttribute(this.eventGatewayTypeAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("d608be7c-d7ab-489a-8799-1a6221c77fa8")
    public SmAttribute getInstanciateAtt() {
        if (this.instanciateAtt == null) {
        	this.instanciateAtt = this.getAttributeDef("Instanciate");
        }
        return this.instanciateAtt;
    }

    @objid ("3806eacf-6586-43c1-b21f-3f8b13b6bed7")
    public SmAttribute getEventGatewayTypeAtt() {
        if (this.eventGatewayTypeAtt == null) {
        	this.eventGatewayTypeAtt = this.getAttributeDef("EventGatewayType");
        }
        return this.eventGatewayTypeAtt;
    }

    @objid ("79aa53bc-c9b2-4b5b-9b38-f0b386176520")
    private static class BpmnEventBasedGatewayObjectFactory implements ISmObjectFactory {
        @objid ("3a7b8308-9a93-4b21-90ed-0e51100e6238")
        private BpmnEventBasedGatewaySmClass smClass;

        @objid ("e4e15a3d-2833-4802-a1ff-edcc08f6c7f8")
        public BpmnEventBasedGatewayObjectFactory(BpmnEventBasedGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bcde18e4-fc68-4b30-9bc4-2444a531b007")
        @Override
        public ISmObjectData createData() {
            return new BpmnEventBasedGatewayData(this.smClass);
        }

        @objid ("17eb0e05-7f1a-4751-b876-4c7e660783f4")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnEventBasedGatewayImpl();
        }

    }

    @objid ("b92ca66d-9916-40b1-8cf2-8f04c67c5ed9")
    public static class InstanciateSmAttribute extends SmAttribute {
        @objid ("c797c077-9c82-48ab-89d1-7d289d5112fc")
        public Object getValue(ISmObjectData data) {
            return ((BpmnEventBasedGatewayData) data).mInstanciate;
        }

        @objid ("bc43a375-8279-46cf-98ef-702f4d279355")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnEventBasedGatewayData) data).mInstanciate = value;
        }

    }

    @objid ("8841ed8c-37d8-4440-b934-ac6d8064d72c")
    public static class EventGatewayTypeSmAttribute extends SmAttribute {
        @objid ("c438463f-aa0c-4fb3-a7c9-8d1ef04850fe")
        public Object getValue(ISmObjectData data) {
            return ((BpmnEventBasedGatewayData) data).mEventGatewayType;
        }

        @objid ("20fd1f95-6d23-4199-b070-bbc6245197ff")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnEventBasedGatewayData) data).mEventGatewayType = value;
        }

    }

}
