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
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0014d9d0-c4bf-1fd8-97fe-001ec947cd2a")
public class OperationData extends BehavioralFeatureData {
    @objid ("01fff855-7f50-43de-b4bb-0c8c5b06d102")
     Object mConcurrency = false;

    @objid ("4bd77df6-1c01-40bc-beac-f21a26be3ce3")
     Object mFinal = false;

    @objid ("371c61a4-aa3d-491a-8abd-12fca29bd2c8")
     Object mPassing = MethodPassingMode.METHODOUT;

    @objid ("e3054a44-7338-44ed-b56a-cef274ed0986")
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("5218f6d4-4da7-477c-8514-f343790f9b5f")
     List<SmObjectImpl> mThrown = null;

    @objid ("2e36868a-3849-4cb4-9f9e-2c85361a3815")
     List<SmObjectImpl> mCallerReceiveTask = null;

    @objid ("2073afff-60f5-4ca7-a0a5-63ee43939624")
     List<SmObjectImpl> mRedefinition = null;

    @objid ("2b5daea5-58fd-4db4-aad9-e15c4aa20826")
     List<SmObjectImpl> mExample = null;

    @objid ("c78dd22a-d040-42c9-b734-b4116aa0f676")
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("44cb1148-d632-4f39-bbd0-262a451367e6")
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("4121054e-8536-466d-b9d8-8d7c5f69c297")
     List<SmObjectImpl> mBpmnOperationRef = null;

    @objid ("7f1d8ad2-03b4-4bc9-9902-492b020a197d")
     List<SmObjectImpl> mCallerSendTask = null;

    @objid ("b9a0a3ad-dd42-406a-a548-e197fcbc6afd")
     List<SmObjectImpl> mIO = null;

    @objid ("22bf24f2-a02d-46e4-a0df-3f00beefd619")
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("3c27f256-b773-472f-a245-7d5b0c211e5d")
     SmObjectImpl mOwner;

    @objid ("c10749ae-caaa-4cd7-a26a-c758343d0e8c")
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("e482672e-cfd3-4155-ba68-cc7018a8800e")
     SmObjectImpl mReturn;

    @objid ("4992e74d-4d1a-4bb0-8b7c-f2697271e266")
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("9bbc5edc-c256-45df-ad27-c281afcee877")
     List<SmObjectImpl> mUsage = null;

    @objid ("22581223-9f65-46f9-9dbe-4afe63d59ffd")
     List<SmObjectImpl> mTemplate = null;

    @objid ("01f48a6c-7967-4944-b2d1-74a0b39edede")
     List<SmObjectImpl> mCallerServiceTask = null;

    @objid ("51f24499-49e2-4215-aab7-81c1e10e5a75")
     List<SmObjectImpl> mOccurence = null;

    @objid ("b2dbbf8e-542c-4374-ac11-cd5df37c44e1")
     List<SmObjectImpl> mInvoker = null;

    @objid ("215de6ca-9cd1-4d83-934c-a86db358e5c7")
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("6c2b6b73-bfed-4390-8e89-cc92bc656d15")
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("4de46106-8401-4dce-82d2-b9f2cf97d168")
     SmObjectImpl mRedefines;

    @objid ("d5fa1370-f024-4177-84dc-c871c929521b")
     List<SmObjectImpl> mCaller = null;

    @objid ("ea4d3f0b-4c2f-41cd-81b8-c193080ac641")
     List<SmObjectImpl> mCallingAction = null;

    @objid ("5fc26518-3b34-424b-8510-73a0ca3b7e76")
     List<SmObjectImpl> mEntryPointAction = null;

    @objid ("96afb18c-a6a9-455c-87c1-bf52dd66d95d")
    public OperationData(OperationSmClass smClass) {
        super(smClass);
    }

}
