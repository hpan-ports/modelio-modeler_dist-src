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
    @objid ("13bd0be7-2299-4443-8bae-a64ce48da7d2")
    EList<NaryLinkEnd> getNaryLinkEnd();

    @objid ("0be307f7-a1b5-41f4-a7b3-8147eb91fdba")
    <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass);

    @objid ("96184ccb-f7b7-4e89-a3fd-e75c084874ea")
    NaryAssociation getModel();

    @objid ("aa90cd5a-6f4e-4bda-abae-e38e4931ad98")
    void setModel(NaryAssociation value);

    @objid ("1ed04487-9df6-46a8-9703-fa26161127a3")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("9d7a169d-67de-4f80-a406-0536be64ad40")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("9c8d6053-c08c-46ce-9d95-2a3d290a6916")
    EList<CommunicationChannel> getSent();

    @objid ("f0f85c62-75f3-485f-8339-c59b59177184")
    <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass);

}
