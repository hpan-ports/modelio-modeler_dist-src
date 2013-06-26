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

@objid ("43bed88f-0e61-4806-a0ad-84a829f57572")
public class EConsiderIgnoreFragment extends ENamedElement implements IEElement {
    @objid ("a4d8f9bc-3c83-4494-9f9c-cf44b01c502a")
    public Element createObjingElt() {
        return null;
    }

    @objid ("918e23bf-e96e-45e8-bd1d-2ddbd2c976d0")
    public EConsiderIgnoreFragment(org.eclipse.uml2.uml.ConsiderIgnoreFragment element) {
        super(element);
    }

    @objid ("2b80b564-65ce-479c-a3ce-59883c14ac74")
    public void attach(Element objingElt) {
    }

    @objid ("cc8aecf5-26c7-4601-ad1a-67583b90005c")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e913b1c3-f9f2-40f4-abdb-90c26a654b1d")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
