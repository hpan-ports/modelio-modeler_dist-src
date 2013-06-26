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
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("002f8b83-e7c8-444a-962d-f313a1b9ebe1")
public class EInteractionConstraint extends ENamedElement implements IEElement {
    @objid ("9e706169-18e9-4ea4-8af1-a57df1001478")
    public Element createObjingElt() {
        return null;
    }

    @objid ("58028c98-f69c-47d7-a987-1d32273549b1")
    public EInteractionConstraint(org.eclipse.uml2.uml.InteractionConstraint element) {
        super(element);
    }

    @objid ("49c85cd2-33b4-4d0b-8a8e-e519f3fdcf5b")
    public void attach(Element objingElt) {
    }

    @objid ("2a0702d9-385a-46c8-b7b0-a54d513cfb79")
    public void attach(List<Object> objingElts) {
    }

    @objid ("3a677ce9-b946-4b0b-9aa1-cf7c49a44ac1")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
