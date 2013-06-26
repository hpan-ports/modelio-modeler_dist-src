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
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("a2ce9455-4ae1-4594-ba1b-032ac5b88ab6")
public class EStructuredActivityNode extends EActivityNode implements IEElement {
    @objid ("24901712-65a6-49fa-8f64-93aba86a0a5d")
    private org.eclipse.uml2.uml.StructuredActivityNode ecoreElement = null;

    @objid ("345b13c1-17b0-490e-ab70-ecaddea4619e")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createStructuredActivityNode();
    }

    @objid ("adb50113-62fe-4d42-ad2f-5de6cad1ad16")
    public EStructuredActivityNode(org.eclipse.uml2.uml.StructuredActivityNode element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("f7db93a7-1dcf-46d3-967c-1db90d08ccba")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("e26d9519-3724-4348-a7c4-27eda297726f")
    public void attach(List<Object> objingElts) {
    }

    @objid ("bb65bfff-ef60-45db-b6f5-ce9599e6edba")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setMustIsolate((StructuredActivityNode) objingElt);
    }

    @objid ("034bbfe1-4f31-4d33-94ac-d0dca61e126e")
    private void setMustIsolate(StructuredActivityNode node) {
        node.setMustIsolate(ecoreElement.isMustIsolate());
    }

}
