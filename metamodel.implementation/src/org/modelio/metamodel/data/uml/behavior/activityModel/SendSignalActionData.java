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
    @objid ("d134e531-303e-49e5-b891-5a99e3982d2c")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class, partof = true)
     SmObjectImpl mSent;

    @objid ("44ce2cd9-46c1-4db3-90df-d39f6eae6363")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071b484-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ca768e6a-fe5f-4ce0-a2f5-acc69b179c19")
        private static SmClass smClass = null;

        @objid ("b4c2596d-1162-4c6b-bbd8-b5b2d67d6cc5")
        private static SmDependency SentDep = null;

        @objid ("09b9acd3-0406-434b-b3c4-9fde20e6a0cd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SendSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f2cbff51-f38b-4e56-bdce-379e213a1e46")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("7205fbd6-dc68-4b77-9f46-b0abf54347f5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dff75a26-9b89-431c-834a-758ab3648e51")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("0071f6b0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("60f2a58c-30cb-441d-b14f-13b62edf79cf")
            public ISmObjectData createData() {
                return new SendSignalActionData();
            }

            @objid ("b8eb6e1d-89eb-4e96-8c68-c40ecc5a28f8")
            public SmObjectImpl createImpl() {
                return new SendSignalActionImpl();
            }

        }

        @objid ("00725a4c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("8b8bb49d-6ebc-4851-ae49-5ac5ffa94208")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SendSignalActionData) data).mSent;
            }

            @objid ("59c87339-5c1c-4cc5-9853-8762c1448188")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SendSignalActionData) data).mSent = value;
            }

            @objid ("2528f056-5111-4ba2-8736-5128af9e1f00")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SenderDep();
            }

        }

    }

}
