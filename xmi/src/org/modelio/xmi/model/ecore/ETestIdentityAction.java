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

@objid ("234a5866-75f0-49ca-b533-e13f15311144")
public class ETestIdentityAction extends EActivityNode implements IEElement {
    @objid ("6b38f9a0-a9ff-4fc4-8dc9-087e820adb07")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
        .createOpaqueAction();
             
            Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
            .getStereotype(IModelerModuleStereotypes.UML2TESTIDENTITYACTION, element.getMClass());
            element.getExtension().add(stereo);
        return element;
    }

    @objid ("bf242e5e-e9ec-4b15-a5f0-128398e91bd4")
    public ETestIdentityAction(org.eclipse.uml2.uml.TestIdentityAction element) {
        super(element);
    }

    @objid ("3650c069-bb0d-485b-848e-8be56dd2c5d8")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("05a904d1-1cc6-4b16-b9e7-e4a0cdcdc8f4")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e24f82f8-a739-4271-8364-777d9f051159")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
