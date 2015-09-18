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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00428d1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Event extends ModelElement {
    @objid ("5bc07aa7-779f-4431-b977-b7cc834e6f7e")
    String getExpression();

    @objid ("7beda847-19f2-476e-8457-2257b36ef31d")
    void setExpression(String value);

    @objid ("b86cd57c-b40a-4426-bc9e-5d0c4db2b588")
    EventType getKind();

    @objid ("37b503b7-19b4-4adc-a27b-0f92c0cbb104")
    void setKind(EventType value);

    @objid ("375b93ea-b5ae-4758-bb6f-93b798dc7fc3")
    EList<Transition> getTriggered();

    @objid ("a1957605-a1d9-488c-91e2-607f942376d6")
    <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass);

    @objid ("a8e64a6c-be1c-42f3-a9da-d6b6221c73f3")
    Signal getModel();

    @objid ("733ce4bb-4f5f-4373-ac13-ebf6a943b9a6")
    void setModel(Signal value);

    @objid ("39eac63e-80a5-4f26-8281-d842ef4ba981")
    EList<State> getOrigin();

    @objid ("35c62acb-20be-4f35-bf7d-0c1b92a9f42f")
    <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass);

    @objid ("3c52d63c-7dc4-4600-8da1-b65ae50477cc")
    Operation getCalled();

    @objid ("0f7f8c08-4178-412f-94ea-ac4e0989b813")
    void setCalled(Operation value);

    @objid ("b429c9cd-10f9-40c9-85c0-0a5176d806bb")
    Behavior getComposed();

    @objid ("1978976f-bfab-4edb-be45-a3a6d2cd10c8")
    void setComposed(Behavior value);

}
