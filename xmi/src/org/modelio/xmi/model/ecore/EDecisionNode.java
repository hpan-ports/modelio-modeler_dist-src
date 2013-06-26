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
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("40b2f8f5-38bf-48a8-b111-ab4ad84dcba9")
public class EDecisionNode extends EActivityNode implements IEElement {
    @objid ("124ef5a9-804a-4b38-b872-2a142dab1d43")
    private org.eclipse.uml2.uml.DecisionNode ecoreElement;

    @objid ("f490a68f-5616-4eec-98ba-c529304a9085")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createDecisionMergeNode();
    }

    @objid ("2ca4905e-c8f9-4499-86ed-430a01143c18")
    public EDecisionNode(org.eclipse.uml2.uml.DecisionNode element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("1a296512-5ee6-497f-afa5-b3ebf611b46e")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("0fb74c07-645e-46db-8bf4-0604652a5cda")
    public void attach(List<Object> objingElts) {
    }

    @objid ("0d7722ee-e9df-417e-9033-62cd7a19b594")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setDecisionInput((DecisionMergeNode) objingElt);
    }

    @objid ("6a0f1d33-3be5-4ab8-a0bd-25b04fde46e1")
    private void setDecisionInput(DecisionMergeNode node) {
        org.eclipse.uml2.uml. Behavior decisionInput = ecoreElement.getDecisionInput();
        if (decisionInput != null && decisionInput instanceof org.eclipse.uml2.uml.OpaqueBehavior) {
            for (Object body : ((org.eclipse.uml2.uml.OpaqueBehavior) decisionInput).getBodies()) {
                if (!"".equals(body)) {
                    node.setDecisionInputBehavior((String) body);
                    break;
                }
            }
        }
    }

}
