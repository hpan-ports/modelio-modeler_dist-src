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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("002cb618-c4bf-1fd8-97fe-001ec947cd2a")
public interface Clause extends ModelElement {
    @objid ("86e6e63d-dfec-4274-8f64-4a5eb14df70d")
    String getTest();

    @objid ("db5396fe-f67e-4650-9908-8bdfc9b65d0b")
    void setTest(String value);

    @objid ("97c59cf5-2e8a-44db-a1ea-1a0d15f72fa5")
    EList<ActivityNode> getBody();

    @objid ("100f3fab-bb71-42ea-bef0-e5ee0462dfda")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

    @objid ("4f876f58-af29-439e-8644-4cb3861fb5f0")
    ConditionalNode getOwner();

    @objid ("f00e6909-7551-4b04-9ea1-a0c7ca6b2f65")
    void setOwner(ConditionalNode value);

}
