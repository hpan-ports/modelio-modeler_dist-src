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

@objid ("acb1d0bc-17d7-4646-837b-5b138439be36")
public class ELiteralBoolean extends ENamedElement implements IEElement {
    @objid ("cddbb2bd-820e-4ab4-b24d-e816d59659ec")
    public Element createObjingElt() {
        return null;
    }

    @objid ("60445db8-7cb9-42ed-abcc-1126f9c72181")
    public ELiteralBoolean(org.eclipse.uml2.uml.LiteralBoolean element) {
        super(element);
    }

    @objid ("c3152c9d-555a-4dbb-b1d6-eff92b925f51")
    public void attach(Element objingElt) {
    }

    @objid ("7081890c-5489-42c8-a1d9-704cd77ad08c")
    public void attach(List<Object> objingElts) {
    }

    @objid ("2b0ba30e-9455-4c07-bd79-5874e362f0ff")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
