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
    @objid ("99b5d8d5-817c-4ae6-bef6-b0d56a187e17")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InformationFlowData.Metadata.OwnerDep());
    }

    @objid ("8cb3cb9a-c770-4cf6-9fb0-87d3960c45d6")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InformationFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("38e02ed3-7a65-45d1-aa06-9165454e1c84")
    @Override
    public EList<ModelElement> getInformationSource() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationSourceDep());
    }

    @objid ("839d15f6-8881-42c2-a583-d2216ab07b82")
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

    @objid ("8bd7e56f-aa70-4a97-974c-ab4482bf5cd0")
    @Override
    public EList<ModelElement> getInformationTarget() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationTargetDep());
    }

    @objid ("d785a2e5-4369-48cf-887d-5eeb551142e0")
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

    @objid ("cd35ef19-be32-4d76-9393-55071af9e82a")
    @Override
    public EList<ActivityEdge> getRealizingActivityEdge() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingActivityEdgeDep());
    }

    @objid ("587cc6ec-76b2-401f-9fbd-d29977b0e01b")
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

    @objid ("8de6da9c-1564-4550-ac51-058406d80006")
    @Override
    public EList<CommunicationMessage> getRealizingCommunicationMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingCommunicationMessageDep());
    }

    @objid ("bdb5d21a-16a3-41dd-953c-e49ce8be72b4")
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

    @objid ("792f17c1-cd75-44d6-801d-4fa5616b6247")
    @Override
    public EList<StructuralFeature> getRealizingFeature() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingFeatureDep());
    }

    @objid ("1850226f-a93d-4f50-add2-87b39d57e868")
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

    @objid ("336f3952-764e-4787-8a72-b34bb8de1435")
    @Override
    public EList<LinkEnd> getRealizingLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingLinkDep());
    }

    @objid ("a9999c33-ffca-44d7-a79c-505f941a90e6")
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

    @objid ("0661a5d1-14a7-48bb-910e-eaa9193c3422")
    @Override
    public EList<Message> getRealizingMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingMessageDep());
    }

    @objid ("1dcc8440-7cd6-404a-887c-ba3c17bb76e2")
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

    @objid ("a10bfbf0-c35c-4b92-8af7-a3db1acb140c")
    @Override
    public EList<NaryLink> getRealizingNaryLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingNaryLinkDep());
    }

    @objid ("51fe062f-26e1-4b97-9a04-09c4957fa054")
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

    @objid ("ddbbed9e-68fb-44c0-92ee-944230beaa54")
    @Override
    public EList<Classifier> getConveyed() {
        return new SmList<>(this, InformationFlowData.Metadata.ConveyedDep());
    }

    @objid ("ae6a566d-459d-4106-8a84-42162c72f85d")
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

    @objid ("fbc08796-da3c-4f39-9c8f-a0333e2eb373")
    @Override
    public AssociationEnd getChannel() {
        return (AssociationEnd) getDepVal(InformationFlowData.Metadata.ChannelDep());
    }

    @objid ("bd10b925-4f38-4be5-ba16-5b125d9555f7")
    @Override
    public void setChannel(AssociationEnd value) {
        appendDepVal(InformationFlowData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("1853314d-d701-4046-b9db-12e647022848")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4abed4ac-c6bf-475c-880b-231ec9ffc2a7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InformationFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("68be2266-6b79-4814-a807-6a291fc1cfd2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInformationFlow(this);
        else
          return null;
    }

}
