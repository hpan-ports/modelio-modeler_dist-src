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
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("3cf6b1df-8a80-4578-aa64-181554e6b87c")
public class EInteractionOperand extends EInteractionFragment implements IEElement {
    @objid ("0ca345ea-7f0f-4c09-88d1-47fae531fe03")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createInteractionOperand();
    }

    @objid ("bcd9c0cf-89a0-42bd-9830-ea4418945646")
    public EInteractionOperand(org.eclipse.uml2.uml.InteractionOperand element) {
        super(element);
    }

    @objid ("86f18634-a435-448e-90f3-ba4c39b57dea")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("12fa95e7-98f1-4616-b7fb-0608e2912ea7")
    public void attach(List<Object> objingElts) {
    }

    @objid ("2bef3490-7c60-40a7-9519-4b3723a211c1")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setGuard((InteractionOperand) objingElt);
    }

    @objid ("61f26a7f-5f8b-4598-b8e8-55969f034f93")
    private void setGuard(InteractionOperand objingOperand) {
        org.eclipse.uml2.uml.InteractionConstraint guard = ((org.eclipse.uml2.uml.InteractionOperand) getEcoreElement()).getGuard();
        if (guard != null) {
             org.eclipse.uml2.uml.ValueSpecification specification = guard.getSpecification();
            if (specification != null) {
                String value = specification.stringValue();
                if (value != null)
                    objingOperand.setGuard(value);
            }
        }
    }

}
