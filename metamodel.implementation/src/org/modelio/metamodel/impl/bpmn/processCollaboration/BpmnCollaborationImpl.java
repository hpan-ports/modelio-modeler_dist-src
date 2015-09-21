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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0073fd98-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCollaborationImpl extends BpmnRootElementImpl implements BpmnCollaboration {
    @objid ("546180be-67ec-46fb-b39a-fe1504286238")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(((BpmnCollaborationSmClass)getClassOf()).getIsClosedAtt());
    }

    @objid ("ce65b6bb-e787-49af-af66-34b855107472")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(((BpmnCollaborationSmClass)getClassOf()).getIsClosedAtt(), value);
    }

    @objid ("efa1f8be-013a-498b-81b5-6353e5ae75b8")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, ((BpmnCollaborationSmClass)getClassOf()).getArtifactDep());
    }

    @objid ("24bed5d8-552a-47cf-8e31-0c23fd3e3444")
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

    @objid ("4f633e36-191e-490f-bb72-8c20cb2ec356")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, ((BpmnCollaborationSmClass)getClassOf()).getMessageFlowDep());
    }

    @objid ("5817f4e6-b879-4d4a-8d50-2266ecb12d8a")
    @Override
    public <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessageFlow element : getMessageFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("06f79f94-c435-4336-9cc8-779f4643cb48")
    @Override
    public EList<BpmnParticipant> getParticipants() {
        return new SmList<>(this, ((BpmnCollaborationSmClass)getClassOf()).getParticipantsDep());
    }

    @objid ("61380c30-fd07-4a55-a5fd-de758bcf2a13")
    @Override
    public <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnParticipant element : getParticipants()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e9d46273-b118-4110-baf4-6cc5d8127da4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6857757e-3116-4391-9de7-285ade205e11")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("fab386b6-fccc-433b-9931-cfa5cf657765")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCollaboration(this);
        else
          return null;
    }

}
