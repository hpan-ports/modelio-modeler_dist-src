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

@objid ("d28ca172-410a-4e8e-bd62-85100e1fa4bb")
public class EAddStructuralFeatureValueAction extends EActivityNode implements IEElement {
    @objid ("bc5e6943-99e8-4539-b1f4-f6c7ad093289")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2ADDSTRUCTURALFEATUREVALUEACTION, element.getMClass());
        
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("5d523051-d4b5-4ec8-bba2-888cc8d68a6f")
    public EAddStructuralFeatureValueAction(org.eclipse.uml2.uml.AddStructuralFeatureValueAction element) {
        super(element);
    }

    @objid ("9656c2c9-3a6f-449d-be68-3e081eccb99e")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("d33678d4-8956-47db-80ea-dcb5d6e74543")
    public void attach(List<Object> objingElts) {
    }

    @objid ("9d309405-c765-490c-b839-ac9dc49cbace")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setFeature((OpaqueAction) objingElt);
    }

    @objid ("beeb8435-5d1a-4e6b-9016-71dfb150ae2d")
    private void setFeature(OpaqueAction objingElt) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        org.eclipse.uml2.uml.StructuralFeature feature = ((org.eclipse.uml2.uml.AddStructuralFeatureValueAction) getEcoreElement()).getStructuralFeature();
        Dependency dependency = session.getModel().createDependency();
        
        
        dependency.getExtension().add(session.getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2STRUCTURALFEATUREREFERENCE, dependency.getMClass()));
        
        
        Object behavior = ReverseProperties.getInstance().getMappedElement(feature);
        
        ModelElement obBehavior = null;
        
        if (behavior instanceof ModelElement){
            obBehavior = (ModelElement) behavior;
        }else if (behavior instanceof List<?>){
            obBehavior = ((List<ModelElement>) behavior).get(0);
        }
        
        if (obBehavior != null){
            dependency.setDependsOn(obBehavior);
            dependency.setImpacted(objingElt);
        }else{
            dependency.delete();
        }
    }

}
