/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.metamodel.impl.expert.links.impl.creation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.expert.links.ILinkExpert;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link BpmnMessageFlow}
 */
@objid ("7e974185-1eb2-11e2-8009-002564c97630")
public class BpmnMessageFlowCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("7e97418a-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(final MObject fromElement, final MObject ownerElement) {
        if (fromElement instanceof BpmnLane) {
            return true;
        } else if (fromElement instanceof BpmnActivity) {
            return true;
        } else if (fromElement instanceof BpmnThrowEvent) {
            return true;
        }
        return false;
    }

    @objid ("7e99a298-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        if (!canSource(linkMetaclass, fromElement.getMClass())) {
            return false;
        }
        
        if (fromElement.equals(toElement)) {
            return false;
        }
        
        if (fromElement instanceof BpmnFlowElement && toElement instanceof BpmnFlowElement && isSameContext(fromElement, toElement)) {
            return false;
        }
        
        if (toElement instanceof BpmnLane) {
            return true;
        } else if (toElement instanceof BpmnCatchEvent) {
            return true;
        } else if (toElement instanceof BpmnActivity) {
            return true;
        }
        return false;
    }

    @objid ("7e99a2a3-1eb2-11e2-8009-002564c97630")
    private boolean isSameContext(final MObject from, final MObject to) {
        MObject formContext = getContext(from, true);
        MObject toContext = getContext(to, true);
        return formContext.equals(toContext);
    }

    @objid ("7e99a2ab-1eb2-11e2-8009-002564c97630")
    private MObject getContext(final MObject element, final boolean rec) {
        if (element instanceof BpmnProcess) {
            return element;
        } else if (element instanceof BpmnSubProcess) {
            if (!rec) {
                return element;
            }
        }
        
        if (element.getCompositionOwner() instanceof BpmnProcess) {
            BpmnFlowElement flow = (BpmnFlowElement) element;
            for (BpmnLane lane : flow.getLane()) {
                return getFirstLane(lane);
            }
        }
        return getContext(element.getCompositionOwner(), false);
    }

    @objid ("7e99a2b3-1eb2-11e2-8009-002564c97630")
    private BpmnLane getFirstLane(final BpmnLane lane) {
        BpmnLaneSet owner = (BpmnLaneSet) lane.getCompositionOwner();
        if (owner.getParentLane() != null) {
            return getFirstLane(owner.getParentLane());
        }
        return lane;
    }

    @objid ("1a14a6b3-9ccf-4513-822a-0adc28800000")
    public BpmnMessageFlowCreationExpert(ILinkExpert defaultExpert) {
        super(defaultExpert);
    }

}
