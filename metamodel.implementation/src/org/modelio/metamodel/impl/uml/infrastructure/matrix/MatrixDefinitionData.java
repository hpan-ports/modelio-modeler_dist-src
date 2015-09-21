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
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("efa02e20-bfde-4080-8f8e-4890ce002c4f")
public class MatrixDefinitionData extends ModelElementData {
    @objid ("443117e4-db56-4706-943e-b95b3a6b079b")
     SmObjectImpl mLinesDefinition;

    @objid ("4078a6f9-6613-459c-b7ea-1f427daaca7b")
     SmObjectImpl mColumnsDefinition;

    @objid ("9fc372ea-8194-473d-94e5-1d643556bd37")
     SmObjectImpl mValuesDefinition;

    @objid ("ba13aa1d-6bd6-448f-8e08-75ad7c156857")
     SmObjectImpl mDepthDefinition;

    @objid ("74f821ac-c81d-4fb3-99bd-71deec818f0c")
     SmObjectImpl mOwner;

    @objid ("12d1d356-2a61-451a-874e-241a3978321f")
    public MatrixDefinitionData(MatrixDefinitionSmClass smClass) {
        super(smClass);
    }

}
