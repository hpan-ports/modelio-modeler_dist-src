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
    @objid ("d0f2698c-3a4c-412c-97b1-1e95aaa239fb")
    @SmaMetaAssociation(metaName="Called", typeDataClass=OperationData.class, min=1, max=1, smAssociationClass=Metadata.CalledSmDependency.class, partof = true)
     SmObjectImpl mCalled;

    @objid ("94463bd0-a46c-48f7-bf16-2a8842b5a266")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003db472-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe4bf6df-5484-47d8-90d8-d9fdca0c6bc5")
        private static SmClass smClass = null;

        @objid ("bc809add-6ccd-4324-b8d7-5fc74ee2c3c0")
        private static SmDependency CalledDep = null;

        @objid ("0763ec0d-be55-433e-a70c-bd8d9ab702b0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallOperationActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ba62e523-569b-4009-8008-67fede674c74")
        public static SmDependency CalledDep() {
            if (CalledDep == null) {
            	CalledDep = classof().getDependencyDef("Called");
            }
            return CalledDep;
        }

        @objid ("33320185-2766-45d0-a22a-fa38939df921")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2b515326-3068-4717-b608-c8d9f8def0a5")
        public static SmDependency getCalledDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledDep;
        }

        @objid ("003df6ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("27c942be-8840-4b15-a978-d33294b5aa09")
            public ISmObjectData createData() {
                return new CallOperationActionData();
            }

            @objid ("cc56e0ad-036d-4260-8583-b8077cf82dbf")
            public SmObjectImpl createImpl() {
                return new CallOperationActionImpl();
            }

        }

        @objid ("003e5ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledSmDependency extends SmSingleDependency {
            @objid ("96069dd2-a04b-4223-b247-d8cd294a0beb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CallOperationActionData) data).mCalled;
            }

            @objid ("e8e664ea-9d48-4c0f-83a1-1bf36dceaa85")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CallOperationActionData) data).mCalled = value;
            }

            @objid ("8445ea3a-ebfb-427c-bba9-898a694a2d2f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallingActionDep();
            }

        }

    }

}
