/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0038c502-c4bf-1fd8-97fe-001ec947cd2a")
public class ObjectFlowImpl extends ActivityEdgeImpl implements ObjectFlow {
    @objid ("0b174fbe-96e2-4b83-8feb-179a390480b5")
    @Override
    public String getTransformationBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt());
    }

    @objid ("7dac274f-d347-4270-b812-2b9ea5dea8f9")
    @Override
    public void setTransformationBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt(), value);
    }

    @objid ("58495745-b593-4834-8ef1-5beb9406fa9e")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("f5597fee-f9e5-4e45-915f-8b862e836690")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("1899d6b2-c5c9-4df4-bafd-c1ab9fbe0ddc")
    @Override
    public boolean isIsMultiCast() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiCastAtt());
    }

    @objid ("ee60dfe7-c830-46aa-8716-28da9489249d")
    @Override
    public void setIsMultiCast(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiCastAtt(), value);
    }

    @objid ("830e4236-f99b-4cb1-b02f-6b1fae098a0e")
    @Override
    public boolean isIsMultiReceive() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt());
    }

    @objid ("01b7067d-9161-47a0-933e-a08119ec1f7a")
    @Override
    public void setIsMultiReceive(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt(), value);
    }

    @objid ("742dd8bc-2819-4c17-849d-07db90b86f1b")
    @Override
    public ObjectFlowEffectKind getEffect() {
        return (ObjectFlowEffectKind) getAttVal(ObjectFlowData.Metadata.EffectAtt());
    }

    @objid ("5e8954df-9e5d-4f1f-b357-42d5fdc530aa")
    @Override
    public void setEffect(ObjectFlowEffectKind value) {
        setAttVal(ObjectFlowData.Metadata.EffectAtt(), value);
    }

    @objid ("eeb3fd15-d442-4ce6-a53e-316f0c926b95")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5cbeaf37-a579-490a-b18f-47aaad081b45")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("20b00b3a-aac3-482c-b5b4-8c11052ddcf3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectFlow(this);
        else
          return null;
    }

}
