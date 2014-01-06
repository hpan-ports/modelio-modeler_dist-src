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
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnTimerEventDefinitionImpl;
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

@objid ("0096dd72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTimerEventDefinition.class, factory=BpmnTimerEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnTimerEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("56c66a38-9438-4780-9fc2-ec569d8f93aa")
    @SmaMetaAttribute(metaName="TimeCycle", type=String.class, smAttributeClass=Metadata.TimeCycleSmAttribute.class)
     Object mTimeCycle = "";

    @objid ("0b7f0312-1492-4db8-ac36-c1cd5dfde146")
    @SmaMetaAttribute(metaName="TimeD", type=String.class, smAttributeClass=Metadata.TimeDSmAttribute.class)
     Object mTimeD = "";

    @objid ("4e695b64-7389-4237-825c-d1de20ca6459")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001cb3bc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6b459378-6d1c-4eb1-b457-e72446d2fc1d")
        private static SmClass smClass = null;

        @objid ("bb3cc836-c88a-4efe-9e7b-115fe4f35c1f")
        private static SmAttribute TimeCycleAtt = null;

        @objid ("b921bfb3-99a4-4500-b642-80ac8c3859d9")
        private static SmAttribute TimeDAtt = null;

        @objid ("e04b3b41-fb89-46ff-ae0a-8fda2f56b5a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTimerEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fc75670c-a843-495b-8598-9b7a96958abe")
        public static SmAttribute TimeCycleAtt() {
            if (TimeCycleAtt == null) {
            	TimeCycleAtt = classof().getAttributeDef("TimeCycle");
            }
            return TimeCycleAtt;
        }

        @objid ("5198810f-b2ba-4e83-b1f1-8487d9a4ab9a")
        public static SmAttribute TimeDAtt() {
            if (TimeDAtt == null) {
            	TimeDAtt = classof().getAttributeDef("TimeD");
            }
            return TimeDAtt;
        }

        @objid ("70bd0368-a52e-43d4-848b-48d7656ed4f5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3246125e-8606-4070-9861-f2fe10a11225")
        public static SmAttribute getTimeDAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeDAtt;
        }

        @objid ("57db1045-4295-4eee-ac8b-8b388829e073")
        public static SmAttribute getTimeCycleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeCycleAtt;
        }

        @objid ("001cf3b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("92c3ddb2-2466-4840-a7b5-15f1eb1c688c")
            public ISmObjectData createData() {
                return new BpmnTimerEventDefinitionData();
            }

            @objid ("b8b82ea3-2df5-45c7-be14-05b3c1897281")
            public SmObjectImpl createImpl() {
                return new BpmnTimerEventDefinitionImpl();
            }

        }

        @objid ("001d60d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeCycleSmAttribute extends SmAttribute {
            @objid ("072ed683-1d4b-4e95-bdf9-143211344b58")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeCycle;
            }

            @objid ("739561ba-297f-4a06-be81-9522520264d2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeCycle = value;
            }

        }

        @objid ("001dc2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeDSmAttribute extends SmAttribute {
            @objid ("b47ec25b-c5d0-4b43-98ed-2877fdb4c29b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeD;
            }

            @objid ("651d614a-9fd1-4b8b-a281-cc19c4a70702")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeD = value;
            }

        }

    }

}
