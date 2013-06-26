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

@objid ("afb8af0e-04f9-420c-82c1-790eb185e9e0")
public class EUnmarshallAction extends EActivityNode implements IEElement {
    @objid ("f8566e9f-32b4-4d3b-98fb-b7fbdd460d34")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2UNMARSHALLACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("58e6860d-e096-4e14-84d1-4886578048bd")
    public EUnmarshallAction(org.eclipse.uml2.uml.UnmarshallAction element) {
        super(element);
    }

    @objid ("1dbbd8b9-5bf7-4e6b-b106-b883ed0eedb0")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("9b16fbf4-6d08-4489-8851-e5af3aee5cf6")
    public void attach(List<Object> objingElts) {
    }

    @objid ("27c89e16-6e18-4f53-8123-bcf25b1a89c7")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
