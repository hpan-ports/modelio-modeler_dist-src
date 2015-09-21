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
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("8e431131-6ece-4a04-9e8c-d76c1e35d70f")
public class AcceptChangeEventActionSmClass extends ActivityActionSmClass {
    @objid ("dafcdcf4-e895-44dc-8011-ba00b3586717")
    private SmAttribute changeExpresionAtt;

    @objid ("6fa5d943-aa73-4a85-8388-720b218b8e5f")
    public AcceptChangeEventActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a1570679-1f8e-41ae-9a97-b3d93b01f1ce")
    @Override
    public String getName() {
        return "AcceptChangeEventAction";
    }

    @objid ("cdb23571-5067-4acd-9d9b-468cc2464ad3")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3a01e764-7eaf-467f-8223-d0cec983a0c0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AcceptChangeEventAction.class;
    }

    @objid ("b63e0b09-a563-4346-b127-af3d3f17fd40")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("28eed983-7142-4ff3-af66-cf1d92101f9b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("58ce146d-817f-47bf-b5b6-82883bebc438")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new AcceptChangeEventActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.changeExpresionAtt = new ChangeExpresionSmAttribute();
        this.changeExpresionAtt.init("ChangeExpresion", this, String.class );
        registerAttribute(this.changeExpresionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("ec8cd6dc-2621-4f73-b0f1-a6ca5c3d5e86")
    public SmAttribute getChangeExpresionAtt() {
        if (this.changeExpresionAtt == null) {
        	this.changeExpresionAtt = this.getAttributeDef("ChangeExpresion");
        }
        return this.changeExpresionAtt;
    }

    @objid ("2d531dfa-7f48-4da6-90b4-9e6baa75e251")
    private static class AcceptChangeEventActionObjectFactory implements ISmObjectFactory {
        @objid ("6a9ab6c0-5e7a-4caa-b8ab-3d35839b032d")
        private AcceptChangeEventActionSmClass smClass;

        @objid ("45b23f34-e0d3-4083-aef7-b8c42e7c9e9c")
        public AcceptChangeEventActionObjectFactory(AcceptChangeEventActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c65e5fde-c0f5-490b-9ccb-3f2375f4785d")
        @Override
        public ISmObjectData createData() {
            return new AcceptChangeEventActionData(this.smClass);
        }

        @objid ("3e139a57-94f9-4c09-b106-8952aa156dd7")
        @Override
        public SmObjectImpl createImpl() {
            return new AcceptChangeEventActionImpl();
        }

    }

    @objid ("b378bcc0-0900-423c-ad28-7cc21a93cd13")
    public static class ChangeExpresionSmAttribute extends SmAttribute {
        @objid ("cc58413e-369f-4b8e-a4b8-88590b52eb4f")
        public Object getValue(ISmObjectData data) {
            return ((AcceptChangeEventActionData) data).mChangeExpresion;
        }

        @objid ("2f7039a5-8ff8-49d8-afd3-5874b6fbf4dc")
        public void setValue(ISmObjectData data, Object value) {
            ((AcceptChangeEventActionData) data).mChangeExpresion = value;
        }

    }

}
