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
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("554ecc30-cd0f-45a1-b60a-d4ea1e2a66d4")
public class EAcceptEventAction extends EActivityNode implements IEElement {
    @objid ("ac93d503-cf8c-4476-81de-ca218a4696ad")
    private boolean hasReceiveOperationEvent = false;

    @objid ("cd1aa618-c53c-458f-aa62-4d3a7c7092b2")
    private boolean hasSignalEvent = false;

    @objid ("a7424805-9326-46a0-8efd-ee4e4643d4c4")
    private boolean hasChangeEvent = false;

    @objid ("b56709ed-a4ae-4762-ba69-3c0230358ee5")
    private boolean hasTimeEvent = false;

    @objid ("4891d5f1-a0f9-4f64-bffd-5a4df1a00c85")
    public EAcceptEventAction(org.eclipse.uml2.uml.AcceptEventAction element) {
        super(element);
        //        if (EcoreModelNavigation.hasReceiveOperationEvent(element)) {
        //            hasReceiveOperationEvent = true;
        //            
        //        } else 
            if (EcoreModelNavigation.hasSignalEvent(element)) {
            hasSignalEvent = true;
        
        } else if (EcoreModelNavigation.hasChangeEvent(element)) {
            hasChangeEvent = true;
            
        } else if (EcoreModelNavigation.hasTimeEvent(element)) {
            hasTimeEvent = true;
        }
    }

    @objid ("0e493c8f-4c55-419f-985d-66a78515e3fd")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.AcceptEventAction ecoreElement =  (org.eclipse.uml2.uml.AcceptEventAction) getEcoreElement();
                if (hasReceiveOperationEvent) {
           return Modelio.getInstance().getModelingSession().getModel()
                   .createAcceptCallEventAction();
                } else if (hasSignalEvent) {
           return Modelio.getInstance().getModelingSession().getModel()
                   .createAcceptSignalAction();
                } else if (hasChangeEvent) {
           return Modelio.getInstance().getModelingSession().getModel()
                   .createAcceptChangeEventAction();
                } else if (hasTimeEvent) {
           return Modelio.getInstance().getModelingSession().getModel()
                   .createAcceptTimeEventAction();
                } else
           if (ReverseProperties.getInstance().isRoundtripEnabled()){
               String signal = ObjingEAnnotation.getSignal(ecoreElement);
               if ((signal != null) && (signal.equals("signal")))
                   return Modelio.getInstance().getModelingSession().getModel()
                   .createAcceptSignalAction();
           }
        return Modelio.getInstance().getModelingSession().getModel()
                .createAcceptCallEventAction();
    }

    @objid ("7998daea-0279-4bad-a642-27981ea59d65")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("df8d557a-0844-408b-9aee-1c545f4c6c26")
    public void attach(List<Object> objingElts) {
    }

    @objid ("a89c0b7c-7fea-473c-8651-3a2dec9be441")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        if (hasReceiveOperationEvent)
            setCalled((AcceptCallEventAction) objingElt);
        else if (hasSignalEvent)
            setAccepted((AcceptSignalAction) objingElt);
        else if (hasChangeEvent)
            setChangeExpression((AcceptChangeEventAction) objingElt);
        else if (hasTimeEvent)
            setTimeExpression((AcceptTimeEventAction) objingElt);
    }

    @objid ("5a515adf-f2a9-458d-846a-e4189e1ca323")
    private void setCalled(AcceptCallEventAction action) {
        for (Object trigger :  ( (org.eclipse.uml2.uml.AcceptEventAction) getEcoreElement()).getTriggers()) {
             org.eclipse.uml2.uml.Event event = ( (org.eclipse.uml2.uml.Trigger) trigger).getEvent();
        //            if (event instanceof  org.eclipse.uml2.uml.ReceiveOperationEvent) {
        //                 org.eclipse.uml2.uml.Operation ecoreOperation = ( (org.eclipse.uml2.uml.ReceiveOperationEvent) event)
        //                        .getOperation();
        //                if (ecoreOperation != null) {
        //                    Object objingOperation =  ReverseProperties.getInstance()
        //                            .getMappedElement(ecoreOperation);
        //                    if (objingOperation instanceof Operation) {
        //                        action.setCalled((Operation) objingOperation);
        //                        break;
        //                    }
        //                }
        //            }
        }
    }

    @objid ("f59d1829-3b3c-484b-82ab-5924be545750")
    private void setAccepted(AcceptSignalAction action) {
        for (Object trigger :  ( (org.eclipse.uml2.uml.AcceptEventAction) getEcoreElement()).getTriggers()) {
             org.eclipse.uml2.uml.Event event = ( (org.eclipse.uml2.uml.Trigger) trigger).getEvent();
            if (event instanceof  org.eclipse.uml2.uml.SignalEvent) {
                 org.eclipse.uml2.uml.Signal ecoreSignal = ( (org.eclipse.uml2.uml.SignalEvent) event).getSignal();
                if (ecoreSignal != null) {
                    Object objingSignal =  ReverseProperties.getInstance().getMappedElement(ecoreSignal);
                    if (objingSignal instanceof Signal)
                        action.getAccepted().add((Signal) objingSignal);
                }
            }
        }
    }

    @objid ("7b724d3f-f020-4af5-8d8b-4820fe1f503f")
    private void setChangeExpression(AcceptChangeEventAction action) {
        for (Object trigger :  ( (org.eclipse.uml2.uml.AcceptEventAction) getEcoreElement()).getTriggers()) {
             org.eclipse.uml2.uml.Event event = ( (org.eclipse.uml2.uml.Trigger) trigger).getEvent();
            if (event instanceof  org.eclipse.uml2.uml.ChangeEvent) {
                 org.eclipse.uml2.uml.ValueSpecification value = ( (org.eclipse.uml2.uml.ChangeEvent) event)
                        .getChangeExpression();
                if (value != null) {
                    String stringValue = value.stringValue();
                    if (stringValue != null) {
                        action.setChangeExpresion(stringValue);
                        break;
                    }
                }
            }
        }
    }

    @objid ("5417fa0e-7f8c-446e-b546-521279bb0d08")
    private void setTimeExpression(AcceptTimeEventAction action) {
        for (Object trigger :  ( (org.eclipse.uml2.uml.AcceptEventAction) getEcoreElement()).getTriggers()) {
             org.eclipse.uml2.uml.Event event = ( (org.eclipse.uml2.uml.Trigger) trigger).getEvent();
            if (event instanceof  org.eclipse.uml2.uml.TimeEvent) {
                 org.eclipse.uml2.uml.ValueSpecification value = ( (org.eclipse.uml2.uml.TimeEvent) event).getWhen();
                if (value != null) {
                    String stringValue = value.stringValue();
                    if (stringValue != null) {
                        action.setTimeExpresion(stringValue);
                        break;
                    }
                }
            }
        }
    }

}
