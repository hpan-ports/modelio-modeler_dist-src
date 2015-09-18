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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("004119be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BehaviorParameter extends Parameter {
    @objid ("49eed845-f22c-4ff0-abef-babcb9301993")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("33a77d4f-f00a-42ee-9fec-e923c994ab8f")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("a601bed9-c2ea-45c0-8ca0-d8f1601fac7f")
    Behavior getOwner();

    @objid ("8bcac82b-4628-4f53-b459-391e239ed9e9")
    void setOwner(Behavior value);

    @objid ("4bac1b35-88a7-4978-bd2f-d7f086a51beb")
    Parameter getMapped();

    @objid ("ce36bd88-6b94-43dc-86f9-f6cc693244ca")
    void setMapped(Parameter value);

}
