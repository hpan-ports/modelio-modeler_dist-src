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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006399b2-c4bf-1fd8-97fe-001ec947cd2a")
public class InformationFlowImpl extends ModelElementImpl implements InformationFlow {
    @objid ("968493fa-f01b-4868-bc06-4c5f62ea2767")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InformationFlowData.Metadata.OwnerDep());
    }

    @objid ("2d520e3d-1dcd-42d4-90e7-9624d5000e2d")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InformationFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("992dd138-8d73-4a3b-8c0e-641005ac75d6")
    @Override
    public EList<ModelElement> getInformationSource() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationSourceDep());
    }

    @objid ("bc958569-efd9-4da1-b8a0-c8dbba61816a")
    @Override
    public <T extends ModelElement> List<T> getInformationSource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getInformationSource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d9544cb4-1db4-4354-8dc6-f92f1a5a3042")
    @Override
    public EList<ModelElement> getInformationTarget() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationTargetDep());
    }

    @objid ("d22371be-422a-4e7f-866e-2d9e5fc73abd")
    @Override
    public <T extends ModelElement> List<T> getInformationTarget(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getInformationTarget()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c6f2f8a-a2cf-4e59-9157-d4f0695ddfbb")
    @Override
    public EList<ActivityEdge> getRealizingActivityEdge() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingActivityEdgeDep());
    }

    @objid ("6d696ec3-5f72-44a3-8018-677373888927")
    @Override
    public <T extends ActivityEdge> List<T> getRealizingActivityEdge(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getRealizingActivityEdge()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f38ae96f-7b4b-4988-ae1c-60451edb079d")
    @Override
    public EList<CommunicationMessage> getRealizingCommunicationMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingCommunicationMessageDep());
    }

    @objid ("e15c7b6e-3664-461f-8e04-85cb621614e0")
    @Override
    public <T extends CommunicationMessage> List<T> getRealizingCommunicationMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getRealizingCommunicationMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6c731c4c-daa0-4133-ac49-c2468d8a0b9f")
    @Override
    public EList<StructuralFeature> getRealizingFeature() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingFeatureDep());
    }

    @objid ("958ce28f-d43a-4791-8532-794d358abfa6")
    @Override
    public <T extends StructuralFeature> List<T> getRealizingFeature(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final StructuralFeature element : getRealizingFeature()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e7749683-5146-47b6-8de6-26049581e126")
    @Override
    public EList<LinkEnd> getRealizingLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingLinkDep());
    }

    @objid ("185ed138-0455-48c0-bec9-21b600afe400")
    @Override
    public <T extends LinkEnd> List<T> getRealizingLink(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getRealizingLink()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ff377c41-b638-487f-9785-16cbc78bd464")
    @Override
    public EList<Message> getRealizingMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingMessageDep());
    }

    @objid ("7994ee28-325a-4807-acdf-de0d5ae8ec0f")
    @Override
    public <T extends Message> List<T> getRealizingMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Message element : getRealizingMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d52c4aeb-80a8-4ea7-929b-bc996db7588a")
    @Override
    public EList<NaryLink> getRealizingNaryLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingNaryLinkDep());
    }

    @objid ("5d4fbee2-5f61-4f73-81af-c0122c7c5234")
    @Override
    public <T extends NaryLink> List<T> getRealizingNaryLink(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLink element : getRealizingNaryLink()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d94c18d8-73ea-488a-aa96-05ecafb64223")
    @Override
    public EList<Classifier> getConveyed() {
        return new SmList<>(this, InformationFlowData.Metadata.ConveyedDep());
    }

    @objid ("d1a855ec-036a-418c-8c9f-a9caaf49b98b")
    @Override
    public <T extends Classifier> List<T> getConveyed(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Classifier element : getConveyed()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8076f6fa-b017-4ab0-b378-fbca0f68f95a")
    @Override
    public AssociationEnd getChannel() {
        return (AssociationEnd) getDepVal(InformationFlowData.Metadata.ChannelDep());
    }

    @objid ("e9548bd9-b4e5-43c5-ab8d-7ebd53b9d980")
    @Override
    public void setChannel(AssociationEnd value) {
        appendDepVal(InformationFlowData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("f61c3a55-661a-44a6-ba9b-8c912276191c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0a2f71e4-0d8a-4943-93ad-86063947bb09")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InformationFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("02e3e852-e7aa-4129-9acc-294cd3ce7f79")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInformationFlow(this);
        else
          return null;
    }

}
