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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;

@objid ("002fbdcc-c4bf-1fd8-97fe-001ec947cd2a")
public interface DecisionMergeNode extends ControlNode {
    @objid ("305b3e10-7768-4c8c-a19a-c66c9a322d93")
    DecisionNodeKind getDecisionKind();

    @objid ("4894da3b-43b9-444a-980d-7ab769aec3aa")
    void setDecisionKind(DecisionNodeKind value);

    @objid ("71f091bd-5561-47da-b502-58a8f04ed760")
    String getDecisionInputBehavior();

    @objid ("e7ed0165-b4e5-47a2-812f-18968938ac45")
    void setDecisionInputBehavior(String value);

}
