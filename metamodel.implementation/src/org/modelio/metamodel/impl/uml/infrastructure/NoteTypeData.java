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

@objid ("008c3692-c4be-1fd8-97fe-001ec947cd2a")
public class NoteTypeData extends ModelElementData {
    @objid ("0eaca65e-d430-4083-8654-7b0aaa06216e")
     Object mIsHidden = false;

    @objid ("bda62882-1c85-4e22-8f83-2da6aba4dcfa")
     Object mLabelKey = "";

    @objid ("c34b08c9-230a-4a76-92b2-005b55ab5d09")
     Object mMimeType = "";

    @objid ("4e54a54c-d772-4f2f-9c30-eb32b7d0c375")
     List<SmObjectImpl> mElement = null;

    @objid ("8995f6ab-18d2-4467-b1f8-adc709f1beed")
     SmObjectImpl mOwnerStereotype;

    @objid ("858f0760-4868-405c-ad9b-a316d3486ab0")
     SmObjectImpl mOwnerReference;

    @objid ("a0c8d9a7-a490-4774-b163-e2be67e87ceb")
    public NoteTypeData(NoteTypeSmClass smClass) {
        super(smClass);
    }

}
