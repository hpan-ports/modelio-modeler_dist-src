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
    @objid ("f391f3f7-a4f4-4e29-9708-53c2076c5804")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(InformationFlowData.Metadata.OwnerDep());
    }

    @objid ("dedc9c95-87b8-43d0-a0cd-bc4ca4580f8a")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(InformationFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e19ccbfd-b84a-4396-87ac-4ad2aa77e4d4")
    @Override
    public EList<ModelElement> getInformationSource() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationSourceDep());
    }

    @objid ("385e601c-320f-4236-9d80-26e31bed3c38")
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

    @objid ("452ae2a1-7ad0-4fd7-99f0-930ef62dafbd")
    @Override
    public EList<ModelElement> getInformationTarget() {
        return new SmList<>(this, InformationFlowData.Metadata.InformationTargetDep());
    }

    @objid ("e02280eb-d707-4812-9a5d-3da873c6ff16")
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

    @objid ("b0f17419-c08b-4203-aa00-a59af005a7c4")
    @Override
    public EList<ActivityEdge> getRealizingActivityEdge() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingActivityEdgeDep());
    }

    @objid ("2ff88ce0-402b-4c1c-8969-9fd0b2d33298")
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

    @objid ("cc726d50-d173-4972-bf6b-a4d5401a6f00")
    @Override
    public EList<CommunicationMessage> getRealizingCommunicationMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingCommunicationMessageDep());
    }

    @objid ("b2dc9bc6-7b4e-427a-9fac-206e85cfaa65")
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

    @objid ("049556b3-e85e-4fcc-b89e-9906102380a5")
    @Override
    public EList<StructuralFeature> getRealizingFeature() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingFeatureDep());
    }

    @objid ("b443bf7a-1680-4cf8-8aa8-4c65f42229f4")
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

    @objid ("3edbc7da-30f7-4795-bd1c-f2ff33602dbf")
    @Override
    public EList<LinkEnd> getRealizingLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingLinkDep());
    }

    @objid ("0cd24f67-24dc-48b6-aa75-2b005fc103e3")
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

    @objid ("972dd62e-d630-488f-8a13-6c536024ce75")
    @Override
    public EList<Message> getRealizingMessage() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingMessageDep());
    }

    @objid ("ac3e7650-e91d-4045-a561-ab320ce62f32")
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

    @objid ("dac0bf7a-d3db-49fd-9f7c-bd85fd3c47a8")
    @Override
    public EList<NaryLink> getRealizingNaryLink() {
        return new SmList<>(this, InformationFlowData.Metadata.RealizingNaryLinkDep());
    }

    @objid ("69e4d0fc-d4c8-460a-9741-00c5fcb5aa14")
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

    @objid ("f3190ef1-0eb6-4680-824b-e1c6fb599483")
    @Override
    public EList<Classifier> getConveyed() {
        return new SmList<>(this, InformationFlowData.Metadata.ConveyedDep());
    }

    @objid ("661a4de2-4f3d-47db-990c-8fd6ecfeaea1")
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

    @objid ("8c45e849-8172-4b55-a8a1-a2c7693333e5")
    @Override
    public AssociationEnd getChannel() {
        return (AssociationEnd) getDepVal(InformationFlowData.Metadata.ChannelDep());
    }

    @objid ("4bfbf6ae-5557-4e40-8921-be0d1a8f257a")
    @Override
    public void setChannel(AssociationEnd value) {
        appendDepVal(InformationFlowData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("91bdb674-e989-4355-b533-5f2c2a6b1cff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4e6936e9-293d-42f9-bb79-4c0335278f75")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InformationFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(InformationFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("35a9007f-b8cf-498e-bc9f-7f8f6b681ee1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInformationFlow(this);
        else
          return null;
    }

}
