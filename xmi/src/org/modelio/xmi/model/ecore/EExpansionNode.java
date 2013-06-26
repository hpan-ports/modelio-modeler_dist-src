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
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("268ee9bb-3fc4-4463-b384-3f3bf1468d8e")
public class EExpansionNode extends ENamedElement implements IEElement {
    @objid ("49eb4238-0f68-443d-b38f-2a99adc255f0")
    private boolean isInput = false;

    @objid ("8cf23599-d80e-4136-8229-4ff4f9c3290e")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel().createExpansionNode();
    }

    @objid ("c2f372da-09c0-4dcb-9dc0-6dac7e206020")
    public EExpansionNode(org.eclipse.uml2.uml.ExpansionNode element) {
        super(element);
        if (element.getRegionAsInput()!= null){
            isInput = true;
        }else{
            isInput = false;
        }
    }

    @objid ("98545e29-76c2-41ef-b70a-e7f2bf152438")
    public void attach(Element objingElt) {
        org.eclipse.uml2.uml.ExpansionNode ecoreElement = (org.eclipse.uml2.uml.ExpansionNode) getEcoreElement();
        org.eclipse.uml2.uml.Element region = ecoreElement.getOwner();
                
        Object objOwner =  ReverseProperties.getInstance().getMappedElement(region);
                
        if ((objOwner != null) && (objOwner instanceof ExpansionRegion)){
                
            if (isInput)
                ((ExpansionRegion)objOwner).getInputElement().add((ExpansionNode) objingElt);
            else
                ((ExpansionRegion)objOwner).getOutputElement().add((ExpansionNode) objingElt);
        }else{
            objingElt.delete();
        }
    }

    @objid ("5ec12254-0bc4-4826-bf7f-00f35398765b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("13863712-7936-4502-a935-d2c9654bce25")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
