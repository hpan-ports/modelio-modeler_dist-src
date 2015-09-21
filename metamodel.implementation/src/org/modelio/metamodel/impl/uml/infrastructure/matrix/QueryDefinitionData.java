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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("8fe79750-6ab9-4493-b4ef-2e199f7d4dea")
public class QueryDefinitionData extends ElementData {
    @objid ("6091fafb-6e46-4d55-b2a9-3cc7a825c931")
     Object mUsingAdditions = true;

    @objid ("a9fb35e6-b87d-4bbb-9a37-fa89a21a7992")
     List<SmObjectImpl> mAdded = null;

    @objid ("c31e70b8-03de-4a0f-b261-c117d66842c6")
     SmObjectImpl mProcessor;

    @objid ("0c8e9f15-4eb9-40dc-9bb8-5978f405a45f")
     SmObjectImpl mParameters;

    @objid ("9d17223b-dcb3-4327-aeee-6a0817baff5e")
     SmObjectImpl mOwnerAsLine;

    @objid ("3c7c9f1a-30c7-4d80-b23a-3b83917d217e")
     SmObjectImpl mOwnerAsCol;

    @objid ("a993e21a-516f-4dd7-a5a0-f1117ed05cec")
     SmObjectImpl mOwnerAsDepth;

    @objid ("da0fe95a-cc6f-4eda-9ed7-aa3b940b9814")
    public QueryDefinitionData(QueryDefinitionSmClass smClass) {
        super(smClass);
    }

}
