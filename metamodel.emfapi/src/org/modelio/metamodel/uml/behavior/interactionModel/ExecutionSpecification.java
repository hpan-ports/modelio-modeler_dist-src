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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;

@objid ("0044c988-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionSpecification extends InteractionFragment {
    @objid ("c09f63d3-31fb-413a-b727-dcaa00e19c71")
    ExecutionOccurenceSpecification getFinish();

    @objid ("a6a5ad2d-4bd0-4970-ad43-6e05e670bd6b")
    void setFinish(ExecutionOccurenceSpecification value);

    @objid ("5c10c0f5-dd12-4425-807c-0f96093a6bbf")
    ExecutionOccurenceSpecification getStart();

    @objid ("586f9b9c-7539-4ff8-a2f5-93a45b33c7be")
    void setStart(ExecutionOccurenceSpecification value);

}
