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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0028adde-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityNode extends ModelElement {
    @objid ("bd65a7b9-8ed6-4799-ae24-3a92a357dbce")
    Activity getOwner();

    @objid ("1138bded-6792-4319-8023-fbcd4081a69f")
    void setOwner(Activity value);

    @objid ("25b43b79-1f02-4139-9249-7428711fd5f8")
    ActivityPartition getOwnerPartition();

    @objid ("f07fdd2b-fde6-4470-8992-93dc5a8f2f06")
    void setOwnerPartition(ActivityPartition value);

    @objid ("2d77bae7-2e4c-4c1f-858b-15b425cdee84")
    EList<ActivityEdge> getIncoming();

    @objid ("2079c228-9eda-41e1-8bf0-50e1e866f042")
    <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("2394d670-0390-4825-8020-0487dd690323")
    Clause getOwnerClause();

    @objid ("ba9173c6-1b6f-464d-8460-34777eeff918")
    void setOwnerClause(Clause value);

    @objid ("ee6995fa-d89a-4ea1-bdff-b54a3c0128c7")
    StructuredActivityNode getOwnerNode();

    @objid ("263d7de2-6ab3-4024-8544-bc23082f9a23")
    void setOwnerNode(StructuredActivityNode value);

    @objid ("9e686443-a85c-4580-870b-899f60d31274")
    EList<ActivityEdge> getOutgoing();

    @objid ("1e96f3fe-fe2b-4d15-8475-6b858404e69a")
    <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass);

}
