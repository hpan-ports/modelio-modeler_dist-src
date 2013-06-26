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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("dab4929e-436e-4325-aa65-5066ee60e1c0")
public class ERedefinableTemplateSignature extends ENamedElement implements IEElement {
    @objid ("c731b691-2862-4047-a1f6-d136d13dfee1")
    private org.eclipse.uml2.uml.RedefinableTemplateSignature ecoreElement = null;

    @objid ("b616ce28-1afe-49f4-ab44-0ddbd5944465")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Element ecoreOwner = this.ecoreElement.getOwner();
        Object objingOwner =  ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        if ((objingOwner instanceof Classifier)
                && !(objingOwner instanceof Enumeration)){
            Operation result = Modelio.getInstance().getModelingSession().getModel().createOperation();
        
            result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                    IModelerModuleStereotypes.UML2REDEFINABLETEMPLATESIGNATURE, result.getMClass()));
        
            return result;
        }else 
            return null;
    }

    @objid ("db7b17f4-809d-4f4d-a8b1-2fbd629ba607")
    public ERedefinableTemplateSignature(org.eclipse.uml2.uml.RedefinableTemplateSignature element) {
        super(element);
        this.ecoreElement = element;
    }

    @objid ("f95841d6-98e0-429f-a7ac-4971fec114aa")
    public void attach(Element objingElt) {
        if (objingElt != null) {
            ReverseProperties revProp = ReverseProperties.getInstance();
        
            org.eclipse.uml2.uml.Element ecoreOwner = this.ecoreElement.getOwner();
            Element objingOwner = (Element) revProp
                    .getMappedElement(ecoreOwner);
        
            if (objingOwner instanceof Classifier)
                ((Operation) objingElt).setOwner((Classifier) objingOwner);
            else {
                PartialImportMap.getInstance().remove(this.ecoreElement);
                TotalImportMap.getInstance().remove(this.ecoreElement);
                objingElt.delete();
            }
        }
    }

    @objid ("127819a2-8d22-4478-bd48-4b26bd980045")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f6a53ce4-04ed-490c-8209-bc7a14ca2533")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
