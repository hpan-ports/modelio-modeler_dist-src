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

@objid ("300c5d5b-6730-4df4-9fa2-84a42b112abd")
public class EOpaqueExpression extends ENamedElement implements IEElement {
    @objid ("a819ebd1-d1a2-4ce6-80c5-46af71b3ac0d")
    public Element createObjingElt() {
        return null;
    }

    @objid ("60410ae3-db89-46f2-8de7-63a810a5826e")
    public EOpaqueExpression(org.eclipse.uml2.uml.OpaqueExpression element) {
        super(element);
    }

    @objid ("cc0a8449-8354-4775-b95f-e5abc55a5bb4")
    public void attach(Element objingElt) {
    }

    @objid ("fd1d0d6e-169d-42d0-83b5-6f43e1eea014")
    public void attach(List<Object> objingElts) {
    }

    @objid ("b25a90e1-da62-4e4a-af4b-0dca433679e6")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
