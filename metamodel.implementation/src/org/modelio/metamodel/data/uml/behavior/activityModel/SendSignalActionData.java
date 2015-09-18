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
    @objid ("07d58ffa-ed02-4468-b542-652367bc4a22")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class, partof = true)
     SmObjectImpl mSent;

    @objid ("d9419c08-41f5-479a-896f-9e0fa1e951a8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071b484-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7f65c316-b106-492c-8a9c-3fbc031c8184")
        private static SmClass smClass = null;

        @objid ("c98fa3b4-b392-4f27-9f9c-d126b538c569")
        private static SmDependency SentDep = null;

        @objid ("8ec5139d-e6d7-412e-a049-5a58c5f5d4eb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SendSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("012d55ad-2fa1-4456-8206-78251d866e88")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("b303a750-f95e-480d-b46c-db870ff70648")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("2c97435d-8444-415b-b6d5-8b0b490a7b41")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0071f6b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8b9ee8d4-50cd-4c86-91eb-18d374aaf261")
            public ISmObjectData createData() {
                return new SendSignalActionData();
            }

            @objid ("ed76eeba-730c-487d-acdf-fb9cc0fde744")
            public SmObjectImpl createImpl() {
                return new SendSignalActionImpl();
            }

        }

        @objid ("00725a4c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("0ba4af46-9d93-4583-afb1-32cfef82b197")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SendSignalActionData) data).mSent;
            }

            @objid ("da58970c-359e-4e64-aab9-7692d7464606")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SendSignalActionData) data).mSent = value;
            }

            @objid ("fdf56460-be5d-426c-8730-ad3921f28517")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SenderDep();
            }

        }

    }

}
