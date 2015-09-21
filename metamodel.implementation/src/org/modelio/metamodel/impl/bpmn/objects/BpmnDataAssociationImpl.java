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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0004abfa-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataAssociationImpl extends BpmnBaseElementImpl implements BpmnDataAssociation {
    @objid ("40f6c948-57ac-4f4c-bb4e-8bde9ac00615")
    @Override
    public String getAssignment() {
        return (String) getAttVal(((BpmnDataAssociationSmClass)getClassOf()).getAssignmentAtt());
    }

    @objid ("43d99866-ec28-43d9-b743-76a9bb9dd690")
    @Override
    public void setAssignment(String value) {
        setAttVal(((BpmnDataAssociationSmClass)getClassOf()).getAssignmentAtt(), value);
    }

    @objid ("ec5d5e1c-e075-4a24-a9d6-d312be0fb199")
    @Override
    public String getTransfomation() {
        return (String) getAttVal(((BpmnDataAssociationSmClass)getClassOf()).getTransfomationAtt());
    }

    @objid ("ddd58a1e-3ee6-4918-b46b-2fac6607601c")
    @Override
    public void setTransfomation(String value) {
        setAttVal(((BpmnDataAssociationSmClass)getClassOf()).getTransfomationAtt(), value);
    }

    @objid ("604d9fdc-22a3-4fa8-8c8e-1129c5fffdaa")
    @Override
    public String getLanguage() {
        return (String) getAttVal(((BpmnDataAssociationSmClass)getClassOf()).getLanguageAtt());
    }

    @objid ("d5e1c5a8-ae81-47d9-9a4a-e62519d7ad34")
    @Override
    public void setLanguage(String value) {
        setAttVal(((BpmnDataAssociationSmClass)getClassOf()).getLanguageAtt(), value);
    }

    @objid ("85a400c3-93aa-48ec-88cb-9e25161651b6")
    @Override
    public EList<BpmnItemAwareElement> getSourceRef() {
        return new SmList<>(this, ((BpmnDataAssociationSmClass)getClassOf()).getSourceRefDep());
    }

    @objid ("bd8a5300-ea56-436d-8889-b6eeefdd70ce")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnItemAwareElement element : getSourceRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("929ababa-a45d-4b82-bdce-2c2316d605e3")
    @Override
    public BpmnItemAwareElement getTargetRef() {
        Object obj = getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getTargetRefDep());
        return (obj instanceof BpmnItemAwareElement)? (BpmnItemAwareElement)obj : null;
    }

    @objid ("d6f7c936-b2d7-4320-b139-d6faaf36f1b6")
    @Override
    public void setTargetRef(BpmnItemAwareElement value) {
        appendDepVal(((BpmnDataAssociationSmClass)getClassOf()).getTargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("b1521fe0-a022-43a1-8e99-6bf82edda6d7")
    @Override
    public BpmnActivity getEndingActivity() {
        Object obj = getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingActivityDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("fa4bacb7-6ab3-446a-b965-741008426a41")
    @Override
    public void setEndingActivity(BpmnActivity value) {
        appendDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("cce33cc2-67c5-453a-b765-b7c38ce1b6e9")
    @Override
    public BpmnActivity getStartingActivity() {
        Object obj = getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingActivityDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("2a613eaa-0813-4384-b9d3-16f8153220ce")
    @Override
    public void setStartingActivity(BpmnActivity value) {
        appendDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("c351c6dc-a04d-44b9-8245-b2a8fcd0e505")
    @Override
    public BpmnThrowEvent getStartingEvent() {
        Object obj = getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingEventDep());
        return (obj instanceof BpmnThrowEvent)? (BpmnThrowEvent)obj : null;
    }

    @objid ("ff0d803b-9ea9-4a60-9a9a-95e71f9a12a0")
    @Override
    public void setStartingEvent(BpmnThrowEvent value) {
        appendDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingEventDep(), (SmObjectImpl)value);
    }

    @objid ("57e35e62-68e1-4e3d-aae2-7b285577a529")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getVisualShortCut() {
        return new SmList<>(this, ((BpmnDataAssociationSmClass)getClassOf()).getVisualShortCutDep());
    }

    @objid ("3efee62d-13b7-4234-a841-9aaf3329c17e")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnSequenceFlowDataAssociation element : getVisualShortCut()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f571e68d-2f6f-4770-b3ca-776d6289c329")
    @Override
    public BpmnCatchEvent getEndingEvent() {
        Object obj = getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingEventDep());
        return (obj instanceof BpmnCatchEvent)? (BpmnCatchEvent)obj : null;
    }

    @objid ("fdd466b9-9ef9-45b4-b69e-be37300cea72")
    @Override
    public void setEndingEvent(BpmnCatchEvent value) {
        appendDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingEventDep(), (SmObjectImpl)value);
    }

    @objid ("8659807c-4143-488f-bd3b-54d0c942f944")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // EndingActivity
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingActivityDep());
        if (obj != null)
          return obj;
        // StartingActivity
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingActivityDep());
        if (obj != null)
          return obj;
        // StartingEvent
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getStartingEventDep());
        if (obj != null)
          return obj;
        // EndingEvent
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataAssociationSmClass)getClassOf()).getEndingEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("41e76fb1-b770-48e1-973e-69da384fcf60")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // EndingActivity
        dep = ((BpmnDataAssociationSmClass)getClassOf()).getEndingActivityDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // StartingActivity
        dep = ((BpmnDataAssociationSmClass)getClassOf()).getStartingActivityDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // StartingEvent
        dep = ((BpmnDataAssociationSmClass)getClassOf()).getStartingEventDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // EndingEvent
        dep = ((BpmnDataAssociationSmClass)getClassOf()).getEndingEventDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b86b8885-d3d1-48cc-a28d-86d2076dd4b4")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataAssociation(this);
        else
          return null;
    }

}
