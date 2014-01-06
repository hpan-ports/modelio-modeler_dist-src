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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptSignalActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
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

@objid ("00255da0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptSignalAction.class, factory=AcceptSignalActionData.Metadata.ObjectFactory.class)
public class AcceptSignalActionData extends ActivityActionData {
    @objid ("eef562f7-d244-42be-885a-26ef45acd305")
    @SmaMetaAssociation(metaName="Accepted", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.AcceptedSmDependency.class, partof = true)
     List<SmObjectImpl> mAccepted = null;

    @objid ("96642219-f6de-4ac5-afbc-ce5a94e8a7e2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cf362-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6a8acb0e-9a88-4010-b6d5-14591bdfb45e")
        private static SmClass smClass = null;

        @objid ("becc9e74-32c0-4a0e-9652-544799890018")
        private static SmDependency AcceptedDep = null;

        @objid ("898cb921-62f3-4379-9ccf-b8ee1cad5b1f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23c04390-031b-41e6-bd7c-adefc5666b8f")
        public static SmDependency AcceptedDep() {
            if (AcceptedDep == null) {
            	AcceptedDep = classof().getDependencyDef("Accepted");
            }
            return AcceptedDep;
        }

        @objid ("e9390396-a86d-44dc-b8a9-28d2cbc39a6b")
        public static SmDependency getAcceptedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AcceptedDep;
        }

        @objid ("aa3def7f-38df-48c5-80c9-0799197a037a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002d38ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("59c201cf-ad5e-4b09-807d-f4031707b0c6")
            public ISmObjectData createData() {
                return new AcceptSignalActionData();
            }

            @objid ("0eb55829-9297-4cf4-ad8a-698287c2bb6f")
            public SmObjectImpl createImpl() {
                return new AcceptSignalActionImpl();
            }

        }

        @objid ("002d9cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AcceptedSmDependency extends SmMultipleDependency {
            @objid ("02b15230-2b74-41f6-9a5f-37370417f35b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AcceptSignalActionData)data).mAccepted != null)? ((AcceptSignalActionData)data).mAccepted:SmMultipleDependency.EMPTY;
            }

            @objid ("b8db4fde-14d1-4bb4-b61d-ec2aaf8227b8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AcceptSignalActionData) data).mAccepted = new ArrayList<>(initialCapacity);
                return ((AcceptSignalActionData) data).mAccepted;
            }

            @objid ("9286520b-6acf-4248-9f8f-dbfc4b09a09b")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.ReceiverDep();
            }

        }

    }

}
