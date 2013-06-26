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

@objid ("74b0c82d-80a4-43ae-af77-00fce8dc720f")
public class EReduceAction extends EActivityNode implements IEElement {
    @objid ("ad00c51d-0278-4a6b-8030-2a7202ae4b83")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
                .createOpaqueAction();
        
        Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2REDUCEACTION, element.getMClass());
        element.getExtension().add(stereo);
        return element;
    }

    @objid ("2459d98f-f099-4a28-b0e9-b2c5d89b3410")
    public EReduceAction(org.eclipse.uml2.uml.ReduceAction element) {
        super(element);
    }

    @objid ("81e50b4e-efca-4366-bba7-5cfbbaf4dd9f")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("714fdb57-7890-4800-80a3-7e25060a764a")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e841346e-438c-4481-9836-56d58d580935")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
