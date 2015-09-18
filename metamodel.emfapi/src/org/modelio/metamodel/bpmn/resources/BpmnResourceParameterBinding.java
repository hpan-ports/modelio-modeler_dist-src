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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.resources;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("000b28b8-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameterBinding extends BpmnBaseElement {
    @objid ("daf60e7f-42b1-4b2d-baa9-d6070d99eb80")
    String getExpression();

    @objid ("20571a42-7e8e-4268-88ea-9756f1cf2e4b")
    void setExpression(String value);

    @objid ("73aa8f65-8f82-43e2-8969-8ab876d916f3")
    BpmnResourceRole getResourceRole();

    @objid ("a9657260-0d06-4146-a0e5-db69b1b4b4bc")
    void setResourceRole(BpmnResourceRole value);

    @objid ("b5a98f45-dcbc-404f-a1ea-8e671924507d")
    BpmnResourceParameter getParameterRef();

    @objid ("688f0ec5-a0fc-43fe-a214-43b461cc75b8")
    void setParameterRef(BpmnResourceParameter value);

}
