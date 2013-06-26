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
                                    

package org.modelio.diagram.editor.sequence.elements.message;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.AncestorListener;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FeedbackHelper;
import org.eclipse.gef.editpolicies.SelectionHandlesEditPolicy;
import org.eclipse.gef.handles.ConnectionHandle;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.IsBeforePredicate;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.Predicate;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.TimeReference;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.Variable;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * This policy is in charge of handling the vertical translation of a message.
 * 
 * @author fpoyer
 */
@objid ("d965312a-55b6-11e2-877f-002564c97630")
public class MessageTranslationEditPolicy extends SelectionHandlesEditPolicy {
    @objid ("d965312d-55b6-11e2-877f-002564c97630")
    private ConnectionFocus focus;

    @objid ("d9653132-55b6-11e2-877f-002564c97630")
    private Map<TimeReference, Variable> variables = new HashMap<>();

    @objid ("d966b79a-55b6-11e2-877f-002564c97630")
    private List<Predicate> predicates = new ArrayList<>();

    @objid ("6b97c28d-1316-4332-8639-e6db294bde60")
    private FeedbackHelper feedbackHelper;

    @objid ("050c68c3-b68f-4f70-9b54-f47ce993d26a")
    private XYAnchor dummySourceAnchor = new XYAnchor(new Point(10, 10));

    @objid ("ede6b9d8-9f52-4468-b568-be4a136ca80d")
    private XYAnchor dummyTargetAnchor = new XYAnchor(new Point(10, 10));

    @objid ("a1802c5c-63d3-44f9-82a6-62f3c7f78c9b")
    private ConnectionAnchor originalSourceAnchor;

    @objid ("d0f48e1d-6aae-4bfa-baa9-a63fb0bf56db")
    private ConnectionAnchor originalTargetAnchor;

    @objid ("d966b79d-55b6-11e2-877f-002564c97630")
    @Override
    public void eraseSourceFeedback(final Request request) {
        if (REQ_RECONNECT_TARGET.equals(request.getType()) || REQ_RECONNECT_SOURCE.equals(request.getType()))
            eraseConnectionMoveFeedback((ReconnectRequest) request);
        else if (REQ_MOVE.equals(request.getType())) {
            eraseChangeBoundsFeedback((ChangeBoundsRequest) request);
        }
    }

    @objid ("d966b7a2-55b6-11e2-877f-002564c97630")
    @Override
    public Command getCommand(final Request request) {
        Object type = request.getType();
        
        if (REQ_MOVE.equals(type)) {
            // Before returning a command, check that the movement can atually be applied.
            // Compute predicates, update variables and check predicates
            computePredicatesForHost();
            updateVariablesFromRequest((ChangeBoundsRequest) request);
            if (checkAllPredicates()) {
                // Ignore request to move along the X axis
                ((ChangeBoundsRequest) request).getMoveDelta().x = 0;
                GmMessage gmMessage = (GmMessage) getHost().getModel();
                MoveMessageCommand moveMessageCommand = new MoveMessageCommand();
                moveMessageCommand.setDiagram(gmMessage.getDiagram());
                moveMessageCommand.setMessage(gmMessage.getRelatedElement());
                moveMessageCommand.setSourceTimeDelta(((ChangeBoundsRequest) request).getMoveDelta().y);
                moveMessageCommand.setTargetTimeDelta(((ChangeBoundsRequest) request).getMoveDelta().y);
                return moveMessageCommand;
            }
        }
        return null;
    }

    @objid ("d966b7a9-55b6-11e2-877f-002564c97630")
    @Override
    public void showSourceFeedback(final Request request) {
        if (REQ_RECONNECT_SOURCE.equals(request.getType()) || REQ_RECONNECT_TARGET.equals(request.getType()))
            showConnectionMoveFeedback((ReconnectRequest) request);
        else if (REQ_MOVE.equals(request.getType())) {
            showChangeBoundsFeedback((ChangeBoundsRequest) request);
        }
    }

    /**
     * @see org.eclipse.gef.editpolicies.SelectionHandlesEditPolicy#createSelectionHandles()
     */
    @objid ("d966b7ae-55b6-11e2-877f-002564c97630")
    @Override
    protected List<ConnectionHandle> createSelectionHandles() {
        List<ConnectionHandle> list = new ArrayList<>();
        list.add(new MessageHandle((ConnectionEditPart) getHost(), ConnectionLocator.TARGET));
        list.add(new MessageHandle((ConnectionEditPart) getHost(), ConnectionLocator.SOURCE));
        list.add(new MessageHandle((ConnectionEditPart) getHost(), ConnectionLocator.MIDDLE));
        return list;
    }

    /**
     * Erases connection move feedback. This method is called when a ReconnectRequest is received.
     * @param request the reconnect request.
     */
    @objid ("d966b7b6-55b6-11e2-877f-002564c97630")
    protected void eraseConnectionMoveFeedback(final ReconnectRequest request) {
        if (this.originalSourceAnchor != null) {
            getConnection().setSourceAnchor(this.originalSourceAnchor);
        }
        if (this.originalTargetAnchor != null) {
            getConnection().setTargetAnchor(this.originalTargetAnchor);
        }
        this.originalSourceAnchor = null;
        this.originalTargetAnchor = null;
        this.feedbackHelper = null;
    }

    /**
     * Convenience method for obtaining the host's <code>Connection</code> figure.
     * @return the Connection figure
     */
    @objid ("d966b7bb-55b6-11e2-877f-002564c97630")
    protected Connection getConnection() {
        return (Connection) ((GraphicalEditPart) getHost()).getFigure();
    }

    /**
     * Lazily creates and returns the feedback helper for the given request. The helper will be configured as either
     * moving the source or target end of the connection.
     * @param request the reconnect request
     * @return the feedback helper
     */
    @objid ("d966b7c0-55b6-11e2-877f-002564c97630")
    protected FeedbackHelper getFeedbackHelper(final ReconnectRequest request) {
        if (this.feedbackHelper == null) {
            this.feedbackHelper = new FeedbackHelper();
            this.feedbackHelper.setConnection(getConnection());
            this.feedbackHelper.setMovingStartAnchor(request.isMovingStartAnchor());
        }
        return this.feedbackHelper;
    }

    /**
     * Hides the focus indicator. The focus indicator is a dotted outline around the connection.
     * @see #showFocus()
     * @see org.eclipse.gef.editpolicies.SelectionEditPolicy#hideFocus()
     */
    @objid ("d966b7c7-55b6-11e2-877f-002564c97630")
    @Override
    protected void hideFocus() {
        if (this.focus != null) {
            removeFeedback(this.focus);
            this.focus = null;
        }
    }

    /**
     * Shows or updates connection move feedback. Called whenever a show feedback request is received for reconnection.
     * @param request the reconnect request
     */
    @objid ("d966b7cb-55b6-11e2-877f-002564c97630")
    protected void showConnectionMoveFeedback(final ReconnectRequest request) {
        NodeEditPart node = null;
        if (request.getTarget() instanceof NodeEditPart)
            node = (NodeEditPart) request.getTarget();
        if (this.originalSourceAnchor == null) {
            if (request.isMovingStartAnchor())
                this.originalSourceAnchor = getConnection().getSourceAnchor();
            else
                this.originalSourceAnchor = getConnection().getTargetAnchor();
        }
        ConnectionAnchor anchor = null;
        if (node != null) {
            if (request.isMovingStartAnchor())
                anchor = node.getSourceConnectionAnchor(request);
            else
                anchor = node.getTargetConnectionAnchor(request);
        }
        FeedbackHelper helper = getFeedbackHelper(request);
        helper.update(anchor, request.getLocation());
    }

    @objid ("d966b7d0-55b6-11e2-877f-002564c97630")
    @Override
    protected void showFocus() {
        if (this.focus == null) {
            this.focus = new ConnectionFocus();
            addFeedback(this.focus);
        }
    }

    /**
     * Shows or updates feedback for a change bounds request.
     * @param originalRequest the request
     */
    @objid ("d966b7d3-55b6-11e2-877f-002564c97630")
    protected void showChangeBoundsFeedback(final ChangeBoundsRequest originalRequest) {
        // Copy the original request, nullifying the x move delta.
        ChangeBoundsRequest request = new ChangeBoundsRequest(originalRequest.getType());
        request.setCenteredResize(originalRequest.isCenteredResize());
        request.setConstrainedMove(originalRequest.isConstrainedMove());
        request.setConstrainedResize(originalRequest.isConstrainedResize());
        request.setEditParts(originalRequest.getEditParts());
        request.setExtendedData(originalRequest.getExtendedData());
        request.setLocation(originalRequest.getLocation().getCopy());
        request.setMoveDelta(new Point(0, originalRequest.getMoveDelta().y));
        request.setResizeDirection(originalRequest.getResizeDirection());
        request.setSizeDelta(originalRequest.getSizeDelta().getCopy());
        // TODO: transmit the request to (if they exist): start and end blue square/gate and started execution(s).
        GmMessage messageModel = (GmMessage) getHost().getModel();
        Message message = messageModel.getRelatedElement();
        MessageEnd sourceEnd = message.getSendEvent();
        List<GmModel> sourceEndModels = messageModel.getDiagram().getAllGMRelatedTo(new MRef(sourceEnd));
        for (GmModel sourceEndModel : sourceEndModels) {
            if (((GmNodeModel) sourceEndModel).isVisible()) {
                ((EditPart) getHost().getViewer().getEditPartRegistry().get(sourceEndModel)).showSourceFeedback(request);
            }
        }
        MessageEnd targetEnd = message.getReceiveEvent();
        List<GmModel> targetEndModels = messageModel.getDiagram().getAllGMRelatedTo(new MRef(targetEnd));
        for (GmModel targetEndModel : targetEndModels) {
            if (((GmNodeModel) targetEndModel).isVisible()) {
                ((EditPart) getHost().getViewer().getEditPartRegistry().get(targetEndModel)).showSourceFeedback(request);
            }
        }
        if (this.originalSourceAnchor == null) {
            this.originalSourceAnchor = getConnection().getSourceAnchor();
        }
        if (this.originalTargetAnchor == null) {
            this.originalTargetAnchor = getConnection().getTargetAnchor();
        }
        Point p = this.originalSourceAnchor.getReferencePoint().getCopy();
        p.translate(0, request.getMoveDelta().y);
        this.dummySourceAnchor.setLocation(p);
        p = this.originalTargetAnchor.getReferencePoint().getCopy();
        p.translate(0, request.getMoveDelta().y);
        this.dummyTargetAnchor.setLocation(p);
        getConnection().setSourceAnchor(this.dummySourceAnchor);
        getConnection().setTargetAnchor(this.dummyTargetAnchor);
    }

    @objid ("d9683e39-55b6-11e2-877f-002564c97630")
    private void eraseChangeBoundsFeedback(final ChangeBoundsRequest request) {
        // TODO: transmit the request to (if they exist): start and end blue square/gate and started execution(s).
        GmMessage messageModel = (GmMessage) getHost().getModel();
        Message message = messageModel.getRelatedElement();
        MessageEnd sourceEnd = message.getSendEvent();
        List<GmModel> sourceEndModels = messageModel.getDiagram().getAllGMRelatedTo(new MRef(sourceEnd));
        for (GmModel sourceEndModel : sourceEndModels) {
            if (((GmNodeModel) sourceEndModel).isVisible()) {
                ((EditPart) getHost().getViewer().getEditPartRegistry().get(sourceEndModel)).eraseSourceFeedback(request);
            }
        }
        MessageEnd targetEnd = message.getReceiveEvent();
        List<GmModel> targetEndModels = messageModel.getDiagram().getAllGMRelatedTo(new MRef(targetEnd));
        for (GmModel targetEndModel : targetEndModels) {
            if (((GmNodeModel) targetEndModel).isVisible()) {
                ((EditPart) getHost().getViewer().getEditPartRegistry().get(targetEndModel)).eraseSourceFeedback(request);
            }
        }
        
        if (this.originalSourceAnchor != null) {
            getConnection().setSourceAnchor(this.originalSourceAnchor);
        }
        if (this.originalTargetAnchor != null) {
            getConnection().setTargetAnchor(this.originalTargetAnchor);
        }
        this.originalSourceAnchor = null;
        this.originalTargetAnchor = null;
    }

    @objid ("d9683e3d-55b6-11e2-877f-002564c97630")
    @Override
    public boolean understandsRequest(final Request request) {
        if (REQ_MOVE.equals(request.getType()))
            return true;
        else
            return false;
    }

    @objid ("d9683e43-55b6-11e2-877f-002564c97630")
    private void computePredicatesForHost() {
        this.variables.clear();
        this.predicates.clear();
        // Move and/or resizing an ExecutionSpecification, is really like move the ExecutionOccurrenceSpecification at each end.
        Message message = ((GmMessage) getHost().getModel()).getRelatedElement();
        computePredicatesForMessage(message);
    }

    @objid ("d9683e45-55b6-11e2-877f-002564c97630")
    private void updateVariablesFromRequest(final ChangeBoundsRequest request) {
        if (request.getEditParts() == null) {
            return;
        }
        for (Object obj : request.getEditParts()) {
            GraphicalEditPart editPart = (GraphicalEditPart) obj;
            if (editPart != null) {
                GmModel model = (GmModel) editPart.getModel();
                if (model.getRelatedElement() instanceof MessageEnd) {
                    updateVariablesForMessageEnd((MessageEnd) model.getRelatedElement(),
                                                 request.getMoveDelta().y);
                } else if (model.getRelatedElement() instanceof ExecutionSpecification) {
                    updateVariablesForExecutionSpecification((ExecutionSpecification) model.getRelatedElement(),
                                                             request.getMoveDelta().y,
                                                             request.getSizeDelta().height);
                } else if (model.getRelatedElement() instanceof Message) {
                    updateVariablesForMessage(request.getMoveDelta().y, (Message) model.getRelatedElement());
                }
        
            }
        }
    }

    @objid ("d9683e49-55b6-11e2-877f-002564c97630")
    private boolean checkAllPredicates() {
        for (Predicate predicate : this.predicates) {
            if (!predicate.evaluate())
                return false;
        }
        // All predicate evaluated to true
        return true;
    }

    @objid ("d9683e4d-55b6-11e2-877f-002564c97630")
    private void computePredicatesForMessageEnd(final MessageEnd messageEnd) {
        TimeReference timeReference = new TimeReference(messageEnd);
        Variable variable = this.variables.get(timeReference);
        if (variable == null) {
            variable = new Variable();
            variable.setValue(messageEnd.getLineNumber());
            this.variables.put(timeReference, variable);
        }
        if (messageEnd instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) messageEnd).getStarted() != null) {
            ExecutionOccurenceSpecification otherEnd = ((ExecutionOccurenceSpecification) messageEnd).getStarted()
                                                                                                       .getFinish();
            TimeReference otherEndTimeReference = new TimeReference(otherEnd);
            Variable variable2 = this.variables.get(otherEndTimeReference);
            if (variable2 == null) {
                variable2 = new Variable();
                variable2.setValue(otherEnd.getLineNumber());
                this.variables.put(otherEndTimeReference, variable2);
            }
            Predicate predicate = new IsBeforePredicate(variable,
                                                        variable2,
                                                        0/*execution specification min size*/,
                                                        true);
            this.predicates.add(predicate);
        }
        if (messageEnd instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) messageEnd).getFinished() != null) {
            ExecutionOccurenceSpecification otherEnd = ((ExecutionOccurenceSpecification) messageEnd).getFinished()
                                                                                                       .getStart();
            TimeReference otherEndTimeReference = new TimeReference(otherEnd);
            Variable variable2 = this.variables.get(otherEndTimeReference);
            if (variable2 == null) {
                variable2 = new Variable();
                variable2.setValue(otherEnd.getLineNumber());
                this.variables.put(otherEndTimeReference, variable2);
            }
            Predicate predicate = new IsBeforePredicate(variable2,
                                                        variable,
                                                        0/*execution specification min size*/,
                                                        true);
            this.predicates.add(predicate);
        }
        if (messageEnd.getSentMessage() != null) {
            MessageEnd otherEnd = messageEnd.getSentMessage().getReceiveEvent();
            TimeReference otherEndTimeReference = new TimeReference(otherEnd);
            Variable variable2 = this.variables.get(otherEndTimeReference);
            if (variable2 == null) {
                variable2 = new Variable();
                variable2.setValue(otherEnd.getLineNumber());
                this.variables.put(otherEndTimeReference, variable2);
            }
            Predicate predicate = new IsBeforePredicate(variable, variable2, 0, false);
            this.predicates.add(predicate);
        }
        if (messageEnd.getReceivedMessage() != null) {
            MessageEnd otherEnd = messageEnd.getReceivedMessage().getSendEvent();
            TimeReference otherEndTimeReference = new TimeReference(otherEnd);
            Variable variable2 = this.variables.get(otherEndTimeReference);
            if (variable2 == null) {
                variable2 = new Variable();
                variable2.setValue(otherEnd.getLineNumber());
                this.variables.put(otherEndTimeReference, variable2);
            }
            Predicate predicate = new IsBeforePredicate(variable2, variable, 0, false);
            this.predicates.add(predicate);
        }
    }

    /**
     * @param message
     */
    @objid ("d9683e53-55b6-11e2-877f-002564c97630")
    private void computePredicatesForMessage(final Message message) {
        computePredicatesForMessageEnd(message.getSendEvent());
        if (message.getSendEvent() instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted() != null) {
            ExecutionOccurenceSpecification finishExecutionOccurrenceSpecification = ((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted()
                                                                                                                                                 .getFinish();
            computePredicatesForMessageEnd(finishExecutionOccurrenceSpecification);
        }
        computePredicatesForMessageEnd(message.getReceiveEvent());
        if (message.getReceiveEvent() instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted() != null) {
            ExecutionOccurenceSpecification finishExecutionOccurenceSpecification = ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted()
                                                                                                                                                   .getFinish();
            computePredicatesForMessageEnd(finishExecutionOccurenceSpecification);
            if (finishExecutionOccurenceSpecification.getSentMessage() != null &&
                finishExecutionOccurenceSpecification.getSentMessage().getSortOfMessage() == MessageSort.RETURNMESSAGE) {
                computePredicatesForMessage(finishExecutionOccurenceSpecification.getSentMessage());
            }
        }
    }

    @objid ("d9683e5a-55b6-11e2-877f-002564c97630")
    private void updateVariablesForMessage(final int shift, final Message message) {
        // Send event
        updateVariablesForMessageEnd(message.getSendEvent(), shift);
        // Receive event
        updateVariablesForMessageEnd(message.getReceiveEvent(), shift);
        
        // If the moved message starts some execution specification, they will be moved too.
        if (message.getSendEvent() instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted() != null) {
            updateVariablesForExecutionSpecification(((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted(),
                                                     shift,
                                                     0);
        }
        if (message.getReceiveEvent() instanceof ExecutionOccurenceSpecification &&
            ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted() != null) {
            updateVariablesForExecutionSpecification(((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted(),
                                                     shift,
                                                     0);
            MessageEnd otherEnd = ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted()
                                                                                                 .getFinish();
            if (otherEnd.getSentMessage() != null &&
                otherEnd.getSentMessage().getSortOfMessage() == MessageSort.RETURNMESSAGE) {
                updateVariablesForMessage(shift, otherEnd.getSentMessage());
            }
        }
    }

    @objid ("d9683e62-55b6-11e2-877f-002564c97630")
    private void updateVariablesForExecutionSpecification(final ExecutionSpecification executionSpecification, final int shift, final int sizeDelta) {
        // Start with the Execution itself.
        Variable variable1 = this.variables.get(new TimeReference(executionSpecification));
        if (variable1 != null) {
            int newLineNumber = executionSpecification.getLineNumber() + shift;
            variable1.setValue(newLineNumber);
        }
        // Now the Execution start.
        updateVariablesForMessageEnd(executionSpecification.getStart(), shift);
        // And finally the Execution end.
        updateVariablesForMessageEnd(executionSpecification.getFinish(), shift + sizeDelta);
    }

    @objid ("d9683e6c-55b6-11e2-877f-002564c97630")
    private void updateVariablesForMessageEnd(final MessageEnd messageEnd, final int shift) {
        Variable variable2 = this.variables.get(new TimeReference(messageEnd));
        if (variable2 != null) {
            int newLineNumber = messageEnd.getLineNumber() + shift;
            variable2.setValue(newLineNumber);
        }
    }

    @objid ("d9683e74-55b6-11e2-877f-002564c97630")
    class ConnectionFocus extends Polygon implements PropertyChangeListener {
        @objid ("13b57fe5-b6ce-474c-ae28-ca6403a99118")
        public AncestorListener ancestorListener = new AncestorListener.Stub() {
            @Override
            public void ancestorMoved(IFigure ancestor) {
                revalidate();
            }
        };

        @objid ("d9683e76-55b6-11e2-877f-002564c97630")
        @Override
        public void addNotify() {
            super.addNotify();
            getConnection().addPropertyChangeListener(Connection.PROPERTY_POINTS, this);
            getConnection().addAncestorListener(this.ancestorListener);
        }

        @objid ("d9683e79-55b6-11e2-877f-002564c97630")
        @Override
        public void propertyChange(final PropertyChangeEvent evt) {
            revalidate();
        }

        @objid ("d969c4dc-55b6-11e2-877f-002564c97630")
        @Override
        public void removeNotify() {
            getConnection().removePropertyChangeListener(Connection.PROPERTY_POINTS, this);
            getConnection().removeAncestorListener(this.ancestorListener);
            super.removeNotify();
        }

        @objid ("d969c4df-55b6-11e2-877f-002564c97630")
        @Override
        public void validate() {
            if (isValid())
                return;
            PointList points = getConnection().getPoints().getCopy();
            getConnection().translateToAbsolute(points);
            //points = StrokePointList.strokeList(points, 5);
            translateToRelative(points);
            setPoints(points);
        }

        @objid ("d969c4e2-55b6-11e2-877f-002564c97630")
        ConnectionFocus() {
            setFill(true);
            setForegroundColor(ColorConstants.green);
            setBackgroundColor(ColorConstants.red);
            setXOR(true);
            setOutline(true);
        }

        @objid ("d969c4e4-55b6-11e2-877f-002564c97630")
        @Override
        protected void outlineShape(final Graphics g) {
            g.setLineDash(new int[] { 1, 1 });
            super.outlineShape(g);
        }

    }

}
