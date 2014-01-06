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
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;

@objid ("00726262-ec87-1098-b22e-001ec947cd2a")
public interface PropertyEnumerationLitteral extends ModelElement {
    /**
     * Compare 'this' literal with 'v' based on the ordering of the literals in
     * the EnumeratedPropertyType owning 'this' literal.
     * If 'l' does not belong to 'this' owner, the method returns -1 (meaning l < this by convention)
     * @param l @return
     */
    @objid ("3f7c4c9d-6307-4688-9ae7-6d02f373cc0f")
    int compareTo(PropertyEnumerationLitteral l);

    @objid ("48790a9b-1ad6-4109-a863-424bb9860a18")
    EnumeratedPropertyType getOwner();

    @objid ("56898cb8-487b-40d0-b048-808f77b2374a")
    void setOwner(EnumeratedPropertyType value);

}
