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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("f953b488-e3cf-44a1-b09a-69b82d90b358")
    @Override
    public String getTransformationBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt());
    }

    @objid ("f507283e-890d-488b-9a8a-c6ad939e705c")
    @Override
    public void setTransformationBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt(), value);
    }

    @objid ("f5eddcd8-072d-472b-9846-c05a21606617")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("37ae1205-ddb1-4bf7-a273-20171dfc2d12")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("33fc4e18-6374-45a3-b556-07f6e89c5b6b")
    @Override
    public boolean isIsMultiCast() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiCastAtt());
    }

    @objid ("47e4a843-7781-49de-bef0-0e802d0ff440")
    @Override
    public void setIsMultiCast(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiCastAtt(), value);
    }

    @objid ("bc6d0b58-ca35-458f-a249-818d0cd61811")
    @Override
    public boolean isIsMultiReceive() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt());
    }

    @objid ("1b262fd1-6115-40c2-bc25-b03aed856f0b")
    @Override
    public void setIsMultiReceive(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt(), value);
    }

    @objid ("6b2e3811-6bde-4573-adc5-9e2ef8c99ade")
    @Override
    public ObjectFlowEffectKind getEffect() {
        return (ObjectFlowEffectKind) getAttVal(ObjectFlowData.Metadata.EffectAtt());
    }

    @objid ("24f05363-ce47-4850-9cf2-ddc54a0d1103")
    @Override
    public void setEffect(ObjectFlowEffectKind value) {
        setAttVal(ObjectFlowData.Metadata.EffectAtt(), value);
    }

    @objid ("1df924e8-28db-4bbf-bf76-0302227848ae")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2e843eb5-cf5e-45b8-b47e-650b631733b6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("905170d5-cd19-4ee1-98cc-e2bf4d7f47b3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectFlow(this);
        else
          return null;
    }

}
