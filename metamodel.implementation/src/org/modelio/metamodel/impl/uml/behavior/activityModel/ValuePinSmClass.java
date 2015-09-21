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
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("98107046-2d5a-42a3-b331-c129a966ac08")
public class ValuePinSmClass extends InputPinSmClass {
    @objid ("9d1f0119-fc15-41d2-8808-67247a03d1e4")
    private SmAttribute valueAtt;

    @objid ("5a1200d5-e8a4-4054-b864-0943c5d79b82")
    public ValuePinSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6339a85c-eb5d-4170-b439-b233b0c7bb26")
    @Override
    public String getName() {
        return "ValuePin";
    }

    @objid ("a7a3ab3e-b7bd-4f3d-a04a-c8f04a67c74c")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6a6d0d2a-4692-492c-aefd-d7636f8b8be1")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ValuePin.class;
    }

    @objid ("b26bca8a-0153-43a9-8cbc-9acf0e73daf0")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("089ea7f4-96f9-432b-b004-a65520450577")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5491d2db-c82e-4d9d-8e09-9b9965ed796e")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InputPin");
        this.registerFactory(new ValuePinObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.valueAtt = new ValueSmAttribute();
        this.valueAtt.init("Value", this, String.class );
        registerAttribute(this.valueAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("aa7c3199-7fca-4247-bcfb-2413f13755bb")
    public SmAttribute getValueAtt() {
        if (this.valueAtt == null) {
        	this.valueAtt = this.getAttributeDef("Value");
        }
        return this.valueAtt;
    }

    @objid ("42c55e71-6f83-45a1-a30a-c62200dc7817")
    private static class ValuePinObjectFactory implements ISmObjectFactory {
        @objid ("ae6ba47f-dc7d-469a-9f73-b9c68b268a26")
        private ValuePinSmClass smClass;

        @objid ("2f9b2d39-aa96-4e16-a273-5732d60222db")
        public ValuePinObjectFactory(ValuePinSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("77a0dcf6-a493-481a-83cb-eff4804f21dd")
        @Override
        public ISmObjectData createData() {
            return new ValuePinData(this.smClass);
        }

        @objid ("362569ba-f66e-4ef5-baf4-2395679cf6b8")
        @Override
        public SmObjectImpl createImpl() {
            return new ValuePinImpl();
        }

    }

    @objid ("126e56cd-1fb5-4600-8f8d-a60af5bcbe1b")
    public static class ValueSmAttribute extends SmAttribute {
        @objid ("1b3f2e32-e59f-46a1-ac4f-04e6224d0dfe")
        public Object getValue(ISmObjectData data) {
            return ((ValuePinData) data).mValue;
        }

        @objid ("33b03125-fbd9-4d44-aa1a-b270b2ca048a")
        public void setValue(ISmObjectData data, Object value) {
            ((ValuePinData) data).mValue = value;
        }

    }

}
