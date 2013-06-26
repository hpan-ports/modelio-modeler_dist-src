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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("1af368db-230a-4aa4-9366-022c76eec9db")
public class ECommunicationPath extends ENamedElement implements IEElement {
    @objid ("dce6c23e-e9d5-4c88-8a56-91a5d28db052")
    public Element createObjingElt() {
        Association objingAssoc = null;
        
        if (EcoreModelNavigation.hasTwoValidEnds((org.eclipse.uml2.uml.Association)getEcoreElement())){
            objingAssoc = Modelio.getInstance().getModelingSession().getModel().createAssociation();
        
            objingAssoc.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                    .getStereotype( IModelerModuleStereotypes.UML2COMMUNICATIONPATH, objingAssoc.getMClass()));
        
        }
        return objingAssoc;
    }

    @objid ("2fa5c192-a78c-4cad-8262-125b1f8036f8")
    public ECommunicationPath(org.eclipse.uml2.uml.CommunicationPath element) {
        super(element);
    }

    @objid ("fbcf4305-f046-4e17-ac1a-aca1fee70a46")
    public void attach(Element objingElt) {
    }

    @objid ("14b3c41a-670c-4b60-93ab-cacaffe6ebd5")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f4f027b7-b73e-4487-b145-797b02da8f52")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
