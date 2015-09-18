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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("3d66beff-bc9e-42aa-84dd-28f34e3a9a10")
public class CommunicationChannelImpl extends ModelElementImpl implements CommunicationChannel {
    @objid ("c02c99d5-2303-4814-b7e2-c76627bffeb9")
    @Override
    public EList<CommunicationMessage> getStartToEndMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.StartToEndMessageDep());
    }

    @objid ("5b8eba79-8ce5-4823-9bdd-4a51f896fa5d")
    @Override
    public <T extends CommunicationMessage> List<T> getStartToEndMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getStartToEndMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b30549b4-a9d8-4c7c-a239-1344f6002093")
    @Override
    public Link getChannel() {
        return (Link) getDepVal(CommunicationChannelData.Metadata.ChannelDep());
    }

    @objid ("621221cd-a48f-4989-8545-56e56d2edaba")
    @Override
    public void setChannel(Link value) {
        appendDepVal(CommunicationChannelData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("e8925de8-79e3-48af-86e9-a1942ebf1882")
    @Override
    public CommunicationNode getStart() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.StartDep());
    }

    @objid ("43d7c503-b384-4561-891c-f7f10751f556")
    @Override
    public void setStart(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("19cd47dc-917e-4f19-9b75-33f09b555a26")
    @Override
    public NaryLink getNaryChannel() {
        return (NaryLink) getDepVal(CommunicationChannelData.Metadata.NaryChannelDep());
    }

    @objid ("a3b98283-6582-4379-a413-70456822aad2")
    @Override
    public void setNaryChannel(NaryLink value) {
        appendDepVal(CommunicationChannelData.Metadata.NaryChannelDep(), (SmObjectImpl)value);
    }

    @objid ("cd16fe5e-4a49-42cb-8a47-859aedabf448")
    @Override
    public EList<CommunicationMessage> getEndToStartMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.EndToStartMessageDep());
    }

    @objid ("8ca61bc9-329f-4fea-a8cd-3bfea4c10ae6")
    @Override
    public <T extends CommunicationMessage> List<T> getEndToStartMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getEndToStartMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6fbadd60-34c8-4945-ab60-f18f87601ded")
    @Override
    public CommunicationNode getEnd() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.EndDep());
    }

    @objid ("8101ff7d-b099-4fb2-a304-c13fae5f55ca")
    @Override
    public void setEnd(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.EndDep(), (SmObjectImpl)value);
    }

    @objid ("6145306e-ec0e-4a01-b3ff-999d6d237c8b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("937098ed-d9d5-4cdc-a85a-0a51b75a5439")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return new SmDepVal(CommunicationChannelData.Metadata.StartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ebb370a7-81e3-4b6a-9ce5-2e787f42b6ab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationChannel(this);
        else
          return null;
    }

}
