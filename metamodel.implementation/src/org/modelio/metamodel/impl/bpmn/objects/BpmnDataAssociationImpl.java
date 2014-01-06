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
    @objid ("2cbf8c40-60c3-4fb0-b1c0-82e505eaa620")
    @Override
    public String getAssignment() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt());
    }

    @objid ("f1b8d1e5-cce8-4443-ae6d-0e5794c26ad5")
    @Override
    public void setAssignment(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt(), value);
    }

    @objid ("db98ba6f-681c-4d25-8dae-9ef0c64c4470")
    @Override
    public String getTransfomation() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt());
    }

    @objid ("495086d2-88d0-48a1-bac7-66711538ca45")
    @Override
    public void setTransfomation(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt(), value);
    }

    @objid ("8acce7a3-bc4b-4fc6-bad4-281c40b12755")
    @Override
    public String getLanguage() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.LanguageAtt());
    }

    @objid ("09f5f47e-acc5-42b0-9b99-9f9cd8cea9f2")
    @Override
    public void setLanguage(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.LanguageAtt(), value);
    }

    @objid ("b292ba8b-c915-409b-be08-381bbbcf7272")
    @Override
    public EList<BpmnItemAwareElement> getSourceRef() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.SourceRefDep());
    }

    @objid ("f505a378-a121-4351-a329-cd3a7412cb3f")
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

    @objid ("219fe303-43f3-4caf-9a80-6d5d8aad79f0")
    @Override
    public BpmnItemAwareElement getTargetRef() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataAssociationData.Metadata.TargetRefDep());
    }

    @objid ("38f52005-da1c-4dcb-95df-28833b4747e9")
    @Override
    public void setTargetRef(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("5cd594c9-9551-494e-a183-8a2e2e0252e5")
    @Override
    public BpmnActivity getEndingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
    }

    @objid ("4b0561d6-b2fa-4456-82ec-e40002612408")
    @Override
    public void setEndingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("b68b205d-e986-4c6b-89d2-9dabe2ac1f32")
    @Override
    public BpmnActivity getStartingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
    }

    @objid ("de9278b2-4a38-41a3-ba25-e95b34ac794d")
    @Override
    public void setStartingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("de5e6c03-a303-48e9-afc8-09bee90995a0")
    @Override
    public BpmnThrowEvent getStartingEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
    }

    @objid ("4aad7571-700d-4efd-bbe3-e6d6e295b175")
    @Override
    public void setStartingEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), (SmObjectImpl)value);
    }

    @objid ("f470f951-640e-4641-8165-0254383ae56c")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getVisualShortCut() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.VisualShortCutDep());
    }

    @objid ("16da21b8-ca55-426f-8977-ba75342a7b13")
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

    @objid ("f31c3072-887d-4f54-ab04-522ff17fb8c3")
    @Override
    public BpmnCatchEvent getEndingEvent() {
        return (BpmnCatchEvent) getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
    }

    @objid ("70970582-f3c2-43d0-a766-9cac68d66814")
    @Override
    public void setEndingEvent(BpmnCatchEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), (SmObjectImpl)value);
    }

    @objid ("f3ba58c6-0a2c-4a96-80c1-25ac4942b75e")
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

    @objid ("8f81e259-1ad0-4522-aa8e-d40ed9e19f58")
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

    @objid ("29956714-a794-4b43-84ae-43e2a9caaf76")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataAssociation(this);
        else
          return null;
    }

}
