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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;

@objid ("00444a76-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionOccurenceSpecification extends MessageEnd {
    @objid ("c4e063b4-bb59-4476-8f77-2b55d2de8e11")
    ExecutionSpecification getFinished();

    @objid ("1480c6a2-04e5-4af0-8191-e68818c9a3a3")
    void setFinished(ExecutionSpecification value);

    @objid ("2d77c27e-4f8f-4ddb-b6f0-5357749cd41c")
    ExecutionSpecification getStarted();

    @objid ("9a599a97-0346-4b68-adbf-99fabdef6118")
    void setStarted(ExecutionSpecification value);

}
