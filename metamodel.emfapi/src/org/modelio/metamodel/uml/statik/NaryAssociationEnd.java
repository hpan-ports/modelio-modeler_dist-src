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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;

@objid ("00209ca2-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryAssociationEnd extends StructuralFeature {
    @objid ("9cfa36ce-4417-4e3d-95ef-af43b4079185")
    NaryAssociation getNaryAssociation();

    @objid ("000dc38d-5582-43f0-a11b-8f7afa21a4dc")
    void setNaryAssociation(NaryAssociation value);

    @objid ("e0809f2f-a974-41bc-bb76-9e19cb914611")
    Classifier getOwner();

    @objid ("4e206572-593f-4b81-95bb-99212777ba98")
    void setOwner(Classifier value);

}
