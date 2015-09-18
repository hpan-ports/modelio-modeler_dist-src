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
    @objid ("84bbfc4e-7a7d-443a-aded-05895c63827d")
    @Override
    public String getGuard() {
        return (String) getAttVal(ActivityEdgeData.Metadata.GuardAtt());
    }

    @objid ("2f0a5f93-eb95-49d6-ae21-fa09802e6ae6")
    @Override
    public void setGuard(String value) {
        setAttVal(ActivityEdgeData.Metadata.GuardAtt(), value);
    }

    @objid ("9c023b71-f944-4801-80be-e8d76ae88318")
    @Override
    public String getWeight() {
        return (String) getAttVal(ActivityEdgeData.Metadata.WeightAtt());
    }

    @objid ("f5169352-bb7f-4068-a9d3-689172a6e517")
    @Override
    public void setWeight(String value) {
        setAttVal(ActivityEdgeData.Metadata.WeightAtt(), value);
    }

    @objid ("4fce0f93-8ef2-44c3-9880-264261ea2758")
    @Override
    public ActivityNode getTarget() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.TargetDep());
    }

    @objid ("2fbdbb2a-22ab-48be-af96-8907d91d6887")
    @Override
    public void setTarget(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("1cd9fa82-60cc-485a-970c-48e19c48ceed")
    @Override
    public ActivityNode getSource() {
        return (ActivityNode) getDepVal(ActivityEdgeData.Metadata.SourceDep());
    }

    @objid ("09ca8001-30bc-46bb-899e-e07882c3e276")
    @Override
    public void setSource(ActivityNode value) {
        appendDepVal(ActivityEdgeData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("ee58d611-2a5a-421b-af7b-b27411bc476e")
    @Override
    public InterruptibleActivityRegion getInterrupts() {
        return (InterruptibleActivityRegion) getDepVal(ActivityEdgeData.Metadata.InterruptsDep());
    }

    @objid ("e847f4aa-e6db-4ad9-b95a-49e543beefe0")
    @Override
    public void setInterrupts(InterruptibleActivityRegion value) {
        appendDepVal(ActivityEdgeData.Metadata.InterruptsDep(), (SmObjectImpl)value);
    }

    @objid ("a607ad31-264e-40b3-bcb0-299f1c9ecc21")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ActivityEdgeData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("2d94fbc3-49c8-4102-91da-92119b027c4a")
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

    @objid ("6254bd5f-6cfd-4703-ad7e-affbf99aecd8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5af60896-4228-4cc9-8bc9-0474f95bbe2e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityEdgeData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(ActivityEdgeData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("59485154-9c44-4200-8499-ee0ac91faa0a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityEdge(this);
        else
          return null;
    }

}
