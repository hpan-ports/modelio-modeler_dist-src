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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.xmi.util.ReverseProperties;

@objid ("fcb608db-e565-4458-bb26-b0a8cf4807a3")
public class EEnumerationLiteral extends ENamedElement implements IEElement {
    @objid ("894ab0e6-53ca-41c7-90c0-e86d83781f13")
    private org.eclipse.uml2.uml.EnumerationLiteral ecoreElement;

    @objid ("66cf2cad-faa9-42a1-817a-184d8355b60f")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel().createEnumerationLiteral();
    }

    @objid ("487f30c5-c136-4252-94d8-ca33c791f200")
    public EEnumerationLiteral(org.eclipse.uml2.uml.EnumerationLiteral element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("95e787d7-5de5-4290-bfff-d6df5e0cf417")
    public void attach(Element objingElt) {
        Object objingEnumeration = ReverseProperties.getInstance()
                .getMappedElement(ecoreElement.getEnumeration());
                
        if ((objingEnumeration != null) && (objingEnumeration instanceof Enumeration)) {
            EnumerationLiteral objingLiteral = (EnumerationLiteral) objingElt;
            objingLiteral.setValuated((Enumeration)objingEnumeration);
        }
    }

    @objid ("77bc13c5-8184-4edf-9e21-ba741faa65e2")
    public void attach(List<Object> objingElts) {
    }

    @objid ("29c31cd0-c619-4422-bf2e-e8f5d57934b8")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
