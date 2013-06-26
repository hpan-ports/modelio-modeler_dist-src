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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.SendSignalActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
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

@objid ("003db58a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=SendSignalAction.class, factory=SendSignalActionData.Metadata.ObjectFactory.class)
public class SendSignalActionData extends ActivityActionData {
    @objid ("af1dc593-7395-4d10-b8dd-bc3a34111a60")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class, partof = true)
     SmObjectImpl mSent;

    @objid ("b7385e3e-4ed9-4e99-942b-194c6135a247")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071b484-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("de9c164d-9de5-428f-bf52-5273d1184166")
        private static SmClass smClass = null;

        @objid ("79de5d07-ca1b-40f8-b706-32f609d94904")
        private static SmDependency SentDep = null;

        @objid ("86ae6038-2539-46d6-98ba-a522f70bb4cd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SendSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f434d0e5-484a-4b43-a514-779e49bfd88e")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("dfdb1ee6-7866-4824-be1b-9cb265910139")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f4cbc089-c416-4e31-b468-69b4ba6cd44b")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("0071f6b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bfc25713-3288-4a95-a49b-1f13252fa9d6")
            public ISmObjectData createData() {
                return new SendSignalActionData();
            }

            @objid ("7dfab71b-9d84-46f6-99b8-74251a788217")
            public SmObjectImpl createImpl() {
                return new SendSignalActionImpl();
            }

        }

        @objid ("00725a4c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("cf6ee1ef-0904-4af7-ba8f-d1fd1623d3d4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SendSignalActionData) data).mSent;
            }

            @objid ("6866c707-7891-4fc2-9015-c60dfdd7ed1c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SendSignalActionData) data).mSent = value;
            }

            @objid ("aa8d1ac2-1cd8-4b20-a677-9d5018fa2e27")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SenderDep();
            }

        }

    }

}
