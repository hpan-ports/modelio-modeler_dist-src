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
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("9784d40a-7f93-4a22-ba54-dbb768e77dbc")
public class EInteractionUse extends EInteractionFragment implements IEElement {
    @objid ("488c9792-7eb0-49e2-bb7e-d11e25b50b99")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                 .createInteractionUse();
    }

    @objid ("f2b2af4b-e8a4-4823-ab98-45b013b2a55a")
    public EInteractionUse(org.eclipse.uml2.uml.InteractionUse element) {
        super(element);
    }

    @objid ("74dbd25c-aef4-492c-8715-22ec725c05de")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("56e1bf20-f531-4134-a5c7-ade19dc72688")
    public void attach(List<Object> objingElts) {
    }

    @objid ("9a8ad111-3896-4938-9699-81eb2a69bdee")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
