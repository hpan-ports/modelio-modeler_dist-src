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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;

@objid ("008dd736-c4be-1fd8-97fe-001ec947cd2a")
public interface Substitution extends ModelElement {
    @objid ("27a38e2f-cd9f-4505-b349-1be8c418eb08")
    Classifier getContract();

    @objid ("37d8a18e-a44c-4c9e-89d6-49dcd2cdfd4b")
    void setContract(Classifier value);

    @objid ("d48ea88f-1549-48c1-a0cf-f7cda1f2a6ab")
    Classifier getSubstitutingClassifier();

    @objid ("fd9025c2-4359-4a85-a517-8521309f723a")
    void setSubstitutingClassifier(Classifier value);

}
