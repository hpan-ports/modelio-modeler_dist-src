/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Connector v0.0.9054
 * 
 * 
 * A Connector specifies a Link that enables communication between two or more instances. This Link represents the possibility of the instances being able to communicate, because their identities are known by virtue of being passed as parameters, held in variables or slots, or because the communicating instances are the same instance. The Link may be realized by something as simple as a pointer or by something as complex as a network connection. 
 * 
 * In contrast to Associations, which specify Links between any instance of the associated Classifiers, Connectors specify Links between instances playing the connected parts only.
 * 
 * In Modelio, a Connector is a Link and can be bound to another element.
 */
@objid ("cd9b2759-1983-42c6-8227-b8e657f3c577")
public interface Connector extends Link {
    @objid ("b326246b-db46-4b22-a76a-5e8a9aff7114")
    public static final String MNAME = "Connector";

}
