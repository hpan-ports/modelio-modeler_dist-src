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
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

/**
 * NaryLink v0.0.9054
 * 
 * 
 * null
 */
@objid ("00223b3e-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryLink extends ModelElement {
    @objid ("bc2e7aa8-9f81-4225-bed2-33bcdc79c1de")
    public static final String MNAME = "NaryLink";

    /**
     * Getter for relation 'NaryLink->NaryLinkEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e693da1b-0da1-4e0c-8c1a-5cd8eadfadf2")
    EList<NaryLinkEnd> getNaryLinkEnd();

    /**
     * Filtered Getter for relation 'NaryLink->NaryLinkEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9f1c07fd-8751-409c-9816-1fd1ee17aba2")
    <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NaryLink->Model'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a8b11a69-62e2-4362-9450-6d12d99e1f9e")
    NaryAssociation getModel();

    /**
     * Setter for relation 'NaryLink->Model'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3690004d-01fe-4cbb-87fb-59513001875e")
    void setModel(NaryAssociation value);

    /**
     * Getter for relation 'NaryLink->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("38826307-4eb6-4947-aa21-440643675193")
    EList<InformationFlow> getRealizedInformationFlow();

    /**
     * Filtered Getter for relation 'NaryLink->RealizedInformationFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a0dcfc5b-e174-4883-b20c-81610837f0bf")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NaryLink->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c4c68f10-ba67-4f29-b3bd-79c388f041c6")
    EList<CommunicationChannel> getSent();

    /**
     * Filtered Getter for relation 'NaryLink->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f908248b-3d1e-4e66-bfa0-9a68a14f65db")
    <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass);

}
