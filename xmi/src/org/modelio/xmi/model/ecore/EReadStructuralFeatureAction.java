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
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("c6ddac9b-4a0c-464e-ba53-867bbdc45656")
public class EReadStructuralFeatureAction extends EActivityNode implements IEElement {
    @objid ("e7b4f4aa-7df1-4a1a-9818-b6509fdec0c1")
    private org.eclipse.uml2.uml.ReadStructuralFeatureAction ecoreElement;

    @objid ("bdd08c53-b632-4a94-a168-7d8a62f2e05b")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2READSTRUCTURALFEATUREACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("314e3281-a7b8-452e-bbf5-15ae30e79642")
    public EReadStructuralFeatureAction(org.eclipse.uml2.uml.ReadStructuralFeatureAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("e018dc7a-910c-45d0-acb0-62d271629970")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("9a5e29b3-857c-41b4-980e-ba61cbe0b338")
    public void attach(List<Object> objingElts) {
    }

    @objid ("b70ee92c-57e6-4212-8b14-bed7ab23af16")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setFeature((OpaqueAction) objingElt);
    }

    @objid ("0b878b15-814e-4ff5-8bfb-f2efc67c87aa")
    private void setFeature(OpaqueAction objingElt) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        org.eclipse.uml2.uml.StructuralFeature feature = ecoreElement.getStructuralFeature();
        if (feature != null) {
            Object behavior = ReverseProperties.getInstance().getMappedElement(feature);
        
            ModelElement obBehavior = null;
        
            if (behavior instanceof ModelElement){
                obBehavior = (ModelElement) behavior;
            }else if (behavior instanceof List){
                obBehavior = ((List<ModelElement>) behavior).get(0);
            }
        
            Dependency dependency = session.getModel().createDependency();
            
                dependency.getExtension().add(session.getMetamodelExtensions()
                        .getStereotype(IModelerModuleStereotypes.UML2STRUCTURALFEATUREREFERENCE, dependency.getMClass()));
            dependency.setDependsOn(obBehavior);
            dependency.setImpacted(objingElt);
        }
    }

}
