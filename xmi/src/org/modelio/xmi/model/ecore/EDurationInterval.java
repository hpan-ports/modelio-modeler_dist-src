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

@objid ("b63d855d-5bab-494c-9931-01b1a032b48a")
public class EDurationInterval extends ENamedElement implements IEElement {
    @objid ("6a4e376f-f8c5-4598-b8fb-6b185c6d30e4")
    public Element createObjingElt() {
        return null;
    }

    @objid ("17578664-2294-4186-8d64-d24abfb8e759")
    public EDurationInterval(org.eclipse.uml2.uml.DurationInterval element) {
        super(element);
    }

    @objid ("442f999c-fcb8-47dd-a4dd-31ab30c41448")
    public void attach(Element objingElt) {
    }

    @objid ("79c4c9c2-4125-4f1a-98bf-6835031a4ccc")
    public void attach(List<Object> objingElts) {
    }

    @objid ("6d823920-86a1-4aa0-babd-afd8799cb53a")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
