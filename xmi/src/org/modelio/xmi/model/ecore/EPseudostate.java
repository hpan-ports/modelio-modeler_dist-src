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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("e21296fe-66a5-4d2d-8303-57b04a5dde18")
public class EPseudostate extends ENamedElement implements IEElement {
    @objid ("5672196a-010d-49fe-9045-45b53b26e68e")
    private org.eclipse.uml2.uml.Pseudostate ecoreElement;

    @objid ("0ddad894-955d-4e70-b46d-caa86892964a")
    public Element createObjingElt() {
        AbstractPseudoState state = null;
        
        switch (ecoreElement.getKind().getValue()) {
        case org.eclipse.uml2.uml.PseudostateKind.INITIAL:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createInitialPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.DEEP_HISTORY:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createDeepHistoryPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.SHALLOW_HISTORY:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createShallowHistoryPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.JOIN:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createJoinPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.FORK:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createForkPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.JUNCTION:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createJunctionPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.CHOICE:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createChoicePseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.ENTRY_POINT:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createEntryPointPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.EXIT_POINT:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createExitPointPseudoState();
            
            break;
        case org.eclipse.uml2.uml.PseudostateKind.TERMINATE:
            state = Modelio.getInstance().getModelingSession().getModel()
            .createTerminatePseudoState();
            
            break;
        }
        return state;
    }

    @objid ("b01024f9-4341-4a01-b6f8-b153b19f00fe")
    public EPseudostate(org.eclipse.uml2.uml.Pseudostate element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("5c3c7636-55e3-46c6-b0d0-fa2ff94da1ea")
    public void attach(Element objingElt) {
        org.eclipse.uml2.uml.Region ecoreContainer = ecoreElement.getContainer();
               
                if (ecoreContainer != null) {
           Object objingContainer = ReverseProperties.getInstance().getMappedElement(ecoreContainer);
               
           if ((objingContainer instanceof Region) && (objingElt instanceof StateVertex))
                   ((Region) objingContainer).getSub().add((StateVertex) objingElt);
           
                }else{
           org.eclipse.uml2.uml.StateMachine ecoreStateMachine = ecoreElement.getStateMachine();
           if (ecoreStateMachine != null){
               Object objingStateMachine = ReverseProperties.getInstance().getMappedElement(ecoreStateMachine);
               
               if ((objingStateMachine instanceof StateMachine) && (objingElt instanceof StateVertex)) {
               
                       ((StateMachine) objingStateMachine).getTop().getSub().add((StateVertex) objingElt);
                   
               }
           }else{
               org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
               if (ecoreOwner instanceof org.eclipse.uml2.uml.State){
                   State objOwner = (State) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
                   
                   if (objingElt instanceof EntryPointPseudoState)
                       objOwner.getEntryPoint().add((EntryPointPseudoState)objingElt);
                   else if (objingElt instanceof ExitPointPseudoState)
                       objOwner.getExitPoint().add((ExitPointPseudoState)objingElt);
                   
               }
           }
           
                }
    }

    @objid ("70effc7e-1a30-40a1-bea3-342bbdcd39df")
    public void attach(List<Object> objingElts) {
    }

    @objid ("94a95fed-5b9e-47ac-99ef-2fc42edd7bbe")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
