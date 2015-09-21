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
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowSmClass;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnGatewaySmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("17ab5785-d5f9-4c2d-992a-883ea789b18b")
public class BpmnComplexGatewaySmClass extends BpmnGatewaySmClass {
    @objid ("5a0617ee-ce21-434e-96c2-48270da1ca17")
    private SmAttribute activationExpressionAtt;

    @objid ("165e7f5e-1fd9-4e80-89cf-e3991d24577f")
    private SmDependency defaultFlowDep;

    @objid ("c42a304f-f793-4436-ac8b-8a719179ba09")
    public BpmnComplexGatewaySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3cc3bf1c-6271-4cfa-a885-286e2a1c294e")
    @Override
    public String getName() {
        return "BpmnComplexGateway";
    }

    @objid ("462715d2-7821-4309-8a95-8fc796345a44")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0159dc0e-dfdf-45a8-9563-384679447544")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnComplexGateway.class;
    }

    @objid ("d001ea4d-6622-4a63-a202-3a5c8ccfe1c3")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cbf93810-22cd-4d93-9cd5-5d89c2866a76")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("86886253-10a0-47cd-91c4-5a80f705a83a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnGateway");
        this.registerFactory(new BpmnComplexGatewayObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.activationExpressionAtt = new ActivationExpressionSmAttribute();
        this.activationExpressionAtt.init("ActivationExpression", this, String.class );
        registerAttribute(this.activationExpressionAtt);
        
        
        // Initialize and register the SmDependency
        this.defaultFlowDep = new DefaultFlowSmDependency();
        this.defaultFlowDep.init("DefaultFlow", this, metamodel.getMClass("BpmnSequenceFlow"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.defaultFlowDep);
    }

    @objid ("2984c726-27c8-4749-b2f6-6e25bdb90c12")
    public SmAttribute getActivationExpressionAtt() {
        if (this.activationExpressionAtt == null) {
        	this.activationExpressionAtt = this.getAttributeDef("ActivationExpression");
        }
        return this.activationExpressionAtt;
    }

    @objid ("02991a4f-afa8-4207-ba5f-f24d8c9d0f9a")
    public SmDependency getDefaultFlowDep() {
        if (this.defaultFlowDep == null) {
        	this.defaultFlowDep = this.getDependencyDef("DefaultFlow");
        }
        return this.defaultFlowDep;
    }

    @objid ("c27593a8-37b9-4526-af10-67dd643860fe")
    private static class BpmnComplexGatewayObjectFactory implements ISmObjectFactory {
        @objid ("861f7ff3-47d0-4768-aaf6-97dc944ee3c2")
        private BpmnComplexGatewaySmClass smClass;

        @objid ("2911e2ad-134b-4b48-b813-14c09ad53626")
        public BpmnComplexGatewayObjectFactory(BpmnComplexGatewaySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("fc50d6a0-0dc6-4117-8734-685341d1a36e")
        @Override
        public ISmObjectData createData() {
            return new BpmnComplexGatewayData(this.smClass);
        }

        @objid ("e71f4ef4-cea7-47e8-92ce-ad36b3807b0f")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnComplexGatewayImpl();
        }

    }

    @objid ("7d6db033-1ec5-4e01-bc46-86b8a16454bc")
    public static class ActivationExpressionSmAttribute extends SmAttribute {
        @objid ("fd081052-d6c9-475d-90e7-8788711c451a")
        public Object getValue(ISmObjectData data) {
            return ((BpmnComplexGatewayData) data).mActivationExpression;
        }

        @objid ("e0853083-f952-4059-a6ef-c5d0ce688c48")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnComplexGatewayData) data).mActivationExpression = value;
        }

    }

    @objid ("6a173eb5-689b-465d-bc4f-7273d2728b86")
    public static class DefaultFlowSmDependency extends SmSingleDependency {
        @objid ("6e2f51fa-4858-407a-9f92-4911eaed8697")
        private SmDependency symetricDep;

        @objid ("396f75bb-ee32-41cd-8ed6-0d403bf0b26f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnComplexGatewayData) data).mDefaultFlow;
        }

        @objid ("a0c142a0-4893-4a41-9ff7-3d6d2fcc08cf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnComplexGatewayData) data).mDefaultFlow = value;
        }

        @objid ("6c02ab2b-d370-4ce5-9940-cec023ab4baa")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowSmClass)this.getTarget()).getDefaultOfComplexDep();
            }
            return this.symetricDep;
        }

    }

}
