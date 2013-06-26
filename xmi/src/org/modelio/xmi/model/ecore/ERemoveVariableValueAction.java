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

@objid ("1e9b0044-1ffa-4ae6-8ad5-f353e0380458")
public class ERemoveVariableValueAction extends EActivityNode implements IEElement {
    @objid ("297fc270-7052-4d1b-bc66-6bdfbdeb89da")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2REMOVEVARIABLEVALUEACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("bd4146b6-3877-4ae0-b866-bd6c0029c05e")
    public ERemoveVariableValueAction(org.eclipse.uml2.uml.RemoveVariableValueAction element) {
        super(element);
    }

    @objid ("a8591fcc-2af1-4c82-9480-0213161da4e2")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("6f7e586e-b822-4034-98f1-b390f75ac84f")
    public void attach(List<Object> objingElts) {
    }

    @objid ("01e13e4b-0daa-493f-9564-fe8240f93b26")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
