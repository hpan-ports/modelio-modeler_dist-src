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
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("5d6b6e99-e4d0-4289-a0b7-4c05cc54872b")
public class EExecutionEnvironment extends ENamedElement implements IEElement {
    @objid ("42203a0f-9cd1-4c7b-8e57-43730f823695")
    public Element createObjingElt() {
        Node result =Modelio.getInstance().getModelingSession()
                .getModel().createNode();
        
        result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                .getStereotype( IModelerModuleStereotypes.UML2EXECUTIONENVIRONMENT, result.getMClass()));
        return result;
    }

    @objid ("5cf4351b-ef8a-4aec-a884-01e1cd616533")
    public EExecutionEnvironment(org.eclipse.uml2.uml.ExecutionEnvironment element) {
        super(element);
    }

    @objid ("14d6f2a0-0153-42c6-9100-363b70974a2c")
    public void attach(Element objingElt) {
    }

    @objid ("4f159c07-d1d3-4e2a-b497-f7e9e2f211ae")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e80483f2-ed18-4953-97b8-20e915b316f9")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
