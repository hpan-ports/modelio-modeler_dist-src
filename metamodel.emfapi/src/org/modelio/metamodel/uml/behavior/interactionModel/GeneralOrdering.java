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
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.infrastructure.Element;

@objid ("0045de18-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralOrdering extends Element {
    @objid ("1950a588-f9c7-4a1e-99a2-352decb5fa49")
    OccurrenceSpecification getBefore();

    @objid ("8e80febe-3c10-4378-83e8-1fc5cd191508")
    void setBefore(OccurrenceSpecification value);

    @objid ("fd9030b4-3af0-4f9c-824a-61d73cd5f263")
    OccurrenceSpecification getAfter();

    @objid ("4f386118-680b-42d0-9944-eacfc657e9f0")
    void setAfter(OccurrenceSpecification value);

}
