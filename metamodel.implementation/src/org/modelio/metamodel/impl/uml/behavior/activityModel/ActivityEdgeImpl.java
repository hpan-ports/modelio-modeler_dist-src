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
    @objid ("2d92211a-92b4-44d8-bff3-6ef5982ce696")
    @Override
    public String getGuard() {
        return (String) getAttVal(ActivityEdgeData.Metadata.GuardAtt());
    }

    @objid ("af75fc5c-1370-4653-9d5c-8064127415ac")
    @Override
    public void setGuard(String value) {
        setAttVal(ActivityEdgeData.Metadata.GuardAtt(), value);
    }

    @objid ("2dc45754-aa92-4024-9ff5-528c3b154e98")
    @Override
    public String getWeight() {
        return (String) getAttVal(ActivityEdgeData.Metadata.WeightAtt());
    }

    @objid ("b764cc7c-fb55-488c-98e6-bd7944525e37")
    @Override
    public void setWeight(String value) {
        setAttVal(ActivityEdgeData.Metadata.WeightAtt(), value);
    }

    @objid ("7cf1be4f-b80c-406b-a33f-da8dd6f61689")
    @Override
    public ActivityNode getTarget() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.TargetDep());
    }

    @objid ("e2b36b1e-779a-4d62-ac4f-d3bfbcb31dce")
    @Override
    public void setTarget(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("a55e88a2-61d5-41a4-8a92-3aa2870f4ec4")
    @Override
    public ActivityNode getSource() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.SourceDep());
    }

    @objid ("df0d4c59-982b-4f17-81d7-479da4751dab")
    @Override
    public void setSource(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("de31d872-adb9-4068-891d-0ab820006bf4")
    @Override
    public InterruptibleActivityRegion getInterrupts() {
        return (InterruptibleActivityRegion) getDepVal(ActivityEdgeData.Metadata.InterruptsDep());
    }

    @objid ("751e1b23-9547-49d0-9f5f-f157d53ad505")
    @Override
    public void setInterrupts(InterruptibleActivityRegion value) {
        appendDepVal(ActivityEdgeData.Metadata.InterruptsDep(), (SmObjectImpl)value);
    }

    @objid ("612fa808-34a6-490c-99a0-17df42e83da4")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ActivityEdgeData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("d1cfedd1-3158-4c9b-9b2e-e2bc0680fed4")
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

    @objid ("171dd16d-d98a-40ef-8aa5-7b29ec832641")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("07b61859-c8ac-40a1-8f1f-61332c4b9415")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(ActivityEdgeData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("052c8653-16f3-4460-98ef-cdd67c0ba349")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityEdge(this);
        else
          return null;
    }

}
