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
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("45f1dfc9-c45b-419e-808c-afbdb2671c8e")
public class ESendObjectAction extends EActivityNode implements IEElement {
    @objid ("72e8ea0f-183a-4f02-8d04-f4bb852b269a")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2SENDOBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("73ac79e2-2819-4720-948b-435d74acff0d")
    public ESendObjectAction(org.eclipse.uml2.uml.SendObjectAction element) {
        super(element);
    }

    @objid ("85dfbe5c-d35b-4e7b-9e8b-18f9fdf11dd1")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("859bb92c-0d52-4552-83a6-d4ce01eee817")
    public void attach(List<Object> objingElts) {
    }

    @objid ("202c8d54-b566-4520-91ad-8656a62d27a5")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
