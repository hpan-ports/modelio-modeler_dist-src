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

@objid ("765a5953-0e9a-4b47-b317-c01b51f25f96")
public class ELiteralUnlimitedNatural extends ENamedElement implements IEElement {
    @objid ("ea6052a4-f8a1-451e-a607-18344eb4c8c5")
    public Element createObjingElt() {
        return null;
    }

    @objid ("b8fec22c-1624-4a3c-8b7c-20af5baf5b5f")
    public ELiteralUnlimitedNatural(org.eclipse.uml2.uml.LiteralUnlimitedNatural element) {
        super(element);
    }

    @objid ("59b2189c-703a-4a62-8079-5efb0d552696")
    public void attach(Element objingElt) {
    }

    @objid ("1243524c-4791-40f7-9d7f-d8c03fbd0579")
    public void attach(List<Object> objingElts) {
    }

    @objid ("602f2f76-b23d-49a3-b3c6-86c09654c98e")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
