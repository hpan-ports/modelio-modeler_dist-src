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
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b033b513-64ec-4756-a171-630a637d92e6")
public class BpmnEscalationEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("49f1e017-495f-470f-b085-0e330f22b1b4")
    private SmAttribute escalationCodeAtt;

    @objid ("dd1fd049-788d-4f38-ab60-e63920e39d51")
    public BpmnEscalationEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f5a32148-835b-41a5-9d1b-a23cef962742")
    @Override
    public String getName() {
        return "BpmnEscalationEventDefinition";
    }

    @objid ("38149267-1f34-49f6-9c9b-16273187b182")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("988b6fcf-dc62-46ba-82ab-303e20aeb06a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnEscalationEventDefinition.class;
    }

    @objid ("e1d81e27-97da-4b3f-8f74-21ab5ac5b7f7")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ae99f9a3-2a3b-4b24-a7c6-5deac37cdfce")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("72e1dd58-c699-4ac5-a78a-1b772c45d91f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnEscalationEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.escalationCodeAtt = new EscalationCodeSmAttribute();
        this.escalationCodeAtt.init("EscalationCode", this, String.class );
        registerAttribute(this.escalationCodeAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("f6136769-a75b-495a-8feb-d34a04a08db2")
    public SmAttribute getEscalationCodeAtt() {
        if (this.escalationCodeAtt == null) {
        	this.escalationCodeAtt = this.getAttributeDef("EscalationCode");
        }
        return this.escalationCodeAtt;
    }

    @objid ("3dc92e50-6493-43ee-8875-d2ea23e46395")
    private static class BpmnEscalationEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("447fd6e1-d5e0-45bb-a9ef-65a633953cd8")
        private BpmnEscalationEventDefinitionSmClass smClass;

        @objid ("1517d51d-10d7-40f6-8150-9c583851fb6a")
        public BpmnEscalationEventDefinitionObjectFactory(BpmnEscalationEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0cb73ee5-160b-4f33-af3b-9c5b02318049")
        @Override
        public ISmObjectData createData() {
            return new BpmnEscalationEventDefinitionData(this.smClass);
        }

        @objid ("0dcb4e21-d023-463e-aa0f-3dfe196eac84")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnEscalationEventDefinitionImpl();
        }

    }

    @objid ("8b646b31-2397-4207-b7dc-4a151a47118f")
    public static class EscalationCodeSmAttribute extends SmAttribute {
        @objid ("4d9f6e00-4f1c-448e-9a72-3c2a34def947")
        public Object getValue(ISmObjectData data) {
            return ((BpmnEscalationEventDefinitionData) data).mEscalationCode;
        }

        @objid ("e17ac716-e47b-4033-b327-a10642a8e247")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnEscalationEventDefinitionData) data).mEscalationCode = value;
        }

    }

}
