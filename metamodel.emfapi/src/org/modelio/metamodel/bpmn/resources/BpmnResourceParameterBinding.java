/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.resources;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnResourceParameterBinding v0.0.9054
 * 
 * 
 * Valuates the value of a resource parameter for a value occurence.
 */
@objid ("000b28b8-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameterBinding extends BpmnBaseElement {
    @objid ("3ab2d31f-ee80-46d9-89cc-adad2b2be9f9")
    public static final String MNAME = "BpmnResourceParameterBinding";

    /**
     * Getter for attribute 'BpmnResourceParameterBinding.Expression'
     * 
     * Metamodel description:
     * <i>expression of the value of the parameter</i>
     */
    @objid ("2cb0624f-cfd8-4a21-84ca-2612e1003871")
    String getExpression();

    /**
     * Setter for attribute 'BpmnResourceParameterBinding.Expression'
     * 
     * Metamodel description:
     * <i>expression of the value of the parameter</i>
     */
    @objid ("48d901e5-c64a-4311-9529-31dad66eeb1d")
    void setExpression(String value);

    /**
     * Getter for relation 'BpmnResourceParameterBinding->ResourceRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("663b4c13-60fc-4da5-9d7e-ce1f9b0b93cf")
    BpmnResourceRole getResourceRole();

    /**
     * Setter for relation 'BpmnResourceParameterBinding->ResourceRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("86dea063-27bc-493c-a580-60b7ef9d098d")
    void setResourceRole(BpmnResourceRole value);

    /**
     * Getter for relation 'BpmnResourceParameterBinding->ParameterRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9f625a3a-c80d-49dc-bf30-94fb0ac586cd")
    BpmnResourceParameter getParameterRef();

    /**
     * Setter for relation 'BpmnResourceParameterBinding->ParameterRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b9534bd4-8a04-40d1-83c5-68b77a57a37a")
    void setParameterRef(BpmnResourceParameter value);

}
