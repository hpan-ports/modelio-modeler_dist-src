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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("35fafa7a-4e79-40f1-8fa6-534716976069")
public class EObjectFlow extends EActivityEdge implements IEElement {
    @objid ("859c591d-b36a-4869-a776-65974a6306ed")
    private org.eclipse.uml2.uml.ObjectFlow ecoreElement;

    @objid ("c7020d01-7e1f-4a77-ada1-916074ac07bc")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.ActivityNode ecoreSource = ecoreElement.getSource();
        org.eclipse.uml2.uml.ActivityNode ecoreTarget = ecoreElement.getTarget();
                if ((ecoreSource != null) && (ecoreTarget != null)) {
           Object objingSource = ReverseProperties.getInstance().getMappedElement(ecoreSource);
           if ((objingSource != null)&& (objingSource instanceof ActivityNode)){
               return Modelio.getInstance().getModelingSession().getModel().createObjectFlow();
           }
                }
        return null;
    }

    @objid ("14a6000a-9f1f-4880-9de6-48d6ebbcdf72")
    public EObjectFlow(org.eclipse.uml2.uml.ObjectFlow element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("2eae77ff-ec78-4d48-998d-4a0cd31480f9")
    public void attach(Element objingElt) {
        // Attachment is done when setting the Source of the Edge.
    }

    @objid ("720282c2-7a76-40b9-881e-fff2c088c54e")
    public void attach(List<Object> objingElts) {
    }

    @objid ("c53f7f98-6a5c-4261-837c-64d58473bde8")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        
        // Properties of IObjectFlows:
        setEffectEAnnotation((ObjectFlow) objingElt);
        setMultiCast((ObjectFlow) objingElt);
        setMultiReceive((ObjectFlow) objingElt);
        setSelectionBehavior((ObjectFlow) objingElt);
        setTransformationBehavior((ObjectFlow) objingElt);
    }

    @objid ("ba1d90c2-8d80-4da3-8f95-4e36f1863536")
    private void setEffectEAnnotation(ObjectFlow flow) {
        String effect = ObjingEAnnotation.getEffect(ecoreElement);
        if ("CREATE_FLOW".equals(effect))
            flow.setEffect(ObjectFlowEffectKind.CREATEFLOW);
        else if ("DELETE_FLOW".equals(effect))
            flow.setEffect(ObjectFlowEffectKind.DELETEFLOW);
        else if ("EXCEPTION_FLOW".equals(effect))
            flow.setEffect(ObjectFlowEffectKind.EXCEPTIONFLOW);
        else if ("READ_FLOW".equals(effect))
            flow.setEffect(ObjectFlowEffectKind.READFLOW);
        else if ("UPDATEFLOW".equals(effect))
            flow.setEffect(ObjectFlowEffectKind.UPDATEFLOW);
        else
            flow.setEffect(ObjectFlowEffectKind.READFLOW);
    }

    @objid ("a4eb618a-d28e-4815-90fa-8cbcd0d49d35")
    private void setMultiCast(ObjectFlow flow) {
        flow.setIsMultiCast(ecoreElement.isMulticast());
    }

    @objid ("38dc405a-08df-4c03-9985-346f7688d151")
    private void setMultiReceive(ObjectFlow flow) {
        flow.setIsMultiReceive(ecoreElement.isMultireceive());
    }

    @objid ("3b2349d8-1f2c-4838-9ad3-e4193a8da8e2")
    private void setSelectionBehavior(ObjectFlow flow) {
        org.eclipse.uml2.uml. Behavior ecoreBehavior = ecoreElement.getSelection();
        if (ecoreBehavior instanceof org.eclipse.uml2.uml.OpaqueBehavior) {
            String objingBehavior = "";
            for (Object body : ((org.eclipse.uml2.uml.OpaqueBehavior) ecoreBehavior).getBodies()) {
                objingBehavior = objingBehavior.concat((String) body);
            }
            flow.setSelectionBehavior(objingBehavior);
        } else if (ecoreBehavior != null) {
            String behaviorName = ecoreBehavior.getName();
            if (behaviorName != null)
                flow.setSelectionBehavior(behaviorName);
        }
    }

    @objid ("2907253e-496b-4ef3-a6bb-a8f984823914")
    private void setTransformationBehavior(ObjectFlow flow) {
        org.eclipse.uml2.uml. Behavior ecoreBehavior = ecoreElement.getTransformation();
        if (ecoreBehavior instanceof org.eclipse.uml2.uml.OpaqueBehavior) {
            String objingBehavior = "";
            for (Object body : ((org.eclipse.uml2.uml.OpaqueBehavior) ecoreBehavior).getBodies()) {
                objingBehavior = objingBehavior.concat((String) body);
            }
            flow.setTransformationBehavior(objingBehavior);
        } else if (ecoreBehavior != null) {
            String behaviorName = ecoreBehavior.getName();
            if (behaviorName != null)
                flow.setTransformationBehavior(behaviorName);
        }
    }

}
