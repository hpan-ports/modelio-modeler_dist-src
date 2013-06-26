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

@objid ("d4f0f57e-df8c-454c-b7d4-152b39364410")
public class ELiteralInteger extends ENamedElement implements IEElement {
    @objid ("114a688b-6eac-4f6b-847e-2b4da3c022d6")
    public Element createObjingElt() {
        return null;
    }

    @objid ("a867e190-9d5f-427c-bfa4-e7596e39c7bf")
    public ELiteralInteger(org.eclipse.uml2.uml.LiteralInteger element) {
        super(element);
    }

    @objid ("368a7984-e480-433f-aa83-bff2ea0337d8")
    public void attach(Element objingElt) {
    }

    @objid ("43703da4-6903-4e2e-bb1f-2ab001a54285")
    public void attach(List<Object> objingElts) {
    }

    @objid ("d22db202-5da3-4e35-95ff-95aa8a5e685e")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
