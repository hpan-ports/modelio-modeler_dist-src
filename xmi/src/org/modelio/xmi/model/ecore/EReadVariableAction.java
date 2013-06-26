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

@objid ("bb4cb6e4-e42a-4b67-9e30-c0135632856d")
public class EReadVariableAction extends EActivityNode implements IEElement {
    @objid ("21437213-1d5f-4938-979f-0ed7409643d5")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2READVARIABLEACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("a206df6e-7969-426c-8146-18663508b993")
    public EReadVariableAction(org.eclipse.uml2.uml.ReadVariableAction element) {
        super(element);
    }

    @objid ("73ea741f-ef15-4833-9132-f9a868a6f61c")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("2522798d-f716-4c80-91e9-57f4ecf64e02")
    public void attach(List<Object> objingElts) {
    }

    @objid ("964f200b-d50c-4ee0-a954-ced172038464")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
