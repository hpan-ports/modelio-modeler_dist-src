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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;

/**
 * BpmnParticipant v0.0.9054
 * 
 * 
 * A Participant represents a specific PartnerEntity (e.g., a company) and/or a more general PartnerRole (e.g., a buyer, seller, or manufacturer) that are Participants in a Collaboration. A Participant is often responsible for the execution of the Process enclosed in a Pool; however, a Pool may be defined without a Process.
 */
@objid ("007577d6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnParticipant extends BpmnBaseElement {
    @objid ("6a474329-671f-4f2a-88f5-732c21aee3bb")
    public static final String MNAME = "BpmnParticipant";

    /**
     * Getter for attribute 'BpmnParticipant.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>When Participants represent more than 1 instance, min and max are specified (1 - 1 by default)</i>
     */
    @objid ("083c588e-d9b7-48c6-8936-3a5297d8b0fa")
    int getMultiplicityMin();

    /**
     * Setter for attribute 'BpmnParticipant.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>When Participants represent more than 1 instance, min and max are specified (1 - 1 by default)</i>
     */
    @objid ("5a94cbed-4eb4-4205-b2bb-ffc5a97c564d")
    void setMultiplicityMin(int value);

    /**
     * Getter for attribute 'BpmnParticipant.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>When Participants represent more than 1 instance, min and max are specified (1 - 1 by default)</i>
     */
    @objid ("786b96b6-d129-4139-a160-0fcc2713edcd")
    int getMultiplicityMax();

    /**
     * Setter for attribute 'BpmnParticipant.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>When Participants represent more than 1 instance, min and max are specified (1 - 1 by default)</i>
     */
    @objid ("ff55a4cb-1c54-4cbd-992e-cb07394694fc")
    void setMultiplicityMax(int value);

    /**
     * Getter for relation 'BpmnParticipant->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cbeed092-86ca-434a-8fc3-31c8dd643547")
    BpmnProcess getProcess();

    /**
     * Setter for relation 'BpmnParticipant->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bcc255dd-980d-4d4d-a57a-236cec0de8f7")
    void setProcess(BpmnProcess value);

    /**
     * Getter for relation 'BpmnParticipant->Container'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4be204b8-cd90-48e4-a322-9f0784c70e75")
    BpmnCollaboration getContainer();

    /**
     * Setter for relation 'BpmnParticipant->Container'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b634a9e2-61bd-4276-a9d1-f8855e64fa59")
    void setContainer(BpmnCollaboration value);

    /**
     * Getter for relation 'BpmnParticipant->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d6823040-f5df-4ba0-8beb-7d11a9996446")
    Classifier getType();

    /**
     * Setter for relation 'BpmnParticipant->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("20e82778-cd47-4e70-ae87-8fd06703bff1")
    void setType(Classifier value);

    /**
     * Getter for relation 'BpmnParticipant->EndPointRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0a0442b0-6ebb-4f9e-84fd-284f7a4722c9")
    EList<BpmnEndPoint> getEndPointRefs();

    /**
     * Filtered Getter for relation 'BpmnParticipant->EndPointRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("84f79ec3-38cb-493e-8214-8530b01f4ce1")
    <T extends BpmnEndPoint> List<T> getEndPointRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnParticipant->InterfaceRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4bdd63fb-5993-40c5-94e1-fd7f4a59c006")
    EList<BpmnInterface> getInterfaceRefs();

    /**
     * Filtered Getter for relation 'BpmnParticipant->InterfaceRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("01db31da-34f2-4484-b3a2-d725f6f90064")
    <T extends BpmnInterface> List<T> getInterfaceRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnParticipant->PackageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4fc11ec7-4af0-4ccf-a37c-0bb3298c912d")
    Package getPackageRef();

    /**
     * Setter for relation 'BpmnParticipant->PackageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cf8594e6-805d-45b6-bd38-a1bb4a07da5c")
    void setPackageRef(Package value);

}
