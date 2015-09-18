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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Term;

@objid ("005b9e06-c4bf-1fd8-97fe-001ec947cd2a")
public interface Dictionary extends AnalystContainer {
    @objid ("49d95a3d-e498-45e1-bd25-73e6d955e5c2")
    EList<Dictionary> getOwnedDictionary();

    @objid ("0c18bb1c-f481-44b5-9481-c37a2b086481")
    <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass);

    @objid ("e6a3e40c-6362-401e-badb-d34ba340c65d")
    Dictionary getOwnerDictionary();

    @objid ("e7e45747-c32c-4e9e-9d7c-0c60b883575f")
    void setOwnerDictionary(Dictionary value);

    @objid ("12173e5d-fbf7-4bd9-9213-2a705bed4a85")
    AnalystProject getOwnerProject();

    @objid ("e7903638-9f5a-4017-967a-04cfde41c019")
    void setOwnerProject(AnalystProject value);

    @objid ("73c511be-4ec4-4632-9c23-d71a45ad677f")
    EList<Term> getOwnedTerm();

    @objid ("2b8da143-7d0a-4fb4-85f5-6551fa51314e")
    <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass);

}
