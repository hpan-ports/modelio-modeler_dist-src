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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Term;

@objid ("005b9e06-c4bf-1fd8-97fe-001ec947cd2a")
public interface Dictionary extends AnalystContainer {
    @objid ("2c8f8887-dcda-4cb8-bcd0-0483af48a8aa")
    EList<Dictionary> getOwnedDictionary();

    @objid ("024f94a9-5a3c-4c87-b627-39f8abeb4b7e")
    <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass);

    @objid ("2cc90112-2a72-41aa-b5dd-e8b7719b6e1a")
    Dictionary getOwnerDictionary();

    @objid ("09e4e082-ab9b-42c1-be65-f65cefdecee7")
    void setOwnerDictionary(Dictionary value);

    @objid ("2c187960-509c-4c48-b64d-e775c0a80c80")
    AnalystProject getOwnerProject();

    @objid ("023a5042-3e51-4078-9d8e-466bdbf4e1f9")
    void setOwnerProject(AnalystProject value);

    @objid ("d6d5c223-3563-4d29-a398-c372376f80e5")
    EList<Term> getOwnedTerm();

    @objid ("e8fedad8-ede4-40c5-b9f0-4660ae9e2074")
    <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass);

}
