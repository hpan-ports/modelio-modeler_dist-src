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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("000b28b8-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameterBinding extends BpmnBaseElement {
    @objid ("39f26441-f961-4722-8f56-d3f4c1e7806d")
    String getExpression();

    @objid ("28b7a395-ec6d-4a18-b355-2eab8c53f770")
    void setExpression(String value);

    @objid ("4240ab83-20c0-4235-8863-30f6605bcd6e")
    BpmnResourceRole getResourceRole();

    @objid ("0b8b4de3-04d8-4e58-9f0c-8a003b4d9a21")
    void setResourceRole(BpmnResourceRole value);

    @objid ("1a36424f-4aef-42b9-81f3-cc8b50c22bb0")
    BpmnResourceParameter getParameterRef();

    @objid ("4c2c1296-fc8e-42eb-8d54-f25e1f4ed2a2")
    void setParameterRef(BpmnResourceParameter value);

}
