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
    @objid ("8457d8e0-9490-4d95-a983-e527afcedc49")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("8889d769-d60c-4e95-930c-191ad124d372")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002659c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("27281ff4-073f-4c6a-8911-39e0809d2910")
        private static SmClass smClass = null;

        @objid ("53641be8-009b-4b68-a00c-7d194f670a11")
        private static SmAttribute ConditionAtt = null;

        @objid ("e275fc11-befa-4415-b3f8-a0dd9ac3e96b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnConditionalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8e5dbd6c-569b-425c-b237-5a8e22550ec8")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("c5b95bcc-3774-4918-bfe5-6ef0ed727147")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c6989654-75e8-4c96-8cd4-e53b75e25a24")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("00269b2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("63fe3ca3-ab7c-420b-9cdc-94ff48d07c79")
            public ISmObjectData createData() {
                return new BpmnConditionalEventDefinitionData();
            }

            @objid ("6b3b003b-ad27-45e2-a4d5-52bbe90e3675")
            public SmObjectImpl createImpl() {
                return new BpmnConditionalEventDefinitionImpl();
            }

        }

        @objid ("0026fbd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("51431d5a-15d5-4bb9-9db3-75af939f2b5e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnConditionalEventDefinitionData) data).mCondition;
            }

            @objid ("56f4c447-a6d8-4140-b4d0-7f5880351648")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnConditionalEventDefinitionData) data).mCondition = value;
            }

        }

    }

}
