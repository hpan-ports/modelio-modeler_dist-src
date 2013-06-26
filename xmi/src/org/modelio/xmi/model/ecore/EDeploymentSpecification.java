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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("4fd7b757-d1c3-493d-98ff-6e3b8ff54e07")
public class EDeploymentSpecification extends EArtifact implements IEElement {
    @objid ("a5c6095e-2aa1-415e-9ef0-3b46b9e84050")
    public Element createObjingElt() {
        Artifact result = Modelio.getInstance().getModelingSession().getModel().createArtifact();
        
        result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                IModelerModuleStereotypes.UML2DEPLOYMENTSPECIFICATION, result.getMClass()));
        return result;
    }

    @objid ("217c6da0-1819-40cf-98b1-ba75c1d0df92")
    public EDeploymentSpecification(org.eclipse.uml2.uml.DeploymentSpecification element) {
        super(element);
    }

    @objid ("a717a14e-4726-460e-83b8-5bfd1c034379")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("dd6d4bca-216c-4272-bc5e-5dc04d4a5f17")
    public void attach(List<Object> objingElts) {
    }

    @objid ("fd431a18-7c10-483c-b08e-86d52ddb05f2")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
