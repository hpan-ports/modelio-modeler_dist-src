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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NaryAssociation;

@objid ("0002bc78-c4bf-1fd8-97fe-001ec947cd2a")
public interface ClassAssociation extends ModelElement {
    @objid ("95f96104-c5c9-4bac-ac22-8d74989f99a4")
    NaryAssociation getNaryAssociationPart();

    @objid ("f3514d7f-2375-44c0-bf28-94b999d87bdb")
    void setNaryAssociationPart(NaryAssociation value);

    @objid ("7955b1dc-7c6c-4ba1-8adf-bee374dff7b5")
    Class getClassPart();

    @objid ("c5bd6def-03ef-45d8-8e4f-0aef29aff380")
    void setClassPart(Class value);

    @objid ("5bb325dd-3a55-4e6e-a78f-43592197a86a")
    Association getAssociationPart();

    @objid ("4ab4105f-01a6-4d47-8335-bf0d86823a4a")
    void setAssociationPart(Association value);

}
