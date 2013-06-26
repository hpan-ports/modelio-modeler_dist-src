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

@objid ("7e132d0d-d743-4e58-8378-f5a4440fd8c9")
public class EDestroyObjectAction extends EActivityNode implements IEElement {
    @objid ("95df2be3-3082-423f-a98c-58783c7ac756")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2DESTROYOBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("6c19c220-92ff-4a7f-976c-ab8c8cdb3e80")
    public EDestroyObjectAction(org.eclipse.uml2.uml.DestroyObjectAction element) {
        super(element);
    }

    @objid ("5110f8ba-b17f-4348-be39-e62e289cd6ad")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("fbde2660-c6e8-4475-84ba-8362379473dc")
    public void attach(List<Object> objingElts) {
    }

    @objid ("44f587b7-d589-4f17-b4dc-5125d7b1ec48")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
