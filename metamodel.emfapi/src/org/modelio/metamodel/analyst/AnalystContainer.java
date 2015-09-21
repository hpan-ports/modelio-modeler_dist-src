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
package org.modelio.metamodel.analyst;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * AnalystContainer v0.0.9054
 * 
 * 
 * Analyst items container.
 * 
 * A container may own analyst items or other containers.
 * Sub classes defined the type of elements that can be contained.
 */
@objid ("ab5073a9-7f23-42b1-9d77-89466faff34e")
public interface AnalystContainer extends AnalystItem {
    @objid ("9568d918-bb86-4f77-bc72-016ca1402121")
    public static final String MNAME = "AnalystContainer";

}
