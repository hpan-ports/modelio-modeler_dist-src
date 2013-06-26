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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("76c0c65a-b9c5-4154-bf7d-b9e9a63fcf8d")
public class EExecutionEvent extends ENamedElement implements IEElement {
    @objid ("a6195435-5e07-414c-a51f-d08d980cadee")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        MObject objingOwner = (MObject) ReverseProperties.getInstance().getMappedElement(ecoreOwner);
        if (objingOwner instanceof Behavior){
            Event result = Modelio.getInstance().getModelingSession().getModel().createEvent();
         
                result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                        IModelerModuleStereotypes.UML2EXECUTIONEVENT, SmClass.getClass( Event.class)));
           
            return result;
        }
        return null;
    }

    @objid ("212cc548-71d0-486d-a0a3-4fca09dfc83c")
    public EExecutionEvent(org.eclipse.uml2.uml.ExecutionEvent element) {
        super(element);
    }

    @objid ("77696f48-41b1-4b45-85b1-8e14a69df130")
    public void attach(Element objingElt) {
    }

    @objid ("efd3a108-e255-4978-b15d-470944fee96c")
    public void attach(List<Object> objingElts) {
    }

    @objid ("2b091455-f984-4162-8636-163292068552")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
