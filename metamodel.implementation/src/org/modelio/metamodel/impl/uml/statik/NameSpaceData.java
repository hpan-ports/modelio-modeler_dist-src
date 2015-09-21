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
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeData;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0011d8de-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class NameSpaceData extends ModelTreeData {
    @objid ("1dfa0a0f-e72a-4829-add5-946c6aefbacf")
     Object mIsAbstract = false;

    @objid ("68961dae-a1be-4233-b61b-f4f39e5535e7")
     Object mIsLeaf = false;

    @objid ("ee064d2f-a911-4adb-b9a0-8438dc5a0933")
     Object mIsRoot = false;

    @objid ("6c1871c0-b3e6-4e39-abb0-64b815be3be1")
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("ef63d6da-c927-4829-abc6-fad488bed6fd")
     List<SmObjectImpl> mParent = null;

    @objid ("eb281b5c-32ea-4dfd-8033-670f2ac6369e")
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("8ba4cadd-383a-41cb-a05d-8ac321ecf8aa")
     List<SmObjectImpl> mRepresenting = null;

    @objid ("bfc8a889-c5dc-4ed6-9568-bd511753bceb")
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("4a023de5-a326-4980-bc3b-6ce60ae32ee6")
     List<SmObjectImpl> mReceived = null;

    @objid ("9296bc69-694c-4b1f-b5fc-c5f1e36742b9")
     List<SmObjectImpl> mUsedNsu = null;

    @objid ("696f83f5-488f-4823-943b-dc9a5ddf9f6c")
     List<SmObjectImpl> mOwnedInformationFlow = null;

    @objid ("11778167-c873-4eb3-830e-52f25f8d0e59")
     List<SmObjectImpl> mImporting = null;

    @objid ("f07863fc-7888-4915-a477-678a29a8a242")
     List<SmObjectImpl> mSent = null;

    @objid ("9b8ebdda-1cc5-4698-b509-ff5185536e1e")
     List<SmObjectImpl> mOwnedDataFlow = null;

    @objid ("3bb98bf6-b3e0-4a49-a603-6f8a22528a38")
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("637644c0-2fb7-4367-921b-5978d9e309c0")
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("593ee0d5-d485-4c50-b878-b4174e2f2188")
     List<SmObjectImpl> mTemplate = null;

    @objid ("5952911f-6aae-45fa-8d73-2922a5cb3c93")
     List<SmObjectImpl> mSpecialization = null;

    @objid ("2b3f2a50-9a75-4998-80b5-129b04fdd454")
     List<SmObjectImpl> mRealized = null;

    @objid ("b80f07ec-32d7-4211-a550-163f51eb4c37")
     List<SmObjectImpl> mDeclared = null;

    @objid ("1d38d744-0721-47de-8a77-ff21a7abc516")
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("4aac0e35-6771-4408-b98c-0c3e23aaf2c6")
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("55d56695-6d26-4ccd-9ab8-b1346994f04c")
     List<SmObjectImpl> mUserNsu = null;

    @objid ("7e3fd844-a655-4d3b-b921-23b2c404649d")
    public NameSpaceData(NameSpaceSmClass smClass) {
        super(smClass);
    }

}
