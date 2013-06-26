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

@objid ("14fa172e-bbed-480a-b646-85492afd591c")
public class EReadIsClassifiedObjectAction extends EActivityNode implements IEElement {
    @objid ("2e48ee42-b423-40e7-82fb-b463601cf32a")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype(IModelerModuleStereotypes.UML2READISCLASSIFIEROBJECTACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("4efa63db-c06f-4077-96cd-f9c3f5252231")
    public EReadIsClassifiedObjectAction(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction element) {
        super(element);
    }

    @objid ("6da9ce8a-ef06-4d63-8d89-a05699e3cd54")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("5f084df8-af48-4ddc-8d6e-08aa0198b1a1")
    public void attach(List<Object> objingElts) {
    }

    @objid ("0b30b149-72b3-45db-b7de-688a6e292c15")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
