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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00907a4a-c4be-1fd8-97fe-001ec947cd2a")
public class TaggedValueData extends ModelElementData {
    @objid ("bc4eabf9-a44b-4cc9-8115-45b2d3780030")
     SmObjectImpl mAnnoted;

    @objid ("8c8844ff-a401-4b3d-9c4c-d8c15a5c3faf")
     List<SmObjectImpl> mActual = null;

    @objid ("1f4d417b-ef12-4cb8-bedf-f6d53aeccfb6")
     SmObjectImpl mQualifier;

    @objid ("85e97998-1eb4-488a-b479-5b0f2d593c8b")
     SmObjectImpl mDefinition;

    @objid ("7af41b66-a539-4773-b3b1-f3bdcf4a8efc")
    public TaggedValueData(TaggedValueSmClass smClass) {
        super(smClass);
    }

}
