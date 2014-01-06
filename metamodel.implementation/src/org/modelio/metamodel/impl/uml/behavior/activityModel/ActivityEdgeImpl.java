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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002733be-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityEdgeImpl extends ModelElementImpl implements ActivityEdge {
    @objid ("d98de2af-9b4b-4261-a5bd-371ea4b16d69")
    @Override
    public String getGuard() {
        return (String) getAttVal(ActivityEdgeData.Metadata.GuardAtt());
    }

    @objid ("d6ddd814-4f22-4926-a5e0-de958ec5242e")
    @Override
    public void setGuard(String value) {
        setAttVal(ActivityEdgeData.Metadata.GuardAtt(), value);
    }

    @objid ("fd62155d-e416-47ac-be54-46f527bea010")
    @Override
    public String getWeight() {
        return (String) getAttVal(ActivityEdgeData.Metadata.WeightAtt());
    }

    @objid ("ee4ec938-e611-47d1-894b-66171d8e80ff")
    @Override
    public void setWeight(String value) {
        setAttVal(ActivityEdgeData.Metadata.WeightAtt(), value);
    }

    @objid ("54b2276c-9a45-4beb-a2fe-7728a3be605d")
    @Override
    public ActivityNode getTarget() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.TargetDep());
    }

    @objid ("d18e2d9c-b17c-4ee1-8309-23a176cbc279")
    @Override
    public void setTarget(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("5c274043-de5e-46e7-a5df-6dbe79b9b081")
    @Override
    public ActivityNode getSource() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.SourceDep());
    }

    @objid ("119da18b-2589-4318-a099-3027cb6c76a7")
    @Override
    public void setSource(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("829e3e33-ce55-4d19-a47d-b233d358acd7")
    @Override
    public InterruptibleActivityRegion getInterrupts() {
        return (InterruptibleActivityRegion) getDepVal(ActivityEdgeData.Metadata.InterruptsDep());
    }

    @objid ("150d4b81-7ef7-4380-960d-0ef5e9d56f52")
    @Override
    public void setInterrupts(InterruptibleActivityRegion value) {
        appendDepVal(ActivityEdgeData.Metadata.InterruptsDep(), (SmObjectImpl)value);
    }

    @objid ("d54fabaa-9753-41c4-8639-b1a1bc81d389")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ActivityEdgeData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("da47c0f0-3b32-4d8f-9d96-46cf6b86812a")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8ea4c489-ea26-4744-837f-f91376f7dd90")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("798219a4-a707-44e8-992b-561c7818bc75")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(ActivityEdgeData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ddcb00f3-2880-4bd8-98ef-3cf23363f83d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityEdge(this);
        else
          return null;
    }

}
