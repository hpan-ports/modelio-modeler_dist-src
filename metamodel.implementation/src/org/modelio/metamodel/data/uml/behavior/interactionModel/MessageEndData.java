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
    @objid ("61abbadf-1625-4999-aba6-b0930b7e7daf")
    @SmaMetaAssociation(metaName="ReceivedMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.ReceivedMessageSmDependency.class, istodelete = true)
     SmObjectImpl mReceivedMessage;

    @objid ("29e4acfc-ccc4-417c-a951-e38f28fd623c")
    @SmaMetaAssociation(metaName="SentMessage", typeDataClass=MessageData.class, min=0, max=1, smAssociationClass=Metadata.SentMessageSmDependency.class, component = true, istodelete = true)
     SmObjectImpl mSentMessage;

    @objid ("9dc00849-754c-4fc9-bfcf-23277d41a8d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004ad490-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4db2677e-b9c5-4962-9f86-6fe8332f8e09")
        private static SmClass smClass = null;

        @objid ("b8496ad5-8dcd-4f64-b439-0a4f2801e014")
        private static SmDependency ReceivedMessageDep = null;

        @objid ("db389e92-c80d-4ecf-962a-d97d2156ba21")
        private static SmDependency SentMessageDep = null;

        @objid ("d80d936f-93f2-4ec4-bee9-df8b8b266682")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("82ae43b4-c879-48c6-a835-20e58999c57e")
        public static SmDependency ReceivedMessageDep() {
            if (ReceivedMessageDep == null) {
            	ReceivedMessageDep = classof().getDependencyDef("ReceivedMessage");
            }
            return ReceivedMessageDep;
        }

        @objid ("f3d24a14-f67a-4c7a-aa04-1e117e00e54d")
        public static SmDependency SentMessageDep() {
            if (SentMessageDep == null) {
            	SentMessageDep = classof().getDependencyDef("SentMessage");
            }
            return SentMessageDep;
        }

        @objid ("569994a1-2934-462c-a274-4c1b83be479d")
        public static SmDependency getReceivedMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedMessageDep;
        }

        @objid ("2233cb8d-7366-4bda-85a0-580bb534691f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("57b88cc5-f801-466c-886b-3b123a3c9eb0")
        public static SmDependency getSentMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentMessageDep;
        }

        @objid ("004b1676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8ecd303a-a82f-42b7-b085-b7b7585e86ff")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("59bb52c7-89c4-425b-af93-fcde7241a9ed")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004b7850-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentMessageSmDependency extends SmSingleDependency {
            @objid ("583688c5-1f09-4fd4-9e88-483493712ef3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mSentMessage;
            }

            @objid ("3e9fadc5-f605-459d-90b5-df99604d3a05")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mSentMessage = value;
            }

            @objid ("4afcf98b-5f9c-4f2e-b332-a8251edca4ef")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SendEventDep();
            }

        }

        @objid ("004beefc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedMessageSmDependency extends SmSingleDependency {
            @objid ("a84bcea3-2fe5-4dae-9285-081b3e0bb732")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageEndData) data).mReceivedMessage;
            }

            @objid ("c2ea83fc-9c9c-4088-be95-96774436c33f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageEndData) data).mReceivedMessage = value;
            }

            @objid ("4adda0d2-32f5-4142-8aef-fd013cda26ff")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.ReceiveEventDep();
            }

        }

    }

}
