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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("002cb618-c4bf-1fd8-97fe-001ec947cd2a")
public interface Clause extends ModelElement {
    @objid ("d3c2c16d-161c-49d9-86c9-1889ae3458c2")
    String getTest();

    @objid ("2a2cfa2a-f82e-473c-b184-bb13a84253ff")
    void setTest(String value);

    @objid ("45e780fe-7a99-4573-985d-930a6428a13b")
    EList<ActivityNode> getBody();

    @objid ("8951cf32-0cb6-4f86-bdd0-c5602620b8f0")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

    @objid ("aed7a10d-feef-4016-9b6b-14b41e133b4f")
    ConditionalNode getOwner();

    @objid ("6a666a0e-4079-466e-9e27-02fbac5ff4ef")
    void setOwner(ConditionalNode value);

}
