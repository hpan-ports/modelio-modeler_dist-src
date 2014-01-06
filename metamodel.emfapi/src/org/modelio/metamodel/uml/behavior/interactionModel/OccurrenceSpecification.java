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
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;

@objid ("004a586c-c4bf-1fd8-97fe-001ec947cd2a")
public interface OccurrenceSpecification extends InteractionFragment {
    @objid ("408f752f-f424-4d7a-8b64-0597d0b5a9a9")
    EList<GeneralOrdering> getToAfter();

    @objid ("aa2afc3c-eedf-4c4d-ba9c-0a517e4748de")
    <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass);

    @objid ("bc07c4ef-f638-426b-8385-b12d815f9002")
    EList<GeneralOrdering> getToBefore();

    @objid ("8da80f27-3068-4578-92eb-b99a858a8de7")
    <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass);

}
