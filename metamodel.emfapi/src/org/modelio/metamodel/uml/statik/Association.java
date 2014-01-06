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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;

@objid ("28f7c9fd-bee9-46f0-8969-5c46572cec86")
public interface Association extends ModelElement {
    @objid ("9ffc308c-273a-45ce-8fe6-4ccab66938e1")
    EList<Link> getOccurence();

    @objid ("38a58d70-df94-43e6-96dc-fba351aae23c")
    <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("9bc40667-1d39-49b4-9bc8-5c5ac516c635")
    EList<AssociationEnd> getEnd();

    @objid ("44ffd75b-c8c6-49a8-913e-f0ac04a1a8c4")
    <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass);

    @objid ("f2770500-ff67-4e2a-b8f9-b312a10370b7")
    ClassAssociation getLinkToClass();

    @objid ("dcfbcdaf-6e7b-4986-9b88-e1d07eea405d")
    void setLinkToClass(ClassAssociation value);

}
