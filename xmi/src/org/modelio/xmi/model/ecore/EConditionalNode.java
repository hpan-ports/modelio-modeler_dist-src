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
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("b1034bc6-e702-4181-a204-95add2c6905f")
public class EConditionalNode extends EStructuredActivityNode implements IEElement {
    @objid ("6252a083-0254-46c5-827b-8d8668e89e92")
    private org.eclipse.uml2.uml.ConditionalNode ecoreElement;

    @objid ("c5f6a83b-bfb9-4d8c-97b3-9c5aa6cb4ded")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createConditionalNode();
    }

    @objid ("0835a3c8-60e6-48df-ad26-f7cc7058452a")
    public EConditionalNode(org.eclipse.uml2.uml.ConditionalNode element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("8fa0ce03-35a0-4b19-878b-11b2057259e7")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("4309ecd0-b400-40eb-97f1-3e3bff9ea73b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("78b70c48-55c9-4dfa-ba27-5843d4ca6e3b")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        // Part of the Properties are setted when mapping the super type
        // (org.eclipse.uml2.uml.StructuredActivityNode)
                
        // Properties specific to org.eclipse.uml2.uml.ConditionalNodes:
        setIsAssured((ConditionalNode) objingElt);
        setDeterminate((ConditionalNode) objingElt);
    }

    @objid ("1d42cc49-2dfb-4767-afdf-4684e44caa46")
    private void setIsAssured(ConditionalNode node) {
        node.setIsAssured(ecoreElement.isAssured());
    }

    @objid ("07d98b9a-ba57-4c35-9f27-87e9c871a49f")
    private void setDeterminate(ConditionalNode node) {
        node.setIsDeterminate(ecoreElement.isDeterminate());
    }

}
