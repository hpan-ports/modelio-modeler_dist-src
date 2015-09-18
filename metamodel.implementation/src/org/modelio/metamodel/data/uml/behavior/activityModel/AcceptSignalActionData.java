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
    @objid ("4c75a5a6-7926-44d3-b1a4-5c332a1cc5b3")
    @SmaMetaAssociation(metaName="Accepted", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.AcceptedSmDependency.class, partof = true)
     List<SmObjectImpl> mAccepted = null;

    @objid ("a5c4ee90-23c6-4b6e-b5dd-28f61abd838f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cf362-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("63140778-49db-42fc-95fb-bd5af6fbb319")
        private static SmClass smClass = null;

        @objid ("103f75e6-bc16-48b2-a8ba-e987b5b62108")
        private static SmDependency AcceptedDep = null;

        @objid ("afb0cdca-6b94-48a0-9247-9e3ee6dcad80")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6c75a79e-f117-4708-b14a-386fb32a6c09")
        public static SmDependency AcceptedDep() {
            if (AcceptedDep == null) {
            	AcceptedDep = classof().getDependencyDef("Accepted");
            }
            return AcceptedDep;
        }

        @objid ("dae68601-143c-4eef-bb6e-463339d66c1e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6ace67a3-e39c-42c7-b425-1f3045de4ce4")
        public static SmDependency getAcceptedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AcceptedDep;
        }

        @objid ("002d38ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89f876fa-0724-478d-a624-719554c5897f")
            public ISmObjectData createData() {
                return new AcceptSignalActionData();
            }

            @objid ("615a5389-96a6-48e2-ae18-dc190e9fd97d")
            public SmObjectImpl createImpl() {
                return new AcceptSignalActionImpl();
            }

        }

        @objid ("002d9cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AcceptedSmDependency extends SmMultipleDependency {
            @objid ("80c118ba-ba9b-442a-b4ea-3aaa6e3afce8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AcceptSignalActionData)data).mAccepted != null)? ((AcceptSignalActionData)data).mAccepted:SmMultipleDependency.EMPTY;
            }

            @objid ("8622d2a8-b761-41d9-a2b3-e5baf9166def")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AcceptSignalActionData) data).mAccepted = new ArrayList<>(initialCapacity);
                return ((AcceptSignalActionData) data).mAccepted;
            }

            @objid ("650de3fe-2c74-476a-af40-60cbc69c9eb8")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.ReceiverDep();
            }

        }

    }

}
