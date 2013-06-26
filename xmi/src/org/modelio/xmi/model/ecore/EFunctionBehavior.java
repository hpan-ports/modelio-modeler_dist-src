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

@objid ("735a9ae1-c2ef-475e-a288-47426280d4b6")
public class EFunctionBehavior extends ENamedElement implements IEElement {
    @objid ("18f448ea-4773-4e04-8a6b-57b69365d6d2")
    public Element createObjingElt() {
        return null;
    }

    @objid ("8dc0943a-df9b-4c1c-a6ef-66c7a873614c")
    public EFunctionBehavior(org.eclipse.uml2.uml.FunctionBehavior element) {
        super(element);
    }

    @objid ("847302d2-dcbc-452b-9ac0-9792793cc66f")
    public void attach(Element objingElt) {
    }

    @objid ("7e131ec5-2349-4fa1-ac00-0e67529ec9bc")
    public void attach(List<Object> objingElts) {
    }

    @objid ("b1f0e90c-7403-4c21-ab15-f3cb2be3b376")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
