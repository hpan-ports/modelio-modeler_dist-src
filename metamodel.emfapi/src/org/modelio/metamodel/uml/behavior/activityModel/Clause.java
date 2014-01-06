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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("002cb618-c4bf-1fd8-97fe-001ec947cd2a")
public interface Clause extends ModelElement {
    @objid ("6682a0e8-5409-4ab3-a90c-74dc0cd27f3f")
    String getTest();

    @objid ("c39e9836-e41c-4157-ac18-d409703586ae")
    void setTest(String value);

    @objid ("f131a021-b8d5-46cf-86fa-261c25751dc8")
    EList<ActivityNode> getBody();

    @objid ("c712c3ea-5d71-49fe-a46d-6bbbd6ad4e18")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

    @objid ("ef27c542-f932-4bfb-baa2-fe638d27b8de")
    ConditionalNode getOwner();

    @objid ("8be9b752-a86d-41c1-8482-3d769f74b65d")
    void setOwner(ConditionalNode value);

}
