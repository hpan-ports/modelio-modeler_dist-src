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

@objid ("d471ac82-b1fd-4f60-af1e-435eeba21abd")
public class EClearVariableAction extends EActivityNode implements IEElement {
    @objid ("dbe25f1e-857c-42b1-8625-924928b23558")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2CLEARVARIABLEACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("7fb45c6a-f017-4be6-8e9a-13c6ff0a67d5")
    public EClearVariableAction(org.eclipse.uml2.uml.ClearVariableAction element) {
        super(element);
    }

    @objid ("34f7d36b-f35c-488c-953e-2ed6ec436f16")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("753417ef-c072-410f-a064-85cd70e2f8a2")
    public void attach(List<Object> objingElts) {
    }

    @objid ("52022560-9262-4686-9ad5-45b12387241b")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
