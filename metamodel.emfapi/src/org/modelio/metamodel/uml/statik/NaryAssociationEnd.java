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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;

@objid ("00209ca2-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryAssociationEnd extends StructuralFeature {
    @objid ("8a38cde8-9c1d-4fb2-971a-c97cd0f8ce13")
    NaryAssociation getNaryAssociation();

    @objid ("5d3c1c52-d9f6-4563-bdca-fff98548472f")
    void setNaryAssociation(NaryAssociation value);

    @objid ("25dd7a6f-47c7-4cb4-8261-8cdebabc8de6")
    Classifier getOwner();

    @objid ("89306f2e-d5bb-4dc0-a2a5-6e2d9f472ff9")
    void setOwner(Classifier value);

}
