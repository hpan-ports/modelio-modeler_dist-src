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
    @objid ("5c52d82e-ae3b-4c67-9971-72b186fd44a5")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("c2fa340d-6531-4c48-afa5-71f3992b2765")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003db472-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("236b73b5-5927-41b6-8905-f7f596c99ab9")
        private static SmClass smClass = null;

        @objid ("95d62bd9-b3d6-4965-9cc6-d40b1538d100")
        private static SmDependency CalledDep = null;

        @objid ("063dd23a-3cef-4425-b68d-d3ed7c171571")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallOperationActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("98e047ab-b965-46d4-b72b-975bc510e9f0")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("3e682b24-3b08-4723-92c0-5c054b0a7b01")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("8253af1c-42d6-4ab4-a047-71415da119c2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003df6ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7ce287e6-1a54-48fc-a455-669b4e63b583")
            public ISmObjectData createData() {
                return new CallOperationActionData();
            }

            @objid ("7f229214-15df-4251-b5a6-e11a49d907c1")
            public SmObjectImpl createImpl() {
                return new CallOperationActionImpl();
            }

        }

        @objid ("003e5ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("335da389-7241-4baf-98e9-3b63c021c6b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallOperationActionData) data).mCalled;
            }

            @objid ("dbba3e15-99e2-4983-9dab-2d3ac110b85f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallOperationActionData) data).mCalled = value;
            }

            @objid ("e7153bd7-ebbd-4023-b71d-ca669db00fd3")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallingActionDep();
            }

        }

    }

}
