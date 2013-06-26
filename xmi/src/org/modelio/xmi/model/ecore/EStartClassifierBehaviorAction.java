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
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("cfa90e3f-ff0c-4645-bc0f-4259b450d910")
public class EStartClassifierBehaviorAction extends EActivityNode implements IEElement {
    @objid ("19eb4e48-85c8-4705-a2d9-593567493ccb")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2STARTCLASSIFIERBEHAVIORACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("76cb27cf-1652-425d-a3f0-0cecdc543eb4")
    public EStartClassifierBehaviorAction(org.eclipse.uml2.uml.StartClassifierBehaviorAction element) {
        super(element);
    }

    @objid ("32fd59d8-d7df-442a-8f6e-c1ad130cff0d")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("bba35fda-f793-4643-bda1-2687c78ca0ff")
    public void attach(List<Object> objingElts) {
    }

    @objid ("a71d4ed6-0b94-4acd-9084-0a04c17566b8")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
