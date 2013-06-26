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
    @objid ("3baa0a23-8034-44d0-a8f5-144cfc0256f8")
    Activity getOwner();

    @objid ("f84675a7-a45a-4ef0-81d7-bc03220c6491")
    void setOwner(Activity value);

    @objid ("6de1dd3f-eb1e-4f3b-9590-100f36f6cecd")
    ActivityPartition getOwnerPartition();

    @objid ("6dd5cf43-cd99-4d08-8ebf-eed78301184c")
    void setOwnerPartition(ActivityPartition value);

    @objid ("b7680d20-0460-4434-8852-1a852af4250c")
    EList<ActivityEdge> getIncoming();

    @objid ("acd9efaa-9521-4e37-b839-79bf79f66e8e")
    <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("03870bbd-6749-4a2b-b72a-f62662aa750b")
    Clause getOwnerClause();

    @objid ("7eb94d3e-b7b7-4982-8b66-838c74a25ed3")
    void setOwnerClause(Clause value);

    @objid ("3e89a4a9-32fe-469b-88a9-77788900f982")
    StructuredActivityNode getOwnerNode();

    @objid ("f147d6d5-6a0c-4cc7-acff-aca33cec3f0e")
    void setOwnerNode(StructuredActivityNode value);

    @objid ("604a965f-8779-4b5e-b88f-7cecf97f0f48")
    EList<ActivityEdge> getOutgoing();

    @objid ("483aec2d-76d2-4697-9823-cb8499441ae5")
    <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass);

}
