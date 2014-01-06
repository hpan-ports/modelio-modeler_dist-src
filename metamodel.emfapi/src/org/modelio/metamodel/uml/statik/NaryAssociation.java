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
    @objid ("daf3527e-a486-4f5f-b538-a0b5c218a611")
    EList<NaryLink> getOccurence();

    @objid ("6dc4360d-5207-44f8-8d98-9b237ee5a57c")
    <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("a08e736f-b15e-48ec-ac5b-0ba44116313c")
    EList<NaryAssociationEnd> getNaryEnd();

    @objid ("4e30c86d-e442-428d-9026-7bc77fb1b0fb")
    <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass);

    @objid ("8f464057-3801-406a-b567-3ad11318d6f6")
    ClassAssociation getLinkToClass();

    @objid ("5cb8ac95-656e-438e-b2b8-f6b12daba2a6")
    void setLinkToClass(ClassAssociation value);

}
