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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("3eba5fb2-d564-46af-a85a-c30f96e330f0")
public class EConnectableElement extends EElement implements IEElement {
    @objid ("7c6a51fc-109d-46cf-b62d-11b3aed55ea4")
    public Element createObjingElt() {
        return null;
    }

    @objid ("c1a36b51-d43f-4bc5-b86f-7e1f425104aa")
    public EConnectableElement(org.eclipse.uml2.uml.ConnectableElement element) {
        super(element);
    }

    @objid ("5a87aa80-1263-4915-9941-2c26eece38bb")
    public void attach(Element objingElt) {
    }

    @objid ("051d9e4d-1188-476e-8071-9339e3130962")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

    @objid ("92324753-f5c4-447f-8016-634613eec658")
    public void setStereotypes() {
    }

}
