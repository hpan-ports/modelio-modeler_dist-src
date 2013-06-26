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
    @objid ("8b756a13-92fc-4972-b56d-e177ca17017b")
    EList<NaryLink> getOccurence();

    @objid ("2ed43a80-def4-4806-9988-ce05ff086055")
    <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("e4b46af1-b718-4cf6-9d55-2ca8ac3c288b")
    EList<NaryAssociationEnd> getNaryEnd();

    @objid ("3a60810a-c7bf-45c2-80b8-78f394c28296")
    <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass);

    @objid ("7cef070c-ea0e-482f-aaa2-5c629236bbea")
    ClassAssociation getLinkToClass();

    @objid ("e304c58a-ef54-4916-b6b6-99b43f3d52dc")
    void setLinkToClass(ClassAssociation value);

}
