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
package org.modelio.metamodel.impl.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00678cde-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class AbstractDiagramData extends ModelElementData {
    @objid ("872ae2b6-9bf2-485d-ac35-a6a433da850b")
     Object mUiDataVersion = 0;

    @objid ("ddedb7b6-27c2-4302-821e-a67d1559e68b")
     Object mUiData = "";

    @objid ("27955663-098b-4f6b-a1ff-dfa909be4a59")
     Object mPdeProperties = "";

    @objid ("8bccc0de-f207-4b92-ad9a-c2db892c38dd")
     SmObjectImpl mOrigin;

    @objid ("7b4b3fac-200c-4cf2-b1d1-2154f96fe77d")
     List<SmObjectImpl> mRepresented = null;

    @objid ("eb41c1e2-64dc-4d81-852a-10562ae83eca")
     List<SmObjectImpl> mReferencingSet = null;

    @objid ("06f5a900-e922-4471-b0bb-4fb265ac258b")
    public AbstractDiagramData(AbstractDiagramSmClass smClass) {
        super(smClass);
    }

}
