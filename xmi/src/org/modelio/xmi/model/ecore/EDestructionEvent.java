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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("a74c1765-9fae-4e20-9aa1-ace01f164cec")
public class EDestructionEvent extends ENamedElement implements IEElement {
    @objid ("d20d75da-a3c2-46d0-b42b-a7e72a486e85")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        Element objingOwner = (Element) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        if (objingOwner instanceof Behavior){
            Event result = Modelio.getInstance().getModelingSession().getModel().createEvent();
          
                result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                   IModelerModuleStereotypes.UML2DESTRUCTIONEVENT, SmClass.getClass(Event.class)));
            
            return result;
        }
        return null;
    }

    @objid ("e5451475-b325-4b02-829e-4dade34e8636")
    public EDestructionEvent(org.eclipse.uml2.uml.DestructionEvent element) {
        super(element);
    }

    @objid ("fda8484b-f60e-4af7-be65-d29b4dbc32b4")
    public void attach(Element objingElt) {
    }

    @objid ("20182820-ce4d-4c36-ab5b-45a7554911bb")
    public void attach(List<Object> objingElts) {
    }

    @objid ("028c8d27-b7a5-4ff0-9e9b-43672097bc6a")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
