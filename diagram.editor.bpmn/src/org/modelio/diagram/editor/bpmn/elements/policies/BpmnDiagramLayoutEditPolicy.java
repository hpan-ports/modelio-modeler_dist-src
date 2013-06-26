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
                                    

package org.modelio.diagram.editor.bpmn.elements.policies;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.modelio.diagram.editor.bpmn.elements.bpmnlanesetcontainer.CreateBpmnLaneSetContainerCommand;
import org.modelio.diagram.elements.core.commands.DefaultReparentElementCommand;
import org.modelio.diagram.elements.core.commands.ModelioCreationContext;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.elements.core.policies.DiagramEditLayoutPolicy;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6219560b-55b6-11e2-877f-002564c97630")
public class BpmnDiagramLayoutEditPolicy extends DiagramEditLayoutPolicy {
    @objid ("6219560e-55b6-11e2-877f-002564c97630")
    @Override
    protected Command getCreateCommand(CreateRequest request) {
        if (request.getNewObjectType().equals("BpmnLaneSet")) {
            MObject hostElement = getHostElement();
        
            ModelioCreationContext ctx = (ModelioCreationContext) request.getNewObject();
        
            MObject elementToUnmask = ctx.getElementToUnmask();
        
            if (elementToUnmask != null) {
                if (getHostCompositeNode().canUnmask(elementToUnmask)) {
                    Object requestConstraint = getConstraintFor(request);
                    return new CreateBpmnLaneSetContainerCommand(hostElement,
                                                                 getHostCompositeNode(),
                                                                 ctx,
                                                                 requestConstraint);
                } else {
                    return null;
                }
            }
        
            Object requestConstraint = getConstraintFor(request);
            return new CreateBpmnLaneSetContainerCommand(hostElement,
                                                         getHostCompositeNode(),
                                                         ctx,
                                                         requestConstraint);
        }
        return super.getCreateCommand(request);
    }

    @objid ("62195614-55b6-11e2-877f-002564c97630")
    @Override
    public EditPart getTargetEditPart(Request request) {
        if (REQ_CREATE.equals(request.getType())) {
            CreateRequest createRequest = (CreateRequest) request;
            if (createRequest.getNewObject() instanceof ModelioCreationContext) {
                final ModelioCreationContext ctx = (ModelioCreationContext) createRequest.getNewObject();
                MObject element = ctx.getElementToUnmask();
                if (element instanceof BpmnLaneSet) {
                    if (canHandle(Metamodel.getJavaInterface(Metamodel.getMClass(ctx.getMetaclass()))))
                        return getHost();
                }
        
            }
        }
        return super.getTargetEditPart(request);
    }

    @objid ("6219561a-55b6-11e2-877f-002564c97630")
    @Override
    protected boolean canHandle(Class<? extends MObject> metaclass) {
        return ((GmCompositeNode) getHost().getModel()).canCreate(metaclass);
    }

    @objid ("621adc7a-55b6-11e2-877f-002564c97630")
    @Override
    protected MObject getHostElement() {
        // AbstractDiagram diagram = (AbstractDiagram) super.getHostElement();
        // return diagram.getOrigin();
        return getRoot(getHostCompositeNode().getRelatedElement());
    }

    @objid ("621adc81-55b6-11e2-877f-002564c97630")
    public MObject getRoot(MObject element) {
        if (element instanceof AbstractDiagram) {
            return ((AbstractDiagram) element).getOrigin();
        } else if (element instanceof BpmnProcess || element instanceof BpmnSubProcess) {
            return element;
        }
        return getRoot(element.getCompositionOwner());
    }

    @objid ("621adc8a-55b6-11e2-877f-002564c97630")
    @Override
    protected Command createAddCommand(final EditPart child, final Object constraint) {
        GmNodeModel gmmodel = (GmNodeModel) child.getModel();
        MObject element = gmmodel.getRelatedElement();
        if (element instanceof BpmnBoundaryEvent) {
        
            if (getHostElement() instanceof BpmnActivity) {
                return new BpmnBoundaryEventReparentElementCommand(getHostElement(),
                                                                   getHostCompositeNode(),
                                                                   (GmNodeModel) child.getModel(),
                                                                   constraint);
            }
        } else if (element instanceof BpmnLane) {
            return new BpmnLaneReparentElementCommand(getHostElement(),
                                                      getHostCompositeNode(),
                                                      (GmNodeModel) child.getModel(),
                                                      constraint);
        } else if (element instanceof BpmnFlowElement) {
            return new BpmnFlowElementReparentElementCommand(getHostElement(),
                                                             getHostCompositeNode(),
                                                             (GmNodeModel) child.getModel(),
                                                             constraint);
        } else {
            return new DefaultReparentElementCommand(getHostElement(),
                                                     getHostCompositeNode(),
                                                     (GmNodeModel) child.getModel(),
                                                     constraint);
        }
        return null;
    }

}
