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
package org.modelio.metamodel.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("005a9290-c4bf-1fd8-97fe-001ec947cd2a")
public interface CommunicationNode extends ModelElement {
    @objid ("9b356161-3e20-4844-bc12-b89995899209")
    String getSelector();

    @objid ("38423fda-9cd2-4771-81ba-b511e73be62d")
    void setSelector(String value);

    @objid ("c8c92df5-99cb-434f-882a-1dea06778501")
    CommunicationInteraction getOwner();

    @objid ("f850cff8-1a3a-4da6-a6b2-cdb439947bc8")
    void setOwner(CommunicationInteraction value);

    @objid ("da9f5713-1274-415d-87fb-62c33102c9d6")
    Instance getRepresented();

    @objid ("772a8371-ae20-44e4-adf5-68d5f2e41146")
    void setRepresented(Instance value);

    @objid ("24411b41-12e9-4177-bd05-76c74826e5da")
    EList<CommunicationChannel> getStarted();

    @objid ("1f855c64-b57c-44ff-92ae-b9cfa6c11a2a")
    <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass);

    @objid ("95af487b-91a9-4a16-b1a5-7cc9d375d3a1")
    EList<CommunicationChannel> getEnded();

    @objid ("aec356ef-a556-4e6f-bba9-32fdee58165b")
    <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass);

}
