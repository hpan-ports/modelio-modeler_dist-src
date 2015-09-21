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
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("8b1ab55a-2157-409c-a06d-4cc0df8ca847")
public class AcceptTimeEventActionSmClass extends ActivityActionSmClass {
    @objid ("8975e604-c4a8-4838-8870-5854bff504c4")
    private SmAttribute timeExpresionAtt;

    @objid ("b0bd5cf7-1eb6-4b2a-b535-d08af9c3fd8c")
    public AcceptTimeEventActionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("092b6bc1-2861-4cc9-a618-1b4e8441aae5")
    @Override
    public String getName() {
        return "AcceptTimeEventAction";
    }

    @objid ("1c271dc9-d7c0-41aa-9814-ec40e59ff2d8")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0210c8a2-66c8-4a62-9088-167ee40967ed")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AcceptTimeEventAction.class;
    }

    @objid ("3f71bed2-ae55-4e40-8b66-94a2b0265e63")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f75c7cfa-65cf-481c-9f83-f713319c3d1c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ff9b7180-12c0-415b-bf9c-d003f16ea608")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityAction");
        this.registerFactory(new AcceptTimeEventActionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.timeExpresionAtt = new TimeExpresionSmAttribute();
        this.timeExpresionAtt.init("TimeExpresion", this, String.class );
        registerAttribute(this.timeExpresionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("aebc3542-1d97-44e0-8ac6-967c59bb1bf5")
    public SmAttribute getTimeExpresionAtt() {
        if (this.timeExpresionAtt == null) {
        	this.timeExpresionAtt = this.getAttributeDef("TimeExpresion");
        }
        return this.timeExpresionAtt;
    }

    @objid ("f21c8321-7cde-499c-9071-c35731c701ef")
    private static class AcceptTimeEventActionObjectFactory implements ISmObjectFactory {
        @objid ("01301efe-9b17-4b05-932a-6863515c8f2e")
        private AcceptTimeEventActionSmClass smClass;

        @objid ("140776b1-0ba9-413c-9280-2f55734217d6")
        public AcceptTimeEventActionObjectFactory(AcceptTimeEventActionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4d0a5756-af4a-4433-9432-a48d2da0b4ef")
        @Override
        public ISmObjectData createData() {
            return new AcceptTimeEventActionData(this.smClass);
        }

        @objid ("07ad114c-ec6a-4407-9fa9-479555cd9002")
        @Override
        public SmObjectImpl createImpl() {
            return new AcceptTimeEventActionImpl();
        }

    }

    @objid ("41bda601-e7ea-4c77-9cd6-36313bd7adc6")
    public static class TimeExpresionSmAttribute extends SmAttribute {
        @objid ("906c7520-e188-49f8-88cf-93a6dff547b3")
        public Object getValue(ISmObjectData data) {
            return ((AcceptTimeEventActionData) data).mTimeExpresion;
        }

        @objid ("cbddf92c-5da4-4981-bc35-03c2ee712ea7")
        public void setValue(ISmObjectData data, Object value) {
            ((AcceptTimeEventActionData) data).mTimeExpresion = value;
        }

    }

}
