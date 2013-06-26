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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;

@objid ("008dd736-c4be-1fd8-97fe-001ec947cd2a")
public interface Substitution extends ModelElement {
    @objid ("e3999d8b-23bd-47ce-9c74-478c7a3a113f")
    Classifier getContract();

    @objid ("138bb5be-d300-4458-9745-1b203fa1804b")
    void setContract(Classifier value);

    @objid ("2a9eb17a-2de3-4c55-8ef5-92703030e046")
    Classifier getSubstitutingClassifier();

    @objid ("1f57637e-629a-4e3e-8301-2a67954d983e")
    void setSubstitutingClassifier(Classifier value);

}
