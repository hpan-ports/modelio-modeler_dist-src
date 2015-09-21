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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("002733be-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityEdgeImpl extends ModelElementImpl implements ActivityEdge {
    @objid ("343f4135-6974-4f4b-a32e-efcca04089a8")
    @Override
    public String getGuard() {
        return (String) getAttVal(((ActivityEdgeSmClass)getClassOf()).getGuardAtt());
    }

    @objid ("7b44a167-5af1-4bb9-9437-4549a96ffb88")
    @Override
    public void setGuard(String value) {
        setAttVal(((ActivityEdgeSmClass)getClassOf()).getGuardAtt(), value);
    }

    @objid ("807e7d45-313a-449c-ac0e-318811c8afdf")
    @Override
    public String getWeight() {
        return (String) getAttVal(((ActivityEdgeSmClass)getClassOf()).getWeightAtt());
    }

    @objid ("c2b51d78-de0c-4aa5-a59b-1f218dae1fb6")
    @Override
    public void setWeight(String value) {
        setAttVal(((ActivityEdgeSmClass)getClassOf()).getWeightAtt(), value);
    }

    @objid ("fd44c9eb-2864-4663-b1d3-142fea9db667")
    @Override
    public ActivityNode getTarget() {
        Object obj = getDepVal(((ActivityEdgeSmClass)getClassOf()).getTargetDep());
        return (obj instanceof ActivityNode)? (ActivityNode)obj : null;
    }

    @objid ("7553fd23-ff50-445e-8e53-d3b66e033748")
    @Override
    public void setTarget(ActivityNode value) {
        appendDepVal(((ActivityEdgeSmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("c8212cb7-9786-4214-9e06-eda1ca27eae8")
    @Override
    public ActivityNode getSource() {
        Object obj = getDepVal(((ActivityEdgeSmClass)getClassOf()).getSourceDep());
        return (obj instanceof ActivityNode)? (ActivityNode)obj : null;
    }

    @objid ("c219ea09-8f9e-45a1-83a6-1754bc9c14ad")
    @Override
    public void setSource(ActivityNode value) {
        appendDepVal(((ActivityEdgeSmClass)getClassOf()).getSourceDep(), (SmObjectImpl)value);
    }

    @objid ("f5874e46-87c9-4328-9342-1d7d0fc46a83")
    @Override
    public InterruptibleActivityRegion getInterrupts() {
        Object obj = getDepVal(((ActivityEdgeSmClass)getClassOf()).getInterruptsDep());
        return (obj instanceof InterruptibleActivityRegion)? (InterruptibleActivityRegion)obj : null;
    }

    @objid ("89d1364c-4e18-4966-9093-86936c410027")
    @Override
    public void setInterrupts(InterruptibleActivityRegion value) {
        appendDepVal(((ActivityEdgeSmClass)getClassOf()).getInterruptsDep(), (SmObjectImpl)value);
    }

    @objid ("bda1dfa7-65c7-42e2-8b7f-10a37ab25b3b")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((ActivityEdgeSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("cf2a2cda-6ede-4b68-93ba-8ddaeb3e0cc9")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ee8c9a3d-72a2-41d7-98fc-ddfbf71ab1c6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Source
        obj = (SmObjectImpl)this.getDepVal(((ActivityEdgeSmClass)getClassOf()).getSourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d709e70a-9f9f-4cdd-af09-79fe0ec23fff")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Source
        dep = ((ActivityEdgeSmClass)getClassOf()).getSourceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b083e6a3-c126-4447-9916-dd8bcbce3b83")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityEdge(this);
        else
          return null;
    }

}
