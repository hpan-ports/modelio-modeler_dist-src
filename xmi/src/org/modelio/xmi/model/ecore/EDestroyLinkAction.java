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
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("f14bde51-d130-425c-a04f-6c3489b249d3")
public class EDestroyLinkAction extends EActivityNode implements IEElement {
    @objid ("c464ccbf-3601-4d74-9119-e1b8ab7a0143")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2DESTROYLINKACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("ce646271-847e-4326-acd9-60540199f4af")
    public EDestroyLinkAction(org.eclipse.uml2.uml.DestroyLinkAction element) {
        super(element);
    }

    @objid ("e96068dc-1888-4c34-9c0f-4c54920dd169")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("b3292d3e-f96e-4ec3-99d2-7b2627589c14")
    public void attach(List<Object> objingElts) {
    }

    @objid ("63a33f3b-3d31-434a-ae22-11fe45e596c6")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
