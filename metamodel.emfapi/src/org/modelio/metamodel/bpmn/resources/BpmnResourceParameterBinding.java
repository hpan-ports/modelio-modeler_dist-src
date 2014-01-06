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
/*   Metamodel version: 9019              */
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
    @objid ("47aba2f3-5a07-4672-b977-184793ac4224")
    String getExpression();

    @objid ("a11a415e-39f2-4db5-b687-615e9692464c")
    void setExpression(String value);

    @objid ("35e0f241-3e42-412e-9771-b81d801d2fbb")
    BpmnResourceRole getResourceRole();

    @objid ("4b5c81e8-47d9-4837-a62b-e12b0ef2d121")
    void setResourceRole(BpmnResourceRole value);

    @objid ("bf0b85c6-cf7c-4899-a8b9-149594372dd5")
    BpmnResourceParameter getParameterRef();

    @objid ("494b3858-0fcc-41c9-81f1-9860a9988193")
    void setParameterRef(BpmnResourceParameter value);

}
