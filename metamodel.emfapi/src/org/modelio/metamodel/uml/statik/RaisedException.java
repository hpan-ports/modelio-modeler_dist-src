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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * RaisedException v0.0.9054
 */
@objid ("001a6e72-c4bf-1fd8-97fe-001ec947cd2a")
public interface RaisedException extends ModelElement {
    @objid ("66c2e650-c910-4f34-9924-30bd46aafcd1")
    public static final String MNAME = "RaisedException";

    /**
     * Getter for relation 'RaisedException->ThrownType'
     * 
     * Metamodel description:
     * <i>Raised exception type.</i>
     */
    @objid ("31766ebc-019f-4ccf-aead-b7002eab5849")
    Classifier getThrownType();

    /**
     * Setter for relation 'RaisedException->ThrownType'
     * 
     * Metamodel description:
     * <i>Raised exception type.</i>
     */
    @objid ("0c41699a-031b-4db8-9409-c6be2b88ad4c")
    void setThrownType(Classifier value);

    /**
     * Getter for relation 'RaisedException->Thrower'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("288edd49-5790-4a01-8548-041a5d04dcbb")
    Operation getThrower();

    /**
     * Setter for relation 'RaisedException->Thrower'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("08b7968f-29a1-4213-9cb4-d1d754c550b9")
    void setThrower(Operation value);

}
