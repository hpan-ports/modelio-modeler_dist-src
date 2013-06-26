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

@objid ("8d378d9d-44ca-4d56-9747-d92ed2246a5f")
public class ECreationEvent extends ENamedElement implements IEElement {
    @objid ("99e84cd8-1bc3-4481-aa70-6834c7d97a97")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        Element objingOwner = (Element) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        if (objingOwner instanceof Behavior){
            Event result = Modelio.getInstance().getModelingSession().getModel().createEvent();
          
                result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                         IModelerModuleStereotypes.UML2CREATIONEVENT, SmClass.getClass(Event.class) ));
        
            return result;
        }
        return null;
    }

    @objid ("0e66e4fe-1f70-4b97-a596-9b850372eab9")
    public ECreationEvent(org.eclipse.uml2.uml.CreationEvent element) {
        super(element);
    }

    @objid ("acabcf55-73fa-41c1-82ba-e5c287824d9a")
    public void attach(Element objingElt) {
    }

    @objid ("395263b0-cafe-4450-9f91-9f72f52b63e9")
    public void attach(List<Object> objingElts) {
    }

    @objid ("6689689b-d374-4d0b-ba5e-3a55d8230016")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
