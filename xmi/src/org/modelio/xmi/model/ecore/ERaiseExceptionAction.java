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

@objid ("432b78e9-17fb-494b-9567-dbb2ebb699d7")
public class ERaiseExceptionAction extends EActivityNode implements IEElement {
    @objid ("f70c5030-25a4-4d6f-8aaa-83eb4f77b172")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2RAISEEXCEPTIONACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("544f9ef9-1853-4028-a275-af342aaa4cb7")
    public ERaiseExceptionAction(org.eclipse.uml2.uml.RaiseExceptionAction element) {
        super(element);
    }

    @objid ("7793c8fc-71a6-4635-9c56-601a6b20dfd5")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("9f2dfcf1-ad72-4179-8f16-7b4e24254ea8")
    public void attach(List<Object> objingElts) {
    }

    @objid ("ab995776-bf33-4155-b7c8-71e98816b3a4")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
