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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("82e03360-b636-46dc-9bf6-0bd95319cbe0")
public class BpmnDataStoreSmClass extends BpmnItemAwareElementSmClass {
    @objid ("5af85dfa-d0d4-4313-8ac0-99a93ea466b8")
    private SmAttribute capacityAtt;

    @objid ("d370145f-0dc5-47f6-9591-572d10af7d7d")
    private SmAttribute isUnlimitedAtt;

    @objid ("17fadab2-dae2-478c-b7df-30cd3cf90a59")
    public BpmnDataStoreSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("941b3fe2-e1d3-4f3d-8587-d754cd56da07")
    @Override
    public String getName() {
        return "BpmnDataStore";
    }

    @objid ("90f2a53d-d753-4983-ab4b-a7a80de1725c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("aa7dbc96-f6aa-47f8-8288-38ffe03c2eea")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnDataStore.class;
    }

    @objid ("136d11e4-c0bc-4af1-9df1-040e0b37b9a4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("5abae44f-9b7d-4935-af6c-02cceae34326")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a7d1eb9e-7581-42b9-b840-8d3813796d63")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnItemAwareElement");
        this.registerFactory(new BpmnDataStoreObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.capacityAtt = new CapacitySmAttribute();
        this.capacityAtt.init("Capacity", this, Integer.class );
        registerAttribute(this.capacityAtt);
        
        this.isUnlimitedAtt = new IsUnlimitedSmAttribute();
        this.isUnlimitedAtt.init("IsUnlimited", this, Boolean.class );
        registerAttribute(this.isUnlimitedAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("debe4d8f-622f-4ad8-b601-98fcf3e59c97")
    public SmAttribute getCapacityAtt() {
        if (this.capacityAtt == null) {
        	this.capacityAtt = this.getAttributeDef("Capacity");
        }
        return this.capacityAtt;
    }

    @objid ("c7c78af6-14ea-4f2a-8cda-cfc895b3558e")
    public SmAttribute getIsUnlimitedAtt() {
        if (this.isUnlimitedAtt == null) {
        	this.isUnlimitedAtt = this.getAttributeDef("IsUnlimited");
        }
        return this.isUnlimitedAtt;
    }

    @objid ("a74f4448-0611-4d27-8b33-7b4d1bb6dc39")
    private static class BpmnDataStoreObjectFactory implements ISmObjectFactory {
        @objid ("ca6e1794-84d0-4e49-bb60-2dca3d943fe8")
        private BpmnDataStoreSmClass smClass;

        @objid ("e2cddbcf-f160-44f9-81ab-5f2c4c4275e8")
        public BpmnDataStoreObjectFactory(BpmnDataStoreSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("aacd95ba-d257-4012-987b-5300ca683bb9")
        @Override
        public ISmObjectData createData() {
            return new BpmnDataStoreData(this.smClass);
        }

        @objid ("aae25188-7be2-4182-995b-8950ce1ded59")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnDataStoreImpl();
        }

    }

    @objid ("d82f9177-5d0a-469c-bd64-3ffc98b28d21")
    public static class CapacitySmAttribute extends SmAttribute {
        @objid ("a3cc1ac2-8c83-4384-bcb4-244557d84f48")
        public Object getValue(ISmObjectData data) {
            return ((BpmnDataStoreData) data).mCapacity;
        }

        @objid ("b3bacd12-88d9-482e-a6ab-f18b3fcb87e4")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnDataStoreData) data).mCapacity = value;
        }

    }

    @objid ("161e23ac-f51c-4bb7-a5e5-d8c6cca9326f")
    public static class IsUnlimitedSmAttribute extends SmAttribute {
        @objid ("10ff7c30-4490-48f5-bd09-2a5c9d003040")
        public Object getValue(ISmObjectData data) {
            return ((BpmnDataStoreData) data).mIsUnlimited;
        }

        @objid ("e942691e-cf73-4ef1-8794-ae13d05f0238")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnDataStoreData) data).mIsUnlimited = value;
        }

    }

}
