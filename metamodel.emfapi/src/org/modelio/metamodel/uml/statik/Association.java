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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;

@objid ("28f7c9fd-bee9-46f0-8969-5c46572cec86")
public interface Association extends ModelElement {
    @objid ("9a48cd48-d5de-4b1e-9287-867d4d828e95")
    EList<Link> getOccurence();

    @objid ("9ebae686-4bee-4b74-8b44-7f1685cc76a8")
    <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("c1178f91-da21-49d1-8eee-5308d2759ba3")
    EList<AssociationEnd> getEnd();

    @objid ("007d4fa9-fec9-4ebb-9cef-a9f3b099857b")
    <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass);

    @objid ("c2b3c04f-e029-47ef-a888-de5a964b0e9e")
    ClassAssociation getLinkToClass();

    @objid ("522c8e82-34f3-4649-949e-4afb6db7cb45")
    void setLinkToClass(ClassAssociation value);

}
