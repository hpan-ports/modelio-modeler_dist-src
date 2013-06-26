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
    @objid ("7287d2cf-3fda-4d19-ad9c-777bdc55fede")
    @SmaMetaAttribute(metaName="TimeCycle", type=String.class, smAttributeClass=Metadata.TimeCycleSmAttribute.class)
     Object mTimeCycle = "";

    @objid ("fb02cf95-db1d-423b-a218-c7e2904ce448")
    @SmaMetaAttribute(metaName="TimeD", type=String.class, smAttributeClass=Metadata.TimeDSmAttribute.class)
     Object mTimeD = "";

    @objid ("e44df9fe-62c8-4e92-99f5-b87829c748b3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001cb3bc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e0d691b1-564e-4ecf-abcb-e8a42eade422")
        private static SmClass smClass = null;

        @objid ("36a1d44e-5e48-4578-8a0b-dbb3cb7ce701")
        private static SmAttribute TimeCycleAtt = null;

        @objid ("48087ba1-22e1-4d69-989f-a066d14dbf50")
        private static SmAttribute TimeDAtt = null;

        @objid ("41845e73-6f37-436f-ac07-9f1d41e269d4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTimerEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1394c90c-99dc-4b54-bfd1-c12d8a2510c8")
        public static SmAttribute TimeCycleAtt() {
            if (TimeCycleAtt == null) {
            	TimeCycleAtt = classof().getAttributeDef("TimeCycle");
            }
            return TimeCycleAtt;
        }

        @objid ("9f2887b9-11fd-4bf9-8777-4bb0f1ba6f63")
        public static SmAttribute TimeDAtt() {
            if (TimeDAtt == null) {
            	TimeDAtt = classof().getAttributeDef("TimeD");
            }
            return TimeDAtt;
        }

        @objid ("96922c06-96f9-4bbc-bad5-81724c210735")
        public static SmAttribute getTimeDAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeDAtt;
        }

        @objid ("757f4aae-a92c-4d00-b2b5-12bcf40ce450")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4b989d0c-4ae0-40ac-9b23-9878d4c51164")
        public static SmAttribute getTimeCycleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TimeCycleAtt;
        }

        @objid ("001cf3b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f2088b60-8ceb-4199-9256-f98e46bfa40a")
            public ISmObjectData createData() {
                return new BpmnTimerEventDefinitionData();
            }

            @objid ("cf61d287-6932-4619-9d25-1140a6522b93")
            public SmObjectImpl createImpl() {
                return new BpmnTimerEventDefinitionImpl();
            }

        }

        @objid ("001d60d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeCycleSmAttribute extends SmAttribute {
            @objid ("024067b0-6686-4f68-a439-afb1f25e6dce")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeCycle;
            }

            @objid ("6da6d061-7892-48b7-a129-bd2c9d7888db")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeCycle = value;
            }

        }

        @objid ("001dc2d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TimeDSmAttribute extends SmAttribute {
            @objid ("ee64ae5b-0281-4748-8a02-1013ffd5476d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTimerEventDefinitionData) data).mTimeD;
            }

            @objid ("632b45d9-ca2c-4338-8ef0-d86fa627db17")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTimerEventDefinitionData) data).mTimeD = value;
            }

        }

    }

}
