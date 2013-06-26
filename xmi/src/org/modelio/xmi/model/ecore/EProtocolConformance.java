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
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("5b3b64cc-f9ad-4680-9bd2-4d4f9b234224")
public class EProtocolConformance extends EElement implements IEElement {
    @objid ("e5946d3a-8772-4e2f-b7fb-a3a2451793bc")
    public Element createObjingElt() {
        Dependency result = Modelio.getInstance().getModelingSession().getModel().createDependency();
        
        result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                IModelerModuleStereotypes.UML2PROTOCOLCONFORMANCE, result.getMClass()));
        return result;
    }

    @objid ("f4d78669-5c4c-4504-bf76-35c6b9399a3d")
    public EProtocolConformance(org.eclipse.uml2.uml.ProtocolConformance element) {
        super(element);
    }

    @objid ("0df6d940-46f9-45a4-bbf2-7df10ad56115")
    public void attach(Element objingElt) {
    }

    @objid ("52d78696-4b32-44b5-8863-5832c8fb676a")
    public void attach(List<Object> objingElts) {
    }

    @objid ("904d028a-b06f-4f74-a525-ba7e1518d52e")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
