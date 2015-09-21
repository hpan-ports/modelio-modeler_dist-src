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

@objid ("009712f6-c4be-1fd8-97fe-001ec947cd2a")
public class ArtifactData extends ClassifierData {
    @objid ("f1671c08-c0e8-4eb2-9272-3b830151b5a8")
     Object mFileName = "";

    @objid ("5ece902e-6530-4178-8595-9baa69f1ab2c")
     List<SmObjectImpl> mUtilized = null;

    @objid ("1d66ae08-05d6-425a-8dde-4eca1f7f6e66")
     List<SmObjectImpl> mDeploymentLocation = null;

    @objid ("d1bf869e-b6db-47ad-abf8-d27e36e890bd")
    public ArtifactData(ArtifactSmClass smClass) {
        super(smClass);
    }

}
