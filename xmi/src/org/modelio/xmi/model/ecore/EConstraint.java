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

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.EcoreModelNavigation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("9b93fb70-8e60-4274-99c6-bb78998bf7d7")
public class EConstraint extends ENamedElement implements IEElement {
    @objid ("c6a91a23-66c4-490c-9b70-17cb2fb5a93c")
    private boolean isCondition = false;

    @objid ("5060a1a4-85d0-44f8-9c04-0a67da696c4e")
    private boolean isLinked = false;

    @objid ("4dfd8361-a964-4a12-b40d-f5f9a7d7f5cb")
    private org.eclipse.uml2.uml.Constraint ecoreElement = null;

    @objid ("9db609af-4b48-4dd6-974f-af74b58a4426")
    public Element createObjingElt() {
        if (!this.isCondition && this.isLinked){
            return Modelio.getInstance().getModelingSession().getModel()
                    .createConstraint();
        }
        return null;
    }

    @objid ("8db133e8-3167-48f5-931c-63a2b67bcae3")
    public EConstraint(org.eclipse.uml2.uml.Constraint element) {
        super(element);
        this.ecoreElement = element;
        this.isCondition = EcoreModelNavigation.isCondition(element);
        this.isLinked = EcoreModelNavigation.isLinked(element);
    }

    @objid ("c9e3ba3e-c263-46e6-9cd9-7de7bde00722")
    public void attach(Element objingElt) {
        if (objingElt instanceof Constraint)
            attachConstraint((Constraint) objingElt);
    }

    @objid ("ecad2b97-95e0-41ce-8979-888025746c81")
    public void attach(List<Object> objingElts) {
    }

    @objid ("2fe3b922-1d44-4f5d-892b-22337c43d1ad")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        
        if (objingElt instanceof Constraint) {
            setBody((Constraint) objingElt);
        }
    }

    @objid ("6e173c08-8158-4e23-86e4-d99eb83ea0fb")
    private void setBody(Constraint objingElt) {
        org.eclipse.uml2.uml.ValueSpecification specification = this.ecoreElement.getSpecification();
                if (specification != null) {
           String body = specification.stringValue();
           if (body != null)
               objingElt.setBody(body);
                }
    }

    @objid ("1a8fa557-f28f-499c-a0e2-c0d87bcd6a0e")
    private void attachConstraint(Constraint constraint) {
        EList<?> ecoreConstrainedElts = this.ecoreElement.getConstrainedElements();
        boolean attached = false;
        
        if (ecoreConstrainedElts.size() > 0) {
            for (Object elt : ecoreConstrainedElts) {
                if ( (elt instanceof org.eclipse.uml2.uml.Element) && (elt != null)){
                    org.eclipse.uml2.uml.Element ecoreConstrainedElt = (org.eclipse.uml2.uml.Element) elt;
                    Object object =  ReverseProperties.getInstance().getMappedElement(ecoreConstrainedElt);
        
                    if (object instanceof ModelElement){
                        ModelElement objingConstrainedElt = (ModelElement) object;
                        constraint.getConstrainedElement().add(objingConstrainedElt);
                        attached = true;
                        
                    }else if (ecoreConstrainedElt instanceof org.eclipse.uml2.uml.Abstraction){
                        List<Abstraction> list = (ArrayList<Abstraction>) object;
                        for (Abstraction objingConstrainedElt : list){
                            constraint.getConstrainedElement().add(objingConstrainedElt);
                            attached = true;
                        }
                    }else if (ecoreConstrainedElt instanceof  org.eclipse.uml2.uml.Comment){
                        List<Note> list = (ArrayList<Note>) object;
                        for (Note objingConstrainedElt : list){
                            constraint.getConstrainedElement().add(objingConstrainedElt);
                            attached = true;
                        }
                    }else if(ecoreConstrainedElt instanceof org.eclipse.uml2.uml.Usage){
        
                        List<ModelElement> list = (ArrayList<ModelElement>) object;
                        for (ModelElement objingConstrainedElt : list){
                            constraint.getConstrainedElement().add(objingConstrainedElt);
                            attached = true;
                        }
        
                    }else if (ecoreConstrainedElt instanceof org.eclipse.uml2.uml.Dependency){
                        List<Dependency> list = (ArrayList<Dependency>) object;
                        for (Dependency objingConstrainedElt : list){
                            constraint.getConstrainedElement().add(objingConstrainedElt);
                            attached = true;
                        }
                    }
                }
            }
        
            if (!attached){
                PartialImportMap.getInstance().remove(this.ecoreElement);
                TotalImportMap.getInstance().remove(this.ecoreElement);
                constraint.delete();
            }
        } else {
            PartialImportMap.getInstance().remove(this.ecoreElement);
            TotalImportMap.getInstance().remove(this.ecoreElement);
            constraint.delete();
        }
    }

}
