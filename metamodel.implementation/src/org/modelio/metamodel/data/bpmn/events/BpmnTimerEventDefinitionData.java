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
    @objid ("ecc203b8-bfda-4031-aacc-a5c6fb1e76ad")
    @SmaMetaAttribute(metaName="TimeCycle", type=String.class, smAttributeClass=Metadata.TimeCycleSmAttribute.class)
     Object mTimeCycle = "";

    @objid ("890685bb-dd13-4258-a090-ac5d63d8425f")
    @SmaMetaAttribute(metaName="TimeD", type=String.class, smAttributeClass=Metadata.TimeDSmAttribute.class)
     Object mTimeD = "";

    @objid ("dca0d178-5bda-472f-83ba-bd115fe7ab65")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001cb3bc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("80079d88-d496-4507-b7ef-539ed0c4da0e")
        private static SmClass smClass = null;

        @objid ("9a2598bc-1c05-450f-bb1a-6f199e4f910b")
        private static SmAttribute TimeCycleAtt = null;

        @objid ("279fd9f3-e36f-4bc0-a690-63f8e0c8fc04")
        private static SmAttribute TimeDAtt = null;

        @objid ("dc82253a-cf20-4713-a857-32acfd12b8b5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTimerEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("68f2e44a-4cf5-480b-8ba0-4a752ea3d352")
        public static SmAttribute TimeCycleAtt() {
            if (TimeCycleAtt == null) {
            	TimeCycleAtt = classof().getAttributeDef("TimeCycle");
            }
            return TimeCycleAtt;
        }

        @objid ("043eabdd-2817-421e-b834-90d445f9dcc4")
        public static SmAttribute TimeDAtt() {
            if (TimeDAtt == null) {
            	TimeDAtt = classof().getAttributeDef("TimeD");
            }
            return TimeDAtt;
        }

        @objid ("b8efd8f0-1802-41b6-a458-456c3684d636")
        public static SmAttribute getTimeCycleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeCycleAtt;
        }

        @objid ("00d04907-b03c-47e4-913d-074baf1cb280")
        public static SmAttribute getTimeDAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeDAtt;
        }

        @objid ("6b1499fc-120e-4e71-98ad-1d00b12c724c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001cf3b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a04da4fe-c65b-4b77-b775-5324ffb35fea")
            public ISmObjectData createData() {
                return new BpmnTimerEventDefinitionData();
            }

            @objid ("478f6f6d-4bd6-44ce-a447-db15fb2e606b")
            public SmObjectImpl createImpl() {
                return new BpmnTimerEventDefinitionImpl();
            }

        }

        @objid ("001d60d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeCycleSmAttribute extends SmAttribute {
            @objid ("247665de-45d1-486d-8366-243923bc547f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeCycle;
            }

            @objid ("aa4daa4b-f24d-4389-a7c6-e2de0e6f65bf")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeCycle = value;
            }

        }

        @objid ("001dc2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeDSmAttribute extends SmAttribute {
            @objid ("e17674fc-b8a4-4102-b2c9-239a307a0822")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeD;
            }

            @objid ("f677dbc7-4eb4-49e4-aad8-4b07198b84e8")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeD = value;
            }

        }

    }

}
