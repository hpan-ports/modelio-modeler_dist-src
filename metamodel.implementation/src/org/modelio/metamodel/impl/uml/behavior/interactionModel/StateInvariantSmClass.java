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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("fcdddd87-663f-4ea8-99c7-5a84503dc557")
public class StateInvariantSmClass extends OccurrenceSpecificationSmClass {
    @objid ("72f9337a-6664-4372-8097-7158ef48fef4")
    private SmAttribute bodyAtt;

    @objid ("f4fcbf71-a3b5-416d-a0eb-25192884b79a")
    private SmAttribute endLineNumberAtt;

    @objid ("4c4cf780-543b-48ab-83fe-ff026aba8a21")
    public StateInvariantSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("db6f49c7-e5d8-4f64-8fb7-c3971258220f")
    @Override
    public String getName() {
        return "StateInvariant";
    }

    @objid ("957a8e1b-eba3-496e-8811-9f8f62be5f1d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("88f2b718-e6fa-4c33-b3e7-792a6f952384")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StateInvariant.class;
    }

    @objid ("74cba86c-72ca-4f71-a732-89f17ff76f71")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("16853228-25d5-47fc-8702-60132a8e9ec5")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("57cc2636-08e7-4b6a-9333-71b9db9aff29")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("OccurrenceSpecification");
        this.registerFactory(new StateInvariantObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.bodyAtt = new BodySmAttribute();
        this.bodyAtt.init("Body", this, String.class );
        registerAttribute(this.bodyAtt);
        
        this.endLineNumberAtt = new EndLineNumberSmAttribute();
        this.endLineNumberAtt.init("EndLineNumber", this, Integer.class );
        registerAttribute(this.endLineNumberAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("cda43e1f-6169-4b4b-bae9-74cfddac7860")
    public SmAttribute getBodyAtt() {
        if (this.bodyAtt == null) {
        	this.bodyAtt = this.getAttributeDef("Body");
        }
        return this.bodyAtt;
    }

    @objid ("7751eb02-c0fa-4bd8-b89d-b86203722685")
    public SmAttribute getEndLineNumberAtt() {
        if (this.endLineNumberAtt == null) {
        	this.endLineNumberAtt = this.getAttributeDef("EndLineNumber");
        }
        return this.endLineNumberAtt;
    }

    @objid ("90647e31-77e8-45ac-a29a-c39cb0c1c3c0")
    private static class StateInvariantObjectFactory implements ISmObjectFactory {
        @objid ("7c91771e-702e-4977-93d5-5be3d2b243be")
        private StateInvariantSmClass smClass;

        @objid ("34dfd8e9-b833-4eec-8c60-41116f989ccb")
        public StateInvariantObjectFactory(StateInvariantSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("3b303bda-2a2e-40c6-93ea-1bf159a3d91a")
        @Override
        public ISmObjectData createData() {
            return new StateInvariantData(this.smClass);
        }

        @objid ("5528d4cf-8e8d-438d-8a39-63d5a2026de0")
        @Override
        public SmObjectImpl createImpl() {
            return new StateInvariantImpl();
        }

    }

    @objid ("bf2e2ec9-b34d-4785-a886-a3f678e5e56b")
    public static class BodySmAttribute extends SmAttribute {
        @objid ("47104939-b482-44c8-9c41-4ba6bdfbfa0b")
        public Object getValue(ISmObjectData data) {
            return ((StateInvariantData) data).mBody;
        }

        @objid ("a50a8b19-ab09-4b91-a733-615e4f03d974")
        public void setValue(ISmObjectData data, Object value) {
            ((StateInvariantData) data).mBody = value;
        }

    }

    @objid ("07aa7ceb-0539-4d27-86d2-f19e04ce7a5b")
    public static class EndLineNumberSmAttribute extends SmAttribute {
        @objid ("684fcca9-765a-4fcb-b195-3692d7a3ed88")
        public Object getValue(ISmObjectData data) {
            return ((StateInvariantData) data).mEndLineNumber;
        }

        @objid ("e1fd9c2d-4bc4-40d9-a1f9-0b56a7436c75")
        public void setValue(ISmObjectData data, Object value) {
            ((StateInvariantData) data).mEndLineNumber = value;
        }

    }

}
