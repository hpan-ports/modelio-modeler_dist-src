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

@objid ("21c137cc-3eda-4255-8637-3227e9524b74")
public class ECreateLinkAction extends EActivityNode implements IEElement {
    @objid ("50d8f1fa-b7b3-43e2-ae22-784176be84a8")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2CREATELINKACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("b795bd28-dd1c-489a-aaf8-77f989f63624")
    public ECreateLinkAction(org.eclipse.uml2.uml.CreateLinkAction element) {
        super(element);
    }

    @objid ("430fcfcf-4c08-46ac-a387-3cd25bb65187")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("35fc25ae-200b-4726-8319-78f63a3440af")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f69bc752-1575-4922-b81e-828e11099e6d")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
