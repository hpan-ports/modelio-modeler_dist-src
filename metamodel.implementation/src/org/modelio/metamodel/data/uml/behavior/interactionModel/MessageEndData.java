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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageEndImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("004a25fe-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MessageEnd.class, factory=MessageEndData.Metadata.ObjectFactory.class)
public abstract class MessageEndData extends OccurrenceSpecificationData {
    @objid ("664fbe83-c9c6-479f-9329-1ff0b242f8cf")
    @SmaMetaAssociation(metaName="ReceivedMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.ReceivedMessageSmDependency.class, istodelete = true)
     SmObjectImpl mReceivedMessage;

    @objid ("b77951d5-9461-46da-babc-f4a5dc7d897b")
    @SmaMetaAssociation(metaName="SentMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.SentMessageSmDependency.class, component = true, istodelete = true)
     SmObjectImpl mSentMessage;

    @objid ("1501d352-334e-4e6b-9043-4d0abc3e04b5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004ad490-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("55499886-18a8-4c6c-8628-1323419f7717")
        private static SmClass smClass = null;

        @objid ("f2933145-9817-490e-a547-5a35a726ab81")
        private static SmDependency ReceivedMessageDep = null;

        @objid ("db1b3dc1-edf5-46d8-b542-4fd9fb1b03d1")
        private static SmDependency SentMessageDep = null;

        @objid ("67c35737-a19c-4851-b065-c03bfc5e9df9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1c660a42-9d86-48df-866a-493c71972d62")
        public static SmDependency ReceivedMessageDep() {
            if (ReceivedMessageDep == null) {
            	ReceivedMessageDep = classof().getDependencyDef("ReceivedMessage");
            }
            return ReceivedMessageDep;
        }

        @objid ("900c0840-ca51-4463-8e75-8a2be033ba48")
        public static SmDependency SentMessageDep() {
            if (SentMessageDep == null) {
            	SentMessageDep = classof().getDependencyDef("SentMessage");
            }
            return SentMessageDep;
        }

        @objid ("099a8bd4-f9d4-4d2d-b01d-8e94c5f210d3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2a5496cc-865c-44c7-8ae9-ed2fc069f070")
        public static SmDependency getSentMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentMessageDep;
        }

        @objid ("66ff1738-8a04-45b1-9110-2f7eb2fdbee1")
        public static SmDependency getReceivedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedMessageDep;
        }

        @objid ("004b1676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0d1dcf93-4d5a-4736-8188-25d4b6dc80a2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c44629a0-65a1-4114-8151-2dc0092fc0fa")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004b7850-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentMessageSmDependency extends SmSingleDependency {
            @objid ("f8735a4d-abde-45af-8833-1c87bd8f4187")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mSentMessage;
            }

            @objid ("ba0bbd60-c2b3-4335-90db-7fe9da2c06da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mSentMessage = value;
            }

            @objid ("5ceb7108-bc61-40cf-8bc5-962a040f0af5")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SendEventDep();
            }

        }

        @objid ("004beefc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedMessageSmDependency extends SmSingleDependency {
            @objid ("e20cc005-5391-4f44-9b03-fb33acae26fa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mReceivedMessage;
            }

            @objid ("d537b1dd-b715-4584-bfae-d0a461a90bf6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mReceivedMessage = value;
            }

            @objid ("5c740a78-9a8b-43c3-b98d-a1a02e7d3ece")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.ReceiveEventDep();
            }

        }

    }

}
