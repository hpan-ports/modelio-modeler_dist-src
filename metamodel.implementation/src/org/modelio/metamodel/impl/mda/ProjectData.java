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
package org.modelio.metamodel.impl.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0066673c-c4bf-1fd8-97fe-001ec947cd2a")
public class ProjectData extends ModelElementData {
    @objid ("09a3ac9b-3e85-4960-994a-49154071bfd5")
     Object mProjectContext = "";

    @objid ("3b4f1275-1723-479b-a7ad-e6a096f732ba")
     Object mProjectDescr = "";

    @objid ("af7ef936-5a72-463a-8a9a-7abfc782ed9e")
     SmObjectImpl mDiagramRoot;

    @objid ("f844866a-3f1d-4d20-83e4-74b3c7480d14")
     SmObjectImpl mModel;

    @objid ("03e4470f-0c22-43c2-ad8d-6068fd55e993")
    public ProjectData(ProjectSmClass smClass) {
        super(smClass);
    }

}
