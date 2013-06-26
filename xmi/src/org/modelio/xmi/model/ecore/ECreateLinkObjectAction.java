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

@objid ("6bb6f9d2-4f88-4d23-a1ef-5614949cb2e9")
public class ECreateLinkObjectAction extends EActivityNode implements IEElement {
    @objid ("a3032e39-4f40-453e-bc36-9404d62dbc15")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2CREATELINKOBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("03cccb1f-e11e-4546-b3a2-b4bf4fbf8336")
    public ECreateLinkObjectAction(org.eclipse.uml2.uml.CreateLinkObjectAction element) {
        super(element);
    }

    @objid ("3861ad4e-f656-4854-9d7e-a92da93fa827")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("5437a06b-1222-42de-b83c-2ea85cd593b8")
    public void attach(List<Object> objingElts) {
    }

    @objid ("da99ed70-069a-432d-b6e6-e79691042187")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
