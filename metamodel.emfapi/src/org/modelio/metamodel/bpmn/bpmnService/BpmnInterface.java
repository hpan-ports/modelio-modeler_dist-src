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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * BpmnInterface v0.0.9054
 * 
 * 
 * null
 */
@objid ("000de92c-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnInterface extends BpmnRootElement {
    @objid ("ed8b7756-8269-4e07-b351-51d4335c44de")
    public static final String MNAME = "BpmnInterface";

    /**
     * Getter for relation 'BpmnInterface->ImplementationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("32a066c4-be9d-456f-b2f3-42b7a1eb6164")
    GeneralClass getImplementationRef();

    /**
     * Setter for relation 'BpmnInterface->ImplementationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8fa15577-bdba-44a1-afbf-a649b2bab5e7")
    void setImplementationRef(GeneralClass value);

    /**
     * Getter for relation 'BpmnInterface->Operation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ca37fa4b-a1f1-42ad-bc71-8cd328cca450")
    EList<BpmnOperation> getOperation();

    /**
     * Filtered Getter for relation 'BpmnInterface->Operation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("212cdcf2-41e8-4f6b-b882-dda93256a6b4")
    <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnInterface->ParticipantRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5f198651-ebde-43b6-932f-d11755926ba8")
    EList<BpmnParticipant> getParticipantRef();

    /**
     * Filtered Getter for relation 'BpmnInterface->ParticipantRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("56d3c2af-8867-49da-a137-d3fb7df1c48b")
    <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass);

}
