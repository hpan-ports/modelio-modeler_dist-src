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

@objid ("000c3550-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class GeneralClassData extends ClassifierData {
    @objid ("9f81ce1e-7c63-46d1-bdbe-c66e5a6f57bc")
     Object mIsElementary = false;

    @objid ("7496c158-1ea7-4098-92d4-990c21da4f92")
     List<SmObjectImpl> mBpmnInterfaceRefs = null;

    @objid ("12cda214-7869-4e7f-84b2-ed6ad0d81db9")
     List<SmObjectImpl> mOccurence = null;

    @objid ("2705ffbc-d94d-4042-a107-f76ae54323be")
     SmObjectImpl mExceptionInput;

    @objid ("aeb7bacd-a2a1-4ebf-81a4-7d46e97ef6db")
     List<SmObjectImpl> mObject = null;

    @objid ("c82394b4-082e-4866-af9a-9d17ba34f5dd")
     List<SmObjectImpl> mBpmnMessageRefs = null;

    @objid ("b7c4d0ea-f0c5-4d5a-bd2a-69ec6ccaf81c")
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("5bd44f86-cdd2-49a7-88cd-34508ab6e569")
     List<SmObjectImpl> mBpmnItemDefinitionRefs = null;

    @objid ("d1bef013-ea81-4873-88bd-3e5b10fd3985")
     List<SmObjectImpl> mOccurenceObjectNode = null;

    @objid ("444f66f8-de15-4dd9-a774-68b8930b4df1")
     List<SmObjectImpl> mBpmnItemAwareRefs = null;

    @objid ("19cb6214-8966-4254-ae01-1e3c94b87cce")
    public GeneralClassData(GeneralClassSmClass smClass) {
        super(smClass);
    }

}
