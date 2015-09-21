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
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c5105486-1655-4f9c-9ff6-651e4276cbcc")
public class CallActionSmClass extends ActivityActionSmClass {
    @objid ("4455c984-208a-46b8-8a34-b040db8124b6")
    private SmAttribute isSynchronousAtt;

    @objid ("d1daba4e-42e3-4bd2-873f-d2993fda7649")
    public CallActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ca2013bf-af96-48a7-8b2c-11c8b91271f8")
    @Override
    public String getName() {
        return "CallAction";
    }

    @objid ("0cf006b7-8179-4303-86ed-913c537ee1bf")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("00918305-8dc5-4ad2-be4e-996b265f9dc3")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CallAction.class;
    }

    @objid ("0c3f6162-96f2-4913-9418-996d014ffe79")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("7667d335-b0cc-4c94-a9de-883d2531c0f2")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("91d8d831-dba5-4d8f-b880-a18d1afd0e9c")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new CallActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isSynchronousAtt = new IsSynchronousSmAttribute();
        this.isSynchronousAtt.init("IsSynchronous", this, Boolean.class );
        registerAttribute(this.isSynchronousAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("2b0242fd-0e5a-4033-a448-a5dd653d6a74")
    public SmAttribute getIsSynchronousAtt() {
        if (this.isSynchronousAtt == null) {
        	this.isSynchronousAtt = this.getAttributeDef("IsSynchronous");
        }
        return this.isSynchronousAtt;
    }

    @objid ("93edcd19-0499-4883-b092-b28eb3ff697e")
    private static class CallActionObjectFactory implements ISmObjectFactory {
        @objid ("3026efcd-2cdd-4002-9581-fd385fbcca04")
        private CallActionSmClass smClass;

        @objid ("5ed169c5-16c3-4746-aaf6-c32502fa7ba8")
        public CallActionObjectFactory(CallActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("01a528aa-da1f-4000-8b02-1b84efefbf88")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("47d2ba33-172e-4611-95c8-8eab90bf0b19")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("16914500-5b86-4be4-b6f2-48a78132ef08")
    public static class IsSynchronousSmAttribute extends SmAttribute {
        @objid ("1502e57c-19bf-4cea-820d-be075796876c")
        public Object getValue(ISmObjectData data) {
            return ((CallActionData) data).mIsSynchronous;
        }

        @objid ("9ddbb01d-92d1-43bc-96d0-80d2326bfe83")
        public void setValue(ISmObjectData data, Object value) {
            ((CallActionData) data).mIsSynchronous = value;
        }

    }

}
