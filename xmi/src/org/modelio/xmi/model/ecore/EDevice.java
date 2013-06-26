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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("03366215-ea9b-462c-a7ec-a89046809bef")
public class EDevice extends ENode implements IEElement {
    @objid ("eb9f06d9-12b3-485e-919a-0ca9164ef114")
    public Element createObjingElt() {
        ModelElement objElt = Modelio.getInstance().getModelingSession()
                .getModel().createNode();
        
        objElt.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
               IModelerModuleStereotypes.UML2DEVICE,  objElt.getMClass()));
        return objElt;
    }

    @objid ("224f9f85-0e96-4871-9f98-b38a9034ee90")
    public EDevice(org.eclipse.uml2.uml.Device element) {
        super(element);
    }

    @objid ("47817325-3f63-4ec5-82fc-884e728ba70f")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("a1aefd3c-ae8e-4986-8d92-631e26a3e28a")
    public void attach(List<Object> objingElts) {
    }

    @objid ("10c720be-2d63-42d9-9f72-abd261e4512f")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
