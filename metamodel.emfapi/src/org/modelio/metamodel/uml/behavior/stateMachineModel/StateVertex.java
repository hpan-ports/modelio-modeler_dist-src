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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * StateVertex v0.0.9054
 * 
 * 
 * A StateVertex can be either a State, or a PseudoState that is only a graphical convention. A StateVertex belongs to a State, or to a StateMachine if it is a root State.
 */
@objid ("0054944e-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateVertex extends ModelElement {
    @objid ("e313fcea-74e4-4959-b54f-d001eadfb0e8")
    public static final String MNAME = "StateVertex";

    /**
     * Getter for relation 'StateVertex->OutGoing'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions departing from the StateVertex.</i>
     */
    @objid ("70228d07-d9b5-432b-a3df-b23e82abb0f9")
    EList<Transition> getOutGoing();

    /**
     * Filtered Getter for relation 'StateVertex->OutGoing'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions departing from the StateVertex.</i>
     */
    @objid ("61c28970-ecde-41e5-9221-e0c81272327a")
    <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'StateVertex->Incoming'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions entering the StateVertex.</i>
     */
    @objid ("52284568-f946-4123-ac6e-8f66cb8a1099")
    EList<Transition> getIncoming();

    /**
     * Filtered Getter for relation 'StateVertex->Incoming'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions entering the StateVertex.</i>
     */
    @objid ("e002a9bc-7542-482b-9aad-695446ae18fc")
    <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'StateVertex->Parent'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("3d172dcb-ad10-41bd-81b8-8bc58e4e0cc7")
    Region getParent();

    /**
     * Setter for relation 'StateVertex->Parent'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("cb6ce9ea-16cf-4692-a8ff-104517a09a1e")
    void setParent(Region value);

}
