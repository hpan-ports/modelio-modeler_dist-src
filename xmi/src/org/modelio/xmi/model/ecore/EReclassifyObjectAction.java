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

@objid ("3eca7888-1683-4688-ae50-52dd89eb440f")
public class EReclassifyObjectAction extends EActivityNode implements IEElement {
    @objid ("86a176c3-989f-48dd-8493-610a0fed701c")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2RECLASSIFYOBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("5c29f2bd-54d7-4496-805f-a02fd461abd1")
    public EReclassifyObjectAction(org.eclipse.uml2.uml.ReclassifyObjectAction element) {
        super(element);
    }

    @objid ("0282934b-5550-40a0-898d-942f437028db")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("a4d629f7-03c4-4a2f-a831-290a6206eafd")
    public void attach(List<Object> objingElts) {
    }

    @objid ("93ddb983-ccb4-4ffb-8e45-d22cfaef6daf")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
