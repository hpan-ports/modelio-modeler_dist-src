/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEscalationEventDefinitionImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("008c5122-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEscalationEventDefinition.class, factory=BpmnEscalationEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnEscalationEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("eb9ed391-3abc-496d-bc4e-a2b3fd27fd56")
    @SmaMetaAttribute(metaName="EscalationCode", type=String.class, smAttributeClass=Metadata.EscalationCodeSmAttribute.class)
     Object mEscalationCode = "";

    @objid ("47968f40-30bd-4ed9-98a0-889e715a426f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000c0f80-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4c795e79-27db-4044-8ad6-5114476f26e4")
        private static SmClass smClass = null;

        @objid ("c4005c9a-cd4c-4a01-bd16-6f6321bb85db")
        private static SmAttribute EscalationCodeAtt = null;

        @objid ("1e3c744e-ffaa-482c-b6df-7f3ce846c926")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEscalationEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b8c0b900-314a-419f-951e-edc3aad0a08b")
        public static SmAttribute EscalationCodeAtt() {
            if (EscalationCodeAtt == null) {
            	EscalationCodeAtt = classof().getAttributeDef("EscalationCode");
            }
            return EscalationCodeAtt;
        }

        @objid ("bc2763b0-708c-48d4-99c4-82ab7369bb9d")
        public static SmAttribute getEscalationCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EscalationCodeAtt;
        }

        @objid ("9dbb2e56-ca17-44f6-9db5-d82111a3e934")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000c5026-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cb9ef216-482e-452e-8a69-0c313c27bb80")
            public ISmObjectData createData() {
                return new BpmnEscalationEventDefinitionData();
            }

            @objid ("b9e70f49-efd6-423c-913d-847ba9aac620")
            public SmObjectImpl createImpl() {
                return new BpmnEscalationEventDefinitionImpl();
            }

        }

        @objid ("000cb07a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class EscalationCodeSmAttribute extends SmAttribute {
            @objid ("fb69c927-b8f9-4a94-8c49-6d2b544b2c03")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEscalationEventDefinitionData) data).mEscalationCode;
            }

            @objid ("5742be4b-bf77-4f12-8ac0-937713758bd6")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEscalationEventDefinitionData) data).mEscalationCode = value;
            }

        }

    }

}
