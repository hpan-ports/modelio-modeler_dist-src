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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("007d9466-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnActivityImpl extends BpmnFlowNodeImpl implements BpmnActivity {
    @objid ("7e5946eb-49ed-4a48-8dfa-b83e0e4e6ad8")
    @Override
    public boolean isIsForCompensation() {
        return (Boolean) getAttVal(((BpmnActivitySmClass)getClassOf()).getIsForCompensationAtt());
    }

    @objid ("d55707c6-1455-44c0-b1e7-2990fd3a708b")
    @Override
    public void setIsForCompensation(boolean value) {
        setAttVal(((BpmnActivitySmClass)getClassOf()).getIsForCompensationAtt(), value);
    }

    @objid ("a36e7df0-8a64-4d36-acdc-94b4c7aca0d3")
    @Override
    public int getStartQuantity() {
        return (Integer) getAttVal(((BpmnActivitySmClass)getClassOf()).getStartQuantityAtt());
    }

    @objid ("5785ad6d-dfc9-4e24-a6a9-4c072427301b")
    @Override
    public void setStartQuantity(int value) {
        setAttVal(((BpmnActivitySmClass)getClassOf()).getStartQuantityAtt(), value);
    }

    @objid ("b125b5dc-de95-48a2-a5b5-bade83027002")
    @Override
    public int getCompletionQuantity() {
        return (Integer) getAttVal(((BpmnActivitySmClass)getClassOf()).getCompletionQuantityAtt());
    }

    @objid ("0a2a057d-39b1-402c-944b-9fdcbc800555")
    @Override
    public void setCompletionQuantity(int value) {
        setAttVal(((BpmnActivitySmClass)getClassOf()).getCompletionQuantityAtt(), value);
    }

    @objid ("8bc8855b-b03e-4a41-b614-47f0d528d23c")
    @Override
    public EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getCompensateEventDefinitionsDep());
    }

    @objid ("920a3671-6de7-45ff-b757-d27dd935b782")
    @Override
    public <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnCompensateEventDefinition element : getCompensateEventDefinitions()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3b562237-75c0-43f6-81c5-b79cfee6841f")
    @Override
    public EList<BpmnDataInput> getInputSpecification() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getInputSpecificationDep());
    }

    @objid ("830836dd-a886-426d-9744-39d5d17ee6ad")
    @Override
    public <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataInput element : getInputSpecification()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5a92868a-961b-4331-8c8c-6b4bcdf66552")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getDataInputAssociationDep());
    }

    @objid ("2bc38c57-40f4-412e-87dc-8e78fca8a7f7")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataAssociation element : getDataInputAssociation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("91888b44-f525-4509-be10-5c0d67f6e7ed")
    @Override
    public EList<BpmnDataOutput> getOutputSpecification() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getOutputSpecificationDep());
    }

    @objid ("bcb65a43-3def-4820-94c5-f3f039936594")
    @Override
    public <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataOutput element : getOutputSpecification()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0a0a86df-c245-4bad-9df7-e230e0841c3a")
    @Override
    public BpmnLoopCharacteristics getLoopCharacteristics() {
        Object obj = getDepVal(((BpmnActivitySmClass)getClassOf()).getLoopCharacteristicsDep());
        return (obj instanceof BpmnLoopCharacteristics)? (BpmnLoopCharacteristics)obj : null;
    }

    @objid ("6afd9e22-c7cb-45c7-800b-9862d00f2139")
    @Override
    public void setLoopCharacteristics(BpmnLoopCharacteristics value) {
        appendDepVal(((BpmnActivitySmClass)getClassOf()).getLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("c1bfcc36-a236-4c3a-99ed-a0a6e0cd36cd")
    @Override
    public EList<BpmnBoundaryEvent> getBoundaryEventRef() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getBoundaryEventRefDep());
    }

    @objid ("df1cb20a-3c6a-41cf-bfcc-3966bf775428")
    @Override
    public <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnBoundaryEvent element : getBoundaryEventRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a96928cc-2a95-475b-bdda-6066bfa83039")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, ((BpmnActivitySmClass)getClassOf()).getDataOutputAssociationDep());
    }

    @objid ("60a8dc91-1342-4e54-b8a0-aeb66ff6e2a3")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataAssociation element : getDataOutputAssociation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("29f96621-66fc-4691-a2d8-6596191834c7")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        Object obj = getDepVal(((BpmnActivitySmClass)getClassOf()).getDefaultFlowDep());
        return (obj instanceof BpmnSequenceFlow)? (BpmnSequenceFlow)obj : null;
    }

    @objid ("74000568-b985-4337-9aba-1bb510e2e040")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(((BpmnActivitySmClass)getClassOf()).getDefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("29e21c18-ac17-4f42-b4f8-cfdb348979ea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("55bb9f0f-05d6-4940-8125-738eba215c80")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("643f99a5-ad07-4110-bd74-f3f5275ada6b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnActivity(this);
        else
          return null;
    }

}
