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
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1c8993a9-2dca-4afe-afa1-3f3e38614e0e")
public class OpaqueActionSmClass extends ActivityActionSmClass {
    @objid ("f1a42ee6-98e6-4907-a32b-cb9e311c18ba")
    private SmAttribute bodyAtt;

    @objid ("dfc98ae0-bf84-40c3-af51-9d58b66c6cc3")
    public OpaqueActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("c08ca8c8-e980-448e-9e0c-9037cd916f91")
    @Override
    public String getName() {
        return "OpaqueAction";
    }

    @objid ("6fdf16cd-1b35-4700-9705-ec9c52290a1f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0baa2a80-c53e-4c17-84e2-241cd234f873")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return OpaqueAction.class;
    }

    @objid ("ee9ffca6-c1d4-4785-bb6e-ec71d9f3b01e")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("8962c91d-719d-4585-a26b-e4900fcf8c0a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("845e64d4-2195-4925-b310-f72540be4399")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new OpaqueActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.bodyAtt = new BodySmAttribute();
        this.bodyAtt.init("Body", this, String.class );
        registerAttribute(this.bodyAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("11734ed6-b9c8-4120-8297-84435809016c")
    public SmAttribute getBodyAtt() {
        if (this.bodyAtt == null) {
        	this.bodyAtt = this.getAttributeDef("Body");
        }
        return this.bodyAtt;
    }

    @objid ("5c994db4-f6cc-4db9-af15-8ec1b10b7eaa")
    private static class OpaqueActionObjectFactory implements ISmObjectFactory {
        @objid ("223ab872-9e12-4f98-803c-64a69f6ad2d5")
        private OpaqueActionSmClass smClass;

        @objid ("8b6e73d9-541e-4102-b409-ffe87316a57b")
        public OpaqueActionObjectFactory(OpaqueActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ab8bdf37-3903-4d81-b842-821cf6046817")
        @Override
        public ISmObjectData createData() {
            return new OpaqueActionData(this.smClass);
        }

        @objid ("663c852e-fee4-40f7-8cae-ca72424d2ab7")
        @Override
        public SmObjectImpl createImpl() {
            return new OpaqueActionImpl();
        }

    }

    @objid ("e4ad9050-46e0-4d27-b46f-666537fee3db")
    public static class BodySmAttribute extends SmAttribute {
        @objid ("354f3031-6183-4853-b5f7-81a31f528415")
        public Object getValue(ISmObjectData data) {
            return ((OpaqueActionData) data).mBody;
        }

        @objid ("1afe23f9-d88a-4b72-a9d0-1ceec72019f2")
        public void setValue(ISmObjectData data, Object value) {
            ((OpaqueActionData) data).mBody = value;
        }

    }

}
