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
/*   Metamodel version: 9022              */
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
    @objid ("d4cbdf01-5d04-4b33-961a-268f0f8b98de")
    @Override
    public String getTransformationBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt());
    }

    @objid ("40b0f01a-df79-4b40-b364-24f79b478823")
    @Override
    public void setTransformationBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.TransformationBehaviorAtt(), value);
    }

    @objid ("02ad19fa-898f-4286-89bb-bd7016804686")
    @Override
    public String getSelectionBehavior() {
        return (String) getAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt());
    }

    @objid ("dad70e97-22a1-483d-aaf6-7cbd548117c8")
    @Override
    public void setSelectionBehavior(String value) {
        setAttVal(ObjectFlowData.Metadata.SelectionBehaviorAtt(), value);
    }

    @objid ("f0e7c670-7aa0-4461-be36-8f9698a6724d")
    @Override
    public boolean isIsMultiCast() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiCastAtt());
    }

    @objid ("a9b4d49a-dea6-4c0f-874d-40288fac110a")
    @Override
    public void setIsMultiCast(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiCastAtt(), value);
    }

    @objid ("ba32bf4f-35d9-4f6c-8fe9-fb7206baf2f3")
    @Override
    public boolean isIsMultiReceive() {
        return (Boolean) getAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt());
    }

    @objid ("17d71286-259c-4d30-8f1d-61c8149f29cc")
    @Override
    public void setIsMultiReceive(boolean value) {
        setAttVal(ObjectFlowData.Metadata.IsMultiReceiveAtt(), value);
    }

    @objid ("5719d4ba-a145-4c5d-88a2-28dca828c689")
    @Override
    public ObjectFlowEffectKind getEffect() {
        return (ObjectFlowEffectKind) getAttVal(ObjectFlowData.Metadata.EffectAtt());
    }

    @objid ("725564cd-fb11-4d26-bcec-0e51f6ceca63")
    @Override
    public void setEffect(ObjectFlowEffectKind value) {
        setAttVal(ObjectFlowData.Metadata.EffectAtt(), value);
    }

    @objid ("457ffbbc-636b-4ae6-abcc-f9d083509aa4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b42e739b-bb56-486c-96a5-bf841c221bfd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("beb37f36-50a2-459f-85cc-64b79c85f873")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitObjectFlow(this);
        else
          return null;
    }

}
