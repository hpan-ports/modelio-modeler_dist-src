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
                                    

package org.modelio.diagram.editor.transmuter;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.IMModelServices;
import org.modelio.gproject.model.api.MTools;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

// isShell = false isRamc = false
/**
 * Transmuter of Bpmn Event
 */
@objid ("83ce6191-5c05-11e2-a156-00137282c51b")
public class BpmnEventTransmuter implements ITransmuter {
    @objid ("19732662-5e26-11e2-a8be-00137282c51b")
    private String metaclass;

    @objid ("83ce6193-5c05-11e2-a156-00137282c51b")
    private MObject element;

    @objid ("83ce6195-5c05-11e2-a156-00137282c51b")
    public BpmnEventTransmuter(final MObject element, final String metaclass) {
        this.element = element;
        this.metaclass = metaclass;
    }

    @objid ("83ce61a0-5c05-11e2-a156-00137282c51b")
    @Override
    public boolean canTransmute() {
        return true;
    }

    @objid ("19732665-5e26-11e2-a8be-00137282c51b")
    @Override
    public MObject transmute(IMModelServices modelServices) {
        MObject owner = this.element.getCompositionOwner();
        
        // Create the Element...
        final IModelFactory modelFactory = modelServices.getModelFactory();
        MObject newElement = modelFactory.createElement(this.metaclass);
        
        // The new element must be attached to its parent using the composition dependency 
        // provided by the context. 
        // If the context provides a null dependency, use the default dependency recommended by the metamodel
        MDependency effectiveDependency = MTools.getMetaTool().getDefaultCompositionDep(owner, newElement);
        // ... and attach it to its parent.
        
        try {
            owner.mGet(effectiveDependency).add(newElement);
        } catch (Exception e) {
            //TODO : use a more accurate Exception...
            // The dependency indicated in the context cannot be used: try
            // to find a valid one!
            MDependency compositionDep = MTools.getMetaTool().getDefaultCompositionDep(owner, newElement);
            if (compositionDep != null) {
                owner.mGet(compositionDep).add(newElement);
            } else {
                newElement.delete();
                return null;
            }
        }
        
        if (newElement instanceof BpmnFlowElement && owner instanceof BpmnLane) {
            BpmnLane lane = (BpmnLane) owner;
            BpmnFlowElement flowElement = (BpmnFlowElement) newElement;
            flowElement.getBpmnLaneRefs().add(lane);
            lane.getFlowElementRef().add(flowElement);
        }
        
        // Set default name
        newElement.setName(modelServices.getElementNamer().getUniqueName(newElement));
        
        if (this.element instanceof BpmnEvent && newElement instanceof BpmnEvent) {
            BpmnEvent newEvent = (BpmnEvent) newElement;
            BpmnEvent oldEvent = (BpmnEvent) this.element;
            newEvent.setName(oldEvent.getName());
        
            for (BpmnLane lane : oldEvent.getBpmnLaneRefs()) {
                newEvent.getBpmnLaneRefs().add(lane);
            }
        
            if (!(newEvent instanceof BpmnEndEvent)) {
                for (BpmnSequenceFlow subelement : new ArrayList<>(oldEvent.getOutgoing())) {
                    newEvent.getOutgoing().add(subelement);
                }
            }
        
            if (!(newEvent instanceof BpmnStartEvent)) {
                for (BpmnSequenceFlow subelement : new ArrayList<>(oldEvent.getIncoming())) {
                    newEvent.getIncoming().add(subelement);
                }
            }
        
            for (BpmnLane subelement : new ArrayList<>(oldEvent.getLane())) {
                newEvent.getLane().add(subelement);
            }
        
            for (Dependency subelement : new ArrayList<>(oldEvent.getImpactedDependency())) {
                newEvent.getImpactedDependency().add(subelement);
            }
        
            for (Dependency subelement : new ArrayList<>(oldEvent.getDependsOnDependency())) {
                newEvent.getDependsOnDependency().add(subelement);
            }
        
            for (BpmnEventDefinition definition : new ArrayList<>(oldEvent.getEventDefinitions())) {
                newEvent.getEventDefinitions().add(definition);
            }
            
            if (oldEvent.getOutgoingFlow().size() >0) {
                for(BpmnMessageFlow flow : new ArrayList<>(oldEvent.getOutgoingFlow())) {
                    newEvent.getOutgoingFlow().add(flow);
                }
            }
            
            if (oldEvent.getIncomingFlow().size() >0) {
                for(BpmnMessageFlow flow : new ArrayList<>(oldEvent.getIncomingFlow())) {
                    newEvent.getIncomingFlow().add(flow);
                }
            }
        }
        return newElement;
    }

}
