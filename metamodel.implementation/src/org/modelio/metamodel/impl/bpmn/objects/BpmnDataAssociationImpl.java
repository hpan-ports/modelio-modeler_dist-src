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
    @objid ("9e9dc4b5-7e07-4759-a354-8975a77bf9e6")
    @Override
    public String getAssignment() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt());
    }

    @objid ("1a0bc876-548a-4aa8-9f6b-e4e8dabefddf")
    @Override
    public void setAssignment(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.AssignmentAtt(), value);
    }

    @objid ("18a8dd74-b6fd-403f-91dd-3e5f45a2674c")
    @Override
    public String getTransfomation() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt());
    }

    @objid ("9b8da833-e523-47f1-90f4-09af20f231dc")
    @Override
    public void setTransfomation(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.TransfomationAtt(), value);
    }

    @objid ("ed59d7be-43b5-4033-b724-df1a38a98a82")
    @Override
    public String getLanguage() {
        return (String) getAttVal(BpmnDataAssociationData.Metadata.LanguageAtt());
    }

    @objid ("85580209-f9f3-493b-8cbc-77474df436ce")
    @Override
    public void setLanguage(String value) {
        setAttVal(BpmnDataAssociationData.Metadata.LanguageAtt(), value);
    }

    @objid ("d696f933-0cb9-453e-a134-0785552037f3")
    @Override
    public EList<BpmnItemAwareElement> getSourceRef() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.SourceRefDep());
    }

    @objid ("cf60d05d-6d37-46b8-9be9-7343f94b6091")
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

    @objid ("453fdbbe-0c81-44d6-bda1-ffff872c6c97")
    @Override
    public BpmnItemAwareElement getTargetRef() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataAssociationData.Metadata.TargetRefDep());
    }

    @objid ("8535388e-ed49-4c23-bb4b-4996ae65d130")
    @Override
    public void setTargetRef(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataAssociationData.Metadata.TargetRefDep(), (SmObjectImpl)value);
    }

    @objid ("61ce0ea9-6198-4e3f-8aa5-2f5e20bc0a1d")
    @Override
    public BpmnActivity getEndingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep());
    }

    @objid ("43cad146-52a5-4be4-b634-2853e99263ca")
    @Override
    public void setEndingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("b3526e14-de4c-4d09-9b1a-41f8b7858e0b")
    @Override
    public BpmnActivity getStartingActivity() {
        return (BpmnActivity) getDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep());
    }

    @objid ("e7554409-46a1-4fad-85bc-62d328f2e413")
    @Override
    public void setStartingActivity(BpmnActivity value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingActivityDep(), (SmObjectImpl)value);
    }

    @objid ("3448cf9a-c923-41cf-adde-576b65c97e96")
    @Override
    public BpmnThrowEvent getStartingEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataAssociationData.Metadata.StartingEventDep());
    }

    @objid ("e6aea8a4-8f55-44c9-96f1-4df9739436cc")
    @Override
    public void setStartingEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.StartingEventDep(), (SmObjectImpl)value);
    }

    @objid ("e1c00870-dcba-4e6c-93e3-3781176f9d27")
    @Override
    public EList<BpmnSequenceFlowDataAssociation> getVisualShortCut() {
        return new SmList<>(this, BpmnDataAssociationData.Metadata.VisualShortCutDep());
    }

    @objid ("9b41bdca-983e-431f-8579-194e39b97cce")
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

    @objid ("6b5d6d52-a51a-4fac-8f33-f6c150da792e")
    @Override
    public BpmnCatchEvent getEndingEvent() {
        return (BpmnCatchEvent) getDepVal(BpmnDataAssociationData.Metadata.EndingEventDep());
    }

    @objid ("ec21179a-5b97-4f40-aa71-54003d9bcbdc")
    @Override
    public void setEndingEvent(BpmnCatchEvent value) {
        appendDepVal(BpmnDataAssociationData.Metadata.EndingEventDep(), (SmObjectImpl)value);
    }

    @objid ("3f3bd8ca-6c44-4deb-b281-af7a427121bc")
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

    @objid ("95ec5513-c8a1-4d24-b415-dacc1a28517a")
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

    @objid ("fde10236-a01b-40db-ade8-76faa48be400")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataAssociation(this);
        else
          return null;
    }

}
