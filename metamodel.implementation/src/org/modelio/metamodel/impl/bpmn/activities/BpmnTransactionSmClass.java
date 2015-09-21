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
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("f4b44df4-bd16-4021-a24a-6da3ceb2e68d")
public class BpmnTransactionSmClass extends BpmnSubProcessSmClass {
    @objid ("c1f79ab9-b00d-4a86-98c7-b13e4ed1b8f9")
    private SmAttribute protocolAtt;

    @objid ("2750b1f2-7dd7-4f95-bb84-eb64916b87ba")
    private SmAttribute methodAtt;

    @objid ("80d5cb5a-5e44-44c7-bc95-35c673e19fc4")
    public BpmnTransactionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e368bc9e-287a-42ad-b1b1-d892e186e28e")
    @Override
    public String getName() {
        return "BpmnTransaction";
    }

    @objid ("77af39e7-6976-4d9d-aec8-8fb026d22e57")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("afe0af11-86da-44a9-9df7-33e109de4ded")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnTransaction.class;
    }

    @objid ("bf694add-66b0-40e5-b4b8-1c7d3a2d0030")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c4d5b0ad-18d6-4e4c-ad53-f8b3c173212c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8c404667-0c0f-4dad-829d-8591c003c6ea")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnSubProcess");
        this.registerFactory(new BpmnTransactionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.protocolAtt = new ProtocolSmAttribute();
        this.protocolAtt.init("Protocol", this, String.class );
        registerAttribute(this.protocolAtt);
        
        this.methodAtt = new MethodSmAttribute();
        this.methodAtt.init("Method", this, TransactionMethod.class );
        registerAttribute(this.methodAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("020afcfb-5865-4c99-93d3-615197ed7989")
    public SmAttribute getProtocolAtt() {
        if (this.protocolAtt == null) {
        	this.protocolAtt = this.getAttributeDef("Protocol");
        }
        return this.protocolAtt;
    }

    @objid ("6a0dd255-2e69-47ad-8ec1-57891fa144af")
    public SmAttribute getMethodAtt() {
        if (this.methodAtt == null) {
        	this.methodAtt = this.getAttributeDef("Method");
        }
        return this.methodAtt;
    }

    @objid ("9944b397-cbc7-4caf-9a29-cbc65b36734a")
    private static class BpmnTransactionObjectFactory implements ISmObjectFactory {
        @objid ("da21f5e1-6c15-4005-a8b6-9d4ff55ea7a5")
        private BpmnTransactionSmClass smClass;

        @objid ("763ba10d-5e0b-47a0-9b0c-a2a64da57ddd")
        public BpmnTransactionObjectFactory(BpmnTransactionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("102bb31f-b6b8-416d-ba06-3082aaa2d541")
        @Override
        public ISmObjectData createData() {
            return new BpmnTransactionData(this.smClass);
        }

        @objid ("1bb95fa6-e573-4923-8e0b-544d1aa146e3")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnTransactionImpl();
        }

    }

    @objid ("58307d42-ff45-46bb-a1df-06fe5fce3ae2")
    public static class ProtocolSmAttribute extends SmAttribute {
        @objid ("512d0c16-c539-4e17-9808-1165ea467e86")
        public Object getValue(ISmObjectData data) {
            return ((BpmnTransactionData) data).mProtocol;
        }

        @objid ("5a35d84f-10c1-4589-a1f1-c609abbcb511")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnTransactionData) data).mProtocol = value;
        }

    }

    @objid ("6ed67ab5-00e7-47b6-bd4c-1355b674a49d")
    public static class MethodSmAttribute extends SmAttribute {
        @objid ("14019172-a9f6-4ef8-82ec-519eb37964f3")
        public Object getValue(ISmObjectData data) {
            return ((BpmnTransactionData) data).mMethod;
        }

        @objid ("8301c6fd-9a6b-463d-8b19-2e892ac7d13a")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnTransactionData) data).mMethod = value;
        }

    }

}
