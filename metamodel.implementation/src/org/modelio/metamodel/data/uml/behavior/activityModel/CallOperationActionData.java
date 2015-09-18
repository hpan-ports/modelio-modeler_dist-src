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
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallOperationActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
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

@objid ("002bdfb8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallOperationAction.class, factory=CallOperationActionData.Metadata.ObjectFactory.class)
public class CallOperationActionData extends CallActionData {
    @objid ("899b5093-40ac-4f40-a012-4b194886abe1")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("31c3b3ad-5ee0-4bd0-8367-d59f2b052c6e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003db472-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("585c5c15-1f54-4a2c-8282-9678949c9abe")
        private static SmClass smClass = null;

        @objid ("18a17064-f03f-46b8-ba29-1b20c17257eb")
        private static SmDependency CalledDep = null;

        @objid ("d2c9061f-3b9d-4db2-8a75-ef578dca73ee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallOperationActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e150d198-6f76-4281-a24b-786dbe56ef24")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("fa20b097-70f8-4a6e-b8f3-e7ab1c4078fd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ac3d9599-83b0-49c8-b445-84bc691ff543")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("003df6ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("495fd36f-30e2-431b-b4d6-65082ec412c6")
            public ISmObjectData createData() {
                return new CallOperationActionData();
            }

            @objid ("c4f44cf8-8b5a-4b03-86ef-03f3c3eca1cd")
            public SmObjectImpl createImpl() {
                return new CallOperationActionImpl();
            }

        }

        @objid ("003e5ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("13887dec-cf16-4705-8219-7487063ce6f2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallOperationActionData) data).mCalled;
            }

            @objid ("b79624c4-5360-4ecf-a8fa-85d1218692dd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallOperationActionData) data).mCalled = value;
            }

            @objid ("51aec22b-abd5-4983-9230-afe3254f6e52")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallingActionDep();
            }

        }

    }

}
