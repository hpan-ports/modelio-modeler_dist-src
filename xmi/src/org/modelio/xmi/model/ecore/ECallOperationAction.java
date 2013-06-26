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
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("f7746a29-e4da-4bd7-b945-627b4319ea8e")
public class ECallOperationAction extends EActivityNode implements IEElement {
    @objid ("13d40c1f-f3ef-47a8-b581-1242bc8fa574")
    private org.eclipse.uml2.uml.CallOperationAction ecoreElement;

    @objid ("1be32f04-bee3-4831-ba6d-66026dbec744")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createCallOperationAction();
    }

    @objid ("78fa823f-9eca-4e62-9d4c-f9f62661cefc")
    public ECallOperationAction(org.eclipse.uml2.uml.CallOperationAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("fe0a0837-f4fc-444d-bb22-7246b05c761d")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("181835fe-b5a0-4b57-900d-58fd6b2883ab")
    public void attach(List<Object> objingElts) {
    }

    @objid ("0021d5a7-f916-44fb-ac27-89a88df3ce02")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setSynchronous((CallOperationAction) objingElt);
        setOperation((CallOperationAction) objingElt);
    }

    @objid ("52f7c0b7-83ab-4c6f-b029-9dd4c65c665f")
    private void setSynchronous(CallOperationAction action) {
        action.setIsSynchronous(ecoreElement.isSynchronous());
    }

    @objid ("8d3abbf6-2f87-412f-ab04-04157089b272")
    private void setOperation(CallOperationAction action) {
        org.eclipse.uml2.uml.Operation ecoreOperation = ecoreElement.getOperation();
               
                if (ecoreOperation != null) {
           Object objingOperation =  ReverseProperties.getInstance().getMappedElement(ecoreOperation);
           if (objingOperation instanceof Operation)
               action.setCalled((Operation) objingOperation);
                }
    }

}
