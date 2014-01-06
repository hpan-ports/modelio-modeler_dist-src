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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnConditionalEventDefinitionImpl;
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

@objid ("008a5390-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnConditionalEventDefinition.class, factory=BpmnConditionalEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnConditionalEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("10ceb7da-aa11-448b-8859-9b36bc36d833")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("ffeb47b0-bc92-45e0-b87e-bc329e506590")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002659c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("be63df20-ba2e-40e1-bf66-8fbf92892ff6")
        private static SmClass smClass = null;

        @objid ("d820f372-2408-49cb-9a6b-4b9e8832f223")
        private static SmAttribute ConditionAtt = null;

        @objid ("bbdb76a9-ddb2-48a8-962f-0954f1f54b54")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnConditionalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08682709-242d-41be-8b89-60470652d31b")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("6f8087c7-8ccd-4cd2-84d4-93ec3d87874a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("51b3ce26-1557-4cce-820c-8779e103db73")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("00269b2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("37438955-27f1-46ba-bfea-c3afadf32136")
            public ISmObjectData createData() {
                return new BpmnConditionalEventDefinitionData();
            }

            @objid ("610a9664-bfcd-43df-a570-5f59f8c1fa8b")
            public SmObjectImpl createImpl() {
                return new BpmnConditionalEventDefinitionImpl();
            }

        }

        @objid ("0026fbd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("925b72e6-877b-4f0b-b00a-083831e6b0b0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnConditionalEventDefinitionData) data).mCondition;
            }

            @objid ("1509cde0-4974-4484-9353-13a3b3ac1bfd")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnConditionalEventDefinitionData) data).mCondition = value;
            }

        }

    }

}
