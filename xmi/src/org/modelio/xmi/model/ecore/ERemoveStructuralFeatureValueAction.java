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
import org.modelio.api.model.IModelingSession;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("51bd1ce9-b631-4fa1-b692-72b52341b0c5")
public class ERemoveStructuralFeatureValueAction extends EActivityNode implements IEElement {
    @objid ("e8b318d6-236a-449e-b144-d9a09150afc2")
    private org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction ecoreElement;

    @objid ("3058ed6d-325a-4116-9b8c-ba07d6c36abc")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
        .createOpaqueAction();
             
            Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
            .getStereotype( IModelerModuleStereotypes.UML2REMOVESTRUCTURALFEATUREACTION, element.getMClass());
            element.getExtension().add(stereo);
        return element;
    }

    @objid ("5800b9d0-70ee-403e-bf06-4384972c8b0b")
    public ERemoveStructuralFeatureValueAction(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("d3ed1be5-4f20-4e9f-8dfe-65566382a562")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("dd2462c0-de6f-4878-abb1-e4caa59e7707")
    public void attach(List<Object> objingElts) {
    }

    @objid ("55d23198-1b78-4959-a863-b612ff3c0099")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setFeature((OpaqueAction) objingElt);
    }

    @objid ("5a6428e6-073a-4ce2-a255-a165bc303339")
    private void setFeature(OpaqueAction objingElt) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        org.eclipse.uml2.uml.StructuralFeature feature = ecoreElement.getStructuralFeature();
        Dependency dependency = session.getModel().createDependency();
               
            dependency.getExtension().add(session.getMetamodelExtensions()
                    .getStereotype(IModelerModuleStereotypes.UML2STRUCTURALFEATUREREFERENCE, dependency.getMClass()));
            
                
        ModelElement obBehavior = (ModelElement)ReverseProperties.getInstance().getMappedElement(feature);
        dependency.setDependsOn(obBehavior);
        dependency.setImpacted(objingElt);
    }

}
