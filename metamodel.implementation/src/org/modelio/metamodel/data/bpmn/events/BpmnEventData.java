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
    @objid ("6b586ba5-2172-4b49-83d9-26745846750f")
    @SmaMetaAssociation(metaName="EventDefinitions", typeDataClass=BpmnEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionsSmDependency.class, component = true)
     List<SmObjectImpl> mEventDefinitions = null;

    @objid ("1122afb2-ae75-4027-a43d-0f81e11f9b6a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007a7be6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7e8f0287-5c93-4ee8-8ec3-2abefd71ddf8")
        private static SmClass smClass = null;

        @objid ("1787cc50-790a-43ef-a23b-713f17fe1a6c")
        private static SmDependency EventDefinitionsDep = null;

        @objid ("a4ea8656-5ff1-4cd3-a1ec-ddc1baf0c4d9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEventData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a9388414-e619-4703-9409-e19e0a536e6d")
        public static SmDependency EventDefinitionsDep() {
            if (EventDefinitionsDep == null) {
            	EventDefinitionsDep = classof().getDependencyDef("EventDefinitions");
            }
            return EventDefinitionsDep;
        }

        @objid ("fdd581d0-a411-4822-9463-ddbdf81fea05")
        public static SmDependency getEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionsDep;
        }

        @objid ("66e7aeab-b34e-48d8-94ba-6875863c2cf6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007abd68-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a77d869f-4d7d-4c46-8875-e479c2011603")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("4f0bf10a-5c27-4800-9a83-9092ccc7dad3")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("007b22b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("9e1c58f5-5217-4399-913d-2930146944e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnEventData)data).mEventDefinitions != null)? ((BpmnEventData)data).mEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("fb2cfdff-3566-4cd9-a34f-97930dc8f220")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnEventData) data).mEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnEventData) data).mEventDefinitions;
            }

            @objid ("98455488-17ec-43a8-9e36-3df62bfa57bd")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.DefinedDep();
            }

        }

    }

}
