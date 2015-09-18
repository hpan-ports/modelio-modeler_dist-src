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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

@objid ("00223b3e-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryLink extends ModelElement {
    @objid ("3aaf86e5-1968-46b9-a41a-8972cf3c01cf")
    EList<NaryLinkEnd> getNaryLinkEnd();

    @objid ("31fc72d7-b4fc-40b1-b011-8789ec67b15c")
    <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass);

    @objid ("bf884ac0-122e-4c47-a845-f0bd732fd43a")
    NaryAssociation getModel();

    @objid ("d8c1984b-7b46-4316-aaf4-cdd027a71627")
    void setModel(NaryAssociation value);

    @objid ("b02638d5-8c5a-46fd-87c6-01c228c403ca")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("44a710b0-2960-4672-9601-47e4bca0e802")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("0dc1142c-ee39-43ae-b2dc-cbf0cd879001")
    EList<CommunicationChannel> getSent();

    @objid ("523fc1fa-aabd-4455-bd90-ba4ce61ba562")
    <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass);

}
