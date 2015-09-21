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

@objid ("43bed3c3-3cdf-4dab-9cc1-98967bdd90dc")
public class BusinessRuleContainerData extends AnalystContainerData {
    @objid ("4f5ba25a-24f2-4710-bbc3-49b35518718c")
     List<SmObjectImpl> mOwnedRule = null;

    @objid ("dd409dca-5f73-4153-851e-9c824d3119c1")
     SmObjectImpl mOwnerContainer;

    @objid ("079fea69-dcae-40f2-9da1-c76eb8e01945")
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("47d1cf12-5834-48e4-abb4-aeeb4c95e362")
     SmObjectImpl mOwnerProject;

    @objid ("a642344f-1406-4fc7-b165-7d85ca820298")
    public BusinessRuleContainerData(BusinessRuleContainerSmClass smClass) {
        super(smClass);
    }

}
