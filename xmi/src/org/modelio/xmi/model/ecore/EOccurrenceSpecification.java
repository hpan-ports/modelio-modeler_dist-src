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
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("e20240a2-6268-49f3-8825-e0df39791ae2")
public class EOccurrenceSpecification extends EInteractionFragment {
    @objid ("ac19aec5-29b1-42a1-b0de-1464c94e0f18")
    @Override
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createExecutionOccurenceSpecification();
    }

    @objid ("cabad11c-e96e-4cb6-8e9e-d2316b294ab5")
    public EOccurrenceSpecification(org.eclipse.uml2.uml.OccurrenceSpecification element) {
        super(element);
    }

    @objid ("ed74cfab-76d0-424e-ba06-feaf8f8b4304")
    @Override
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("1a8b7b10-5a93-4380-afa8-22881bbefbe8")
    @Override
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
