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
    @objid ("c1d16938-b227-4c59-b065-01aaf175db52")
    @SmaMetaAssociation(metaName="ReceivedMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.ReceivedMessageSmDependency.class, istodelete = true)
     SmObjectImpl mReceivedMessage;

    @objid ("2ac647cd-4ff4-4b21-9295-45502b66b735")
    @SmaMetaAssociation(metaName="SentMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.SentMessageSmDependency.class, component = true, istodelete = true)
     SmObjectImpl mSentMessage;

    @objid ("b29ed303-1082-4d21-a7db-502b27b8fc95")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004ad490-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("472e475c-03f1-4b83-a118-5b9fa7f1e707")
        private static SmClass smClass = null;

        @objid ("9c402c3e-0543-4402-9eb6-75fe604c43c2")
        private static SmDependency ReceivedMessageDep = null;

        @objid ("fff6941c-14ad-47af-9e3f-664eddd225fe")
        private static SmDependency SentMessageDep = null;

        @objid ("a53130ad-819c-492b-b9a4-8a63ecc149f8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("81613fdf-fc69-407e-abc0-871f3f018440")
        public static SmDependency ReceivedMessageDep() {
            if (ReceivedMessageDep == null) {
            	ReceivedMessageDep = classof().getDependencyDef("ReceivedMessage");
            }
            return ReceivedMessageDep;
        }

        @objid ("8746b75c-5ffa-4c74-a6df-3683f469f850")
        public static SmDependency SentMessageDep() {
            if (SentMessageDep == null) {
            	SentMessageDep = classof().getDependencyDef("SentMessage");
            }
            return SentMessageDep;
        }

        @objid ("ad92d365-f85f-4aea-b38d-6535ef67eb9e")
        public static SmDependency getReceivedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedMessageDep;
        }

        @objid ("49c1825f-efd9-4dbc-b25b-c147a9b708ff")
        public static SmDependency getSentMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentMessageDep;
        }

        @objid ("87eac02b-5aaa-4730-9696-27b46956d23d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004b1676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a13fed88-b34c-4811-8978-fec005833eca")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("88582170-91e5-4e2e-9da5-c712ca1c8282")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004b7850-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentMessageSmDependency extends SmSingleDependency {
            @objid ("d74999c2-d700-4acc-b61b-49d044bd8d9e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mSentMessage;
            }

            @objid ("0d6c3306-3b3c-4a4f-90eb-ead79b9d59a1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mSentMessage = value;
            }

            @objid ("d9f3eaec-0915-4757-8d2c-60065cdd8be9")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SendEventDep();
            }

        }

        @objid ("004beefc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedMessageSmDependency extends SmSingleDependency {
            @objid ("e0dab3c8-d8e0-4484-8dd6-96f553fcfa58")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mReceivedMessage;
            }

            @objid ("802f7257-4cda-4c4b-a6ef-4f505afe9477")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mReceivedMessage = value;
            }

            @objid ("2213cf2d-e7af-4b41-98b8-c6c50be1af75")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.ReceiveEventDep();
            }

        }

    }

}
