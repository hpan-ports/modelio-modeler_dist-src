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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0030e0d0-c4bf-1fd8-97fe-001ec947cd2a")
public class ExceptionHandlerData extends ModelElementData {
    @objid ("b941333d-0b14-4db0-a1de-7633f5707b14")
     Object mGuard = "";

    @objid ("43b24590-b057-4427-836d-3790aeabada8")
     Object mWeight = "1";

    @objid ("13975090-b6d0-4c1c-a945-b6dbf3e88c09")
     SmObjectImpl mProtectedNode;

    @objid ("9674a7b8-bd79-40e0-a392-ee560d8fc788")
     SmObjectImpl mExceptionInput;

    @objid ("b87d8444-8642-4d51-afc6-d7f12d113988")
     List<SmObjectImpl> mExceptionType = null;

    @objid ("432d9430-774e-401e-a83c-2e97337b34c8")
    public ExceptionHandlerData(ExceptionHandlerSmClass smClass) {
        super(smClass);
    }

}
