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
/*   Metamodel version: 9019              */
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
    @objid ("094f48e9-f7e3-49a6-bdea-571daf34d86e")
    EList<NaryLinkEnd> getNaryLinkEnd();

    @objid ("2a225f68-d3b1-4378-b17c-7b4c2ca276de")
    <T extends NaryLinkEnd> List<T> getNaryLinkEnd(java.lang.Class<T> filterClass);

    @objid ("6bdf1cbd-6b79-41ca-a220-fffeb0d53cdc")
    NaryAssociation getModel();

    @objid ("7ddd644c-e3b4-4d33-99ef-ac0589d6ca43")
    void setModel(NaryAssociation value);

    @objid ("71c33824-150d-422c-b171-06dee80d6efb")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("c0749712-1bf4-4dbc-b787-0596925f24f6")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

    @objid ("1d6c49a2-1ec9-422d-9ba4-d61124109436")
    EList<CommunicationChannel> getSent();

    @objid ("9d35703d-df57-4165-adc8-73b011fa755b")
    <T extends CommunicationChannel> List<T> getSent(java.lang.Class<T> filterClass);

}
