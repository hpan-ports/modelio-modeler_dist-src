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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryLink;

@objid ("0021601a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryAssociation extends ModelElement {
    @objid ("c7b52dfe-61f1-49f1-94ab-23499c96f0b1")
    EList<NaryLink> getOccurence();

    @objid ("3290cb14-f0b7-4241-b51e-145fca16a26e")
    <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("d932436f-f425-4082-ade6-88547f08753c")
    EList<NaryAssociationEnd> getNaryEnd();

    @objid ("7219fb07-741d-4296-acb0-091879e1daf2")
    <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass);

    @objid ("066c933a-c598-41c7-85e2-e916be2b2034")
    ClassAssociation getLinkToClass();

    @objid ("837a400e-3edc-48df-9739-23ab8ab9c2c6")
    void setLinkToClass(ClassAssociation value);

}
