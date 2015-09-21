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

@objid ("3ae27d60-636c-4129-aaed-34265d379087")
public class RequirementContainerData extends AnalystContainerData {
    @objid ("b2d0c89c-65d7-457e-b76a-116b639096e6")
     List<SmObjectImpl> mOwnedRequirement = null;

    @objid ("664fd179-2f0e-40a0-898f-3fea7792bfd2")
     SmObjectImpl mOwnerContainer;

    @objid ("f6359b31-b445-4124-a54f-41e18b4cd062")
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("1e69b4c2-dfbd-479e-98c0-863f4c08de3e")
     SmObjectImpl mOwnerProject;

    @objid ("949dcf59-0e5b-40a9-abc4-0b437a474483")
    public RequirementContainerData(RequirementContainerSmClass smClass) {
        super(smClass);
    }

}
