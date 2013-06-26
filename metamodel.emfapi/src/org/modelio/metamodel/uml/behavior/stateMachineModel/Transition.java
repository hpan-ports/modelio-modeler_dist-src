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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0055b6a8-c4bf-1fd8-97fe-001ec947cd2a")
public interface Transition extends ModelElement {
    @objid ("191b936d-9c6e-4ec0-ae2f-0ae18055f86b")
    String getEffect();

    @objid ("8e5b2451-c0e7-42ed-922e-8ecaefda778b")
    void setEffect(String value);

    @objid ("08d7b5aa-0269-4525-beb5-dea89892bfb2")
    String getReceivedEvents();

    @objid ("bbd4e047-d1b6-4c04-9384-2ecc0049e4f6")
    void setReceivedEvents(String value);

    @objid ("335710ed-af70-4723-b588-a157a676c47c")
    String getSentEvents();

    @objid ("72d8b6b3-28ad-4bee-934a-8fb987062b3e")
    void setSentEvents(String value);

    @objid ("1be01a3b-cec0-46c3-a9c5-43e6c5759a08")
    String getGuard();

    @objid ("e741b9de-d14e-4d20-a663-4f4f27afcd31")
    void setGuard(String value);

    @objid ("d6e4c722-eab9-4422-a74c-c8f53700ed9c")
    String getPostCondition();

    @objid ("6d41f8dc-5600-4297-9e56-03e5e7ed4e08")
    void setPostCondition(String value);

    @objid ("d6d91155-2838-40e5-b4c2-e12ca9f4b905")
    Operation getProcessed();

    @objid ("68881a6f-76f5-43a7-88e2-c5b4a6c43268")
    void setProcessed(Operation value);

    @objid ("416a8588-e82b-4865-a62a-aad5467e6ed2")
    Event getTrigger();

    @objid ("587b41fc-56a0-4a31-a532-777e37930da5")
    void setTrigger(Event value);

    @objid ("86c93478-743c-4254-9d0c-9b0b80263f70")
    Behavior getBehaviorEffect();

    @objid ("a3e308c2-6994-407b-830a-f3e8cb687962")
    void setBehaviorEffect(Behavior value);

    @objid ("bdbce1ec-3f62-416b-9816-54d50526b942")
    StateVertex getTarget();

    @objid ("c2562908-4117-4ff8-b5b6-1c98f72d91d5")
    void setTarget(StateVertex value);

    @objid ("c612b47c-2b59-48ba-afbb-a3833720bf2e")
    StateVertex getSource();

    @objid ("e927dfa2-1512-40b9-9dca-1c41cc176826")
    void setSource(StateVertex value);

    @objid ("8b6bee33-d93c-4622-90f2-404bf60b7adc")
    Signal getEffects();

    @objid ("b367ce2c-9e36-4422-9621-ae71955a84e9")
    void setEffects(Signal value);

}
