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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;

@objid ("002fbdcc-c4bf-1fd8-97fe-001ec947cd2a")
public interface DecisionMergeNode extends ControlNode {
    @objid ("08f5f437-5fd4-4966-a580-2d1821e23682")
    DecisionNodeKind getDecisionKind();

    @objid ("5167e6aa-4eb8-4281-b64a-455f34677957")
    void setDecisionKind(DecisionNodeKind value);

    @objid ("d6bb5ee5-e07c-4871-bd41-1a1bca7e7a74")
    String getDecisionInputBehavior();

    @objid ("483bc8fb-6622-484b-8413-2df20a7a751f")
    void setDecisionInputBehavior(String value);

}
