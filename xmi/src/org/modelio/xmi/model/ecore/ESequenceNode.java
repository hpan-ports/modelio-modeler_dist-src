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
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("93e7f010-1359-4f7c-9084-105c13ad6c10")
public class ESequenceNode extends EStructuredActivityNode implements IEElement {
    @objid ("502974cd-192f-4e4d-a62d-019aca1f388c")
    public Element createObjingElt() {
        StructuredActivityNode result =  Modelio.getInstance().getModelingSession().getModel()
                .createStructuredActivityNode();
        
        result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                IModelerModuleStereotypes.UML2SEQUENCENODE, result.getMClass()));
        return result;
    }

    @objid ("43849c82-ef42-4b95-9864-ba3309503a10")
    public ESequenceNode(org.eclipse.uml2.uml.SequenceNode element) {
        super(element);
    }

    @objid ("cb0f1ce2-688c-434b-ace6-c314c39c43b0")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("9152c762-6ed4-44bc-bf0e-977c955e6080")
    public void attach(List<Object> objingElts) {
    }

    @objid ("c3748d34-df95-49b6-9310-71b38eb72f34")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
