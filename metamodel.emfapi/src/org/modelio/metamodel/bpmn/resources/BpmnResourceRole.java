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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

/**
 * BpmnResourceRole v0.0.9054
 * 
 * 
 * Resource allocated to a model element. The occurence provides values to resource parameters through resources binding
 */
@objid ("000a8606-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceRole extends BpmnBaseElement {
    @objid ("5a6eb7f3-64d0-4953-8c22-f16d022405d0")
    public static final String MNAME = "BpmnResourceRole";

    /**
     * Getter for relation 'BpmnResourceRole->ResourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("837a09c6-016d-4e23-9653-ace36a6fdfb1")
    BpmnResource getResourceRef();

    /**
     * Setter for relation 'BpmnResourceRole->ResourceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f7afb95a-d374-45a1-8125-8e0a80a59c35")
    void setResourceRef(BpmnResource value);

    /**
     * Getter for relation 'BpmnResourceRole->Annotated'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0546dc87-683e-4d95-b834-7ef867c2be77")
    BpmnFlowNode getAnnotated();

    /**
     * Setter for relation 'BpmnResourceRole->Annotated'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b18343c7-3ae4-45ad-a54c-9a253abbe268")
    void setAnnotated(BpmnFlowNode value);

    /**
     * Getter for relation 'BpmnResourceRole->ResourceParameterBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ee0ca596-06f8-41a9-bc55-64a25c82efbf")
    EList<BpmnResourceParameterBinding> getResourceParameterBinding();

    /**
     * Filtered Getter for relation 'BpmnResourceRole->ResourceParameterBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("138b88c1-3aad-4456-8386-c2cfa80087d4")
    <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnResourceRole->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a2612c8c-ab19-47d5-888f-64acf127953d")
    BpmnProcess getProcess();

    /**
     * Setter for relation 'BpmnResourceRole->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1b6ebe7b-c7e4-46db-b747-a4e5dfe2cc0d")
    void setProcess(BpmnProcess value);

}
