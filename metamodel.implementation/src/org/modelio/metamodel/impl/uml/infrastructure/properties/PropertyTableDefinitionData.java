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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0067b7c2-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableDefinitionData extends ModelElementData {
    @objid ("a98c865e-9189-4e53-ad1d-76873e44226f")
     SmObjectImpl mOwner;

    @objid ("036cbf3d-1e84-47d1-a062-e5a4e493f8c0")
     List<SmObjectImpl> mTypedTable = null;

    @objid ("c91a77f4-e8e4-4b3c-a233-2e15b16ba13e")
     SmObjectImpl mOwnerReference;

    @objid ("716ff894-f6cc-49de-9546-665becea8289")
     SmObjectImpl mOwnerStereotype;

    @objid ("a923c12a-a0f7-4696-9fec-61eadc0dc917")
     List<SmObjectImpl> mOwned = null;

    @objid ("3f48f11f-952d-4152-bd6a-1f81d2331bf4")
    public PropertyTableDefinitionData(PropertyTableDefinitionSmClass smClass) {
        super(smClass);
    }

}
