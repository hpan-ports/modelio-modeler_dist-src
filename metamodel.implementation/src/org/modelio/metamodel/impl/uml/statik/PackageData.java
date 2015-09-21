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
package org.modelio.metamodel.impl.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0015b9f4-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageData extends NameSpaceData {
    @objid ("3cad1fae-4d4b-435d-ada7-a2270134da42")
     Object mIsInstantiable = false;

    @objid ("4529c020-0e47-4f32-83ca-13afe93c7537")
     List<SmObjectImpl> mBpmnRepresents = null;

    @objid ("5c1ce8b7-2814-402e-8cc4-b86996a2fca8")
     List<SmObjectImpl> mReceivingMerge = null;

    @objid ("65929807-a973-4e33-b8a7-5d2d7da71d87")
     SmObjectImpl mRepresented;

    @objid ("bdef566f-986c-414a-b45a-2b973e24aebe")
     List<SmObjectImpl> mMerge = null;

    @objid ("f7c6242d-6651-40f9-ab38-215b6fe7612a")
     List<SmObjectImpl> mPackageImporting = null;

    @objid ("c2fa28db-7525-4aaa-a9c2-7dce920c5e0f")
    public PackageData(PackageSmClass smClass) {
        super(smClass);
    }

}
