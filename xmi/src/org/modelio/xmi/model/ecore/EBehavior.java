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

@objid ("641ba143-736c-49f3-82aa-d209649ebdbf")
public class EBehavior extends EElement implements IEElement {
    @objid ("c44057be-2f3e-4804-b875-465ba8387627")
    public Element createObjingElt() {
        return null;
    }

    @objid ("9e4fdf4a-be6c-44ef-a534-1842da33e0e1")
    public EBehavior(org.eclipse.uml2.uml.Behavior element) {
        super(element);
    }

    @objid ("f9a389ea-6fe2-4033-ad6b-d1880838c08d")
    public void attach(Element objingElt) {
    }

    @objid ("345a5f99-c32f-4d2e-a04a-93ca94518cbe")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
