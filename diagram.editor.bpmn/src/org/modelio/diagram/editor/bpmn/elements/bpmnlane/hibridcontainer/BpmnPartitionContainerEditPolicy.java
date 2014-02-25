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
                                    

package org.modelio.diagram.editor.bpmn.elements.bpmnlane.hibridcontainer;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.modelio.diagram.editor.bpmn.elements.bpmnlane.CreateBpmnLaneCommand;
import org.modelio.diagram.editor.bpmn.elements.policies.BpmnLaneReparentElementCommand;
import org.modelio.diagram.elements.core.commands.ModelioCreationContext;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.elements.core.policies.DiagramEditLayoutPolicy;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("6134744d-55b6-11e2-877f-002564c97630")
public class BpmnPartitionContainerEditPolicy extends DiagramEditLayoutPolicy {
    @objid ("61347450-55b6-11e2-877f-002564c97630")
    @Override
    protected Command getCreateCommand(final CreateRequest request) {
        if (request.getNewObjectType().equals("BpmnLane")) {
            //Element hostElement = getHostElement();
        
            ModelioCreationContext ctx = (ModelioCreationContext) request.getNewObject();
        
            MObject elementToUnmask = ctx.getElementToUnmask();
        
            if (elementToUnmask != null) {
                if (getHostCompositeNode().canUnmask(elementToUnmask)) {
                    //Object requestConstraint = getConstraintFor(request);
                    return new CreateBpmnLaneCommand(getHostCompositeNode(), ctx);
                } else {
                    return null;
                }
            }
        
            //Object requestConstraint = getConstraintFor(request);
            return new CreateBpmnLaneCommand(getHostCompositeNode(), ctx);
        }
        return super.getCreateCommand(request);
    }

    @objid ("61347457-55b6-11e2-877f-002564c97630")
    @Override
    public EditPart getTargetEditPart(final Request request) {
        if (REQ_CREATE.equals(request.getType())) {
        
            CreateRequest createRequest = (CreateRequest) request;
            final ModelioCreationContext ctx = (ModelioCreationContext) createRequest.getNewObject();
            if (createRequest.getNewObject() instanceof ModelioCreationContext) {
                if (BpmnLane.class.isAssignableFrom(Metamodel.getJavaInterface(Metamodel.getMClass(ctx.getMetaclass())))) {
                    if (ctx.getElementToUnmask() != null) {
                        if (getHostCompositeNode().canUnmask(ctx.getElementToUnmask())) {
                            return getHost();
                        } else {
                            return null;
                        }
                    }
                    if (canHandle(Metamodel.getJavaInterface(Metamodel.getMClass(ctx.getMetaclass()))))
                        return getHost();
                }
            }
        }
        return super.getTargetEditPart(request);
    }

    @objid ("6134745e-55b6-11e2-877f-002564c97630")
    @Override
    protected boolean canHandle(final Class<? extends MObject> metaclass) {
        return ((GmCompositeNode) getHost().getModel()).canCreate(metaclass);
    }

    @objid ("6135faba-55b6-11e2-877f-002564c97630")
    @Override
    protected Command createAddCommand(final EditPart child, final Object constraint) {
        return new BpmnLaneReparentElementCommand(((GmModel) (getHost()).getModel()).getRelatedElement(),
                getHostCompositeNode(),
                (GmNodeModel) child.getModel(),
                constraint);
    }

    @objid ("481272b6-9b57-45a2-9478-f3e72976ac0b")
    @Override
    protected MObject getHostElement() {
        return getHostCompositeNode().getRelatedElement();
    }

}
