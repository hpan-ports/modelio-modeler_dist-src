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
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("0c992afd-ef44-499f-8198-9b919aa48bcb")
public class EReplyAction extends ENamedElement implements IEElement {
    @objid ("5b7a10ce-be9c-4840-bb57-a7f3ebd0a0bd")
    public Element createObjingElt() {
        OpaqueAction result = Modelio.getInstance().getModelingSession().getModel().createOpaqueAction();
        
            result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                 IModelerModuleStereotypes.UML2REPLYACTION, result.getMClass()));
        return result;
    }

    @objid ("e333994d-379f-4145-ad9f-859533806f19")
    public EReplyAction(org.eclipse.uml2.uml.ReplyAction element) {
        super(element);
    }

    @objid ("5eabb9b7-5c7b-4a36-9a7c-f73d9a15d600")
    public void attach(Element objingElt) {
    }

    @objid ("fa9e39b5-591f-4bda-9315-afb07039ace9")
    public void attach(List<Object> objingElts) {
    }

    @objid ("0507a92b-1852-40fa-853f-d5b614bdc9bc")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
