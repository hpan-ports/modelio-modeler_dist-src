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
package org.modelio.metamodel.impl.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("005be7bc-c4bf-1fd8-97fe-001ec947cd2a")
public class DictionaryData extends AnalystContainerData {
    @objid ("045fcb10-3297-4882-b0cb-292e0109dab1")
     List<SmObjectImpl> mOwnedDictionary = null;

    @objid ("78f54dc1-f915-46fc-8a9e-ba239d9afbdf")
     SmObjectImpl mOwnerDictionary;

    @objid ("fe345f37-3bb2-469a-868a-bdbbc213225d")
     SmObjectImpl mOwnerProject;

    @objid ("e4227f3c-af2e-4420-a4ca-1c4d2a90ef79")
     List<SmObjectImpl> mOwnedTerm = null;

    @objid ("a1b732de-f47a-4b88-86ef-d1cc9576f442")
    public DictionaryData(DictionarySmClass smClass) {
        super(smClass);
    }

}
