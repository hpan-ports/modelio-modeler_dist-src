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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0086e58e-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ElementData extends SmObjectData {
    @objid ("1be9dc4f-81a9-4867-b7ee-76d6ef500746")
     List<SmObjectImpl> mDiagramElement = null;

    @objid ("f29260b2-1207-47d3-a1f4-9e83f64407c4")
     List<SmObjectImpl> mCausing = null;

    @objid ("e120383a-a462-46c5-b88f-5b8845cfefc2")
     List<SmObjectImpl> mAddedToQuery = null;

    @objid ("fe015afa-f4be-4d8e-800d-220efcc8a006")
    public ElementData(ElementSmClass smClass) {
        super(smClass);
    }

}
