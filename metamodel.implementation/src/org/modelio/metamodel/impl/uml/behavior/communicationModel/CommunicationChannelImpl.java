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
    @objid ("d3e97147-6c07-449f-8ddc-f46c2957ea7d")
    @Override
    public EList<CommunicationMessage> getStartToEndMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.StartToEndMessageDep());
    }

    @objid ("ed20fedd-a025-4968-a661-c60a0d1c8121")
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

    @objid ("87143ae8-271c-42aa-933f-65f0c035a320")
    @Override
    public Link getChannel() {
        return (Link) getDepVal(CommunicationChannelData.Metadata.ChannelDep());
    }

    @objid ("43b77146-56fc-46c8-8ea5-e3858ad5d2c6")
    @Override
    public void setChannel(Link value) {
        appendDepVal(CommunicationChannelData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("40c68558-9c09-4f1f-8c77-8c47bf19655e")
    @Override
    public CommunicationNode getStart() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.StartDep());
    }

    @objid ("3b9ce116-3d2c-42bb-a5cd-f55063d5b3cc")
    @Override
    public void setStart(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("e452e8d6-6793-4004-a42e-847527c784e3")
    @Override
    public NaryLink getNaryChannel() {
        return (NaryLink) getDepVal(CommunicationChannelData.Metadata.NaryChannelDep());
    }

    @objid ("eb815614-dae0-42e0-8191-38977bcf9619")
    @Override
    public void setNaryChannel(NaryLink value) {
        appendDepVal(CommunicationChannelData.Metadata.NaryChannelDep(), (SmObjectImpl)value);
    }

    @objid ("7e1dc343-5d02-4dd6-a3f5-39e099ccb46e")
    @Override
    public EList<CommunicationMessage> getEndToStartMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.EndToStartMessageDep());
    }

    @objid ("99e0ea1c-4355-4084-bcf0-1c81614d84c2")
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

    @objid ("db355a6e-2b27-4ebc-a21e-4d3b63e4601c")
    @Override
    public CommunicationNode getEnd() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.EndDep());
    }

    @objid ("52066aac-c19a-485f-8c20-417d1b520fdb")
    @Override
    public void setEnd(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.EndDep(), (SmObjectImpl)value);
    }

    @objid ("7184dd6b-8426-4b66-9d0e-4371a6deb9b4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("181cab47-d36f-4676-b9a0-04ee9b7b469f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return new SmDepVal(CommunicationChannelData.Metadata.StartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a391246e-62c7-4027-9c83-e1bbae587fe2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationChannel(this);
        else
          return null;
    }

}
