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
    @objid ("b2474c2e-5acc-4162-a56b-cc33a0ef1be7")
    @Override
    public EList<CommunicationMessage> getStartToEndMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.StartToEndMessageDep());
    }

    @objid ("4f988229-8b42-4215-9291-b2a78e0e7eef")
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

    @objid ("aa1921af-85fa-4df2-97aa-64014438fc6c")
    @Override
    public Link getChannel() {
        return (Link) getDepVal(CommunicationChannelData.Metadata.ChannelDep());
    }

    @objid ("a5c8daf6-0ec0-47e3-a000-1de50ac604f9")
    @Override
    public void setChannel(Link value) {
        appendDepVal(CommunicationChannelData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("124fed98-ad18-4e13-a7e3-b0eb186eab8f")
    @Override
    public CommunicationNode getStart() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.StartDep());
    }

    @objid ("cd588979-5330-4e77-a1e8-e6f930063c18")
    @Override
    public void setStart(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("0bd595d0-4806-4e42-953f-8ba538c56c0e")
    @Override
    public NaryLink getNaryChannel() {
        return (NaryLink) getDepVal(CommunicationChannelData.Metadata.NaryChannelDep());
    }

    @objid ("41509892-6baf-4060-bee6-74c30c8b0201")
    @Override
    public void setNaryChannel(NaryLink value) {
        appendDepVal(CommunicationChannelData.Metadata.NaryChannelDep(), (SmObjectImpl)value);
    }

    @objid ("f6ba58d0-e336-4896-98dd-8e1d69ebe58b")
    @Override
    public EList<CommunicationMessage> getEndToStartMessage() {
        return new SmList<>(this, CommunicationChannelData.Metadata.EndToStartMessageDep());
    }

    @objid ("f4d7b6b8-c86f-4355-b562-95fd5422e3d1")
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

    @objid ("91a3a32a-1b22-4250-9c45-30ed13ca5317")
    @Override
    public CommunicationNode getEnd() {
        return (CommunicationNode) getDepVal(CommunicationChannelData.Metadata.EndDep());
    }

    @objid ("08812050-216d-47b8-89e5-90d13e8f071f")
    @Override
    public void setEnd(CommunicationNode value) {
        appendDepVal(CommunicationChannelData.Metadata.EndDep(), (SmObjectImpl)value);
    }

    @objid ("6fbba531-0061-4cae-a5b1-ad64a7e22c60")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("195f60ee-d5b8-4bf8-87ae-eab0435e8387")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationChannelData.Metadata.StartDep());
        if (obj != null)
          return new SmDepVal(CommunicationChannelData.Metadata.StartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("22ac4316-9fb7-4444-9aaa-5667c1778ae7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationChannel(this);
        else
          return null;
    }

}
