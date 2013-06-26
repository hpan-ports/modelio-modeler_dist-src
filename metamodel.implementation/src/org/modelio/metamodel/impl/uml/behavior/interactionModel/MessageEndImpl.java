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
    @objid ("8a5b563c-5f18-4d4b-92db-1c8217a3bff9")
    @Override
    public Message getReceivedMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.ReceivedMessageDep());
    }

    @objid ("7a73f6b7-1711-4c12-b64c-409985ed9369")
    @Override
    public void setReceivedMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.ReceivedMessageDep(), (SmObjectImpl)value);
    }

    @objid ("ce56379d-ee72-4298-a0b6-775db5a691ae")
    @Override
    public Message getSentMessage() {
        return (Message) getDepVal(MessageEndData.Metadata.SentMessageDep());
    }

    @objid ("85739a5f-9890-4b9b-b239-d655001390bf")
    @Override
    public void setSentMessage(Message value) {
        appendDepVal(MessageEndData.Metadata.SentMessageDep(), (SmObjectImpl)value);
    }

    @objid ("2efaede5-0e7a-4e4a-87ad-d8faba762da3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("71818b4c-b43c-4552-a4e7-d1e2a91979e9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d80edac6-7e52-4e8f-bda6-be5ead299802")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageEnd(this);
        else
          return null;
    }

}
