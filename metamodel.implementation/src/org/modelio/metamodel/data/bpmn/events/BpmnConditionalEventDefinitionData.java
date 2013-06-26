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
    @objid ("561ea365-619a-473b-9c89-8ae1fadf30c9")
    @SmaMetaAttribute(metaName="Condition", type=String.class, smAttributeClass=Metadata.ConditionSmAttribute.class)
     Object mCondition = "";

    @objid ("98d017ee-4337-4fee-873d-35d5bbc0c583")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002659c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ae6e0118-8309-4ca8-842d-fd0509d217a2")
        private static SmClass smClass = null;

        @objid ("f39480a1-be7f-4a21-8167-c542b754dc96")
        private static SmAttribute ConditionAtt = null;

        @objid ("37f01f66-cfb1-4a98-a37e-89f76d091f19")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnConditionalEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dbaea2a0-e511-4efd-898d-73487e69b2c3")
        public static SmAttribute ConditionAtt() {
            if (ConditionAtt == null) {
            	ConditionAtt = classof().getAttributeDef("Condition");
            }
            return ConditionAtt;
        }

        @objid ("db44ccae-50dc-4ece-9a13-4704977237aa")
        public static SmAttribute getConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionAtt;
        }

        @objid ("2fd60428-0878-4ce8-b187-e2af0eab0164")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00269b2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8efd8d49-595c-4297-b9bd-b6ede84a613e")
            public ISmObjectData createData() {
                return new BpmnConditionalEventDefinitionData();
            }

            @objid ("96a65983-eeba-4df5-961b-025d067c282e")
            public SmObjectImpl createImpl() {
                return new BpmnConditionalEventDefinitionImpl();
            }

        }

        @objid ("0026fbd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionSmAttribute extends SmAttribute {
            @objid ("9c4a761b-35f7-4c6b-954a-62f7a05f8f5a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnConditionalEventDefinitionData) data).mCondition;
            }

            @objid ("8fdbe9a8-c064-4110-a21a-2f4fb51f83f2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnConditionalEventDefinitionData) data).mCondition = value;
            }

        }

    }

}
