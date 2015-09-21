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
import org.modelio.metamodel.uml.infrastructure.Abstraction;

/**
 * ElementRealization v0.0.9054
 * 
 * 
 * An ElementRealization is a specialized Abstraction between two ModelElements. One of the related ModelElements represents a specification (the supplier) and the other an implementation of the client. 
 * 
 * An ElementRealization can be used to model stepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, and so on.  An ElementRealization signifies that the client set of elements is an implementation of the supplier set, which serves as the specification. The meaning of implementation is not strictly defined, but rather implies a more refined or elaborate form with respect to a certain modeling context. It is possible to specify mapping between the specification and implementation elements, although it is not necessarily computable. 
 */
@objid ("0008c258-c4bf-1fd8-97fe-001ec947cd2a")
public interface ElementRealization extends Abstraction {
    @objid ("32190966-659c-4bb8-a771-ac9aede2316b")
    public static final String MNAME = "ElementRealization";

}
