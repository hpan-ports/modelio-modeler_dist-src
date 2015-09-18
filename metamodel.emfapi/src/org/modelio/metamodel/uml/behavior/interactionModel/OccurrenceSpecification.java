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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;

@objid ("004a586c-c4bf-1fd8-97fe-001ec947cd2a")
public interface OccurrenceSpecification extends InteractionFragment {
    @objid ("4c97e03f-03b1-470f-ba85-625d09d6512d")
    EList<GeneralOrdering> getToAfter();

    @objid ("519e1c41-fad0-4d83-9c4e-7e75ec1bc99c")
    <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass);

    @objid ("37b3ed18-6694-4174-9c15-7efbf75a17ff")
    EList<GeneralOrdering> getToBefore();

    @objid ("2bea7595-ef2c-4342-b31d-8658b5d88363")
    <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass);

}
