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

@objid ("009851b6-c4be-1fd8-97fe-001ec947cd2a")
public class AttributeData extends StructuralFeatureData {
    @objid ("9f9a0a12-8564-44d8-86d7-5c932172736d")
     Object mTypeConstraint = "";

    @objid ("1bfc714b-e3ae-4ac1-a618-f8b0893897a7")
     Object mValue = "";

    @objid ("67610bdc-9160-41be-adcc-be44deae9a35")
     Object mTargetIsClass = false;

    @objid ("aeffeacc-33b1-46dd-b590-aa5262541b19")
     SmObjectImpl mType;

    @objid ("22796e1b-30c2-4545-9dae-dc04f1a680d7")
     SmObjectImpl mOwner;

    @objid ("2845867e-b7c1-4f66-9724-abe9bb627125")
     List<SmObjectImpl> mOccurence = null;

    @objid ("13ef0a26-c0ff-4912-952f-1af8756eac57")
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("6c788772-a8a4-423e-801a-9007f7cd0deb")
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("2fab4298-0613-4f68-9717-1e1038cd8ef4")
     SmObjectImpl mQualified;

    @objid ("9b4e317f-1b9f-4bbb-a73c-3bd4bd61b134")
    public AttributeData(AttributeSmClass smClass) {
        super(smClass);
    }

}
