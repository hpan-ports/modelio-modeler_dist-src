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
    @objid ("c586e298-f067-43e4-add8-690c73c0cb74")
    @Override
    public Message getReceivedMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.ReceivedMessageDep());
    }

    @objid ("1f6fd841-bcf9-425d-ac8a-b8cc92b80bde")
    @Override
    public void setReceivedMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.ReceivedMessageDep(), (SmObjectImpl)value);
    }

    @objid ("3bd347ee-cbe0-4239-8efa-c15e9a243743")
    @Override
    public Message getSentMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.SentMessageDep());
    }

    @objid ("0cf2e9b0-1a30-4752-b181-a278a30e4f10")
    @Override
    public void setSentMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.SentMessageDep(), (SmObjectImpl)value);
    }

    @objid ("dd87ce09-54d1-4f8d-8920-b4622bf6d3be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1d7d91ac-c9bc-4528-a4e9-e1015e64823c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6fa3353a-45f6-471c-82c5-572ed63abb61")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageEnd(this);
        else
          return null;
    }

}
