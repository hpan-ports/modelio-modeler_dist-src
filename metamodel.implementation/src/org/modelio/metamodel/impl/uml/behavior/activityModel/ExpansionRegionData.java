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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00322346-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionRegionData extends StructuredActivityNodeData {
    @objid ("d118db19-6f36-4dca-b085-18a2c6d986e9")
     Object mMode = ExpansionKind.ITERATIVE;

    @objid ("913fac70-8f77-4835-a2af-81f88370e47a")
     List<SmObjectImpl> mOutputElement = null;

    @objid ("d5fdda11-d030-4ab9-9327-c69317203fa7")
     List<SmObjectImpl> mInputElement = null;

    @objid ("68532b52-ca13-4d32-83bd-c2a751b89bf1")
    public ExpansionRegionData(ExpansionRegionSmClass smClass) {
        super(smClass);
    }

}
