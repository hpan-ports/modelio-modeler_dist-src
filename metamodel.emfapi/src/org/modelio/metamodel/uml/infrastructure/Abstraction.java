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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Abstraction v0.0.9054
 * 
 * 
 * An Abstraction is a relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints. 
 * 
 * An Abstraction is a Dependency in which the supplier and the client are mapped.
 */
@objid ("00849680-c4be-1fd8-97fe-001ec947cd2a")
public interface Abstraction extends Dependency {
    @objid ("233d7987-e7c2-4011-b063-e04baaab262d")
    public static final String MNAME = "Abstraction";

    /**
     * Getter for attribute 'Abstraction.Mapping'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("109d96c3-93f4-4de5-badb-b2036591e393")
    String getMapping();

    /**
     * Setter for attribute 'Abstraction.Mapping'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("677f1bcf-6daf-406f-bff2-d80a03ebce11")
    void setMapping(String value);

}
