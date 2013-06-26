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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("8bb21eb8-33de-44d7-b7fd-77e920dfcb4a")
public class EPackage extends ENamedElement implements IEElement {
    @objid ("b19d9fd0-cf29-4fbf-84da-25155c924094")
    public Element createObjingElt() {
        for (org.eclipse.uml2.uml.Package ecoremodel : ReverseProperties.getInstance().getEcoreModel()){
            if (getEcoreElement().equals(ecoremodel)){
        //                return Modelio.getInstance().getModelingSession().getModel().getRoot();
                return Modelio.getInstance().getModelingSession().getModel().createPackage();
                }
        }
        
        if (ObjingEAnnotation.isRequirementContainer(getEcoreElement()))
            return Modelio.getInstance().getModelingSession().getRequirementModel().createRequirementContainer();
        return Modelio.getInstance().getModelingSession().getModel().createPackage();
    }

    @objid ("8645c284-2063-48a4-aa31-4715dec40995")
    public EPackage(org.eclipse.uml2.uml.Package element) {
        super(element);
    }

    @objid ("96b4bd10-f8b0-48eb-ac22-1cd6878dccbb")
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        
        Element objingOwner = (Element) revProp.getMappedElement(ecoreOwner);
        Package objingPkg = (Package) objingElt;
        if (ecoreOwner instanceof org.eclipse.uml2.uml.Profile) {
              objingPkg.setOwner(revProp.getExternalPackage());
        }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Package) {
            objingPkg.setOwner((Package) objingOwner);
        }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Component){
            objingPkg.setOwner((Component) objingOwner);
        }
    }

    @objid ("b107babd-7b7e-4cc8-b34b-366141ed1f65")
    public void attach(List<Object> objingElts) {
    }

    @objid ("bd9c4ded-1370-41f3-be6b-bc5fa047a3b3")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        //        setVisibility(objingElt);
        if (ReverseProperties.getInstance().isRoundtripEnabled()) {
            setAbstractEAnnotation((Package) objingElt);
            setInstantiableEAnnotation((Package) objingElt);
            setLeafEAnnotation((Package) objingElt);
            setRootEAnnotation((Package) objingElt);
        }
    }

    @objid ("f1c8da22-f4cc-49aa-97e2-9ef5fe2db6e6")
    private void setAbstractEAnnotation(Package objingElt) {
        objingElt.setIsAbstract(ObjingEAnnotation.isIsAbstract((((org.eclipse.uml2.uml.Package)getEcoreElement()))));
    }

    @objid ("38137bcd-1f1c-4555-a336-e8e21ffe409e")
    private void setInstantiableEAnnotation(Package objingElt) {
        objingElt.setIsInstantiable(ObjingEAnnotation.isInstantiable((((org.eclipse.uml2.uml.Package)getEcoreElement()))));
    }

    @objid ("c2c0b231-6bf9-430e-87b2-c9589bc00184")
    private void setLeafEAnnotation(Package objingElt) {
        objingElt.setIsLeaf(ObjingEAnnotation.isLeaf((((org.eclipse.uml2.uml.Package)getEcoreElement()))));
    }

    @objid ("4fc6a54c-e07d-4939-8ae5-f1cf00295563")
    private void setRootEAnnotation(Package objingElt) {
        objingElt.setIsRoot(ObjingEAnnotation.isRoot((((org.eclipse.uml2.uml.Package)getEcoreElement()))));
    }

}
