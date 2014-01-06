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
    @objid ("787adddc-1420-42d1-8b2f-71d807c336be")
    @SmaMetaAssociation(metaName="EventDefinitions", typeDataClass=BpmnEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionsSmDependency.class, component = true)
     List<SmObjectImpl> mEventDefinitions = null;

    @objid ("6a0757d1-3af7-4952-b8b8-870b0a56bb9c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a7be6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("253486b5-d41d-4d11-9237-8065960c8fae")
        private static SmClass smClass = null;

        @objid ("cb2a2f3b-109d-4937-9101-e0c8fc79e05a")
        private static SmDependency EventDefinitionsDep = null;

        @objid ("595bf952-027b-4e4a-8382-f8a16190a9cb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("40474a3b-2255-4c58-84fd-01cce5d91c5d")
        public static SmDependency EventDefinitionsDep() {
            if (EventDefinitionsDep == null) {
            	EventDefinitionsDep = classof().getDependencyDef("EventDefinitions");
            }
            return EventDefinitionsDep;
        }

        @objid ("6a2ca3a6-39a2-45db-860d-2f6b71740572")
        public static SmDependency getEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionsDep;
        }

        @objid ("68a2b621-e7c5-4d92-b5c9-a554dcac26f6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007abd68-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fea4b351-eabc-41e5-965a-53de2111435e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("4a6ec4ad-3ec6-43ff-a5f5-03af9164c30d")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007b22b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("4a5218db-0316-445d-9eeb-e2c3891c397e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventData)data).mEventDefinitions != null)? ((BpmnEventData)data).mEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("ff02e2a4-1e4a-4f08-b590-bed432494fb0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventData) data).mEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnEventData) data).mEventDefinitions;
            }

            @objid ("02003528-e01a-4d7e-8c0f-4750d7fe889c")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.DefinedDep();
            }

        }

    }

}
