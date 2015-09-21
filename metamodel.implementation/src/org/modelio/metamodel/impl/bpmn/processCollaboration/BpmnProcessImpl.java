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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessData;
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

@objid ("0076549e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnProcessImpl extends BpmnRootElementImpl implements BpmnProcess {
    @objid ("16962a7e-9688-42d2-b28c-1c6d6b3fc66d")
    @Override
    public BpmnProcessType getProcessType() {
        return (BpmnProcessType) getAttVal(((BpmnProcessSmClass)getClassOf()).getProcessTypeAtt());
    }

    @objid ("18cdb352-c3e7-4f19-b0b5-5fef6baad861")
    @Override
    public void setProcessType(BpmnProcessType value) {
        setAttVal(((BpmnProcessSmClass)getClassOf()).getProcessTypeAtt(), value);
    }

    @objid ("97a83829-8f7b-4578-be10-b9949d0f5a69")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(((BpmnProcessSmClass)getClassOf()).getIsClosedAtt());
    }

    @objid ("bf41442b-abab-433a-9f96-a8b69c815cdb")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(((BpmnProcessSmClass)getClassOf()).getIsClosedAtt(), value);
    }

    @objid ("ce3d6d71-28c0-4544-8393-80c727d70821")
    @Override
    public OptionalBoolean getIsExecutable() {
        return (OptionalBoolean) getAttVal(((BpmnProcessSmClass)getClassOf()).getIsExecutableAtt());
    }

    @objid ("85da0de8-fb40-4b88-a5dd-5758a9e435c5")
    @Override
    public void setIsExecutable(OptionalBoolean value) {
        setAttVal(((BpmnProcessSmClass)getClassOf()).getIsExecutableAtt(), value);
    }

    @objid ("92c2f133-edd3-4066-83c7-44756e913922")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getCallerDep());
    }

    @objid ("cefb93d3-99bb-4d71-ad08-d8f9202af547")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnCallActivity element : getCaller()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2519a7a7-a745-4d0a-9a3b-6bcc354d7f30")
    @Override
    public EList<BpmnProcess> getSupports() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getSupportsDep());
    }

    @objid ("97cce341-3f51-4766-aeaa-921bc66d3bc2")
    @Override
    public <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnProcess element : getSupports()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fe4cb81e-f8f2-41b2-afbc-3c6e3ec76a57")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getArtifactDep());
    }

    @objid ("d379539c-ad50-4afa-a2b9-6e0c41c503c3")
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

    @objid ("b2170e6c-e9b1-4c5e-b088-36899ad110f8")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getLaneSetDep());
    }

    @objid ("51d2cc5d-365b-42c4-99aa-d90523ddd06b")
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

    @objid ("bd2bcfbb-d0ff-468e-9cf8-7e39b41c4631")
    @Override
    public EList<BpmnProcess> getSupported() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getSupportedDep());
    }

    @objid ("44482ac3-a947-4638-b213-58ec4f6a1151")
    @Override
    public <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnProcess element : getSupported()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("38e221d7-a82d-4b17-a31b-130d91ae652f")
    @Override
    public BpmnParticipant getParticipant() {
        Object obj = getDepVal(((BpmnProcessSmClass)getClassOf()).getParticipantDep());
        return (obj instanceof BpmnParticipant)? (BpmnParticipant)obj : null;
    }

    @objid ("fe575c3a-ef0a-4e67-9e7b-e952507dcf99")
    @Override
    public void setParticipant(BpmnParticipant value) {
        appendDepVal(((BpmnProcessSmClass)getClassOf()).getParticipantDep(), (SmObjectImpl)value);
    }

    @objid ("30e17f6d-d39a-452c-8437-c737d7ac5cd4")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getFlowElementDep());
    }

    @objid ("26dfc620-5b53-4865-b9c9-17d6eae9f8cd")
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

    @objid ("0dceccbd-4176-4f43-8873-c42c440e1e87")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, ((BpmnProcessSmClass)getClassOf()).getResourceDep());
    }

    @objid ("867af72b-8a92-4b04-a10c-7060d6e7e637")
    @Override
    public <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnResourceRole element : getResource()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5cde2629-3804-4c5b-8173-72a644062af3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("662eebc9-2f3d-49c4-92ff-8629b9c7ef10")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("f05b5338-4197-45fa-be17-ab8b58483c26")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnProcess(this);
        else
          return null;
    }

}
