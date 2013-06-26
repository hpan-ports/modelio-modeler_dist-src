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

@objid ("969a1246-f194-4152-b59b-4f06a39c5fae")
public class EReadSelfAction extends EActivityNode implements IEElement {
    @objid ("4e585e47-5e41-4e82-9969-806df765e489")
    public Element createObjingElt() {
        OpaqueAction element = Modelio.getInstance().getModelingSession().getModel()
        .createOpaqueAction();
              
            Stereotype stereo = Modelio.getInstance().getModelingSession().getMetamodelExtensions()
            .getStereotype(IModelerModuleStereotypes.UML2READSELFACTION, element.getMClass());
            element.getExtension().add(stereo);
        return element;
    }

    @objid ("81fc2d5f-c8ac-4f90-af3d-d00b9ce6f50a")
    public EReadSelfAction(org.eclipse.uml2.uml.ReadSelfAction element) {
        super(element);
    }

    @objid ("01a20eb4-6339-4b52-84c9-4272368acd49")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("50939507-8b53-495e-b701-f4fd63481bca")
    public void attach(List<Object> objingElts) {
    }

    @objid ("7f077391-71b0-4eb5-a557-a61165b9a84d")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
