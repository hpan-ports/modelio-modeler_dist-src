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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageEndData;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0049f7c8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class MessageEndImpl extends OccurrenceSpecificationImpl implements MessageEnd {
    @objid ("7dc9c04b-5e6c-46f8-8a67-34067c922b56")
    @Override
    public Message getReceivedMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.ReceivedMessageDep());
    }

    @objid ("e4e3e8b0-b8eb-44dd-a8f3-5cc0f3af52e9")
    @Override
    public void setReceivedMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.ReceivedMessageDep(), (SmObjectImpl)value);
    }

    @objid ("a632f056-8d63-4751-a158-574f046cf3dd")
    @Override
    public Message getSentMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.SentMessageDep());
    }

    @objid ("a25e9fc1-a68d-480c-a9b9-867e13632956")
    @Override
    public void setSentMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.SentMessageDep(), (SmObjectImpl)value);
    }

    @objid ("a3d29150-bbf4-4d72-8feb-0f163c62e70d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3df54692-c106-4829-9d0e-dd03a7377c7b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3a358c39-a88d-42a4-81da-9ed5f43d7ef3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageEnd(this);
        else
          return null;
    }

}
