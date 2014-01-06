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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;

@objid ("008dd736-c4be-1fd8-97fe-001ec947cd2a")
public interface Substitution extends ModelElement {
    @objid ("86605587-1b87-4705-8b90-e3608dc510e0")
    Classifier getContract();

    @objid ("77ec61e7-9571-448f-a3bd-6dcd89f832e4")
    void setContract(Classifier value);

    @objid ("a40dd91c-58d5-4b17-9841-cf8be0d1667d")
    Classifier getSubstitutingClassifier();

    @objid ("751e3cec-01a9-4975-92c1-0364ca0f67a5")
    void setSubstitutingClassifier(Classifier value);

}
