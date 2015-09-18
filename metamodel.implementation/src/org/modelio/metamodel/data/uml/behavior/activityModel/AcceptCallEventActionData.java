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
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptCallEventActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
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

@objid ("00246896-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptCallEventAction.class, factory=AcceptCallEventActionData.Metadata.ObjectFactory.class)
public class AcceptCallEventActionData extends ActivityActionData {
    @objid ("8f7dcdc5-909a-47f8-b1d2-24275b390dd2")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("48cc7240-5b5d-4b18-9ee9-d751b5cddb76")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00443982-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bb136357-db05-46f7-b82f-1a8fcaf33974")
        private static SmClass smClass = null;

        @objid ("45137f37-c611-4379-b8df-0ffac8deff9a")
        private static SmDependency CalledDep = null;

        @objid ("1a53255c-2aa5-4104-89bb-9df4f338e118")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptCallEventActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("afe81c7c-7b6f-4047-82bd-4c5e42af9fef")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("a49d5c2f-c60a-4d14-9b97-d9dd1d7cb743")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0ece82de-8e2e-4934-ac48-af553618ccdc")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("00447e10-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("647344ea-1255-4554-95c5-ea985ac2902f")
            public ISmObjectData createData() {
                return new AcceptCallEventActionData();
            }

            @objid ("f1d0279d-eabe-4e81-a261-f8fb1c4f0fb7")
            public SmObjectImpl createImpl() {
                return new AcceptCallEventActionImpl();
            }

        }

        @objid ("0044e102-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("e606823d-ed23-4784-b364-52d91cd17781")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AcceptCallEventActionData) data).mCalled;
            }

            @objid ("0ee720be-4d6d-4fb3-83b2-8a8049472cb7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AcceptCallEventActionData) data).mCalled = value;
            }

            @objid ("b1a20450-49be-467e-b1e1-a4825ba9c4d3")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.EntryPointActionDep();
            }

        }

    }

}
