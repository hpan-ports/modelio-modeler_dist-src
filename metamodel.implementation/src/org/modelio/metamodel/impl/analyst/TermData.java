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

@objid ("0062a7fa-c4bf-1fd8-97fe-001ec947cd2a")
public class TermData extends AnalystElementData {
    @objid ("542e8b5c-b813-41ab-8a59-ed14a91b9b96")
     SmObjectImpl mOwnerDictionary;

    @objid ("e8eef51e-9bdb-44e4-928e-ab28730235a1")
     List<SmObjectImpl> mArchivedTermVersion = null;

    @objid ("a5e5c9ba-d0c8-45a5-968e-b2a89604a9d9")
     SmObjectImpl mLastTermVersion;

    @objid ("dd43a20a-a1d3-4125-b771-270892ed3191")
    public TermData(TermSmClass smClass) {
        super(smClass);
    }

}
