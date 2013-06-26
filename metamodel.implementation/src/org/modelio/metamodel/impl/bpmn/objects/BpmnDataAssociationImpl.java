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
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0004abfa-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataAssociationImpl extends BpmnBaseElementImpl implements BpmnDataAssociation {
    @objid ("8b779c68-3a1a-42f5-a401-ba3ba94a191c")
    @Override
    public String getAssignment() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt());
    }

    @objid ("00a4d8dd-2d9d-491f-a93a-7b57d5083c67")
    @Override
    public void setAssignment(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt(), value);
    }

    @objid ("7769cc15-8de2-450a-927e-b49dbca2a811")
    @Override
    public String getTransfomation() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt());
    }

    @objid ("2e204075-d8f0-4fe3-a50e-94901402b065")
    @Override
    public void setTransfomation(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt(), value);
    }

    @objid ("50b45bec-ee0a-4504-b4dc-4fefd34fe47f")
    @Override
    public String getLanguage() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.LanguageAtt());
    }

    @objid ("b3bb4831-c896-45ee-94cb-b97ed2a43e28")
    @Override
    public void setLanguage(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.LanguageAtt(), value);
    }

    @objid ("a04c2841-e15a-4c67-b82c-5ae9835b5897")
    @Override
    public EList<BpmnItemAwareElement> getSourceRef() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.SourceRefDep());
    }

    @objid ("e351f2f0-c6a4-4894-bdc2-cf843cab0aa5")
    @Override
    public <T extends BpmnItemAwareElement> List<T> getSourceRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnItemAwareElement element : getSourceRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e13b88f5-5d12-428f-adfa-7a505efd4237")
    @Override
    public BpmnItemAwareElement getTargetRef() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataAssociationData.Metadata.TargetRefDep());
    }

    @objid ("f34ea733-2e55-494f-bfe3-93a37bb6ed2a")
    @Override
    public void setTargetRef(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("7e5c31a6-bddf-44cc-958a-a78ae15218a5")
    @Override
    public BpmnActivity getEndingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
    }

    @objid ("82ead37c-1d51-4520-8324-01a9b8816574")
    @Override
    public void setEndingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("a08710f0-6303-4b4d-8f4d-7ba8386b92d3")
    @Override
    public BpmnActivity getStartingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
    }

    @objid ("e38885e2-1f1b-492d-be6a-63b25274e021")
    @Override
    public void setStartingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("a1715d5c-80a7-4e6d-b517-e75fd81d3a59")
    @Override
    public BpmnThrowEvent getStartingEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
    }

    @objid ("e2215d5f-44c4-4c38-a594-6ab65b700740")
    @Override
    public void setStartingEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), (SmObjectImpl)value);
    }

    @objid ("74b5bda5-a53b-46d6-a472-4ebdda8ca5cc")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getVisualShortCut() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.VisualShortCutDep());
    }

    @objid ("2639cef2-bbd4-4211-b533-9670cbfd8cf5")
    @Override
    public <T extends BpmnSequenceFlowDataAssociation> List<T> getVisualShortCut(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlowDataAssociation element : getVisualShortCut()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b27bdca3-0e27-4d53-83ca-5ea49f34edf8")
    @Override
    public BpmnCatchEvent getEndingEvent() {
        return (BpmnCatchEvent) getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
    }

    @objid ("dde3257a-e171-4541-8630-0bd4aff41490")
    @Override
    public void setEndingEvent(BpmnCatchEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), (SmObjectImpl)value);
    }

    @objid ("f1c59c21-faaf-4dd5-adb5-181c3216792b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bc4f7704-bc7f-4208-8286-752b9fd7a7c0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1e8109f9-476e-4572-b0a9-d464d176e4dc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataAssociation(this);
        else
          return null;
    }

}
