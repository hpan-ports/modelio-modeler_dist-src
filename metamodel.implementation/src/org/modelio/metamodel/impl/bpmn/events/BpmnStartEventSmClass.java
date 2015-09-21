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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnCatchEventSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d8593693-2159-4274-8e12-551d7ff986fd")
public class BpmnStartEventSmClass extends BpmnCatchEventSmClass {
    @objid ("cc95546a-53fa-454a-9902-9337ba8bee2c")
    private SmAttribute isInterruptingAtt;

    @objid ("d36e0539-9fdc-421e-8de8-e27faf849bd2")
    public BpmnStartEventSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("8b2a8151-1fec-44e1-81e1-0fd5d28e7a3f")
    @Override
    public String getName() {
        return "BpmnStartEvent";
    }

    @objid ("14d7585e-c7e1-4fc5-90fb-f8b94a33f46b")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("13365f74-9feb-4d12-aed1-9d815bdb2adc")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnStartEvent.class;
    }

    @objid ("96a8a320-a5a8-4ae7-b670-64a58cea9b11")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("dc5d0b4a-1d0e-45a4-900e-ed4b5cd30381")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0ca8a8a1-5adf-4868-ba32-adaf53b5fa91")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnCatchEvent");
        this.registerFactory(new BpmnStartEventObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isInterruptingAtt = new IsInterruptingSmAttribute();
        this.isInterruptingAtt.init("IsInterrupting", this, Boolean.class );
        registerAttribute(this.isInterruptingAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("59540353-ba30-42c4-865c-4dcf12cc2b8f")
    public SmAttribute getIsInterruptingAtt() {
        if (this.isInterruptingAtt == null) {
        	this.isInterruptingAtt = this.getAttributeDef("IsInterrupting");
        }
        return this.isInterruptingAtt;
    }

    @objid ("0d525748-c88f-4721-b1e1-a8e17642e118")
    private static class BpmnStartEventObjectFactory implements ISmObjectFactory {
        @objid ("192c48c1-84ee-43ad-b9bc-e0edde76b706")
        private BpmnStartEventSmClass smClass;

        @objid ("fff468ae-6934-406e-9d94-11e9cd676913")
        public BpmnStartEventObjectFactory(BpmnStartEventSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("eff675d2-ea4f-41e0-9891-a6a79ca14000")
        @Override
        public ISmObjectData createData() {
            return new BpmnStartEventData(this.smClass);
        }

        @objid ("aeadc4bb-63d6-467a-9265-c69d23e44f93")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnStartEventImpl();
        }

    }

    @objid ("b4af6c1c-35f9-421b-a31c-22feed73a9fa")
    public static class IsInterruptingSmAttribute extends SmAttribute {
        @objid ("a5749274-a307-4f32-ad20-3904af139b51")
        public Object getValue(ISmObjectData data) {
            return ((BpmnStartEventData) data).mIsInterrupting;
        }

        @objid ("e619898b-0194-4589-b5f6-fc38b42cafbe")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnStartEventData) data).mIsInterrupting = value;
        }

    }

}
