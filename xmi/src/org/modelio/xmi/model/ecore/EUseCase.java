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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.xmi.util.ReverseProperties;

@objid ("14e37e62-cc25-4b1d-a45b-6ab4b617a013")
public class EUseCase extends ENamedElement implements IEElement {
    @objid ("96ef088c-f885-48b0-9971-7d4aed597827")
    private org.eclipse.uml2.uml.UseCase ecoreElement;

    @objid ("81fd61bd-03a3-4d57-bf84-b54e880eec17")
    public Element createObjingElt() {
        return Modelio.getInstance()
        .getModelingSession().getModel().createUseCase();
    }

    @objid ("bc7d746d-be3f-4357-ac96-e231ca3fd29e")
    public EUseCase(org.eclipse.uml2.uml.UseCase element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("2c484edf-f20c-4323-9cdb-533f9b34cf2d")
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
        
        Object objingOwner = revProp.getMappedElement(ecoreOwner);
        
        if ( (objingOwner != null) 
                && (objingOwner instanceof ModelTree) 
                && !(objingOwner instanceof Profile)) {
            ((UseCase) objingElt).setOwner((ModelTree)objingOwner);
        }else{
            ((UseCase) objingElt).setOwner(revProp.getExternalPackage());
        }
    }

    @objid ("5ecfa24a-e25e-435e-8b3a-08b618e91c04")
    public void attach(List<Object> objingElts) {
    }

    @objid ("171d1f57-744a-432e-ab91-947b6d85c345")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
