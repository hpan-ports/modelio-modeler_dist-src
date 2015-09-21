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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("bb9f5409-3f70-4767-a919-f7d44f27a835")
public class BpmnThrowEventSmClass extends BpmnEventSmClass {
    @objid ("64e3cd25-b32c-478a-8bf9-2c09e7462d56")
    private SmDependency dataInputAssociationDep;

    @objid ("7df3d36c-c67c-47d4-8798-e7229fb40091")
    private SmDependency dataInputDep;

    @objid ("e53197ae-40f3-4bcb-a160-e886afb4a7ff")
    public BpmnThrowEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3ea7282e-9ab8-4062-9a47-2dc63e06c99e")
    @Override
    public String getName() {
        return "BpmnThrowEvent";
    }

    @objid ("6f4de974-b02a-45be-8751-fb8f806d76dc")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("70b92b90-eb65-47f0-b00d-d1a76240497b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnThrowEvent.class;
    }

    @objid ("3e1f7959-a3bc-448b-a44a-ba27c0f7d082")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("bc1ba3cf-7a7c-4c13-bde7-824e3c3c917f")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("a16ae071-7973-450e-a2ae-43e5ad9ec77f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEvent");
        this.registerFactory(new BpmnThrowEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.dataInputAssociationDep = new DataInputAssociationSmDependency();
        this.dataInputAssociationDep.init("DataInputAssociation", this, metamodel.getMClass("BpmnDataAssociation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataInputAssociationDep);
        
        this.dataInputDep = new DataInputSmDependency();
        this.dataInputDep.init("DataInput", this, metamodel.getMClass("BpmnDataInput"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dataInputDep);
    }

    @objid ("83bc5a94-e143-4401-a82e-b16815be1800")
    public SmDependency getDataInputAssociationDep() {
        if (this.dataInputAssociationDep == null) {
        	this.dataInputAssociationDep = this.getDependencyDef("DataInputAssociation");
        }
        return this.dataInputAssociationDep;
    }

    @objid ("392895f0-9c65-4509-8901-92539f7c9f19")
    public SmDependency getDataInputDep() {
        if (this.dataInputDep == null) {
        	this.dataInputDep = this.getDependencyDef("DataInput");
        }
        return this.dataInputDep;
    }

    @objid ("7ac96576-35bf-4cce-972f-97adb7374f1b")
    private static class BpmnThrowEventObjectFactory implements ISmObjectFactory {
        @objid ("f53273cf-c114-40ba-8569-ca87de6d74ed")
        private BpmnThrowEventSmClass smClass;

        @objid ("35d2e8b9-8968-4588-866f-c77ebb6a08c6")
        public BpmnThrowEventObjectFactory(BpmnThrowEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("24b9011f-567c-4414-8cc5-676d39581fd7")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("db27ed40-512e-4a39-9109-564c7a9f7a2f")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("91fae8d4-f166-4930-ac3f-0691f0b85a7e")
    public static class DataInputAssociationSmDependency extends SmMultipleDependency {
        @objid ("d25d3386-0848-4b9d-80df-895c31b32815")
        private SmDependency symetricDep;

        @objid ("93830375-955c-4827-9104-4395328c574f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnThrowEventData)data).mDataInputAssociation != null)? ((BpmnThrowEventData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
        }

        @objid ("0496a56c-f45b-4c33-b690-21c9afee3f94")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnThrowEventData) data).mDataInputAssociation = values;
        }

        @objid ("997abfe7-8816-4b16-988a-32365689e329")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataAssociationSmClass)this.getTarget()).getStartingEventDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a188c789-3a4a-4b06-8b29-420724298ecb")
    public static class DataInputSmDependency extends SmSingleDependency {
        @objid ("06e4b8a2-ea82-4288-a173-fc1a02469ff3")
        private SmDependency symetricDep;

        @objid ("055d3ef3-2f24-4619-aeaf-26c92d04bc7b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnThrowEventData) data).mDataInput;
        }

        @objid ("fda69bc1-4ffb-42a7-8853-83ee610288fe")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnThrowEventData) data).mDataInput = value;
        }

        @objid ("0c687d9b-37ab-4d70-8613-46e5d2ed8966")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataInputSmClass)this.getTarget()).getOwnerThrowEventDep();
            }
            return this.symetricDep;
        }

    }

}
