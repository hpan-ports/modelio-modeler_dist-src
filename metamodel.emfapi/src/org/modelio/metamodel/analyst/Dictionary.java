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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Term;

@objid ("005b9e06-c4bf-1fd8-97fe-001ec947cd2a")
public interface Dictionary extends AnalystContainer {
    @objid ("8d42fe20-5a5e-45b9-bd91-2a5d1f270021")
    EList<Dictionary> getOwnedDictionary();

    @objid ("a5b1be60-6882-4c4a-a13d-bf28b9f5ac25")
    <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass);

    @objid ("a89cdf6f-e664-47e8-b445-8d2843235245")
    Dictionary getOwnerDictionary();

    @objid ("828df68a-e4cb-45c3-a84a-33153a272189")
    void setOwnerDictionary(Dictionary value);

    @objid ("6c0acf92-f35f-49d9-8aff-736b780bf9ea")
    AnalystProject getOwnerProject();

    @objid ("4099bc71-64e1-4adf-898a-bd411e376050")
    void setOwnerProject(AnalystProject value);

    @objid ("54757e6f-13a8-4cb2-85fd-255bf5462414")
    EList<Term> getOwnedTerm();

    @objid ("df7027a7-61c7-43b0-bee0-c46e7f34a77e")
    <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass);

}
