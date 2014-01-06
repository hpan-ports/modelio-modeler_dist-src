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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("004119be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BehaviorParameter extends Parameter {
    @objid ("20172ce8-f91f-4fb5-92c9-60faeeefca0c")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("f7e18cd1-ccdf-4124-a8b9-d4577845d4c9")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("ac204dc6-dd9b-49f4-a0c4-0473892c4916")
    Behavior getOwner();

    @objid ("e0a6a238-82db-40b7-8bb4-10496d451391")
    void setOwner(Behavior value);

    @objid ("ee9eb44f-3fa2-4947-b85a-0efc8d5cc5a0")
    Parameter getMapped();

    @objid ("1cb21758-34f2-4127-a5c1-72e65cd4f2ef")
    void setMapped(Parameter value);

}
