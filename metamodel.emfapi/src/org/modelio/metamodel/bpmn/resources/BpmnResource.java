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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

@objid ("00093d64-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResource extends BpmnRootElement {
    @objid ("bf36d6b7-ba8d-4c32-a281-31b7f60da0a8")
    EList<BpmnResourceRole> getResourceroleRefs();

    @objid ("a51ea468-4d73-4522-b77b-6d6778ef56cc")
    <T extends BpmnResourceRole> List<T> getResourceroleRefs(java.lang.Class<T> filterClass);

    @objid ("ace285b3-5e24-4c8e-b38a-edbc2a2da29c")
    EList<BpmnResourceParameter> getParameter();

    @objid ("e1f20cf1-1320-4b8b-a95b-209d8a4ce1fe")
    <T extends BpmnResourceParameter> List<T> getParameter(java.lang.Class<T> filterClass);

}
