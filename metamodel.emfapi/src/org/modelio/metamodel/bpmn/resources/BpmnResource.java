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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("a51cf1c7-d47b-4009-ad08-0741e819d4c2")
    EList<BpmnResourceRole> getResourceroleRefs();

    @objid ("fe579ae1-8bdb-4726-8ba3-94ad3ba042a7")
    <T extends BpmnResourceRole> List<T> getResourceroleRefs(java.lang.Class<T> filterClass);

    @objid ("e08c4252-faff-4956-99c8-a77ae9bffd2d")
    EList<BpmnResourceParameter> getParameter();

    @objid ("a39d79da-d9a7-4314-9cb9-1e23e7a7c5a9")
    <T extends BpmnResourceParameter> List<T> getParameter(java.lang.Class<T> filterClass);

}
