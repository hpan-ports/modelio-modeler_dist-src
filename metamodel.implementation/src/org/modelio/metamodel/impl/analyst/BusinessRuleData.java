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

@objid ("4da7b9f3-596c-4989-b28e-a35e40d48073")
public class BusinessRuleData extends AnalystElementData {
    @objid ("b7ab8554-f118-4e2b-aa5b-1fe10441fabf")
     List<SmObjectImpl> mSubRule = null;

    @objid ("288cdbc4-32ff-41bb-b417-1862ca82abd1")
     SmObjectImpl mOwnerContainer;

    @objid ("81a8d150-5a52-4bf7-bd78-0cb344c9c49c")
     SmObjectImpl mParentRule;

    @objid ("cf50f42d-7f01-4774-95f4-7d0a7e98eaa7")
     SmObjectImpl mLastRuleVersion;

    @objid ("70c30210-e995-4ff7-a37e-16e40de35340")
     List<SmObjectImpl> mArchivedRuleVersion = null;

    @objid ("082e5381-1e08-41f5-8d5b-cb8cc59493ba")
    public BusinessRuleData(BusinessRuleSmClass smClass) {
        super(smClass);
    }

}
