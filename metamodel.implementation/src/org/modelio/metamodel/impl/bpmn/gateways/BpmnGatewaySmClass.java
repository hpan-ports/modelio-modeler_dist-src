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
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGatewayDirection;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b7157dbd-377c-40c8-8473-97ad79ef088f")
public class BpmnGatewaySmClass extends BpmnFlowNodeSmClass {
    @objid ("1a0a76cd-e1b6-4ba6-a2d6-a73a8a795001")
    private SmAttribute gatewayDirectionAtt;

    @objid ("808c6528-fde2-4c9b-8d5e-6a9ce648bc1a")
    public BpmnGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("78c678dc-469f-48c1-8794-2afa7798daf0")
    @Override
    public String getName() {
        return "BpmnGateway";
    }

    @objid ("b7c2080e-19f8-4034-94a6-409befae7081")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("00acc663-36f3-455b-90ec-0de72a0255fd")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnGateway.class;
    }

    @objid ("b8b4f723-158a-446b-a8dc-562177a5b2e8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a3a474d2-3424-42c6-9425-83043a2f746a")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("0ab3bfa2-7272-461f-bcde-457b899700e0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowNode");
        this.registerFactory(new BpmnGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.gatewayDirectionAtt = new GatewayDirectionSmAttribute();
        this.gatewayDirectionAtt.init("GatewayDirection", this, BpmnGatewayDirection.class );
        registerAttribute(this.gatewayDirectionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("4e433fc8-feb8-4464-bf93-dd434d870119")
    public SmAttribute getGatewayDirectionAtt() {
        if (this.gatewayDirectionAtt == null) {
        	this.gatewayDirectionAtt = this.getAttributeDef("GatewayDirection");
        }
        return this.gatewayDirectionAtt;
    }

    @objid ("03a0d7c2-ed55-4ae6-9745-6c364d6dbf4d")
    private static class BpmnGatewayObjectFactory implements ISmObjectFactory {
        @objid ("940aae13-c92c-4500-8e0d-1c353d6aebe9")
        private BpmnGatewaySmClass smClass;

        @objid ("d28da028-2545-4494-9c96-b98881bfc76a")
        public BpmnGatewayObjectFactory(BpmnGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("43f55bbb-6d7a-4752-95a1-f5a6a821d881")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("002ffa58-1e91-43b4-945c-0b3658ab0524")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("f28b9816-c583-43cd-a4f4-fe39b07e93d5")
    public static class GatewayDirectionSmAttribute extends SmAttribute {
        @objid ("083fc648-ee39-4efc-9222-acfe525ef10f")
        public Object getValue(ISmObjectData data) {
            return ((BpmnGatewayData) data).mGatewayDirection;
        }

        @objid ("2f4b1fdf-a2a6-4ae0-8f4b-30b1ad705848")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnGatewayData) data).mGatewayDirection = value;
        }

    }

}
