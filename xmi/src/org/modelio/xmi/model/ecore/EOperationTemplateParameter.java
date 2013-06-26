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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("b4d93993-9137-414a-acd4-1138fb83a0a0")
public class EOperationTemplateParameter extends EElement implements IEElement {
    @objid ("c1051335-bb37-4b8f-ae86-31fbab26ede2")
    public Element createObjingElt() {
        Parameter result = Modelio.getInstance().getModelingSession().getModel().createParameter();
        
            result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                   IModelerModuleStereotypes.UML2OPERATIONTEMPLATEPARAMETER, result.getMClass()));
        return result;
    }

    @objid ("f7cf5ae8-59fc-42ba-ac07-578f3d575ae1")
    public EOperationTemplateParameter(org.eclipse.uml2.uml.OperationTemplateParameter element) {
        super(element);
    }

    @objid ("c57001e7-335d-4ff2-8870-ec691a4692fa")
    public void attach(Element objingElt) {
    }

    @objid ("90aa305e-1068-499f-9519-a07fb671022b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4f538376-6ff5-4967-9f49-e50a1085f08b")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
