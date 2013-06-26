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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("004119be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BehaviorParameter extends Parameter {
    @objid ("41a3bb24-5abd-4e45-b2ab-bce2fdcf33aa")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("507aa2df-7332-41dc-8fa0-f8ff268940a1")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("d8883b6b-802e-4477-b0e7-e4d35587dc0a")
    Behavior getOwner();

    @objid ("6d31de79-fcc4-4172-ab7d-323aacbf23bc")
    void setOwner(Behavior value);

    @objid ("1940b1c3-ea30-4be0-9a3e-464bb36d5189")
    Parameter getMapped();

    @objid ("dfa7c275-d250-4553-875b-d498a71c0b42")
    void setMapped(Parameter value);

}
