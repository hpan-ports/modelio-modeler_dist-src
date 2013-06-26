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

@objid ("4ac53743-54a5-4e02-aa48-1c3c4865f4bd")
public class EEvent extends ENamedElement implements IEElement {
    @objid ("708f6f85-b56a-4ec8-a88e-b7222e98cf7d")
    public Element createObjingElt() {
        return null;
    }

    @objid ("4e31c944-97e5-4795-9c6d-f5f48a7a70ed")
    public EEvent(org.eclipse.uml2.uml.Event element) {
        super(element);
    }

    @objid ("8d014598-3408-4155-af0c-4285fa9dfae5")
    public void attach(Element objingElt) {
    }

    @objid ("c8f9d124-7e59-4d8c-b74d-fc2be6411969")
    public void attach(List<Object> objingElts) {
    }

    @objid ("eabe26b7-d075-4b96-8a49-72ce191aff01")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
