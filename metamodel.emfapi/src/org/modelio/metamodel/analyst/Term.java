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
import org.modelio.metamodel.analyst.Dictionary;

@objid ("006241a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Term extends AnalystElement {
    @objid ("428876b9-80e9-419c-b550-8faaf7c9b699")
    Dictionary getOwnerDictionary();

    @objid ("9c10fc7e-b531-42e4-83bb-fad20eef2853")
    void setOwnerDictionary(Dictionary value);

    @objid ("48022ebc-5f44-4cb5-b392-d4a200b30560")
    EList<Term> getArchivedTermVersion();

    @objid ("9a05d627-acb4-4893-95bd-8db34b9c3aad")
    <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass);

    @objid ("32979674-1382-4257-a9c1-d73756870a77")
    Term getLastTermVersion();

    @objid ("0e3e4589-75ed-4013-aed4-307576cd27ad")
    void setLastTermVersion(Term value);

}
