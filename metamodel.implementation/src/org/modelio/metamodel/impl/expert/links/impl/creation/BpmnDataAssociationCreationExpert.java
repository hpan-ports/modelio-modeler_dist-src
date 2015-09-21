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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.expert.links.ILinkExpert;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Creation expert for {@link BpmnDataAssociation}
 */
@objid ("7e974158-1eb2-11e2-8009-002564c97630")
public class BpmnDataAssociationCreationExpert extends DefaultDelegatingLinkExpert {
    @objid ("7e97415d-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canSource(MClass linkMetaclass, MClass fromMetaclass) {
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        
        if (BpmnThrowEvent.class.isAssignableFrom(fromJmc)) {
            return false;
        } else if (BpmnDataOutput.class.isAssignableFrom(fromJmc)) {
            return false;
        } else if (BpmnActivity.class.isAssignableFrom(fromJmc)) {
            return true;
        } else if (BpmnItemAwareElement.class.isAssignableFrom(fromJmc)) {
            return true;
        } else if (BpmnEvent.class.isAssignableFrom(fromJmc)) {
            return true;
        } else if (fromMetaclass instanceof BpmnSequenceFlow) {
            return true;
        }
        return false;
    }

    @objid ("7e974166-1eb2-11e2-8009-002564c97630")
    @Override
    public boolean canLink(final MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass) {
        if (!canSource(linkMetaclass, fromMetaclass)) {
            return false;
        }
        
        Class<? extends MObject> fromJmc = fromMetaclass.getJavaInterface();
        Class<? extends MObject> toJmc = toMetaclass.getJavaInterface();
        
        if (toMetaclass instanceof BpmnDataInput) {
            return false;
        } else {
            if (BpmnActivity.class.isAssignableFrom(fromJmc) && BpmnItemAwareElement.class.isAssignableFrom(toJmc)) {
                return true;
            } else if (BpmnItemAwareElement.class.isAssignableFrom(fromJmc) && BpmnActivity.class.isAssignableFrom(toJmc)) {
                return true;
            } else if (BpmnCatchEvent.class.isAssignableFrom(fromJmc) && BpmnItemAwareElement.class.isAssignableFrom(toJmc)) {
                return true;
            } else if (BpmnItemAwareElement.class.isAssignableFrom(fromJmc) && BpmnThrowEvent.class.isAssignableFrom(toJmc)) {
                return true;
            } else if (BpmnItemAwareElement.class.isAssignableFrom(fromJmc) && BpmnSequenceFlow.class.isAssignableFrom(toJmc)) {
                return true;
            } else if (BpmnSequenceFlow.class.isAssignableFrom(fromJmc) && BpmnItemAwareElement.class.isAssignableFrom(toJmc)) {
                return true;
            }
        }
        return false;
    }

    @objid ("7e974171-1eb2-11e2-8009-002564c97630")
    private boolean isSameContext(final MObject fromElement, final MObject toElement) {
        MObject formContext = getContext(fromElement);
        MObject toContext = getContext(toElement);
        return formContext.equals(toContext);
    }

    @objid ("7e974179-1eb2-11e2-8009-002564c97630")
    private MObject getContext(final MObject element) {
        if (element instanceof BpmnProcess) {
            return element;
        }
        
        if (element.getCompositionOwner() instanceof BpmnProcess) {
            BpmnFlowElement flow = (BpmnFlowElement) element;
            for (BpmnLane lane : flow.getLane()) {
                return getFirstLane(lane);
            }
        }
        return getContext(element.getCompositionOwner());
    }

    @objid ("7e97417f-1eb2-11e2-8009-002564c97630")
    private BpmnLane getFirstLane(final BpmnLane lane) {
        BpmnLaneSet owner = (BpmnLaneSet) lane.getCompositionOwner();
        if (owner.getParentLane() != null) {
            return getFirstLane(owner.getParentLane());
        }
        return lane;
    }

    @objid ("0656ed26-75fb-4c47-968d-b10534f1f3a9")
    @Override
    public boolean canSource(final MObject linkElement, final MObject fromElement) {
        if (fromElement instanceof BpmnThrowEvent) {
            return false;
        } else if (fromElement instanceof BpmnDataOutput) {
            return false;
        } else if (fromElement instanceof BpmnActivity) {
            return true;
        } else if (fromElement instanceof BpmnItemAwareElement) {
            return true;
        } else if (fromElement instanceof BpmnEvent) {
            return true;
        } else if (fromElement instanceof BpmnSequenceFlow) {
            return true;
        }
        return false;
    }

    @objid ("97d3a7a1-0bb7-4312-98c3-2c6c2a11133c")
    @Override
    public boolean canLink(final MClass linkMetaclass, final MObject fromElement, final MObject toElement) {
        if (!canSource(linkMetaclass, fromElement.getMClass())) {
            return false;
        }
        
        boolean validMetaclass = false;
        
        if (toElement instanceof BpmnDataInput) {
            validMetaclass = false;
        } else {
            if (fromElement instanceof BpmnActivity && toElement instanceof BpmnItemAwareElement) {
                validMetaclass = true;
            } else if (fromElement instanceof BpmnItemAwareElement && toElement instanceof BpmnActivity) {
                validMetaclass = true;
            } else if (fromElement instanceof BpmnCatchEvent && toElement instanceof BpmnItemAwareElement) {
                validMetaclass = true;
            } else if (fromElement instanceof BpmnItemAwareElement && toElement instanceof BpmnThrowEvent) {
                validMetaclass = true;
            } else if (fromElement instanceof BpmnItemAwareElement && toElement instanceof BpmnSequenceFlow) {
                return true;
            } else if (fromElement instanceof BpmnSequenceFlow && toElement instanceof BpmnItemAwareElement) {
                return true;
            }
        }
        
        if (validMetaclass) {
            return isSameContext(fromElement, toElement);
        }
        return false;
    }

    @objid ("c019359c-883f-40eb-85ac-8406b8ac17f4")
    public BpmnDataAssociationCreationExpert(ILinkExpert defaultExpert) {
        super(defaultExpert);
    }

}
