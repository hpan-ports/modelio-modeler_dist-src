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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;

@objid ("004683fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interaction extends Behavior {
    @objid ("41508569-e510-4147-9ab3-be6b12b2d217")
    EList<Gate> getFormalGate();

    @objid ("539923ff-b949-4824-9306-7d534f027655")
    <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass);

    @objid ("27e13eeb-f93b-4ef3-b0a8-ddc02294aabf")
    EList<InteractionFragment> getFragment();

    @objid ("c8a7d2a4-8dd0-4740-9e3a-931011f7852c")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("f29e6166-05cb-4677-a3fc-b65657c7df50")
    EList<Lifeline> getOwnedLine();

    @objid ("196f9ce8-7c50-4972-937a-8a917eaf6000")
    <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass);

    @objid ("fd285f5b-b881-467a-ad20-dcb834420303")
    EList<InteractionUse> getReferedUse();

    @objid ("ffb5c567-6bf7-4a12-9556-3046c1517929")
    <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass);

}
