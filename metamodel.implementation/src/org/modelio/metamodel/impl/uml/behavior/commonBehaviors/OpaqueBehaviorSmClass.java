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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c5216376-c086-4856-b16c-700f39c41c4d")
public class OpaqueBehaviorSmClass extends BehaviorSmClass {
    @objid ("5a633fc1-7636-4655-95df-580a426d14da")
    private SmAttribute bodyAtt;

    @objid ("3cc53dc2-58ca-431f-a6a7-49d9e0bd137d")
    public OpaqueBehaviorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6780d3c7-4b4f-4e08-88b2-37a4ad2b586d")
    @Override
    public String getName() {
        return "OpaqueBehavior";
    }

    @objid ("8f03b9e5-c6df-41ac-bac4-7ee35b5e7224")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("776b4da1-4387-474a-954b-66305e874012")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return OpaqueBehavior.class;
    }

    @objid ("09146383-24d7-4fc7-b2ca-bb021b7bf26d")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("3d1d9450-c06b-4644-9e7c-cfd114b0ead8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("bfa72f3c-a71a-4b9c-ae4f-9351ad0caab0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new OpaqueBehaviorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.bodyAtt = new BodySmAttribute();
        this.bodyAtt.init("Body", this, String.class );
        registerAttribute(this.bodyAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("289f3f81-7b03-47eb-82f3-5cd996efde7e")
    public SmAttribute getBodyAtt() {
        if (this.bodyAtt == null) {
        	this.bodyAtt = this.getAttributeDef("Body");
        }
        return this.bodyAtt;
    }

    @objid ("c20668d8-64af-484c-8379-200126aa4d03")
    private static class OpaqueBehaviorObjectFactory implements ISmObjectFactory {
        @objid ("0c7811bd-3ef1-4e74-a8b2-afd165363803")
        private OpaqueBehaviorSmClass smClass;

        @objid ("ae1b113a-f85a-4e7a-806a-8fde3511aa0a")
        public OpaqueBehaviorObjectFactory(OpaqueBehaviorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1c063cf1-2791-41a5-9a9f-d5beccadf22f")
        @Override
        public ISmObjectData createData() {
            return new OpaqueBehaviorData(this.smClass);
        }

        @objid ("e0c43b3b-5914-44d4-8b44-4aea7f857c84")
        @Override
        public SmObjectImpl createImpl() {
            return new OpaqueBehaviorImpl();
        }

    }

    @objid ("013dbefd-b68d-472d-9b16-6d9a4d8ff98e")
    public static class BodySmAttribute extends SmAttribute {
        @objid ("ccbf08b4-f9c3-4ce2-9f57-fed8fb1302ef")
        public Object getValue(ISmObjectData data) {
            return ((OpaqueBehaviorData) data).mBody;
        }

        @objid ("5b046e85-e0b8-4734-9548-34671d579d90")
        public void setValue(ISmObjectData data, Object value) {
            ((OpaqueBehaviorData) data).mBody = value;
        }

    }

}
