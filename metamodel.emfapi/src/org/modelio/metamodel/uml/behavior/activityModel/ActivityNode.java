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
    @objid ("2f6704be-4451-44af-95b9-603c8550df63")
    Activity getOwner();

    @objid ("5738f18c-8089-4060-8e2c-6397aaae7a0e")
    void setOwner(Activity value);

    @objid ("de7910c4-df47-437c-9132-29dcc9b480b9")
    ActivityPartition getOwnerPartition();

    @objid ("984f2448-34f9-463d-ae26-01b89f92eaf0")
    void setOwnerPartition(ActivityPartition value);

    @objid ("82e891f1-530e-4ea0-a3a6-02fd792490c3")
    EList<ActivityEdge> getIncoming();

    @objid ("dcd7ce46-4250-4e48-9021-697d5f8c3920")
    <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("75f4a202-e5c3-4a59-97f7-be2352327b29")
    Clause getOwnerClause();

    @objid ("be4a3834-0716-41a0-971b-b624d8b5abe4")
    void setOwnerClause(Clause value);

    @objid ("d07a37a5-7805-4cfc-b559-e36bb28b9590")
    StructuredActivityNode getOwnerNode();

    @objid ("2317d490-1cc6-41fe-aec6-9828e1f7f332")
    void setOwnerNode(StructuredActivityNode value);

    @objid ("197de66f-1df0-48c4-beaf-77d7a34bff15")
    EList<ActivityEdge> getOutgoing();

    @objid ("fe4a2cf7-2e00-4631-b3ff-a7c18be0c32e")
    <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass);

}
