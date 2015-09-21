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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0043a60c-c4bf-1fd8-97fe-001ec947cd2a")
public class CombinedFragmentData extends InteractionFragmentData {
    @objid ("391c87f1-6d24-45d2-9e5a-419b240c1a80")
     Object mOperator = InteractionOperator.SEQOP;

    @objid ("841ac5e6-8dec-46f5-9665-75de3cc28234")
     List<SmObjectImpl> mOperand = null;

    @objid ("14280d4e-5a88-4f0e-9c4f-d34444dfcec4")
     List<SmObjectImpl> mFragmentGate = null;

    @objid ("2216cce1-6bee-4dfd-aecc-1563484270aa")
    public CombinedFragmentData(CombinedFragmentSmClass smClass) {
        super(smClass);
    }

}
