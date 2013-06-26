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
import org.modelio.xmi.util.ProfileUtils;

@objid ("d85d800e-aa2f-4393-858d-303165d6b6a0")
public class EStereotype extends EElement implements IEElement {
    @objid ("2c9807a5-08df-44db-b1a2-c92e98b519be")
    public Element createObjingElt() {
        return  null;
    }

    @objid ("0fff9e13-ee5b-4079-9315-3a6279ce3cb2")
    public EStereotype(org.eclipse.uml2.uml.Stereotype element) {
        super(element);
        ProfileUtils.visitStereotype((org.eclipse.uml2.uml.Stereotype)getEcoreElement());
    }

    @objid ("3c943910-b736-4a42-81c1-e7be41b23442")
    public void attach(Element objingElt) {
    }

    @objid ("76ec5971-3d0e-45f7-be35-ca96974e2137")
    public void attach(List<Object> objingElts) {
    }

    @objid ("ae2242f1-4295-4e6f-bbfb-f09e7f043e1f")
    public void setProperties(Element objingElt) {
    }

}
