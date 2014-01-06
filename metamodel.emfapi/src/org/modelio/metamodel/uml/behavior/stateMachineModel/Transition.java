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
    @objid ("85e0a22f-22af-4074-9bff-bd8b197819ad")
    String getEffect();

    @objid ("3826add2-7ba0-469f-acf3-30d8c083e21a")
    void setEffect(String value);

    @objid ("e6f8fb22-ad75-4795-afeb-f6bc955b934b")
    String getReceivedEvents();

    @objid ("faae6cab-c9a1-4722-a710-8048d4a991f5")
    void setReceivedEvents(String value);

    @objid ("2d001689-f20a-41f4-b61f-b41a8ee85046")
    String getSentEvents();

    @objid ("36cf8c4b-1555-4aaa-95a0-1d2153d2f24d")
    void setSentEvents(String value);

    @objid ("872b12f8-8ea5-40da-806a-6f2612783a36")
    String getGuard();

    @objid ("2badda84-05a0-40f2-a371-9f4b4dd9657e")
    void setGuard(String value);

    @objid ("87a6f1d0-dbcc-4c40-98c8-874c94880af9")
    String getPostCondition();

    @objid ("2cce9ef0-a910-4eed-9904-8ec3ca529f7b")
    void setPostCondition(String value);

    @objid ("3a6ad0d9-8786-4262-9b56-c8ca406bc990")
    Operation getProcessed();

    @objid ("0e61a80f-d23a-4d44-b254-b0eb3249ea81")
    void setProcessed(Operation value);

    @objid ("e8736083-567e-4bc3-8e87-51c8a238fbae")
    Event getTrigger();

    @objid ("1b397cd2-532b-458b-aa6b-887c701e745c")
    void setTrigger(Event value);

    @objid ("5b7eb444-8b6c-4ea2-b873-9e3d63066270")
    Behavior getBehaviorEffect();

    @objid ("34226ba9-79df-4adf-b2ab-9055f524ae6c")
    void setBehaviorEffect(Behavior value);

    @objid ("dcd7240e-ae30-4cb2-9be7-7c1c427672ea")
    StateVertex getTarget();

    @objid ("a43799f1-625b-4e4f-b34f-01762745ea64")
    void setTarget(StateVertex value);

    @objid ("558dcc87-ee21-44eb-8a55-4ead7e042cd3")
    StateVertex getSource();

    @objid ("a1091069-ceaa-4a8e-b0e6-92c1e6002f8a")
    void setSource(StateVertex value);

    @objid ("9e03338c-eb7f-46a5-8f47-2fd29fba5e59")
    Signal getEffects();

    @objid ("b7302d7e-238a-42a3-87ad-f0d9b1b8066a")
    void setEffects(Signal value);

}
