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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventImpl;
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

@objid ("008cffbe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEvent.class, factory=BpmnEventData.Metadata.ObjectFactory.class)
public abstract class BpmnEventData extends BpmnFlowNodeData {
    @objid ("18f84259-d27d-4fb7-a24f-ac359f0aec11")
    @SmaMetaAssociation(metaName="EventDefinitions", typeDataClass=BpmnEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionsSmDependency.class, component = true)
     List<SmObjectImpl> mEventDefinitions = null;

    @objid ("49777744-0437-4d7b-84c8-06aee648b810")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a7be6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3d155493-4691-4d93-acb6-dd4dfcd897a4")
        private static SmClass smClass = null;

        @objid ("eca0854d-de60-41e9-9f00-0857dc877391")
        private static SmDependency EventDefinitionsDep = null;

        @objid ("e47cf3c4-2e35-4d08-b3d5-d8cc2cda6835")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3d62ba23-4cf5-4711-8819-1366b84af93e")
        public static SmDependency EventDefinitionsDep() {
            if (EventDefinitionsDep == null) {
            	EventDefinitionsDep = classof().getDependencyDef("EventDefinitions");
            }
            return EventDefinitionsDep;
        }

        @objid ("3f425428-5c41-4e37-8d98-d6dbfb18c7d4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3d4ef6b6-ce54-4ce5-93b2-3b514a5aeaf8")
        public static SmDependency getEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionsDep;
        }

        @objid ("007abd68-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13d44630-257c-4467-91e6-a70aac2a99da")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("58c90bb7-a602-4e81-a21a-67c57b6952d3")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007b22b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("712b8058-2b93-4857-bd03-853699705942")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventData)data).mEventDefinitions != null)? ((BpmnEventData)data).mEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("99a23dee-b208-42b8-98ac-ddc942b97563")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventData) data).mEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnEventData) data).mEventDefinitions;
            }

            @objid ("01fd9adc-83d7-4af9-a1cf-f31d74962dd7")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.DefinedDep();
            }

        }

    }

}
