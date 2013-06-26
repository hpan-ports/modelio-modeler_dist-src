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

@objid ("ecc9bde1-42ad-46db-8779-b65b38668b7e")
public class EReadLinkObjectEndQualifierAction extends EActivityNode implements IEElement {
    @objid ("dbf39f58-8599-4b82-ab04-8b11d4c9de6e")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2READLINKOBJECTENDQUALIFIERACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("4aa283fb-4508-4958-9da3-8063c201969c")
    public EReadLinkObjectEndQualifierAction(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction element) {
        super(element);
    }

    @objid ("0833c194-4c6c-4079-83c7-4a88f9b3cfac")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("d932343c-15d0-4760-9cf9-b79f2bf02144")
    public void attach(List<Object> objingElts) {
    }

    @objid ("d3f9ab22-e41e-4919-b23e-ec3ec83495fe")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
