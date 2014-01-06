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
    @objid ("bfe5187e-b061-475f-8e4e-59e26fee3ede")
    String getExpression();

    @objid ("557edc4e-b6a4-4c8a-aa5c-8995a9ffa6cd")
    void setExpression(String value);

    @objid ("df52e0c4-4213-4d1a-bd7a-c421bc963181")
    EventType getKind();

    @objid ("4bc7e9b7-d4dc-4cfa-87a9-3295b816dab5")
    void setKind(EventType value);

    @objid ("fe5b5f43-57ff-4550-b58b-c1cbc202e745")
    EList<Transition> getTriggered();

    @objid ("cd7f31f1-46fc-4959-9697-87c2d949e109")
    <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass);

    @objid ("fd0547b1-f527-44f0-a318-10ff1db39969")
    Signal getModel();

    @objid ("b2ace027-4c75-4272-9103-4079881c7938")
    void setModel(Signal value);

    @objid ("3b646f4a-30a6-4c59-9a32-d472e01fe7c7")
    EList<State> getOrigin();

    @objid ("794faf42-ab23-40b3-bb75-8a1dce43741b")
    <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass);

    @objid ("e576f0fb-4264-4eb2-86fa-974131fbc318")
    Operation getCalled();

    @objid ("bc45cff8-3998-4707-9290-b1a0c4347fe7")
    void setCalled(Operation value);

    @objid ("3a008de5-a2ea-4d58-ba30-c30c057f0559")
    Behavior getComposed();

    @objid ("62eaf527-5442-4908-9319-1af3642ecafc")
    void setComposed(Behavior value);

}
