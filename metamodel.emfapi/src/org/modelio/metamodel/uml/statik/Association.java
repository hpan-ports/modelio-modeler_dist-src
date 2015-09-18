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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;

@objid ("28f7c9fd-bee9-46f0-8969-5c46572cec86")
public interface Association extends ModelElement {
    @objid ("1eefd792-6aaa-446f-820c-bbf768db3e01")
    EList<Link> getOccurence();

    @objid ("22d6e5ab-c454-41df-ad0b-f0a0d6b7fc21")
    <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("f506f1e9-63e4-45a7-8b6a-cdd548e57695")
    EList<AssociationEnd> getEnd();

    @objid ("f965ab72-234b-4090-ac4d-4b7faee76226")
    <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass);

    @objid ("fd8aef4d-0709-48a0-a389-0b7a57cf6f25")
    ClassAssociation getLinkToClass();

    @objid ("fb330aef-3ecb-4cfc-9803-384fdfb01ca4")
    void setLinkToClass(ClassAssociation value);

}
