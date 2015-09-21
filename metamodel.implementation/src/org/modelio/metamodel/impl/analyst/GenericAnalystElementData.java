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

@objid ("efe46dc4-941a-4fc9-9c1b-e10b1c1e8cea")
public class GenericAnalystElementData extends AnalystElementData {
    @objid ("17359394-3ecf-42cc-855e-4a26cfa90f87")
     List<SmObjectImpl> mSubElement = null;

    @objid ("09f5637a-0d31-4dd6-abc8-5f5d983ae805")
     SmObjectImpl mOwnerContainer;

    @objid ("101feed7-1592-4a44-883f-0c1e50b7fbcd")
     SmObjectImpl mParentElement;

    @objid ("a57003bc-3f2b-47a7-818e-69ee128c3bf3")
     SmObjectImpl mLastElementVersion;

    @objid ("ae2d8ec4-d319-4007-8fbe-dfd6c2b1deca")
     List<SmObjectImpl> mArchivedElementVersion = null;

    @objid ("cf9df392-7b01-4bc7-8ad1-6b54306866bf")
    public GenericAnalystElementData(GenericAnalystElementSmClass smClass) {
        super(smClass);
    }

}
