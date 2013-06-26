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
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("8c448c3c-19d9-4b51-9900-f22e27647889")
public class EGate extends ENamedElement implements IEElement {
    @objid ("26daa0e1-68f8-4bd5-b763-df6b6d83b573")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createGate();
    }

    @objid ("c38ff673-ae95-474e-a64a-0326ebb2a337")
    public EGate(org.eclipse.uml2.uml.Gate element) {
        super(element);
    }

    @objid ("1a573fe3-4f77-4de2-8712-fc11c859cb27")
    public void attach(Element objingElt) {
        if (objingElt instanceof Gate){
        
            Object owner = ReverseProperties.getInstance().getMappedElement(getEcoreElement().getOwner());
        
            if (owner instanceof Interaction){
                ((Interaction) owner).getFormalGate().add((Gate) objingElt);
            }else if (owner instanceof InteractionUse){
                ((InteractionUse) owner).getActualGate().add((Gate) objingElt);
            }else{
                //Combined Fragment cases                
                ((CombinedFragment) owner).getFragmentGate().add((Gate) objingElt);
            }
        }
    }

    @objid ("3e9afbb8-3f62-4170-a04f-6ee8ecf855bf")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f6594700-8e8c-4ea3-b158-4fa06c03a438")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
