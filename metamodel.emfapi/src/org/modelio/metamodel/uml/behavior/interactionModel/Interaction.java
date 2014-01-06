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
    @objid ("8a47a386-5d9b-4a76-958b-8cda4f87860c")
    EList<Gate> getFormalGate();

    @objid ("ce33f86a-6899-42a4-a064-2a72ccf28865")
    <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass);

    @objid ("0b72628d-2e05-4598-b324-b7e589a7eac7")
    EList<InteractionFragment> getFragment();

    @objid ("5439c79a-2211-4ba7-bd72-3bd33e121db5")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("62125a98-5416-4699-8a8f-3d9abe0d34cd")
    EList<Lifeline> getOwnedLine();

    @objid ("0863c90d-08e6-4ed6-ac5e-950abd968057")
    <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass);

    @objid ("79d00918-c5c3-4349-92c9-977f964257b9")
    EList<InteractionUse> getReferedUse();

    @objid ("f975b06c-b2df-464c-bfc5-9357054595f7")
    <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass);

}
