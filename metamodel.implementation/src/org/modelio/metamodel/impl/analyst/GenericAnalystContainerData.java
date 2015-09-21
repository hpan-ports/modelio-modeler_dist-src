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
package org.modelio.metamodel.impl.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("43cf5c62-f20f-4e47-9153-5f4bd63429ba")
public class GenericAnalystContainerData extends AnalystContainerData {
    @objid ("3334a7a4-b092-4ba5-8fa9-8be00704c516")
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("3eba2c82-f9a4-4140-aba9-30a70bd38914")
     SmObjectImpl mOwnerContainer;

    @objid ("a7d4d328-315b-43dc-af43-2c8e29347c58")
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("ea0dd856-f55c-41c3-9d7a-d4bccd60b445")
     SmObjectImpl mOwnerProject;

    @objid ("bfe2192d-2f62-43b2-9726-a336e450ce6e")
    public GenericAnalystContainerData(GenericAnalystContainerSmClass smClass) {
        super(smClass);
    }

}
