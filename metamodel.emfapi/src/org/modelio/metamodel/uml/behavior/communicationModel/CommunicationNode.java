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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * CommunicationNode v0.0.9054
 * 
 * 
 * A Communication node represents an individual participant in the Communication Interaction. While Parts and StructuralFeatures may have multiplicity greater than 1, Communication nodes represent only one interacting entity.
 * 
 * If the referenced Instance is multivalued (i.e, has a multiplicity > 1), then the Communication node may have an expression (the �??selector�??) that specifies which particular part is represented by this Communication node. If the selector is omitted, this means that an arbitrary representative of the multivalued Connectable element is chosen.
 */
@objid ("005a9290-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationNode extends ModelElement {
    @objid ("18769370-345d-45fd-aad9-0d7ec1ab9387")
    public static final String MNAME = "CommunicationNode";

    /**
     * Getter for attribute 'CommunicationNode.Selector'
     * 
     * Metamodel description:
     * <i>If the represented element is multivalued, then this specifies the specific individual part within that set.</i>
     */
    @objid ("64500186-0593-41af-8225-a3faad8695b0")
    String getSelector();

    /**
     * Setter for attribute 'CommunicationNode.Selector'
     * 
     * Metamodel description:
     * <i>If the represented element is multivalued, then this specifies the specific individual part within that set.</i>
     */
    @objid ("da68cd1d-bfec-47a2-86e0-1b8fc4e99ed8")
    void setSelector(String value);

    /**
     * Getter for relation 'CommunicationNode->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("577fba68-adc1-4a1f-8626-c6216725168d")
    CommunicationInteraction getOwner();

    /**
     * Setter for relation 'CommunicationNode->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e14c6456-315d-48f2-a0ea-d4048d565ffc")
    void setOwner(CommunicationInteraction value);

    /**
     * Getter for relation 'CommunicationNode->Represented'
     * 
     * Metamodel description:
     * <i>References the Instance the communication node represents.</i>
     */
    @objid ("51cbfb0a-973f-4465-95a7-ef0350bc635d")
    Instance getRepresented();

    /**
     * Setter for relation 'CommunicationNode->Represented'
     * 
     * Metamodel description:
     * <i>References the Instance the communication node represents.</i>
     */
    @objid ("1600c273-d920-4719-8374-c94ef5c71be3")
    void setRepresented(Instance value);

    /**
     * Getter for relation 'CommunicationNode->Started'
     * 
     * Metamodel description:
     * <i>References communication channels starting from the node.</i>
     */
    @objid ("e32e3d0f-d97b-4f88-a476-94f09dcaff83")
    EList<CommunicationChannel> getStarted();

    /**
     * Filtered Getter for relation 'CommunicationNode->Started'
     * 
     * Metamodel description:
     * <i>References communication channels starting from the node.</i>
     */
    @objid ("f9427a54-d279-47d1-bf7d-3d14fc1019c6")
    <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'CommunicationNode->Ended'
     * 
     * Metamodel description:
     * <i>References communication channels ending on the node.</i>
     */
    @objid ("72a6462b-c580-4a51-b78f-395dfb499886")
    EList<CommunicationChannel> getEnded();

    /**
     * Filtered Getter for relation 'CommunicationNode->Ended'
     * 
     * Metamodel description:
     * <i>References communication channels ending on the node.</i>
     */
    @objid ("724204cd-9b90-4b00-8ce3-f78c2ed4797b")
    <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass);

}
