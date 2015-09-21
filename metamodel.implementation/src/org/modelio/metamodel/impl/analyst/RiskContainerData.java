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
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: May 06, 2015
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

@objid ("13e3b59f-d250-489a-b1ae-79b7628f1660")
public class RiskContainerData extends AnalystContainerData {
    @objid ("1080116d-f5e3-4c39-babb-87c5929ca3b7")
     List<SmObjectImpl> mOwnedRisk = null;

    @objid ("b98436bf-d1eb-4e43-b630-8d58fec39ed4")
     SmObjectImpl mOwnerContainer;

    @objid ("3b64dd3f-dbef-4ec7-a4ea-c7cbfb068f1b")
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("f5a2a877-31f4-445b-bc35-4ddf27aacafb")
     SmObjectImpl mOwnerProject;

    @objid ("1c72a942-22e8-458a-ac69-612b90bd1d23")
    public RiskContainerData(RiskContainerSmClass smClass) {
        super(smClass);
    }

}
