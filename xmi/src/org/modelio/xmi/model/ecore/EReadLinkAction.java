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

@objid ("0d527267-c2af-44cc-a842-3c87374a7b66")
public class EReadLinkAction extends EActivityNode implements IEElement {
    @objid ("b00be9c9-8d3b-4ef4-b0af-952bd8277468")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2READLINKACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("3e35910f-11cd-487c-a881-a1d4105136b2")
    public EReadLinkAction(org.eclipse.uml2.uml.ReadLinkAction element) {
        super(element);
    }

    @objid ("b93f3be1-af68-43ba-9cbd-97345225c050")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("ff1bb76b-0423-4469-8960-c748825f53ef")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4854761d-9402-496a-901f-7d154ba7b28e")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
