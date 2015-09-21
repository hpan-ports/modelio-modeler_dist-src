/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * ActivityGroup v0.0.9054
 * 
 * 
 * Nodes and edges can belong to more than one group. They have no inherent semantics and can be used for various purposes. Subclasses of ActivityGroup may add semantics.
 * 
 * ActivityGroups belong to an activity or (exclusively) to another ActivityGroup.
 */
@objid ("002813ba-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityGroup extends ModelElement {
    @objid ("7d125032-b482-4741-90bf-d701bfa14c0f")
    public static final String MNAME = "ActivityGroup";

    /**
     * Getter for relation 'ActivityGroup->InActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("75695d24-0a5c-45c0-9a69-ce7c46af6aa7")
    Activity getInActivity();

    /**
     * Setter for relation 'ActivityGroup->InActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a7f370ec-7b8e-41ea-9b35-456b45e84639")
    void setInActivity(Activity value);

}
