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
    @objid ("5ff883c8-95d4-4f5d-b1a5-7a627476d4e3")
    NaryAssociation getNaryAssociationPart();

    @objid ("81044038-3940-4c1a-b3ae-831f6b67546d")
    void setNaryAssociationPart(NaryAssociation value);

    @objid ("3cb78b23-7765-45c3-b39f-04a841ea2667")
    Class getClassPart();

    @objid ("d2dd283f-b030-4ea0-bf61-e72c66ae5adf")
    void setClassPart(Class value);

    @objid ("e0ef7207-86f8-434f-8d4f-2fca4238fbb5")
    Association getAssociationPart();

    @objid ("4b0507ec-f0e3-480d-a8ab-f508740c7f6b")
    void setAssociationPart(Association value);

}
