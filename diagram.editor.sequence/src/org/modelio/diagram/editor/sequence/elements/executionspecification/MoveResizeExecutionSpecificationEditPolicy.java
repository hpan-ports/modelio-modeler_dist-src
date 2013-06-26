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
                                    

package org.modelio.diagram.editor.sequence.elements.executionspecification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.IsBeforePredicate;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.Predicate;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.TimeReference;
import org.modelio.diagram.editor.sequence.elements.modelmanipulation.Variable;
import org.modelio.diagram.elements.core.model.GmModel;
import org.modelio.diagram.elements.core.policies.DefaultNodeResizableEditPolicy;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;

/**
 * Specialisation of the default resize edit policy to add some model checks before returning a command.
 * 
 * @author fpoyer
 */
@objid ("d8efb2f2-55b6-11e2-877f-002564c97630")
public class MoveResizeExecutionSpecificationEditPolicy extends DefaultNodeResizableEditPolicy {
    @objid ("d8efb2f6-55b6-11e2-877f-002564c97630")
    private Map<TimeReference, Variable> variables = new HashMap<>();

    @objid ("d8efb2fa-55b6-11e2-877f-002564c97630")
    private List<Predicate> predicates = new ArrayList<>();

    @objid ("d8efb2fd-55b6-11e2-877f-002564c97630")
    @Override
    protected Command getResizeCommand(final ChangeBoundsRequest request) {
        // Compute predicates, update variables and check predicates
        computePredicatesForHost();
        updateVariablesFromRequest(request);
        if (checkAllPredicates()) {
            return super.getResizeCommand(request);
        } else {
            return UnexecutableCommand.INSTANCE;
        }
    }

    @objid ("d8efb303-55b6-11e2-877f-002564c97630")
    @Override
    protected Command getMoveCommand(final ChangeBoundsRequest request) {
        // Compute predicates, update variables and check predicates
        computePredicatesForHost();
        updateVariablesFromRequest(request);
        if (checkAllPredicates()) {
            return super.getMoveCommand(request);
        } else {
            return UnexecutableCommand.INSTANCE;
        }
    }

    @objid ("d8efb309-55b6-11e2-877f-002564c97630")
    private void computePredicatesForHost() {
        this.variables.clear();
        this.predicates.clear();
        // Move and/or resizing an ExecutionSpecification, is really like move the ExecutionOccurrenceSpecification at each end.
        ExecutionSpecification executionSpecification = ((GmExecutionSpecification) getHost().getModel()).getRelatedElement();
        computePredicatesForExecutionOccurrenceSpecification(executionSpecification.getStart());
        computePredicatesForExecutionOccurrenceSpecification(executionSpecification.getFinish());
    }

    @objid ("d8efb30b-55b6-11e2-877f-002564c97630")
    private void updateVariablesFromRequest(final ChangeBoundsRequest request) {
        if (request.getEditParts() == null) {
            return;
        }
        for (Object obj : request.getEditParts()) {
            GraphicalEditPart editPart = (GraphicalEditPart) obj;
            if (editPart != null) {
                GmModel model = (GmModel) editPart.getModel();
                Variable variable1 = this.variables.get(new TimeReference(model.getRelatedElement()));
                if (model.getRelatedElement() instanceof MessageEnd && variable1 != null) {
                    int newLineNumber = ((MessageEnd) model.getRelatedElement()).getLineNumber();
                    newLineNumber += request.getMoveDelta().y;
                    variable1.setValue(newLineNumber);
                } else if (model.getRelatedElement() instanceof ExecutionSpecification) {
                    // Start with the Execution itself.
                    ExecutionSpecification executionSpecification = (ExecutionSpecification) model.getRelatedElement();
                    if (variable1 != null) {
                        int newLineNumber = executionSpecification.getLineNumber();
                        newLineNumber += request.getMoveDelta().y;
                        variable1.setValue(newLineNumber);
                    }
        
                    // Now the Execution start.
                    variable1 = this.variables.get(new TimeReference(executionSpecification.getStart()));
                    if (variable1 != null) {
                        int newLineNumber = executionSpecification.getStart().getLineNumber();
                        newLineNumber += request.getMoveDelta().y;
                        variable1.setValue(newLineNumber);
                    }
                    // And finally the Execution end.
                    variable1 = this.variables.get(new TimeReference(executionSpecification.getFinish()));
                    if (variable1 != null) {
                        int newLineNumber = executionSpecification.getFinish().getLineNumber();
                        newLineNumber += request.getMoveDelta().y + request.getSizeDelta().height;
                        variable1.setValue(newLineNumber);
                    }
        
                } else if (model.getRelatedElement() instanceof Message) {
                    Message message = (Message) model.getRelatedElement();
                    variable1 = this.variables.get(new TimeReference(message.getSendEvent()));
                    if (variable1 != null) {
                        int newLineNumber = message.getSendEvent().getLineNumber();
                        newLineNumber += request.getMoveDelta().y;
                        variable1.setValue(newLineNumber);
                    }
                    variable1 = this.variables.get(new TimeReference(message.getReceiveEvent()));
                    if (variable1 != null) {
                        int newLineNumber = message.getReceiveEvent().getLineNumber();
                        newLineNumber += request.getMoveDelta().y;
                        variable1.setValue(newLineNumber);
                    }
                    // If the moved message starts some execution specification, they will be moved too.
                    if (message.getSendEvent() instanceof ExecutionOccurenceSpecification &&
                        ((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted() != null) {
                        MessageEnd otherEnd = ((ExecutionOccurenceSpecification) message.getSendEvent()).getStarted()
                                                                                                          .getFinish();
                        variable1 = this.variables.get(new TimeReference(otherEnd));
                        if (variable1 != null) {
                            int newLineNumber = otherEnd.getLineNumber();
                            newLineNumber += request.getMoveDelta().y;
                            variable1.setValue(newLineNumber);
                        }
                    }
                    if (message.getReceiveEvent() instanceof ExecutionOccurenceSpecification &&
                        ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted() != null) {
                        MessageEnd otherEnd = ((ExecutionOccurenceSpecification) message.getReceiveEvent()).getStarted()
                                                                                                             .getFinish();
                        variable1 = this.variables.get(new TimeReference(otherEnd));
                        if (variable1 != null) {
                            int newLineNumber = otherEnd.getLineNumber();
                            newLineNumber += request.getMoveDelta().y;
                            variable1.setValue(newLineNumber);
                        }
                    }
                }
        
            }
        }
    }

    @objid ("d8efb30f-55b6-11e2-877f-002564c97630")
    private boolean checkAllPredicates() {
        for (Predicate predicate : this.predicates) {
            if (!predicate.evaluate())
                return false;
        }
        // All predicate evaluated to true
        return true;
    }

    @objid ("d8efb313-55b6-11e2-877f-002564c97630")
    private void computePredicatesForExecutionOccurrenceSpecification(final ExecutionOccurenceSpecification executionOccurrenceSpecification) {
        TimeReference timeReference = new TimeReference(executionOccurrenceSpecification);
        Variable variable = this.variables.get(timeReference);
        if (variable == null) {
            variable = new Variable();
            variable.setValue(executionOccurrenceSpecification.getLineNumber());
            this.variables.put(timeReference, variable);
        }
        if (executionOccurrenceSpecification.getStarted() != null) {
            ExecutionOccurenceSpecification otherEnd = executionOccurrenceSpecification.getStarted()
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
        if (executionOccurrenceSpecification.getFinished() != null) {
            ExecutionOccurenceSpecification otherEnd = executionOccurrenceSpecification.getFinished()
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
        if (executionOccurrenceSpecification.getSentMessage() != null) {
            MessageEnd otherEnd = executionOccurrenceSpecification.getSentMessage().getReceiveEvent();
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
        if (executionOccurrenceSpecification.getReceivedMessage() != null) {
            MessageEnd otherEnd = executionOccurrenceSpecification.getReceivedMessage().getSendEvent();
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

}
