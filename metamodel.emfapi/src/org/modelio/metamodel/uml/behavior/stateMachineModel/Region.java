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
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Region v0.0.9054
 */
@objid ("0056e10e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Region extends ModelElement {
    @objid ("7c7db1f5-af16-40cb-959e-4559e678955b")
    public static final String MNAME = "Region";

    /**
     * Getter for relation 'Region->Parent'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("7a994160-5464-4749-9909-511b6e52a81b")
    State getParent();

    /**
     * Setter for relation 'Region->Parent'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("3d7edbd9-2e76-4260-bc34-1929a293bbf3")
    void setParent(State value);

    /**
     * Getter for relation 'Region->Represented'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("fbe52355-675e-4368-a06d-4073a33bf57d")
    StateMachine getRepresented();

    /**
     * Setter for relation 'Region->Represented'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("a380bce6-5ae6-486f-bc45-ce4811dab02b")
    void setRepresented(StateMachine value);

    /**
     * Getter for relation 'Region->Sub'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("8ec7d81f-1469-4c7b-a970-d5c2be215e2b")
    EList<StateVertex> getSub();

    /**
     * Filtered Getter for relation 'Region->Sub'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("21728a7b-469b-4bf1-860f-b63eb9e92e44")
    <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass);

}
