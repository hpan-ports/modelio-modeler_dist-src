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
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;

/**
 * AnalystPropertyTable v0.0.9054
 * 
 * 
 * null
 */
@objid ("00899cf2-ec8f-1098-b22e-001ec947cd2a")
public interface AnalystPropertyTable extends TypedPropertyTable {
    @objid ("61abbeea-2a63-4176-8be0-ccdaaaa24019")
    public static final String MNAME = "AnalystPropertyTable";

    /**
     * Getter for relation 'AnalystPropertyTable->AnalystOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6a6f60ba-8c70-4bbf-8ef5-ca28059d1d4f")
    AnalystItem getAnalystOwner();

    /**
     * Setter for relation 'AnalystPropertyTable->AnalystOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ca25f561-ddac-42df-9a6b-5b26ec9113a8")
    void setAnalystOwner(AnalystItem value);

}
