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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("9b01903d-a611-4217-8d59-019b860b4be9")
    @SmaMetaAttribute(metaName="EscalationCode", type=String.class, smAttributeClass=Metadata.EscalationCodeSmAttribute.class)
     Object mEscalationCode = "";

    @objid ("7bce690e-2380-4329-b06c-984f750aa23d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000c0f80-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("02c7017c-b282-43f8-bb22-8b549c7f76fb")
        private static SmClass smClass = null;

        @objid ("0bbce6b5-44cc-4e00-80ff-35c0624ce3db")
        private static SmAttribute EscalationCodeAtt = null;

        @objid ("40c5e801-9450-4595-a0ec-cf7abd724b79")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEscalationEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("903f3285-c45f-4268-897e-58918c4e55e6")
        public static SmAttribute EscalationCodeAtt() {
            if (EscalationCodeAtt == null) {
            	EscalationCodeAtt = classof().getAttributeDef("EscalationCode");
            }
            return EscalationCodeAtt;
        }

        @objid ("f0a5e8c1-df68-45bf-9b0e-b56ed7a43b4c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("12efb960-73b9-47de-a8f5-97f6ad7f9ac6")
        public static SmAttribute getEscalationCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EscalationCodeAtt;
        }

        @objid ("000c5026-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a5e4ce37-0abc-4a94-8c3f-5425c46f1446")
            public ISmObjectData createData() {
                return new BpmnEscalationEventDefinitionData();
            }

            @objid ("03aff532-c5df-4ef9-be37-1b5960af1380")
            public SmObjectImpl createImpl() {
                return new BpmnEscalationEventDefinitionImpl();
            }

        }

        @objid ("000cb07a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class EscalationCodeSmAttribute extends SmAttribute {
            @objid ("c0e976d8-4d10-4808-a89c-d49af3aa9da9")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEscalationEventDefinitionData) data).mEscalationCode;
            }

            @objid ("b132a52a-2e63-4baf-92e8-8fc420f7e19a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEscalationEventDefinitionData) data).mEscalationCode = value;
            }

        }

    }

}
