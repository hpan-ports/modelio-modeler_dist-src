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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

@objid ("9ab7f3cf-8bd0-453c-97a1-8a329e6b4c79")
public class OBehavior extends OElement implements IOElement {
    @objid ("5d8e368e-a5dd-4bd5-8cfb-dcd6d5842aa7")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        // TODO
        return null;
    }

    @objid ("f095fabe-8a52-4167-a95c-4d19215adcbc")
    public OBehavior(Behavior element) {
        super(element);
    }

    @objid ("96ac339e-8a71-458d-855c-6b8064ed546a")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
    }

    @objid ("71bf4443-ee87-497b-a67e-9fdc540373b3")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
    }

}
