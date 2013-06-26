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

@objid ("86a2f2c0-c91b-4f42-931f-80fe85f9e3d8")
public class EDurationConstraint extends ENamedElement implements IEElement {
    @objid ("a31b145d-ccdf-49b9-a319-42e65a6f1ebc")
    public Element createObjingElt() {
        return null;
    }

    @objid ("d6234acd-521a-447d-aa2d-e382219e1560")
    public EDurationConstraint(org.eclipse.uml2.uml.DurationConstraint element) {
        super(element);
    }

    @objid ("82c960d6-683b-4ee2-b751-081c7e4980b8")
    public void attach(Element objingElt) {
    }

    @objid ("0092b059-6c74-430f-9a9e-015057289e74")
    public void attach(List<Object> objingElts) {
    }

    @objid ("8ca93589-321b-490d-97ce-12333027ad8d")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
