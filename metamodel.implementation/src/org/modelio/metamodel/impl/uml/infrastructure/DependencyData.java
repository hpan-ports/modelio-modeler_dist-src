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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0086407a-c4be-1fd8-97fe-001ec947cd2a")
public class DependencyData extends ModelElementData {
    @objid ("b8a929b9-aee1-420e-a960-6a48d4ebb507")
     Object mDependsOnId = "";

    @objid ("6aefa4a4-f4cf-448e-ad12-1dca425f014f")
     Object mDependsOnName = "";

    @objid ("54bf6e44-d2ff-4746-8096-720e1588c67c")
     SmObjectImpl mDependsOn;

    @objid ("f3fe18df-664c-4f51-9af3-62c3ce70d211")
     SmObjectImpl mImpacted;

    @objid ("8c7e18f7-8be6-43e3-bbc7-2fca06d34bae")
    public DependencyData(DependencySmClass smClass) {
        super(smClass);
    }

}
