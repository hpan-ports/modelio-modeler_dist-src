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

@objid ("9cba02d9-9650-4947-b0b6-a81f3d8ce77a")
public class EClearStructuralFeatureAction extends EActivityNode implements IEElement {
    @objid ("a52bf8d8-bae6-428f-a548-ad17881a1cf3")
    private org.eclipse.uml2.uml.ClearStructuralFeatureAction ecoreElement;

    @objid ("9ba410fa-10d5-4415-ad63-5a8f0516fbea")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2CLEARSTRUCTURALFEATUREACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("db7ce6cc-7550-458f-9241-7d27c8acb875")
    public EClearStructuralFeatureAction(org.eclipse.uml2.uml.ClearStructuralFeatureAction element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("e713b54f-1dd4-4d47-9864-63c00be69ccf")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("b0094751-0b53-4d86-b585-f546b623897e")
    public void attach(List<Object> objingElts) {
    }

    @objid ("b4a16c13-4014-4360-b3a2-a57de2da1246")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setFeature((OpaqueAction) objingElt);
    }

    @objid ("c3d18153-4016-4f8e-b618-b49e41c4d201")
    private void setFeature(OpaqueAction objingElt) {
        IModelingSession session = Modelio.getInstance().getModelingSession();
        org.eclipse.uml2.uml.StructuralFeature feature = ecoreElement.getStructuralFeature();
        Dependency dependency = session.getModel().createDependency();
        
        dependency.getExtension().add(session.getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2STRUCTURALFEATUREREFERENCE, dependency.getMClass()));
        
        ModelElement obBehavior = (ModelElement)ReverseProperties.getInstance().getMappedElement(feature);
        dependency.setDependsOn(obBehavior);
        dependency.setImpacted(objingElt);
    }

}
