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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("008d9532-c4be-1fd8-97fe-001ec947cd2a")
public class StereotypeData extends ModelElementData {
    @objid ("90d2235a-2c65-45ea-b301-02007aa4bb0c")
     Object mImage = "";

    @objid ("f642fde6-0e60-491b-9eb5-75cbca71b863")
     Object mIcon = "";

    @objid ("9f188dc4-5fe7-4306-9ac5-478e8d8f5b71")
     Object mIsHidden = false;

    @objid ("96f3a5c5-833c-4d32-87be-6f3d8e8d5ba5")
     Object mLabelKey = "";

    @objid ("cb40a50a-f5f0-4cd7-a68c-6de7bfe651f1")
     Object mBaseClassName = "";

    @objid ("c0ff0c27-2c1e-452d-a458-c657edd5ed0b")
     SmObjectImpl mDefinedTable;

    @objid ("817672f5-9700-47e2-a9d0-9edf42633a92")
     List<SmObjectImpl> mExtendedElement = null;

    @objid ("3b13d9f4-c662-464f-bfac-5bd1f1197540")
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("11c43f49-8e84-4d89-8fb0-0b3f18ab6b58")
     SmObjectImpl mOwner;

    @objid ("add1ba12-942d-4dfb-8d7e-e92f092dc0dd")
     SmObjectImpl mParent;

    @objid ("8312a931-a4ee-4296-8680-7621bba294ea")
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("88ec6ba9-2c85-4e62-94ba-cd06e3ae32af")
     List<SmObjectImpl> mChild = null;

    @objid ("660c2a87-8a69-4c1b-a80e-012738d6b62b")
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("5dde4aa7-6e28-4c03-ad58-f4f8592df1b4")
    public StereotypeData(StereotypeSmClass smClass) {
        super(smClass);
    }

}
