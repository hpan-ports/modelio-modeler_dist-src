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

@objid ("0088dbfa-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ModelElementData extends ElementData {
    @objid ("9678eac4-620d-4f78-957a-668a4a5d7def")
     Object mName = "";

    @objid ("8fdcc7e4-9319-4a4c-93bd-85998c5f913a")
     SmObjectImpl mLocalProperties;

    @objid ("f859da05-e37b-44c8-ae48-a842525d5026")
     List<SmObjectImpl> mTemplateSubstitution = null;

    @objid ("74b53525-037c-46fa-993e-ef74a318219d")
     List<SmObjectImpl> mBpmnLaneRefs = null;

    @objid ("38a5814e-b4b1-446d-b4f7-bb9302a0a87a")
     List<SmObjectImpl> mExtension = null;

    @objid ("a5ba01e3-470f-487b-87c7-c04c7e800461")
     List<SmObjectImpl> mDependsOnDependency = null;

    @objid ("b10ccf13-7408-4294-910c-2082c7ad4346")
     List<SmObjectImpl> mDefaultParametering = null;

    @objid ("94c58f52-a7ef-4ace-b7b7-16418a9139fa")
     List<SmObjectImpl> mRepresents = null;

    @objid ("36c005ca-74c7-4cef-81fd-8f60f5d7a14d")
     List<SmObjectImpl> mDocument = null;

    @objid ("0b782646-d567-4fba-882c-caa62224038c")
     List<SmObjectImpl> mTag = null;

    @objid ("bdf3ba0c-12b9-424f-97d9-eaa8b5c31b1d")
     SmObjectImpl mOwnerTemplateParameter;

    @objid ("d364e899-34ae-42f1-9def-a1431db8d9b5")
     List<SmObjectImpl> mImpactedDependency = null;

    @objid ("cfb35635-6d66-4197-8cca-2b5051b3b1e5")
     List<SmObjectImpl> mRepresentingEnd = null;

    @objid ("a4c0ef27-47e1-43cf-ace8-8afae3f9eaa4")
     List<SmObjectImpl> mRepresentingPartition = null;

    @objid ("ec749311-7673-4093-b0c9-44905a611e7a")
     List<SmObjectImpl> mConstraintDefinition = null;

    @objid ("0ea688a1-621b-4867-aea4-a21220b10edb")
     List<SmObjectImpl> mTypingParameter = null;

    @objid ("5968f126-5865-4281-9c89-d61b15aa5ca0")
     List<SmObjectImpl> mManifesting = null;

    @objid ("fa910800-fefa-4ca0-a45a-68f8060d1be9")
     List<SmObjectImpl> mProperties = null;

    @objid ("17f5de03-3d08-4d00-9628-8839070fbc1b")
     List<SmObjectImpl> mProduct = null;

    @objid ("a6e3b6f8-785b-4c6c-8e63-8e24974fe753")
     List<SmObjectImpl> mRepresentingInstance = null;

    @objid ("753c78ab-5bd8-4e49-85e7-0bd67d7ac567")
     List<SmObjectImpl> mReceivedInfo = null;

    @objid ("f69b212f-125f-40f4-a52d-f8b375f21136")
     List<SmObjectImpl> mSentInfo = null;

    @objid ("e2b727e2-2624-40e3-93a2-a3ac1d403285")
     List<SmObjectImpl> mDescriptor = null;

    @objid ("23071c6f-aaa9-465d-a7e6-8d507caba240")
     List<SmObjectImpl> mRepresentingConnector = null;

    @objid ("dbff3e45-19ca-44b6-b09e-62d1822550a6")
     List<SmObjectImpl> mMatrix = null;

    @objid ("7be297c6-f38f-47bf-8879-0c1d80533d08")
    public ModelElementData(ModelElementSmClass smClass) {
        super(smClass);
    }

}
