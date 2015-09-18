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
package org.modelio.metamodel.uml.behavior.interactionModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;

@objid ("0044c988-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionSpecification extends InteractionFragment {
    @objid ("3928411b-1e6a-422c-8497-51f91ef18dbe")
    ExecutionOccurenceSpecification getFinish();

    @objid ("123331fe-5337-4373-8a71-d444a102840e")
    void setFinish(ExecutionOccurenceSpecification value);

    @objid ("d08b1f53-a281-40e7-8421-98e8efc6ce0b")
    ExecutionOccurenceSpecification getStart();

    @objid ("7f862efd-5606-409b-80c8-67bd1e7d75c1")
    void setStart(ExecutionOccurenceSpecification value);

}
