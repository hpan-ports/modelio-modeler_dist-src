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
    @objid ("f37f3614-0184-464b-b432-00baa80ec719")
    String getSelector();

    @objid ("a930c01b-5c46-48d6-9034-a84822c1c826")
    void setSelector(String value);

    @objid ("a7af78c7-f5c5-4b53-86a7-2572cb47cfa5")
    CommunicationInteraction getOwner();

    @objid ("895fcdd9-c1d5-4cc4-b288-1075793c82ee")
    void setOwner(CommunicationInteraction value);

    @objid ("2b0d482d-01b4-4009-a991-6f5c1a043508")
    Instance getRepresented();

    @objid ("ca2d30b2-683e-4c6b-bf3f-26f4c9934e4b")
    void setRepresented(Instance value);

    @objid ("7f7d87f4-9693-4191-bbbb-adf2e293d4c8")
    EList<CommunicationChannel> getStarted();

    @objid ("b2df198d-3f33-489e-bdd9-b3d28d7acabb")
    <T extends CommunicationChannel> List<T> getStarted(java.lang.Class<T> filterClass);

    @objid ("dc029fd8-d2d3-4273-b2b8-31660044f066")
    EList<CommunicationChannel> getEnded();

    @objid ("88c39ab7-571c-4cd0-95fe-2615cf95df27")
    <T extends CommunicationChannel> List<T> getEnded(java.lang.Class<T> filterClass);

}
