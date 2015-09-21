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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.LinkEnd;

/**
 * Link v0.0.9054
 * 
 * 
 * A Link is an Instance of an Association. It has a set of LinkEnds that matches the set of AssociationEnds of the Association.  
 * 
 * Links can be used as Connectors between Parts or Ports in UML 2.0, or they can be Links between Instances. 
 * 
 * In Modelio, a Link belongs to no element.  When a Link acts as a Connector between Parts and/or Ports, these Parts or Ports should belong to the same context (be inside the same Collaboration, Classifier, and so on).
 */
@objid ("815acdf3-5af8-48c5-894b-85d62dbe2e9b")
public interface Link extends ModelElement {
    @objid ("38e90d10-86a2-4da4-b5cf-c8fadc544505")
    public static final String MNAME = "Link";

    /**
     * Getter for relation 'Link->Model'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b0ae579c-e821-4407-b45b-2dfcf300d242")
    Association getModel();

    /**
     * Setter for relation 'Link->Model'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dcf56f57-18e0-4d26-b93c-ca7ec55c51cc")
    void setModel(Association value);

    /**
     * Getter for relation 'Link->LinkEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fcdba22b-8118-416c-9d15-bf71027740ac")
    EList<LinkEnd> getLinkEnd();

    /**
     * Filtered Getter for relation 'Link->LinkEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("08e37d58-29e0-406b-b605-7e66ecd0bc84")
    <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Link->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("21fc00be-0bf3-414a-9e86-5f2d7b436152")
    CommunicationChannel getSent();

    /**
     * Setter for relation 'Link->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("61169a59-87d6-4a59-a823-62d3628f7a25")
    void setSent(CommunicationChannel value);

}
