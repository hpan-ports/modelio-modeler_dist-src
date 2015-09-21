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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00845b16-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSubProcessImpl extends BpmnActivityImpl implements BpmnSubProcess {
    @objid ("279a5a32-16c3-4c50-a088-4dd98b0e76af")
    @Override
    public boolean isTriggeredByEvent() {
        return (Boolean) getAttVal(((BpmnSubProcessSmClass)getClassOf()).getTriggeredByEventAtt());
    }

    @objid ("4e9ae535-b1bf-415f-a6c0-3788b6377878")
    @Override
    public void setTriggeredByEvent(boolean value) {
        setAttVal(((BpmnSubProcessSmClass)getClassOf()).getTriggeredByEventAtt(), value);
    }

    @objid ("2b30ebb5-1cfc-46b9-8fd1-16e81c6a403a")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, ((BpmnSubProcessSmClass)getClassOf()).getArtifactDep());
    }

    @objid ("f1203050-d2b5-4254-9852-fe5d646043d8")
    @Override
    public <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnArtifact element : getArtifact()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3244fc23-e3cf-42f0-ab33-34888bca91ef")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, ((BpmnSubProcessSmClass)getClassOf()).getFlowElementDep());
    }

    @objid ("82ae0679-f74f-44e6-b5ee-d7568378b2e9")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnFlowElement element : getFlowElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25c19ba7-bf62-4924-b971-1cc8246ba4f5")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, ((BpmnSubProcessSmClass)getClassOf()).getLaneSetDep());
    }

    @objid ("5452a7e5-55d3-45df-b8eb-198dea1b5624")
    @Override
    public <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnLaneSet element : getLaneSet()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("725d8b15-25c0-40ee-98af-d4c61735ccb0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f5e2f615-1698-4280-96e4-fa23161380fb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("96d735de-1587-4b46-bf31-2c645209f14d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSubProcess(this);
        else
          return null;
    }

}
