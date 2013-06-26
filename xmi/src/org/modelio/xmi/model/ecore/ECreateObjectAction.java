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

@objid ("1a63e4cb-d235-4b97-8310-e3593e234059")
public class ECreateObjectAction extends EActivityNode implements IEElement {
    @objid ("85b973bc-9297-48f1-ba60-29d0c7bc9b91")
    private org.eclipse.uml2.uml.CreateObjectAction ecoreElement;

    @objid ("955a999d-9636-4de9-b9a7-ef49a161fac0")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2CREATEOBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("0ddd53e4-d5a3-470a-a41c-f96bfcc4b10f")
    public ECreateObjectAction(org.eclipse.uml2.uml.CreateObjectAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("d3aac1e2-6f34-4a7a-9b01-98670521b480")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("b5e65457-b102-41c3-ad95-859090f675b6")
    public void attach(List<Object> objingElts) {
    }

    @objid ("322cfcf7-5cbc-4939-bcc8-1706631130de")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setClassifier((OpaqueAction) objingElt);
    }

    @objid ("de6d4e67-f627-408a-acf5-e1b0f8f2879e")
    private void setClassifier(OpaqueAction objingElt) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        org.eclipse.uml2.uml.Classifier classifier = ecoreElement.getClassifier();
        if (classifier != null){
            ModelElement obBehavior = (ModelElement)ReverseProperties.getInstance().getMappedElement(classifier);
        
            Dependency dependency = session.getModel().createDependency();
        
            dependency.getExtension().add(session.getMetamodelExtensions()
                    .getStereotype( IModelerModuleStereotypes.UML2CLASSIFIERREFERENCE, dependency.getMClass()));
        
        
            dependency.setDependsOn(obBehavior);
            dependency.setImpacted(objingElt);
        }
    }

}
